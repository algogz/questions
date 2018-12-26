# AWS DevOps Engineer Professional - 1/3
Version: 18.122

### QUESTION 1
Due to compliance regulations, management has asked you to provide a system that allows for cost-effective long-term storage of your application logs and provides a way for support staff to view the logs more quickly. Currently your log system archives logs automatically to Amazon S3 every hour, and support staff must wait for these logs to appear in Amazon S3, because they do not currently have access to the systems to view live logs.
What method should you use to become compliant while also providing a faster way for support staff to have access to logs?

- A. Update Amazon S3 lifecycle policies to archive old logs to Amazon Glacier, and add a new policy to push all log entries to Amazon SQS for ingestion by the support team.
- B. Update Amazon S3 lifecycle policies to archive old logs to Amazon Glacier, and use or write a service to also stream your application logs to CloudWatch Logs.
- C. Update Amazon Glacier lifecycle policies to pull new logs from Amazon S3, and in the Amazon EC2 console, enable the CloudWatch Logs Agent on all of your application servers.
- D. Update Amazon S3 lifecycle policies to archive old logs to Amazon Glacier. key can be different from the tableEnable Amazon S3 partial uploads on your Amazon S3 bucket, and trigger an Amazon SNS notification when a partial upload occurs.
- E. Use or write a service to stream your application logs to CloudWatch Logs. Use an Amazon Elastic Map Reduce cluster to live stream your logs from CloudWatch Logs for ingestion by the support team, and create a Hadoop job to push the logs to S3 in five-minute chunks.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 2
You want to securely distribute credentials for your Amazon RDS instance to your fleet of web server instances.
The credentials are stored in a file that is controlled by a configuration management system. How do you securely deploy the credentials in an automated manner across the fleet of web server instances, which can number in the hundreds, while retaining the ability to roll back if needed?

- A. Store your credential files in an Amazon S3 bucket.
Use Amazon S3 server-side encryption on the credential files.
Have a scheduled job that pulls down the credential files into the instances every 10 minutes.
- B. Store the credential files in your version-controlled repository with the rest of your code.
Have a post-commit action in version control that kicks off a job in your continuous integration system which securely copses the new credential files to all web server instances.
- C. Insert credential files into user data and use an instance lifecycle policy to periodically refresh the file from the user data.
- D. Keep credential files as a binary blob in an Amazon RDS MySQL DB instance, and have a script on each Amazon EC2 instance that pulls the files down from the RDS instance.
- E. Store the credential files in your version-controlled repository with the rest of your code. Use a parallel file copy program to send the credential files from your local machine to the Amazon EC2 instances.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 3
You are using a configuration management system to manage your Amazon EC2 instances.
On your Amazon EC2 Instances, you want to store credentials for connecting to an Amazon RDS DB instance.
How should you securely store these credentials?

- A. Give the Amazon EC2 instances an IAM role that allows read access to a private Amazon S3 bucket. Store a file with database credentials in the Amazon S3 bucket. Have your configuration management system pull the file from the bucket when it is needed.
- B. Launch an Amazon EC2 instance and use the configuration management system to bootstrap the instance with the Amazon RDS DB credentials. Create an AMI from this instance.
- C. Store the Amazon RDS DB credentials in Amazon EC2 user data. Import the credentials into the Instance on boot.
- D. Assign an IAM role to your Amazon RDS instance, and use this IAM role to access the Amazon RDS DB from your Amazon EC2 instances.
- E. Store your credentials in your version control system, in plaintext.
Check out a copy of your credentials from the version control system on boot.
Use Amazon EBS encryption on the volume storing the Amazon RDS DB credentials.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 4
Your company has developed a web application and is hosting it in an Amazon S3 bucket configured for static website hosting.
The application is using the AWS SDK for JavaScript in the browser to access data stored in an Amazon DynamoDB table.
How can you ensure that API keys for access to your data in DynamoDB are kept secure?

- A. Create an Amazon S3 role in IAM with access to the specific DynamoDB tables, and assign it to the bucket hosting your website.
- B. Configure S3 bucket tags with your AWS access keys for your bucket hosing your website so that the application can query them for access.
- C. Configure a web identity federation role within IAM to enable access to the correct DynamoDB resources and retrieve temporary credentials.
- D. Store AWS keys in global variables within your application and configure the application to use these credentials when making requests.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 5
You need to implement A/B deployments for several multi-tier web applications. Each of them has Its Individual infrastructure:
Amazon Elastic Compute Cloud (EC2) front-end servers, Amazon ElastiCache clusters, Amazon Simple Queue Service (SQS) queues, and Amazon Relational Database (RDS) Instances.
Which combination of services would give you the ability to control traffic between different deployed versions of your application? (Choose one.)

- A. Create one AWS Elastic Beanstalk application and all AWS resources (using configuration files inside the application source bundle) for each web application.
New versions would be deployed a-eating Elastic Beanstalk environments and using the Swap URLs feature.
- B. Using AWS CloudFormation templates, create one Elastic Beanstalk application and all AWS resources (in the same template) for each web application.
New versions would be deployed using AWS CloudFormation templates to create new Elastic
Beanstalk environments, and traffic would be balanced between them using weighted Round
Robin (WRR) records in Amazon Route53.
- C. Using AWS CloudFormation templates, create one Elastic Beanstalk application and all AWS
resources (in the same template) for each web application.
New versions would be deployed updating a parameter on the CloudFormation template and passing it to the cfn-hup helper daemon, and traffic would be balanced between them using Weighted Round Robin (WRR) records in Amazon Route 53.
- D. Create one Elastic Beanstalk application and all AWS resources (using configuration files inside the application source bundle) for each web application.
New versions would be deployed updating the Elastic Beanstalk application version for the current Elastic Beanstalk environment.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 6
You work for an insurance company and are responsible for the day-to-day operations of your company's online quote system used to provide insurance quotes to members of the public. Your company wants to use the application logs generated by the system to better understand customer behavior.
Industry, regulations also require that you retain all application logs for the system indefinitely in order to investigate fraudulent claims in the future.
You have been tasked with designing a log management system with the following requirements: 

- All log entries must be retained by the system, even during unplanned instance failure.
- The customer insight team requires immediate access to the logs from the past seven days.
- The fraud investigation team requires access to all historic logs, but will wait up to 24 hours before these logs are available.
How would you meet these requirements in a cost-effective manner? 

Choose 3 answers

- A. Configure your application to write logs to the instance's ephemeral disk, because this storage is free and has good write performance.
Create a script that moves the logs from the instance to Amazon 53 once an hour.
- B. Write a script that is configured to be executed when the instance is stopped or terminated and that will upload any remaining logs on the instance to Amazon S3.
- C. Create an Amazon S3 lifecycle configuration to move log files from Amazon S3 to Amazon Glacier after seven days.
- D. Configure your application to write logs to the instance's default Amazon EBS boot volume, because this storage already exists.
Create a script that moves the logs from the instance to Amazon 53 once an hour.
- E. Configure your application to write logs to a separate Amazon EBS volume with the "delete on termination" field set to false.
Create a script that moves the logs from the instance to Amazon S3 once an hour.
- F. Create a housekeeping script that runs on a T2 micro instance managed by an Auto Scaling group for high availability.
The script uses the AWS API to identify any unattached Amazon EBS volumes containing log files.
Your housekeeping script will mount the Amazon EBS volume, upload all logs to Amazon S3, and then delete the volume.

<details><summary>Answer:</summary><p> CEF

</p></details><hr>

### QUESTION 7
You have an application running on Amazon EC2 in an Auto Scaling group. Instances are being bootstrapped dynamically, and the bootstrapping takes over 15 minutes to complete.
You find that instances are reported by Auto Scaling as being In Service before bootstrapping has completed.
You are receiving application alarms related to new instances before they have completed bootstrapping, which is causing confusion.
You find the cause: your application monitoring tool is polling the Auto Scaling Service API for instances that are In Service, and creating alarms for new previously unknown instances.
Which of the following will ensure that new instances are not added to your application monitoring tool before bootstrapping is completed?

- A. Create an Auto Scaling group lifecycle hook to hold the instance in a pending: wait state until your bootstrapping is complete.
Once bootstrapping is complete, notify Auto Scaling to complete the lifecycle hook and move the instance into a pending: complete state.
- B. Use the default Amazon CloudWatch application metrics to monitor your application's health. Configure an Amazon SNS topic to send these CloudWatch alarms to the correct recipients.
- C. Tag all instances on launch to identify that they are in a pending state.
Change your application monitoring tool to look for this tag before adding new instances, and the use the Amazon API to set the instance state to 'pending' until bootstrapping is complete.
- D. Increase the desired number of instances in your Auto Scaling group configuration to reduce the time it takes to bootstrap future instances.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 8
You have been given a business requirement to retain log files for your application for 10 years. You need to regularly retrieve the most recent logs for troubleshooting.
  
Your logging system must be cost-effective, given the large volume of logs. What technique should you use to meet these requirements?

- A. Store your log in Amazon CloudWatch Logs.
- B. Store your logs in Amazon Glacier.
- C. Store your logs in Amazon S3, and use lifecycle policies to archive to Amazon Glacier.
- D. Store your logs in HDFS on an Amazon EMR cluster.
- E. Store your logs on Amazon EBS, and use Amazon EBS snapshots to archive them.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 9
You work for a startup that has developed a new photo-sharing application for mobile devices. Over recent months your application has increased in popularity; this has resulted in a decrease in the performance of the application clue to the increased load.
Your application has a two-tier architecture that is composed of an Auto Scaling PHP application tier and a MySQL RDS instance initially deployed with AWS CloudFormation.
Your Auto Scaling group has a min value of 4 and a max value of 8. The desired capacity is now at 8 because of the high CPU utilization of the instances.
After some analysis, you are confident that the performance issues stem from a constraint in CPU capacity, although memory utilization remains low.
You therefore decide to move from the general-purpose M3 instances to the compute-optimized
C3 instances.How would you deploy this change while minimizing any interruption to your end users?

- A. Sign into the AWS Management Console, copy the old launch configuration, and create a new launch configuration that specifies the C3 instances.
Update the Auto Scaling group with the new launch configuration.
Auto Scaling will then update the instance type of all running instances.
- B. Sign into the AWS Management Console, and update the existing launch configuration with the new C3 instance type.
Add an UpdatePolicy attribute to your Auto Scaling group that specifies AutoScalingRollingUpdate.
- C. Update the launch configuration specified in the AWS CloudFormation template with the new C3 instance type.
Run a stack update with the new template.
Auto Scaling will then update the instances with the new instance type.
- D. Update the launch configuration specified in the AWS CloudFormation template with the new C3
instance type.
Also add an UpdatePolicy attribute to your Auto Scaling group that specifies AutoScalingRollingUpdate.
Run a stack update with the new template.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 10
You've been tasked with implementing an automated data backup solution for your application servers that run on Amazon EC2 with Amazon EBS volumes.
You want to use a distributed data store for your backups to avoid single points of failure and to increase the durability of the data.
Daily backups should be retained for 30 days so that you can restore data within an hour.
How can you implement this through a script that a scheduling daemon runs daily on the application servers?

- A. Write the script to call the ec2-create-volume API, tag the Amazon EBS volume with the current date time group, and copy backup data to a second Amazon EBS volume.
Use the ec2-describe-volumes API to enumerate existing backup volumes.
Call the ec2-delete-volume API to prune backup volumes that are tagged with a date-tine group older than 30 days.
- B. Write the script to call the Amazon Glacier upload archive API, and tag the backup archive with the current date-time group.
Use the list vaults API to enumerate existing backup archives Call the delete vault API to prune backup archives that are tagged with a date-time group older than 30 days.
- C. Write the script to call the ec2-create-snapshot API, and tag the Amazon EBS snapshot with the current date-time group.
Use the ec2-describe-snapshot API to enumerate existing Amazon EBS snapshots.
Call the ec2-delete-snapShot API to prune Amazon EBS snapshots that are tagged with a date- time group older than 30 days.
- D. Write the script to call the ec2-create-volume API, tag the Amazon EBS volume with the current date-time group, and use the ec2-copy-snapshot API to back up data to the new Amazon EBS volume. Use the ec2- describe-snapshot API to enumerate existing backup volumes.
Call the ec2-delete-snaphot API to prune backup Amazon EBS volumes that are tagged with a date-time group older than 30 days.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 11
Your application uses CloudFormation to orchestrate your application's resources. During your testing phase before the application went live, your Amazon RDS instance type was changed and caused the instance to be re-created, resulting In the loss of test data.
How should you prevent this from occurring in the future?

- A. Within the AWS CloudFormation parameter with which users can select the Amazon RDS instance type, set AllowedValues to only contain the current instance type.
- B. Use an AWS CloudFormation stack policy to deny updates to the instance. Only allow UpdateStack permission to IAM principals that are denied SetStackPolicy.
- C. In the AWS CloudFormation template, set the AWS::RDS::DBInstance's DBlnstanceClass property to be read-only.
- D. Subscribe to the AWS CloudFormation notification "BeforeResourceUpdate," and call CancelStackUpdate if the resource identified is the Amazon RDS instance.
- E. In the AWS CloudFormation template, set the DeletionPolicy of the AWS::RDS::DBInstance's DeletionPolicy property to "Retain."

<details><summary>Answer:</summary><p> E 

</p></details><hr>

### QUESTION 12
Your company develops a variety of web applications using many platforms and programming languages with different application dependencies.
Each application must be developed and deployed quickly and be highly evadable to satisfy your business requirements.
Which of the following methods should you use to deploy these applications rapidly?

- A. Develop the applications in Docker containers, and then deploy them to Elastic Beanstalk
environments with Auto Scaling and Elastic Load Balancing.
- B. Use the AWS CloudFormation Docker import service to build and deploy the applications with
high availability in multiple Availability Zones.
- C. Develop each application's code in DynamoDB, and then use hooks to deploy it to Elastic
Beanstalk environments with Auto Scaling and Elastic Load Balancing.
- D. Store each application's code in a Git repository, develop custom package repository managers
for each application's dependencies, and deploy to AWS OpsWorks in multiple Availability Zones.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 13
You have a large number of web servers in an Auto Scaling group behind a load balancer. On an hourly basis, you want to filter and process the logs to collect data on unique visitors, and then put that data in a durable data store in order to run reports. Web servers in the Auto Scaling group are constantly launching and terminating based on your scaling policies, but you do not want to lose any of the log data from these servers during a stop/termination initiated by a user or by Auto Scaling.
What two approaches will meet these requirements?
Choose 2 answers

- A. Install an Amazon Cloudwatch Logs Agent on every web server during the bootstrap process. Create a CloudWatch log group and define Metric Filters to create custom metrics that track unique visitors from the streaming web server logs.
Create a scheduled task on an Amazon EC2 instance that runs every hour to generate a new report based on the Cloudwatch custom metrics.
- B. On the web servers, create a scheduled task that executes a script to rotate and transmit the logs
to Amazon Glacier.
Ensure that the operating system shutdown procedure triggers a logs transmission when the Amazon EC2 instance is stopped/terminated.
Use Amazon Data Pipeline to process the data in Amazon Glacier and run reports every hour.
- C. On the web servers, create a scheduled task that executes a script to rotate and transmit the logs to an Amazon S3 bucket.
Ensure that the operating system shutdown procedure triggers a logs transmission when the Amazon EC2 instance is stopped/terminated.
Use AWS Data Pipeline to move log data from the Amazon S3 bucket to Amazon Redshift In
order to process and run reports every hour.
- D. Install an AWS Data Pipeline Logs Agent on every web server during the bootstrap process.
Create a log group object in AWS Data Pipeline, and define Metric Filters to move processed log data directly from the web servers to Amazon Redshift and run reports every hour.

<details><summary>Answer:</summary><p> AC

</p></details><hr>

### QUESTION 14 *
You have been tasked with deploying a scalable distributed system using AWS OpsWorks.
Your distributed system is required to scale on demand. As it is distributed, each node must hold a configuration file that includes the hostnames of the other instances within the layer.
How should you configure AWS OpsWorks to manage scaling this application dynamically?

- A. Create a Chef Recipe to update this configuration file, configure your AWS OpsWorks stack to use custom cookbooks, and assign this recipe to the Configure LifeCycle Event of the specific layer.
- B. Update this configuration file by writing a script to poll the AWS OpsWorks service API for new instances.
Configure your base AMI to execute this script on Operating System startup.
- C. Create a Chef Recipe to update this configuration file, configure your AWS OpsWorks stack to
use custom cookbooks, and assign this recipe to execute when instances are launched.
- D. Configure your AWS OpsWorks layer to use the AWS-provided recipe for distributed host
configuration, and configure the instance hostname and file path parameters in your recipes settings.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 15
You have an application running on an Amazon EC2 instance and you are using IAM roles to securely access AWS Service APIs.
How can you configure your application running on that instance to retrieve the API keys for use with the AWS SDKs?

- A. When assigning an EC2 IAM role to your instance in the console, in the "Chosen SDK" drop- down list, select the SDK that you are using, and the instance will configure the correct SDK on launch with the API keys.
- B. Within your application code, make a GET request to the IAM Service API to retrieve credentials for your user.
- C. When using AWS SDKs and Amazon EC2 roles, you do not have to explicitly retrieve API keys, because the SDK handles retrieving them from the Amazon EC2 MetaData service.
- D. Within your application code, configure the AWS SDK to get the API keys from environment
variables, because assigning an Amazon EC2 role stores keys in environment variables on launch. 

<details><summary>
Answer:</summary><p> C

</p></details><hr>

### QUESTION 16
When an Auto Scaling group is running in Amazon Elastic Compute Cloud (EC2), your application rapidly scales up and down in response to load within a 10-minute window; however, after the load peaks, you begin to see problems in your configuration management system where previously terminated Amazon EC2 resources are still showing as active.
What would be a reliable and efficient way to handle the cleanup of Amazon EC2 resources within your configuration management system?
  
Choose 2 answers

- A. Write a script that is run by a daily cron job on an Amazon EC2 instance and that executes API
Describe calls of the EC2 Auto Scaling group and removes terminated instances from the
configuration management system.
- B. Configure an Amazon Simple Queue Service (SQS) queue for Auto Scaling actions that has a
script that listens for new messages and removes terminated instances from the configuration
management system.
- C. Use your existing configuration management system to control the launching and bootstrapping of
instances to reduce the number of moving parts in the automation.
- D. Write a small script that is run during Amazon EC2 instance shutdown to de-register the resource
from the configuration management system.
- E. Use Amazon Simple Workflow Service (SWF) to maintain an Amazon DynamoDB database that
contains a whitelist of instances that have been previously launched, and allow the Amazon SWF worker to remove information from the configuration management system.

<details><summary>Answer:</summary><p> CD

</p></details><hr>

### QUESTION 17
You have enabled Elastic Load Balancing HTTP health checking. After looking at the AWS Management Console, you see that all instances are passing health checks, but your customers are reporting that your site is not responding.
What is the cause?

- A. The HTTP health checking system is misreporting due to latency in inter-instance metadata synchronization.
- B. The health check in place is not sufficiently evaluating the application function.
- C. The application is returning a positive health check too quickly for the AWS Management Console
to respond.
- D. Latency in DNS resolution is interfering with Amazon EC2 metadata retrieval.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 18
You use Amazon CloudWatch as your primary monitoring system for your web application. After a recent software deployment, your users are getting Intermittent 500 Internal Server Errors when using the web application. You want to create a CloudWatch alarm, and notify an on-call engineer when these occur.
How can you accomplish this using AWS services? Choose 3 answers

- A. Deploy your web application as an AWS Elastic Beanstalk application.
Use the default Elastic Beanstalk Cloudwatch metrics to capture 500 Internal Server Errors.
Set a CloudWatch alarm on that metric.
- B. Install a CloudWatch Logs Agent on your servers to stream web application logs to CloudWatch.
- C. Use Amazon Simple Email Service to notify an on-call engineer when a CloudWatch alarm is
triggered.
- D. Create a CloudWatch Logs group and define metric filters that capture 500 Internal Server Errors.
Set a CloudWatch alarm on that metric.
- E. Use Amazon Simple Notification Service to notify an on-call engineer when a CloudWatch alarm
is triggered.
- F. Use AWS Data Pipeline to stream web application logs from your servers to CloudWatch.

<details><summary>Answer:</summary><p> BDE

</p></details><hr>

### QUESTION 19 *
After a daily scrum with your development teams, you've agreed that using Blue/Green style deployments would benefit the team.
Which technique should you use to deliver this new requirement?

- A. Re-deploy your application on AWS Elastic Beanstalk, and take advantage of Elastic Beanstalk deployment types.
  
- B. Using an AWS CloudFormation template, re-deploy your application behind a load balancer, launch a new AWS CloudFormation stack during each deployment, update your load balancer to send half your traffic to the new stack while you test, after verification update the load balancer to send 100% of traffic to the new stack, and then terminate the old stack.
- C. Re-deploy your application behind a load balancer that uses Auto Scaling groups, create a new identical Auto Scaling group, and associate it to the load balancer. During deployment, set the desired number of instances on the old Auto Scaling group to zero, and when all instances have terminated, delete the old Auto Scaling group.
- D. Using an AWS OpsWorks stack, re-deploy your application behind an Elastic Load Balancing load balancer and take advantage of OpsWorks stack versioning, during deployment create a new version of your application, tell OpsWorks to launch the new version behind your load balancer, and when the new version is launched, terminate the old OpsWorks stack.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 20
You have a complex system that involves networking, IAM policies, and multiple, three-tier applications.
You are still receiving requirements for the new system, so you don't yet know how many AWS components will be present in the final design.
You want to start using AWS CloudFormation to define these AWS resources so that you can automate and version-control your infrastructure.
How would you use AWS CloudFormation to provide agile new environments for your customers in a cost-effective, reliable manner?

- A. Manually create one template to encompass all the resources that you need for the system, so you only have a single template to version-control.
- B. Create multiple separate templates for each logical part of the system, create nested stacks in AWS CloudFormation, and maintain several templates to version-control.
- C. Create multiple separate templates for each logical part of the system, and provide the outputs
from one to the next using an Amazon Elastic Compute Cloud (EC2) instance running the SDK
for finer granularity of control.
- D. Manually construct the networking layer using Amazon Virtual Private Cloud (VPC) because this
does not change often, and then use AWS CloudFormation to define all other ephemeral resources. 

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 21 *
Your development team wants account-level access to production instances in order to do live debugging of a highly secure environment.
Which of the following should you do?

- A. Place the credentials provided by Amazon Elastic Compute Cloud (EC2) into a secure Amazon Sample Storage Service (S3) bucket with encryption enabled.
Assign AWS Identity and Access Management (IAM) users to each developer so they can download the credentials file.
- B. Place an internally created private key into a secure S3 bucket with server-side encryption using customer keys and configuration management, create a service account on all the instances using this private key, and assign IAM users to each developer so they can download the file.
- C. Place each developer's own public key into a private S3 bucket, use instance profiles and configuration management to create a user account for each developer on all instances, and place the user's public keys into the appropriate account.
- D. Place the credentials provided by Amazon EC2 onto an MFA encrypted USB drive, and physically share it with each developer so that the private key never leaves the office.

<details><summary>Answer:</summary><p> C 


</p></details><hr>

### QUESTION 22
   
As part of your continuous deployment process, your application undergoes an I/O load performance test before it is deployed to production using new AMIs.
The application uses one Amazon Elastic Block Store (EBS) PIOPS volume per instance and requires consistent I/O performance.
Which of the following must be carried out to ensure that I/O load performance tests yield the correct results in a repeatable manner?

- A. Ensure that the I/O block sizes for the test are randomly selected.
- B. Ensure that the Amazon EBS volumes have been pre-warmed by reading all the blocks before
the test.
- C. Ensure that snapshots of the Amazon EBS volumes are created as a backup.
- D. Ensure that the Amazon EBS volume is encrypted.
- E. Ensure that the Amazon EBS volume has been pre-warmed by creating a snapshot of the volume
before the test.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 23
After reviewing the last quarter's monthly bills, management has noticed an increase in the overall bill from Amazon.
After researching this increase in cost, you discovered that one of your new services is doing a lot of GET Bucket API calls to Amazon S3 to build a metadata cache of all objects in the applications bucket.
Your boss has asked you to come up with a new cost-effective way to help reduce the amount of these new GET Bucket API calls.
What process should you use to help mitigate the cost?

- A. Update your Amazon S3 buckets' lifecycle policies to automatically push a list of objects to a new bucket, and use this list to view objects associated with the application's bucket.
- B. Create a new DynamoDB table. Use the new DynamoDB table to store all metadata about all objects uploaded to Amazon S3.
Any time a new object is uploaded, update the application's internal Amazon S3 object metadata cache from DynamoDB.
- C. Using Amazon SNS, create a notification on any new Amazon S3 objects that automatically updates a new DynamoDB table to store all metadata about the new object.
Subscribe the application to the Amazon SNS topic to update its internal Amazon S3 object metadata cache from the DynamoDB table.
- D. Upload all images to Amazon SQS, set up SQS lifecycles to move all images to Amazon S3, and initiate an Amazon SNS notification to your application to update the application's Internal Amazon S3 object metadata cache.
- E. Upload all images to an ElastiCache filecache server. Update your application to now read all file metadata from the ElastiCache filecache server, and configure the ElastiCache policies to push all files to Amazon S3 for long-term storage.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 24
Your current log analysis application takes more than four hours to generate a report of the top 10 users of your web application.
You have been asked to implement a system that can report this information in real time, ensure that the report is always up to date, and handle increases in the number of requests to your web application. Choose the option that is cost-effective and can fulfill the requirements.

- A. Publish your data to CloudWatch Logs, and configure your application to autoscale to handle the load on demand.
- B. Publish your log data to an Amazon S3 bucket.
Use AWS CloudFormation to create an Auto Scaling group to scale your post-processing application which is configured to pull down your log files stored an Amazon S3.
- C. Post your log data to an Amazon Kinesis data stream, and subscribe your log-processing application so that is configured to process your logging data.
  
- D. Configure an Auto Scaling group to increase the size of your Amazon EMR duster.
- E. Create a multi-AZ Amazon RDS MySQL cluster, post the logging data to MySQL, and run a map
reduce job to retrieve the required information on user counts.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 25 x
You are using Elastic Beanstalk to manage your e-commerce store. The store is based on an open source e- commerce platform and is deployed across multiple instances in an Auto Scaling group. Your development team often creates new "extensions" for the e-commerce store.
These extensions include PHP source code as well as an SQL upgrade script used to make any necessary updates to the database schema.
You have noticed that some extension deployments fail due to an error when running the SQL upgrade script. After further investigation, you realize that this is because the SQL script is being
executed on all of your Amazon EC2 instances.
How would you ensure that the SQL script is only executed once per deployment regardless of how many Amazon EC2 instances are running at the time?

- A. Use a "Container command" within an Elastic Beanstalk configuration file to execute the script, ensuring that the "leader only" flag is set to true.
- B. Make use of the Amazon EC2 metadata service to query whether the instance is marked as the leader" in the Auto Scaling group.
Only execute the script if "true" is returned.
- C. Use a "Solo Command" within an Elastic Beanstalk configuration file to execute the script. The Elastic Beanstalk service will ensure that the command is only executed once.
- D. Update the Amazon RDS security group to only allow write access from a single instance in the Auto Scaling group; that way, only one instance will successfully execute the script on the database.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 26 x
You are administering a continuous integration application that polls version control for changes and then launches new Amazon EC2 instances for a full suite of build tests.
What should you do to ensure the lowest overall cost while being able to run as many tests in parallel as possible?

- A. Perform syntax checking on the continuous integration system before launching a new Amazon EC2 instance for build test, unit and integration tests.
- B. Perform syntax and build tests on the continuous integration system before launching the new Amazon EC2 instance unit and integration tests.
- C. Perform all tests on the continuous integration system, using AWS OpsWorks for unit, integration, and build tests.
- D. Perform syntax checking on the continuous integration system before launching a new AWS Data Pipeline for coordinating the output of unit, integration, and build tests.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 27 x
You are doing a load testing exercise on your application hosted on AWS.
While testing your Amazon RDS MySQL DB instance, you notice that when you hit 100% CPU utilization on it, your application becomes non- responsive.
Your application is read-heavy.
What are methods to scale your data tier to meet the application's needs? Choose 3 answers

- A. Add Amazon RDS DB read replicas, and have your application direct read queries to them.
  
- B. Add your Amazon RDS DB instance to an Auto Scaling group and configure your CloudWatch metric based on CPU utilization.
- C. Use an Amazon SQS queue to throttle data going to the Amazon RDS DB instance.
- D. Use ElastiCache in front of your Amazon RDS DB to cache common queries.
- E. Shard your data set among multiple Amazon RDS DB instances.
- F. Enable Multi-AZ for your Amazon RDS DB instance.

<details><summary>Answer:</summary><p> ADE

</p></details><hr>

### QUESTION 28
Your mobile application includes a photo-sharing service that is expecting tens of thousands of users at launch.
You will leverage Amazon Simple Storage Service (S3) for storage of the user Images, and you must decide how to authenticate and authorize your users for access to these images.
You also need to manage the storage of these images. Which two of the following approaches should you use? Choose 2 answers

