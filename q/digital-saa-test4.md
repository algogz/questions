### Question 1: 

You need to connect from your office to a Linux instance that is running in your VPC using the Internet. Which of the following items are required to enable this access? (choose 3)

- A. A NAT Gateway
- B. A Public or Elastic IP address on the EC2 instance 
- C. Correctly configured Security Groups and Network ACLs 
- D. An Internet Gateway attached to the EC2 instance’s subnet and route table entry pointing to it 
- E. A bastion host

<details><summary>Answer:</summary><p>
BCD

Explanation:

A bastion host can be used to access instances in private subnets but is not required for instances in public subnets

A public IP is required for accessing an instance remotely

The security groups and network ACLs must be configured to allow the SSH traffic on port 22

An internet gateway is required for a public subnet and the route table associated with the subnet must have the internet gateway configured

A NAT Gateway allows instances in private subnets to access the Internet, it is not used for remote access

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 2: 

Which of the statements below are correct about monitoring of an ELB? (choose 3)

- A. Information is sent to CloudWatch every minute if there are active requests 
- B. CloudWatch metrics can be logged to an S3 bucket
- C. Access logs can identify requester, IP, and request type 
- D. Access logs are enabled by default 
- E. CloudTrail can be used to capture API calls to the ELB 

<details><summary>Answer:</summary><p>
ACE

Explanation:

CloudWatch – every 1 minute:

- ELB service only sends information when requests are active

- Can be used to trigger SNS notifications

Access Logs:

- Disabled by default

- Includes information about the clients (not included in CloudWatch metrics)

- Can identify requester, IP, request type etc.

- Can be optionally stored and retained in S3

CloudTrail:

- Can be used to capture API calls to the ELB

- Can be stored in an S3 bucket

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 3: 

You have an Amazon RDS Multi-AZ deployment across two availability zones. An outage of the availability zone in which the primary RDS DB instance is running occurs. What actions will take place in this circumstance? (choose 2)

- A. The failover mechanism automatically changes the DNS record of the DB instance to point to the standby DB instance 
- B. A manual failover of the DB instance will need to be initiated using Reboot with failover
- C. The primary DB instance will switch over automatically to the standby replica 
- D. Due to the loss of network connectivity the process to switch to the standby replica cannot take place

<details><summary>Answer:</summary><p>
AC

Explanation:

Multi-AZ RDS creates a replica in another AZ and synchronously replicates to it (DR only)

A failover may be triggered in the following circumstances:

Loss of primary AZ or primary DB instance failure Loss of network connectivity on primary Compute (EC2) unit failure on primary Storage (EBS) unit failure on primary The primary DB instance is changed Patching of the OS on the primary DB instance Manual failover (reboot with failover selected on primary)

During failover RDS automatically updates configuration (including DNS endpoint) to use the second node

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 4: 

An EC2 instance in an Auto Scaling Group is having some issues that are causing the ASG to launch new instances based on the dynamic scaling policy. You need to troubleshoot the EC2 instance and prevent the ASG from launching new instances temporarily. What is the best method to accomplish this? (choose 2)

- A. Remove the EC2 instance from the Target Group 
- B. Disable the dynamic scaling policy 
- C. Place the EC2 instance that is experiencing issues into the Standby state 
- D. Suspend the scaling processes responsible for launching new instances 

<details><summary>Answer:</summary><p>
CD

Explanation:

You can suspend and then resume one or more of the scaling processes for your Auto Scaling group.

This can be useful when you want to investigate a configuration problem or other issue with your web application and then make changes to your application, without invoking the scaling processes

You can manually move an instance from an ASG and put it in the standby state

Instances in standby state are still managed by Auto Scaling, are charged as normal, and do not count towards available EC2 instance for workload/application use

Auto scaling does not perform health checks on instances in the standby state

Standby state can be used for performing updates/changes/troubleshooting etc. without health checks being performed or replacement instances being launched

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 5: 

When using Amazon Kinesis Data Firehose, which services can you load streaming data into? (choose 4)

- A. EMR 
- B. Elasticsearch Service 
- C. S3 
- D. Splunk 
- E. RedShift 

<details><summary>Answer:</summary><p>
BCDE

Explanation:

A destination is the data store where your data will be delivered

Firehose Destinations include: Amazon S3 Amazon Redshift Amazon Elasticsearch Service Splunk

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

### Question 6: 

You are putting together a design for a web-facing application. The application will be run on EC2 instances behind ELBs in multiple regions in an active/passive configuration. The website address the application runs on is digitalcloud.guru. You will be using Route 53 to perform DNS resolution for the application. How would you configure Route 53 in this scenario based on AWS best practices? (choose 3)

- A. Set Associate with Health Check to “Yes”
- B. Use a Failover Routing Policy 
- C. Connect the ELBs using Alias records 
- D. Connect the ELBs using CNAME records
- E. Use a Weighted Routing Policy
- F. Set Evaluate Target Health to “Yes” 

<details><summary>Answer:</summary><p>
BCF

Explanation:

Failover to a secondary IP address

Associated with a health check

Used for active-passive

Routes only when the resource is healthy

Can be used with ELB

When used with Alias records set Evaluate Target Health to "Yes" and do not use health checks

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 7: 

You are discussing EC2 with a colleague and need to describe the differences between EBS-backed instances and Instance store-backed instances. Which of the statements below would be valid descriptions? (choose 3)

- A. On an EBS-backed instance, the default action is for the root EBS volume to be deleted upon termination 
- B. By default, root volumes for both types will be retained on termination unless you configured otherwise
- C. Instance store volumes can be detached and reattached to other EC2 instances
- D. For both types of volume rebooting the instances will not result in data loss 
- E. EBS volumes can be detached and reattached to other EC2 instances 

<details><summary>Answer:</summary><p>
ADE

Explanation:

On an EBS-backed instance, the default action is for the root EBS volume to be deleted upon termination

EBS volumes can be detached and reattached to other EC2 instances

Instance store volumes cannot be detached and reattached to other EC2 instances

When rebooting the instances for both types data will not be lost

By default, root volumes for both types will be deleted on termination unless you configured otherwise

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 8: 

To increase the resiliency of your RDS DB instance, you decided to enable Multi-AZ. Where will the new standby RDS instance be created?

- A. In another subnet within the same AZ
- B. In a different AWS Region to protect against Region failures
- C. You must specify the location when configuring Multi-AZ
- D. In the same AWS Region but in a different AZ for high availability 

<details><summary>Answer:</summary><p>
D

Explanation:

Multi-AZ RDS creates a replica in another AZ and synchronously replicates to it (DR only)

