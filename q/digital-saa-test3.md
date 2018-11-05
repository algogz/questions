### Question 1: 

Which service uses a simple text file to model and provision infrastructure resources, in an automated and secure manner?

- A. Simple Workflow Service
- B. ElasticBeanstalk
- C. OpsWorks
- D. CloudFormation 

<details><summary>Answer:</summary><p>
D

Explanation:

AWS CloudFormation is a service that gives developers and businesses an easy way to create a collection of related AWS resources and provision them in an orderly and predictable fashion

CloudFormation can be used to provision a broad range of AWS resources

Think of CloudFormation as deploying infrastructure as code

Uses templates: Architectural designs Create, update and delete templates Written in JSON or YAML CloudFormation determines the order of provisioning Don’t need to worry about dependencies Modify and updates templates in a controlled way (version control) Designer allows you to visualise using a drag and drop interface

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudformation/

</p></details><hr>

### Question 2: 

What is the AWS Lambda resource limit for the amount of ephemeral disk capacity allocated per invocation?

- A. 256 MB
- B. 2 GB
- C. 512 MB 
- D. 512 KB
- E. 1 GB

<details><summary>Answer:</summary><p>
C

Explanation:

AWS Lambda lets you run code as functions without provisioning or managing servers

Limits: Memory – minimum 128MB, maximum 3008MB in 64MB increments Ephemeral disk capacity (/tmp space) per invocation – 512 MB Number of file descriptors – 1024 Number of processes and threads (combined) – 1024 Maximum execution duration per request – 300 seconds Concurrent executions per account – 1000 (soft limit)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

</p></details><hr>

### Question 3: 

You are a Solutions Architect at Digital Cloud Guru. A client from the agricultural sector has approached you for some advice around the collection of a large volume of data from sensors they have deployed around the country. An application will collect data from over 100,000 sensors and each sensor will send around 1KB of data every minute. The data needs to be stored in a durable, low latency data store. The client also needs historical data that is over 1 year old to be moved into a data warehouse where they can perform analytics using standard SQL queries. What combination of AWS services would you recommend to the client? (choose 2)

- A. DynamoDB for data ingestion 
- B. Kinesis Data Streams for data ingestion
- C. EMR for analytics
- D. RedShift for the analytics 

<details><summary>Answer:</summary><p>
AD

Explanation:

Amazon Kinesis makes it easy to collect, process, and analyze real-time, streaming data so you can get timely insights and react quickly to new information

EMR utilizes a hosted Hadoop framework running on Amazon EC2 and Amazon S3

Amazon Dynamo DB is a fully managed NoSQL database service that provides fast and predictable performance with seamless scalability

DynamoDB provides low read and write latency

Amazon Redshift is a fast, fully managed data warehouse that makes it simple and cost-effective to analyze all your data using standard SQL and existing Business Intelligence (BI) tools

RedShift is a SQL based data warehouse used for analytics applications

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-redshift/

</p></details><hr>

### Question 4: 

You are planning to deploy a number of EC2 instances in your VPC. The EC2 instances will be deployed across several subnets and multiple AZs. What AWS feature can act as an instance-level firewall to control traffic between your EC2 instances?

- A. Security Group 
- B. Network ACL
- C. AWS WAF
- D. Route table

<details><summary>Answer:</summary><p>
A

Explanation:

Network ACL’s function at the subnet level

Route tables are not firewalls

Security groups act like a firewall at the instance level

Specifically, security groups operate at the network interface level

AWS WAF is a web application firewall and does not work at the instance level

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 5: 

In Route 53 which record type can be used to point a domain’s zone apex record to an ELB?

- A. AAAA
- B. Alias 
- C. CNAME
- D. A

<details><summary>Answer:</summary><p>
B

Explanation:

The Alias record is a Route 53 specific record type

Alias records are used to map resource record sets in your hosted zone to Amazon Elastic Load Balancing load balancers, Amazon CloudFront distributions, AWS Elastic Beanstalk environments, or Amazon S3 buckets that are configured as websites

Alias records work like a CNAME record in that you can map one DNS name (e.g. example.com) to another ‘target’ DNS name (e.g. elb1234.elb.amazonaws.com)

You cannot set the TTL for Alias records for ELB, S3, or Elastic Beanstalk environment (uses the service’s default)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 6: *

You have created an application in a VPC that uses a Network Load Balancer (NLB). The application will be offered in a service provider model for AWS principals in other accounts within the region to consume. Based on this model, what AWS service will be used to offer the service for consumption?

- A. VPC Endpoint Services using AWS PrivateLink 
- B. IAM Role Based Access Control
- C. API Gateway
- D. Route 53

<details><summary>Answer:</summary><p>
A

Explanation:

An Interface endpoint uses AWS PrivateLink and is an elastic network interface (ENI) with a private IP address that serves as an entry point for traffic destined to a supported service

Using PrivateLink you can connect your VPC to supported AWS services, services hosted by other AWS accounts (VPC endpoint services), and supported AWS Marketplace partner services

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 7: Incorrect*

You are developing an application that uses Lambda functions. You need to store some sensitive data that includes credentials for accessing the database tier. You are planning to store this data as environment variables within Lambda. How can you ensure this sensitive information is properly secured?

- A. This cannot be done, only the environment variables that relate to the Lambda function itself can be encrypted
- B. Store the environment variables in an encrypted DynamoDB table and configure Lambda to retrieve them as required
- C. There is no need to make any changes as all environment variables are encrypted by default with AWS Lambda 
- D. Use encryption helpers that leverage AWS Key Management Service to store the sensitive information as Ciphertext 

<details><summary>Answer:</summary><p>
D

Explanation:

Environment variables for Lambda functions enable you to dynamically pass settings to your function code and libraries, without making changes to your code

Environment variables are key-value pairs that you create and modify as part of your function configuration, using either the AWS Lambda Console, the AWS Lambda CLI or the AWS Lambda SD

You can use environment variables to help libraries know what directory to install files in, where to store outputs, store connection and logging settings, and more

When you deploy your Lambda function, all the environment variables you've specified are encrypted by default after, but not during, the deployment process. They are then decrypted automatically by AWS Lambda when the function is invoked

If you need to store sensitive information in an environment variable, we strongly suggest you encrypt that information before deploying your Lambda function

The Lambda console makes that easier for you by providing encryption helpers that leverage AWS Key Management Service to store that sensitive information as Ciphertext

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

https://docs.aws.amazon.com/lambda/latest/dg/env_variables.html

</p></details><hr>

### Question 8: 

Your company currently uses Puppet Enterprise for infrastructure and application management. You are looking to move some of your infrastructure onto AWS and would like to continue to use the same tools in the cloud. What AWS service provides a fully managed configuration management service that is compatible with Puppet Enterprise?