- A. Create an Amazon S3 bucket per user, and use your application to generate the S3 URI for the appropriate content.
- B. Use AWS Identity and Access Management (IAM) user accounts as your application-level user database, and offload the burden of authentication from your application code.
- C. Authenticate your users at the application level, and use AWS Security Token Service (STS) to grant token-based authorization to S3 objects.
- D. Authenticate your users at the application level, and send an SMS token message to the user. Create an Amazon S3 bucket with the same name as the SMS message token, and move the user's objects to that bucket.
- E. Use a key-based naming scheme comprised from the user IDs for all user objects in a single Amazon S3 bucket.

<details><summary>Answer:</summary><p> CE

</p></details><hr>

### QUESTION 29 x
You have an Auto Sealing group of Instances that processes messages from an Amazon Simple Queue Service (SQS) queue.
The group scales on the size of the queue. Processing Involves calling a third-party web service. The web service is complaining about the number of failed and repeated calls it is receiving from you.
You have noticed that when the group scales in, instances are being terminated while they are processing.
What cost-effective solution can you use to reduce the number of incomplete process attempts?

- A. Create a new Auto Scaling group with minimum and maximum of 2 and instances running web proxy software.
Configure the VPC route table to route HTTP traffic to these web proxies.
- B. Modify the application running on the instances to enable termination protection while it
processes a task and disable it when the processing is complete.
- C. Increase the minimum and maximum size for the Auto Scaling group, and change the scaling
policies so they scale less dynamically.
- D. Modify the application running on the instances to put itself into an Auto Scaling Standby state
while it processes a task and return itself to InService when the processing is complete.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 30 x
The operations team and the development team want asingle place to view both operating system and application logs.
How should you implement this using AWS services? Choose 2 answers

- A. Using AWS CloudFormation, create a CloudWatch Logs LogGroup and send the operating system and application logs of interest using the CloudWatch Logs Agent.
  
- B. Using AWS CloudFormation and configuration management, set up remote logging to send events via UDP packets to CloudTrail.
- C. Using configuration management, set up remote logging to send events to Amazon Kinesis and insert these into Amazon CloudSearch or Amazon Redshift, depending on available analytic tools.
- D. Using AWS CloudFormation, create a CloudWatch Logs LogGroup.
Because the Cloudwatch Log agent automatically sends all operating system logs, you only have to configure the application logs for sending off-machine.
- E. Using AWS CloudFormation, merge the application logs with the operating system logs, and use IAM Roles to allow both teams to have access to view console output from Amazon EC2.

<details><summary>Answer:</summary><p> AC

</p></details><hr>

### QUESTION 31
The project you are working on currently uses a single AWS CloudFormation template to deploy its AWS infrastructure, which supports a multi-tier web application.
You have been tasked with organizing the AWS CloudFormation resources so that they can be maintained in the future, and so that different departments such as Networking and Security can review the architecture before it goes to Production.
How should you do this in a way that accommodates each department, using their existing workflows?

- A. Organize the AWS CloudFormation template so that related resources are next to each other in the template, such as VPC subnets and routing rules for Networking and security groups and IAM information for Security.
- B. Separate the AWS CloudFormation template into a nested structure that has individual templates for the resources that are to be governed by different departments, and use the outputs from the networking and security stacks for the application template that you control
- C. Organize the AWS CloudFormation template so that related resources are next to each other in the template for each department's use, leverage your existing continuous integration tool to constantly deploy changes from all parties to the Production environment, and then run tests for validation.
- D. Use a custom application and the AWS SDK to replicate the resources defined in the current AWS CloudFormation template, and use the existing code review system to allow other departments to approve changes before altering the application for future deployments.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 32
You currently run your infrastructure on Amazon EC2 instances behind an Auto Scaling group> All logs for you application are currently written to ephemeral storage.
Recently your company experienced a major bug in code that made it through testing and was ultimately deployed to your fleet.
This bug triggered your Auto Scaling group to scale up and back down before you could successfully retrieve the logs off your server to better assist you in troubleshooting the bug. Which technique should you use to make sure you are able to review your logs after your instances have shut down?

- A. Configure the ephemeral policies on your Auto Scaling group to back up on terminate.
- B. Configure your Auto Scaling policies to create a snapshot of all ephemeral storage on terminate.
- C. Install the CloudWatch Logs Agent on your AMI, and configure CloudWatch Logs Agent to stream
your logs.
   
- D. Install the CloudWatch monitoring agent on your AMI, and set up new SNS alert for CloudWatch metrics that triggers the CloudWatch monitoring agent to backup all logs on the ephemeral drive.
- E. Install the CloudWatch monitoring agent on your AMI, Update your Auto Scaling policy to enable
automated CloudWatch Log copy.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 33 x
Management has reported an increase in the monthly bill from Amazon web services, and they are extremely concerned with this increased cost.
Management has asked you to determine the exact cause of this increase.
After reviewing the billing report, you notice an increase in the data transfer cost.
How can you provide management with a better insight into data transfer use?

- A. Update your Amazon CloudWatch metrics to use five-second granularity, which will give better
detailed metrics that can be combined with your billing data to pinpoint anomalies.
- B. Use Amazon CloudWatch Logs to run a map-reduce on your logs to determine high usage and
data transfer.
- C. Deliver custom metrics to Amazon CloudWatch per application that breaks down application data
transfer into multiple, more specific data points.
- D. Using Amazon CloudWatch metrics, pull your Elastic Load Balancing outbound data transfer
metrics monthly, and include them with your billing report to show which application is causing higher bandwidth usage.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 34
During metric analysis, your team has determined that the company's website is experiencing response times during peak hours that are higher than anticipated.
You currently rely on Auto Scaling to make sure that you are scaling your environment during peak windows.
How can you improve your Auto Scaling policy to reduce this high response time? Choose 2 answers.

- A. Push custom metrics to CloudWatch to monitor your CPU and network bandwidth from your servers, which will allow your Auto Scaling policy to have better fine-grain insight.
- B. Increase your Auto Scaling group's number of max servers.
- C. Create a script that runs and monitors your servers; when it detects an anomaly in load, it posts to
an Amazon SNS topic that triggers Elastic Load Balancing to add more servers to the load
balancer.
- D. Push custom metrics to CloudWatch for your application that include more detailed information
about your web application, such as how many requests it is handling and how many are waiting
to be processed.
- E. Update the CloudWatch metric used for your Auto Scaling policy, and enable sub-minute
granularity to allow auto scaling to trigger faster.

<details><summary>Answer:</summary><p> BD

</p></details><hr>

### QUESTION 35 x
You are responsible for your company's large multi-tiered Windows-based web application running on Amazon EC2 instances situated behind a load balancer.
  
While reviewing metrics, you've started noticing an upwards trend for slow customer page load time.
Your manager has asked you to come up with a solution to ensure that customer load time is not affected by too many requests per second.
Which technique would you use to solve this issue?

- A. Re-deploy your infrastructure using an AWS CloudFormation template.
Configure Elastic Load Balancing health checks to initiate a new AWS CloudFormation stack when health checks return failed.
- B. Re-deploy your infrastructure using an AWS CloudFormation template.
Spin up a second AWS CloudFormation stack.
Configure Elastic Load Balancing SpillOver functionality to spill over any slow connections to the second AWS CloudFormation stack.
- C. Re-deploy your infrastructure using AWS CloudFormation, Elastic Beanstalk, and Auto Scaling. Set up your Auto Scaling group policies to scale based on the number of requests per second as well as the current customer load time.
- D. Re-deploy your application using an Auto Scaling template.
Configure the Auto Scaling template to spin up a new Elastic Beanstalk application when the customer load time surpasses your threshold.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 36 x
Your company has multiple applications running on AWS.
Your company wants to develop a tool that notifies on-call teams immediately via email when an alarm is triggered in your environment.
You have multiple on-cal teams that work different shifts, and the tool should handle notifying the correct teams at the correct times.
How should you implement this solution?

- A. Create an Amazon SNS topic and an Amazon SQS queue.
Configure the Amazon SQS queue as a subscriber to the Amazon SNS topic.
Configure CloudWatch alarms to notify this topic when an alarm is triggered.
Create an Amazon EC2 Auto Scaling group with both minimum and desired Instances configured to 0.
Worker nodes in this group spawn when messages are added to the queue.
Workers then use Amazon Simple Email Service to send messages to your on call teams.
- B. Create an Amazon SNS topic and configure your on-call team email addresses as subscribers. Use the AWS SDK tools to integrate your application with Amazon SNS and send messages to this new topic.
Notifications will be sent to on-call users when a CloudWatch alarm is triggered.
- C. Create an Amazon SNS topic and configure your on-call team email addresses as subscribers. Create a secondary Amazon SNS topic for alarms and configure your CloudWatch alarms to notify this topic when triggered.
Create an HTTP subscriber to this topic that notifies your application via HTTP POST when an alarm is triggered.
Use the AWS SDK tools to integrate your application with Amazon SNS and send messages to
the first topic so that on-call engineers receive alerts.
- D. Create an Amazon SNS topic for each on-call group, and configure each of these with the team
member emails as subscribers.
Create another Amazon SNS topic and configure your CloudWatch alarms to notify this topic when triggered.
Create an HTTP subscriber to this topic that notifies your application via HTTP POST when an alarm is triggered.
Use the AWS SDK tools to integrate your application with Amazon SNS and send messages to the correct team topic when on shift.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 37
Your company releases new features with high frequency while demanding high application availability.
As part of the application's A/B testing, logs from each updated Amazon EC2 instance of the application need to be analyzed in near real-time, to ensure that the application is working flawlessly after each deployment. If the logs show arty anomalous behavior, then the application version of the instance is changed to a more stable one.
Which of the following methods should you use for shipping and analyzing the logs in a highly available manner?

- A. Ship the logs to Amazon S3 for durability and use Amazon EMR to analyze the logs in a batch manner each hour.
- B. Ship the logs to Amazon CloudWatch Logs and use Amazon EMR to analyze the logs in a batch manner each hour.
- C. Ship the logs to an Amazon Kinesis stream and have the consumers analyze the logs in a live manner.
- D. Ship the logs to a large Amazon EC2 instance and analyze the logs in a live manner.
- E. Store the logs locally on each instance and then have an Amazon Kinesis stream pull the logs for
live analysis.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 38 x
You have a code repository that uses Amazon S3 as a data store. During a recent audit of your security controls, some concerns were raised about maintaining the integrity of the data in the Amazon S3 bucket. Another concern was raised around securely deploying code from Amazon S3 to applications running on Amazon EC2 in a virtual private cloud.
What are some measures that you can implement to mitigate these concerns? Choose 2 answers.

- A. Add an Amazon S3 bucket policy with a condition statement to allow access only from Amazon EC2 instances with RFC 1918 IP addresses and enable bucket versioning.
- B. Add an Amazon S3 bucket policy with a condition statement that requires multi-factor authentication in order to delete objects and enable bucket versioning.
- C. Use a configuration management service to deploy AWS Identity and Access Management user credentials to the Amazon EC2 instances.
Use these credentials to securely access the Amazon S3 bucket when deploying code.
- D. Create an Amazon Identity and Access Management role with authorization to access the Amazon 53 bucket, and launch all of your application's Amazon EC2 instances with this role.
- E. Use AWS Data Pipeline to lifecycle the data in your Amazon S3 bucket to Amazon Glacier on a weekly basis.
- F. Use AWS Data Pipeline with multi-factor authentication to securely deploy code from the Amazon .5.3 bucket to your Amazon EC2 instances.

<details><summary>Answer:</summary><p> BD
    

</p></details><hr>

### QUESTION 39
You have an application consisting of a stateless web server tier running on Amazon EC2 instances behind load balancer, and are using Amazon RDS with read replicas.
Which of the following methods should you use to implement a self-healing and cost-effective architecture? Choose 2 answers.

- A. Set up a third-party monitoring solution on a cluster of Amazon EC2 instances in order to emit custom CloudWatch metrics to trigger the termination of unhealthy Amazon EC2 instances.
- B. Set up scripts on each Amazon EC2 instance to frequently send ICMP pings to the load balancer in order to determine which instance is unhealthy and replace it.
- C. Set up an Auto Scaling group for the web server tier along with an Auto Scaling policy that uses the Amazon RDS DB CPU utilization CloudWatch metric to scale the instances.
- D. Set up an Auto Scaling group for the web server tier along with an Auto Scaling policy that uses the Amazon EC2 CPU utilization CloudWatch metric to scale the instances.
- E. Use a larger Amazon EC2 instance type for the web server tier and a larger DB instance type for the data storage layer to ensure that they don't become unhealthy.
- F. Set up an Auto Scaling group for the database tier along with an Auto Scaling policy that uses the Amazon RDS read replica lag CloudWatch metric to scale out the Amazon RDS read replicas.
- G. Use an Amazon RDS Multi-AZ deployment.

<details><summary>Answer:</summary><p> DG

</p></details><hr>

### QUESTION 40
Your application is currently running on Amazon EC2 instances behind a load balancer. Your management has decided to use a Blue/Green deployment strategy.
How should you implement this for each deployment?

- A. Set up Amazon Route 53 health checks to fail over from any Amazon EC2 instance that is currently being deployed to.
- B. Using AWS CloudFormation, create a test stack for validating the code, and then deploy the code to each production Amazon EC2 instance.
- C. Create a new load balancer with new Amazon EC2 instances, carry out the deployment, and then switch DNS over to the new load balancer using Amazon Route 53 after testing.
- D. Launch more Amazon EC2 instances to ensure high availability, de-register each Amazon EC2 instance from the load balancer, upgrade it, and test it, and then register it again with the load balancer.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 41 x
Your company currently runs a large multi-tier web application. One component is an API service that all other components of your application rely on to perform read/write operations.
This service must have high availability and zero downtime during deployments.
Which technique should you use to provide cost-effective, zero-downtime deployments for this component?

- A. Use an AWS CloudFormation template to re-deploy your application behind a load balancer, and launch a new AWS CloudFormation stack during each deployment.
Update your load balancer to send traffic to the new stack, and then deploy your software. Leave your old stacks running, and tag their resources with the version for rollback.
- B. Re-deploy your application on Elastic Beanstalk. During deployment, create a new version of your application, and create a new environment running that version in Elastic BeanStalk. Finally, take  advantage of the Elastic Beanstalk Swap CNAME operation to switch to the new environment. 
- C. Re-deploy your application behind a load balancer that uses Auto Scaling groups. Create a new
identical Auto Scaling group and associate it to your Amazon Route53 zone.
Configure Amazon Route53 to auto- weight traffic over to the new Auto Scaling group when all instances are marked as healthy.
- D. Re-deploy your application behind a load balancer using an AWS OpsWorks stack and use AWS OpsWorks stack versioning, during deployment create a new version of your application, tell AWS OpsWorks to launch the new version behind your load balancer, and when the new version is launched, terminate the old AWS OpsWorks stack.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 42
You want to build a new search tool feature for your monitoring system that will allow your information security team to quickly audit all API calls in your AWS accounts.
What combination of AWS services can you use to develop and automate the backend processes supporting this tool?
Choose 3 answers.

- A. Create an Amazon CloudSearch domain for API call logs. Configure the search domain so that it can be used to index API call logs for the search tool.
- B. Use AWS CloudTrail to store API call logs in an Amazon S3 bucket. Configure an Amazon Simple Notification Service topic called "log-notification" that notifies subscribers when new logs are available.
Subscribe an Amazon SQS queue to the topic.
- C. Use Amazon Cloudwatch to ship AWS CloudTrail logs to your monitoring system.
- D. Create an AWS Elastic Beanstalk application in worker role mode that uses an Amazon Simple
Email Service (SES) domain to facilitate batch processing new API call log files retrieved from an
Amazon S3 bucket into a search index.
- E. Use AWS CloudTrail to store API call logs in an Amazon S3 bucket. Configure Amazon Simple
Email Service (SES) to notify subscribers when new logs are available. Subscribe an Amazon
SQS queue to the email domain.
- F. Create Amazon Cloudwatch custom metrics for the API call logs. Configure a Cloudwatch search
domain so that it can be used to index API call logs for the search tool.
- G. Create an AWS Elastic Beanstalk application in worker role mode that uses an Amazon SQS
queue to facilitate batch processing new API call log files retrieved from an Amazon S3 bucket into a search index.

<details><summary>Answer:</summary><p> ABG

</p></details><hr>

### QUESTION 43 x
You are using AWS Elastic Beanstalk to deploy your application and must make data stored on an Amazon Elastic Block Store (EBS) volume snapshot available to the Amazon Elastic Compute Cloud (EC2) instances. How can you modify your Elastic Beanstalk environment so that the data is added to the Amazon EC2 instances every time you deploy your application?

- A. Add commands to a configuration file in the .ebextensions folder of your deployable archive that mount an additional Amazon EBS volume on launch.
Also add a "BlockDeviceMappings" option, and specify the snapshot to use for the block device in the Auto Scaling launch configuration.
- B. Add commands to a configuration file in the .ebextensions folder of your deployable archive that uses the create-volume Amazon EC2 API or CLI to create a new ephemeral volume based on the
specified snapshot and then mounts the volume on launch.
- C. Add commands to the Amazon EC2 user data that will be executed by eb-init, which uses the
create- volume Amazon EC2 API or CLI to create a new Amazon EBS volume based on the
specified snapshot, and then mounts the volume on launch.
- D. Add commands to the Chef recipe associated with your environment, use the create-volume
Amazon EC2 API or CLI to create a new Amazon EBS volume based on the specified snapshot, and then mount the volume on launch.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 44 x
You would like to run automated, continuous application level integration tests on all members of an Auto Scaling group. Which two options should you use?
Choose 2 answers.

- A. Use the AWS SDK to run the DescribeInstances API call on the Auto Scaling group, and then iterate over the members and remotely connect to each Amazon EC2 instance and run the integration tests.
- B. Use the AWS SDK to run the DescribeAutoScalinglnstances API call on the Auto Scaling Group, iterate over the members using the Describe Instances API call, remotely connect to each Amazon EC2 instance, and then run the integration tests.
- C. Set up a custom CloudWatch metric with the output of your integration tests that are run by a scheduled process on each instance, and then set up a CloudWatch alert for any failures.
- D. Using an Auto Cycle Group lifecycle policy, define a scheduled task to run integration tests when a new Amazon EC2 instance enters the InService state.
- E. Set up a custom CloudWatch metric that uses the output of the DescribeAutoScalingInstances API call to determine the HealthCheck status of the Amazon EC2 instances.
- F. Using the Auto Cycle Group lifecycle policy, define a scheduled task to run integration tests on individual instances using the Amazon EC2 user data to export test data to CloudWatch Logs.

<details><summary>Answer:</summary><p> BC

</p></details><hr>

### QUESTION 45
Your application Amazon Elastic Compute Cloud (EC2) instances bootstrap by using a master configuration file that is kept in a version-enabled Amazon Simple Storage Service (S3) bucket. Which one of the following methods should you use to securely install the current configuration version onto the instances in a cost-effective way?

- A. Create an Amazon DynamoDB table to store the different versions of the configuration file. Associate AWS Identity and Access Management (IAM) EC2 roles to the Amazon EC2 instances, and reference the DynamoDB table to get the latest file from Amazon Simple Storage Service (S3).
- B. Associate an IAM S3 role to the bucket, list the object versions using the Amazon S3 API, and then get the latest object.
- C. Associate an IAM EC2 role to the instances, list the object versions using the Amazon S3 API, and then get the latest object.
- D. Associate an IAM EC2 role to the instances, and then simply get the object from Amazon S3, because the default is the current version.
- E. Store the IAM credentials in the Amazon EC2 user data for each instance, and then simply get the object from S3, because the default is the current version.

<details><summary>Answer:</summary><p> D
    

</p></details><hr>

### QUESTION 46 x
Your company operates a website for promoters to sell tickets for entertainment events.
You are using a load balancer in front of an Auto Scaling group of web servers. Promotion of popular events can cause surges of website visitors.
During scaling-out at these times, newly launched instances are unable to complete configuration quickly enough, leading to user disappointment.
What options should you choose to improve scaling yet minimize costs? Choose 2 answers.

- A. Create an AMI with the application pre-configured.
Create a new Auto Scaling launch configuration using this new AMI, and configure the Auto Scaling group to launch with this AMI.
- B. Use Auto Scaling pre-warming to launch instances before they are required. Configure pre-warming to use the CPU trend CloudWatch metric for the group.
- C. Publish a custom CloudWatch memo from your application on the number of tickets sold, and create an Auto Scaling policy based on this.
- D. Use the history of past scaling events for similar event sales to predict future scaling requirements.
Use the Auto Scaling scheduled scaling feature to vary the size of the fleet.
- E. Configure an Amazon S3 bucket for website hosting. Upload into the bucket an HTML holding
page with its x-amz-website-redirect-location' metadata property set to the load balancer endpoint.
Configure Elastic Load Balancing to redirect to the holding page when the load on web servers is above a certain level.

<details><summary>Answer:</summary><p> AD

</p></details><hr>

### QUESTION 47
You're responsible for a popular file sharing application that uses Elastic Load Balancing to distribute traffic to an Amazon EC2 application tier deployed in an Auto Scaling group that runs across multiple Availability Zones.
You currently record the number of user file transfers to a log file on the application server, and then write data points from the logs to an Amazon RDS MySQL instance.
You aren't happy with how your application scales, and want to implement a new scaling policy based on the average number of user file transfers in a 10-minute period instead of average CPU utilization in the last five minutes.
What steps should you take to ensure that your application tier scales based on this new policy? Choose 2 answers

- A. Create a new CloudWatch alarm based on the Elastic Load Balancing "RequestCount" metric that triggers an Auto Scaling action to scale the application tier.
- B. Create a new CloudWatch alarm based on a custom metric streaming from the Amazon RDS MySQL instance that triggers an Auto Scaling action to scale the application tier.
- C. Create a new CloudWatch alarm based on a custom metric published from file transfer logs streaming to CloudWatch that triggers an Auto Scaling action to scale the application tier.
- D. Create a new Auto Scaling launch configuration that includes an Amazon EC2 user data script that installs a CloudWatch Logs Agent on newly launched instances in the application tier. The agent will be configured to stream the file transfers log tile to CloudWatch.
- E. Create a new Auto Scaling launch configuration for the application tier that scales based on an Auto Scaling policy that reads the file transfer log data from the Amazon RIDS MySQL instance.
- F. Create a new Auto Scaling launch configuration that includes an Amazon EC2 user data script that installs an Amazon RDS Logs Agent on newly launched instances in the application tier. The agent will be configured to stream the file transfer data points to the Auto Scaling group. 

<details><summary>Answer:</summary><p> CD

</p></details><hr>

### QUESTION 48 x
Your DevOps team is responsible for a multi-tier, Windows-based web application consisting of web servers, Amazon RDS database instances, and a load balancer behind Amazon Route53. You've been asked by your manager to build a cost-effective rolling deployment solution for this web application.
What method should you use?

- A. Re-deploy your application on an AWS OpsWorks stack. Use the AWS OpsWorks done stack feature to allow updates between duplicate stacks.
- B. Re-deploy your application on Elastic Beanstalk and take advantage of Elastic BeanStalk rolling updates.
- C. Re-deploy your application using an AWS CloudFormation template, launch a new AWS CloudFormation stack during each deployment, and then tear down the old stack.
- D. Re-deploy your application using an AWS CloudFormation template. Use AWS CloudFormation rolling deployment policies, create a new policy for your AWS CloudFormation stack, and initiate an update stack operation to deploy new code.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 49
You recently encountered a major bug in your Windows-based web application during a deployment cycle.
During this failed deployment, it took the team four hours to roll back to a previously working state, which left customers with a poor user experience.
During the post-mortem, your team discussed the need to provide a quicker way to roll back failed deployments.
You currently run your web application on Amazon EC2 using Windows 2012R2 and use Elastic Load Balancing for your load balancing needs.
Which technique should you use to solve this problem?

- A. Create deployable versioned bundles of your application. Store the bundles on Amazon S3. Re-deploy your web application on Elastic Beanstalk, and enable the Elastic Beanstalk auto- rollback feature tied to CloudWatch metrics that define failure.
- B. Re-deploy your web application using an AWS OpsWorks stack, and use the AWS OpsWorks auto-rollback feature to initiate a rollback during failures.
- C. Create deployable versioned bundles of your application.
Store the bundle on Amazon S3. Re-deploy your web application using an AWS OpsWorks stack, and use AWS OpsWorks application versioning to initiate a rollback during failures.
- D. Re-deploy your web application using Elastic Beanstalk, and use the Elastic Beanstalk application versions when deploying.
During failures, re-deploy the previous version to the Elastic Beanstalk environment.
- E. Re-deploy your web application using Elastic Beanstalk, and use the Elastic Beanstalk API to trigger a FailedDeployment API call to initiate a rollback to the previous version.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 50    
You have a high-traffic application running behind a load balancer with clients that are very sensitive to latency.
How should you determine which back-end Amazon Elastic Compute Cloud application instances are causing increased latency so that they can be replaced?

- A. By using the Elastic Load Balancing Latency CloudWatch metric.
- B. By using the HTTP X-Forwarded-For header for requests from the load balancer.
- C. By running a distributed load test to the load balancer.
- D. By using the load balancer access logs.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 51 x
Your company operates an application consisting of an AWS CloudFormation stack that contains a load balancer, an Auto Scaling group of web servers, and an Amazon RDS instance.
To save time and costs, you update the current test stack when testing minor changes, and create a new stack for major changes.
As part of the testing procedure of your application, each version needs to be registered once and only once with a Configuration Management Database (CMDB).
What cost-effective solution should you choose to perform this registration?

- A. Use Auto Scaling Leader Node functionality to notify the registration application from the UserData script of a single Instance.
Use the AWS CloudFormation cfn-hup helper application to receive template updates on the leader node, which then notifies the CMDB.
- B. Define an AWS: :CloudFormation::CustomResource in the AWS CloudFormation template, with the application version as one of its properties.
Modify the CMDB to subscribe to the resource's creation and update notifications.
- C. Define an AWS::CloudFormation::HttpRequest in the AWS CloudFormation template, and configure it to notify the CMDB on stack creation and update.
- D. Define an AWS::EC2::Instance resource in the AWS CloudFormation template that is configured to run a UserData script to notify the CMDB and then terminate itself on completion.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 52
You manage a three-tier web application consisting of an autoscaled web proxy tier, an autoscaled application tier, and an Amazon RDS database tier.
You use a load balancer to distribute requests from end users to the web proxy tier and another, internal load balancer to distribute requests between the web tier and the application tier.
After deploying a small database schema update, you notice that all of your web and application instances have been terminated.
What may have caused this?

- A. Your load balancers use an HTTP health check, and the page relies on retrieving data from your database.
- B. Your load balancer use TCP health checks to provide application-level health checks.
- C. The cooldown period of the Auto Scaling group is too short, so the instances don't have enough
time to recover from an issue.
- D. Your Auto Scaling group health check type is set to "EC2" to check that the instances themselves
are healthy.

<details><summary>Answer:</summary><p> A

</p></details><hr>

### QUESTION 53 x
Your organization has decided to implement a third-party configuration management tool that uses a master server from which nodes pull configuration.
You have built a custom base Amazon Machine Image that already has the third-party configuration management agent installed.
You want to use the same base AMI in Development, Test and Production environments, each of which has its own master server.
How should you configure your Amazon EC2 instances to register with the correct master server on launch?

- A. Create a tag for all instances that specifies their environment.
When launching instances, provide an Amazon EC2 UserData script that gets this tag by querying the MetaData Service and registers the agent with the master.
- B. Use Amazon CloudFormation to describe your environment.
Configure an input parameter for the master server hostname/address, and use this parameter within an Amazon EC2 UserData script that registers the agent with the master.
- C. Create a script on your third-party configuration management master server that queries the Amazon EC2 API for new instances and registers them with it.
- D. Use Amazon Simple Workflow Service to automate the process of registering new instances with your master server.
Use an Environment tag in Amazon EC2 to register instances with the correct master server.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 54 x
You have been asked to handle a large data migration from multiple Amazon RDS MySQL instances to a DynamoDB table.
You have been given a short amount of time to complete the data migration.
What will allow you to complete this complex data processing workflow?

- A. Create an Amazon Kinesis data stream, pipe in all of the Amazon RDS data, and direct the data toward a DynamoDB table.
- B. Write a script in your language of choice, install the script on an Amazon EC2 instance, and then use Auto Scaling groups to ensure that the latency of the migration pipelines never exceeds four seconds in any 15- minute period.
- C. Write a bash script to run on your Amazon RDS instance that will export data into DynamoDB.
- D. Create a data pipeline to export Amazon RDS data and import the data into DynamoDB.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 55
Your application requires a fault-tolerant, low-latency and repeatable method to load configurations files via Auto Scaling when Amazon Elastic Compute Cloud (EC2) instances launch.
Which approach should you use to satisfy these requirements?