You cannot choose which AZ in the region will be chosen to create the standby DB instance

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 9: 

Amazon S3 can send event notification messages to which of the following destinations? (Choose 3)

- A. SES
- B. SWF
- C. Lambda function 
- D. SNS 
- E. SQS 

<details><summary>Answer:</summary><p>
CDE

Explanation:

Event notifications for specific actions, can send alerts or trigger actions

Notifications can be sent to: SNS Topics SQS Queue Lambda functions Need to configure SNS/SQS/Lambda before S3 No extra charges from S3 but you pay for SNS, SQS and Lambda

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 10: 

Select the statements below that are correct with regards to the Auto Scaling cooldown period? (choose 3)

- A. It ensures that before the Auto Scaling group scales out, the EC2 instances can apply system updates
- B. The default value is 600 seconds
- C. It ensures that the Auto Scaling group does not launch or terminate additional EC2 instances before the previous scaling activity takes effect 
- D. It is a configurable setting for your Auto Scaling group 
- E. The default value is 300 seconds 
- F. It ensures that the Auto Scaling group terminates the EC2 instances that are least busy

<details><summary>Answer:</summary><p>
CDE

Explanation:

The cooldown period is a configurable setting for your Auto Scaling group that helps to ensure that it doesn't launch or terminate additional instances before the previous scaling activity takes effect

The default cooldown period is applied when you create your Auto Scaling group

The default value is 300 seconds

You can configure the default cooldown period when you create the Auto Scaling group, using the AWS Management Console, the create-auto-scaling-group command (AWS CLI), or the CreateAutoScalingGroup API operation

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html

</p></details><hr>

### Question 11: 

You have a requirement to perform a large-scale testing operation that will assess the ability of your application to scale. You are planning on deploying a large number of c3.2xlarge instances with several PIOPS EBS volumes attached to each. You need to ensure you don’t run into any problems with service limits. What are the service limits you need to be aware of in this situation?

- A. 20 On-Demand EC2 instances and 100 TiB of aggregate PIOPS volume storage per region 
- B. 20 On-Demand EC2 instances and 100 PIOPS volumes per region
- C. 20 On-Demand EC2 instances and 100 PIOPS volumes per account
- D. 20 On-Demand EC2 instances and 100 TiB of aggregate PIOPS volume storage per account

<details><summary>Answer:</summary><p>
A

Explanation:

You are limited to running up to a total of 20 On-Demand instances across the instance family, purchasing 20 Reserved Instances, and requesting Spot Instances per your dynamic spot limit per region (by default)

You are limited to an aggregate of 100 TiB of PIOPS volumes per region

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 12: 

You are designing the disk configuration for an EC2 instance. The instance will be running an application that requires heavy read/write IOPS. You need to provision a single volume that is 500 GiB in size and needs to support 20,000 IOPS. What EBS volume type will you select?

- A. EBS Throughput Optimized HDD
- B. EBS General Purpose SSD
- C. EBS Provisioned IOPS SSD 
- D. EBS General Purpose SSD in a RAID 1 configuration

<details><summary>Answer:</summary><p>
C

Explanation:

SSD, General Purpose - GP2

- Baseline of 3 IOPS per GiB with a minimum of 100 IOPS

- Burst up to 3000 IOPS for volumes >= 334GB)

SSD, Provisioned IOPS - I01

- More than 10,000 IOPS

- Up to 32000 IOPS per volume

- Up to 50 IOPS per GiB

HDD, Throughput Optimized - (ST1):

- Throughput measured in MB/s, and includes the ability to burst up to 250 MB/s per TB, with a baseline throughput of 40 MB/s per TB and a maximum throughput of 500 MB/s per volume

HDD, Cold - (SC1):

- Lowest cost storage - cannot be a boot volume

- These volumes can burst up to 80 MB/s per TB, with a baseline throughput of 12 MB/s per TB and a maximum throughput of 250 MB/s per volume

HDD, Magnetic - Standard - cheap, infrequently accessed storage - lowest cost storage that can be a boot volume

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 13: 

When attaching an Elastic Network Interface (ENI) to an EC2 instance, what does “warm attach” mean?

- A. Attaching an ENI to an instance when it is stopped 
- B. Attaching an ENI to an instance when it is running 
- C. Attaching an ENI to an instance when it is idle
- D. Attaching an ENI to an instance during the launch process

<details><summary>Answer:</summary><p>
A

Explanation:

ENIs can be “hot attached” to running instances

ENIs can be “warm-attached” when the instance is stopped

ENIs can be “cold-attached” when the instance is launched

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 14: 

You have been asked to come up with a solution for providing single sign-on to the existing users in your company who are consuming on-premise web applications. Which product combinations would help you to achieve this requirement?

- A. Use the AWS Secure Token Service (STS) and SAML 
- B. Use IAM and Amazon Cognito
- C. Use your on-premise LDAP directory with IAM
- D. Use IAM and MFA

<details><summary>Answer:</summary><p>
A

Explanation:

The AWS Security Token Service (STS) is a web service that enables you to request temporary, limited-privilege credentials for IAM users or for users that you authenticate (federated users)

Federation (typically AD) Uses SAML 2.0 Grants temporary access based on the users AD credentials Does not need to be a user in IAM Single sign-on allows users to login to the AWS console without assigning IAM credentials

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 15: 

You recently noticed that you Network Load Balancer (NLB) in one of your VPCs is not distributing traffic between EC2 instances evenly across AZs. The EC2 instances are spread across two AZs but only one AZ is receiving traffic from the NLB. The NLB is configured with a TCP listener on port 80 and is using active health checks. What is the most likely problem?

- A. Cross-zone load balancing is disabled 
- B. There is no HTTP listener
- C. NLB can only load balance within a single AZ
- D. Health checks are failing in one AZ due to latency 

<details><summary>Answer:</summary><p>
A

Explanation:

Network Load Balancer operates at the connection level (Layer 4), routing connections to targets – Amazon EC2 instances, containers and IP addresses based on IP protocol data

It is architected to handle millions of requests/sec, sudden volatile traffic patterns and provides extremely low latencies

Supports cross-zone load balancing

Supports both network and application target health checks

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 16: 

You are a Solutions Architect for a pharmaceutical company. The company uses a strict process for release automation that involves building and testing services in 3 separate VPCs. A peering topology is configured with VPC-A peered with VPC-B and VPC-B peered with VPC-C. The development team want to modify the process so that they can release code directly from VPC-A to VPC-C. How can this be accomplished?