- A. CloudFormation
- B. OpsWorks 
- C. Elastic Beanstalk
- D. CloudTrail

<details><summary>Answer:</summary><p>
B

Explanation:

The only service that would allow you to continue to use the same tools is OpsWorks

AWS OpsWorks is a configuration management service that provides managed instances of Chef and Puppet

OpsWorks lets you use Chef and Puppet to automate how servers are configured, deployed, and managed across your Amazon EC2 instances or on-premises compute environments

OpsWorks is an automation platform that transforms infrastructure into code

Automates how applications are configured, deployed and managed

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-opsworks/

https://docs.aws.amazon.com/opsworks/latest/userguide/welcome.html

</p></details><hr>

### Question 9: 

Which statement is true about the Amazon S3 Standard Infrequently Accessed storage class (choose 2)

- A. Provides 99.999999999% durability of S3 objects 
- B. Provides 99.99% durability of S3 objects
- C. Provides 99.999999999% availability of S3 objects
- D. Provides 99.9% availability of S3 objects 

<details><summary>Answer:</summary><p>
AD

Explanation:

S3 Standard-IA is for durable, immediately available, infrequently accessed data

Provides 99.9% availability of S3 objects

Provides 99.999999999% durability of S3 objects

Provides 99% Availability SLA

Stored in 3 AZs

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 10: 

You have been instructed by your manager to perform an audit of resources that are not being used and that are incurring costs to the company. Which of the following will incur a cost? (choose 2)

- A. A running EC2 instance 
- B. A stopped EC2 instance
- C. A route table
- D. An Elastic IP that is being used
- E. EBS volumes 
- F. Using an Amazon VPC
- G. A launch configuration

<details><summary>Answer:</summary><p>
AE

Explanation:

A running EC2 instance incurs a cost

A stopped EC2 instance does not incur a cost, however you pay for any EBS storage consumed

There is no charge for VPC

There is no charge for a route table

You pay for Elastic IPs only when they are NOT being used

You pay for the storage consumed by EBS volumes

There is no charge for Auto Scaling launch configurations

https://aws.amazon.com/pricing/services/

</p></details><hr>

### Question 11: 

You have been asked to design a cloud-native application architecture using AWS services. What is a typical use case for SQS?

- A. Decoupling application components to ensure that there is no dependency on the availability of a single component 
- B. Sending emails to clients when a job is completed
- C. Providing fault tolerance for S3
- D. Co-ordination of work items between different human and non-human workers

<details><summary>Answer:</summary><p>
A

Explanation:

Amazon Simple Queue Service (Amazon SQS) is a web service that gives you access to message queues that store messages waiting to be processed

SQS offers a reliable, highly-scalable, hosted queue for storing messages in transit between computers

SQS is used for distributed/decoupled applications

Can be used with RedShift, DynamoDB, EC2, ECS, RDS, S3 and Lambda

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

### Question 12: 

You have a three-tier web application running on AWS that utilizes Route 53, ELB, Auto Scaling and RDS. One of the EC2 instances that is registered against the ELB fails a health check. What actions will the ELB take in this circumstance?

- A. The ELB will instruct Auto Scaling to terminate the instance and launch a replacement
- B. The ELB will stop sending traffic to the instance that failed the health check 
- C. The ELB will terminate the instance that failed the health check
- D. The ELB will update Route 53 by removing any references to the instance

<details><summary>Answer:</summary><p>
B

Explanation:

ELBs are not responsible for terminating EC2 instances. Auto Scaling can terminate instances that fail health checks

The default behavior is that the ELB will simply stop sending traffic to the instance that failed the health check

ELB does not send instructions to the ASG, the ASG has its own health checks and can also use ELB health checks to determine the status of instances

ELB does not update Route 53 records

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 13: 

You have been asked to recommend the best AWS storage solution for a client. The client requires a storage solution that provide a mounted file system for a Big Data and Analytics application. The client’s requirements include high throughput, low latency, read-after-write consistency and the ability to burst up to multiple GB/s for short periods of time. Which AWS service can meet this requirement?

- A. DynamoDB
- B. EFS 
- C. EBS
- D. S3

<details><summary>Answer:</summary><p>
B

Explanation:

EBS is mounted as a block device not a file system

S3 is object storage

EFS is a fully-managed service that makes it easy to set up and scale file storage in the Amazon Cloud

EFS is good for big data and analytics, media processing workflows, content management, web serving, home directories etc.

EFS uses the NFSv4.1 protocol which is a protocol for mounting fil systems (similar to Microsoft’s SMB)

DynamoDB is a fully managed NoSQL database

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-efs/

</p></details><hr>

### Question 14: 

You have been asked to take a snapshot of a non-root EBS volume that contains sensitive corporate data. It is essential that you capture a consistent snapshot of the EBS volume without disrupting the instance operation. What is the best way to achieve this?

- A. You can’t take a snapshot for a non-root EBS volume
- B. Un-mount the EBS volume, take the snapshot, then re-mount it again 
- C. Take the snapshot while the EBS volume is attached and the instance is running
- D. Stop the instance and take the snapshot

<details><summary>Answer:</summary><p>
B

Explanation:

Snapshots capture a point-in-time state of an instance

Snapshots are stored on S3

To take a consistent snapshot writes must be stopped (paused) until the snapshot is complete – if not possible the volume needs to be detached, or if it’s an EBS root volume the instance must be stopped

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 15: 

Which RDS DB instance events may force the DB to be taken offline during a maintenance window?

- A. Updating DB parameter groups
- B. Promoting a Read Replica
- C. Security patching 
- D. Selecting the Multi-AZ feature

<details><summary>Answer:</summary><p>
C

Explanation:

Maintenance windows are configured to allow DB instance modifications to take place such as scaling and software patching (some operations require the DB instance to be taken offline briefly)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 16: *

What two types of security policies are supported by the Elastic Load Balancer for SSL negotiations between the ELB and clients? (Choose 2)

- A. ELB predefined Security policies 
- B. Security groups
- C. None of the answers are correct
- D. Custom security policies 

<details><summary>Answer:</summary><p>
AD

Explanation:

AWS recommend that you always use the default predefined security policy

When choosing a custom security policy you can select the ciphers and protocols (only for CLB)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 17: Incorrect*

Your company stores important production data on S3 and you have been asked by your manager to ensure that data is protected from accidental deletion. What are the BEST ways to protect against accidental object deletion for data in an AWS S3 bucket? (choose 3)

- A. Copy your objects to another bucket in the same region 
- B. Use lifecycle actions to copy the data into Glacier 
- C. You do not need to do anything, by default versioning is enabled
- D. Enable versioning on the bucket 
- E. Use Cross Region Replication to replicate the data to an S3 bucket in another region 

<details><summary>Answer:</summary><p>
BDE

Explanation:

CRR is an Amazon S3 feature that automatically replicates data across AWS Regions

With CRR, every object uploaded to an S3 bucket is automatically replicated to a destination bucket in a different AWS Region that you choose

Versioning stores all versions of an object (including all writes and even if an object is deleted)

Versioning protects against accidental object/data deletion or overwrites

The copy operation can be used to: Generate additional copies of objects Renaming objects Changing the copy’s storage class or encryption at rest status Move objects across AWS locations/regions Change object metadata

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 18: *

What development languages can be used to write code for AWS Lambda? (choose 4)

- A. Node.JS 
- B. Ruby
- C. Java 
- D. C# 
- E. Python 
- F. Microsoft .Net

<details><summary>Answer:</summary><p>
ACDE

Explanation:

AWS Lambda supports code written in Node.js (JavaScript), Python, Java (Java 8 compatible), C# (.NET Core) and Go

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

</p></details><hr>

### Question 19: *

At which instance state are you able to attach an Elastic Network Interface to an EC2 instance? (Choose 3)

- A. While the instance is running (hot attach) 
- B. When the instance is stopped (warm attach) 
- C. When the instance is terminating (hot attach)
- D. During launch (cold attach) 
- E. When the instance is launched (hot attach)

<details><summary>Answer:</summary><p>
ABD

Explanation:

ENIs can be “hot attached” to running instances

ENIs can be “warm-attached” when the instance is stopped

ENIs can be “cold-attached” when the instance is launched

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 20: Incorrect

An EC2 instance in an Auto Scaling group that has been reported as unhealthy has been marked for replacement. What is the process Auto Scaling uses to replace the instance? (choose 2)

- A. Auto Scaling has to launch a replacement first before it can terminate the unhealthy instance 
- B. Auto Scaling will immediately terminate the instance 
- C. Auto Scaling will terminate the instance first, and then launch a replacement instance 
- D. Auto Scaling has to perform rebalancing first, and then terminate the instance 

<details><summary>Answer:</summary><p>
BC

Explanation:

If any health check returns an unhealthy status the instance will be terminated

If connection draining is enabled, Auto Scaling waits for in-flight requests to complete or timeout before terminating instances

Unlike AZ rebalancing, termination of unhealthy instances happens first, then Auto Scaling attempts to launch new instances to replace terminated instances

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 21: Incorrect*

Your company has an on-premise LDAP directory service. As part of a gradual migration into AWS you would like to integrate the LDAP directory with AWS’s Identity and Access Management (IAM) solutions so that existing users can authenticate against AWS services. What method would you suggest using to enable this integration?

- A. Develop an on-premise custom identity provider (IdP) and use the AWS Security Token Service (STS) to temporary security credentials 
- B. Use SAML to develop a direct integration from the on-premise LDAP directory to the relevant AWS services 
- C. Create a policy in IAM that references users in the on-premise LDAP directory
- D. Use AWS Simple AD and create a trust relationship with IAM

<details><summary>Answer:</summary><p>
A

Explanation:

The AWS Security Token Service (STS) is a web service that enables you to request temporary, limited-privilege credentials for IAM users or for users that you authenticate (federated users)

If your identity store is not compatible with SAML 2.0, then you can build a custom identity broker application to perform a similar function

The broker application authenticates users, requests temporary credentials for users from AWS, and then provides them to the user to access AWS resources

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_common-scenarios_federated-users.html

</p></details><hr>

### Question 22: *

A company needs to deploy virtual desktops to its customers in an AWS VPC, leveraging existing security controls. AWS Workspaces will be used as the virtual desktop solution. Which set of AWS services and features will meet the company’s requirements?

- A. A VPN connection, VPC NACLs and Security Groups
- B. AWS Directory Service and AWS IAM
- C. Amazon EC2, and AWS IAM
- D. A VPN connection, and AWS Directory Services 

<details><summary>Answer:</summary><p>
D

Explanation:

AWS Directory service includes:

- Active Directory Service for Microsoft Active Directory

- Simple AD

- AD Connector

The Active Directory Service for Microsoft AD and AD Connector both require a VPN or Direct Connect connection

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-directory-service/

</p></details><hr>

### Question 23: Incorrect*

An EC2 status check on an EBS volume is showing as insufficient-data. What is the most likely explanation?

- A. The checks have failed on the volume 
- B. The checks may still be in progress on the volume 
- C. The volume does not have enough data on it to check properly
- D. The checks require more information to be manually entered

<details><summary>Answer:</summary><p>
B

Explanation:

The possible values are ok, impaired, warning, or insufficient-data

If all checks pass, the overall status of the volume is ok

If the check fails, the overall status is impaired

If the status is insufficient-data, then the checks may still be taking place on your volume at the time

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVolumeStatus.html

</p></details><hr>

### Question 24: 

An application architect has requested some assistance with selecting a database for a new requirement. The database must provide high performance and scalability. The data will be structured and persistent and the DB must support complex queries using SQL and BI tools. Which AWS service will you recommend?

- A. ElastiCache
- B. RDS
- C. DynamoDB
- D. RedShift 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon Redshift is a fast, fully managed data warehouse that makes it simple and cost-effective to analyze all your data using standard SQL and existing Business Intelligence (BI) tools

RedShift is a SQL based data warehouse used for analytics applications

RedShift is an Online Analytics Processing (OLAP) type of DB

RedShift is used for running complex analytic queries against petabytes of structured data, using sophisticated query optimization, columnar storage on high-performance local disks, and massively parallel query execution

RedShift is ideal for processing large amounts of data for business intelligence

RedShift is 10x faster than a traditional SQL DB

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-redshift/

</p></details><hr>

### Question 25: *

You need to provide access to the AWS Management Console to a team of new application developers. The team members who perform the same role are assigned to a Microsoft Active Directory group and you have been asked to use Identity Federation and RBAC. Which AWS services would you use to configure this access? (choose 2)

- A. AWS IAM Groups
- B. AWS Directory Service AD Connector 
- C. AWS IAM Users
- D. AWS Directory Service Simple AD
- E. AWS IAM Roles 
- F. AWS IAM Policies

<details><summary>Answer:</summary><p>
BE

Explanation:

AD Connector is a directory gateway for redirecting directory requests to your on-premise Active Directory

AD Connector eliminates the need for directory synchronization and the cost and complexity of hosting a federation infrastructure

Connects your existing on-premise AD to AWS

Best choice when you want to use an existing Active Directory with AWS services

Roles are created and then “assumed” by trusted entities and define a set of permissions for making AWS service requests

With IAM Roles you can delegate permissions to resources for users and services without using permanent credentials (e.g. user name and password)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-directory-service/

</p></details><hr>

### Question 26: 

You have an unhealthy EC2 instance attached to an ELB that is being taken out of service. While the EC2 instance is being de-registered from the ELB, which ELB feature will cause the ELB to stop sending any new requests to the EC2 instance whilst allowing in-flight sessions to complete?

