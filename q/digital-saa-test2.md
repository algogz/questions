### Question 1: 

You are designing a web application that requires high performance and consistent user experience. Which AWS service would be best suited to storing transient session state data

- A. RDS
- B. Auto Scaling
- C. RedShift
- D. ElastiCache 

<details><summary>Answer:</summary><p>
D

Explanation:

The in-memory caching provided by ElastiCache can be used to significantly improve latency and throughput for many read-heavy application workloads or compute-intensive workloads

ElastiCache can be used for storing session state

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-elasticache/

</p></details><hr>

### Question 2: *

In the Elastic Block Store (EBS), what values are reserved by AWS for the root device volume for a HVM AMI? (choose 2)

- A. /dev/sda1 
- B. /dev/xvda 
- C. /dev/sdf
- D. /dev/nvme0

<details><summary>Answer:</summary><p>
AB

Explanation:

For HVM AMIs the reserved device names for root volumes are /dev/sda1 and /dev/xvda

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html

</p></details><hr>

### Question 3: *

You are considering the security and durability of your data that is stored in Amazon EBS volumes. Which of the statements below is true?

- A. You can define the number of AZs to replicate your data to via the API
- B. EBS volumes are backed by Amazon S3 which replicates data across multiple facilities within a region
- C. EBS volumes are replicated across AZs to protect you from loss of access to an individual AZ
- D. EBS volumes are replicated within their Availability Zone (AZ) to protect you from component failure 

<details><summary>Answer:</summary><p>
D

Explanation:

EBS volume data is replicated across multiple servers in an AZ

EBS volumes must be in the same AZ as the instances they are attached to

Snapshots are stored on S3

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

</p></details><hr>

### Question 4: *

You would like to host a static website for digitalcloud.guru on AWS. You will be using Route 53 to direct traffic to the website. Which of the below steps would help you achieve your objectives? (Choose 2)

- A. Create an S3 bucket named digitalcloud.guru 
- B. Create a “CNAME” record that points to the S3 bucket
- C. Use any existing S3 bucket that has public read access enabled
- D. Create an “Alias” record that points to the S3 bucket 

<details><summary>Answer:</summary><p>
AD

Explanation:

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 5: 

There are two business units in your company that each have their own VPC. A company restructure has resulted in the need to work together more closely and you would like to configure VPC peering between the two VPCs. VPC A has a CIDR block of 172.16.0.0/16 and VPC B has a CIDR block of 10.0.0.0/16. You have created a VPC peering connection with the ID: pcx-11112222. How should the route tables be configured to allow full access to the entire CIDR block of the VPC peer? (choose 4)

- A. Destination 172.16.0.0/16 and target Local in VPC B
- B. Destination 172.16.0.0/16 and target pcx.11112222 in VPC B 
- C. Destination 10.0.0.0/16 and target pcx-11112222 in VPC A 
- D. Destination 172.16.0.0/16 and target Local in VPC A 
- E. Destination 10.0.0.0/16 and target pcx-11112222 in VPC B
- F. Destination 10.0.0.0/16 and target Local in VPC B 

<details><summary>Answer:</summary><p>
BCDF

Explanation:

Refer to the URL below for more details around this scenario

https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/peering-configurations-full-access.html

</p></details><hr>

### Question 6: Incorrect*

Which statements are true about Amazon Route 53? (choose 2)

- A. You can automatically register EC2 instances with private hosted zones
- B. You can transfer domains to Route 53 even if the Top-Level Domain (TLD) is unsupported 
- C. Route 53 can be used to route Internet traffic for domains registered with another domain registrar 
- D. You cannot automatically register EC2 instances with private hosted zones 

<details><summary>Answer:</summary><p>
CD

Explanation:

You can transfer domains to Route 53 only if the Top Level Domain (TLD) is supported

You cannot automatically register EC2 instances with private hosted zones (would need to be scripted)

Route 53 can be used to route Internet traffic for domains registered with another domain registrar (any domain)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 7: 

You are creating an operational dashboard in CloudWatch for a number of EC2 instances running in your VPC. Which one of the following metrics will not be available by default?

- A. CPU utilization
- B. Disk read operations
- C. Memory usage 
- D. Network in and out

<details><summary>Answer:</summary><p>
C

Explanation:

There is no standard metric for memory usage on EC2 instances

Use the AWS website link above for a comprehensive list of the metrics that are collected

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudformation/

https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ec2-metricscollected.html

</p></details><hr>

### Question 8: Incorrect*

You created a new Auto Scaling Group (ASG) with two subnets across AZ1 and AZ2 in your VPC. You set the minimum size to 6 instances. After creating the ASG you noticed that all EC2 instances were launched in AZ1 due to limited capacity of the required instance family within AZ2. You’re concerned about the imbalance of resources. What would be the expected behavior of Auto Scaling once the capacity constraints are resolved in AZ2?

- A. The ASG will not do anything until the next scaling event 
- B. The ASG will try to rebalance by first creating three new instances in AZ2 and then terminating three instances in AZ1 
- C. The ASG will launch three additional EC2 instances in AZ2 and keep the six in AZ1
- D. The ASG will launch six additional EC2 instances in AZ2

<details><summary>Answer:</summary><p>
B

Explanation:

Auto Scaling can perform rebalancing when it finds that the number of instances across AZs is not balanced

Auto Scaling rebalances by launching new EC2 instances in the AZs that have fewer instances first, only then will it start terminating instances in AZs that had more instances

An imbalance may occur due to:

- Manually removing AZs/subnets from the configuration

- Manually terminating EC2 instances

- EC2 capacity issues

- Spot price is reached

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 9: Incorrect*

You have launched a Spot instance on EC2 for working on an application development project. In the event of an interruption what are the possible behaviors that can be configured? (choose 3)

- A. Terminate 
- B. Take a snapshot 
- C. Hibernate 
- D. Save 
- E. Restart
- F. Stop 

<details><summary>Answer:</summary><p>
ACF

Explanation:

You can specify whether Amazon EC2 should hibernate, stop, or terminate Spot Instances when they are interrupted

You can choose the interruption behavior that meets your needs

The default is to terminate Spot Instances when they are interrupted

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-interruptions.html

</p></details><hr>

### Question 10: 

One of your clients has asked you for some advice on an issue they are facing regarding storage. The client uses an on-premise block based storage array which is getting close to capacity. The client would like to maintain a configuration where reads/writes to a subset of frequently accessed data are performed on-premise whilst also alleviating the local capacity issues by migrating data into the AWS cloud. What would you suggest as the BEST solution to the client’s current problems?

- A. Archive data that is not accessed regularly straight into Glacier
- B. Use S3 copy command to copy data into the AWS cloud
- C. Implement a Storage Gateway Virtual Tape Library, backup the data and then delete the data from the array
- D. Implement a Storage Gateway Volume Gateway in cached mode 

<details><summary>Answer:</summary><p>
D

Explanation:

Backing up the data and then deleting it is not the best solution when much of the data is accessed regularly

A Storage Gateway Volume Gateway in cached mode will store the entire dataset on S3 and a cache of the most frequently accessed data is cached on-site

The S3 copy command doesn’t help here as the data is not in S3

You cannot archive straight into Glacier, you must store data on S3 first. Also, archiving is not the best solution to this problem

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/aws-storage-gateway/

</p></details><hr>

### Question 11: Incorrect*

Your company is opening a new office in the Asia Pacific region. Users in the new office will need to read data from an RDS database that is hosted in the U.S. To improve performance, you are planning to implement a Read Replica of the database in the Asia Pacific region. However, your Chief Security Officer (CSO) has explained to you that the company policy dictates that all data that leaves the U.S must be encrypted at rest. The master RDS DB is not currently encrypted. What options are available to you? (choose 2)