- A. Create a new VPC peering connection between VPC-A and VPC-C 
- B. Update VPC-Bs route table with peering targets for VPC-A and VPC-C and enable route propagation
- C. Update the CIDR blocks to match to enable inter-VPC routing
- D. Update VPC-As route table with an entry using the VPC peering as a target

<details><summary>Answer:</summary><p>
A

Explanation:

Single region inter-VPC routing

Cannot have overlapping CIDR ranges

Cannot do transitive peering

Must update route tables to configure routing

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 17: 

When using throttling controls with API Gateway what happens when request submissions exceed the steady-state request rate and burst limits?

- A. API Gateway fails the limit-exceeding requests and returns “500 Internal Server Error” error responses to the client
- B. The requests will be buffered in a cache until the load reduces
- C. API Gateway fails the limit-exceeding requests and returns “429 Too Many Requests” error responses to the client 
- D. API Gateway drops the requests and does not return a response to the client

<details><summary>Answer:</summary><p>
C

Explanation:

You can throttle and monitor requests to protect your backend

Resiliency through throttling rules based on the number of requests per second for each HTTP method (GET, PUT)

Throttling can be configured at multiple levels including Global and Service Call

When request submissions exceed the steady-state request rate and burst limits, API Gateway fails the limit-exceeding requests and returns 429 Too Many Requests error responses to the client

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html

</p></details><hr>

### Question 18: 

You just attempted to restart a stopped EC2 instance and it immediately changed from a pending state to a terminated state. What are the most likely explanations? (choose 2)

- A. An EBS snapshot is corrupt 
- B. AWS does not currently have enough available On-Demand capacity to service your request 
- C. You've reached your EBS volume limit 
- D. You have reached the limit on the number of instances that you can launch in a region 

<details><summary>Answer:</summary><p>
AC

Explanation:

The following are a few reasons why an instance might immediately terminate: You've reached your EBS volume limit An EBS snapshot is corrupt The root EBS volume is encrypted and you do not have permissions to access the KMS key for decryption The instance store-backed AMI that you used to launch the instance is missing a required part (an image.part.xx file)

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/troubleshooting-launch.html

</p></details><hr>

### Question 19: 

You are building a new Elastic Container Service (ECS) cluster. The ECS instances are running the EC2 launch type and you would like to enable load balancing to distributed connections to the tasks running on the cluster. You would like the mapping of ports to be performed dynamically and will need to route to different groups of servers based on the path in the requested URL. Which AWS service would you choose to fulfil these requirements?

- A. Classic Load Balancer
- B. Application Load Balancer 
- C. Network Load Balancer
- D. ECS Services

<details><summary>Answer:</summary><p>
B

Explanation:

ALB allows containers to use dynamic host port mapping so that multiple tasks from the same service are allowed on the same container host – the CLB and NLB do not offer this

ALB can route requests based on the content of the request in the host field: host-based or path-based

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 20: 

Your manager is interested in reducing operational overhead and cost and heard about “serverless” computing at a conference he recently attended. He has asked you if AWS provide any services that the company can leverage. Which services from the list below would you tell him about? (Choose 3)

- A. API Gateway 
- B. EC2
- C. Kinesis 
- D. Lambda 

<details><summary>Answer:</summary><p>
ACD

Explanation:

AWS Serverless services include (but not limited to): API Gateway Lambda S3 DynamoDB SNS SQS Kinesis

https://aws.amazon.com/serverless/

</p></details><hr>

### Question 21: 

You’re trying to explain to a colleague typical use cases where you can use the Simple Workflow Service (SWF). Which of the scenarios below would be valid? (choose 2)

- A. Providing a reliable, highly-scalable, hosted queue for storing messages in transit between EC2 instances
- B. For web applications that require content delivery networks
- C. Managing a multi-step and multi-decision checkout process for a mobile application 
- D. Coordinating business process workflows across distributed application components 
- E. Sending notifications via SMS when an EC2 instance reaches a certain threshold

<details><summary>Answer:</summary><p>
CD

Explanation:

Amazon Simple Workflow Service (SWF) is a web service that makes it easy to coordinate work across distributed application components

SWF enables applications for a range of use cases, including media processing, web application back-ends, business process workflows, and analytics pipelines, to be designed as a coordination of tasks

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-swf/

</p></details><hr>

### Question 22: 

You have created a VPC with private and public subnets and will be deploying a new mySQL database server running on an EC2 instance. Which subnet should you deploy the database server into?

- A. The subnet that is mapped to the primary AZ in the region
- B. It doesn’t matter
- C. The private subnet 
- D. The public subnet

<details><summary>Answer:</summary><p>
C

Explanation:

Subnets are created within availability zones (AZs)

Can create private, public or VPN subnets

Subnets map 1:1 to AZs and cannot span AZs

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 23: 

An application that you manage uses a combination of Reserved and On-Demand instances to handle typical load. The application involves performing analytics on a set of data and you need to temporarily deploy a large number of EC2 instances. You only need these instances to be available for a short period of time until the analytics job is completed. What would be the MOST cost-effective choice of EC2 instance type to use for this requirement?

- A. Use Reserved instances
- B. Use dedicated hosts
- C. Use Spot instances 
- D. Use On-Demand instances

<details><summary>Answer:</summary><p>
C

Explanation:

Spot facts: Bid price Charged by the hour unless AWS terminates in which case the hour is free Flexible start and end times Grid computing and HPC Very low hourly compute cost Cannot use encrypted volumes

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 24: 

You need to log a history of API calls for compliance reasons. CloudTrail can log API calls made from which sources?

- A. Command line tools
- B. Command line tools and AWS Management Console only
- C. AWS Management Console
- D. AWS SDK
- E. Command line tools, AWS SDK, and AWS Console 
- F. Command line tools and AWS SDK only

<details><summary>Answer:</summary><p>
E

Explanation:

CloudTrail logs API calls made via: AWS Management Console AWS SDKs Command line tools Higher-level AWS services (such as CloudFormation)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudtrail/

</p></details><hr>

### Question 25: 

You would like to implement an automated method of periodically backing up the EBS volumes in your VPC. What steps can you can take to automatically backup EBS Volumes?

- A. Create a scheduled job and run the AWS CLI command “create-backup” with the various options to take backups of the EBS volumes
- B. Create a scheduled job and run the AWS CLI command “create-snapshot” with the various options to take backups of the EBS volumes 
- C. Configure EBS volume replication to create a backup on S3
- D. Use an EBS-lifecycle policy to take a snapshot of the EBS volumes

<details><summary>Answer:</summary><p>
B

Explanation:

Snapshots capture a point-in-time state of an instance

Snapshots are stored on S3