- A. Securely copy the content from a running Amazon EC2 instance.
- B. Use an Amazon EC2 UserData script to copy the configurations from an Amazon Storage
Services (S3) bucket.
- C. Use a script via cfn-init to pull content hosted in an Amazon ElastiCache cluster.
- D. Use a script via cfn-init to pull content hosted on your on-premises server.
- E. Use an Amazon EC2 UserData script to pull content hosted on your on-premises server.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 56
Currently, your deployment process consists of setting your load balancer to point to a maintenance page, turning off ea web application servers, deploying your code, turning the web application servers back on, and removing the maintenance page.
Working with your development team, you've agreed that performing rolling deployments of your software would provide a better user experience and a more agile deployment process.
Which techniques could you use to provide a cost-effective rolling deployment process? Choose 2 answers.

- A. Use the Amazon Elastic Cloud Compute (EC2) API to write a service to return a list of servers based on the tags for the application that needs deployment, and use Amazon Simple Queue Service to queue up all servers for a rolling deployment.
- B. Re-deploy your application on AWS Elastic Beanstalk, and use Elastic Beanstalk rolling deployments.
- C. Re-deploy your application on an AWS OpsWorks stack, and take advantage of OpsWorks rolling deployments.
- D. Re-deploy your application using an AWS CloudFormation template, launch a new CloudFormation stack during each deployment, and then tear down the old stack.
- E. Re-deploy your application using an AWS CloudFormation template with Auto Scaling group, and use update policies to provide rolling updates.
- F. Using Amazon Simple Workflow Service, create a workflow application that talks to the Amazon EC2 API to deploy your new code in a rolling fashion.

<details><summary>Answer:</summary><p> BE

</p></details><hr>

### QUESTION 57 x
You manage a web advertising platform on a single AWS account. This platform produces real- time ad-click data that you store as objects in an Amazon S3 bucket called "dick-data."
Your advertising partners want to use Amazon Elastic MapReduce in their own AWS accounts to do analytics on the ad-click data.
They' ve asked for immediate access to the ad-dick data so that they can run analytics. Which two choices are required to facilitate secure access to this data? Choose 2 answers.

- A. Create a cross-account TAM role with a trust policy that contains partner AWS account IDs and a unique external ID.
- B. Create a new IAM group for AWS Data Pipeline users with a trust policy that contains partner AWS account IDs.
- C. Configure an Amazon S3 bucket policy for the "click-data" bucket that allows Read-Only access to the objects, and associate this policy with an IAM role.
- D. Configure the Amazon S3 bucket access control list to allow access to the partners Amazon Elastic MapReduce cluster.
- E. Configure AWS Data Pipeline in the partner AWS accounts to use the web Identity Federation API to access data in the "click-data" bucket.
- F. Configure AWS Data Pipeline to transfer the data from the ''click-data" bucket to the partner's Amazon Elastic MapReduce cluster.

<details><summary>Answer:</summary><p> AC

</p></details><hr>

### QUESTION 58
You run a SIP-based telephony application that uses Amazon EC2 for its web tier and uses MySQL on Amazon RDS as its database.
The application stores only the authentication profile data for its existing users in the database and therefore is read-intensive.
Your monitoring system shows that your web instances and the database have high CPU utilization.
Which of the following steps should you take in order to ensure the continual availability of your application? Choose 2 answers

- A. Use a CloudFront RTMP download distribution with the application tier as the origin for the distribution.
- B. Set up an Auto Scaling group for the application tier and a policy that scales based on the Amazon EC2 CloudWatch CPU utilization metric.
- C. Vertically scale up the Amazon EC2 instances manually.
- D. Set up an Auto Scaling group for the application tier and a policy that scales based on the
Amazon RDS CloudWatch CPU utilization metric.
- E. Switch to General Purpose (SSD) Storage from Provisioned IOPS Storage (PIOPS) for the
Amazon RDS database.
- F. Use multiple Amazon RDS read replicas.

<details><summary>Answer:</summary><p> BF

</p></details><hr>

### QUESTION 59
Your team is responsible for an AWS Elastic Beanstalk application.
The business requires that you move to a continuous deployment model, thus releasing updates to the application multiple times per day with zero downtime.
What should you do to enable this and still be able to roll back to the previous version almost immediately in an emergency?

- A. Enable roiling updates in the Elastic Beanstalk environment and set an appropriate pause time for application startup.
- B. Create a second Elastic Beanstalk environment that runs the new application version, and swap the environment CNAMEs
- C. Configure the application to poll for a new application version in your code repository; download and install the new version to each running Elastic Beanstalk instance.
- D. Create a second Elastic Beanstalk environment with the new application version, and configure the old environment to use the HTTP 301 response code to redirect clients to the new environment.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 60 x
Your Company wants to perform A/B testing on a new website feature for 20 percent of its users. The website uses CloudFront for whole site delivery, with some content cached for up to 24 hours.
How do you enable this testing for the required proportion of users while minimizing performance impact?
  

- A. Configure the web servers to handle two domain names.
The feature is switched on or off depending on which domain name is used for a request. Configure a CloudFront origin for each domain name, and configure the CloudFront distribution to use one origin for 20 percent of users and the other origin for the other 80 percent.
- B. Configure the CloudFront distribution to forward a cookie specific to this feature.
For requests where the cookie is not set, the web servers set its value to ''on" for 20 percent of responses and "off" for 80 percent.
For requests where the cookie is set, the web servers use Its value to determine whether the feature should be on or off for the response.
- C. Create a second stack of web servers that host the website with the feature on.
Using Amazon Route53, create two resource record sets with the same name: one with a weighting of "1" and a value of this new stack; the other a weighting of "4" and a value of the existing stack. Use the resource record set's name as the CloudFront distribution's origin.
- D. Invalidate all of the CloudFront distribution's cache items that the feature affects.
On future requests, the web servers create responses with the feature on for 20 percent of users, and off for 80 percent.
The web servers set "Cache-Control: no-cache" on all of these responses.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 61 x
You have been asked to use your departments existing continuous Integration (CI) tool to test a three-tier web architecture defined In an AWS CloudFormation template.
The tool already supports AWS APIs and can launch new AWS CloudFormation stacks after polling version control.
The CI tool reports on the success of the AWS CloudFormation stack creation by using the Describe Stacks API to look for the CREATE COMPLETE status.
The architecture tiers defined in the template consist of:
- One load balancer
- Five Amazon EC2 instances running the web application 
- One multi-AZ Amazon ROS instance 

How would you implement this?  Choose 2 answers

- A. Define a WaitCondition and a WaitConditionHandle for the output of a UserData command that does sanity checking of the application's post-install state.
- B. Define a CustomResource and write a script that runs architecture-level Integration tests through the load balancer to the application and database for the state of multiple tiers.
- C. Define a WaitCondition and use a WaitConditionHandle that leverages the AWS SDK to run the DescribeStacks API call until the CREATE COMPLETE status is returned.
- D. Define a CustomResource that leverages the AWS SDK to run the DescribeStacks API call until the 'CREATE COMPLETE status is returned.
- E. Define a UserDataHandle for the output of a UserData command that does sanity checking of the application's post-install state and runs integration tests on the state of multiple tiers through the load balancer to the application.
- F. Define a UserDataHandle for the output of a CustomResource that does sanity checking of the application's post-install state.

<details><summary>Answer:</summary><p> CE 

</p></details><hr>

### QUESTION 62
    
You are building a large, multi-tenant SaaS (software-as-a-service) application with a component that fetches data to process from a customer-specific Amazon S3 bucket in their account.
How should you ensure that your application follows security best practices and limits risk when fetching data from customer-owned Amazon S3 buckets?

- A. Have users create an IAM user with a policy that grants read-only access to the Amazon S3 bucket required by your application, and store the corresponding access keys in an encrypted database that holds their account data.
- B. Have users create a cross-account lAM role with a policy that grants read-only access to the Amazon S3 bucket required by your application to the AWS account ID running your production Sass application.
- C. Have users create an Amazon S3 bucket policy that grants read-only access to the Amazon S3 bucket required by your application, and securely store the corresponding access keys in the database holding their account data.
- D. Have users create an Amazon S3 bucket policy that grants read-only access to the Amazon S3 bucket required by your application and limits access to the public IP address of the SaaS application.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 63
You have a fleet of Elastic Compute Cloud (EC2) instances in an Auto Scaling group.
All of these instances are running Microsoft Windows Server 2012 backed by Amazon Elastic Block Store (EBS).
These instances were launched through AWS CloudFormation.
You have determined that your instances are underutilized, and in order to save some money, have decided to modify the instance type of the fleet.
In which of the following ways can you achieve the desired result during a scheduled maintenance window? Choose 2 answers

- A. Create a new Auto Scaling launch configuration specifying the new instance type, associate it to the existing Auto Scaling group, and terminate the running instances.
- B. Identify the new instance type in the user data and restart the running instances one at a time.
- C. Use the AWS Command Line Interface (CLI) to modify the instance type of each running
instance.
- D. Change the instance type in the AWS CloudFormation template that was used to create the
Amazon EC2 instances, and then update the stack.
- E. Take snapshots of the running instances, and launch new instances based on those snapshots.

<details><summary>Answer:</summary><p> AD

</p></details><hr>

### QUESTION 64
You run a large number of applications on Amazon EC2 instances. Each application has associated metadata, such as cost center, support contact, and application ID.
Many applications usually co-exist on each Amazon EC2 instance, so the amount of metadata per instance can range from 10 to 200 items.
The customer wants to be able to quickly access this metadata using an API without logging into the instances.
Which of the following options will satisfy their requirements? Choose 2 answers

- A. Create individual Amazon EC2 tags for each metadata item, and associate them with the Amazon EC2 instances.
Access the metadata by using the ec2-describe-instance API call.
- B. Create compound Amazon EC2 tags for the metadata items, where multiple items are joined
together in individual tags, and associate them with the Amazon EC2 instances.
Access the metadata by using the ec2-describe-tags API call.
- C. Create a DynamoDB table to hold the metadata, and associate it with the Amazon EC2 instance
IDs running the applications.
Access the metadata by querying the database via the DynamoDB API.
- D. As part of the Amazon EC2 Instance bootstrapping process, add the metadata to the Amazon
EC2 user data.
Access the metadata by using the ec2-describe-instance API call.
- E. As part of the Amazon EC2 instance bootstrapping process, add the metadata to the Amazon
EC2 user data.
Access the metadata by accessing its loopback address from a management instance in the same VPC.

<details><summary>Answer:</summary><p> BC

</p></details><hr>

### QUESTION 65
You have an application running on multiple Amazon EC2 instances within an Auto Scaling group.
You notice that instances are being re-spawned as their health checks are failing in Amazon EC2. However, before you have a chance to diagnose the issue, the affected instances are being terminated by the Auto Scaling service.
You receive notifications of health checks failing and investigate within 20 minutes.
However, this is not enough time to troubleshoot the issue.
What should you change that will enable you to troubleshoot the instance before it is terminated by the Auto Scaling service, while keeping costs minimal?

- A. Install the Amazon CloudWatch Logs Agent on the instance and configure application and system logs to be sent to the CloudWatch Logs service.
- B. Configure an Amazon SNS topic and associate it with your Auto Scaling group's CloudWatch alarms.
Configure an Amazon SQS queue as a subscriber of this topic, and then create a fleet of Amazon EC2 workers that poll this queue and instruct the Amazon EC2 Auto Scaling API to remove the instance from the Auto Scaling group when an alarm is triggered.
- C. Create an Auto Scaling Group lifecycle hook to hold the instance in a terminating:wait state until you have completed any troubleshooting.
When you have completed troubleshooting, wait for the terminating state to expire, or notify to Scaling to complete the lifecycle hook and terminate the Instance.
- D. Change the "DeleteOnTermination" flag to false in the Auto Scaling group configuration to ensure that instances are not deleted in the future.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 66
You set up a scalable continuous integration platform on AWS.
The platform consists of a master node that can delegate project build jobs to multiple slave nodes, all running on Amazon EC2.
The build output will be stored in Amazon S3.
You always have five slave nodes deployed. Each slave node can handle 10 build jobs simultaneously.
Your master node publishes a custom Amazon CloudWatch metric with the name "RunningBuildiobs" that Slows you to programmatically track how many build jobs are running across your platform.
Which two configuration options will allow you to flexibly scale your platform to support more than 50 simultaneous build jobs while minimizing costs? Choose 2 answers

- A. Place your fleet of slave nodes in an Auto Scaling group.
Configure a CloudWatch alarm that triggers an Auto Scaling policy to launch Amazon EC2 Instances when "RunningBuildJobs" is greater than 45 for more than five minutes.
- B. Configure a CloudWatch alarm that sends an alert when "RunningBuildJobs" is greater than 45 for more than five minutes.
Use Amazon Simple Queue Service to process additional build jobs when the CloudWatch alarm is triggered.
- C. Configure your fleet of slave nodes to fully utilize all of your purchased Amazon EC2 Heavy Utilization Reserved Instances.
Configure a CloudWatch alarm that launches new Amazon EC2 instances when "RunningBuildJobs" is less than 40 for more than five minutes.
- D. Run your fleet of slave nodes in an Auto Scaling group.
Configure a Cloudwatch alarm that launches new Amazon EC2 Dedicated Instances when "RunningBuildJobs" is less than 40 for more than five minutes.
- E. Place your fleet of slave nodes in an Auto Scaling group.
Configure a CloudWatch alarm that triggers an Auto Scaling policy to terminate Amazon EC2 instances when "RunningBuildJobs" is less than 40 for more than five minutes.

<details><summary>Answer:</summary><p> AE

</p></details><hr>

### QUESTION 67
You have just come from your Chief Information Security Officer's (CISO) office with the instructions to provide an audit report of all AWS network rules used by the organization's Amazon EC2 instances. You have discovered that a single Describe-Security-Groups API call will return all of an account's security groups and rules within a region.
You create the following pseudo-code to create the required report:

- Parse "aws ec2 describe-security-groups" output 
- For each security group
- Create report of ingress and egress rules

Which two additional pieces of logic should you include to meet the CISO's requirements? Choose 2 answers

- A. Parse security groups in each region.
- B. Parse security groups in each Availability Zone and region.
- C. Evaluate VPC network access control lists.
- D. Evaluate AWS CloudTrail logs.
- E. Evaluate Elastic Load Balancing access control lists.
- F. Parse CloudFront access control lists.

<details><summary>Answer:</summary><p> AC

</p></details><hr>

### QUESTION 68
You are responsible for a large-scale video transcoding system that operates with an Auto Scaling group of video transcoding workers.
The Auto Scaling group is configured with a minimum of 750 Amazon EC2 instances and a maximum of 1000 Amazon EC2 instances.
You are using Amazon SQS to pass a message containing the URI for a video stored in Amazon S3 to the transcoding workers.
An Amazon CloudWatch alarm has notified you that the queue depth is becoming very large. How can you resolve the alarm without the risk of increasing the time to transcode videos? Choose 2 answers.

- A. Create a second queue in Amazon SQS.
- B. Adjust the Amazon CloudWatch alarms for a higher queue depth.
- C. Create a new Auto Scaling group with a launch configuration that has a larger Amazon EC2
instance type
- D. Add an additional Availability Zone to the Auto Scaling group configuration.
- E. Change the Amazon CloudWatch alarm so that it monitors the CPU utilization of the Amazon EC2
instances rather than the Amazon SQS queue depth.
- F. Adjust the Auto Scaling group configuration to increase the maximum number of Amazon EC2
instances.

<details><summary>Answer:</summary><p> CF

</p></details><hr>

### QUESTION 69
You have been tasked with deploying a solution for your company that will store images, which the marketing department will use for its campaigns.
Employees are able to upload images via a web interface, and once uploaded, each image must be resized and watermarked with the company logo.
Image resize and watermark is not time-sensitive and can be completed days after upload if required.
How should you design this solution in the most highly available and cost-effective way?

- A. Configure your web application to upload images to the Amazon Elastic Transcoder service. Use the Amazon Elastic Transcoder watermark feature to add the company logo as a watermark on your images and then to upload the final images into an Amazon S3 bucket.
- B. Configure your web application to upload images to Amazon S3, and send the Amazon S3 bucket URI to an Amazon SQS queue.
Create an Auto Scaling group and configure it to use Spot instances, specifying a price you are willing to pay.
Configure the instances in this Auto Scaling group to poll the SQS queue for new images and
then resize and watermark the image before uploading the final images into Amazon S3.
- C. Configure your web application to upload images to Amazon S3, and send the S3 object URI to
an Amazon SQS queue.
Create an Auto Scaling launch configuration that uses Spot instances, specifying a price you are willing to pay.
Configure the instances in this Auto Scaling group to poll the Amazon SQS queue for new images and then resize and watermark the image before uploading the new images into Amazon S3 and deleting the message from the Amazon SQS queue.
- D. Configure your web application to upload images to the local storage of the web server.
Create a cronjob to execute a script daily that scans this directory for new files and then uses the Amazon EC2 Service API to launch 10 new Amazon EC2 instances, which will resize and watermark the images daily.

<details><summary>Answer:</summary><p> C 

</p></details><hr>

### QUESTION 70
    
You run a small online consignment marketplace. Interested sellers complete an online application in order to allow them to sell their products on your website.
Once approved, they can post their product using a custom interface.
From that pant, you manage the shopping cart process so that when a buyer decides to buy a product, you handle the billing and coordinate the shipping.
Part of this process requires sending emails to the buyer and the seller at different stages. Your system has been running on AWS for a few months.
Occasionally, products are shipped before payment cleared and emails are sent out of order. Furthermore, sometimes credit cards are being charged twice. How can you resolve these problems?

- A. Use the Amazon Simple Queue Service (SQS), and use a different set of workers for each task.
- B. Use the Amazon Simple Workflow Service (SWF), and use a different set of workers for each
task.
- C. Use the Simple Email Service (SES) to control the correct order of email delivery.
- D. Use the AWS Data Pipeline service to control the process flow of the various tasks.
- E. Use the Amazon Simple Queue Service (SQS), and use a single set of workers for each task.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 71 x
Your application has an Auto Scaling group of m3.large instances running an application that receives messages born an Amazon SQS queue.
After a while, the number of instances reaches the maximum set for the group and the number of messages on the queue continues to increase.
You have discovered that a third- party library used by the application has a bug that causes a memory leak.
What cost-effective steps can you take to continue message processing while the library developer fixes the bug?

- A. Enable Elastic Load Balancing health checks for the Auto Scaling group.
When Elastic Load Balancing has detected a failure, Auto Scaling will terminate the failing application's instance and launch a new one.
- B. Use Amazon EC2 instance memory usage CloudWatch metrics to raise alerts when they reach a defined level and send a message to Auto Scaling to fail the instance health check.
- C. Use application monitoring on the instance to restart the application when memory usage reaches a defined level.
- D. Create a new Auto Scaling launch configuration to use the r3.large instance type. Update the Auto Scaling group with the new launch configuration.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 72
You are in charge of a large-scale highly available multi-tier web application infrastructure. This architecture consists of Amazon Route53 with a load balancer and multiple Amazon EC2 instances.
You have been tasked to come up with a process to provide Blue/Green style deployments. Which technique should you use to deliver this new requirement?

- A. Using Elastic Beanstalk re-deploy your application and configure Elastic Beanstalk Deployment types, and then use Amazon Route53's alias resource record set to swap between Elastic Beanstalk deployment types.
  
- B. Re-deploy your application behind a load balancer using an AWS CloudFormation template, launch a new AWS CloudFormation stack during each deployment, update your Amazon Route53 alias resource record set to point to the new load balancer, and finally, terminate your old AWS CloudFormation stack.
- C. Re-deploy your application behind a load balancer using Auto Scaling groups, create a new identical Auto Scaling group, and associate it to the load balancer.
During deployment, create a new Amazon Route53 hosted zone, add this new load balancer to the zone in an alias resource record set, and then remove your old Auto Scaling group.
- D. Re-deploy your application behind a load balancer using an OpsWorks stack, and use AWS OpsWorks stack versioning.
During deployment, create a new version of your application, tell OpsWorks to launch the new version behind your load balancer, and when the new version launches, update your Amazon Route53 alias resource retort to point to the new load balancer.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 73
Your application uses Amazon SQS and Auto Scaling to process background jobs.
The Auto Scaling policy is based on the number of messages in the queue, with a maximum Instance count of 100.
Since the application was launched, the group has never scaled above 50.
The Auto Scaling group has now scaled to 100, the queue size is increasing, and very few Jobs are being completed.
The number of messages being sent to the queue is at normal levels.
What should you do to identify why the queue size is unusually high, and to reduce it?

- A. Temporarily increase the Auto Scaling group's desired value to 200. When the queue size has been reduced, reduce it to 50.
- B. Analyze the application logs to identify possible reasons for message processing failure and resolve the cause for failures.
- C. Create additional Auto Scaling groups, enabling the processing of the queue to be performed in parallel.
- D. Analyze CloudTrail logs for Amazon SQS to ensure that the instances' Amazon EC2 role has permission to receive messages from the queue.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 74
You have a web application that is currently running on a collection of micro instance types in a single AZ behind a single load balancer.
You have an Auto Scaling group configured to scale from 2 to 64 instances. When reviewing your CloudWatch metrics, you see that sometimes your Auto Scaling group is running 64 micro instances. The web application is reading and writing to a DynamoDB-configured backend and configured with 800 Write Capacity Units and 800 Read Capacity Units.
Your customers are complaining that they are experiencing long load times when viewing your website.
You have investigated the DynamoDB CloudWatch metrics; you are under the provisioned Read and write Capacity Units and there is no throttling.
How do you scale your service to improve the load times and ensure the principles of high availability?

- A. Change your Auto Scaling group configuration to include multiple AZs.
    
- B. Change your Auto Scaling group configuration to include multiple AZs, and increase the number of Read Capacity Units in your DynamoDB table by a factor of three, because you will need to be calling DynarnoDB from three AZs.
- C. Add a second load balancer to your Auto Scaling group so that you can support more inbound connections per second.
- D. Change your Auto Scaling group configuration to use larger instances and include multiple AZ's instead of one.

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 75
Your social media marketing application has a component written in Ruby running on AWS Elastic Beanstalk.
This application component posts messages to social media sites in support of various marketing campaigns.
Your management now requires you to record replies to these social media messages to analyze the effectiveness of the marketing campaign in comparison to past and future efforts.
You' ve already developed a new application component to interface with the social media site APIs in order to read the replies.
Which process should you use to record the social media replies in a durable data store that can be accessed at any time for analysis of historical data?

- A. Deploy the new application component in an Auto Scaling group of Amazon Elastic Compute Cloud (EC2) Instances, read the data from the social media sites, store it with Amazon Elastic Block Store, and use AWS Data Pipeline to publish it to Amazon Kinesis for analytics.
- B. Deploy the new application component as an Elastic Beanstalk application, read the data from the social media sites, store it in Amazon DynamoDB, and use Apache Hive with Amazon Elastic MapReduce for analytics.
- C. Deploy the new application component in an Auto Scaling group of Amazon EC2 instances, read the data from the social media sites, store it in Amazon Glacier, and use AWS Data Pipeline to publish it to Amazon Redshift for analytics.
- D. Deploy the new application component as an Amazon Elastic Beanstalk application, read the data from the social media site, store it with Amazon Elastic Block Store, and use Amazon Kinesis to stream the data to Amazon CloudWatch for analytics.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 76
A web application is being actively developed by multiple development teams within your organization.
You have created a self-service portal-driven by AWS CloudFormation and the AWS APIs-that allows testers to select a code branch containing a new feature that they want to test.
The portal will then provision an environment and deploy the right branch of code to it.
Recently you have noticed that a large number of environments contain broken builds.
You want to introduce a set of automated browser tests that are executed on a new environment before the environment is available to the tester.
This way a tester does not waste time trying to test new features in a broken environment. Select a suitable way to implement such a feature into the existing self-service portal:

- A. Specify your automated tests in the "tests" section of the AWS CloudFormation template.
AWS CloudFormation will then execute the tests on your behalf as part of the environment build.
- B. Configure a centralized test server that hosts an automated browser testing framework.
Use an AWS CloudFormation custom resource to notify the centralized test server, via an Amazon SNS topic, that a new environment has been initialized.
The centralized test server can then execute the tests before sending the results back to the AWS CloudFormation service.
- C. Pass the test scripts to the cfn-init service via the "tests" section of the AWS::CloudFormation::Init metadata.
Cfn-init will then execute these tests and return the result to the AWS CloudFormation service. 
- D. Configure a centralized test server that hosts an automated browser testing framework.
Include an Amazon SES email resource under the outputs section of your AWS CloudFormation template.
This we send an email to your centralized test server, informing it that the environment is ready for tests.

<details><summary>Answer:</summary><p> B

</p></details><hr>

### QUESTION 77
You have written a server-side Node.Js application and a web application with an HTML/JavaScript front end that uses the Angular.js framework.
The server-side application connects to an Amazon Redshift cluster, issues queries, and then returns the results to the front end for display.
Your user base is very large and distributed, but it is important to keep the cost of running this application low.
Which deployment strategy is both technically valid and the most cost-effective?

- A. Deploy an AWS Elastic Beanstalk application with two environments: one for the Node.js application and another for the web front end.
Launch an Amazon Redshift cluster, and point your application to its Java Database Connectivity (JDBC) endpoint.
- B. Deploy an AWS OpsWorks stack with three layers: a static web server layer for your front end, a Node.js app server layer for your server-side application, and a Redshift DB layer for your Amazon Redshift duster.
- C. Upload the HTML, CSS, images, and JavaScript for the front end to an Amazon Simple Storage Service (S3) bucket.
Create an Amazon CloudFront distribution with this bucket as its origin. Use AWS Elastic Beanstalk to deploy the Node.js application.
Launch an Amazon Redshift cluster, and point your application to its JDBC endpoint.
- D. Upload the HTML, CSS, images, and JavaScript for the front end, plus the Node.js code for the
server-side application, to an Amazon S3 bucket.
Create a CloudFront distribution with this bucket as its origin.
Launch an Amazon Redshift cluster, and point your application to its JDBC endpoint.
- E. Upload the HTML, CSS, images, and JavaScript for the front end to an Amazon S3 bucket. Use AWS Elastic Beanstalk to deploy the Node.js application.
Launch an Amazon Redshift cluster, and point your application to its JDBC endpoint.

<details><summary>Answer:</summary><p> C

</p></details><hr>

### QUESTION 78 x
You are building an AWS CloudFormation template for a multi-tier web application.
The user data of your Linux web server resource contains a complex script that can take a long time to run.
Which techniques could you use to ensure that these servers are fully configured and running before attaching them to the load balancer? Choose 2 answers
  

- A. Launch your Linux servers from a nested stack that is called from within the load balancer resource in your AWS CloudFormation template.
- B. Add an AWS CloudFormation Wait Condition that depends on the web server resource. When the UserData script finishes on the web servers, use curl to send a signal the Wait Condition at http://169.254.169.254/waithandle/.
- C. Add an AWS CloudFormation wait Condition that depends on the web server resource.
When the UserData script finishes on the web servers, use curl to signal to the Wait Condition pre-signed URL that they are ready.
- D. In your AWS CloudFormation template, position the load balancer resource JSON block directly below your Linux server resource.
- E. Add an AWS CloudFormation Wait Condition that depends on the web server resource.
When the UserData script finishes on the web servers, use the command "cfn-signal" to signal that they are ready.

<details><summary>Answer:</summary><p> CE

</p></details><hr>

### QUESTION 79 x
Customers have recently been complaining that your web application has randomly stopped responding.
During a deep dive of your logs, the team has discovered a major bug in your new Java web application.
This bug is causing a memory leak that eventually causes the application to crash.
Your web application runs on Amazon EC2 and was built with AWS CloudFormation.
Which techniques should you use to help detect these problems faster, as well as help eliminate the server's unresponsiveness? Choose 2 answers

- A. Update your AWS CloudFormation configuration and enable a CustomResource that uses cfn- signal to detect memory leaks.
- B. Update your CloudWatch metric granularity config for all Amazon EC2 memory metrics to support five- second granularity.
Create a CloudWatch alarm that triggers an Amazon SNS notification to page your team when the application memory becomes too large.
- C. Update your AWS CloudFormation configuration to take advantage of Auto Scaling groups. Configure an Auto Scaling group policy to trigger off your custom CloudWatch metrics.
- D. Create a custom CloudWatch metric that you push your JVM memory usage to.
Create a Cloudwatch alarm that triggers an Amazon SNS notification to page your team when the application memory usage becomes too large.
- E. Update your AWS CloudFormation configuration to take advantage of CloudWatch metrics Agent. Configure the CloudWatch Metrics Agent to monitor memory usage and trigger an Amazon SNS alarm.

<details><summary>Answer:</summary><p> CD

</p></details><hr>

### QUESTION 80 x
You have an ASP.NET web application running in Amazon Elastic Beanstalk.
Your next version of the application requires a third-party Windows Installer package to be installed on the instance on first boot and before the application launches.
Which options are possible? Choose 2 answers