- A. You can encrypt the master RDS DB and also have an encrypted Read Replica that is encrypted with the same key
- B. You can encrypt the master RDS DB and also have an encrypted Read Replica that is encrypted with a different key 
- C. You can use an encrypted EBS volume for the Read Replica 
- D. You can leave the master RDS DB unencrypted and encrypt the Read Replica 

<details><summary>Answer:</summary><p>
BD

Explanation:

You can encrypt your Amazon RDS instances and snapshots at rest by enabling the encryption option for your Amazon RDS DB instance

Data that is encrypted at rest includes the underlying storage for a DB instance, its automated backups, Read Replicas, and snapshots

A Read Replica of an Amazon RDS encrypted instance is also encrypted using the same key as the master instance when both are in the same region

If the master and Read Replica are in different regions, you encrypt using the encryption key for that region

You can create an encrypted Read Replica of an unencrypted DB instance, but you can't create an unencrypted Read Replica of an encrypted DB instance

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Encryption.html

</p></details><hr>

### Question 12: 

You are a Solutions Architect at Digital Cloud Guru. One of your clients is expanding their operations into multiple AWS regions around the world. The client has requested some advice on how to leverage their existing AWS Identity and Access Management (IAM) configuration in other AWS regions. What advice would you give to your client?

- A. The client will need to create a VPC peering configuration with each remote AWS region and then allow IAM access across regions
- B. IAM is a global service and the client can use users, groups, roles, and policies in any AWS region 
- C. The client can use Amazon Cognito to create a single sign-on configuration across multiple AWS regions
- D. IAM is a regional service and the client will need to copy the configuration items required across to other AWS regions

<details><summary>Answer:</summary><p>
B

Explanation:

IAM is universal (global) and does not apply to regions

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 13: 

Which of the following are characteristics of Amazon API Gateway? (Choose 3)

- A. API Gateway is a network service that provides an alternative to using the Internet to connect customers’ on-premise sites to AWS
- B. API Gateway handles all of the tasks involved in accepting and processing up to hundreds of thousands of concurrent API calls 
- C. Throttling can be configured at multiple levels including Global and Service Call 
- D. API Gateway is a fully managed service that makes it easy for developers to publish, maintain, monitor, and secure APIs at any scale 
- E. API Gateway is a web service that gives businesses and web application developers an easy and cost-effective way to distribute content with low latency and high data transfer speeds

<details><summary>Answer:</summary><p>
BCD

Explanation:

An Amazon API Gateway is a collection of resources and methods that are integrated with back-end HTTP endpoints, Lambda function or other AWS services

API Gateway handles all of the tasks involved in accepting and processing up to hundreds of thousands of concurrent API calls

Throttling can be configured at multiple levels including Global and Service Call

API Gateway is a fully managed service that makes it easy for developers to publish, maintain, monitor, and secure APIs at any scale

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

</p></details><hr>

### Question 14: *

Another systems administrator in your company created an Auto Scaling group that is configured to ensure that four EC2 instances are available at a minimum at all times. The settings he selected on the Auto Scaling group are a minimum group size of four instances and a maximum group size of six instances. Your colleague has asked your assistance in trying to understand if Auto Scaling will allow him to terminate instances in the Auto Scaling group and what the effect would be if it does. What advice would you give to your colleague?

- A. He would need to reduce the minimum group size setting to be able to terminate any instances
- B. Auto Scaling will not allow him to terminate an EC2 instance, because there are currently four provisioned instances and the minimum is set to four
- C. This should be allowed, and Auto Scaling will launch additional instances to compensate for the ones that were terminated 
- D. This can only be done via the command line

<details><summary>Answer:</summary><p>
C

Explanation:

Auto Scaling can perform rebalancing when it finds that the number of instances across AZs is not balanced

Auto Scaling rebalances by launching new EC2 instances in the AZs that have fewer instances first, only then will it start terminating instances in AZs that had more instances

Auto Scaling may go over the maximum number of instances by 10% temporarily for the purposes of rebalancing

An imbalance may occur due to:

- Manually removing AZs/subnets from the configuration

- Manually terminating EC2 instances

- EC2 capacity issues

- Spot price is reached

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 15: 

What AWS feature allows you to take backups of Amazon EBS volumes?

- A. Snapshots 
- B. Instance Stores
- C. Amazon Machine Images
- D. S3 copy operation

<details><summary>Answer:</summary><p>
A

Explanation:

Snapshots capture a point-in-time state of an instance

Snapshots are stored on S3

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 16: 

An EC2 instance that you manage has an IAM role attached to it that provides it with access to Amazon S3 for saving log data to a bucket. A change in the application architecture means that you now need to provide the additional ability for the application to securely make API requests to Amazon API Gateway. Which two methods could you use to resolve this challenge? (choose 2)

- A. Create an IAM role with a policy granting permissions to Amazon API Gateway and add it to the EC2 instance as an additional IAM role
- B. Add an IAM policy to the existing IAM role that the EC2 instance is using granting permissions to access Amazon API Gateway 
- C. Create a new IAM role with multiple IAM policies attached that grants access to Amazon S3 and Amazon API Gateway, and replace the existing IAM role that is attached to the EC2 instance 
- D. You cannot modify the IAM role assigned to an EC2 instance after it has been launched. You’ll need to recreate the EC2 instance and assign a new IAM role

<details><summary>Answer:</summary><p>
BC

Explanation:

Instances can be assigned to IAM roles which configures them with credentials to access AWS resources

You can attach an IAM role to an instance at launch time or at any time after by using the AWS CLI, SDK, or the EC2 console

IAM roles can be attached, modified, or replaced at any time

Only one IAM role can be attached to an EC2 instance at a time

IAM uses values from the request context to check for matching policies and determine whether to allow or deny the request

IAM policies are stored in IAM as JSON documents and specify the permissions that are allowed or denied

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 17: Incorrect*

You are using an Application Load Balancer (ALB) for distributing traffic for a number of application servers running on EC2 instances. The configuration consists of a single ALB with a single target group. The front-end listeners are receiving traffic for digitalcloud.guru on port 443 (SSL/TLS) and the back-end listeners are receiving traffic on port 80 (HTTP). You will be installing a new application component on one of the application servers in the existing target group that will process data sent to digitalcloud.guru/orders. The application component will listen on HTTP port 8080 for this traffic. What configuration changes do you need to make to implement this solution update? (choose 2)

- A. Create a new target group and add the EC2 instance to it. Define the protocol as HTTP and the port as 8080 
- B. Add an additional port to the existing target group and set it to 8080 
- C. Add an additional front-end listener that listens on port 443 and set a path condition to process traffic destined to the path /orders
- D. Add a new rule to the existing front-end listener with a Path condition. Set the path condition to /orders and add an action that forwards traffic to the new target group 

<details><summary>Answer:</summary><p>
AD

Explanation:

Target groups are a logical grouping of targets (EC2 instances or ECS)

A single target can be in multiple target groups

Only one protocol and one port can be defined per target group

ALB can route requests based on the content of the request in the host field: host-based or path-based

Path-based is URL based routing e.g. example.com/images, example.com/app1

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 18: 

Your client has a requirement to process a large number of log files that will be ingested from a number of application nodes. The data needs to be processed in real-time and the output will then be stored in an Amazon S3 bucket. Which AWS service can assist with this requirement?

- A. Kinesis Data Streams 
- B. API Gateway
- C. SQS
- D. SNS

<details><summary>Answer:</summary><p>
A

Explanation:

Kinesis Data Streams enables you to build custom applications that process or analyze streaming data for specialized needs