Does not provide granular backup (not a replacement for backup software)

The EB CLI is a command line interface for Elastic Beanstalk that provides interactive commands that simplify creating, updating and monitoring environments from a local repository

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

https://docs.aws.amazon.com/cli/latest/reference/ec2/create-snapshot.html

https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/eb-cli3.html

</p></details><hr>

### Question 26: 

Which two services form the application facing services from the AWS serverless infrastructure? (choose 2)

- A. Elastic Load Balancer
- B. AWS Cognito 
- C. AWS Lambda 
- D. API Gateway 

<details><summary>Answer:</summary><p>
CD

Explanation:

The only application services here are API Gateway and Lambda and these are considered to be serverless services

https://aws.amazon.com/serverless/

</p></details><hr>

### Question 27: 

You need to run a non-production batch process that will use several EC2 instances. The process can be interrupted and restarted without issue. What EC2 pricing model would be best for this workload?

- A. Reserved instances
- B. Spot instances 
- C. Flexible instances
- D. On-demand instances

<details><summary>Answer:</summary><p>
B

Explanation:

Spot pricing provides: Charged by the hour unless AWS terminates in which case the hour is free Flexible start and end times Good for grid computing and HPC Very low hourly compute cost

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 28: 

How often does EC2 send metrics to Amazon CloudWatch by default?

- A. Three minutes
- B. One minute
- C. One second
- D. Five seconds
- E. Five minutes 

<details><summary>Answer:</summary><p>
E

Explanation:

CloudWatch standard monitoring = 5 mins

CloudWatch detailed monitoring = 1 min

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 29: 

You are a Solutions Architect for Digital Cloud Guru. A client is migrating a large amount of data that their customers access onto the AWS cloud. The client is located in Australia and all most of their customers will be accessing the data from within Australia. The customer has asked you for some advice about S3 buckets. Which of the following statements would be good advice? (choose 2)

- A. Buckets can be renamed after they have been created
- B. S3 is a global service so it doesn’t matter where you create your buckets
- C. To reduce latency and improve performance, create the buckets in the Asia Pacific (Sydney) region 
- D. S3 is a universal namespace so bucket names must be unique globally 

<details><summary>Answer:</summary><p>
CD

Explanation:

Bucket names cannot be changed after they have been created

For better performance, lower latency and lower costs create the bucket closer to your clients

An S3 bucket is region specific

S3 is a universal namespace so names must be unique globally

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 30: 

You created a second ENI (eth1) interface when launching an EC2 instance. You would like to terminate the instance and have not made any changes. What will happen to the attached ENIs?

- A. Both eth0 and eth1 will be terminated with the instance
- B. Both eth0 and eth1 will persist
- C. eth1 will persist but eth0 will be terminated 
- D. eth1 will be terminated, but eth0 will persist

<details><summary>Answer:</summary><p>
C

Explanation:

By default Eth0 is the only Elastic Network Interface (ENI) created with an EC2 instance when launched

You can add additional interfaces to EC2 instances (number dependent on instances family/type)

Default interfaces are terminated with instance termination

Manually added interfaces are not terminated by default

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 31: 

One of your clients is a financial organization that has a large presence in AWS and also has a number of their own data centers. The client has requested a recommended high-level hosting architecture for a distributed application that will utilize decoupled components. The application will make use of application servers running on AWS EC2 instances and in the client’s own data centers. What AWS application integration services could you use to support interaction between the application servers? Which of the following options are valid? (choose 2)

- A. SNS
- B. SWF 
- C. SQS 
- D. DynamoDB
- E. VPC

<details><summary>Answer:</summary><p>
BC

Explanation:

Amazon Simple Workflow Service (SWF) is a web service that makes it easy to coordinate work across distributed application components

SWF enables applications for a range of use cases, including media processing, web application back-ends, business process workflows, and analytics pipelines, to be designed as a coordination of tasks

Amazon Simple Queue Service (Amazon SQS) is a web service that gives you access to message queues that store messages waiting to be processed

SQS offers a reliable, highly-scalable, hosted queue for storing messages in transit between computers

SQS is used for distributed/decoupled applications

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-swf/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

### Question 32: 

Which feature of IAM allows you direct access to the IAM web service using HTTPS to call service actions and what is the method of authentication that must be used? (choose 2)

- A. IAM role
- B. API Gateway
- C. Query API 
- D. Access key ID and secret access key 

<details><summary>Answer:</summary><p>
CD

Explanation:

AWS recommend that you use the AWS SDKs to make programmatic API calls to IAM

However, you can also use the IAM Query API to make direct calls to the IAM web service

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 33: 

Your Systems Administrators currently use Chef for configuration management of on-premise servers. Which AWS service will provide a fully-managed configuration management service that will allow you to use your existing Chef cookbooks?

- A. Elastic Beanstalk
- B. OpsWorks for Chef Automate 
- C. Opsworks Stacks
- D. CloudFormation

<details><summary>Answer:</summary><p>
B

Explanation:

AWS OpsWorks is a configuration management service that provides managed instances of Chef and Puppet

AWS OpsWorks for Chef Automate is a fully-managed configuration management service that hosts Chef Automate, a suite of automation tools from Chef for configuration management, compliance and security, and continuous deployment

OpsWorks for Chef Automate is completely compatible with tooling and cookbooks from the Chef community and automatically registers new nodes with your Chef server

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-opsworks/

</p></details><hr>

### Question 34: 

In Amazon CloudWatch how long are data points with a period of 60 seconds (1-minute) are available for?

- A. 63 days
- B. 455 days
- C. 15 days 
- D. 14 days

<details><summary>Answer:</summary><p>
C

Explanation:

Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution custom metrics.

Data points with a period of 60 seconds (1 minute) are available for 15 days

Data points with a period of 300 seconds (5 minute) are available for 63 days

Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/amazon-cloudwatch/

</p></details><hr>

### Question 35: 

An Auto Scaling Group in which you have four EC2 instances running is becoming heavily loaded. The instances are using the m4.large instance type and the CPUs are hitting 80%. Due to licensing constraints you don’t want to add additional instances to the ASG so you are planning to upgrade to the m4.xlarge instance type instead. You need to make the change immediately but don’t want to terminate the existing instances. How can you perform the change without causing the ASG to launch new instances? (choose 2)

- A. On the ASG suspend the Auto Scaling process until you have completed the change 
- B. Stop each instance and change its instance type. Start the instance again 
- C. Create a new launch configuration with the new instance type specified
- D. Edit the existing launch configuration and specify the new instance type 

<details><summary>Answer:</summary><p>
AB