- A. ELB connection draining 
- B. ELB session affinity (sticky session)
- C. ELB proxy protocol
- D. ELB Cross zone load balancing

<details><summary>Answer:</summary><p>
A

Explanation:

Connection draining is enabled by default and provides a period of time for existing connections to close cleanly

When connection draining is in action an CLB will be in the status “InService: Instance deregistration currently in progress”

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 27: 

You need to create a file system that can be concurrently accessed by multiple EC2 instances within an AZ. The file system needs to support high throughput and the ability to burst. As the data that will be stored on the file system will be sensitive you need to ensure it is encrypted at rest and in transit. What storage solution would you implement for the EC2 instances?

- A. Add EBS volumes to each EC2 instance and configure data replication
- B. Add EBS volumes to each EC2 instance and use an ELB to distribute data evenly between the volumes
- C. Use the Elastic File System (EFS) and mount the file system using NFS v4.1 
- D. Use the Elastic Block Store (EBS) and mount the file system at the block level

<details><summary>Answer:</summary><p>
C

Explanation:

EFS is a fully-managed service that makes it easy to set up and scale file storage in the Amazon Cloud

EFS uses the NFSv4.1 protocol

Amazon EFS is designed to burst to allow high throughput levels for periods of time

EFS offers the ability to encrypt data at rest and in transit

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-efs/

</p></details><hr>

### Question 28: 

Which of the statements below is true about DynamoDB? (choose 3)

- A. Supports cross-region replication which allows you to replicate across regions 
- B. There is no default limit of the throughput you can provision
- C. Data is synchronously replicated across 3 AZs 
- D. To scale DynamoDB you must increase the instance size
- E. When reading data from Amazon DynamoDB, users can specify whether they want the read to be eventually consistent or strongly consistent 

<details><summary>Answer:</summary><p>
ACE

Explanation:

DynamoDB uses push button scaling in which you specify the read and write capacity units you need – it does not rely on instance sizes

Answers 2,3, and 4 are correct

There are limits on the throughput you can provision by default (region specific):

US East (N. Virginia) Region:

- Per table – 40,000 read capacity units and 40,000 write capacity units

- Per account – 80,000 read capacity units and 80,000 write capacity units

All Other Regions:

- Per table – 10,000 read capacity units and 10,000 write capacity units

- Per account – 20,000 read capacity units and 20,000 write capacity unit

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 29: 

You have been asked to describe the benefits of using AWS Lambda compared to EC2 instances. Which of the below statements are incorrect?

- A. With AWS lambda, the client is responsible for launching and administering the underlying AWS compute infrastructure 
- B. AWS Lambda scales automatically
- C. With AWS Lambda the customer does not have any responsibility for deploying and managing the compute infrastructure
- D. With AWS Lambda you only pay for what you use
- E. AWS Lambda runs on highly available infrastructure

<details><summary>Answer:</summary><p>
A

Explanation:

AWS Lambda lets you run code as functions without provisioning or managing servers

With serverless computing, your application still runs on servers, but all the server management is done by AWS

You cannot log in to the compute instances that run Lambda functions or customize the operating system or language runtime

Priced based on: Number of requests. First 1 million are free then $0.20 per 1 million Calculated from the time your code begins execution until it returns or terminates. Depends on the amount of memory allocated to a function

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

</p></details><hr>

### Question 30: 

You work for Digital Cloud Guru and have just created a number of IAM users in your AWS account. You need to ensure that the users are able to make API calls to AWS services. What else needs to be done?

- A. Create a set of Access Keys for the users 
- B. Set a password for each user
- C. Create a group and add the users to it
- D. Enable Multi-Factor Authentication for the users

<details><summary>Answer:</summary><p>
A

Explanation:

Access keys are a combination of an access key ID and a secret access key

You can assign two active access keys to a user at a time

These can be used to make programmatic calls to AWS when using the API in program code or at a command prompt when using the AWS CLI or the AWS PowerShell tools

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 31: Incorrect*

What is the best solution for ingesting and processing a very large number of data streams in near real time?

- A. EMR
- B. Kinesis Firehose 
- C. RedShift
- D. Kinesis Data Streams 

<details><summary>Answer:</summary><p>
D

Explanation:

Kinesis Data Streams enables you to build custom applications that process or analyze streaming data for specialized needs

Kinesis Data Streams enables real-time processing of streaming big data

Kinesis Data Streams is useful for rapidly moving data off data producers and then continuously processing the data

Kinesis Data Streams stores data for later processing by applications (key difference with Firehose which delivers data directly to AWS services)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

### Question 32: 

Which of the below are valid best practices when implementing AWS IAM? (choose 3)

- A. Created shared accounts for users with similar needs
- B. Configure MFA on the root account and for all privileged IAM users 
- C. Create Individual IAM Users 
- D. Assign passwords and access keys to all users, and ensure they are frequently rotating them
- E. Rotate passwords yearly
- F. Follow the principle of least privilege when assigning permissions to your IAM users and groups 

<details><summary>Answer:</summary><p>
BCF

Explanation:

Best practices include: Lock away the AWS root user access keys Create individual IAM users Use AWS defined policies to assign permissions whenever possible Use groups to assign permissions to IAM users Grant least privilege Use access levels to review IAM permissions Configure a strong password policy for users Enable MFA for privileged users Use roles for applications that run on AWS EC2 instances Delegate by using roles instead of sharing credentials Rotate credentials regularly Remove unnecessary credentials Use policy conditions for extra security Monitor activity in your AWS account

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 33: 

You are a Solutions Architect at Digital Cloud Guru and have been tasked with designing a 3-tier web application that is highly available and stateless. Which of the services below would you consider for storing the session state data? (choose 2)

- A. RDS
- B. ElastiCache 
- C. RedShift
- D. DynamoDB 

<details><summary>Answer:</summary><p>
BD

Explanation:

DynamoDB can be used for storing session state

Elasticache can be used for storing session state

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-elasticache/

</p></details><hr>

### Question 34: 

There is expected to be a large increase in write intensive traffic to a website you manage that registers users onto an online learning program. You are concerned about writes to the database being dropped and need to come up with a solution to ensure this does not happen. Which of the solution options below would be the best approach to take?

- A. Use CloudFront to cache the writes and configure the database as a custom origin
- B. Use RDS in a multi-AZ configuration to distribute writes across AZs
- C. Update the application to write data to an S3 bucket and provision additional EC2 instances to process the data and write it to the database
- D. Update the application to write data to an SQS queue and provision additional EC2 instances to process the data and write it to the database 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon Simple Queue Service (Amazon SQS) is a web service that gives you access to message queues that store messages waiting to be processed