Kinesis Data Streams enables real-time processing of streaming big data

Kinesis Data Streams is useful for rapidly moving data off data producers and then continuously processing the data

Kinesis Data Streams stores data for later processing by applications (key difference with Firehose which delivers data directly to AWS services)

Consumers can store their results using an AWS service such as Amazon DynamoDB, Amazon Redshift, or Amazon S3

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

### Question 19: 

Your client needs to find the easiest way to load streaming data into data stores and analytics tools. The data will be captured, transformed, and loaded into Splunk. The transformation will be performed by a Lambda function so the service must support this integration. The client has also requested that a backup of the data is saved into an S3 bucket along with logging data. Which AWS service would the client be able to use to achieve these requirements?

- A. Kinesis Data Firehose 
- B. Kinesis Data Streams
- C. Kinesis Data Analytics
- D. RedShift

<details><summary>Answer:</summary><p>
A

Explanation:

Kinesis Data Firehose is the easiest way to load streaming data into data stores and analytics tools

Captures, transforms, and loads streaming data

Can invoke a Lambda function to transform data before delivering it to destinations

Firehose Destinations include:

- Amazon S3

- Amazon Redshift

- Amazon Elasticsearch Service

- Splunk

For Splunk destinations, streaming data is delivered to Splunk, and it can optionally be backed up to your S3 bucket concurrently

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

### Question 20: *

The development team in your company have created a new application that you plan to deploy on AWS which runs multiple components in Docker containers. You would prefer to use AWS managed infrastructure for running the containers as you do not want to manage EC2 instances. Which of the below solution options would deliver these requirements? (choose 2)

- A. Use the Elastic Container Service (ECS) with the Fargate Launch Type 
- B. Put your container images in a private repository
- C. Use the Elastic Container Service (ECS) with the EC2 Launch Type
- D. Put your container images in the Elastic Container Registry (ECR) 

<details><summary>Answer:</summary><p>
AD

Explanation:

EC2 Launch Type allows you to run containers on EC2 instances that you manage

Fargate Launch Type is a serverless infrastructure managed by AWS

Fargate only supports container images hosted on Elastic Container Registry (ECR) or Docker Hub

Private repositories are only supported by the EC2 Launch Type

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 21: 

You would like to create a highly available web application that serves static content using multiple On-Demand EC2 instances. Which of the following AWS services will help you to achieve this? (choose 3)

- A. Amazon S3
- B. ElastiCache
- C. Elastic Load Balancer 
- D. Multiple Availability Zones 
- E. Auto Scaling 

<details><summary>Answer:</summary><p>
CDE

Explanation:

Amazon VPC lets you provision a logically isolated section of the Amazon Web Services (AWS) cloud where you can launch AWS resources in a virtual network that you define

Subnets are created within availability zones (AZs)

Each subnet must reside entirely within one Availability Zone and cannot span zones

Availability Zones are distinct locations that are engineered to be isolated from failures in other Availability Zones

Elastic Load Balancing automatically distributes incoming application traffic across multiple targets, such as Amazon EC2 instances, containers, and IP addresses

Amazon EC2 Auto Scaling helps you ensure that you have the correct number of Amazon EC2 instances available to handle the load for your application

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 22: Incorrect*

Which statements below accurately describe IAM Access Keys? (Choose 4)

- A. You can use Access Keys to log in to the AWS Management Console
- B. When created IAM returns the access key ID and secret access key 
- C. You can disable a user’s access key which prevents it from being used for API calls 
- D. Access Keys are certificates that can be used to authenticate to AWS services
- E. The secret access is returned only at creation time and if lost a new key must be created 
- F. Access Keys can be used with MFA devices for added security 
- G. You can assign two active access keys to a user at a time 

<details><summary>Answer:</summary><p>
BCEG

Explanation:

A combination of an access key ID and a secret access key

You can assign two active access keys to a user at a time

These can be used to make programmatic calls to AWS when using the API in program code or at a command prompt when using the AWS CLI or the AWS PowerShell tools

Can create, modify, view or rotate access keys

When created IAM returns the access key ID and secret access key

The secret access is returned only at creation time and if lost a new key must be created

Ensure access keys and secret access keys are stored securely

Users can be given access to change their own keys through IAM policy (not from the console)

You can disable a user’s access key which prevents it from being used for API calls

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 23: 

Your company runs a two-tier application on the AWS cloud that is composed of a web front-end and an RDS database. The web front-end uses multiple EC2 instances in multiple Availability Zones (AZ) in an Auto Scaling group behind an Elastic Load Balancer. Your manager is concerned about a single point of failure in the RDS database layer. What would be the most effective approach to minimizing the risk of an AZ failure causing an outage to your database layer?

- A. Take a snapshot of the database
- B. Create a Read Replica of the RDS DB instance in another AZ
- C. Increase the DB instance size
- D. Enable Multi-AZ for the RDS DB instance 

<details><summary>Answer:</summary><p>
D

Explanation:

Multi-AZ RDS creates a replica in another AZ and synchronously replicates to it (DR only)

Read replicas are used for read heavy DBs and replication is asynchronous

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 24: Incorrect*

An application that you will be deploying in your VPC requires 14 EC2 instances that must be placed on distinct underlying hardware to reduce the impact of the failure of a hardware node. The instances will use varying instance types. What configuration will cater to these requirements taking cost-effectiveness into account?

- A. Use a Spread Placement Group across two AZs 
- B. Use a Cluster Placement Group within a single AZ 
- C. You cannot control which nodes your instances are placed on
- D. Use dedicated hosts and deploy each instance on a dedicated host

<details><summary>Answer:</summary><p>
A

Explanation:

A cluster placement group is a logical grouping of instances within a single Availability Zone

Cluster placement groups are recommended for applications that benefit from low network latency, high network throughput, or both, and if the majority of the network traffic is between the instances in the group

A spread placement group is a group of instances that are each placed on distinct underlying hardware

Spread placement groups are recommended for applications that have a small number of critical instances that should be kept separate from each other

Launching instances in a spread placement group reduces the risk of simultaneous failures that might occur when instances share the same underlying hardware

Using a single instance on each dedicated host would be extremely expensive so option 3 is incorrect

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html

</p></details><hr>

### Question 25: 

You are a Solutions Architect at Digital Cloud Guru. One of your clients has a global presence and their web application runs out of multiple AWS regions. The client wants to personalize the experience for the customers in different parts of the world so they receive a customized application interface in the users’ language. The client has created the customized web applications and need to ensure customers are directed to the correct application based on their location. How can this be achieved?

- A. Use CloudFront to cache the content in edge locations
- B. Use Route 53 with a latency based routing policy that will direct users to the closest region
- C. Use Route 53 with a multi-value answer routing policy that presents multiple options to the users
- D. Use Route 53 with a geolocation routing policy that directs users based on their geographical location 

<details><summary>Answer:</summary><p>
D

Explanation:

Latency based routing would direct users to the closest region but geolocation allows you to configure settings based on specified attributes rather than just latency (distance)

Geolocation provides:

- Caters to different users in different countries and different languages

- Contains users within a particular geography and offers them a customized version of the workload based on their specific needs

- Geolocation can be used for localizing content and presenting some or all of your website in the language of your users

- Can also protect distribution rights

Multi-value answers are used for responding to DNS queries with up to eight healthy records selected at random

CloudFront can cache content but would not provide the personalization features requested

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 26: Incorrect*

Which of the following are valid rule types that you can use in Security Groups? (Choose 2)

- A. Inbound 
- B. Outbound 
- C. Stateful 
- D. Deny

<details><summary>Answer:</summary><p>
AB