Explanation:

When you resize an instance, you must select an instance type that is compatible with the configuration of the instance

You must stop your Amazon EBS–backed instance before you can change its instance type

You can suspend and then resume one or more of the scaling processes for your Auto Scaling group

Suspending scaling processes can be useful when you want to investigate a configuration problem or other issue with your web application and then make changes to your application, without invoking the scaling processes

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html

</p></details><hr>

### Question 36: 

You are configuring Route 53 for a customer’s website. Their web servers are behind an Internet-facing ELB. What record set would you create to point the customer’s DNS zone apex record at the ELB?

- A. Create a CNAME record that is an Alias, and select the ELB DNS as a target
- B. Create an A record pointing to the DNS name of the load balancer
- C. Create a PTR record pointing to the DNS name of the load balancer
- D. Create an A record that is an Alias, and select the ELB DNS as a target 

<details><summary>Answer:</summary><p>
D

Explanation:

An Alias record can be used for resolving apex or naked domain names (e.g. example.com)

A CNAME record can’t be used for resolving apex or naked domain names

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 37: 

You work for a systems integrator running a platform that stores medical records. The government security policy mandates that patient data that contains personally identifiable information (PII) must be encrypted at all times, both at rest and in transit. You are using Amazon S3 to back up data into the AWS cloud. How can you ensure the medical records are properly secured? (choose 2)

- A. Before uploading the data to S3 over HTTPS, encrypt the data locally using your own encryption keys 
- B. Attach an encrypted EBS volume to an EC2 instance 
- C. Upload the data using CloudFront with an EC2 origin
- D. Enable Server Side Encryption with S3 managed keys on an S3 bucket using AES-128
- E. Enable Server Side Encryption with S3 managed keys on an S3 bucket using AES-256 

<details><summary>Answer:</summary><p>
AE

Explanation:

You can securely upload/download your data to Amazon S3 via SSL endpoints using the HTTPS protocol (In Transit – SSL/TLS)

Encryption options:

- Client side – encrypted on the client side and transferred in an encrypted state

- Server-Side Encryption – data is encrypted by S3 before it is written to disk (data is decrypted when it is downloaded)

SSE-S3 – Server Side Encryption with S3 managed keys:

- Each object is encrypted with a unique key

- Encryption key is encrypted with a master key

- AWS regularly rotate the master key

- Uses AES 256

SSE-C – Server Side Encryption with client provided keys:

- Client manages the keys, S3 manages encryption

- AWS does not store the encryption keys

- If keys are lost data cannot be decrypted

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 38: 

You need to create an EBS volume to mount to an existing EC2 instance for an application that will be writing structured data to the volume. The application vendor suggests that the performance of the disk should be up to 3 IOPS per GB. You expect the capacity of the volume to grow to 2TB. Taking into account cost effectiveness, which EBS volume type would you select?

- A. General Purpose (GP2) 
- B. Provisioned IOPS (IO1) 
- C. Throughput Optimized HDD (ST1)
- D. Cold HDD (SC1)

<details><summary>Answer:</summary><p>
A

Explanation:

SSD, General Purpose – GP2: 3 IOPS per GB up to 10,000 IOPS Burst up to 3000 IOPS for volumes >= 334GB)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 39: 

An application you are designing will gather data from a website hosted on an EC2 instance and write the data to an S3 bucket. The application will use API calls to interact with the EC2 instance and S3 bucket. What strategy would you implement for access control? (choose 2)

- A. Create an IAM policy 
- B. Grant programmatic access 
- C. Create a bucket policy 
- D. Grant AWS Management Console access

<details><summary>Answer:</summary><p>
AB

Explanation:

Policies are documents that define permissions and can be applied to users, groups and roles

Policy documents are written in JSON (key value pair that consists of an attribute and a value)

Within an IAM policy you can grant either programmatic access or AWS Management Console access to Amazon S3 resources

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 40: 

With RDS in a Multi-AZ configuration, which of the following statements about snapshots are true? (choose 2)

- A. In multi-AZ configurations snapshots and automated backups are performed on the standby to avoid I/O suspension on the primary instance 
- B. When restoring a snapshot all DB parameters and security groups are restored
- C. DBs that are restored from snapshots will always be a new RDS instance with a new DNS endpoint 
- D. Snapshots cannot be shared with other AWS accounts

<details><summary>Answer:</summary><p>
AC

Explanation:

In multi-AZ configurations snapshots and automated backups are performed on the standby to avoid I/O suspension on the primary instance

The process for implementing maintenance activities is as follows:

- Perform operations on standby

- Promote standby to primary

- Perform operations on new standby (demoted primary)

Restored DBs will always be a new RDS instance with a new DNS endpoint

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 41: 

One of your clients is a banking regulator and they run an application that provides auditing information to the general public using AWS Lambda and API Gateway. A Royal Commission has exposed some suspect lending practices and this has been picked up by the media and raised concern amongst the general public. With some major upcoming announcements expected you’re concerned about traffic spikes hitting the client’s application. How can you protect the backend systems from traffic spikes?

- A. Enable throttling limits and result caching in API Gateway 
- B. Use a CloudFront Edge Cache 
- C. Use ElastiCache as the front-end to cache frequent queries
- D. Put the APIs in an S3 bucket and publish as a static website using CloudFront

<details><summary>Answer:</summary><p>
A

Explanation:

You can throttle and monitor requests to protect your backend

Resiliency through throttling rules based on the number of requests per second for each HTTP method (GET, PUT)

Throttling can be configured at multiple levels including Global and Service Call

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

</p></details><hr>

### Question 42: 

An issue has been raised to you whereby a client is concerned about the permissions assigned to his containerized applications. The containers are using the EC2 launch type. The current configuration uses the container instance’s IAM roles for assigning permissions to the containerized applications. The client has asked if it’s possible to implement more granular permissions so that some applications can be assigned more restrictive permissions?

- A. This can only be achieved using the Fargate launch type
- B. This cannot be changed as IAM roles can only be linked to container instances
- C. This can be achieved by configuring a resource-based policy for each application
- D. This can be achieved using IAM roles for tasks, and splitting the containers according to the permissions required to different task definition profiles 

<details><summary>Answer:</summary><p>
D

Explanation:

IAM can be used to control access at the container level using IAM roles

The container agent makes calls to the ECS API on your behalf through the applied IAM roles and policies

You need to apply IAM roles to container instances before they are launched (EC2 launch type)

AWS recommend limiting the permissions that are assigned to the container instance’s IAM roles

Assign extra permissions to tasks through separate IAM roles (IAM Roles for Tasks)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 43: 