- A. In the application's Global.asax file, run msiexec.exe to install the package using Process.Start() in the Application Start event handler.
- B. In the source bundle's .ebextensions folder, create a file with a .config extension. In the file, under the "packages" section and "msi" package manager, include the package's URL. 
- C. Launch a new Amazon EC2 instance from the AMI used by the environment.
Log into the instance, install the package and run sysprep. Create a new AMI.
Configure the environment to use the new AMI.
- D. In the environment's configuration, edit the instances configuration and add the package's URL to
the "Packages" section.
- E. In the source bundle's .ebextensions folder, create a "Packages" folder.
Place the package in the folder.

<details><summary>Answer:</summary><p> BD

</p></details><hr>

### QUESTION 81 x
For AWS Auto Scaling, what is the first transition state an instance enters after leaving steady state when scaling in due to health check failure or decreased load?

- A. T erminating
- B. Detaching
- C. T erminating:W ait
- D. EnteringStandby

<details><summary>Answer:</summary><p> A

Explanation:

When Auto Scaling responds to a scale in event, it terminates one or more instances. These instances are detached from the Auto Scaling group and enter the Terminating state. 

http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html

</p></details><hr>

### QUESTION 82
You are hired as the new head of operations for a SaaS company. Your CTO has asked you to make debugging any part of your entire operation simpler and as fast as possible. She complains that she has no idea what is going on in the complex, service-oriented architecture, because the developers just log to disk, and it's very hard to find errors in logs on so many services. How can you best meet this requirement and satisfy your CTO?

- A. Copy all log files into AWS S3 using a cron job on each instance. Use an S3 Notification Configuration on the <code>PutBucket</code> event and publish events to AWS Lambda. Use the Lambda to analyze logs as soon as they come in and flag issues.
- B. Begin using CloudWatch Logs on every service. Stream all Log Groups into S3 objects. Use AWS EMR cluster jobs to perform ad-hoc MapReduce analysis and write new queries when needed.
- C. Copy all log files into AWS S3 using a cron job on each instance. Use an S3 Notification Configuration on the <code>PutBucket</code> event and publish events to AWS Kinesis. Use Apache Spark on AWS EMR to perform at-scale stream processing queries on the log chunks and flag issues.
- D. Begin using CloudWatch Logs on every service. Stream all Log Groups into an AWS Elasticsearch Service Domain running Kibana 4 and perform log analysis on a search cluster.

<details><summary>Answer:</summary><p> D

Explanation:

The Elasticsearch and Kibana 4 combination is called the ELK Stack, and is designed specifically for real-time, ad-hoc log analysis and aggregation. All other answers introduce extra delay or require pre-defined queries.
Amazon Elasticsearch Service is a managed service that makes it easy to deploy, operate, and scale Elasticsearch in the AWS Cloud. Elasticsearch is a popular open-source search and analytics engine for use cases such as log analytics, real-time application monitoring, and click stream analytics.

https://aws.amazon.com/elasticsearch-service/

</p></details><hr>

### QUESTION 83
When thinking of AWS Elastic Beanstalk's model, which is true?

- A. Applications have many deployments, deployments have many environments.
- B. Environments have many applications, applications have many deployments.
- C. Applications have many environments, environments have many deployments.
- D. Deployments have many environments, environments have many applications.

<details><summary>Answer:</summary><p> C

Explanation:

Applications group logical services. Environments belong to Applications, and typically represent different deployment levels (dev, stage, prod, fo forth). Deployments belong to environments, and are pushes of bundles of code for the environments to run. 

http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/Welcome.html

</p></details><hr>

### QUESTION 84
You work for a company that automatically tags photographs using artificial neural networks (ANNs), which run on GPUs using C++. You receive millions of images at a time, but only 3 times per day on average. These images are loaded into an AWS S3 bucket you control for you in a batch, and then the customer publishes a JSON-formatted manifest into another S3 bucket you control as well. Each image takes 10 milliseconds to process using a full GPU. Your neural network software requires 5 minutes to bootstrap. Image tags are JSON objects, and you must publish them to an S3 bucket. Which of these is the best system architectures for this system?

- A. Create an OpsWorks Stack with two Layers. The first contains lifecycle scripts for launching and bootstrapping an HTTP API on G2 instances for ANN image processing, and the second has an always-on instance which monitors the S3 manifest bucket for new files. When a new file is detected, request instances to boot on the ANN layer. When the instances are booted and the HTTP APIs are up, submit processing requests to individual instances.
- B. Make an S3 notification configuration which publishes to AWS Lambda on the manifest bucket. Make the Lambda create a CloudFormation Stack which contains the logic to construct an autoscaling worker tier of EC2 G2 instances with the ANN code on each instance. Create an SQS queue of the images in the manifest. Tear the stack down when the queue is empty.
- C. Deploy your ANN code to AWS Lambda as a bundled binary for the C++ extension. Make an S3 notification configuration on the manifest, which publishes to another AWS Lambda running controller code. This controller code publishes all the images in the manifest to AWS Kinesis. Your ANN code Lambda Function uses the Kinesis as an Event Source. The system automatically scales when the stream contains image events.
- D. Create an Auto Scaling, Load Balanced Elastic Beanstalk worker tier Application and Environment.
Deploy the ANN code to G2 instances in this tier. Set the desired capacity to 1. Make the code periodically check S3 for new manifests. When a new manifest is detected, push all of the images in the manifest into the SQS queue associated with the Elastic Beanstalk worker tier.

<details><summary>Answer:</summary><p> B

Explanation:

The Elastic Beanstalk option is incorrect because it requires a constantly-polling instance, which may break and costs money.
The Lambda fleet option is incorrect because AWS Lambda does not support GPU usage. The OpsWorks stack option both requires a constantly-polling instance, and also requires complex timing and capacity planning logic.
The CloudFormation option requires no polling, has no always-on instances, and allows arbitrarily fast processing by simply setting the instance count as high as needed. 

http://docs.aws.amazon.com/lambda/latest/dg/current-supported-versions.html

</p></details><hr>

### QUESTION 85
You are designing a system which needs, at minumum, 8 m4.large instances operating to service traffic. When designing a system for high availability in the us-east-1 region, which has 6 Availability Zones, you company needs to be able to handle death of a full availability zone. How should you distribute the servers, to save as much cost as possible, assuming all of the EC2 nodes are properly linked to an ELB?
Your VPC account can utilize us-east-1's AZ's a through f, inclusive.

- A. 3 servers in each of AZ's a through d, inclusive.
- B. 8 servers in each of AZ's a and b.
- C. 2 servers in each of AZ's a through e, inclusive.
- D. 4 servers in each of AZ's a through c, inclusive.

<details><summary>Answer:</summary><p> C

Explanation:

You need to design for N+1 redundancy on Availability Zones. ZONE_COUNT = (REQUIRED_INSTANCES / INSTANCE_COUNT_PER_ZONE) + 1. To minimize cost, spread the instances across as many possible zones as you can. By using a though e, you are allocating 5 zones. Using 2 instances, you have 10 total instances. If a single zone fails, you have 4 zones left, with 2 instances each, for a total of 8 instances. By spreading out as much as possible, you have increased cost by only 25% and significantly de-risked an availability zone failure. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability- zones.html#concepts-regions-availability-zones

</p></details><hr>

### QUESTION 86
You need to create a Route53 record automatically in CloudFormation when not running in production during all launches of a Template. How should you implement this?

- A. Use a <code>Parameter</code> for <code>environment</code>, and add a <code>Condition</code> on the Route53 <code>Resource</code> in the template to create the record only when <code>environment</code> is not <code>production</code>.
- B. Create two templates, one with the Route53 record value and one with a null value for the record. Use the one without it when deploying to production.
- C. Use a <code>Parameter</code> for <code>environment</code>, and add a <code>Condition</code> on the Route53 <code>Resource</code> in the template to create the record with a null string when <code>environment</code> is <code>production</code>.
- D. Create two templates, one with the Route53 record and one without it. Use the one without it when deploying to production.

<details><summary>Answer:</summary><p> A

Explanation:

The best way to do this is with one template, and a Condition on the resource. Route53 does not allow null strings for records. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/conditions-section-structure.html
  
</p></details><hr>

### QUESTION 87
What is web identity federation?

- A. Use of an identity provider like Google or Facebook to become an AWS IAM User.
- B. Use of an identity provider like Google or Facebook to exchange for temporary AWS security
credentials.
- C. Use of AWS IAM User tokens to log in as a Google or Facebook user.
- D. Use of AWS STS Tokens to log in as a Google or Facebook user.

<details><summary>Answer:</summary><p> B

Explanation:

... users of your app can sign in using a well-known identity provider (IdP) --such as Login with Amazon, Facebook, Google, or any other OpenID Connect (OIDC)-compatible IdP, receive an authentication token, and then exchange that token for temporary security credentials in AWS that map to an IAM role with permissions to use the resources in your AWS account. 

http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html

</p></details><hr>

### QUESTION 88
You have been asked to de-risk deployments at your company. Specifically, the CEO is concerned about outages that occur because of accidental inconsistencies between Staging and Production, which sometimes cause unexpected behaviors in Production even when Staging tests pass. You already use Docker to get high consistency between Staging and Production for the application environment on your EC2 instances. How do you further de-risk the rest of the execution environment, since in AWS, there are many service components you may use beyond EC2 virtual machines?

- A. Develop models of your entire cloud system in CloudFormation. Use this model in Staging and Production to achieve greater parity.
- B. Use AWS Config to force the Staging and Production stacks to have configuration parity. Any differences will be detected for you so you are aware of risks.
- C. Use AMIs to ensure the whole machine, including the kernel of the virual machines, is consistent, since Docker uses Linux Container (LXC) technology, and we need to make sure the container environment is consistent.
- D. Use AWS ECS and Docker clustering. This will make sure that the AMIs and machine sizes are the same across both environments.

<details><summary>Answer:</summary><p> A

Explanation:

Only CloudFormation's JSON Templates allow declarative version control of repeatably deployable models of entire AWS clouds. 

https://blogs.aws.amazon.com/application-management/blog/category/Best+practices

</p></details><hr>

### QUESTION 89 x
You are creating a new API for video game scores. Reads are 100 times more common than writes, and the top 1% of scores are read 100 times more frequently than the rest of the scores. What's the best design for this system, using DynamoDB?

- A. DynamoDB table with 100x higher read than write throughput, with CloudFront caching.
- B. DynamoDB table with roughly equal read and write throughput, with CloudFront caching.
- C. DynamoDB table with 100x higher read than write throughput, with ElastiCache caching.
- D. DynamoDB table with roughly equal read and write throughput, with ElastiCache caching.

<details><summary>Answer:</summary><p> D

Explanation:

Because the 100x read ratio is mostly driven by a small subset, with caching, only a roughly equal number of reads to writes will miss the cache, since the supermajority will hit the top 1% scores. Knowing we need to set the values roughly equal when using caching, we select AWS ElastiCache, because CloudFront cannot directly cache DynamoDB queries, and ElastiCache is an excellent in-memory cache for database queries, rather than a distributed proxy cache for content delivery. ... One solution would be to cache these reads at the application layer. Caching is a technique that is used in many high-throughput applications, offloading read activity on hot items to the cache rather than to the database. Your application can cache the most popular items in memory, or use a product such as ElastiCache to do the same. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GuidelinesForT ables.html# Guideli nesForTables.CachePopularItem

</p></details><hr>

### QUESTION 90 x
You were just hired as a DevOps Engineer for a startup. Your startup uses AWS for 100% of their infrastructure. They currently have no automation at all for deployment, and they have had many failures while trying to deploy to production. The company has told you deployment process risk mitigation is the most important thing now, and you have a lot of budget for tools and AWS resources.
Their stack:
```
2-tier API
Data stored in DynamoDB or S3, depending on type 
Compute layer is EC2 in Auto Scaling Groups 
They use Route53 for DNS pointing to an ELB
An ELB balances load across the EC2 instances
```

The scaling group properly varies between 4 and 12 EC2 servers. Which of the following approaches, given this company's stack and their priorities, best meets the company's needs?

- A. Model the stack in AWS Elastic Beanstalk as a single Application with multiple Environments. Use Elastic Beanstalk's Rolling Deploy option to progressively roll out application code changes when promoting across environments.
- B. Model the stack in 3 CloudFormation templates: Data layer, compute layer, and networking layer. Write stack deployment and integration testing automation following Blue-Green methodologies.
- C. Model the stack in AWS OpsWorks as a single Stack, with 1 compute layer and its associated ELB.
Use Chef and App Deployments to automate Rolling Deployment.
- D. Model the stack in 1 CloudFormation template, to ensure consistency and dependency graph
resolution. Write deployment and integration testing automation following Rolling Deployment methodologies.

<details><summary>Answer:</summary><p> B

Explanation:

AWS recommends Blue-Green for zero-downtime deploys. Since you use DynamoDB, and neither AWS OpsWorks nor AWS Elastic Beanstalk directly supports DynamoDB, the option selecting CloudFormation and Blue-Green is correct.
You use various strategies to migrate the traffic from your current application stack (blue) to a new version of the application (green). This is a popular technique for deploying applications with zero downtime. The deployment services like AWS Elastic Beanstalk, AWS CloudFormation, or AWS OpsWorks are particularly useful as they provide a simple way to clone your running application stack. You can set up a new version of your application (green) by simply cloning current version of the application (blue). 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 91
What is the scope of an EBS snapshot?

- A. Availability Zone
- B. Placement Group
- C. Region
- D. VPC

<details><summary>Answer:</summary><p> C

Explanation:

An EBS snapshot is tied to its region and can only be used to create volumes in the same region. You can copy a snapshot from one region to another. For more information, see Copying an Amazon EBS Snapshot.

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resources.html

</p></details><hr>

### QUESTION 92 x
Your system uses a multi-master, multi-region DynamoDB configuration spanning two regions to achieve high availablity. For the first time since launching your system, one of the AWS Regions in which you operate over went down for 3 hours, and the failover worked correctly. However, after recovery, your users are experiencing strange bugs, in which users on different sides of the globe see different data. What is a likely design issue that was not accounted for when launching?

- A. The system does not have Lambda Functor Repair Automatons, to perform table scans and chack for corrupted partition blocks inside the Table in the recovered Region.
- B. The system did not implement DynamoDB Table Defragmentation for restoring partition performance in the Region that experienced an outage, so data is served stale.
- C. The system did not include repair logic and request replay buffering logic for post-failure, to re- synchronize data to the Region that was unavailable for a number of hours.
- D. The system did not use DynamoDB Consistent Read requests, so the requests in different areas are not utilizing consensus across Regions at runtime.

<details><summary>Answer:</summary><p> C

Explanation:

When using multi-region DynamoDB systems, it is of paramount importance to make sure that all requests made to one Region are replicated to the other. Under normal operation, the system in question would correctly perform write replays into the other Region. If a whole Region went down, the system would be unable to perform these writes for the period of downtime. Without buffering write requests somehow, there would be no way for the system to replay dropped cross- region writes, and the requests would be serviced differently depending on the Region from which they were served after recovery. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.CrossRegionRepl.html

</p></details><hr>

### QUESTION 93
There are a number of ways to purchase compute capacity on AWS. Which orders the price per compute or memory unit from LOW to HIGH (cheapest to most expensive), on average?

- A. On-Demand B. Spot C. Reserved
- B. A,B,C 
- C. C,B,A 
- D. B,C,A 
- E. A,C,B

<details><summary>Answer:</summary><p> C

Explanation:

Spot instances are usually many, many times cheaper than on-demand prices. Reserved instances, depending on their term and utilization, can yield approximately 33% to 66% cost savings. On-Demand prices are the baseline price and are the most expensive way to purchase EC2 compute time.

https://d0.awsstatic.com/whitepapers/Cost_Optimization_with_AWS.pdf

</p></details><hr>

### QUESTION 94 x
You run operations for a company that processes digital wallet payments at a very high volume. One second of downtime, during which you drop payments or are otherwise unavailable, loses you on average USD 100. You balance the financials of the transaction system once per day. Which database setup is best suited to address this business risk?

- A. A multi-AZ RDS deployment with synchronous replication to multiple standbys and read-replicas for fast failover and ACID properties.
- B. A multi-region, multi-master, active-active RDS configuration using database-level ACID design principles with database trigger writes for replication.
- C. A multi-region, multi-master, active-active DynamoDB configuration using application control-level BASE design principles with change-stream write queue buffers for replication.
- D. A multi-AZ DynamoDB setup with changes streamed to S3 via AWS Kinesis, for highly durable storage and BASE properties.

<details><summary>Answer:</summary><p> C

Explanation:

Only the multi-master, multi-region DynamoDB answer makes sense. Multi-AZ deployments do not provide sufficient availability when a business loses USD 360,000 per hour of unavailability. As RDS does not natively support multi-region, and ACID does not perform well/at all over large distances between regions, only the DynamoDB answer works. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.CrossRegionRepl.html

</p></details><hr>

### QUESTION 95
When thinking of DynamoDB, what are true of Local Secondary Key properties?

- A. Either the partition key or the sort key can be different from the table, but not both.
- B. Only the sort key can be different from the table.
- C. The partition key and sort key can be different from the table.
- D. Only the partition key can be different from the table.

<details><summary>Answer:</summary><p> B

Explanation:

Global secondary index -- an index with a partition key and a sort key that can be different from those on the table. A global secondary index is considered "global" because queries on the index can span all of the data in a table, across all partitions. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/SecondaryIndexes.html
  
</p></details><hr>

### QUESTION 96
Which deployment method, when using AWS Auto Scaling Groups and Auto Scaling Launch Configurations, enables the shortest time to live for individual servers?

- A. Pre-baking AMIs with all code and configuration on deploys.
- B. Using a Dockerfile bootstrap on instance launch.
- C. Using UserData bootstrapping scripts.
- D. Using AWS EC2 Run Commands to dynamically SSH into fleets.

<details><summary>Answer:</summary><p> A

Explanation:

Note that the bootstrapping process can be slower if you have a complex application or multiple applications to install. Managing a fleet of applications with several build tools and dependencies can be a challenging task during rollouts. Furthermore, your deployment service should be designed to do faster rollouts to take advantage of Auto Scaling. Prebaking is a process of embedding a significant portion of your application artifacts within your base AMI. During the deployment process you can customize application installations by using EC2 instance artifacts such as instance tags, instance metadata, and Auto Scaling groups. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 97
Which of these techniques enables the fastest possible rollback times in the event of a failed deployment?

- A. Rolling; Immutable
- B. Rolling; Mutable
- C. Canary or A/B
- D. Blue-Green

<details><summary>Answer:</summary><p> D

Explanation:

AWS specifically recommends Blue-Green for super-fast, zero-downtime deploys - and thus rollbacks, which are redeploying old code.
You use various strategies to migrate the traffic from your current application stack (blue) to a new version of the application (green). This is a popular technique for deploying applications with zero downtime. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 98
Which of the following are not valid sources for OpsWorks custom cookbook repositories?

- A. HTTP(S)
- B. Git
- C. AWS EBS
- D. Subversion

<details><summary>Answer:</summary><p> C

Explanation:

Linux stacks can install custom cookbooks from any of the following repository types: HTTP or Amazon S3 archives. They can be either public or private, but Amazon S3 is typically the preferred option for a private archive. Git and Subversion repositories provide source control and the ability to have multiple versions. 

http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom-enable.html

</p></details><hr>

### QUESTION 99
You are building a deployment system on AWS. You will deploy new code by bootstrapping instances in a private subnet in a VPC at runtime using UserData scripts pointing to an S3 zip file object, where your code is stored. An ELB in a public subnet has network interfaces and connectivity to the instances. Requests from users of the system are routed to the ELB via a Route53 A Record Alias. You do not use any VPC endpoints. Which is a risk of using this approach?

- A. Route53 Alias records do not always update dynamically with ELB network changes after deploys.
- B. If the NAT routing for the private subnet fails, deployments fail.
- C. Kernel changes to the base AMI may render the code inoperable.
- D. The instances cannot be in a private subnet if the ELB is in a public one.

<details><summary>Answer:</summary><p> B

Explanation:

Since you are not using VPC endpoints, outbound requests for the code sitting in S3 are routed though the NAT for the VPC's private subnets. If this networking fails, runtime bootstrapping through code download will fail due to network unavailability and lack of access to the Internet, and thus Amazon S3. 

http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html

</p></details><hr>

### QUESTION 100
Which major database needs a BYO license?

- A. PostgreSQL 
- B. MariaDB
- C. MySQL
- D. Oracle

<details><summary>Answer:</summary><p> D

Explanation:

Oracle is not open source, and requires a bring your own license model. 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Oracle.html

</p></details><hr>

# AWS DevOps Engineer Professional - 2/3
Version: 18.122

### QUESTION 101 x
What is the maximum supported single-volume throughput on EBS?

- A. 320MiB/s 
- B. 160MiB/s 
- C. 40MiB/s 
- D. 640MiB/s

<details><summary>Answer:</summary><p> A

Explanation:

The ceiling throughput for PIOPS on EBS is 320MiB/s. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html
    
</p></details><hr>

### QUESTION 102
For AWS Auto Scaling, what is the first transition state a new instance enters after leaving steady state when scaling out due to increased load?

- A. EnteringStandby
- B. Pending
- C. T erminating:W ait
- D. Detaching

<details><summary>Answer:</summary><p> B

Explanation:

When a scale out event occurs, the Auto Scaling group launches the required number of EC2 instances, using its assigned launch configuration. These instances start in the Pending state.
If you add a lifecycle hook to your Auto Scaling group, you can perform a custom action here. For more information, see Lifecycle Hooks. 

http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html

</p></details><hr>

### QUESTION 103
When a user is detaching an EBS volume from a running instance and attaching it to a new instance, which of the below mentioned options should be followed to avoid file system damage?

- A. Unmount the volume first
- B. Stop all the I/O of the volume before processing
- C. Take a snapshot of the volume before detaching
- D. Force Detach the volume to ensure that all the data stays intact

<details><summary>Answer:</summary><p> A

Explanation:

When a user is trying to detach an EBS volume, the user can either terminate the instance or explicitly remove the volume. It is a recommended practice to unmount the volume first to avoid any file system damage.

</p></details><hr>

### QUESTION 104
A user is creating a new EBS volume from an existing snapshot.
The snapshot size shows 10 GB. Can the user create a volume of 30 GB from that snapshot?

- A. Provided the original volume has set the change size attribute to true
- B. Yes
- C. Provided the snapshot has the modify size attribute set as true
- D. No

<details><summary>Answer:</summary><p> B

Explanation:

A user can always create a new EBS volume of a higher size than the original snapshot size. The user cannot create a volume of a lower size. When the new volume is created the size in the instance will be shown as the original size. The user needs to change the size of the device with resize2fs or other OS specific commands.

</p></details><hr>

### QUESTION 105
    
How long are the messages kept on an SQS queue by default?

- A. If a message is not read, it is never deleted
- B. 2 weeks
- C. 1day
- D. 4 days

<details><summary>Answer:</summary><p> D

Explanation:

The SQS message retention period is configurable and can be set anywhere from 1 minute to 2 weeks. The default is 4 days and once the message retention limit is reached your messages will be automatically deleted. The option for longer message retention provides greater flexibility to allow for longer intervals between message production and consumption.

</p></details><hr>

### QUESTION 106
A user has attached an EBS volume to a running Linux instance as a "/dev/sdf" device. The user is unable to see the attached device when he runs the command "df -h". What is the possible reason for this?

- A. The volume is not in the same AZ of the instance
- B. The volume is not formatted
- C. The volume is not attached as a root device
- D. The volume is not mounted

<details><summary>Answer:</summary><p> D

Explanation:

When a user creates an EBS volume and attaches it as a device, it is required to mount the device. If the device/volume is not mounted it will not be available in the listing.

</p></details><hr>

### QUESTION 107
When using Amazon SQS how much data can you store in a message?

- A. 8KB 
- B. 2KB 
- C. 16KB 
- D. 4KB

<details><summary>Answer:</summary><p> A

Explanation:

With Amazon SQS version 2008-01-01, the maximum message size for both SOAP and Query requests is 8KB.
If you need to send messages to the queue that are larger than 8 KB, AWS recommends that you split the information into separate messages. Alternatively, you could use Amazon S3 or Amazon SimpleDB to hold the information and include the pointer to that information in the Amazon SQS message. If you send a message that is larger than 8KB to the queue, you will receive a MessageTooLong error with HTTP code 400.

</p></details><hr>

### QUESTION 108
What is the maximum time messages can be stored in SQS? 

- A. 14 days
- B. one month
- C. 4 days
- D. 7 days

<details><summary>Answer:</summary><p> A

Explanation:

A message can be stored in the Simple Queue Service (SQS) from 1 minute up to a maximum of 14 days.

</p></details><hr>

### QUESTION 109
In DynamoDB, a secondary index is a data structure that contains a subset of attributes from a table, along with an alternate key to support   operations.

- A. None of the above
- B. Both
- C. Query
- D. Scan

<details><summary>Answer:</summary><p> C

Explanation:

In DynamoDB, a secondary index is a data structure that contains a subset of attributes from a table, along with an alternate key to support Query operations.

</p></details><hr>

### QUESTION 110
A user has created a new EBS volume from an existing snapshot. The user mounts the volume on the instance to which it is attached. Which of the below mentioned options is a required step before the user can mount the volume?

- A. Run a cyclic check on the device for data consistency
- B. Create the file system of the volume
- C. Resize the volume as per the original snapshot size
- D. No step is required. The user can directly mount the device

<details><summary>Answer:</summary><p> D

Explanation:

When a user is trying to mount a blank EBS volume, it is required that the user first creates a file system within the volume. If the volume is created from an existing snapshot then the user needs not to create a file system on the volume as it will wipe out the existing data.

</p></details><hr>

### QUESTION 111 x
You need your CI to build AMIs with code pre-installed on the images on every new code push. You need to do this as cheaply as possible. How do you do this?

- A. Bid on spot instances just above the asking price as soon as new commits come in, perform all instance configuration and setup, then create an AMI based on the spot instance.
- B. Have the CI launch a new on-demand EC2 instance when new commits come in, perform all instance configuration and setup, then create an AMI based on the on-demand instance.
- C. Purchase a Light Utilization Reserved Instance to save money on the continuous integration
machine.
Use these credits whenever your create AMIs on instances.
      
- D. When the CI instance receives commits, attach a new EBS volume to the CI machine. Perform all setup on this EBS volume so you don't need a new EC2 instance to create the AMI.

<details><summary>Answer:</summary><p> A

Explanation:

Spot instances are the cheapest option, and you can use minimum run duration if your AMI takes more than a few minutes to create.
Spot instances are also available to run for a predefined duration - in hourly increments up to six hours in length - at a significant discount (30-45%) compared to On-Demand pricing plus an additional 5% during off-peak times1 for a total of up to 50% savings. 

https://aws.amazon.com/ec2/spot/pricing/

</p></details><hr>

### QUESTION 112
When thinking of DynamoDB, what are true of Global Secondary Key properties?

- A. The partition key and sort key can be different from the table.
- B. Only the partition key can be different from the table.
- C. Either the partition key or the sort key can be different from the table, but not both.
- D. Only the sort key can be different from the table.

<details><summary>Answer:</summary><p> A

Explanation:

Global secondary index -- an index with a partition key and a sort key that can be different from those on the table. A global secondary index is considered "global" because queries on the index can span all of the data in a table, across all partitions. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/SecondaryIndexes.html

</p></details><hr>

### QUESTION 113
You need to process long-running jobs once and only once. How might you do this?

- A. Use an SNS queue and set the visibility timeout to long enough for jobs to process.
- B. Use an SQS queue and set the reprocessing timeout to long enough for jobs to process.
- C. Use an SQS queue and set the visibility timeout to long enough for jobs to process.
- D. Use an SNS queue and set the reprocessing timeout to long enough for jobs to process.

<details><summary>Answer:</summary><p> C

Explanation:

The message timeout defines how long after a successful receive request SQS waits before allowing jobs to be seen by other components, and proper configuration prevents duplicate processing. 

http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/MessageLifecycle.html

</p></details><hr>

### QUESTION 114
You are getting a lot of empty receive requests when using Amazon SQS. This is making a lot of unnecessary network load on your instances.
What can you do to reduce this load?

- A. Subscribe your queue to an SNS topic instead.
- B. Use as long of a poll as possible, instead of short polls.
- C. Alter your visibility timeout to be shorter.
- D. Use <code>sqsd</code> on your EC2 instances.

<details><summary>Answer:</summary><p> B

Explanation:

One benefit of long polling with Amazon SQS is the reduction of the number of empty responses, when there are no messages available to return, in reply to a ReceiveMessage request sent to an Amazon SQS queue. Long polling allows the Amazon SQS service to wait until a message is available in the queue before sending a response. 

http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html

</p></details><hr>

### QUESTION 115
You need to know when you spend $1000 or more on AWS. What's the easy way for you to see that notification?

- A. AWS CloudWatch Events tied to API calls, when certain thresholds are exceeded, publish to SNS.
- B. Scrape the billing page periodically and pump into Kinesis.
- C. AWS CloudWatch Metrics + Billing Alarm + Lambda event subscription. When a threshold is
exceeded, email the manager.
- D. Scrape the billing page periodically and publish to SNS.

<details><summary>Answer:</summary><p> C

Explanation:

Even if you're careful to stay within the free tier, it's a good idea to create a billing alarm to notify you if you exceed the limits of the free tier. Billing alarms can help to protect you against unknowingly accruing charges if you inadvertently use a service outside of the free tier or if traffic exceeds your expectations. 

http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/free-tier-alarms.html

</p></details><hr>

### QUESTION 116
You need to grant a vendor access to your AWS account. They need to be able to read protected messages in a private S3 bucket at their leisure. They also use AWS. What is the best way to accomplish this?

- A. Create an IAM User with API Access Keys. Grant the User permissions to access the bucket. Give the vendor the AWS Access Key ID and AWS Secret Access Key for the User.
- B. Create an EC2 Instance Profile on your account. Grant the associated IAM role full access to the bucket. Start an EC2 instance with this Profile and give SSH access to the instance to the vendor.
- C. Create a cross-account IAM Role with permission to access the bucket, and grant permission to use the Role to the vendor AWS account.
- D. Generate a signed S3 PUT URL and a signed S3 PUT URL, both with wildcard values and 2 year durations. Pass the URLs to the vendor.

<details><summary>Answer:</summary><p> C

Explanation:

When third parties require access to your organization's AWS resources, you can use roles to delegate access to them. For example, a third party might provide a service for managing your AWS resources. With IAM roles, you can grant these third parties access to your AWS resources without sharing your AWS security credentials. Instead, the third party can access your AWS resources by assuming a role that you create in your AWS account. 

http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_common-scenarios_third-party.html
  
</p></details><hr>

### QUESTION 117
Your serverless architecture using AWS API Gateway, AWS Lambda, and AWS DynamoDB experienced a large increase in traffic to a sustained 400 requests per second, and dramatically increased in failure rates. Your requests, during normal operation, last 500 milliseconds on average. Your DynamoDB table did not exceed 50% of provisioned throughput, and Table primary keys are designed correctly. What is the most likely issue?

- A. Your API Gateway deployment is throttling your requests.
- B. Your AWS API Gateway Deployment is bottlenecking on request (de)serialization.
- C. You did not request a limit increase on concurrent Lambda function executions.
- D. You used Consistent Read requests on DynamoDB and are experiencing semaphore lock.

<details><summary>Answer:</summary><p> C

Explanation:

AWS API Gateway by default throttles at 500 requests per second steady-state, and 1000 requests per second at spike. Lambda, by default, throttles at 100 concurrent requests for safety. At 500 milliseconds (half of a second) per request, you can expect to support 200 requests per second at 100 concurrency. This is less than the 400 requests per second your system now requires. Make a limit increase request via the AWS Support Console.
AWS Lambda: Concurrent requests safety throttle per account -> 100 

http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_lambda

</p></details><hr>

### QUESTION 118
Why are more frequent snapshots or EBS Volumes faster?

- A. Blocks in EBS Volumes are allocated lazily, since while logically separated from other EBS Volumes, Volumes often share the same physical hardware. Snapshotting the first time forces full block range allocation, so the second snapshot doesn't need to perform the allocation phase and is faster.
- B. The snapshots are incremental so that only the blocks on the device that have changed after your last snapshot are saved in the new snapshot.
- C. AWS provisions more disk throughput for burst capacity during snapshots if the drive has been pre-warmed by snapshotting and reading all blocks.
- D. The drive is pre-warmed, so block access is more rapid for volumes when every block on the device has already been read at least one time.

<details><summary>Answer:</summary><p> B

Explanation:

After writing data to an EBS volume, you can periodically create a snapshot of the volume to use as a baseline for new volumes or for data backup. If you make periodic snapshots of a volume, the snapshots are incremental so that only the blocks on the device that have changed after your last snapshot are saved in the new snapshot. Even though snapshots are saved incrementally, the snapshot deletion process is designed so that you need to retain only the most recent snapshot in order to restore the volume. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-snapshot.html

</p></details><hr>

### QUESTION 119 x
For AWS CloudFormation, which stack state refuses UpdateStack calls? 

- A. <code>UPDATE_ROLLBACK_FAILED</code>
- B. <code>UPDATE_ROLLBACK_COMPLETE</code> 
- C. <code>UPDATE_COMPLETE</code>
- D. <code>CREATE_COMPLETE</code>

<details><summary>Answer:</summary><p> A

Explanation:

When a stack is in the UPDATE_ROLLBACK_FAILED state, you can continue rolling it back to return it to a working state (to UPDATE_ROLLBACK_COMPLETE). You cannot update a stack that is in the UPDATE_ROLLBACK_FAILED state. However, if you can continue to roll it back, you can return the stack to its original settings and try to update it again. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html

</p></details><hr>

### QUESTION 120
You need to migrate 10 million records in one hour into DynamoDB. All records are 1.5KB in size. The data is evenly distributed across the partition key. How many write capacity units should you provision during this batch load?

- A. 6667 
- B. 4166 
- C. 5556 
- D. 2778

<details><summary>Answer:</summary><p> C

Explanation:

You need 2 units to make a 1.5KB write, since you round up. You need 20 million total units to perform this load. You have 3600 seconds to do so. Divide and round up for 5556. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ProvisionedThroughput.html

</p></details><hr>

### QUESTION 121
Your CTO thinks your AWS account was hacked. What is the only way to know for certain if there was unauthorized access and what they did, assuming your hackers are very sophisticated AWS engineers and doing everything they can to cover their tracks?

- A. Use CloudTrail Log File Integrity Validation.
- B. Use AWS Config SNS Subscriptions and process events in real time.
- C. Use CloudTrail backed up to AWS S3 and Glacier.
- D. Use AWS Config Timeline forensics.

<details><summary>Answer:</summary><p> A

Explanation:

You must use CloudTrail Log File Validation (default or custom implementation), as any other tracking method is subject to forgery in the event of a full account compromise by sophisticated enough hackers. Validated log files are invaluable in security and forensic investigations.
For example, a validated log file enables you to assert positively that the log file itself has not changed, or that particular user credentials performed specific API activity. The CloudTrail log file integrity validation process also lets you know if a log file has been deleted or changed, or assert positively that no log files were delivered to your account during a given period of time. 

http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-log-file-validation-intro.html
  
</p></details><hr>

### QUESTION 122
Which of these is not a Pseudo Parameter in AWS CloudFormation?

- A. AWS::StackName
- B. AWS::AccountId
- C. AWS::StackArn
- D. AWS::NotificationARNs

<details><summary>Answer:</summary><p> C

Explanation:

This is the complete list of Pseudo Parameters: AWS::AccountId, AWS::NotificationARNs, AWS::NoValue, AWS::Region, AWS::StackId, AWS::StackName 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/pseudo-parameter-reference.html

</p></details><hr>

### QUESTION 123 x
What is the scope of an EBS volume?

- A. VPC
- B. Region
- C. Placement Group
- D. Availability Zone

<details><summary>Answer:</summary><p> D

Explanation:

An Amazon EBS volume is tied to its Availability Zone and can be attached only to instances in the same Availability Zone. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resources.html

</p></details><hr>

### QUESTION 124
You are experiencing performance issues writing to a DynamoDB table. Your system tracks high scores for video games on a marketplace. Your most popular game experiences all of the performance issues.
What is the most likely problem?

- A. DynamoDB's vector clock is out of sync, because of the rapid growth in request for the most popular game.
- B. You selected the Game ID or equivalent identifier as the primary partition key for the table.
- C. Users of the most popular video game each perform more read and write requests than average.
- D. You did not provision enough read or write throughput to the table.

<details><summary>Answer:</summary><p> B

Explanation:

The primary key selection dramatically affects performance consistency when reading or writing to DynamoDB. By selecting a key that is tied to the identity of the game, you forced DynamoDB to create a hotspot in the table partitions, and over-request against the primary key partition for the popular game. When it stores data, DynamoDB divides a table's items into multiple partitions, and distributes the data primarily based upon the partition key value. The provisioned throughput associated with a table is also divided evenly among the partitions, with no sharing of provisioned throughput across partitions.

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GuidelinesForTables.html#GuidelinesForTables.UniformWorkload
  
</p></details><hr>

### QUESTION 125
You meet once per month with your operations team to review the past month's data. During the meeting, you realize that 3 weeks ago, your monitoring system which pings over HTTP from outside AWS recorded a large spike in latency on your 3-tier web service API.
You use DynamoDB for the database layer, ELB, EBS, and EC2 for the business logic tier, and SQS, ELB, and EC2 for the presentation layer.
Which of the following techniques will NOT help you figure out what happened?

- A. Check your CloudTrail log history around the spike's time for any API calls that caused slowness.
- B. Review CloudWatch Metrics graphs to determine which component(s) slowed the system down.
- C. Review your ELB access logs in S3 to see if any ELBs in your system saw the latency.
- D. Analyze your logs to detect bursts in traffic at that time.

<details><summary>Answer:</summary><p> B

Explanation:

Metrics data are available for 2 weeks. If you want to store metrics data beyond that duration, you can retrieve it using our GetMetricStatistics API as well as a number of applications and tools offered by AWS partners.

https://aws.amazon.com/cloudwatch/faqs/

</p></details><hr>

### QUESTION 126 x
Which of these is not an intrinsic function in AWS CloudFormation?

- A. Fn::Split
- B. Fn::FindInMap 
- C. Fn::Select
- D. Fn::GetAZs

<details><summary>Answer:</summary><p> A

Explanation:

This is the complete list of Intrinsic Functions...: Fn::Base64, Fn::And, Fn::Equals, Fn::If, Fn::Not, Fn::Or,
Fn::FindInMap, Fn::GetAtt, Fn::GetAZs, Fn::Join, Fn::Select, Ref 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html

</p></details><hr>

### QUESTION 127 x
For AWS CloudFormation, which is true?

- A. Custom resources using SNS have a default timeout of 3 minutes.
- B. Custom resources using SNS do not need a <code>ServiceToken</code> property.
- C. Custom resources using Lambda and <code>Code.ZipFile</code> allow inline nodejs resource
composition.
- D. Custom resources using Lambda do not need a <code>ServiceToken</code>property

<details><summary>Answer:</summary><p> C

Explanation:

Code is a property of the AWS::Lambda::Function resource that enables to you specify the source code of an AWS Lambda (Lambda) function.
You can point to a file in an Amazon Simple Storage Service (Amazon S3) bucket or specify your
source code as inline text (for nodejs runtime environments only). 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html

</p></details><hr>

### QUESTION 128
Your API requires the ability to stay online during AWS regional failures. Your API does not store any state, it only aggregates data from other sources - you do not have a database. What is a simple but effective way to achieve this uptime goal?

- A. Use a CloudFront distribution to serve up your API. Even if the region your API is in goes down, the edge locations CloudFront uses will be fine.
- B. Use an ELB and a cross-zone ELB deployment to create redundancy across datacenters. Even if a region fails, the other AZ will stay online.
- C. Create a Route53 Weighted Round Robin record, and if one region goes down, have that region redirect to the other region.
- D. Create a Route53 Latency Based Routing Record with Failover and point it to two identical deployments of your stateless API in two different regions. Make sure both regions use Auto Scaling Groups behind ELBs.

<details><summary>Answer:</summary><p> D

Explanation:

Latency Based Records allow request distribution when all is well with both regions, and the Failover component enables fallbacks between regions. By adding in the ELB and ASG, your system in the surviving region can expand to meet 100% of demand instead of the original fraction, whenever failover occurs. 

http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html

</p></details><hr>

### QUESTION 129
You are designing an enterprise data storage system. Your data management software system requires mountable disks and a real filesystem, so you cannot use S3 for storage. You need persistence, so you will be using AWS EBS Volumes for your system. The system needs as low- cost storage as possible, and access is not frequent or high throughput, and is mostly sequential reads. Which is the most appropriate EBS Volume Type for this scenario?

- A. gp1
- B. io1
- C. standard 
- D. gp2

<details><summary>Answer:</summary><p> C

Explanation:

standard volumes, or Magnetic volumes, are best for: Cold workloads where data is infrequently accessed, or scenarios where the lowest storage cost is important. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html

</p></details><hr>

### QUESTION 130
You need to deploy an AWS stack in a repeatable manner across multiple environments. You have selected CloudFormation as the right tool to accomplish this, but have found that there is a resource type you need to create and model, but is unsupported by CloudFormation. How should you overcome this challenge?
  

- A. Use a CloudFormation Custom Resource Template by selecting an API call to proxy for create, update, and delete actions. CloudFormation will use the AWS SDK, CLI, or API method of your choosing as the state transition function for the resource type you are modeling.
- B. Submit a ticket to the AWS Forums. AWS extends CloudFormation Resource Types by releasing tooling to the AWS Labs organization on GitHub. Their response time is usually 1 day, and they complete requests within a week or two.
- C. Instead of depending on CloudFormation, use Chef, Puppet, or Ansible to author Heat templates, which are declarative stack resource definitions that operate over the OpenStack hypervisor and cloud environment.
- D. Create a CloudFormation Custom Resource Type by implementing create, update, and delete functionality, either by subscribing a Custom Resource Provider to an SNS topic, or by implementing the logic in AWS Lambda.

<details><summary>Answer:</summary><p> D

Explanation:

Custom resources provide a way for you to write custom provisioning logic in AWS CloudFormation template and have AWS CloudFormation run it during a stack operation, such as when you create, update or delete a stack. For more information, see Custom Resources. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html

</p></details><hr>

### QUESTION 131
You run a 2000-engineer organization. You are about to begin using AWS at a large scale for the first time. You want to integrate with your existing identity management system running on Microsoft Active Directory, because your organization is a power-user of Active Directory. How should you manage your AWS identities in the most simple manner?

- A. Use a large AWS Directory Service Simple AD.
- B. Use a large AWS Directory Service AD Connector.
- C. Use an Sync Domain running on AWS Directory Service.
- D. Use an AWS Directory Sync Domain running on AWS Lambda

<details><summary>Answer:</summary><p> B

Explanation:

You must use AD Connector as a power-user of Microsoft Active Directory. Simple AD only works with a subset of AD functionality. Sync Domains do not exist; they are made up answers. AD Connector is a directory gateway that allows you to proxy directory requests to your on-premises Microsoft Active Directory, without caching any information in the cloud. AD Connector comes in 2 sizes; small and large. A small AD Connector is designed for smaller organizations of up to 500 users. A large AD Connector is designed for larger organizations of up to 5,000 users. 

https://aws.amazon.com/directoryservice/details/

</p></details><hr>

### QUESTION 132
When thinking of AWS OpsWorks, which of the following is not an instance type you can allocate in a stack layer?

- A. 24/7 instances
- B. Spot instances
- C. Time-based instances 
- D. Load-based instances

<details><summary>Answer:</summary><p> B
   

Explanation:

AWS OpsWorks supports the following instance types, which are characterized by how they are started and stopped. 24/7 instances are started manually and run until you stop them.Time-based instances are run by AWS OpsWorks on a specified daily and weekly schedule. They allow your stack to automatically adjust the number of instances to accommodate predictable usage patterns. Load-based instances are automatically started and stopped by AWS OpsWorks, based on specified load metrics, such as CPU utilization. They allow your stack to automatically adjust the number of instances to accommodate variations in incoming traffic. Load-based instances are available only for Linux-based stacks. 

http://docs.aws.amazon.com/opsworks/latest/userguide/welcome.html

</p></details><hr>

### QUESTION 133
Which of these is not a CloudFormation Helper Script?

- A. cfn-signal
- B. cfn-hup
- C. cfn-request
- D. cfn-get-metadata

<details><summary>Answer:</summary><p> C

Explanation:

This is the complete list of CloudFormation Helper Scripts: cfn-init, cfn-signal, cfn-get-metadata, cfn-hup

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-helper-scripts-reference.html

</p></details><hr>

### QUESTION 134
Your team wants to begin practicing continuous delivery using CloudFormation, to enable automated builds and deploys of whole, versioned stacks or stack layers.
You have a 3-tier, mission-critical system.
Which of the following is NOT a best practice for using CloudFormation in a continuous delivery environment?

- A. Use the AWS CloudFormation <code>ValidateTemplate</code> call before publishing changes to AWS.
- B. Model your stack in one template, so you can leverage CloudFormation's state management and dependency resolution to propagate all changes.
- C. Use CloudFormation to create brand new infrastructure for all stateless resources on each push, and run integration tests on that set of infrastructure.
- D. Parametrize the template and use <code>Mappings</code> to ensure your template works in multiple Regions.

<details><summary>Answer:</summary><p> B

Explanation:

Putting all resources in one stack is a bad idea, since different tiers have different life cycles and frequencies of change. For additional guidance about organizing your stacks, you can use two common frameworks: a multi-layered architecture and service-oriented architecture (SOA). 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#organizingstacks

</p></details><hr>

### QUESTION 135 x
You need to replicate API calls across two systems in real time. What tool should you use as a
buffer and transport mechanism for API call events?

- A. AWS SQS
- B. AWS Lambda
- C. AWS Kinesis
- D. AWS SNS

<details><summary>Answer:</summary><p> C

Explanation:

AWS Kinesis is an event stream service. Streams can act as buffers and transport across systems for in-order programmatic events, making it ideal for replicating API calls across systems. A typical Amazon Kinesis Streams application reads data from an Amazon Kinesis stream as data records. These applications can use the Amazon Kinesis Client Library, and they can run on Amazon EC2 instances. The processed records can be sent to dashboards, used to generate alerts, dynamically change pricing and advertising strategies, or send data to a variety of other AWS services. For information about Streams features and pricing, see Amazon Kinesis Streams.

http://docs.aws.amazon.com/kinesis/latest/dev/introduction.html

</p></details><hr>

### QUESTION 136
You are building a Ruby on Rails application for internal, non-production use which uses MySQL as a database. You want developers without very much AWS experience to be able to deploy new code with a single command line push. You also want to set this up as simply as possible. Which tool is ideal for this setup?

- A. AWS CloudFormation
- B. AWS OpsWorks
- C. AWS ELB + EC2 with CLI Push
- D. AWS Elastic Beanstalk

<details><summary>Answer:</summary><p> D

Explanation:

Elastic Beanstalk's primary mode of operation exactly supports this use case out of the box. It is simpler than all the other options for this question.
With Elastic Beanstalk, you can quickly deploy and manage applications in the AWS cloud without worrying about the infrastructure that runs those applications. AWS Elastic Beanstalk reduces management complexity without restricting choice or control. You simply upload your application, and Elastic Beanstalk automatically handles the details of capacity provisioning, load balancing, scaling, and application health monitoring. 

http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/create_deploy_Ruby_rails.html

</p></details><hr>

### QUESTION 137
What is the scope of AWS IAM?

- A. Global
- B. Availability Zone
- C. Region
- D. Placement Group

<details><summary>Answer:</summary><p> A

Explanation:

IAM resources are all global; there is not regional constraint.
   
https://aws.amazon.com/iam/faqs/

</p></details><hr>

### QUESTION 138
You are building a mobile app for consumers to post cat pictures online.
You will be storing the images in AWS S3. You want to run the system very cheaply and simply. Which one of these options allows you to build a photo sharing application without needing to worry about scaling expensive uploads processes, authentication/authorization and so forth?

- A. Build the application out using AWS Cognito and web identity federation to allow users to log in using Facebook or Google Accounts. Once they are logged in, the secret token passed to that user is used to directly access resources on AWS, like AWS S3.
- B. Use JWT or SAML compliant systems to build authorization policies. Users log in with a username and password, and are given a token they can use indefinitely to make calls against the photo infrastructure.
- C. Use AWS API Gateway with a constantly rotating API Key to allow access from the client-side. Construct a custom build of the SDK and include S3 access in it.
- D. Create an AWS oAuth Service Domain ad grant public signup and access to the domain. During setup, add at least one major social media site as a trusted Identity Provider for users.

<details><summary>Answer:</summary><p> A

Explanation:

The short answer is that Amazon Cognito is a superset of the functionality provided by web identity federation. It supports the same providers, and you configure your app and authenticate with those providers in the same way. But Amazon Cognito includes a variety of additional features. For example, it enables your users to start using the app as a guest user and later sign in using one of the supported identity providers. 

https://blogs.aws.amazon.com/security/post/Tx3SYCORF5EKRC0/How-Does-Amazon-Cognito-Relate-to-Existing-Web-Identity-Federatio

</p></details><hr>

### QUESTION 139 x
Your CTO has asked you to make sure that you know what all users of your AWS account are doing to change resources at all times. She wants a report of who is doing what over time, reported to her once per week, for as broad a resource type group as possible. How should you do this?

- A. Create a global AWS CloudTrail Trail. Configure a script to aggregate the log data delivered to S3 once per week and deliver this to the CTO.
- B. Use CloudWatch Events Rules with an SNS topic subscribed to all AWS API calls. Subscribe the CTO to an email type delivery on this SNS Topic.
- C. Use AWS IAM credential reports to deliver a CSV of all uses of IAM User Tokens over time to the CTO.
- D. Use AWS Config with an SNS subscription on a Lambda, and insert these changes over time into a DynamoDB table. Generate reports based on the contents of this table.

<details><summary>Answer:</summary><p> A

Explanation:

This is the ideal use case for AWS CloudTrail.
CloudTrail provides visibility into user activity by recording API calls made on your account. CloudTrail records important information about each API call, including the name of the API, the identity of the caller, the time of the API call, the request parameters, and the response elements returned by the AWS service. This information helps you to track changes made to your AWS resources and to troubleshoot operational issues. CloudTrail makes it easier to ensure compliance with internal policies and regulatory standards.
  
https://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 140
What is the order of most-to-least rapidly-scaling (fastest to scale first)?
```
a) EC2 + ELB + Auto Scaling 
b) Lambda
c) RDS
```

- A. B,A,C 
- B. C,B,A 
- C. C,A,B 
- D. A,C,B

<details><summary>Answer:</summary><p> A

Explanation:

Lambda is designed to scale instantly. EC2 + ELB + Auto Scaling require single-digit minutes to scale out. RDS will take at least 15 minutes, and will apply OS patches or any other updates when applied.

https://aws.amazon.com/lambda/faqs/

</p></details><hr>

### QUESTION 141 x
Which is not a restriction on AWS EBS Snapshots?

- A. Snapshots which are shared cannot be used as a basis for other snapshots.
- B. You cannot share a snapshot containing an AWS Access Key ID or AWS Secret Access Key.
- C. You cannot share unencrypted snapshots.
- D. Snapshot restorations are restricted to the region in which the snapshots are created.

<details><summary>Answer:</summary><p> A

Explanation:

Snapshots shared with other users are usable in full by the recipient, including but limited to the ability to base modified volumes and snapshots. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html

</p></details><hr>

### QUESTION 142 x
You need to deploy a new application version to production. Because the deployment is high-risk, you need to roll the new version out to users over a number of hours, to make sure everything is working correctly. You need to be able to control the proportion of users seeing the new version of the application down to the percentage point.
You use ELB and EC2 with Auto Scaling Groups and custom AMIs with your code pre-installed assigned to Launch Configurations. There are no database-level changes during your deployment. You have been told you cannot spend too much money, so you must not increase the number of EC2 instances much at all during the deployment, but you also need to be able to switch back to the original version of code quickly if something goes wrong. What is the best way to meet these requirements?

- A. Create a second ELB, Auto Scaling Launch Configuration, and Auto Scaling Group using the Launch Configuration. Create AMIs with all code pre-installed. Assign the new AMI to the second Auto Scaling Launch Configuration. Use Route53 Weighted Round Robin Records to adjust the proportion of traffic hitting the two ELBs.
- B. Use the Blue-Green deployment method to enable the fastest possible rollback if needed. Create
a full second stack of instances and cut the DNS over to the new stack of instances, and change
the DNS back if a rollback is needed.
- C. Create AMIs with all code pre-installed. Assign the new AMI to the Auto Scaling Launch
Configuration, to replace the old one. Gradually terminate instances running the old code (launched with the old Launch Configuration) and allow the new AMIs to boot to adjust the traffic balance to the new code. On rollback, reverse the process by doing the same thing, but changing the AMI on the Launch Config back to the original code.
- D. Migrate to use AWS Elastic Beanstalk. Use the established and well-tested Rolling Deployment setting AWS provides on the new Application Environment, publishing a zip bundle of the new code and adjusting the wait period to spread the deployment over time. Re-deploy the old code bundle to rollback if needed.

<details><summary>Answer:</summary><p> A

Explanation:

Only Weighted Round Robin DNS Records and reverse proxies allow such fine-grained tuning of traffic splits. The Blue-Green option does not meet the requirement that we mitigate costs and keep overall EC2 fleet size consistent, so we must select the 2 ELB and ASG option with WRR DNS tuning. This method is called A/B deployment and/or Canary deployment. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 143
What is required to achieve gigabit network throughput on EC2?
You already selected cluster-compute, 10GB instances with enhanced networking, and your workload is already network-bound, but you are not seeing 10 gigabit speeds.

- A. Enable biplex networking on your servers, so packets are non-blocking in both directions and there's no switching overhead.
- B. Ensure the instances are in different VPCs so you don't saturate the Internet Gateway on any one VPC.
- C. Select PIOPS for your drives and mount several, so you can provision sufficient disk throughput.
- D. Use a placement group for your instances so the instances are physically near each other in the
same Availability Zone.

<details><summary>Answer:</summary><p> D

Explanation:

You are not guaranteed 10gigabit performance, except within a placement group. A placement group is a logical grouping of instances within a single Availability Zone. Using placement groups enables applications to participate in a low-latency, 10 Gbps network. Placement groups are recommended for applications that benefit from low network latency, high network throughput, or both.

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html

</p></details><hr>

### QUESTION 144 x
If I want CloudFormation stack status updates to show up in a continuous delivery system in as close to real time as possible, how should I achieve this?

- A. Use a long-poll on the Resources object in your CloudFormation stack and display those state changes in the UI for the system.
- B. Use a long-poll on the <code>ListStacks</code>API call for your CloudFormation stack and display those state changes in the UI for the system.
- C. Subscribe your continuous delivery system to an SNS topic that you also tell your CloudFormation stack to publish events into.
- D. Subscribe your continuous delivery system to an SQS queue that you also tell your CloudFormation stack to publish events into.

<details><summary>Answer:</summary><p> C

Explanation:

Use NotificationARNs.member.N when making a CreateStack call to push stack events into SNS in nearly real-time. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-monitor-stack.html

</p></details><hr>

### QUESTION 145 x
What does it mean if you have zero IOPS and a non-empty I/O queue for all EBS volumes attached to a running EC2 instance?

- A. The I/O queue is buffer flushing.
- B. Your EBS disk head(s) is/are seeking magnetic stripes.
- C. The EBS volume is unavailable.
- D. You need to re-mount the EBS volume in the OS.

<details><summary>Answer:</summary><p> C

Explanation:

This is the definition of Unavailable from the EC2 and EBS SLA. "Unavailable" and "Unavailability" mean... For Amazon EBS, when all of your attached volumes perform zero read write IO, with pending IO in the queue.

https://aws.amazon.com/ec2/sla/

</p></details><hr>

### QUESTION 146 x
From a compliance and security perspective, which of these statements is true?

- A. You do not ever need to rotate access keys for AWS IAM Users.
- B. You do not ever need to rotate access keys for AWS IAM Roles, nor AWS IAM Users.
- C. None of the other statements are true.
- D. You do not ever need to rotate access keys for AWS IAM Roles.

<details><summary>Answer:</summary><p> D

Explanation:

IAM Role Access Keys are auto-rotated by AWS on your behalf; you do not need to rotate them. The application is granted the permissions for the actions and resources that you've defined for the role through the security credentials associated with the role. These security credentials are temporary and we rotate them automatically. We make new credentials available at least five minutes prior to the expiration of the old credentials. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html

</p></details><hr>

### QUESTION 147
Which of these configuration or deployment practices is a security risk for RDS?

- A. Storing SQL function code in plaintext
- B. Non-Multi-AZ RDS instance
- C. Having RDS and EC2 instances exist in the same subnet
- D. RDS in a public subnet

<details><summary>Answer:</summary><p> D

Explanation:

Making RDS accessible to the public internet in a public subnet poses a security risk, by making your database directly addressable and spammable.
DB instances deployed within a VPC can be configured to be accessible from the Internet or from EC2 instances outside the VPC. If a VPC security group specifies a port access such as TCP port 22, you would not be able to access the DB instance because the firewall for the DB instance provides access only via the IP addresses specified by the DB security groups the instance is a member of and the port defined when the DB instance was created. 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.RDSSecurityGroups.html

</p></details><hr>

### QUESTION 148
Which of these is not a reason a Multi-AZ RDS instance will failover?

- A. An Availability Zone outage
- B. A manual failover of the DB instance was initiated using Reboot with failover
- C. To autoscale to a higher instance class
- D. The primary DB instance fails

<details><summary>Answer:</summary><p> C

Explanation:

The primary DB instance switches over automatically to the standby replica if any of the > following conditions occur: An Availability Zone outage, the primary DB instance fails, the DB instance's server type is changed, the operating system of the DB instance is, undergoing software patching, a manual failover of the DB instance was initiated using Reboot with failover 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html

</p></details><hr>

### QUESTION 149
You need to create an audit log of all changes to customer banking data. You use DynamoDB to store this customer banking data. It's important not to lose any information due to server failures. What is an elegant way to accomplish this?

