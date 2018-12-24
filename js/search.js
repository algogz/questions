var elasticsearch = require('elasticsearch');

var client = new elasticsearch.Client({
    host: 'localhost:9200',
    log: 'info'
});

client.search({
    q: 'Which of the following approaches provides the lowest cost for Amazon Elastic Block Store snapshots while giving you the ability to fully restore data'
}).then(function (body) {
    var hits = body.hits.hits;
    console.log(body);
}, function (error) {
    console.trace(error.message);
});