In your AWS VPC, you need to add a new subnet that will allow you to host a total of 20 EC2 instances. Which of the following IPv4 CIDR blocks can you use for this scenario?

- A. 172.0.0.0/30
- B. 172.0.0.0/28
- C. 172.0.0.0/27 
- D. 172.0.0.0/29

<details><summary>Answer:</summary><p>
C

Explanation:

When you create a VPC, you must specify an IPv4 CIDR block for the VPC

The allowed block size is between a /16 netmask (65,536 IP addresses) and /28 netmask (16 IP addresses)

The CIDR block must not overlap with any existing CIDR block that's associated with the VPC

A /27 subnet mask provides 30 addresses

The first four IP addresses and the last IP address in each subnet CIDR block are not available for you to use, and cannot be assigned to an instance

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 44: 

An Amazon CloudWatch alarm recently notified you that the load on a DynamoDB table you are running is getting close to the provisioned capacity for writes. The DynamoDB table is part of a two-tier customer-facing application. You are concerned about what will happen if the limit is reached but need to wait for approval to increase the WriteCapacityUnits value assigned to the table. What will happen if the limit for the provisioned capacity for writes is reached?

- A. The requests will succeed, and an HTTP 200 status code will be returned
- B. The requests will be throttled, and fail with an HTTP 503 code (Service Unavailable)
- C. The requests will be throttled, and fail with an HTTP 400 code (Bad Request) and a ProvisionedThroughputExceededException 
- D. DynamoDB scales automatically so there’s no need to worry

<details><summary>Answer:</summary><p>
C

Explanation:

DynamoDB can throttle requests that exceed the provisioned throughput for a table

When a request is throttled it fails with an HTTP 400 code (Bad Request) and a ProvisionedThroughputExceeded exception

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 45: 

One of the applications you manage on RDS uses the MySQL DB and has been suffering from performance issues. You would like to setup a reporting process that will perform queries on the database but you’re concerned that the extra load will further impact the performance of the DB and may lead to poor customer experience. What would be the best course of action to take so you can implement the reporting process?

- A. Configure Multi-AZ to setup a secondary database instance in another Availability Zone
- B. Configure Multi-AZ to setup a secondary database instance in another region
- C. Deploy a Read Replica to setup a secondary read and write database instance
- D. Deploy a Read Replica to setup a secondary read-only database instance 

<details><summary>Answer:</summary><p>
D

Explanation:

Read replicas are used for read heavy DBs and replication is asynchronous

Read replicas are for workload sharing and offloading

Read replicas are created from a snapshot of the master instance

Must have automated backups enabled on the primary (retention period > 0)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 46: 

You are designing solutions that will utilize CloudFormation templates and your manager has asked how much extra will it cost to use CloudFormation to deploy resources?

- A. CloudFormation is charged per hour of usage
- B. There is no additional charge for AWS CloudFormation, you only pay for the AWS resources that are created 
- C. Amazon charge a flat fee for each time you use CloudFormation
- D. The cost is based on the size of the template

<details><summary>Answer:</summary><p>
B

Explanation:

There is no additional charge for AWS CloudFormation

You pay for AWS resources (such as Amazon EC2 instances, Elastic Load Balancing load balancers, etc.) created using AWS CloudFormation in the same manner as if you created them manually

You only pay for what you use, as you use it; there are no minimum fees and no required upfront commitments

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudformation/

</p></details><hr>

### Question 47: 

Which of the statements below are correct about Elastic Container Service (ECS) tasks?

- A. Task definitions use Docker images to launch containers
- B. A task definition is required to run Docker containers in Amazon ECS
- C. A task definition is a text file in JSON format that describes one or more container
- D. You can use Amazon ECS Run task to run one or more tasks once
- E. All answers are correct 

<details><summary>Answer:</summary><p>
E

Explanation:

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 48: 

You are creating a series of environments within a single VPC. You need to implement a system of categorization that allows for identification of EC2 resources by business unit, owner, or environment. Which AWS feature allows you to do this?

- A. Metadata
- B. Custom filters
- C. Tags 
- D. Parameters

<details><summary>Answer:</summary><p>
C

Explanation:

A tag is a label that you assign to an AWS resource

Each tag consists of a key and an optional value, both of which you define

Tags enable you to categorize your AWS resources in different ways, for example, by purpose, owner, or environment

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 49: 

You are a Solutions Architect at Digital Cloud Guru. A new client who has not used cloud computing has asked you to explain how AWS works. The client wants to know what service is provided that will provide a virtual network infrastructure that loosely resembles a traditional data center but has the capacity to scale more easily?

- A. Elastic Compute Cloud
- B. Elastic Load Balancing
- C. Direct Connect
- D. Virtual Private Cloud 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon VPC lets you provision a logically isolated section of the Amazon Web Services (AWS) cloud where you can launch AWS resources in a virtual network that you define

Analogous to having your own DC inside AWS

Provides complete control over the virtual networking environment including selection of IP ranges, creation of subnets, and configuration of route tables and gateways

A VPC is logically isolated from other VPCs on AWS

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 50: 

You are creating a CloudFormation template that will provision a new EC2 instance and new EBS volume. What do you need to specify to associate the block store with the instance?

- A. The EC2 logical ID 
- B. Both the EC2 logical ID and the EBS logical ID 
- C. Both the EC2 physical ID and the EBS physical ID
- D. The EC2 physical ID

<details><summary>Answer:</summary><p>
B

Explanation:

Logical IDs are used to reference resources within the template

Physical IDs identify resources outside of AWS CloudFormation templates, but only after the resources have been created

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/amazon-cloudwatch/

</p></details><hr>

### Question 51: 

You are a Developer working for Digital Cloud Guru. You are planning to write some code that creates a URL that lets users who sign in to your organization's network securely access the AWS Management Console. The URL will include a sign-in token that you get from AWS that authenticates the user to AWS. You are using Microsoft Active Directory Federation Services as your identity provider (IdP) which is compatible with SAML 2.0. Which of the steps below will you need to include when developing your custom identity broker? (choose 3)

- A. Generate a pre-signed URL programmatically using the AWS SDK for Java or the AWS SDK for .NET
- B. Assume an IAM Role through the console or programmatically with the AWS CLI, Tools for Windows PowerShell or API 
- C. Call the AWS Security Token Service (AWS STS) AssumeRole or GetFederationToken API operations to obtain temporary security credentials for the user 
- D. Construct a URL for the console that includes the token 
- E. Call the AWS federation endpoint and supply the temporary security credentials to request a sign-in token 