SQS offers a reliable, highly-scalable, hosted queue for storing messages in transit between computers

SQS is used for distributed/decoupled applications

In this circumstance SQS will reduce the risk of writes being dropped and it the best option presented

RDS in a multi-AZ configuration will not help as writes are only made to the primary database

Though option 3 could potentially work, it is not the best option as SQS is recommended for decoupling application components

Option 4 is bogus as you cannot configure a database as a custom origin in CloudFront

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

### Question 35: 

For security reasons, you need to ensure that an On-Demand EC2 instance can only be accessed from a specific public IP address (100.156.52.12) using the SSH protocol. You are configuring the Security Group of the EC2 instance, and need to configure an Inbound rule. Which of the rules below will achieve the requirement?

- A. Protocol - TCP, Port Range - 22, Source 100.156.52.12/0
- B. Protocol - UDP, Port Range - 22, Source 100.156.52.12/32
- C. Protocol - UDP, Port Range - 22, Source 100.156.52.12/0
- D. Protocol - TCP, Port Range - 22, Source 100.156.52.12/32 

<details><summary>Answer:</summary><p>
D

Explanation:

Security groups act like a firewall at the instance level

Specifically security groups operate at the network interface level

Can only assign permit rules in a security group, cannot assign deny rule

There is an implicit deny rule at the end of the security group

All rules are evaluated until a permit is encountered or continues until the implicit deny

Can control ingress and egress traffic

Security groups are stateful

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 36: 

When using CloudWatch with EC2 what is the frequency of metric updates with basic monitoring?

- A. 1 minute
- B. 30 seconds
- C. 5 minutes 
- D. 100 seconds

<details><summary>Answer:</summary><p>
C

Explanation:

Basic monitoring = 5 mins (free for EC2 Instances, EBS volumes, ELBs and RDS DBs)

Detailed monitoring = 1 min (chargeable)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/amazon-cloudwatch/

</p></details><hr>

### Question 37: 

You are putting together a design for a three-tier web application. The application tier requires a minimum of 6 EC2 instances to be running at all times. You need to provide fault tolerance to ensure that the failure of a single Availability Zone (AZ) will not affect application performance. Which of the options below is the optimum solution to fulfil these requirements?

- A. Create an ASG with 12 instances spread across 4 AZs behind an ELB
- B. Create an ASG with 18 instances spread across 3 AZs behind an ELB
- C. Create an ASG with 9 instances spread across 3 AZs behind an ELB 
- D. Create an ASG with 6 instances spread across 3 AZs behind an ELB

<details><summary>Answer:</summary><p>
C

Explanation:

This is simply about numbers. You need 6 EC2 instances to be running even in the case of an AZ failure. The questions asks for the “optimum” solution so you don’t want to over provision

In the event of a single AZ failing (assuming an even spread of instances) we would have:

Option 1 leaves 12 instances running which is too many

Option 2 leaves 6 instances running so it is the correct answer

Option 3 leaves 4 instances running which is too few

Option 4 leaves 9 instances running which is too may

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 38: 

You need a service that can provide you with control over which traffic to allow or block to your web applications by defining customizable web security rules. You need to block common attack patterns, such as SQL injection and cross-site scripting, as well as creating custom rules for your own applications. Which AWS service fits these requirements?

- A. Route 53
- B. AWS WAF 
- C. Security Groups
- D. CloudFront

<details><summary>Answer:</summary><p>
B

Explanation:

AWS WAF is a web application firewall that helps detect and block malicious web requests targeted at your web applications

AWS WAF allows you to create rules that can help protect against common web exploits like SQL injection and cross-site scripting

With AWS WAF you first identify the resource (either an Amazon CloudFront distribution or an Application Load Balancer) that you need to protect

You then deploy the rules and filters that will best protect your applications

You can deploy, create, and maintain these web security rules in the AWS Management Console or using the AWS WAF API

https://aws.amazon.com/waf/details/

</p></details><hr>

### Question 39: Incorrect*

What connectivity options are available with AWS Direct Connect when using public and private VIFs? (Choose 3)

- A. You can connect to AWS services over the private VIF 
- B. Using an IPSec VPN you can connect over the public VIF to remote AWS regions 
- C. You can substitute your internet connection at your DC with AWS’s public Internet through the use of a NAT gateway in your VPC
- D. Once connected to your VPC through Direct connect you can connect to all AZs within the region 
- E. You can connect to your private VPC subnets over the public VIF
- F. You can connect to your private VPC subnets over the private VIF, and to Public AWS services over the public VIF 

<details><summary>Answer:</summary><p>
BDF

Explanation:

Each AWS Direct Connect connection can be configured with one or more virtual interfaces (VIFs)

Public VIFs allow access to public services such as S3, EC2, and DynamoDB

Private VIFs allow access to your VPC

Must use public IP addresses on public VIFs

Must use private IP addresses on private VIFs

You can establish IPSec connections over public VIFs to remote regions

AWS Direct Connect supports both single (IPv4) and dual stack (IPv4/IPv6) configurations on public and private VIFs

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/aws-direct-connect/

</p></details><hr>

### Question 40: Incorrect*

Which of the authentication options below can be used to control access to AWS APIs? (choose 3)

- A. Key pairs
- B. Server certificates 
- C. Console passwords 
- D. Access keys 
- E. Security groups 

<details><summary>Answer:</summary><p>
BCD

Explanation:

Key pairs are used for encrypting logon information when accessing EC2 instances

Access keys are a combination of an access key ID and a secret access key

A console password is a password that the user can enter to sign in to interactive sessions such as the AWS Management Console

Server certificates are SSL/TLS certificates that you can use to authenticate with some AWS services

Security groups are an instance-level firewall used for controlling access to AWS resources

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 41: *

The development team at your company have created a new mobile application that will be used by users to access confidential data. The developers have used Amazon Cognito for authentication, authorization, and user management. Due to the sensitivity of the data, there is a requirement to add another method of authentication in addition to a username and password. You have been asked to recommend the best solution. What is your recommendation?

- A. Enable multi-factor authentication (MFA) in IAM
- B. Use multi-factor authentication (MFA) with a Cognito user pool 
- C. Integrate IAM with a user pool in Cognito
- D. Integrate a third-party identity provider (IdP)

<details><summary>Answer:</summary><p>
B

Explanation:

A user pool is a user directory in Amazon Cognito

With a user pool, your users can sign in to your web or mobile app through Amazon Cognito

Your users can also sign in through social identity providers like Facebook or Amazon, and through SAML identity providers

IAM does not add another factor of authentication - factors include something you know (e.g. password), something you have (e.g. token device), and something you are (e.g. retina scan or fingerprint)

MFA ingrates with a user pool in Cognito

https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-mfa.html

</p></details><hr>

### Question 42: 

Which of the AWS services below can be used to store transient web session data for best performance and user experience?