Explanation:

Can control ingress and egress traffic

Can only assign permit rules in a security group, cannot assign deny rules

All rules are evaluated until a permit is encountered or continues until the implicit deny

Security groups are stateful

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 27: *

The Perfect Forward Secrecy (PFS) security feature uses a derived session key to provide additional safeguards against the eavesdropping of encrypted data. Which two AWS services support PFS? (choose 2)

- A. Auto Scaling
- B. Elastic Load Balancing 
- C. EBS
- D. EC2
- E. CloudFront 
- F. S3

<details><summary>Answer:</summary><p>
BE

Explanation:

CloudFront and ELB support Perfect Forward Secrecy which creates a new private key for each SSL session

Perfect Forward Secrecy (PFS) provides additional safeguards against the eavesdropping of encrypted data, through the use of a unique random session key

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-cloudfront/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 28: Incorrect*

When using an Application Load Balancer (ALB), which of the statements below are correct in relation to sticky sessions? (choose 3)

- A. Cookies can be inserted by the application or by the load balancer when configured
- B. With application-inserted cookies if the back-end instance becomes unhealthy, new requests will be routed by the load balancer normally 
- C. ALB supports load balancer-generated cookies only 
- D. Sticky sessions are enabled at the target group level 
- E. The name of the cookie is AWSALB 

<details><summary>Answer:</summary><p>
CDE

Explanation:

Sticky Sessions with ALB: Session stickiness uses cookies and ensures a client is bound to an individual back-end instance for the duration of the cookie lifetime ALB supports load balancer-generated cookies only The name of the cookie is AWSALB The contents of these cookies are encrypted using a rotating key You cannot decrypt or modify load balancer-generated cookies Sticky sessions are enabled at the target group level You can also set the duration for the stickiness of the load balancer-generated cookie, in seconds WebSockets connections are inherently sticky (following the upgrade process)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 29: 

A member of the security team in your organization has brought an issue to your attention. External monitoring tools have noticed some suspicious traffic coming from a small number of identified public IP addresses. The traffic is destined for multiple resources in your VPC. What would be the easiest way to temporarily block traffic from the IP addresses to any resources in your VPC?

- A. Add a rule in each Security Group that is associated with the affected resources that denies traffic from the identified IP addresses
- B. Configure the NAT Gateway to deny traffic from the identified IP addresses
- C. Add a rule to the Network ACL to deny traffic from the identified IP addresses. Ensure all subnets are associated with the Network ACL 
- D. Add a rule in the VPC route table that denies access to the VPC from the identified IP addresses

<details><summary>Answer:</summary><p>
C

Explanation:

You cannot create a deny rule with a security group

You cannot use the route table to create security rules

NAT Gateways are used for allowing instances in private subnets to access the Internet, they do not provide any inbound services

Network ACLs can be used to apply deny rules to lists of specific IP addresses

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 30: 

Which of the following AWS services allow you to access the underlying operating system? (Choose 2)

- A. EC2 
- B. RDS
- C. EMR 
- D. DynamoDB

<details><summary>Answer:</summary><p>
AC

Explanation:

You can access Amazon EMR by using the AWS Management Console, Command Line Tools, SDKs, or the EMR API

With EMR you have access to the underlying operating system (you can SSH in)

With EC2 you have full control at the operating system layer

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-emr/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 31: *

Your client is running an individual DynamoDB table in the Asia Pacific (Tokyo) region. As the client’s business is expanding the load on the table is increasing and you’ve have been asked what limitations you may come up against in terms of write throughput to the single table? What advice would you give to your client?

- A. 80,000 write capacity units is the maximum supported write throughput
- B. 10,000 write capacity units is the maximum supported for an individual table
- C. 40,000 write capacity units is the limitation per AWS account
- D. 10,000 write capacity units is the default per table, but you can request a service limit increase 

<details><summary>Answer:</summary><p>
D

Explanation:

These are the limits unless you request a higher amount:

US East (N. Virginia) Region:

- Per table – 40,000 read capacity units and 40,000 write capacity units

- Per account – 80,000 read capacity units and 80,000 write capacity units

All Other Regions:

- Per table – 10,000 read capacity units and 10,000 write capacity units

- Per account – 20,000 read capacity units and 20,000 write capacity units

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 32: *

Amazon S3 provides several options for implementing encryption. Which of the statements below is correct regarding the SSE-KMS option? (choose 3)

- A. KMS uses customer master keys (CMKs) 
- B. Auditable master keys can be created, rotated, and disabled from the IAM console 
- C. The security controls in AWS KMS can help you meet encryption-related compliance requirements 
- D. Data is encrypted on the client side and then transferred in an encrypted state
- E. KMS uses customer provided keys (CPKs)

<details><summary>Answer:</summary><p>
ABC

Explanation:

SSE-S3 – Server Side Encryption with S3 managed keys

- Each object is encrypted with a unique key

- Encryption key is encrypted with a master key

- AWS regularly rotate the master key

- Uses AES 256

SSE-KMS – Server Side Encryption with AWS KMS keys

- KMS uses Customer Master Keys (CMKs) to encrypt

- Can use the automatically created CMK key

- OR you can select your own key (gives you control for management of keys)

- An envelope key protects your keys

- Chargeable

SSE-C – Server Side Encryption with client provided keys

- Client manages the keys, S3 manages encryption

- AWS does not store the encryption keys

- If keys are lost data cannot be decrypted

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 33: 

You are a Solutions Architect at Digital Cloud Guru and you’re reviewing a customer’s design for a two-tier application with a stateless web front-end running on EC2 and a database back-end running on DynamoDB. The current design consists of a single EC2 web server that connects to the DynamoDB table to store session state data. The customer has requested that the data is stored across multiple geographic locations for high availability and durability and the web front-end should be fault tolerant and able to scale automatically in times of high load. What recommendations will you make to the client? (choose 3)

- A. Keep using DynamoDB as the data is stored across multiple geographic locations 
- B. Setup an Auto Scaling Group across multiple Availability Zones configured to run multiple EC2 instances across zones and us simple scaling to increase the group size during periods of high utilization 
- C. Launch an Elastic Load Balancer and attach it to the Auto Scaling Group 
- D. Use RDS database in a Multi-AZ configuration to add high availability
- E. Add another compute in another Availability Zone and use Route 53 to distribute traffic using Round Robin

<details><summary>Answer:</summary><p>
ABC

Explanation:

Amazon EC2 Auto Scaling helps you ensure that you have the correct number of Amazon EC2 instances available to handle the load for your application

Simple scaling adjusts the group size (up or down) in response to an alarm

Elastic Load Balancing automatically distributes incoming application traffic across multiple targets, such as Amazon EC2 instances, containers, and IP addresses

Amazon DynamoDB stores three geographically distributed replicas of each table to enable high availability and data durability

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 34: 

You are deploying a two-tier web application within your VPC. The application consists of multiple EC2 instances and an Internet-facing Elastic Load Balancer (ELB). The application will be used by a small number of users with fixed public IP addresses and you need to control access so only these users can access the application. What are two methods that can be used to fulfil this requirement? (choose 2)

- A. Configure the ELB Security Group to allow traffic from only the specific IP sources 
- B. Configure the ELB to send the X-Forwarded-For header and configure the EC2 instances to filter traffic based on the source IP information in the header 
- C. Configure the EC2 instance’s Security Group to allow traffic from only the specific IP sources
- D. Configure certificates on the clients and use client certificate authentication on the ELB

<details><summary>Answer:</summary><p>
AB

Explanation:

ELB does not support client certificate authentication (API Gateway does support this)

The EC2 instance Security Group is the wrong place to implement the allow rule

