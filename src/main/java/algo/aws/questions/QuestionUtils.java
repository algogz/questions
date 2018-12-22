package algo.aws.questions;

import algo.aws.questions.jayendrapatil.Question;

import java.util.*;
import java.util.function.BiConsumer;

public class QuestionUtils {
    static Map<String, String> category;

    static {
        category = new LinkedHashMap<>();
        category.put("EC2", "EC2");
        category.put("Elastic Cloud Compute", "EC2");
        category.put("IAM", "IAM");
        category.put("Identity Access Management", "IAM");
        category.put("VPC", "VPC");
        category.put("Virtual Private Cloud", "VPC");
        category.put("EBS", "EBS");
        category.put("Elastic Block Store Storage", "EBS");
        category.put("ELB", "ELB");
        category.put("Elastic Load Balancing", "ELB");
        category.put("S3", "S3");
        category.put("Simple Storage Service", "S3");
        category.put("SQS", "SQS");
        category.put("Simple Queue Service", "SQS");
        category.put("SES", "SES");
        category.put("Simple Email Service", "SES");
        category.put("SNS", "SNS");
        category.put("Simple Notification Service", "SNS");
        category.put("RDS", "RDS");
        category.put("Relational Database Service", "RDS");
        category.put("DynamoDB", "DynamoDB");
        category.put("Lambda", "Lambda");
        category.put("Direct Connect", "Direct Connect");
        category.put("Storage Gateway", "Storage Gateway");
        category.put("Route 53", "Route 53");
        category.put("CloudWatch", "CloudWatch");
        category.put("Instance Store", "Instance Store");
//        category.put("IDS", "IDS");
        category.put("Intrusion Detection", "IDS");
//        category.put("IDP", "IDP");
        category.put("Intrusion Prevention", "IDP");
        category.put("ASG", "ASG");
        category.put("Auto Scaling", "ASG");
        category.put("Elastic Beanstalk", "Elastic Beanstalk");
        category.put("CloudFront", "CloudFront");
        category.put("SWF", "SWF");
        category.put("Simple Workflow", "SWF");
        category.put("CloudFormation", "CloudFormation");
        category.put("Kinesis", "Kinesis");
        category.put("OpsWorks", "OpsWorks");
        category.put("ElastiCache", "ElastiCache");
        category.put("WAF", "WAF");
        category.put("Web Application Firewall", "WAF");
        category.put("EMR", "EMR");
        category.put("Elastic Map Reduce", "EMR");
        category.put("Redshift", "Redshift");
        category.put("Trusted Advisor", "Trusted Advisor");
        category.put("Directory Services", "Directory Services");
        category.put("CloudTrail", "CloudTrail");
        category.put("Elastic Transcoder", "Elastic Transcoder");
        category.put("KMS", "KMS");
        category.put("Key Management Service", "KMS");
        category.put("Glacier", "Glacier");
        category.put("Elasticsearch", "Elasticsearch");
        category.put("CloudSearch", "CloudSearch");
        category.put("ECS", "ECS");
        category.put("Elastic Container Service", "ECS");
        category.put("API Gateway", "API Gateway");
    }

    public static Set<String> categorize(Question q){
        StringBuilder sb = new StringBuilder();
        sb.append(q.getText().toLowerCase());
        q.getChoiceList().forEach(s -> sb.append("\n").append(s.toLowerCase()));

        // Normalize spaces
        String text = sb.toString().replaceAll("[ ,.\n\t]+", " ");

        Set<String> catList = new HashSet<>();
        category.forEach((k, v) -> {
            String service = k.toLowerCase();
            if(text.contains(service)){
                catList.add(v);
            }
        });
        return catList;
    }
}