- A. Use a DynamoDB StreamSpecification and stream all changes to AWS Lambda. Log the changes to AWS CloudWatch Logs, removing sensitive information before logging.
- B. Before writing to DynamoDB, do a pre-write acknoledgment to disk on the application server, removing sensitive information before logging. Periodically rotate these log files into S3.
- C. Use a DynamoDB StreamSpecification and periodically flush to an EC2 instance store, removing sensitive information before putting the objects. Periodically flush these batches to S3.
- D. Before writing to DynamoDB, do a pre-write acknoledgment to disk on the application server, removing sensitive information before logging. Periodically pipe these files into CloudWatch Logs.

<details><summary>Answer:</summary><p> A

Explanation:

All suggested periodic options are sensitive to server failure during or between periodic flushes. Streaming to Lambda and then logging to CloudWatch Logs will make the system resilient to instance and Availability Zone failures. 

http://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html

</p></details><hr>

### QUESTION 150
    
You need your API backed by DynamoDB to stay online during a total regional AWS failure. You can tolerate a couple minutes of lag or slowness during a large failure event, butthe system should recover with normal operation after those few minutes. What is a good approach?

- A. Set up DynamoDB cross-region replication in a master-standby configuration, with a single standby in another region. Create an Auto Scaling Group behind an ELB in each of the two regions DynamoDB is running in. Add a Route53 Latency DNS Record with DNS Failover, using the ELBs in the two regions as the resource records.
- B. Set up a DynamoDB Multi-Region table. Create an Auto Scaling Group behind an ELB in each of the two regions DynamoDB is running in. Add a Route53 Latency DNS Record with DNS Failover, using the ELBs in the two regions as the resource records.
- C. Set up a DynamoDB Multi-Region table. Create a cross-region ELB pointing to a cross- region Auto Scaling Group, and direct a Route53 Latency DNS Record with DNS Failover to the cross- region ELB.
- D. Set up DynamoDB cross-region replication in a master-standby configuration, with a single standby in another region. Create a cross-region ELB pointing to a cross-region Auto Scaling Group, and direct a Route53 Latency DNS Record with DNS Failover to the cross-region ELB.

<details><summary>Answer:</summary><p> A

Explanation:

There is no such thing as a cross-region ELB, nor such thing as a cross-region Auto Scaling Group, nor such thing as a DynamoDB Multi-Region Table. The only option that makes sense is the cross-regional replication version with two ELBs and ASGs with Route53 Failover and Latency DNS. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.CrossRegionRepl.html

</p></details><hr>

### QUESTION 151
You have an asynchronous processing application using an Auto Scaling Group and an SQS Queue. The Auto Scaling Group scales according to the depth of the job queue. The completion velocity of the jobs has gone down, the AutoScalingGroup size has maxed out, but the inbound job velocity did not increase.
What is a possible issue?

- A. Some of the new jobs coming in are malformed and unprocessable.
- B. The routing tables changed and none of the workers can process events anymore.
- C. Someone changed the IAM Role Policy on the instances in the worker group and
broke permissions to access the queue.
- D. The scaling metric is not functioning correctly.

<details><summary>Answer:</summary><p> A

Explanation:

The IAM Role must be fine, as if it were broken, NO jobs would be processed since the system would never be able to get any queue messages. The same reasoning applies to the routing table change. The scaling metric is fine, as instance count increased when the queue depth increased due to more messages entering than exiting. Thus, the only reasonable option is that some of the recent messages must be malformed and unprocessable. 

https://github.com/andrew-templeton/cloudacademy/blob/fca920b45234bbe99cc0e8efb9c65134884dd489/questions/null

</p></details><hr>

### QUESTION 152
Your company wants to understand where cost is coming from in the company's production AWS account.There are a number of applications and services running at any given time. Without
expending too much initial development time, how best can you give the business a good understanding of which applications cost the most per month to operate?
  

- A. Create an automation script which periodically creates AWS Support tickets requesting detailed intra-month information about your bill.
- B. Use custom CloudWatch Metrics in your system, and put a metric data point whenever cost is incurred.
- C. Use AWS Cost Allocation Tagging for all resources which support it. Use the Cost Explorer
to analyze costs throughout the month.
- D. Use the AWS Price API and constantly running resource inventory scripts to calculate total price based on multiplication of consumed resources over time.

<details><summary>Answer:</summary><p> C

Explanation:

Cost Allocation Tagging is a built-in feature of AWS, and when coupled with the Cost Explorer, provides a simple and robust way to track expenses.
You can also use tags to filter views in Cost Explorer. Note that before you can filter views
by tags in CostExplorer, you must have applied tags to your resources and activate them,
as described in the following sections. For more information about CostExplorer, see Analyzing Your Costs with Cost Explorer. 

http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html

</p></details><hr>

### QUESTION 153
There is a very serious outage at AWS. EC2 is not affected, but your EC2 instance deployment scripts stopped working in the region with the outage. What might be the issue?

- A. The AWS Console is down, so your CLI commands do not work.
- B. S3 is unavailable, so you can't create EBS volumes from a snapshot you use to deploy
new volumes.
- C. AWS turns off the <code>DeployCode</code> API call when there are major outages, to
protect from system floods.
- D. None of the other answers make sense. If EC2 is not affected, it must be some other issue.

<details><summary>Answer:</summary><p> B

Explanation:

S3 stores all snapshots. If S3 is unavailable, snapshots are unavailable. Amazon EC2 also uses Amazon S3 to store snapshots (backup copies) of the data volumes. You can use snapshots for recovering data quickly and reli a bly in case of application or system failures. You can also use snapshots as a base line to create multiple new data volumes, expand the size of an existing data volume,or move data volumes across multiple Availability Zones, thereby making your data usage highly scalable. For more information about using data volumes and snapshots, see Amazon Elastic Block Store. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonS3.html

</p></details><hr>

### QUESTION 154
Which of the following tools does not directly support AWS OpsWorks, for monitoring your stacks?

- A. AWS Config
- B. Amazon CloudWatch Metrics
- C. AWS CloudTrail
- D. Amazon CloudWatch Logs

<details><summary>Answer:</summary><p> A

Explanation:

You can monitor your stacks in the following ways: AWS OpsWorks uses Amazon CloudWatch to provide thirteen custom metrics with detailed monitoring for each instance in the stack; AWS OpsWorks integrates with AWS CloudTrail to log every AWS OpsWorks API call and store the data in an Amazon S3 bucket; You can use Amazon CloudWatch Logs to monitor your stack's system, application, and custom logs. 

http://docs.aws.amazon.com/opsworks/latest/userguide/monitoring.html
  
</p></details><hr>

### QUESTION 155
What is a circular dependency in AWS CloudFormation?

- A. When a Template references an earlier version of itself.
- B. When Nested Stacks depend on each other.
- C. When Resources form a DependOn loop.
- D. When a Template references a region, which references the original Template.

<details><summary>Answer:</summary><p> C

Explanation:

To resolve a dependency error, add a DependsOn attribute to resources that depend on other resources in your template. In some cases, you must explicitly declare dependencies so that AWS CloudFormation can create or delete resources in the correct order. For example, if you create an Elastic IP and a VPC with an Internet gateway in the same stack, the Elastic IP must depend on the Internet gateway attachment. For additional information, see DependsOn Attribute. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-dependence-error

</p></details><hr>

### QUESTION 156
You need to run a very large batch data processing job one time per day. The source data exists entirely in S3, and the output of the processing job should also be written to S3 when finished. If you need to version control this processing job and all setup and teardown logic for the system, what approach should you use?

- A. Model an AWS EMR job in AWS Elastic Beanstalk.
- B. Model an AWS EMR job in AWS CloudFormation.
- C. Model an AWS EMR job in AWS OpsWorks.
- D. Model an AWS EMR job in AWS CLI Composer.

<details><summary>Answer:</summary><p> B

Explanation:

To declaratively model build and destroy of a cluster, you need to use AWS CloudFormation. OpsWorks and Elastic Beanstalk cannot directly model EMR Clusters. The CLI is not declarative, and CLI Composer does not exist. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html

</p></details><hr>

### QUESTION 157
What is true of the way that encryption works with EBS?

- A. Snapshotting an encrypted volume makes an encrypted snapshot; restoring an encrypted
snapshot creates an encrypted volume when specified / requested.
- B. Snapshotting an encrypted volume makes an encrypted snapshot when specified / requested;
restoring an encrypted snapshot creates an encrypted volume when specified / requested.
- C. Snapshotting an encrypted volume makes an encrypted snapshot; restoring an encrypted
snapshot always creates an encrypted volume.
- D. Snapshotting an encrypted volume makes an encrypted snapshot when specified / requested;
restoring an encrypted snapshot always creates an encrypted volume.

<details><summary>Answer:</summary><p> C

Explanation:

Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always remain protected. For more information, see Amazon EBS Encryption.

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html

</p></details><hr>

### QUESTION 158
When thinking of AWS OpsWorks, which of the following is true?
    

- A. Stacks have many layers, layers have many instances.
- B. Instances have many stacks, stacks have many layers.
- C. Layers have many stacks, stacks have many instances.
- D. Layers have many instances, instances have many stacks.

<details><summary>Answer:</summary><p> A

Explanation:

The stack is the core AWS OpsWorks component. It is basically a container for AWS resources-- Amazon EC2 instances, Amazon RDS database instances, and so on--that have a common purpose and should be logically managed together. You define the stack's constituents by adding one or more layers. A layer represents a set of Amazon EC2 instances that serve a particular purpose, such as serving applications or hosting a database server. An instance represents a single computing resource, such as an Amazon EC2 instance. 

http://docs.aws.amazon.com/opsworks/latest/userguide/welcome.html

</p></details><hr>

### QUESTION 159
When thinking of AWS Elastic Beanstalk, which statement is true?

- A. Worker tiers pull jobs from SNS.
- B. Worker tiers pull jobs from HTTP.
- C. Worker tiers pull jobs from JSON.
- D. Worker tiers pull jobs from SQS.

<details><summary>Answer:</summary><p> D

Explanation:

Elastic Beanstalk installs a daemon on each Amazon EC2 instance in the Auto Scaling group to process Amazon SQS messages in the worker environment. The daemon pulls data off the Amazon SQS queue, inserts it into the message body of an HTTP POST request, and sends it to a user-configurable URL path on the local host. The content type for the message body within an HTTP POST request is application/json by default. 

http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features-managing-env-tiers.html

</p></details><hr>

### QUESTION 160 x
Your company needs to automate 3 layers of a large cloud deployment. You want to be able to track this deployment's evolution as it changes over time, and carefully control any alterations. What is a good way to automate a stack to meet these requirements?

- A. Use OpsWorks Stacks with three layers to model the layering in your stack.
- B. Use CloudFormation Nested Stack Templates, with three child stacks to represent the
three logical layers of your cloud.
- C. Use AWS Config to declare a configuration set that AWS should roll out to your cloud.
- D. Use Elastic Beanstalk Linked Applications, passing the important DNS entires between
layers using the metadata interface.

<details><summary>Answer:</summary><p> B

Explanation:

Only CloudFormation allows source controlled, declarative templates as the basis for stack automation. Nested Stacks help achieve clean separation of layers while simultaneously providing a method to control all layers at once when needed. 

https://blogs.aws.amazon.com/application-management/post/Tx1T9JYQOS8AB9I/Use-Nested-Stacks-to-Create-Reusable-Templates-and-Support-Role-Specialization

</p></details><hr>

### QUESTION 161 x
Your application's Auto Scaling Group scales up too quickly, too much, and stays scaled when traffic decreases.What should you do to fix this?

- A. Set a longer cooldown period on the Group, so the system stops overshooting the target capacity. The issue is that the scaling system doesn't allow enough time for new instances to begin servicin g requests before measuring aggregate load again.
- B. Calculate the bottleneck or constraint on the compute layer, then select that as the new metric, and set the metric thresholds to the bounding values that begin to affect response latency.
- C. Raise the CloudWatch Alarms threshold associated with your autoscaling group, so the scaling takes more of an increase in demand before beginning.
- D. Use larger instances instead of lots of smaller ones, so the Group stops scaling out so much and wasting resources as the OS level,since the OS uses a higher proportion of resources on smaller instances.

<details><summary>Answer:</summary><p> B

Explanation:

Systems will always over-scale unless you choose the metric that runs out first and becomes constrained first. You also need to set the thresholds of the metric based on whether or not latency is affected by the change,to justify adding capacity instead of wasting money. 

http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/policy_creating.html

</p></details><hr>

### QUESTION 162
You need the absolute highest possible network performance for a cluster computing application. You already selected homogeneous instance types supporting 10 gigabit enhanced networking, made sure that your work load was network bound, and put the instances in a placement group. What is the last optimization you can make?

- A. Use 9001 MTU instead of 1500 for Jumbo Frames, to raise packet body to packet overhead ratios.
- B. Segregate the instances into different peered VPCs while keeping them all in a placement group, so each one has its own Internet Gateway.
- C. Bake an AMI for the instances and relaunch, so the instances are fresh in the placement group and do not have noisy neighbors.
- D. Turn off SYN/ACK on your TCP stack or begin using UDP for higher throughput. 

<details><summary>Answer:</summary><p> A

Explanation:

For instances that are collocated inside a placement group, jumbo frames help to achieve the maximum network throughput possible, and they are recommended in this case.
For more information, see Placement Groups. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/network_mtu.html#jumbo_frame_instances

</p></details><hr>

### QUESTION 163
Your CTO is very worried about the security of your AWS account. How best can you prevent hackers from completely hijacking your account?

- A. Use short but complex password on the root account and any administrators.
- B. Use AWS IAM Geo-Lock and disallow anyone from logging in except for in your city.
- C. Use MFA on all users and accounts, especially on the root account.
- D. Don't write down or remember the root account password after creating the AWS account.

<details><summary>Answer:</summary><p> C

Explanation:

For increased security, we recommend that you configure multi-factor authentication (MFA) to help protect your AWS resources. MFA adds extra security because it requires users to enter a unique authentication code from an approved authentication device or SMS text message when they access AWS websites or services. 

http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa.html

</p></details><hr>

### QUESTION 164
If you're trying to configure an AWS Elastic Beanstalk worker tier for easy debugging if there are problems finishing queue jobs, what should you configure?

- A. Configure Rolling Deployments.
- B. Configure Enhanced Health Reporting
- C. Configure Blue-Green Deployments.
- D. Configure a Dead Letter Queue

<details><summary>Answer:</summary><p> D

Explanation:

Elastic Beanstalk worker environments support Amazon Simple Queue Service (SQS) dead letter queues. A dead letter queue is a queue where other (source) queues can send messages that for some reason could not be successfully processed. A primary benefit of using a dead letter queue is the ability to sideline and isolate the unsuccessfully processed messages. You can then analyze any messages sent to the dead letter queue to try to determine why they were not successfully processed. 

http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features-managing-env-tiers.html#worker-deadletter

</p></details><hr>

### QUESTION 165 x
You have a high security requirement for your AWS accounts. What is the most rapid and
sophisticated setup you can use to react to AWS API calls to your account?

- A. Subscription to AWS Config via an SNS Topic. Use a Lambda Function to perform in-
flight analysis and reactivity to changes as they occur.
- B. Global AWS CloudTrail setup delivering to S3 with an SNS subscription to the deliver
notifications, pushing into a Lambda, which inserts records into an ELK stack for
analysis.
- C. Use a CloudWatch Rule ScheduleExpression to periodically analyze IAM credential logs.
Push the deltas for events into an ELK stack and perform ad-hoc analysis there.
- D. CloudWatch Events Rules which trigger based on all AWS API calls, submitting all events to an AWS Kinesis Stream for arbitrary down stream analysis. 

<details><summary>Answer:</summary><p> D

Explanation:

CloudWatch Events allow subscription to AWS API calls, and direction of these events into Kinesis Streams. This allows a unified, near real-time stream for all API calls, which can be analyzed with any tool(s) of your choosing downstream. 

http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/EventTypes.html#api_event_type

</p></details><hr>

### QUESTION 166
What method should I use to author automation if I want to wait for a CloudFormation stack to finish completing in a script?

- A. Event subscription using SQS.
- B. Event subscription using SNS.
- C. Poll using <code>ListStacks</code> / <code>list-stacks</code>.
- D. Poll using <code>GetStackStatus</code> / <code>get-stack-status</code>.

<details><summary>Answer:</summary><p> C

Explanation:

Event driven systems are good for IFTTT logic, but only polling will make a script wait to complete. ListStacks / list-stacks is a real method, GetStackStatus / get-stack-status is not. 

http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-stacks.html

</p></details><hr>

### QUESTION 167
Your application consists of 10% writes and 90% reads. You currently service all requests through a Route53 Alias Record directed towards an AWS ELB, which sits in front of an EC2 Auto Scaling Group. Your system is getting very expensive when there are large traffic spikes during certain news events, during which many more people request to read similar data all at the sametime.What is the simplest and cheapest way to reduce costs and scale with spikes like this?

- A. Create an S3 bucket and asynchronously replicate common requests responses into S3 objects. When are quest comes in for a precomputed response,redirecttoAWSS3.
- B. Create another ELB and Auto Scaling Group layer mounted on top of the other system, addinga tiertothesystem.Serve most read requests out of the top layer.
- C. Create a CloudFront Distribution and direct Route53 to the Distribution.
Use the ELB as an Origin and specify Cache Behaviours to proxy cache requests which can be servedlate.
- D. Create a Memcached cluster in AWS ElastiCache. Create cache logic to serve requests which can be served late from the in-memory cache for increased performance.

<details><summary>Answer:</summary><p> C

Explanation:

CloudFront is ideal for scenarios in which entire requests can be served out of a cache and usage patterns involve heavy reads and spikiness in demand.
A cache behavior is the set of rules you configure for a given URL pattern based on file extensions, file names, or any portion of a URL path on your website (e.g., \*.jpg). You can configure multiple cache behaviors for your web distribution. Amazon CloudFront will match incoming viewer requests with your list of URL patterns, and if there is a match, the service will honor the cache behavior you configure for that URL pattern. Each cache behavior can include the following Amazon CloudFront configuration values:
origin server name, viewer connection protocol, minimum expiration period, query string parameters, cookies, and trusted signers for private content. 

https://aws.amazon.com/cloudfront/dynamic-content/

</p></details><hr>

### QUESTION 168
You need to perform ad-hoc business analytics queries on well-structured data. Data comes in constantly at a high velocity. Your business intelligence team can understand SQL. What AWS service(s) should you look to first?

- A. Kinesis Firehose + RDS
- B. Kinesis Firehose + RedShift
- C. EMR using Hive
- D. EMR running Apache Spark

<details><summary>Answer:</summary><p> B

Explanation:

Kinesis Firehose provides a managed service for aggregating streaming data and inserting it into RedShift. RedShift also supports ad-hoc queries over well-structured data using a SQL-compliant wire protocol, so the business team should be able to adopt this system easily. 

https://aws.amazon.com/kinesis/firehose/details/

</p></details><hr>

### QUESTION 169
You are building a game high score table in DynamoDB. You will store each user's highest score for each game, with many games, all of which have relatively similar usage levels and numbers of players. You need to be able to look up the highest score for any game. What's the best DynamoDB key structure?

- A. HighestScore as the hash / only key.
- B. GameID as the hash key, HighestScore as the range key.
- C. GameID as the hash / only key.
- D. GameID as the range / only key.

<details><summary>Answer:</summary><p> B

Explanation:

Since access and storage for games is uniform, and you need to have ordering within each game for the scores (to access the highest value), your hash (partition) key should be the GameID, and there should be a range key for HighestScore. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GuidelinesForTables.html#GuidelinesForTables.Partitions

</p></details><hr>

### QUESTION 170
What is server immutability?
    

- A. Not updating a server after creation.
- B. The ability to change server counts.
- C. Updating a server after creation.
- D. The inability to change server counts.

<details><summary>Answer:</summary><p> A

Explanation:

... disposable upgrades offer a simpler way to know if your application has unknown dependencies. The underlying EC2 instance usage is considered temporary or ephemeral in nature for the period of deployment until the current release is active. During the new release, a new set of EC2 instances are rolled out by terminating older instances. This type of upgrade technique is more common in an immutable infrastructure. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 171
You run a clustered NoSQL database on AWS EC2 using AWS EBS. You need to reduce latency for database response times. Performance is the most important concern, not availability. You did not perform the initial setup, someone without much AWS knowledge did, so you are not sure if they configured everything optimally. Which of the following is NOT likely to be an issue contributing to increased latency?

- A. The EC2 instances are not EBS Optimized.
- B. The database and requesting system are both in the wrong Availability Zone.
- C. The EBS Volumes are not using PIOPS.
- D. The database is not running in a placement group.

<details><summary>Answer:</summary><p> B

Explanation:

For the highest possible performance, all instances in a clustered database like this one should be in a single Availability Zone in a placement group, using EBS optimized instances, and using PIOPS SSD EBS Volumes. The particular Availability Zone the system is running in should not be important, as long as it is the same as the requesting resources. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html

</p></details><hr>

### QUESTION 172
Fill the blanks:______helps us track AWS API calls and transitions, ______helps to
understand what resources we have now, and ______allows auditing credentials and logins.

- A. AWS Config, CloudTrail, IAM Credential Reports
- B. CloudTrail, IAM Credential Reports, AWS Config
- C. CloudTrail, AWS Config, IAM Credential Reports
- D. AWS Config, IAM Credential Reports, CloudTrail

<details><summary>Answer:</summary><p> C

Explanation:

You can use AWS CloudTrail to get a history of AWS API calls and related events for your account. This includes calls made by using the AWS Management Console, AWS SDKs, command line tools, and higher-level AWS services. 

http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html
  
</p></details><hr>

### QUESTION 173
You are creating an application which stores extremely sensitive financial information. All information in the system must be encrypted at rest and in transit. Which of these is a violation of this policy?

- A. ELB SSL termination.
- B. ELB Using Proxy Protocol v1.
- C. CloudFront Viewer Protocol Policy set to HTTPS redirection.
- D. Telling S3 to use AES256 on the server-side.

<details><summary>Answer:</summary><p> A

Explanation:

Terminating SSL terminates the security of a connection over HTTP, removing the S for "Secure" in HTTPS. This violates the "encryption in transit" requirement in the scenario. 

http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html

</p></details><hr>

### QUESTION 174
You need to scale an RDS deployment. You are operating at 10% writes and 90% reads, based on your logging. How best can you scale this in a simple way?

- A. Create a second master RDS instance and peer the RDS groups.
- B. Cache all the database responses on the read side with CloudFront.
- C. Create read replicas for RDS since the load is mostly reads.
- D. Create a Multi-AZ RDS installs and route read traffic to standby.

<details><summary>Answer:</summary><p> C

Explanation:

The high-availability feature is not a scaling solution for read-only scenarios; you cannot use a standby replica to serve read traffic. To service read-only traffic, you should use a Read Replica. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas. 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html

</p></details><hr>

### QUESTION 175
When thinking of AWS Elastic Beanstalk, the 'Swap Environment URLs' feature most directly aids in what?

- A. Immutable Rolling Deployments
- B. Mutable Rolling Deployments
- C. Canary Deployments
- D. Blue-Green Deployments

<details><summary>Answer:</summary><p> D

Explanation:

Simply upload the new version of your application and let your deployment service (AWS Elastic Beanstalk, AWS CloudFormation, or AWS OpsWorks) deploy a new version (green). To cut over to the new version, you simply replace the ELB URLs in your DNS records. Elastic Beanstalk has a Swap Environment URLs feature to facilitate a simpler cutover process. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 176 x
You need to create a simple, holistic check for your system's general availablity and uptime. Your system presents itself as an HTTP-speaking API. What is the most simple tool on AWS to achieve this with?

- A. Route53 Health Checks
- B. CloudWatch Health Checks
- C. AWS ELB Health Checks
- D. EC2 Health Checks

<details><summary>Answer:</summary><p> A

Explanation:

You can create a health check that will run into perpetuity using Route53, in one API call, which will ping your service via HTTP every 10 or 30 seconds.
Amazon Route 53 must be able to establish a TCP connection with the endpoint within four seconds. In addition, the endpoint must respond with an HTTP status code of 200 or greater and less than 400 within two seconds after connecting. 

http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html

</p></details><hr>

### QUESTION 177
What is the scope of an EC2 security group?

- A. Availability Zone
- B. Placement Group
- C. Region
- D. VPC

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 178
You run accounting software in the AWS cloud. This software needs to be online continuously during the day every day of the week, and has a very static requirement for compute resources. You also have other, unrelated batch jobs that need to run once per day at any time of your choosing. How should you minimize cost?

- A. Purchase a Heavy Utilization Reserved Instance to run the accounting software. Turn it off after hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also
applied to the batch jobs.
- B. Purchase a Medium Utilization Reserved Instance to run the accounting software. Turn it off after
hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also applied to the batch jobs.
- C. Purchase a Light Utilization Reserved Instance to run the accounting software. Turn it off after hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also
applied to the batch jobs.
- D. Purchase a Full Utilization Reserved Instance to run the accounting software. Turn it off after
hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also applied to the batch jobs.

<details><summary>Answer:</summary><p> A
    

Explanation:

Because the instance will always be online during the day, in a predictable manner, and there are a sequence of batch jobs to perform at any time, we should run the batch jobs when the account software is off. We can achieve Heavy Utilization by alternating these times, so we should purchase the reservation as such, as this represents the lowest cost. There is no such thing a "Full" level utilization purchases on EC2. 