The ELB Security group is the correct place to implement the allow rule

Another method that would work would be to configure the ELB to forward the X-Forwarded-For header. For this to work you would need a method of filtering on the EC2 instance/application

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 35: Incorrect*

You have taken a snapshot of an encrypted EBS volume and would like to share the snapshot with another AWS account. Which statements are true about sharing snapshots of encrypted EBS volumes? (choose 3)

- A. A custom CMK key must be used for encryption if you want to share the snapshot 
- B. Snapshots of encrypted volumes are unencrypted
- C. You must obtain an encryption key from the target AWS account for encrypting the snapshot
- D. Snapshots of encrypted volumes are encrypted 
- E. You must store the CMK key in CloudHSM and delegate access to the other AWS account 
- F. You must share the CMK key as well as the snapshot with the other AWS account 

<details><summary>Answer:</summary><p>
ADF

Explanation:

Snapshots of encrypted volumes are encrypted automatically

To share an encrypted snapshot you must encrypt it in the source account with a custom CMK key and then share the key with the target account

You do not need to store the CMK key in CloudHSM

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 36: Incorrect*

You would like to grant additional permissions to an individual ECS application container on an ECS cluster that you have deployed. You would like to do this without granting additional permissions to the other containers that are running on the cluster. How can you achieve this?

- A. You cannot implement granular permissions with ECS containers
- B. Create a separate Task Definition for the application container that uses a different Task Role 
- C. Use EC2 instances instead as you can assign different IAM roles on each instance 
- D. In the same Task Definition, specify a separate Task Role for the application container

<details><summary>Answer:</summary><p>
B

Explanation:

A task definition is required to run Docker containers in Amazon ECS

You can specify the IAM role the task should use for permissions

You can only apply one IAM role to a Task Definition

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 37: 

Which statement is true about the Amazon S3 Infrequently Accessed storage class (choose 2)

- A. Provides 99.999999999% availability of S3 objects
- B. Provides 99.999999999% durability of S3 objects 
- C. Provides 99.99% durability of S3 objects
- D. Provides 99.9% availability of S3 objects 

<details><summary>Answer:</summary><p>
BD

Explanation:

S3 Standard-IA is for durable, immediately available, infrequently accessed data

S3 Standard-IA provides 99.9% availability of S3 object

S3 Standard-IA provides 99.999999999% durability of S3 objects

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 38: *

A colleague recently deployed a two-tier web application into a subnet using a test account. The subnet has an IP address block of 10.0.5.0/27 and he launched an Auto Scaling Group (ASG) with a desired capacity of 8 web servers. Another ASG has 6 application servers and two database servers and both ASGs are behind a single ALB with multiple target groups. All instances are On-Demand instances. Your colleague attempted to test a simulated in increase in capacity requirements of 50% and not all instances were able to launch successfully. What would be the best explanations for the failure to launch the extra instances? (choose 2)

- A. There are insufficient IP addresses in the subnet range to allow for the EC2 instances, the AWS reserved addresses, and the ELB IP address requirements 
- B. AWS impose a soft limit of 20 instances per region for an account, you have exceeded this number 
- C. The ASG is waiting for the health check grace period to expire, it might have been set at a high value
- D. The IP address block overlaps with another subnet in the VPC

<details><summary>Answer:</summary><p>
AB

Explanation:

There is a soft limit of 20 On-demand or 20 reserved instances per region by default

There are 32 possible hosts in a /27 subnet

AWS reserve the first 4 and last 1 IP address. ELB requires 8 addresses within your subnet

That leaves 19 addresses available

There are 16 EC2 instances so a capacity increase of 50% would bring the total up to 24 instances which exceeds the address space and the default account limit for On-Demand instances

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 39: Incorrect

You have deployed a highly available web application across two AZs. The application uses an Auto Scaling Group (ASG) and an Application Load Balancer (ALB) to distribute connections between the EC2 instances that make up the web front-end. The load has increased and the ASG has launched new instances in both AZs, however you noticed that the ALB is only distributing traffic to the EC2 instances in one AZ. From the options below, what is the most likely cause of the issue?

- A. Cross-zone load balancing is not enabled on the ALB
- B. The EC2 instances in one AZ are not passing their health checks
- C. The ALB does not have a public subnet defined in both AZs 
- D. The ASG has not registered the new instances with the ALB 

<details><summary>Answer:</summary><p>
C

Explanation:

Cross-zone load balancing is enabled on the ALB by default. Also, if it was disabled the ALB would send traffic equally to each AZ configured regardless of the number of hosts in each AZ so some traffic would still get through

Internet facing ELB:

- ELB nodes have public IPs

- Routes traffic to the private IP addresses of the EC2 instances

- Need one public subnet in each AZ where the ELB is defined

The ASG would automatically register new instances with the ALB

Health checks are unlikely to be the issue here

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 40: 

As a Solutions Architect for Digital Cloud Guru you are designing an online shopping application for a new client. The application will be composed of distributed, decoupled components to ensure that the failure of a single component does not affect the availability of the application. You will be using SQS as the message queueing service and the client has stipulated that the messages related to customer orders must be processed in the order that they were submitted in the online application. The client expects that the peak rate of transactions will not exceed 140 transactions a second. What will you explain to the client?

- A. The only way this can be achieved is by configuring the applications to process messages from the queue in the right order based on timestamps
- B. This can be achieved by using a FIFO queue which will guarantee the order of messages 
- C. This is fine, standard SQS queues can guarantee the order of the messages
- D. This is not possible with SQS as you cannot control the order in the queue

<details><summary>Answer:</summary><p>
B

Explanation:

Queues can be either standard or first-in-first-out (FIFO)

Standard queues provide a loose-FIFO capability that attempts to preserve the order of messages

Standard queues provide at-least-once delivery, which means that each message is delivered at least once

FIFO (first-in-first-out) queues preserve the exact order in which messages are sent and received

FIFO queues are available in limited regions currently

If you use a FIFO queue, you don’t have to place sequencing information in your message

FIFO queues provide exactly-once processing, which means that each message is delivered once and remains available until a consumer processes it and deletes it

</p></details><hr>

### Question 41: 

With Amazon EC2, instances can be assigned private and public IP addresses. Which of the statements below are correct regarding public IP addresses? (choose 3)

- A. When you launch an instance into a VPC, your subnet has an attribute that determines whether instances launched into that subnet receive a public IP address from the EC2-VPC public IPv4 address pool 
- B. You can manually associate or disassociate a public IP address from your instance
- C. You can modify whether an instance receives a public IP or not in EC2-Classic
- D. When you launch an instance in EC2-Classic, a public IP address is automatically assigned to the instance from the EC2-Classic public IPv4 address pool 
- E. The public IP address for your instance is released when it's stopped or terminated 

<details><summary>Answer:</summary><p>
ADE

Explanation:

Corrections: You cannot manually associate or disassociate a public IP address from your instance When you launch an instance in EC2-Classic, we automatically assign a public IP address to the instance from the EC2-Classic public IPv4 address pool. You cannot modify this behavior

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html

</p></details><hr>

### Question 42: Incorrect

You are designing a solution for an application that will read and write large amounts of data to S3. You are expecting high throughput that may exceed 1000 requests per second and need the performance of S3 to scale. What is AWS’s current advice for designing your S3 storage strategy to ensure fast performance?

- A. Enable an object cache on S3 to ensure performance at this scale
- B. You must use CloudFront for caching objects at this scale as S3 cannot provide this level of performance
- C. There is no longer a need to use random prefixes as S3 scales per prefix and the performance required is well within the S3 performance limitations 
- D. Use a random prefix on objects to improve performance 