<details><summary>Answer:</summary><p>
CDE

Explanation:

The AWS Security Token Service (STS) is a web service that enables you to request temporary, limited-privilege credentials for IAM users or for users that you authenticate (federated users)

Steps are: Verify that the user is authenticated by your local identity system Call the AWS Security Token Service (AWS STS) AssumeRole or GetFederationToken API operations to obtain temporary security credentials for the user Call the AWS federation endpoint and supply the temporary security credentials to request a sign-in token Construct a URL for the console that includes the token Give the URL to the user or invoke the URL on the user's behalf

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html

</p></details><hr>

### Question 52: 

An application you run on AWS uses an ELB to distributed connections between EC2 instances. You need to record information on the requester, IP, and request type for connections made to the ELB. You will also need to perform some analysis on the log files, which AWS services and configuration options can be used to collect and then analyze the logs? (choose 2)

- A. Use Elastic Transcoder to analyze the log files
- B. Update the application to use DynamoDB for storing log files
- C. Enable Access Logs on the ELB and store the log files on S3 
- D. Enable Access Logs on the EC2 instances and store the log files on S3
- E. Use EMR for analyzing the log files 

<details><summary>Answer:</summary><p>
CE

Explanation:

Access Logs on ELB:

- Disabled by default

- Includes information about the clients (not included in CloudWatch metrics)

- Can identify requester, IP, request type etc.

- Can be optionally stored and retained in S3

Amazon EMR is a web service that enables businesses, researchers, data analysts, and developers to easily and cost-effectively process vast amounts of data

EMR utilizes a hosted Hadoop framework running on Amazon EC2 and Amazon S3

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-emr/

</p></details><hr>

### Question 53: 

Your manager has asked you to explain the benefits of using IAM groups. Which of the below statements are valid benefits? (choose 2)

- A. Groups let you specify permissions for multiple users, which can make it easier to manage the permissions for those users 
- B. Provide the ability to create custom permission policies
- C. You can restrict access to the subnets in your VPC
- D. Enables you to attach IAM permission policies to more than one user at a time 

<details><summary>Answer:</summary><p>
AD

Explanation:

Groups are collections of users and have policies attached to them

A group is not an identity and cannot be identified as a principal in an IAM policy

Use groups to assign permissions to users

Use the principal of least privilege when assigning permissions

You cannot nest groups (groups within groups)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 54: 

You are putting together the design for a new retail website for a high-profile company. The company has previously been the victim of targeted distributed denial-of-service (DDoS) attacks and have requested that you ensure the design includes mitigation techniques. Which of the following techniques would help with this requirement? (choose 3)

- A. Use an ALB with ASG for your EC2 instances and restrict direct Internet traffic by deploying your RDS DB layer in a private subnet 
- B. Setup alerts in CloudWatch to look for high "Network In" and high CPU utilization 
- C. CloudFront for distributing both static and dynamic content 
- D. Configure Auto Scaling with a high maximum number of instances to ensure it can scale accordingly 
- E. Use Spot instances to reduce the cost impact in case of attack
- F. Use Placement Groups to ensure high bandwidth and low

<details><summary>Answer:</summary><p>
ABC

Explanation:

CloudFront distributes traffic across multiple edge locations and filters requests to ensure that only valid HTTP(S) requests will be forwarded to backend hosts. CloudFront also supports geoblocking, which you can use to prevent requests from particular geographic locations from being served

ELB automatically distributes incoming application traffic across multiple targets, such as Amazon Elastic Compute Cloud (Amazon EC2) instances, containers, and IP addresses, and multiple Availability Zones, which minimizes the risk of overloading a single resource

ELB, like CloudFront, only supports valid TCP requests, so DDoS attacks such as UDP and SYN floods are not able to reach EC2 instances

ELB also offers a single point of management and can serve as a line of defense between the internet and your backend, private EC2 instances

Auto Scaling helps to maintain a desired count of EC2 instances running at all times

RDS supports several scenarios for deploying DB instances in private and public facing configurations

CloudWatch can be used to setup alerts for when metrics reach unusual levels. High network in traffic may indicate a DDoS attack

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-cloudfront/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

https://aws.amazon.com/answers/networking/aws-ddos-attack-mitigation/

https://docs.aws.amazon.com/waf/latest/developerguide/tutorials-ddos-cross-service.html

https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Scenarios.html

</p></details><hr>

### Question 55: 

When using a Classic Load Balancer, which of the following combinations of listeners support the proxy protocol? (choose 2)

- A. Front-End – TCP & Back-End – TCP 
- B. Front-End – SSL & Back-End – SSL 
- C. Front-End – SSL & Back-End - TCP 
- D. Front-End – TCP & Back-End SSL

<details><summary>Answer:</summary><p>
AC

Explanation:

Proxy protocol for TCP/SSL carries the source (client) IP/port information

The Proxy Protocol header helps you identify the IP address of a client when you have a load balancer that uses TCP for back-end connection

Ensure the client doesn’t go through a proxy or there will be multiple proxy headers

Proxy protocol only applies to L4

X-forwarded-for only applies to L7

Back end listener must be TCP for Proxy protocol

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-elb-listenerconfig-quickref.html

</p></details><hr>

### Question 56: 

An application you manage in your VPC uses an Auto Scaling Group that spans 3 AZs and there are currently 4 EC2 instances running in the group. What actions will Auto Scaling take, by default, if it needs to terminate an EC2 instance? (choose 2)

- A. Wait for the cooldown period and then terminate the instance that has been running the longest 
- B. Terminate an instance in the AZ which currently has 2 running EC2 instances 
- C. Send an SNS notification, (if configured) 
- D. Randomly select one of the 3 AZs, and then terminate an instance in that AZ
- E. Terminate the instance with the least active network connections. If multiple instances meet this criterion, one will be randomly selected

<details><summary>Answer:</summary><p>
BC

Explanation:

Auto Scaling can be configured to send an SNS email when:

- An instance is launched

- An instance is terminated

- An instance fails to launch

- An instance fails to terminate

Auto Scaling can perform rebalancing when it finds that the number of instances across AZs is not balanced

Auto Scaling rebalances by launching new EC2 instances in the AZs that have fewer instances first, only then will it start terminating instances in AZs that had more instances

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 57: 

You would like to store a backup of an Amazon EBS volume on Amazon S3. What is the easiest way of achieving this?

- A. Use SWF to automatically create a backup of your EBS volumes and then upload them to an S3 bucket
- B. You don’t need to do anything, EBS volumes are automatically backed up by default
- C. Write a custom script to automatically copy your data to an S3 bucket
- D. Create a snapshot of the volume 