Have to check this [Additional Reserved Instance Options for Amazon EC2](https://amazonaws-china.com/blogs/aws/reserved-instance-options-for-amazon-ec2/)
https://d0.awsstatic.com/whitepapers/Cost_Optimization_with_AWS.pdf

</p></details><hr>

### QUESTION 179
Which EBS volume type is best for high performance NoSQL cluster deployments?

- A. io1
- B. gp1
- C. standard 
- D. gp2

<details><summary>Answer:</summary><p> A

Explanation:

io1 volumes, or Provisioned IOPS (PIOPS) SSDs, are best for: Critical business applications that require sustained IOPS performance, or more than 10,000 IOPS or 160 MiB/s of throughput per volume, like large database workloads, such as MongoDB. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html

</p></details><hr>

### QUESTION 180
You are building out a layer in a software stack on AWS that needs to be able to scale out to react to increased demand as fast as possible. You are running the code on EC2 instances in an Auto Scaling Group behind an ELB. Which application code deployment method should you use?

- A. SSH into new instances that come online, and deploy new code onto the system by pulling it from an S3 bucket, which is populated by code that you refresh from source control on new pushes.
- B. Bake an AMI when deploying new versions of code, and use that AMI for the Auto Scaling Launch Configuration.
- C. Create a Dockerfile when preparing to deploy a new version to production and publish it to S3. Use UserData in the Auto Scaling Launch configuration to pull down the Dockerfile from S3 and run it when new instances launch.
- D. Create a new Auto Scaling Launch Configuration with UserData scripts configured to pull the latest code at all times.

<details><summary>Answer:</summary><p> B

Explanation:

... the bootstrapping process can be slower if you have a complex application or multiple applications to install. Managing a fleet of applications with several build tools and dependencies can be a challenging task during rollouts. Furthermore, your deployment service should be designed to do faster rollouts to take advantage of Auto Scaling. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 181
You need to perform ad-hoc analysis on log data, including searching quickly for specific error codes and reference numbers. Which should you evaluate first?

- A. AWS Elasticsearch Service
- B. AWS RedShift
- C. AWS EMR
- D. AWS DynamoDB

<details><summary>Answer:</summary><p> A

Explanation:

Amazon Elasticsearch Service (Amazon ES) is a managed service that makes it easy to deploy, operate, and scale Elasticsearch clusters in the AWS cloud. Elasticsearch is a popular open- source search and analytics engine for use cases such as log analytics, real-time application monitoring, and click stream analytics. 

http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/what-is-amazon-elasticsearch-service.html

</p></details><hr>

### QUESTION 182 x
Which status represents a failure state in AWS CloudFormation?

- A. <code>UPDATE_COMPLETE_CLEANUP_IN_PROGRESS</code> 
- B. <code>DELETE_COMPLETE_WITH_ARTIFACTS</code>
- C. <code>ROLLBACK_IN_PROGRESS</code>
- D. <code>ROLLBACK_FAILED</code>

<details><summary>Answer:</summary><p> C

Explanation:

ROLLBACK_IN_PROGRESS means an UpdateStack operation failed and the stack is in the process of trying to return to the valid, pre-update state. UPDATE_COMPLETE_CLEANUP_IN_PROGRESS means an update was successful, and CloudFormation is deleting any replaced, no longer used resources. ROLLBACK_FAILED is not a CloudFormation state (but UPDATE_ROLLBACK_FAILED is). DELETE_COMPLETE_WITH_ARTIFACTS does not exist at all. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html

</p></details><hr>

### QUESTION 183
What is the scope of an EC2 EIP?

- A. Placement Group
- B. Availability Zone
- C. Region
- D. VPC

<details><summary>Answer:</summary><p> C

Explanation:

An Elastic IP address is tied to a region and can be associated only with an instance in the same region.

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resources.html

</p></details><hr>

### QUESTION 184 x
For AWS Auto Scaling, what is the first transition state an existing instance enters after leaving steady state in Standby mode?

- A. Detaching
- B. T erminating:W ait
- C. Pending
- D. EnteringStandby

<details><summary>Answer:</summary><p> C

Explanation:

You can put any instance that is in an InService state into a Standby state. This enables you to remove the instance from service, troubleshoot or make changes to it, and then put it back into service. Instances in a Standby state continue to be managed by the Auto Scaling group. However, they are not an active part of your application until you put them back into service. 

http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html

</p></details><hr>

### QUESTION 185 *
You want to pass queue messages that are 1GB each. How should you achieve this?

- A. Use Kinesis as a buffer stream for message bodies. Store the checkpoint id for the placement in the Kinesis Stream in SQS.
- B. Use the Amazon SQS Extended Client Library for Java and Amazon S3 as a storage mechanism for message bodies.
- C. Use SQS's support for message partitioning and multi-part uploads on Amazon S3.
- D. Use AWS EFS as a shared pool storage medium. Store filesystem pointers to the files on disk in
the SQS message bodies.

<details><summary>Answer:</summary><p> B

Explanation:

You can manage Amazon SQS messages with Amazon S3. This is especially useful for storing and retrieving messages with a message size of up to 2 GB. To manage Amazon SQS messages with Amazon S3, use the Amazon SQS Extended Client Library for Java. 

http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/s3-messages.html

</p></details><hr>

### QUESTION 186 x
You are designing a service that aggregates clickstream data in batch and delivers reports to subscribers via email only once per week. Data is extremely spikey, geographically distributed, high-scale, and unpredictable. How should you design this system?

- A. Use a large RedShift cluster to perform the analysis, and a fleet of Lambdas to perform record inserts into the RedShift tables. Lambda will scale rapidly enough for the traffic spikes.
- B. Use a CloudFront distribution with access log delivery to S3. Clicks should be recorded as querystring GETs to the distribution. Reports are built and sent by periodically running EMR jobs over the access logs in S3.
- C. Use API Gateway invoking Lambdas which PutRecords into Kinesis, and EMR running Spark performing GetRecords on Kinesis to scale with spikes. Spark on EMR outputs the analysis to S3, which are sent out via email.
- D. Use AWS Elasticsearch service and EC2 Auto Scaling groups. The Autoscaling groups scale based on click throughput and stream into the Elasticsearch domain, which is also scalable. Use Kibana to generate reports periodically.

<details><summary>Answer:</summary><p> B

Explanation:

Because you only need to batch analyze, anything using streaming is a waste of money. CloudFront is a Gigabit-Scale HTTP(S) global request distribution service, so it can handle scale,
geo-spread, spikes, and unpredictability. The Access Logs will contain the GET data and work just fine for batch analysis and email using EMR.
Can I use Amazon CloudFront if I expect usage peaks higher than 10 Gbps or 15,000 RPS? Yes. Complete our request for higher limits here, and we will add more capacity to your account within two business days.

https://aws.amazon.com/cloudfront/faqs/

</p></details><hr>

### QUESTION 187
Your system automatically provisions EIPs to EC2 instances in a VPC on boot. The system provisions the whole VPC and stack at once. You have two of them per VPC. On your new AWS account, your attempt to create a Development environment failed, after successfully creating Staging and Production environments in the same region. What happened?

- A. You didn't choose the Development version of the AMI you are using.
- B. You didn't set the Development flag to true when deploying EC2 instances.
- C. You hit the soft limit of 5 EIPs per region and requested a 6th.
- D. You hit the soft limit of 2 VPCs per region and requested a 3rd.

<details><summary>Answer:</summary><p> C

Explanation:

There is a soft limit of 5 EIPs per Region for VPC on new accounts. The third environment could not allocate the 6th EIP. 

http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_vpc

</p></details><hr>

### QUESTION 188
To monitor API calls against our AWS account by different users and entities, we can use______
to create a history of calls in bulk for later review, and use______for reacting to
AWS API calls in real-time.

- A. AWS Config; AWS Inspector
- B. AWS CloudTrail; AWS Config
- C. AWS CloudTrail; CloudWatch Events
- D. AWS Config; AWS Lambda

<details><summary>Answer:</summary><p> C

Explanation:

CloudTrail is a batch API call collection service, CloudWatch Events enables real-time monitoring of calls through the Rules object interface.

https://aws.amazon.com/whitepapers/security-at-scale-governance-in-aws/

</p></details><hr>

### QUESTION 189
How does Amazon RDS multi Availability Zone model work?

- A. A second, standby database is deployed and maintained in a different availability zone from master, using synchronous replication.
- B. A second, standby database is deployed and maintained in a different availability zone from master using asynchronous replication.
- C. A second, standby database is deployed and maintained in a different region from master using asynchronous replication.
- D. A second, standby database is deployed and maintained in a different region from master using synchronous replication.

<details><summary>Answer:</summary><p> A

Explanation:

In a Multi-AZ deployment, Amazon RDS automatically provisions and maintains a synchronous standby replica in a different Availability Zone. 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html

</p></details><hr>

### QUESTION 190
Which of these is not an instrinsic function in AWS CloudFormation?

- A. Fn::Equals 
- B. Fn::If
- C. Fn::Not
- D. Fn::Parse

<details><summary>Answer:</summary><p> D

Explanation:

This is the complete list of Intrinsic Functions...: Fn::Base64, Fn::And, Fn::Equals, Fn::If, Fn::Not, Fn::Or,
Fn::FindInMap, Fn::GetAtt, Fn::GetAZs, Fn::Join, Fn::Select, 

Ref http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html

</p></details><hr>

### QUESTION 191 x
Which one of the following is a restriction of AWS EBS Snapshots?

- A. Snapshot restorations are restricted to the region in which the snapshots are created.
- B. You cannot share unencrypted snapshots.
- C. To share a snapshot with a user in other region the snapshot has to be created in that region first.
- D. You cannot share a snapshot containing sensitive data such as an AWS Access Key ID or AWS Secret Access Key.

<details><summary>Answer:</summary><p> C

Explanation:

Shapshots shared with other users are usable in full by the recipient, including but limited to the ability to base modified volumes and snapshots.

Reference: http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html

</p></details><hr>

### QUESTION 192
What option below is the geographic limit of an EC2 security group?

- A. Security groups are global.
- B. They are confined to Placement Groups. 
- C. They are confined to Regions.
- D. They are confined to Availability Zones.

<details><summary>Answer:</summary><p> C

Explanation:

A security group is tied to a region and can be assigned only to instances in the same region.
  
You can't enable an instance to communicate with an instance outside its region using security group rules. Traffic from an instance in another region is seen as WAN bandwidth. 

Reference: http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resources.html

</p></details><hr>

### QUESTION 193
If designing a single playbook to run across multiple Linux distributions that have distribution specific commands, what would be the best method to allow a successful run?

- A. Enable fact gathering and use the `when` conditional to match the distribution to the task. 
- B. This isn't possible, a separate playbook for each target Linux distribution is required.
- C. Use `ignore_errors:true` in the tasks.
- D. Use the `shell` module to write your own checks for each command that is ran.

<details><summary>Answer:</summary><p> A

Explanation:

Ansible provides a method to only run a task when a condition is met using the `when` declarative. With gather facts enabled, the play has access to the distribution name of the Linux system, thus, tasks can be tailored to a specific distribution and ran only when the condition is met, e.g.: ` - when: ansible_os_family == "Debian"`.

Reference: http://docs.ansible.com/ansible/playbooks_conditionals.html

</p></details><hr>

### QUESTION 194 x
Which is the proper syntax for referencing a variable's value in an Ansible task?

- A. ${variable_name}
- B. {variable_name}
- C. "{{variable_name}}" 
- D. @variable_name

<details><summary>Answer:</summary><p> C

Explanation:

We use the variable's name to reference the variable which we encapsulate in curly brackets `{{ }}`; however, the YAML syntax dictates that a string beginning with a curly bracket denotes a dictionary value. To get around this it's proper to wrap the variable declaration in quotes. 

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#hey-wait-a-yaml-gotcha

</p></details><hr>

### QUESTION 195 x
If Erin has three clusters of server types that are all managed by Ansible and she needs to provision each cluster so that they are configured with their appropriate NTP server addresses. What is the best method Erin should use in Ansible for managing this?

- A. Write a task that scans the network in the target hosts' region for the NTP server,register the resulting address so that the next task can write the NTP configuration.
- B. Bre a k down the hosts by region in the Ansible inventory file and assign an inventory group variable the NTP address value for the respective region. The playbook can contain just the single play referencing the NTP variable from the inventory.
- C. Create a playbook for each different region and store the NTP address in a variable in the play in the event the NTP server changes.
- D. Createthreeplays,each one has the hosts for their respective regions and set the NTP server address in each task.

<details><summary>Answer:</summary><p> B

Explanation:

While all four answers provided are correct, only B is the best choice. Ansible offers the ability to assign variables to groups of hosts in the inventory file. When the playbook is ran it will use the variables assigned to the group, even all the groups are specified in a single playbook run. The respective variables will be available to the play. This is easiest method to run, maintain and write.

Reference: http://docs.ansible.com/ansible/intro_inventory.html#group-variables

</p></details><hr>

### QUESTION 196 x
Which of the following is an invalid variable name in Ansible?

- A. host1st_ref 
- B. host-first-ref 
- C. Host1stRef 
- D. host_first_ref

<details><summary>Answer:</summary><p> B

Explanation:

Variable names can contain letters, numbers and underscores and should always start with a letter. Invalid variable examples, `host first ref`, `1st_host_ref`.

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#what-makes-a-valid-variable-name

</p></details><hr>

### QUESTION 197 *
What are the bare minimum requirements for a valid Ansible playbook?

- A. The hosts, connection type, fact gathering, vars and tasks. 
- B. The hosts declaration and tasks
- C. A YAML file with a single line containing `---`.
- D. At least one play with at least a hosts declaration

<details><summary>Answer:</summary><p> D

Explanation:

Ansible Playbooks are a series of plays and must contain at a minimum, one play. A play generally consists of hosts to run on, a list of tasks, variables and roles, and any additional instructions, such as connection type, fact gathering, remote username, etc. that the tasks will need to complete. The only requirement for a valid play is to declare the hosts. 

Reference: http://docs.ansible.com/ansible/playbooks_intro.html

</p></details><hr>

### QUESTION 198 *
When running a playbook on a remote target host you receive a Python error similar to "[Errno 13] Permission denied: `/home/nick/.ansible/tmp`. What would be the most likely cause of this problem?

- A. The user's home or `.ansible` directory on the Ansible system is not writeable by the user running the play.
- B. The specified user does not exist on the remote system.
- C. The user running `ansible-playbook` must run it from their own home directory.
- D. The user's home or `.ansible` directory on the Ansible remote host is not writeable by the user running the play

<details><summary>Answer:</summary><p> D

Explanation:

Each task that Ansible runs calls a module. When Ansible uses modules it copies the module to the remote target system. In the error above it attempted to copy it to the remote user's home directory and found that either the home directory or the `.ansible` directory were not writeable and thus could not continue.

Reference: http://docs.ansible.com/ansible/modules_intro.html

</p></details><hr>

### QUESTION 199 *
When Ansible's connection state is set to `remote`, what method of communication does Ansible utilize to run commands on the remote target host?

- A. SSH
- B. RSH
- C. PSExec
- D. API call to Ansible clien to n host

<details><summary>Answer:</summary><p> A

Explanation:

Ansible does not require a client/server architecture and makes all remote connections over SSH. Ansible utilizes the Paramiko Python libraries for SSH when the native system OpenSSH libraries do not meet the requirements. Also note, Ansible does require Python be installed on the target host. When the target host is Windows, it uses WinRS 

Reference: http://docs.ansible.com/ansible/intro_getting_started.html#remote-connection-information

</p></details><hr>

### QUESTION 200 *
Which resource can not be defined in an Ansible Playbook?

- A. FactGatheringState 
- B. HostGroups
- C. InventoryFile
- D. Variables

<details><summary>Answer:</summary><p> C

Explanation:

Ansible's inventory can only be specified on the command line, the Ansible configuration file or in environment variables.

Reference: http://docs.ansible.com/ansible/intro_inventory.html

</p></details><hr>

# AWS DevOps Engineer Professional 3/3
Version: 18.122

### QUESTION 201 *
When specifying multiple variable names and values for a playbook on the command line, which of the following is the correct syntax?

- A. ansible-playbookplaybook.yml-e`host="foo"pkg="bar"`
- B. ansible-playbookplaybook.yml-e`host:"foo",pkg:"bar"`
- C. ansible-playbookplaybook.yml-e`host="foo"`-e`pkg="bar"`
- D. ansible-playbookplaybook.yml--extra-vars"host=foo","pkg=bar"

<details><summary>Answer:</summary><p> A 

Explanation:

Variables are passed in a single command line parameter, `-e` or `--extra-vars`. They are sent as a single string to the playbook and are space delimited. Because of the space delimeter, variable values must be encapsulated in quotes. Additionally, proper JSON or YAML can be passed, such as: `-e {"key": "name", "array": ["value1", "value2"]}`.

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#passing-variables-on-the-command-line

</p></details><hr>

### QUESTION 202 *
Ansible provides some methods for controlling how or when a task is ran. Which of the following is a valid method for controlling a task with a loop?

- A. -with:<value>
- B. -with_items:<value>
- C. -only_when:<conditional> 
- D. -items:<value>

<details><summary>Answer:</summary><p> B

Explanation:

Ansible provides two methods for controlling tasks, loops and conditionals. The "with_items" context will allow the task to loop through a list of items, while the `when` context will allow a conditional requirement to be met for the task to run. Both can be used at the same time. 

Reference: http://docs.ansible.com/ansible/playbooks_conditionals.html#loops-and-conditionals

</p></details><hr>

### QUESTION 203 *
Which difference between core modules and extra modules is not correct?

- A. Extra modules may one day be come core modules 
- B. Core modules are supported by the Ansible team 
- C. Core modules are shipped by default with Ansible 
- D. Extra modules have no support

<details><summary>Answer:</summary><p> D

Explanation:

While extra modules are not official modules and thus not supported by the Ansible team, they are indeed supported by their writers and the community.

Reference: http://docs.ansible.com/ansible/modules_extra.html

</p></details><hr>

### QUESTION 204 *
What is the proper (best practice) way to begin a playbook?

- A. -hosts:all 
- B. ...
- C. ###
- D. ---

<details><summary>Answer:</summary><p> D

Explanation:

All YAML files can begin with `---` and end with `...` to indicate where YAML starts and ends. While this is optional it is considered best practice.
  
Reference: http://docs.ansible.com/ansible/YAMLSyntax.html

</p></details><hr>

### QUESTION 205 *
You have a playbook that includes a task to install a package for a service, put a configuration file for that package on the system and restart the service. The playbook is then run twice in a row. What would you expect Ansible to do on the second run?

- A. Remove the old package and config file and reinstall and then rest a rt these rvice.
- B. Take no action on the target host.
- C. Check if the package is installed,check if the file match es the source file,ifnotreinstallit;restart
the service.
- D. At tempt to reinstall the package,copy the file and rest a rt these rvice.

<details><summary>Answer:</summary><p> C

Explanation:

Ansible follows an idempotence model and will not touch or change the system unless a change is warranted.

Reference: http://docs.ansible.com/ansible/glossary.html

</p></details><hr>

### QUESTION 206 *
Which tool will Ansible not use, even if available, to gather facts?

- A. facter
- B. lsb_release
- C. Ansiblesetupmodule 
- D. ohai

<details><summary>Answer:</summary><p> B

Explanation:

Ansible will use it's own `setup` module to gather facts for the local system. Additionally, if ohai or facter are installed, those will also be used and all variables will be prefixed with `ohai_` or `facter_` respectively. `lsb_relase` is a Linux tool for determining distribution information. 

Reference: http://docs.ansible.com/ansible/setup_module.html

</p></details><hr>

### QUESTION 207 *
If a variable is assigned in the `vars` section of a playbook, where is the proper place to override that variable?

- A. Inventorygroupvar 
- B. playbookhost_vars 
- C. roledefaults
- D. extravars

<details><summary>Answer:</summary><p> D

Explanation:

In Ansible's variable precedence, the highest precedence is the extra vars option on the command line.

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#variable-precedence-where-should-i-put-a-variable
  
</p></details><hr>

### QUESTION 208 *
If Ansible encounters a resource that does not meet the requirements specified in the play it makes the necessary changes to the resource; however if the resource is already in the desired state Ansible will do nothing. This is an example of which methodology?

- A. Idempotency
- B. Immutability
- C. Convergence
- D. Infrastructure as Code

<details><summary>Answer:</summary><p> A

Explanation:

Idempotency states that changes are only made if a resource does not meet the requirement specifications. If a change is made, it is made `in-place` and will not break existing resources. 

Reference: http://docs.ansible.com/ansible/glossary.html

</p></details><hr>

### QUESTION 209 *
When writing plays, tasks and playbooks, Ansible fully supports which high level language to describe these?

- A. YAML 
- B. Python 
- C. XML 
- D. JSON

<details><summary>Answer:</summary><p> A

Explanation:

This can be bit of a trick question. While Ansible Playbooks in this course are written in YAML, Ansible will accept plays, tasks and playbooks in JSON, as JSON a subset of YAML. However, the prefered and fully supported method is YAML.

Reference: http://docs.ansible.com/ansible/YAMLSyntax.html

</p></details><hr>

### QUESTION 210 *
What is the expected behavior if Ansible is called with `ansible-playbook -i localhost playbook.yml`?

- A. Ansible will at tempt to read the inventory file named `localhost`
- B. Ansible will run the plays local ly.
- C. Ansible will run the playbook on the host named `localhost`
- D. Ansiblewon'trun,this is in valid command line syntax

<details><summary>Answer:</summary><p> A

Explanation:

Ansible expects an inventory filename with the `-i` option, regardless if it's a valid hostname. For this to execute on the host `localhost` resolves to, a comma needs to be appended to the end. 

Reference: http://docs.ansible.com/ansible/intro_inventory.html#inventory

</p></details><hr>

### QUESTION 211 *
The Ansible Inventory system allows many attributes to be defined within it. Which item below is not one of these?
  

- A. Groupvariables 
- B. Hostgroups
- C. Includevars
- D. Childrengroups

<details><summary>Answer:</summary><p> C

Explanation:

Ansible inventory files cannot reference other files for additional data. If this functionality is needed, it must be done in as a script to create a dynamic inventory

Reference: http://docs.ansible.com/ansible/intro_inventory.html

</p></details><hr>

### QUESTION 212 *
When writing custom Ansible modules, which language is not supported?

- A. Python
- B. C++
- C. Bash
- D. All of the language s list ed are supported

<details><summary>Answer:</summary><p> D

Explanation:

Ansible modules can be written in any language that is executable on the target system. The only requirement is that the module can write its results as JSON output to STDOUT for Ansible to consume.

Reference: http://docs.ansible.com/ansible/developing_modules.html

</p></details><hr>

### QUESTION 213 *
When specifying more than one conditional requirements for a task, what is the proper method?

- A. -when:foo=="hello"andbar=="world"
- B. -when:foo=="hello"-when:bar=="world" 
- C. -when:foo=="hello"&&bar=="world"
- D. -when:foois"hello"andbaris"world"

<details><summary>Answer:</summary><p> A

Explanation:

Ansible will allow you to stack conditionals using `and` and `or`. It requires it to be in the same `when` statement, comparisons must be `==` for equals or `!=` for not equals and the `and/or` must be written as such, not `&&/||`.

Reference: http://docs.ansible.com/ansible/playbooks_conditionals.html#the-when-statement

</p></details><hr>

### QUESTION 214 *
Ansible supports running Playbook on the host directly or via SSH. How can Ansible be told to run its playbooks directly on the host?

- A. Setting `connection:local` in the tasks that run locally. 
- B. Specifying `-typelocal` on the command line.
- C. It does not need to be specified; it's the default.
- D. Setting `connection:local` in the Playbook.

<details><summary>Answer:</summary><p> D

Explanation:

Ansible can be told to run locally on the command line with the `-c` option or can be told via the `connection: local` declaration in the playbook. The default connection method is `remote`. 

Reference: http://docs.ansible.com/ansible/intro_inventory.html#non-ssh-connection-types

</p></details><hr>

### QUESTION 215 *
What is the main difference between calling the commands `ansible` and `ansible-playbook` on the command line?

- A. `ansible` is for setting configuration and environment variables which `ansible-playbook` will use when running plays.
- B. `ansible-playbook` is for running entire Playbooks while `ansible` is for calling ad-hoc commands.
- C. `ansible-playbook'runs the playbook s by using the` ansible'command to run the individual plays
- D. `ansible` is for running individual plays and `ansible-playbook` is for running the entire playbook.

<details><summary>Answer:</summary><p> B

Explanation:

The `ansible` command is for running Ansible ad-hoc commands remotely via SSH. `ansible- playbook` is for running Ansible Playbook projects.

Reference: http://docs.ansible.com/ansible/intro_adhoc.html

</p></details><hr>

### QUESTION 216 *
Which answer is the proper syntax for specifying two target hosts on the command line when running an Ansible Playbook?

- A. ansible-playbook-hhost1.example.com-iallplaybook.yml
- B. ansible-playbook-ihost1.example.complaybook.yml
- C. ansible-playbook -h host1.example.com,host2.example.com playbook.yml 
- D. ansible-playbook -i host1.example.com,host2.example.com playbook.yml

<details><summary>Answer:</summary><p> D

Explanation:

Ansible uses the `-i` flag for accepting an inventory file or host. To allow Ansible to determine if you are passing a host list versus an inventory file the list must be comma separated. If a single host is specified, a trailing comma must be present.

Reference: http://docs.ansible.com/ansible/intro_inventory.html#inventory

</p></details><hr>

### QUESTION 217 x
What is the purpose of a Docker swarm worker node?

- A. scheduling services
- B. services warm node HTTP API endpoints 
- C. executing containers
- D. maintaining cluster state

<details><summary>Answer:</summary><p> C

Explanation:

Manager nodes handle cluster management tasks: 

- maintaining cluster state  
- scheduling services
- serving swarm mode HTTP API endpoints

Worker nodes

Worker nodes are also instances of Docker Engine whose sole purpose is to execute containers. Worker nodes don't participate in the Raft distributed state, make scheduling decisions, or serve the swarm mode HTTP API.

Reference: https://docs.docker.com/engine/swarm/how-swarm-mode-works/nodes/#worker-nodes

</p></details><hr>

### QUESTION 218 x
You are building a Docker image with the following Dockerfile. How many layers will the resulting image have?
```bash
FROM scratch
CMD /app/hello.sh
```

- A. 2 
- B. 4 
- C. 1 
- D. 3

<details><summary>Answer:</summary><p> D

Explanation:

```bash
FROM scratch
CMD /app/hello.sh
```
The image contains all the layers from the base image (only one in this case, since we're building rom scratch), plus a new layer with the CMD instruction, and a read-write container layer. 

Reference: https://docs.docker.com/engine/userguide/storagedriver/imagesandcontainers/#sharing-promotes-smaller-images

</p></details><hr>

### QUESTION 219 x
What storage driver does Docker generally recommend that you use if it is available?

- A. zfs
- B. btrfs 
- C. aufs
- D. overlay

<details><summary>Answer:</summary><p> C

Explanation:

After you have read the storage driver overview, the next step is to choose the best storage driver for your workloads. In making this decision, there are three high-level factors to consider:
If multiple storage drivers are supported in your kernel, Docker has a prioritized list of which storage driver to use if no storage driver is explicitly configured, assuming that the prerequisites for that storage driver are met:
If aufs is available, default to it, because it is the oldest storage driver. However, it is not universally available.

Reference: https://docs.docker.com/engine/userguide/storagedriver/selectadriver/

</p></details><hr>

### QUESTION 220 C?
In which Docker Swarm model does the swarm manager distribute a specific number of replica tasks among the nodes based upon the scale you set in the desired state?
  

- A. distributed services 
- B. scaled services
- C. replicated services 
- D. global services

<details><summary>Answer:</summary><p> D

Explanation:

A service is the definition of the tasks to execute on the worker nodes. It is the central structure of the swarm system and the primary root of user interaction with the swarm. When you create a service, you specify which container image to use and which commands to execute inside running containers.
In the replicated services model, the swarm manager distributes a specific number of replica tasks among the nodes based upon the scale you set in the desired state. For global services, the swarm runs one task for the service on every available node in the cluster.
A task carries a Docker container and the commands to run inside the container. It is the atomic scheduling unit of swarm. Manager nodes assign tasks to worker nodes according to the number of replicas set in the service scale. Once a task is assigned to a node, it cannot move to another node. It can only run on the assigned node or fail.

Reference: https://docs.docker.com/engine/swarm/key-concepts/#services-and-tasks

</p></details><hr>

### QUESTION 221 x
On which local address does the Docker DNS server listen?

- A. 127.0.0.1 
- B. 127.0.0.111 
- C. 127.0.0.254 
- D. 127.0.0.11

<details><summary>Answer:</summary><p> D

Explanation:

Note: If you need access to a host's localhost resolver, you must modify your DNS service on the host to listen on a non-localhost address that is reachable from within the container.
Note: The DNS server is always at 127.0.0.11.

Reference: https://docs.docker.com/engine/userguide/networking/configure-dns/

</p></details><hr>

### QUESTION 222
What are the default memory limit policies for a Docker container?

- A. Limited memory,limited kernel memory
- B. Unlimited memory,limited kernel memory 
- C. Limited memory,unlimited kernel memory 
- D. Unlimited memory,unlimited kernel memory

<details><summary>Answer:</summary><p> D

Explanation:

Kernel memory limits are expressed in terms of the overall memory allocated to a container. Consider the following scenarios:
Unlimited memory, unlimited kernel memory: This is the default behavior. Unlimited memory, limited kernel memory: This is appropriate when the amount of memory needed by all cgroups is greater than the amount of memory that actually exists on the host machine. You can configure the kernel memory to never go over what is available on the host machine, and containers which
need more memory need to wait for it. Limited memory, umlimited kernel memory: The overall memory is limited, but the kernel memory is not.
Limited memory, limited kernel memory: Limiting both user and kernel memory can be useful for debugging memory-related problems. If a container is using an unexpected amount of either type of memory, it will run out of memory without affecting other containers or the host machine. Within this setting, if the kernel memory limit is lower than the user memory limit, running out of kernel memory will cause the container to experience an OOM error. If the kernel memory limit is higher than the user memory limit, the kernel limit will not cause the container to experience an OOM. 

Reference: https://docs.docker.com/engine/admin/resource_constraints/#--kernel-memory-details

</p></details><hr>

### QUESTION 223
What needs to be done in order to remotely access a Docker daemon running on Linux?

- A. add certificate authentication to the docker API 
- B. change the encryption level to TLS
- C. enabletheTCPsocket
- D. bind the Docker API to a unix socket

<details><summary>Answer:</summary><p> C

Explanation:

The Docker daemon can listen for Docker Remote API requests via three different types of Socket:
unix, tcp, and fd.
By default, a unix domain socket (or IPC socket) is created at /var/run/docker.sock, requiring either root permission, or docker group membership. If you need to access the Docker daemon remotely, you need to enable the tcp Socket. Beware that the default setup provides un- encrypted and un-authenticated direct access to the Docker daemon - and should be secured either using the built in HTTPS encrypted socket or by putting a secure web proxy in front of it. 

Reference: https://docs.docker.com/engine/reference/commandline/dockerd/#daemon-socket-option

</p></details><hr>

### QUESTION 224
Which of the following Dockerfile commands cannot be overridden at runtime?

- A. VOLUME 
- B. USER
- C. ADD
- D. CMD

<details><summary>Answer:</summary><p> C

Explanation:

When a developer builds an image from a Dockerfile or when she commits it, the developer can set a number of default parameters that take effect when the image starts up as a container. Four of the Dockerfile commands cannot be overridden at runtime: FROM, MAINTAINER, RUN, and ADD. Everything else has a corresponding override in docker run. We'll go through what the developer might have set in each Dockerfile instruction and how the operator can override that setting.

Reference: https://docs.docker.com/engine/reference/run/#overriding-dockerfile-image-defaults

</p></details><hr>

### QUESTION 225
    
When deploying to a Docker swarm, which section of the docker-compose file defines configuration related to the deployment and running of services?

- A. services 
- B. build
- C. deploy 
- D. args

<details><summary>Answer:</summary><p> C

Explanation:

Version 3 only.
Specify configuration related to the deployment and running of services. This only takes effect when deploying to a swarm withdocker stack deploy, and is ignored by docker-compose up and docker-compose run.

Reference: https://docs.docker.com/compose/compose-file/#deploy

</p></details><hr>

### QUESTION 226
You are running a Docker daemon on a Linux host and it becomes unresponsive. Which signal, when sent to a Docker process with the kill command, forces the full stack trace to be logged for debugging purposes?

- A. -TRACE
- B. -IOTRACE 
- C. -SIGUSER1 
- D. -KILLTRACE

<details><summary>Answer:</summary><p> C

Explanation:

If the daemon is unresponsive, you can force a full stack trace to be logged by sending a SIGUSR1 signal to the daemon.
Linux:
$ sudo kill -SIGUSR1 $(pidof dockerd)
Windows Server:
Download docker-signal.
Run the executable with the flag --pid=<PID of daemon>.

Reference: https://docs.docker.com/engine/admin/#force-a-stack-trace-to-be-logged

</p></details><hr>

### QUESTION 227
Which of the following is NOT an advantage of Docker's content addressable storage model?

- A. random UUID simprove files ystem performance
- B. improvedsecurity
- C. guarantees data integrity after push,pull,load,andsaveoperations 
- D. avoid s content ID collisions

<details><summary>Answer:</summary><p> A

Explanation:

Docker 1.10 introduced a new content addressable storage model. This is a completely new way to address image and layer data on disk. Previously, image and layer data was referenced and stored using a randomly generated UUID. In the new model this is replaced by a secure content hash.
The new model improves security, provides a built-in way to avoid ID collisions, and guarantees data integrity after pull, push, load, and save operations. It also enables better sharing of layers by allowing many images to freely share their layers even if they didn't come from the same build. 

Reference: https://docs.docker.com/engine/userguide/storagedriver/imagesandcontainers/#content-addressable-storage

</p></details><hr>

### QUESTION 228
What flag would you use to limit a Docker container's memory usage to 128 megabytes?

- A. -memory128m
- B. -m128m
- C. --memory-reservation128m 
- D. -m128MB

<details><summary>Answer:</summary><p> B

Explanation:

Docker can enforce hard memory limits, which allow the container to use no more than a given amount of user or system memory, or soft limits, which allow the container to use as much memory as it needs unless certain conditions are met, such as when the kernel detects low memory or contention on the host machine. Some of these options have different effects when used alone or when more than one option is set.
Most of these options take a positive integer, followed by a suffix of b, k, m, g, to indicate bytes, kilobytes, megabytes, or gigabytes.
Option -m or --memory=
Description The maximum amount of memory the container can use. If you set this option, the minimum allowed value is 4m (4 megabyte).

Reference: https://docs.docker.com/engine/admin/resource_constraints/#memory

</p></details><hr>

### QUESTION 229
What is the only layer in a Docker image that is not read-only?

- A. theyareallread-only 
- B. noneareread-only 
- C. thefirstlayer
- D. thelastlayer

<details><summary>Answer:</summary><p> D

Explanation:

A Docker image is built up from a series of layers. Each layer represents an instruction in the image's Dockerfile. Each layer except the very last one is read-only.

Reference: https://docs.docker.com/engine/userguide/storagedriver/imagesandcontainers/#images-and-layers

</p></details><hr>

### QUESTION 230
When building a Docker image, you are searching through a persistent data volume's logs to provide parameters for the next build. You execute the following command. Which of the operations will cause a failure of the Docker RUNcommand? RUN cat ./data/log/\*.error | grep service_status | grep ERROR

- A. the first grep command
- B. any one of them
- C. the second grep command 
- D. the cat command

<details><summary>Answer:</summary><p> C

Explanation:

Some RUN commands depend on the ability to pipe the output of one command into another, using the pipe character (|), as in the following example:
RUN wget -O - https://some.site | wc -l > /number
Docker executes these commands using the /bin/sh -c interpreter, which only evaluates the exit code of the last operation in the pipe to determine success. In the example above this build step succeeds and produces a new image so long as the wc -lcommand succeeds, even if the wget command fails.

Reference: https://docs.docker.com/engine/userguide/eng-image/dockerfile_best-practices/#run

</p></details><hr>

### QUESTION 231
What does the Docker network docker_gwbridge do?

- A. allows communication between containers on the same host
- B. allows communication between swarm nodes on different hosts 
- C. allows communication between swarm nodes on the same host 
- D. allows communication between containers on the different hosts

<details><summary>Answer:</summary><p> B

Explanation:

The docker_gwbridge is a local bridge network which is automatically created by Docker in two different circumstances: When you initialize or join a swarm, Docker creates the docker_gwbridge network and uses it for communication among swarm nodes on different hosts. When none of a container's networks can provide external connectivity, Docker connects the container to the docker_gwbridge network in addition to the container's other networks, so that the container can connect to external networks or other swarm nodes.

Reference: https://docs.docker.com/engine/userguide/networking/#the-docker_gwbridge-network

</p></details><hr>

### QUESTION 232 x
Which services can be used as optional components of setting up a new Trail in CloudTrail?

- A. KMS,SNS and SES
- B. CloudWatch,S3 and SNS 
- C. KMS,Cloudwatch and SNS 
- D. KMS,S3 and CloudWatch

<details><summary>Answer:</summary><p> C

Explanation:

Key Management Service: The use of AWS KMS is an optional element of CloudTrail, but it allows additional encryption to be added to your Log files when stored on S3 

Simple Notification Service: Amazon SNS is also an optional component for CloudTrail, but it allows for you to create notifications, for example when a new log file is delivered to S3 SNS could notify someone or a team via an e-mail. Or it could be used in conjunction with CloudWatch when metric thresholds have been reached.

CloudWatch Logs: Again, this is another optional component, but AWS CloudTrail allows you to deliver its logs to AWS Cloudwatch Logs as well as S3 for specific monitoring metrics to take place

Reference: https://cloudacademy.com/amazon-web-services/aws-cloudtrail-introduction-course/how-does-aws-cloudtrail-work.html

</p></details><hr>

### QUESTION 233
What is AWS CloudTrail Processing Library?

- A. A static library with CloudTrail log files in a movable format machine code that is directly executable
- B. An object library with CloudTrail log files in a movable format machine code that is usually not directly executable
- C. A Java library that makes it easy to build an application that reads and processes CloudTrail log files
- D. A PHP library that renders various generic containers needed for CloudTrail log files

<details><summary>Answer:</summary><p> C

Explanation:

AWS CloudTrail Processing Library is a Java library that makes it easy to build an application that reads and processes CloudTrail log files.
You can download CloudTrail Processing Library from GitHub.

Reference: http://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 234 x
Using the AWS CLI, which command retrieves CloudTrail trail settings, including the status of the trail itself?

- A. aws cloudtrail return-trails
- B. aws cloudtrail validat e-settings 
- C. aws cloudtrail get-settings
- D. aws cloudtrail describe-trails

<details><summary>Answer:</summary><p> D

Explanation:

You can retrieve trail settings and status using the cloudtrail describe-trails command. It will generate output similar to the example below.
```json
{
  "trailList": [
    {
      "IncludeGlobalServiceEvents": false,
      "Name": "trailname",
      "S3KeyPrefix": "my-prefix",
      "TrailARN": "arn:aws:cloudtrail:us-east-2:123456789012:trail/my-trail", "LogFileValidationEnabled": true,
      "IsMultiRegionTrail": true,
      "HasCustomEventSelectors": false,
      "S3BucketName": " bucket",
      "SnsTopicName": " topic",
      "HomeRegion": "us-east-2"
    }
  ]
}
```
  
Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-create-and-update-a-trail-by-using-the-aws-cli.html

</p></details><hr>

### QUESTION 235
You are running Amazon CloudTrail on an Amazon S3 bucket and look at your most recent log. You notice that the entries include the ListThings and CreateThings actions and wonder if your devices have been hacked. Based on these entries, what service would you be concerned may have been hacked?

- A. Amazon Inspector 
- B. AWS IoT
- C. AWS Code Pipeline 
- D. Amazon Glacier

<details><summary>Answer:</summary><p> B

Explanation:

AWS IoT (Internet of Things) is integrated with CloudTrail to capture API calls from the AWS IoT console or from your code to the AWS IoT APIs. AWS IoT provides secure, bi-directional communication between Internet-connected things (such as sensors, actuators, embedded devices, or smart appliances) and the AWS cloud. Using the information collected by CloudTrail, you can determine the request that was made to AWS IoT, the source IP address from which the request was made, who made the request, when it was made, and so on.

Reference: http://docs.aws.amazon.com/iot/latest/developerguide/monitoring_overview.html#iot-using-cloudtrail

</p></details><hr>

### QUESTION 236
Your CTO has asked you to make sure that you know what all users of your AWS account are doing to change resources at all times. She wants a report of who is doing what over time, reported to her once per week, for as broad a resource type group as possible. How should you do this?

- A. Create a global AWS CloudTrail Trail. Configure a script to aggregate the log data into a report, publish it to S3 once per week and deliver this to the CTO.
- B. Use CloudWatch Events Rules with an SNS topic subscribed to all AWS API calls. Subscribe the CTO to an email type delivery on this SNS Topic.
- C. Use AWS IAM credential reports to deliver a CSV of all uses of IAM User Tokens over time to the CTO.
- D. Use AWS Config with an SNS subscription on a Lambda, and insert these changes over time into a DynamoDB table. Generate reports based on the contents of this table.

<details><summary>Answer:</summary><p> A

Explanation:

This is the ideal use case for AWS CloudTrail.
CloudTrail provides visibility into user activity by recording API calls made on your account. CloudTrail records important information about each API call, including the name of the API, the identity of the caller, the time of the API call, the request parameters, and the response elements returned by the AWS service. This information helps you to track changes made to your AWS resources and to troubleshoot operational issues. CloudTrail makes it easier to ensure compliance with internal policies and regulatory standards.

Reference: https://aws.amazon.com/cloudtrail/faqs/
  
</p></details><hr>

### QUESTION 237 x
When logging with Amazon CloudTrail, API call information for services with regional end points is ___ .

- A. captured and processed in the same region as to which the API call is made and delivered to the region associated with your Amazon S3 bucket
- B. captured, processed, and delivered to the region associated with your Amazon S3 bucket
- C. captured in the same region as to which the API call is made and processed and delivered to the region associated with your Amazon S3 bucket
- D. captured in the region where the endpoint is located, processed in the region where the CloudTrail trail is configured, and delivered to the region associated with your Amazon S3 bucket

<details><summary>Answer:</summary><p> A

Explanation:

When logging with Amazon CloudTrail, API call information for services with regional end points (EC2, RDS etc.) is captured and processed in the same region as to which the API call is made and delivered to the region associated with your Amazon S3 bucket.API call information for services with single endpoints(IAM,STSetc.)is captured in the region where the endpointis located,processed in the region where the CloudTrail trail is configured, and delivered to the region associated with your Amazon S3 bucket. 

Reference: https://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 238
When logging with Amazon CloudTrail, API call information for services with single end points is .

- A. captured in the same region as to which the API call is made and processed and delivered to the region associated with your Amazon S3 bucket
- B. captured and processed in the same region as to which the API call is made and delivered tothe region associated with your Amazon S3 bucket
- C. captured,processed,and delivered to the region associated with your Amazon S3 bucket
- D. captured in the region where the endpoint is located,processed in the region where the
CloudTrail trail is configured, and delivered to the region associated with your Amazon S3
bucket

<details><summary>Answer:</summary><p> D

Explanation:

When logging with Amazon CloudTrail, API call information for services with regional end points (EC2, RDS etc.) is captured and processed in the same region as to which the API call is made and delivered to the region associated with your Amazon S3 bucket. API call information for services with single end points (IAM, STS etc.) is captured in the region where the endpointis located,processed in the region where the CloudTrail trail is configured, and delivered to the region associated with your Amazon S3 bucket. 

Reference: https://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 239
What is the correct syntax for the AWS command to create a single region trail? 
- A. aws create-trail --name trailname --s3-object objectname
- B. aws cloudtrail --s3-region name IP address create-trail --name trailname
- C. awsc loudtrail create-trail --name trailname --s3-bucket-name bucketname 
- D. aws cloudtrail create-trail --name trailname --s3-portnumberIPaddress

<details><summary>Answer:</summary><p> C

Explanation:

The command aws cloudtrail create-trail --name trailname --s3-bucket-name bucketname will create a single region trail. You must create a S3 bucket before you execute the command, with proper CloudTrail permissions applied to it (and you must have the AWS command line tools (CLI) on your system).

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-create-and-update-a-trail-by-using-the-aws-cli.html

</p></details><hr>

### QUESTION 240
You want to set up the CloudTrail Processing Library to log your bucket operations. Which command will build a .jar file from the CloudTrail Processing Library source code?

- A. mvn javac mvn -install processor
- B. jar install processor
- C. build jar -Dgpg.processor
- D. mvn clean install -Dgpg.skip=true

<details><summary>Answer:</summary><p> D

Explanation:

The CloudTrail Processing Library is a Java library that provides an easy way to process AWS CloudTrail logs in a fault-tolerant, scalable and flexible way. To set up the CloudTrail Processing Library, you first need to download CloudTrail Processing Library source from GitHub. You can then create the .jar file using this command.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/use-the-cloudtrail-processing-library.html

</p></details><hr>

### QUESTION 241 x
By default, Amazon CloudTrail logs______actions defined by the CloudTrail______APIs. 

- A. bucket-level;RESTful
- B. object-level;RESTful
- C. object-level;SDK
- D. bucket-level;SDK

<details><summary>Answer:</summary><p> A

Explanation:

By default, CloudTrail logs bucket-level actions. Amazon S3 records are written together with other AWS service records in a log file. Amazon S3 bucket-level actions supported for logging by CloudTrail are defined in its RESTful API.

Reference: http://docs.aws.amazon.com/AmazonS3/latest/dev/cloudtrail-logging.html

</p></details><hr>

### QUESTION 242 x
You want to build an application that coordinates work across distributed components, and you find Amazon Simple Workflow Service (Amazon SWF) does this easily. You have enabled logging in CloudTrail, but you are unsure about Amazon SWF actions supported. Which of the following actions is NOT supported?

- A. RegisterDomain
- B. RegisterWorkflowActivity
- C. RegisterActivityType
- D. RegisterWorkflowType

<details><summary>Answer:</summary><p> B

Explanation:

Amazon SWF is integrated with AWS CloudTrail, a service that captures API calls made by or on behalf of Amazon SWF and delivers the log files to an Amazon S3 bucket that you specify. The API calls can be made indirectly by using the Amazon SWF console or directly by using the Amazon SWF API.
When CloudTrail logging is enabled, calls made to Amazon SWF actions are tracked in log files. Amazon SWF records are written together with any other AWS service records in a log file. CloudTrail determines when to create and write to a new file based on a specified time period and file size.
The following actions are supported: DeprecateActivityType DeprecateDomain DeprecateWorkflowType RegisterActivityType RegisterDomain RegisterWorkflowType

Reference: http://docs.aws.amazon.com/amazonswf/latest/developerguide/ct-logging.html

</p></details><hr>

### QUESTION 243
Consider the portion of a CloudTrail log file below. Which type of event is being captured? 
```
"eventTime":"2016-07-16T17:35:32Z",
"eventSource":"signin.amazonaws.com",
"eventName":"ConsoleLogin",
"awsRegion":"us-west-1", "sourceIPAddress":"192.1.2.10", ...
```

- A. AWS console sign-in
- B. AWS log off
- C. AWS error
- D. AWS deployment

<details><summary>Answer:</summary><p> A

Explanation:

CloudTrail records attempts to sign into the AWS Management Console, the AWS Discussion Forums and the AWS Support Center. Note, however, that CloudTrail does not record root sign-in failures.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-aws-console-sign-in-events.html

</p></details><hr>

### QUESTION 244
To monitor API calls against our AWS account by different users and entities, we can use______
to create a history of calls in bulk for later review, and use______for reacting to
AWS API calls in real-time.

- A. AWS CloudTrail;CloudWatch Events 
- B. AWS Config;AWS Inspector
- C. AWS Config;AWS Lambda
- D. AWS CloudTrail;AWS Config 

<details><summary>Answer:</summary><p> A

Explanation:

CloudTrail is a batch API call collection service, CloudWatch Events enables real-time monitoring of calls through the Rules object interface.

Reference: https://aws.amazon.com/whitepapers/security-at-scale-governance-in-aws/

</p></details><hr>

### QUESTION 245
Using the AWS CLI, which command would you use to change the configuration settings for a CloudTrail trail?

- A. modify-trail
- B. change-trail
- C. update-trail 
- D. set-trail

<details><summary>Answer:</summary><p> C

Explanation:

The update-trail command is used to change the configuration settings for a trail. You can only
run update-trail command from the region in which the trail was created.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-create-and-update-a-trail-by-using-the-aws-cli.html

</p></details><hr>

### QUESTION 246
As CloudTrail sends a notification each time a log file is written to the Amazon S3 bucket, an account that's very active can generate a large number of notifications. If you subscribe using email or SMS, you may end up receiving a large volume of messages. Which of the following should you use to handle notifications programmatically?

- A. Amazon Kinesis Firehose
- B. Amazon Simple Queue Service(Amazon SQS)
- C. Amazon Simple Email Service(Amazon SES)
- D. Amazon App Stream

<details><summary>Answer:</summary><p> B

Explanation:

As CloudTrail sends a notification each time a log file is written to the Amazon S3 bucket, an account that's very active can generate a large number of notifications. If you subscribe using email or SMS, you can end up receiving more messages than you can handle. AWS recommends that you subscribe using Amazon Simple Queue Service (Amazon SQS), which lets you handle notifications programmatically.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/getting_notifications_configuration.html

</p></details><hr>

### QUESTION 247
Within an IAM policy, can you add an IfExists condition at the end of a Null condition?

- A. Yes,you can add an IfExists condition at the end of a Null condition but not in all Region s.
- B. Yes,you can add an IfExists condition at the end of a Null condition depending on the condition. 
- C. No,you cannot add an IfExists condition at the end of a Null condition.
- D. Yes,you can add an IfExists condition at the end of a Null condition.

<details><summary>Answer:</summary><p> C

Explanation:

Within an IAM policy, IfExists can be added to the end of any condition operator except the
Null condition.It can be used to in dic at e that condition a l com p a r is on needs to h app en if the
policy key is present in the context of a request; otherwise, it can be ignored.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html

</p></details><hr>

### QUESTION 248
You are hosting multiple environments in multiple regions and would like to use Amazon Inspector for regular security assessments on your AWS resources across all regions. Which statement about Amazon Inspector's operation across regions is true?

- A. Amazon Inspector is a global service that is not region-bound.YoucanincludeAWS
resources from multiple regions in the same assessment target.
- B. Amazon Inspector is hosted within AWS regions behind a public endpoint.Allregionsare isolated from each other, and the telemetry and findings for all assessments performed within aregion rem a in in that region and are not distributed by these rvice too the r Amazon Inspector locations.
- C. Amazon Inspector is hosted in each supported region.Telemetry data and find in gs are shared across regions to provide complete assessment reports.
- D. Amazon Inspector is hosted in each supported region separately. You have to create assessment targets using the same name and tags in each region and Amazon Inspector will run against each assessment target in each region. 

<details><summary>Answer:</summary><p> B

Explanation:

At this time, Amazon Inspector supports assessment services for EC2 instances in only the following AWS regions:
US West
(Oregon) US
East (N. Virginia) EU (Ireland)
Asia Pacific (Seoul) Asia Pacific (Mumbai) Asia Pacific (Tokyo) Asia Pacific (Sydney)
Amazon Inspector is hosted within AWS regions behind a public endpoint. All regions are isolated from each other, and the telemetry and findings for all assessments performed within aregion rem a in in that region and are not distributed by these rvice too the r Amazon Inspector locations. 

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_supported_os_regions.html#inspectorsupported-regions

</p></details><hr>

### QUESTION 249
To override an allow in an IAM policy, you set the Effect element to______.

- A. Block
- B. Stop
- C. Deny
- D. Allow

<details><summary>Answer:</summary><p> C

Explanation:

By default, access to resources is denied. To allow access to a resource, you must set the Effect element to Allow. To override an allow (for example, to override an allow that is otherwise in force), you set the Effect element to Deny.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_ElementDescriptions.html

</p></details><hr>

### QUESTION 250
To access the AWS Security Token Service (STS) you can issue calls directly to the AWS STS Query API. This API is a web service interface that accepts______requests.

- A. PUT
- B. HTTPS
- C. POST 
- D. GET

<details><summary>Answer:</summary><p> B

Explanation:

The Query API for IAM and AWS STS lets you call service actions. Query API requests are HTTPS requests that must contain an Action parameter to indicate the action to be performed. IAM and AWS STS support GET and POST requests for all actions, that is, the API does not require you to use GET for some actions and POST for others.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html

</p></details><hr>

### QUESTION 251
A root account has created an IAM group and defined the policy as: 
"Statement": 
```json
[
  {
    "Effect": "Allow",
    "Action": ["iam:ChangePassword"],
    "Resource": ["arn:aws:iam::123123123123:user/${aws:username}"] },
  {
    "Effect": "Allow",
    "Action": ["iam:GetAccountPasswordPolicy"],
    "Resource": ["*"]
  }
]

```

What will this policy do?

- A. Allow this group to view the password policy of all the users added only to that group
- B. Allow all the users of IAM to modify their password
- C. Allow an IAM user in this group to view the password policy and modify only h is/herpassword 
- D. Allow this group to view the password policy of all the IAM users

<details><summary>Answer:</summary><p> C
  

Explanation:

This IAM policy grants access to the ChangePassword action, which lets the users use the console, the CLI, or the API to change their passwords. The Resource element uses a policy variable (aws:username), which is useful in policies that are attached to groups. The aws:username key resolves to the name of the current IAM user when a request is made, so that each user is allowed permission to change only his or her own password . This policy will allow all the users of this group to modify the passwords of all the IAM users.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html

</p></details><hr>

### QUESTION 252
For Amazon Inspector's integration with CloudTrail, what information is logged for List* and Describe* APIs?

- A. None.Amazon Inspector is an automated service and not monitor ed by CloudTrail.
- B. Both request and response information is logged.
- C. Only request information is logged.
- D. Request information is always logged.Resp on se information is logged only for Completed
assessment runs.

<details><summary>Answer:</summary><p> C

Explanation:

For the Amazon Inspector integration with CloudTrail, for the List* and Describe* APIs, only the request information is logged.

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/logging-using-cloudtrail.html

</p></details><hr>

### QUESTION 253
A user is defining a policy for the IAM user. Which of the below mentioned elements can be found in an IAM policy?

- A. NotEffect
- B. SupportedDataTypes
- C. PrincipalResource 
- D. VersionManagement

<details><summary>Answer:</summary><p> B

Explanation:

A user can define various elements for an IAM policy. The elements include Version, ID, Statement, Sid, Effect, Principal, Not Principal, Action, Not Action, Resource, Not Resource, Condition, and Supported Data Types

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_ElementDescriptions.html

</p></details><hr>

### QUESTION 254
Which statement is true about configuring proxy support for Amazon Inspector agent on Linux- based systems?

- A. Amazon Inspector proxy support on Linux-based systems is achieve d through install in g proxy-enabled version of the agent which comes with pre-configured files that you need to edit to match your environment.
- B. Amazon Inspector agent does NOT support the use of proxy on Linux-basedsystems.
- C. Amazon Inspector proxy configuration on Linux-based system is include d in aws agent.envfile
under /etc/init.d/
- D. Amazon Inspector agent proxy settings on Linux-based systems are configured through W in HTTP proxy.

<details><summary>Answer:</summary><p> C

Explanation:

To install an AWS agent on an EC2 instance that uses a proxy server Create a file called awsagent.env and save it in the /etc/init.d/ directory. Edit awsagent.env to include these environment variables in the following format:
export https_proxy=https://hostname:port
export http_proxy=http://hostname:port
export no_proxy= 123.456.789.111

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents-on-win.html#inspector-agent-proxy

</p></details><hr>

### QUESTION 255
Some of your EC2 instances are configured to use a Proxy. Can you use Amazon Inspector for regular assessment of instances behind proxy?

- A. OnlyWindows-based systems are supported as Linux-based systems use custom configuration s
that are not supported by AWS Agent in the current release.
- B. OnlyLinux-based systems are supported,and AWS agent supports HTTPS proxy on these
systems.
- C. No,AWS Agent does NOT support proxy environments.
- D. Yes,AWS Agent supports proxy environments on both Linux-basedandWindows-basedsystems.

<details><summary>Answer:</summary><p> D

Explanation:

The AWS agent supports proxy environments. For Linux instances, Inspector supports HTTPS Proxy, and for Windows instances, it supports WinHTTP proxy.

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents.html

</p></details><hr>

### QUESTION 256
Amazon Inspector agent collects telemetry data during assessment run and sends this data to Amazon Inspector dedicated S3 bucket for analysis. How can you access telemetry data out of Amazon Inspector and how can you benefit from this data in securing your resources?

- A. Telemetry data is kept in S3 and encrypted with a pre-assessment test key configured in KMS,as
long as you have access to that key you can download and decrypt telemetry data.
- B. Telemetry data is stored in Amazon Inspector dedic at ed S3 bucket that does NOT be long to your
account, Amazon Inspector currently does NOT provide an API or an S3 bucket access mechanism to collected telemetry. Data is retained temporarily only to allow for assistance with support requests.
- C. Telemetry data is save do n S3 bucket in your account,the re for e telemetry data is access ible with proper permissions on that bucket.
- D. Telemetry data is deleted im media tely after assessment run,the re for e data can NOT be access ed or analyzed by any other tools.

<details><summary>Answer:</summary><p> B
    

Explanation:

The telemetry data stored in S3 is retained only to allow for assistance with support requests and is not used or aggregated by Amazon for any other purpose. After 30 days, telemetry data is permanently deleted per a standard Amazon Inspector-dedicated S3 bucket lifecycle policy. At present, Amazon Inspector does not provide an API or an S3 bucket access mechanism to collected telemetry.

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents.html

</p></details><hr>

### QUESTION 257
A root owner is trying to create an IAM user of the various departments. The owner has created groups for each department, but wants to still delineate the user based on the sub division level.

- A. g.The two users from different sub departments should be ident if ied separate ly and have separate
permissions. How can the root owner configure this?
- B. Create a hier a rchy of the IAM users which are separate d based on the de part ment
- C. Createanestedgroup
- D. Use the path s to separate the users of the same group
- E. It is not possible to de line at e within a group

<details><summary>Answer:</summary><p> C

Explanation:

The path functionality within an IAM group and user allows them to delineate by further levels. In this case the user needs to use the path with each user or group so that the ARN of the user will look similar to:
arn:aws:iam::123456789012:user/division_abc/subdivision_xyz/user1 arn:aws:iam::123456789012:user/division_abc/subdivision_xyz/user2

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs

</p></details><hr>

### QUESTION 258
A user is defining a policy for an IAM user. Which of the below mentioned options is a valid version defined for the policy?

- A. "Version":"2014-01-01"
- B. "Version":"2011-10-17"
- C. "Version":"2013-10-17" 
- D. "Version":"2012-10-17"

<details><summary>Answer:</summary><p> D

Explanation:

When defining an IAM Policy, the version element specifies the policy language version. Only the following values are allowed:
2012-10-17. This is the current version of the policy language, and the user should use this version number for all the policies.
2008-10-17. This was an earlier version of the policy language. The user might see this version on the existing policies. Do not use this version for any new policies or any existing policies that are being updated.
If a version element is not included, the value defaults to 2008-10-17.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_ElementDescriptions.html
  
</p></details><hr>

### QUESTION 259
Which command will start an assessment run?

- A. aws inspector start-assessment-run--assessment-template-arn[template-arn]
- B. aws inspector start-assessment-run--assessment-run-nameexamplerun--assessment-target
[target-arn]
- C. aws inspector start-assessment-run--assessment-run-nameexamplerun
- D. aws inspector start-assessment-run--assessment-run-nameexamplerun--assessment-
duration
<duration-in-seconds>

<details><summary>Answer:</summary><p> A

Explanation:

start-assessment-run command requires --assessment-template-arn, other parameters are optional
start-assessment-run
--assessment-template-arn
<value> [--assessment-run-
name <value>]
[--cli-input-json <value>]
[--generate-cli-skeleton
<value>] 

Reference: http://docs.aws.amazon.com/cli/latest/reference/inspector/start-assessment-run.html

</p></details><hr>

### QUESTION 260
Which statement is true about configuring proxy support for Amazon Inspector agent ona Windows-basedsystem?

- A. AmazonInspectoragentsupportsproxyusageonWindows-basedsystemsthroughtheuse
of the WinHTTP proxy.
- B. AmazonInspectoragentsupportsproxyusageonLinux-basedsystemsbutnotonWindows.
- C. AmazonInspectorproxysupportonWindows-basedsystemsisachievedthroughinstalling
proxy- enabled version of the agent which comes with preconfigured files that you need to
edittomatch yourenvironment.
- D. AmazonInspectoragentsupportsproxyusageonWindows-basedsystemsthrough aws agent. env configuration file. 

<details><summary>Answer:</summary><p> A

Explanation:

Proxy support for AWS agents is achieved through the use of the WinHTTP proxy. 

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents-on-win.html#inspector-agent-proxy

</p></details><hr>

### QUESTION 261
What is the default maximum number of Roles per AWS account?

- A. 500
- B. 250
- C. 100
- D. Thereisnolimit.

<details><summary>Answer:</summary><p> B
</p></details><hr>