<details><summary>Answer:</summary><p>
C

Explanation:

According to the latest information, AWS no longer require random prefixes as they have improved S3 so that it can scale to higher throughput and per prefix

Caution is required as the exam may not yet reflect these changes

https://aws.amazon.com/about-aws/whats-new/2018/07/amazon-s3-announces-increased-request-rate-performance/

</p></details><hr>

### Question 43: *

The operations team in your company are looking for a method to automatically respond to failed system status check alarms that are being received from an EC2 instance. The system in question is experiencing intermittent problems with its operating system software. Which two steps will help you to automate the resolution of the operating system software issues? (choose 2)

- A. Configure an EC2 action that reboots the instance 
- B. Create a CloudWatch alarm that monitors the “StatusCheckFailed_Instance” metric 
- C. Create a CloudWatch alarm that monitors the “StatusCheckFailed_System” metric
- D. Configure an EC2 action that recovers the instance

<details><summary>Answer:</summary><p>
AB

Explanation:

EC2 status checks are performed every minute and each returns a pass or a fail status

If all checks pass, the overall status of the instance is OK

If one or more checks fail, the overall status is impaired

System status checks detect (StatusCheckFailed_System) problems with your instance that require AWS involvement to repair

Instance status checks (StatusCheckFailed_Instance) detect problems that require your involvement to repair

The action to recover the instance is only supported on specific instance types and can be used only with StatusCheckFailed_System

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 44: 

Your client is looking for a way to use standard templates for describing and provisioning their infrastructure resources on AWS. Which AWS service can be used in this scenario?

- A. Simple Workflow Service (SWF)
- B. CloudFormation 
- C. Elastic Beanstalk
- D. Auto Scaling

<details><summary>Answer:</summary><p>
B

Explanation:

AWS CloudFormation is a service that gives developers and businesses an easy way to create a collection of related AWS resources and provision them in an orderly and predictable fashion

AWS CloudFormation provides a common language for you to describe and provision all the infrastructure resources in your cloud environment

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudformation/

</p></details><hr>

### Question 45: 

You are looking for a service that can run code in response to events that occur in services such as S3, DynamoDB and Kinesis Streams. The code should be invoked through API calls using AWS SDKs and assume an IAM role when it is executed. You do not want to manage infrastructure or pay any usage fees when the code is not running. Which AWS service would be useful to you?

- A. Lambda 
- B. SQS
- C. RedShift
- D. EMR

<details><summary>Answer:</summary><p>
A

Explanation:

AWS Lambda lets you run code as functions without provisioning or managing servers

Code is invoked using API calls made using AWS SDKs

Lambda assumes an IAM role when it executes the function

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

</p></details><hr>

### Question 46: Incorrect*

You work as an Enterprise Architect for Digital Cloud Guru which employs 1500 people. The company is growing at around 5% per annum. The company strategy is to increasingly adopt AWS cloud services. There is an existing Microsoft Active Directory (AD) service that is used as the on-premise identity and access management system. You want to avoid synchronizing your directory into the AWS cloud or adding permissions to resources in another AD domain.

- A. Launch an AWS Active Directory Service for Microsoft Active Directory and setup trust relationships with your on-premise domain 
- B. Launch a large AWS Directory Service AD Connector to proxy all authentication back to your on-premise AD service for authentication 
- C. Install a Microsoft Active Directory Domain Controller on AWS and add it into your existing on-premise domain
- D. Use a large AWS Simple AD in AWS

<details><summary>Answer:</summary><p>
B

Explanation:

AD Connector is a directory gateway for redirecting directory requests to your on-premise Active Directory

AD Connector eliminates the need for directory synchronization and the cost and complexity of hosting a federation infrastructure

AD Connector connects your existing on-premise AD to AWS

Best choice when you want to use an existing Active Directory with AWS services

AD Connector comes in two sizes:

- Small – designed for organizations up to 500 users

- Large – designed for organizations up to 5000 users

Active Directory Service for Microsoft Active Directory is the best choice if you have more than 5000 users and/or need a trust relationship set up

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-directory-service/

</p></details><hr>

### Question 47: 

Which of the statements below are true regarding Network Access Control Lists? (choose 3)

- A. With Network ACLs all rules are evaluated until a permit is encountered or continues until the implicit deny
- B. Network ACLs only apply to traffic that is ingress or egress to the subnet not to traffic within the subnet 
- C. Network ACLs operate at the instance level
- D. Network ACLs contain a numbered list of rules that are evaluated in order from the lowest number until the explicit deny 
- E. With Network ACLs you can have permit and deny rules 

<details><summary>Answer:</summary><p>
BDE

Explanation:

Network ACL’s function at the subnet level

With NACLs you can have permit and deny rules

Network ACLs contain a numbered list of rules that are evaluated in order from the lowest number until the explicit deny

All rules are not evaluated before making a decision (security groups do this), they are evaluated in order until a permit or deny is encountered

Network ACLs only apply to traffic that is ingress or egress to the subnet not to traffic within the subnet

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 48: 

You are about to provision an EBS volume for an EC2 instance that requires high I/O. The volume will be a Provisioned IOPS volume of 15 GiB. What is maximum value you can configure for IOPS?

- A. 1500
- B. 32000
- C. 750 
- D. 100

<details><summary>Answer:</summary><p>
C

Explanation:

Provisioned IOPS provides: More than 10,000 IOPS Up to 32000 IOPS per volume Up to 50 IOPS per GiB

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 49: Incorrect*

You are running a Hadoop cluster on EC2 instances in your VPC. The EC2 instances are launched by an Auto Scaling Group (ASG) and you have configured the ASG to scale out and in as demand changes. One of the instances in the group is the Hadoop Master Node and you need to ensure that it is not terminated when your ASG processes a scale in action. What is the best way this can be achieved without interrupting services?

- A. Enable Deletion Protection for the EC2 instance
- B. Use the Instance Protection feature to set scale in protection for the Hadoop Master Node 
- C. Change the DeleteOnTermination value for the EC2 instance
- D. Move the Hadoop Master Node to another ASG that has the minimum and maximum instance settings set to 1 

<details><summary>Answer:</summary><p>
B

Explanation:

You can enable Instance Protection to protect a specific instance in an ASG from a scale in action

Moving the Hadoop Node to another ASG would work but is impractical and would incur service interruption

EC2 has a feature called “termination protection” not “Deletion Protection”

The “DeleteOnTermination” value relates to EBS volumes not EC2 instances

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

https://aws.amazon.com/blogs/aws/new-instance-protection-for-auto-scaling/

</p></details><hr>

### Question 50: Incorrect*

As the Chief Security Officer (CSO) of a large banking organization you are reviewing your security policy for the usage of public cloud services. A key assessment criteria when comparing public cloud services against maintaining applications on-premise, is the split of responsibilities between AWS, as the service provider, and your company, as the customer. According to the AWS Shared Responsibility Model, which of the following would be responsibilities of the service provider? (choose 2)

- A. Physical networking infrastructure 
- B. Identity and Access Management
- C. Customer data
- D. Operating system, network and firewall configuration 
- E. Availability Zones 

<details><summary>Answer:</summary><p>
AE

Explanation:

AWS is responsible for protecting the infrastructure that runs all of the services offered in the AWS Cloud

This infrastructure is composed of the hardware, software, networking, and facilities that run AWS Cloud services

The customer is responsible for security of the resources they provision

Customer responsibilities include operating system, network and firewall configuration, identity and access management, and customer data

https://aws.amazon.com/compliance/shared-responsibility-model/

</p></details><hr>

### Question 51: 