- A. RDS
- B. ElastiCache 
- C. CloudFront
- D. DynamoDB

<details><summary>Answer:</summary><p>
B

Explanation:

Elasticache can be used for storing session state

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-elasticache/

</p></details><hr>

### Question 43: 

Which AWS service can be used to ensure the persistence of in-flight transactions independently of any single application component?

- A. CloudFormation
- B. DynamoDB
- C. SQS 
- D. ElastiCache

<details><summary>Answer:</summary><p>
C

Explanation:

In-flight messages are messages that have been picked up by a consumer but not yet deleted from the queue

Standard queues have a limit of 120,000 in-flight messages per queue

FIFO queues have a limit of 20,000 in-flight messages per queue

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

### Question 44: 

You work as a System Administrator at Digital Cloud Guru and your manager has asked you to investigate an EC2 web server hosting videos that is constantly running at over 80% CPU utilization. Which of the approaches below would you recommend to fix the issue?

- A. Create an Elastic Load Balancer and register the EC2 instance to it
- B. Create a CloudFront distribution and configure the Amazon EC2 instance as the origin 
- C. Create an Auto Scaling group from the instance using the CreateAutoScalingGroup action
- D. Create a Launch Configuration from the instance using the CreateLaunchConfiguration action

<details><summary>Answer:</summary><p>
B

Explanation:

CloudFront is a web service that gives businesses and web application developers an easy and cost-effective way to distribute content with low latency and high data transfer speeds

CloudFront is a good choice for distribution of frequently accessed static content that benefits from edge delivery—like popular website images, videos, media files or software downloads

An origin is the origin of the files that the CDN will distribute

Origins can be either an S3 bucket, an EC2 instance, and Elastic Load Balancer, or Route53) – can also be external (non-AWS)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-cloudfront/

</p></details><hr>

### Question 45: *

What application parameters can be defined in an ECS task definition? (choose 3)

- A. The container images to use and the repositories in which they are located 
- B. The ELB node to be used to scale the task containers
- C. The data volumes that should be used with the containers in the task 
- D. The ports that should be opened on the container instance for your application 

<details><summary>Answer:</summary><p>
ACD

Explanation:

Some of the parameters you can specify in a task definition include: Which Docker images to use with the containers in your task How much CPU and memory to use with each container Whether containers are linked together in a task The Docker networking mode to use for the containers in your task What (if any) ports from the container are mapped to the host container instances Whether the task should continue if the container finished or fails The commands the container should run when it is started Environment variables that should be passed to the container when it starts Data volumes that should be used with the containers in the task IAM role the task should use for permissions

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 46: Incorrect

You have implemented API Gateway and enabled a cache for a specific stage. How can you control the cache to enhance performance and reduce load on back-end services?

- A. Using CloudFront controls 
- B. Enable bursting
- C. Using time-to-live (TTL) settings 
- D. Configure the throttling feature

<details><summary>Answer:</summary><p>
C

Explanation:

You can throttle and monitor requests to protect your backend

Bursting isn’t an API Gateway feature

A cache can be created and specified in gigabytes (not enabled by default)

Caches are provisioned for a specific stage of your APIS

Caching features include customisable keys and time-to-live (TTL) in seconds for your API data which enhances response times and reduces load on back-end services

CloudFront is a bogus answer as even though it does have a cache of its own it won’t help you to enhance the performance of the API Gateway cache

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

</p></details><hr>

### Question 47: 

How can you ensure that the EBS volumes attached to an EC2 instance are still available after the instance is terminated?

- A. Take a snapshot of the EBS volume
- B. EBS volumes automatically persist after the EC2 instance is terminated
- C. Ensure the “DeleteOnTermination” attribute of the EBS volume is set to false while launching the instance 
- D. EBS volumes are always deleted when an EC2 instance is terminated

<details><summary>Answer:</summary><p>
C

Explanation:

Root EBS volumes are deleted on termination by default

Extra non-boot volumes are not deleted on termination by default

The behavior can be changed by altering the “DeleteOnTermination” attribute

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 48: 

CloudWatch automatically provides data including metrics and volume status checks for EBS volumes. There are two types of monitoring available, which type provides data in 5-minute intervals at no charge? What type of monitoring for Amazon EBS volumes is free and available automatically in 5-minute periods?

- A. Basic 
- B. Enterprise
- C. Business
- D. Detailed

<details><summary>Answer:</summary><p>
A

Explanation:

Basic monitoring = 5 mins (free for EC2 Instances, EBS volumes, ELBs and RDS DBs)

Detailed monitoring = 1 min (chargeable)

Enterprise and Business are support plans not CloudWatch monitoring types

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/amazon-cloudwatch/

</p></details><hr>

### Question 49: Incorrect

In CloudWatch, which of the following EC2 data points requires a custom metric to monitor?

- A. Memory utilization 
- B. Page file utilization
- C. Disk swap utilization
- D. All answers are correct 
- E. Disk space utilization

<details><summary>Answer:</summary><p>
D

Explanation:

The AWS/EC2 namespace includes the following instance metrics:

CPUUtilization

DiskReadOps

DiskWriteOps

DiskReadBytes

DiskWriteBytes

NetworkIn

NetworkOut

NetworkPacketsIn

NetworkPacketsOut

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/amazon-cloudwatch/

</p></details><hr>

### Question 50: 

Which statements about DynamoDB are correct? (choose 3)

- A. DynamoDB can be scaled by increasing the instance size
- B. With DynamoDB there is no limit on the size of a table 
- C. DynamoDB provides push-button scalability with no downtime 
- D. Data consistency can be configured as Eventually Consistent or Strongly Consistent 
- E. There is a limit on the amount of stored data and throughput

<details><summary>Answer:</summary><p>
BCD

Explanation:

Push button scaling means that you can scale the DB at any time without incurring downtime

Eventually consistent reads (Default):

- The eventual consistency option maximizes your read throughput (best read performance)

-An eventually consistent read might not reflect the results of a recently completed write

- Consistency across all copies reached within 1 second

Strongly consistent reads:

- A strongly consistent read returns a result that reflects all writes that received a successful response prior to the read (faster consistency)

Limits:

- 256 tables per account per region

- No limit on the size of a table

- Read/write capacity unit limits vary per region

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 51: Incorrect

Which of the below AWS services supports automated backups as a default configuration?

- A. EBS 
- B. EC2
- C. RedShift 
- D. S3

<details><summary>Answer:</summary><p>
C

Explanation:

RedShift uses replication and continuous backups to enhance availability and improve durability and can automatically recover from component and node failures

By default, Amazon Redshift retains backups for 1 day. You can configure this to be as long as 35 days

Manual backups are not automatically deleted when you delete a cluster

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-redshift/

</p></details><hr>

### Question 52: Incorrect*

