var elasticsearch = require('elasticsearch');
var fs=require('fs');
var path = require("path");

var jsonDir = path.join(__dirname, "../jayendrapatil/json");

var jsonFiles = fs.readdirSync(jsonDir);

var client = new elasticsearch.Client({
    host: 'localhost:9200',
    log: 'info'
});

for(var i=0; i<jsonFiles.length; i++){
    var questions = JSON.parse(fs.readFileSync(path.join(jsonDir, jsonFiles[i])));
    for(var q=0; q<questions.length; q++){
        var question = questions[q];
        var doc = {
            index: 'sap', //相当于database
            type: 'questions',  //相当于table
            id: question.url + question.questionNumber, // 数据到唯一标示，id存在则为更新，不存在为插入
            body: question
        };

        client.index(doc, function(error, response) {
            console.log(error);
            console.log(response);
        });
    }
}


client.ping({
    requestTimeout: 30000,
}, function (error) {
    if (error) {
        console.error('elasticsearch cluster is down!');
    } else {
        console.log('All is well');
    }
});