A new mobile application that your company is deploying will be hosted on AWS. The users of the application will use mobile devices to upload small amounts of data on a frequent basis. It is expected that the number of users connecting each day could be over 1 million. The data that is uploaded must be stored in a durable and persistent data store. The data store must also be highly available and easily scalable. Which AWS services would you use?

- A. RedShift
- B. Kinesis
- C. DynamoDB 
- D. RDS

<details><summary>Answer:</summary><p>
C

Explanation:

Amazon Dynamo DB is a fully managed NoSQL database service that provides fast and predictable performance with seamless scalability

Push button scaling means that you can scale the DB at any time without incurring downtime

Amazon DynamoDB stores three geographically distributed replicas of each table to enable high availability and data durability

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 52: *

An EBS-backed EC2 instance has been configured with some proprietary software the uses an embedded license. You need to move the EC2 instance to another Availability Zone (AZ) within the region. How can this be accomplished? Choose the best answer.

- A. Use the AWS Management Console to select a different AZ for the existing instance
- B. Perform a copy operation to move the EC2 instance to the destination AZ
- C. Take a snapshot of the instance. Create a new EC2 instance and perform a restore from the snapshot
- D. Create an image from the instance. Launch an instance from the AMI in the destination AZ 

<details><summary>Answer:</summary><p>
D

Explanation:

You can take a snapshot, launch an instance in the destination AZ. Stop the instance, detach its root volume, create a volume from the snapshot you took and attach it to the instance. However, this is not the best option

The easiest and recommended option is to create an AMI (image) from the instance and launch an instance from the AMI in the other AZ. AMIs are backed by snapshots which in turn are backed by S3 so the data is available from any AZ within the region

There’s no way to move an EC2 instance from the management console

You cannot perform a copy operation to move the instance

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://aws.amazon.com/premiumsupport/knowledge-center/move-ec2-instance/

</p></details><hr>

### Question 53: 

Which of the following configurations uses synchronous replication?

- A. EBS volume synchronization
- B. RDS Read Replica across AWS regions
- C. DynamoDB Read Replica
- D. RDS DB instance using a Multi-AZ configuration 

<details><summary>Answer:</summary><p>
D

Explanation:

Multi-AZ RDS creates a replica in another AZ and synchronously replicates to it (DR only)

Multi-AZ deployments for the MySQL, MariaDB, Oracle and PostgreSQL engines utilize synchronous physical replication

Multi-AZ deployments for the SQL Server engine use synchronous logical replication (SQL Server-native Mirroring technology)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 54: *

Your manager has asked you to explain how Amazon ElastiCache may assist with the company’s plans to improve the performance of database queries. Which of the below statements is a valid description of the benefits of Amazon ElastiCache? (Choose 2)

- A. ElastiCache is a web service that makes it easy to deploy and run Memcached or Redis protocol-compliant server nodes in the cloud 
- B. ElastiCache nodes can be accessed directly from the Internet and EC2 instances in other regions, which allows you to improve response times for queries over long distances
- C. ElastiCache is best suited for scenarios where the data base load type is OLTP
- D. The in-memory caching provided by ElastiCache can be used to significantly improve latency and throughput for many read-heavy application workloads or compute-intensive workloads 
- E. ElastiCache can form clusters using a mixture of Memcached and Redis caching engines, allowing you to take advantage of the best features of each caching engine

<details><summary>Answer:</summary><p>
AD

Explanation:

ElastiCache is a web service that makes it easy to deploy and run Memcached or Redis protocol-compliant server nodes in the cloud

The in-memory caching provided by ElastiCache can be used to significantly improve latency and throughput for many read-heavy application workloads or compute-intensive workloads

Best for scenarios where the DB load is based on Online Analytics Processing (OLAP) transactions

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 55: Incorrect*

You have been tasked with building an ECS cluster using the EC2 launch type and need to ensure container instances can connect to the cluster. A colleague informed you that you must ensure the ECS container agent is installed on your EC2 instances. You have selected to use the Amazon ECS-optimized AMI. Which of the statements below are correct? (Choose 2)

- A. You can install the ECS container agent on any Amazon EC2 instance that supports the Amazon ECS specification 
- B. The Amazon ECS container agent is installed on the AWS managed infrastructure used for tasks using the EC2 launch type so you don’t need to do anything 
- C. You can only install the ECS container agent on Linux instances 
- D. The Amazon ECS container agent is included in the Amazon ECS-optimized AMI 

<details><summary>Answer:</summary><p>
AD

Explanation:

The ECS container agent allows container instances to connect to the cluster

The container agent runs on each infrastructure resource on an ECS cluster

The ECS container agent is included in the Amazon ECS optimized AMI and can also be installed on any EC2 instance that supports the ECS specification (only supported on EC2 instances)

The ECS container agent is available for Linux and Windows

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 56: *

You are a Solutions Architect at Digital Cloud Guru. Your client’s company is growing and now has over 10,000 users. The client would like to start deploying services into the AWS Cloud including AWS Workspaces. The client expects there to be a large take-up of AWS services across their user base and would like to use their existing Microsoft Active Directory identity source for authentication. The client does not want to replicate account credentials into the AWS cloud. You have been tasked with designing the identity, authorization and access solution for the customer. What AWS services would you include in your design? (choose 2)

- A. Use a Large AWS AD Connector
- B. Setup trust relationships to extend authentication from the on-premises Microsoft Active Directory into the AWS cloud 
- C. Use a Large AWS Simple AD
- D. Use the Enterprise Edition of AWS Directory Service for Microsoft Active Directory 

<details><summary>Answer:</summary><p>
BD

Explanation:

Active Directory Service for Microsoft Active Directory is the best choice if you have more than 5000 users and/or need a trust relationship set up

There are two editions of AWS Directory Service for AD:

- Standard for up to 5000 users and 30,000 directory objects

- Enterprise for large organizations up to 50,000 objects

AWS Simple AD does not support trust relationships with other domains

AD Connector supports two sizes:

- Small – designed for organizations up to 500 users

- Large – designed for organizations up to 5000 users

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-directory-service/

</p></details><hr>

### Question 57: 

As a Solutions Architect at Digital Cloud Guru you are helping a client to design a multi-tier web application architecture. The client has requested that the architecture provide low-latency connectivity between all servers and be resilient across multiple locations. They would also like to use their existing Microsoft SQL licenses for the database tier. The client needs to maintain the ability to access the operating systems of all servers for the installation of monitoring software. How would you recommend the database tier is deployed?

- A. Amazon RDS with Microsoft SQL Server
- B. Amazon EC2 instances with Microsoft SQL Server and data replication within an AZ
- C. Amazon EC2 instances with Microsoft SQL Server and data replication between two different AZs 
- D. Amazon RDS with Microsoft SQL Server in a Multi-AZ configuration

<details><summary>Answer:</summary><p>
C

Explanation:

Availability Zones are distinct locations that are engineered to be isolated from failures in other Availability Zones

Availability Zones are connected with low latency, high throughput, and highly redundant networking

With EC2 you have full control at the operating system layer

RDS is a fully managed service and you do not have access to the underlying EC2 instance (no root access)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/



</p></details><hr>

### Question 58: Incorrect

You are a Solutions Architect for a systems integrator. Your client is growing their presence in the AWS cloud and has applications and services running in a VPC across multiple availability zones within a region. The client has a requirement to build an operational dashboard within their on-premise data center within the next few months. The dashboard will show near real time statistics and therefore must be connected over a low latency, high performance network. What would be the best solution for this requirement?

- A. Use redundant VPN connections to two VGW routers in the region, this should give you access to the infrastructure in all AZs
- B. Order a single AWS Direct Connect connection to connect to the client’s VPC. This will provide access to all AZs within the region 
- C. You cannot connect to multiple AZs from a single location
- D. Order multiple AWS Direct Connect connections that will be connected to multiple AZs 