A major upcoming sales event is likely to result in heavy read traffic to a web application your company manages. As the Solutions Architect you have been asked for advice on how best to protect the database tier from the heavy load and ensure the user experience is not impacted. The web application owner has also requested that the design is fault tolerant. The current configuration consists of a web application behind an ELB that uses Auto Scaling and an RDS MySQL database running in a multi-AZ configuration. As the database load is highly changeable the solution should allow elasticity by adding and removing nodes as required and should also be multi-threaded. What recommendations would you make?

- A. Deploy an ElastiCache Memcached cluster in multi-AZ mode in the same AZs as RDS 
- B. Deploy an ElastiCache Redis cluster with cluster mode disabled and multi-AZ with automatic failover
- C. Deploy an ElastiCache Memcached cluster in both AZs in which the RDS database is deployed 
- D. Deploy an ElastiCache Redis cluster with cluster mode enabled and multi-AZ with automatic failover

<details><summary>Answer:</summary><p>
C

Explanation:

ElastiCache is a web service that makes it easy to deploy and run Memcached or Redis protocol-compliant server nodes in the cloud

The in-memory caching provided by ElastiCache can be used to significantly improve latency and throughput for many read-heavy application workloads or compute-intensive workloads

Memcached

- Not persistent

- Cannot be used as a data store

- Supports large nodes with multiple cores or threads

- Scales out and in, by adding and removing nodes

Redis

- Data is persistent

- Can be used as a datastore

- Not multi-threaded

- Scales by adding shards, not nodes

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-elasticache/

https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/SelectEngine.html

</p></details><hr>

### Question 53: 

What is the effect of disabling automated backups on an AWS RDS instance?

- A. You will lose the point in time recovery capability 
- B. The maintenance window will be disabled
- C. You will not be able to take snapshots
- D. You will no longer be able to perform any backups

<details><summary>Answer:</summary><p>
A

Explanation:

Automated backups allow point in time recovery to any point within the retention period down to a second

When automated backups are turned on for your DB Instance, Amazon RDS automatically performs a full daily snapshot of your data (during your preferred backup window) and captures transaction logs (as updates to your DB Instance are made)

Automated backups are enabled by default and data is stored on S3 and is equal to the size of the DB

Amazon RDS retains backups of a DB Instance for a limited, user-specified period of time called the retention period, which by default is 7 days but can be set to up to 35 days

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 54: 

Which of the below use cases are a good fit for DynamoDB (choose 2)

- A. Large amounts of dynamic data that require very low latency 
- B. Complex queries and joins
- C. Rapid ingestion of clickstream data 
- D. Backup for on-premises Oracle DB

<details><summary>Answer:</summary><p>
AC

Explanation:

Amazon Dynamo DB is a fully managed NoSQL database service that provides fast and predictable performance with seamless scalability

Provides low read and write latency

SSD based and uses limited indexing on attributes for performance

DynamoDB can do 10,000/40,000 (depends on region) write or read capacity units per second

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 55: 

Which of the statements below are true regarding CloudFormation? (choose 3)

- A. Allows you to model your entire infrastructure in a text file 
- B. You pay for AWS resources created using AWS CloudFormation in the same manner as if you created them manually 
- C. It is used to collect and track metrics, collect and monitor log files, and set alarms
- D. It provides visibility into user activity by recording actions taken on your account
- E. It provides a common language for you to describe and provision all the infrastructure resources in your cloud environment 

<details><summary>Answer:</summary><p>
ABE

Explanation:

Answers 1,4, and 5 are CloudFormation features

Answer 2 is incorrect as this is a feature of CloudWatch

Answer 3 is incorrect as this is a feature of CloudTrail

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudformation/

</p></details><hr>

### Question 56: 

You are a Solutions Architect at Digital Cloud Guru. One of your clients is an online media company that attracts a large volume of users to their website each day. The media company are interested in analyzing the user’s clickstream data so they can analyze user behavior in real-time and dynamically update advertising. This intelligent approach to advertising should help them to increase conversions. What would you suggest as a solution to assist them with capturing and analyzing this data?

- A. Use Kinesis Data Streams to process and analyze the clickstream data. Store the results in DynamoDB and create an application component that reads the data from the database and updates the website 
- B. Use EMR to process and analyze the data in real-time and Lambda to update the website based on the results
- C. Update the application to write data to an SQS queue, and create an additional application component to analyze the data in the queue and update the website
- D. Write the data directly to RedShift and use Business Intelligence tools to analyze the data

<details><summary>Answer:</summary><p>
A

Explanation:

Kinesis Data Streams enables you to build custom applications that process or analyze streaming data for specialized needs

Kinesis Data Streams enables real-time processing of streaming big data

Kinesis Data Streams is useful for rapidly moving data off data producers and then continuously processing the data

Kinesis Data Streams architecture:

- Producers continually push data to Kinesis Data Streams

- Consumers process the data in real time

- Consumers can store their results using an AWS service such as Amazon DynamoDB, Amazon Redshift, or Amazon S3

- Kinesis Streams applications are consumers that run on EC2 instances

SQS does not provide a solution for analyzing the data

RedShift is a data warehouse and good for analytics on structured data. It is not used for real time ingestion

EMR utilizes a hosted Hadoop framework running on Amazon EC2 and Amazon S3 and is used for processing large quantities of data. It is not suitable for this solution

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

### Question 57: 

You are a Solutions Architect at Digital Cloud Guru and you have been tasked with designing a new service on AWS. You need to determine which AWS services can log API calls and provide data that can be used for auditing and compliance purposes.

- A. CloudWatch
- B. Kinesis
- C. CloudTrail 
- D. Amazon S3

<details><summary>Answer:</summary><p>
C

Explanation:

CloudTrail is for auditing (CloudWatch is for performance monitoring)

CloudTrail is about logging and saves a history of API calls for your AWS account

Provides visibility into user activity by recording actions taken on your account

API history enables security analysis, resource change tracking, and compliance auditing

CloudTrail Logs API calls made via:

- AWS Management Console

- AWS SDKs

- Command line tools

- Higher-level AWS services (such as CloudFormation)

CloudTrail records account activity and service events from most AWS services and logs the following records:

- The identity of the API caller

- The time of the API call

- The source IP address of the API caller

- The request parameters

- The response elements returned by the AWS service

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudtrail/

</p></details><hr>

### Question 58: *

You would like to deploy EC2 instance with enhanced networking. What are the pre-requisites for using enhanced networking? (Choose 2)

- A. Instances must be EBS backed, not Instance-store backed
- B. Instances must be of T2 Micro type
- C. Instances must be launched from a PV AMI
- D. Instances must be launched in a VPC 
- E. Instances must be launched from a HVM AMI 

<details><summary>Answer:</summary><p>
DE

Explanation:

AWS currently supports enhanced networking capabilities using SR-IOV

SR-IOV provides direct access to network adapters, provides higher performance (packets-per-second) and lower latency

Must launch an HVM AMI with the appropriate drivers

Only available for certain instance types

Only supported in VPC

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 59: 

What two methods would allow you to encrypt data stored in S3 buckets at rest (choose 2)

- A. Use Multipart upload with SSL
- B. Make use of AWS S3 bucket policies to control access to the data at rest
- C. Use AWS S3 server-side encryption with Key Management Service keys or Customer-provided keys 
- D. Encrypt the data at the source using the client's CMK keys before transferring it to S3 

<details><summary>Answer:</summary><p>
CD

Explanation:

Client side – encrypted on the client side and transferred in an encrypted state

Server-Side Encryption – data is encrypted by S3 before it is written to disk (data is decrypted when it is downloaded)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 60: *

You run a two-tier application with a web tier that is behind an Internet-facing Elastic Load Balancer (ELB). You need to restrict access to the web tier to a specific list of public IP addresses. What are two possible ways you can implement this requirement? (Choose 2)

- A. Configure the ELB security group to allow traffic only from the specific list of IPs 
- B. Configure the VPC internet gateway to allow incoming traffic from these IP addresses
- C. Configure your ELB to send the X-forwarded for headers and the web servers to filter traffic based on the ELB’s “X-forwarded-for” header 
- D. Configure a VPC NACL to allow web traffic from the list of IPs and deny all outbound traffic

<details><summary>Answer:</summary><p>
AC

Explanation:

X-forwarded-for for HTTP/HTTPS carries the source IP/port information

X-forwarded-for only applies to L7

Security groups control the ports and protocols that can reach the front-end listener

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 61: 

Which statements are true about Amazon Route 53? (choose 2)

- A. Amazon Route 53 supports MX records 
- B. Amazon Route 53 does not support SPF records
- C. Amazon Route 53 is an internal load balancer
- D. You can register domain names via Amazon Route 53 

<details><summary>Answer:</summary><p>
AD

Explanation:

Amazon Route 53 is a highly available and scalable Domain Name System (DNS) service

Route 53 offers the following functions:

- Domain name registry

- DNS resolution

- Health checking of resources

Health checks verify Internet connected resources are reachable, available and functional

Routing policies include Simple, Weighted, Latency-based, Failover and Geo-Location

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 62: 

You are creating a design for an internal-only AWS service that uses EC2 instances to process information on S3 and store the results in DynamoDB. You need to allow access to several developers who will be testing code and need to apply security best practices to the architecture. Which of the security practices below are recommended? (choose 2)

- A. Assign an IAM user for each EC2 instance
- B. Store the access keys and secret IDs within the application
- C. Use bastion hosts to enforce control and visibility 
- D. Disable root API access keys and secret key 

<details><summary>Answer:</summary><p>
CD

Explanation:

Best practices for securing operating systems and applications include: Disable root API access keys and secret key Restrict access to instances from limited IP ranges using Security Groups Password protect the .pem file on user machines Delete keys from the authorized_keys file on your instances when someone leaves your organization or no longer requires access Rotate credentials (DB, Access Keys) Regularly run least privilege checks using IAM user Access Advisor and IAM user Last Used Access Keys Use bastion hosts to enforce control and visibility

https://d1.awsstatic.com/whitepapers/Security/AWS_Security_Best_Practices.pdf

</p></details><hr>

### Question 63: 

You are a Solutions Architect for an insurance company. An application you manage is used to store photos and video files that relate to insurance claims. The application writes data using the iSCSI protocol to a storage array. The array currently holds 10TB of data and is approaching capacity. Your manager has instructed you that he will not approve further capital expenditure for on-premises infrastructure. Therefore, you are planning to migrate data into the cloud. How can you move data into the cloud whilst retaining low-latency access to frequently accessed data on-premise using the iSCSI protocol?

- A. Use an AWS Storage Gateway File Gateway in cached volume mode
- B. Use an AWS Storage Gateway Volume Gateway in stored volume mode
- C. Use an AWS Storage Gateway Volume Gateway in cached volume mode 
- D. Use an AWS Storage Gateway Virtual Tape Library

<details><summary>Answer:</summary><p>
C

Explanation:

The AWS Storage Gateway service enables hybrid storage between on-premises environments and the AWS Cloud

It provides low-latency performance by caching frequently accessed data on premises, while storing data securely and durably in Amazon cloud storage services

AWS Storage Gateway supports three storage interfaces: file, volume, and tape

File:

- File gateway provides a virtual on-premises file server, which enables you to store and retrieve files as objects in Amazon S3

- File gateway offers SMB or NFS-based access to data in Amazon S3 with local caching -- the question asks for an iSCSI (block) storage solution so a file gateway is not the right solution

Volume:

- The volume gateway represents the family of gateways that support block-based volumes, previously referred to as gateway-cached and gateway-stored modes

- Block storage – iSCSI based – the volume gateway is the correct solution choice as it provides iSCSI (block) storage which is compatible with the existing configuration

Tape:

- Used for backup with popular backup software

- Each gateway is preconfigured with a media changer and tape drives. Supported by NetBackup, Backup Exec, Veeam etc.

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/aws-storage-gateway/

</p></details><hr>

### Question 64: 

You have been asked to deploy a new High-Performance Computing (HPC) cluster. You need to create a design for the EC2 instances that ensures close proximity, low latency and high network throughput. Which AWS features will help you to achieve this requirement? (Choose 2)

- A. Use Placement groups 
- B. Use Provisioned IOPS EBS volumes
- C. Launch I/O Optimized EC2 instances in one private subnet in an AZ
- D. Use EC2 instances with Enhanced Networking 

<details><summary>Answer:</summary><p>
AD

Explanation:

Placement groups are a logical grouping of instances in one of the following configurations:

- Cluster—clusters instances into a low-latency group in a single AZ

- Spread—spreads instances across underlying hardware (can span AZs)

Recommended for applications that benefit from low latency and high bandwidth

Recommended to use an instance type that supports enhanced networking

Instances within a placement group can communicate with each other using private or public IP addresses

Best performance is achieved when using private IP addresses

Using public IP addresses the performance is limited to 5Gbps or less

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 65: 

Your Business Intelligence team use SQL tools to analyze data. What would be the best solution for performing queries on structured data that is being received at a high velocity?

- A. Kinesis Firehose with RDS
- B. EMR running Apache Spark
- C. EMR using Hive
- D. Kinesis Firehose with RedShift 

<details><summary>Answer:</summary><p>
D

Explanation:

Kinesis Data Firehose is the easiest way to load streaming data into data stores and analytics tools

Firehose Destinations include: Amazon S3 Amazon Redshift Amazon Elasticsearch Service Splunk

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