<details><summary>Answer:</summary><p>
D

Explanation:

Snapshots capture a point-in-time state of an instance

Snapshots are stored on S3

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 58: 

When enabling the Proxy Protocol with an ELB to carry connection information from the source requesting the connection, what prerequisites apply? (choose 3)

- A. Confirm that your back-end listeners are configured for TCP and front-end listeners are configured for TCP 
- B. Confirm that your instances can process the Proxy Protocol information 
- C. Confirm that your load balancer is using HTTPS listeners
- D. Confirm that your load balancer is configured to include the X-Forwarded-For request header
- E. Confirm that your load balancer is not behind a proxy server with Proxy Protocol enabled 

<details><summary>Answer:</summary><p>
ABE

Explanation:

Proxy protocol for TCP/SSL carries the source (client) IP/port information

The Proxy Protocol header helps you identify the IP address of a client when you have a load balancer that uses TCP for back-end connections

Ensure the client doesn’t go through a proxy or there will be multiple proxy headers

Also need to ensure the EC2 instance’s TCP stack can process the extra information

Back end listeners must be configured for TCP

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-elb-listenerconfig-quickref.html

</p></details><hr>

### Question 59: 

You are a Solutions Architect at Digital Cloud Guru and have been assigned the task of moving some sensitive documents into the AWS cloud. You need to ensure that the security of the documents is maintained. Which AWS features can help ensure that the sensitive documents are secured on the AWS cloud? (choose 3)

- A. S3 Server-Side Encryption 
- B. S3 Client-Side encryption 
- C. EBS snapshots
- D. EBS encryption with Customer Managed Keys 
- E. S3 cross region replication
- F. IAM Access Policy

<details><summary>Answer:</summary><p>
ABD

Explanation:

All EBS types support encryption

All instance families now support encryption

To encrypt a volume or snapshot you need an encryption key, these are customer managed keys (CMK) and they are managed by the AWS Key Management Service (KMS)

S3 encryption options: Client side – encrypted on the client side and transferred in an encrypted state Server-Side Encryption – data is encrypted by S3 before it is written to disk (data is decrypted when it is downloaded)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 60: 

There is a problem with an EC2 instance that was launched by AWS Auto Scaling. The EC2 status checks have reported that the instance is “Impaired”. What action will AWS Auto Scaling take?

- A. It will launch a new instance immediately and then mark the impaired one for replacement 
- B. Auto Scaling performs its own status checks and does not integrate with EC2 status checks
- C. Auto Scaling will wait for 300 seconds to give the instance a chance to recover
- D. It will mark the instance for termination, terminate it, and then launch a replacement 

<details><summary>Answer:</summary><p>
D

Explanation:

If any health check returns an unhealthy status the instance will be terminated

Unlike AZ rebalancing, termination of unhealthy instances happens first, then Auto Scaling attempts to launch new instances to replace terminated instances

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 61: 

You have created a new VPC and setup an Auto Scaling Group to maintain a desired count of 2 EC2 instances. The security team have requested that the EC2 instances are located in a private subnet. To distribute load, you have also setup an Internet-facing Application Load Balancer (ALB). With your security team’s wishes in mind what else needs to be done to get this configuration to work? (choose 2)

- A. Attach an Internet Gateway to the private subnets
- B. For each private subnet create a corresponding public subnet in the same AZ 
- C. Associate the public subnets with the ALB 
- D. Associate both the private and public subnets with the ALB 

<details><summary>Answer:</summary><p>
BC

Explanation:

ELB nodes have public IPs

Routes traffic to the private IP addresses of the EC2 instances

Need one public subnet in each AZ where the ELB is defined

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 62: 

A new application you are designing will store data in an Amazon Aurora MySQL DB. You are looking for a way to enable failover for the Aurora DB in the case of a regional outage. How can this be achieved?

- A. Create a cross-region Aurora Replica 
- B. Enable Multi-AZ for the Aurora DB
- C. Create an EBS backup of the Aurora volumes and use cross-region replication to copy the snapshot
- D. Take a manual backup of the Aurora DB and copy it to another region

<details><summary>Answer:</summary><p>
A

Explanation:

RDS read replicas are available for MySQL, PostgreSQL, MariaDB and Aurora (no SQL Server or Oracle)

Two types of replication: Aurora replica (up to 15), My SQL Read Replica (up to 5)

Automatic failover is available for Aurora replicas only

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Replication.html

</p></details><hr>

### Question 63: 

A membership website your company manages has become quite popular and is gaining members quickly. The website currently runs on EC2 instances with one web server instance and one DB instance running MySQL. You are concerned about the lack of high-availability in the current architecture. What can you do to easily enable HA without making major changes to the architecture?

- A. Install MySQL on an EC2 instance in another AZ and enable replication 
- B. Create a Read Replica in another AZ
- C. Install MySQL on an EC2 instance in the same AZ and enable replication
- D. Enable Multi-AZ for the MySQL instance 

<details><summary>Answer:</summary><p>
A

Explanation:

You cannot enable read replicas or multi-AZ using MySQL, you would need RDS

Migrating to RDS would entail a major change to the architecture

In this example it will be easier to use the native HA features of MySQL than to migrated to RDS

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 64: 

One of your clients is experiencing an issue whereby their Auto Scaling Group is not scaling fast enough to keep up with periods of peak load. The result is that some requests that are coming through to the applications are being lost. What is the most cost-effective way to avoid losing requests?

- A. Use an Elastic Load Balancer
- B. Use Spot instances to take some of the load
- C. Use larger EC2 instance sizes
- D. Decouple the application components by using an SQS queue 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon Simple Queue Service (Amazon SQS) is a web service that gives you access to message queues that store messages waiting to be processed

SQS offers a reliable, highly-scalable, hosted queue for storing messages in transit between computers

SQS is used for distributed/decoupled applications

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

### Question 65: 

Which statements about ECS clusters are correct? (choose 3)

- A. Clusters are AZ specific
- B. Clusters can contain tasks using the Fargate and EC2 launch type 
- C. ECS Clusters are a logical grouping of container instances the you can place tasks on 
- D. Clusters can contain a single container instance type
- E. Each container instance may only be part of one cluster at a time 

<details><summary>Answer:</summary><p>
BCE

Explanation:

ECS Clusters are a logical grouping of container instances the you can place tasks on

A default cluster is created but you can then create multiple clusters to separate resources

ECS allows the definition of a specified number (desired count) of tasks to run in the cluster

Clusters can contain tasks using the Fargate and EC2 launch type

Each container instance may only be part of one cluster at a time

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