<details><summary>Answer:</summary><p>
B

Explanation:

AWS Direct Connect is a network service that provides an alternative to using the Internet to connect customers’ on premise sites to AWS

Benefits of Direct Connect include:

- Reduce cost when using large volumes of traffic

- Increase reliability (predictable performance)

- Increase bandwidth (predictable bandwidth)

- Decrease latency

From Direct Connect you can connect to all AZs within the region

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/aws-direct-connect/

</p></details><hr>

### Question 59: 

Your company runs a two-tier application that uses web front-ends running on EC2 instances across multiple AZs. The back-end is an RDS multi-AZ database instance. The front-end servers host a Content Management System (CMS) application that stores files that users upload in attached EBS storage. You don’t like having the uploaded files distributed across multiple EBS volumes and are concerned that this solution is not scalable. You would like to design a solution for storing the files that are uploaded to your EC2 instances that can achieve high levels of aggregate throughput and IOPS. The solution must scale automatically, and provide consistent low latencies. You also need to be able to mount the storage to the EC2 instances across multiple AZs within the region. Which AWS service would meet your needs?

- A. Use ElastiCache
- B. Create an S3 bucket and use this as the storage location for the application
- C. Store the files in the RDS database
- D. Use the Amazon Elastic File System 

<details><summary>Answer:</summary><p>
D

Explanation:

EFS is a fully-managed service that makes it easy to set up and scale file storage in the Amazon Cloud

EFS uses the NFSv4.1 protocol

EFS is elastic and grows and shrinks as you add and remove data

Can concurrently connect 1 to 1000s of EC2 instances, from multiple AZs

A file system can be accessed concurrently from all AZs in the region where it is located

Amazon EFS is designed to burst to allow high throughput levels for periods of time

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-efs/

</p></details><hr>

### Question 60: *

With Amazon EC2, instances can be assigned private and public IP addresses. Which of the statements below are correct regarding private IP addresses? (choose 3)

- A. By default, an instance has a primary and secondary private IP address
- B. A private IPv4 address is an IP address that's reachable over the Internet
- C. Secondary private IP addresses can be reassigned from one instance to another 
- D. For instances launched in EC2-Classic, the private IPv4 address is released when the instance is stopped or terminated 
- E. For instances launched in a VPC, a private IPv4 address remains associated with the network interface when the instance is stopped and restarted 

<details><summary>Answer:</summary><p>
CDE

Explanation:

Corrections: By default an instance only has a private IP address A private IPx4 address is not reachable over the Internet

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-instance-addressing.html

</p></details><hr>

### Question 61: 

You are looking for a method to distribute onboarding videos to your company’s numerous remote workers around the world. The training videos are located in an S3 bucket that is not publicly accessible. Which of the options below would allow you to share the videos?

- A. Use CloudFront and set the S3 bucket as an origin 
- B. Use ElastiCache and attach the S3 bucket as a cache origin
- C. Use CloudFront and use a custom origin pointing to an EC2 instance
- D. Use a Route 53 Alias record the points to the S3 bucket

<details><summary>Answer:</summary><p>
A

Explanation:

An origin is the origin of the files that the CDN will distribute

Origins can be either an S3 bucket, an EC2 instance, and Elastic Load Balancer, or Route 53 – can also be external (non-AWS)

When using Amazon S3 as an origin you place all of your objects within the bucket

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-cloudfront/

</p></details><hr>

### Question 62: 

You work as a Solutions Architect at Digital Cloud Guru. You are working on a disaster recovery solution that allows you to bring up your applications in another AWS region. Some of your applications run on EC2 instances and have proprietary software configurations with embedded licenses. You need to create duplicate copies of your EC2 instances in the other region. What would be the best way to do this? (choose 3)

- A. Create an AMI of each EC2 instance 
- B. Create new EC2 instances from the snapshots
- C. Copy the AMIs to the other region 
- D. Create snapshots of the EBS volumes attached to the instances
- E. Create new EC2 instances from the AMIs 
- F. Copy the snapshots to the other region

<details><summary>Answer:</summary><p>
ACE

Explanation:

AMIs are regional. You can only launch an AMI from the region in which it is stored. However, you can copy AMI’s to other regions using the console, command line, or the API

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 63: Incorrect*

The security team in your company are defining new policies for enabling security analysis, resource change tracking, and compliance auditing. They would like to gain visibility into user activity by recording API calls made within the company’s AWS account. The information that is logged must be encrypted. This requirement applies to all AWS regions in which your company has services running. How will you implement this request? (choose 2)

- A. Create a CloudTrail trail in each region in which you have services 
- B. Enable encryption with multiple KMS keys 
- C. Use CloudWatch to monitor API calls
- D. Enable encryption with a single KMS key 
- E. Create a CloudTrail trail and apply it to all regions 

<details><summary>Answer:</summary><p>
DE

Explanation:

Trails can be enabled per region or a trail can be applied to all region

CloudTrail log files are encrypted using S3 Server Side Encryption (SSE)

Can also enable encryption SSE KMS for additional security

A single KMS key can be used to encrypt log files for trails applied to all regions

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudtrail/

</p></details><hr>

### Question 64: *

You are a Solutions Architect at Digital Cloud Guru. A client of yours is using API Gateway for accepting and processing a large number of API calls to AWS Lambda. The client’s business is rapidly growing and he is therefore expecting a large increase in traffic to his API Gateway and AWS Lambda services. The client has asked for advice on ensuring the services can scale without any reduction in performance. What advice would you give to the client? (choose 2)

- A. AWS Lambda automatically scales up by using larger instance sizes for your functions
- B. API Gateway can scale to any level of traffic received by an API 
- C. AWS Lambda scales concurrently executing functions up to your default limit (1000) 
- D. API Gateway can only scale up to the throttling limits

<details><summary>Answer:</summary><p>
BC

Explanation:

API Gateway can scale to any level of traffic received by an API

Throttling is used to protect back-end instances from traffic spikes

Lambda uses continuous scaling – scales out not up

Lambda scales concurrently executing functions up to your default limit (1000)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

</p></details><hr>

### Question 65: 

A client is in the design phase of developing an application that will process orders for their online ticketing system. The application will use a number of front-end EC2 instances that pick-up orders and place them in a queue for processing by another set of back-end EC2 instances. The client will have multiple options for customers to choose the level of service they want to pay for. The client has asked how he can design the application to process the orders in a prioritized way based on the level of service the customer has chosen

- A. Create multiple SQS queues, configure exactly-once processing and set the maximum visibility timeout to 12 hours
- B. Create a single SQS queue, configure the front-end application to place orders on the queue in order of priority and configure the back-end instances to poll the queue and pick up messages in the order they are presented
- C. Create multiple SQS queues, configure the front-end application to place orders onto a specific queue based on the level of service requested and configure the back-end instances to sequentially poll the queues in order of priority 
- D. Create a combination of FIFO queues and Standard queues and configure the applications to place messages into the relevant queue based on priority

<details><summary>Answer:</summary><p>
C

Explanation:

The best option is to create multiple queues and configure the application to place orders onto a specific queue based on the level of service. You then configure the back-end instances to poll these queues in order or priority so they pick up the higher priority jobs first

Option 2 is incorrect as creating a mixture of queue types is not the best way to separate the messages and there is nothing in this option that explains how the messages would be picked up in the right order

Option 3 is incorrect as standard queues offer best-effort ordering so there’s no guarantee that the messages would be picked up in the correct order

The last option is bogus as the options here don’t help you at all

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

