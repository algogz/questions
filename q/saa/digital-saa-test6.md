### Question 1: 

Which AWS service lets you use Chef and Puppet to automate how servers are configured, deployed, and managed across your Amazon EC2 instances or on-premises compute environments

- A. AWS Elastic Beanstalk
- B. AWS CloudFormation
- C. AWS Systems Manager
- D. AWS OpsWorks 

<details><summary>Answer:</summary><p>
D

Explanation:

AWS OpsWorks is a configuration management service that provides managed instances of Chef and Puppet

OpsWorks lets you use Chef and Puppet to automate how servers are configured, deployed, and managed across your Amazon EC2 instances or on-premises compute environments

OpsWorks is an automation platform that transforms infrastructure into code

Automates how applications are configured, deployed and managed

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-opsworks/

</p></details><hr>

### Question 2: 

You created a new IAM user account for a temporary employee who recently joined the company. The user does not have permissions to perform any actions, which statement is true about newly created users in IAM?

- A. They are created with no permissions 
- B. They are created with limited permissions
- C. They are created with full permissions
- D. They are created with user privileges

<details><summary>Answer:</summary><p>
A

Explanation:

Every IAM user starts with no permissions

In other words, by default, users can do nothing, not even view their own access keys

To give a user permission to do something, you can add the permission to the user (that is, attach a policy to the user)

Or you can add the user to a group that has the intended permission.

https://docs.aws.amazon.com/IAM/latest/UserGuide/access_controlling.html

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 3: 

Which AWS service provides an in-memory cache for DynamoDB that can deliver 10x performance improvements even at millions of requests per second?

- A. DynamoDB FastCache
- B. CloudFront
- C. EBS Provisioned IOPS
- D. DynamoDB Accelerator (DAX) 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon DynamoDB Accelerator (DAX) is a fully managed, highly available, in-memory cache for DynamoDB that delivers up to a 10x performance improvement – from milliseconds to microseconds – even at millions of requests per second

DAX does all the heavy lifting required to add in-memory acceleration to your DynamoDB tables, without requiring developers to manage cache invalidation, data population, or cluster management

https://aws.amazon.com/dynamodb/dax/

</p></details><hr>

### Question 4: 

In Amazon SQS, which mechanism is used to prevent consumers from processing a message that has already been picked up from the queue?

- A. Delay queue
- B. Long polling
- C. Visibility timeout 
- D. Invisibility counter

<details><summary>Answer:</summary><p>
C

Explanation:

The visibility timeout is the amount of time a message is invisible in the queue after a reader picks up the message

If a job is processed within the visibility timeout the message will be deleted



If a job is not processed within the visibility timeout the message will become visible again (could be delivered twice)

The maximum visibility timeout for an Amazon SQS message is 12 hours

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html

</p></details><hr>

### Question 5: 

What are two key tools that you use to interact with the AWS Lambda service? (choose 2)

- A. Lambda Console 
- B. AWS CLI 
- C. Serverless Manager
- D. VPC SDK

<details><summary>Answer:</summary><p>
AB

Explanation:

Lambda Console: Provides a way for you to graphically design your Lambda-based application, author or update your Lambda function code, and configure event, downstream resources and IAM permissions that your function requires

AWS CLI: A command-line interface you can use to leverage Lambda's API operations, such as creating functions and mapping event sources

There’s also the SAM CLI (public beta): A command-line interface you can use to develop, test, and analyze your serverless applications locally before uploading them to the Lambda runtime

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

https://docs.aws.amazon.com/lambda/latest/dg/getting-started.html

</p></details><hr>

### Question 6: 

You need to run a PowerShell script on a fleet of EC2 instances running Microsoft Windows. The instances have already been launched in your VPC. What tool can be run from the AWS Management Console that will run the script on all target EC2 instances?

- A. AWS OpsWorks
- B. Run Command 
- C. AWS Config
- D. AWS CodeDeploy

<details><summary>Answer:</summary><p>
B

Explanation:

Run Command is designed to support a wide range of enterprise scenarios including installing software, running ad hoc scripts or Microsoft PowerShell commands, configuring Windows Update settings, and more

Run Command can be used to implement configuration changes across Windows instances on a consistent yet ad hoc basis

Run Command is accessible from the AWS Management Console, the AWS Command Line Interface (CLI), the AWS Tools for Windows PowerShell, and the AWS SDKs

https://aws.amazon.com/blogs/aws/new-ec2-run-command-remote-instance-management-at-scale/

</p></details><hr>

### Question 7: 

When using encrypted Elastic Block Store (EBS) volumes, which of the following statements are correct? (choose 2)

- A. Not all EBS types support encryption
- B. All instance types support encryption
- C. There is no direct way to change the encryption state of a volume 
- D. Data in transit between an instance and an encrypted volume is also encrypted 

<details><summary>Answer:</summary><p>
CD

Explanation:

All EBS types support encryption

All instance families now support encryption

Not all instance types support encryption

There is no direct way to change the encryption state of a volume

Data in transit between an instance and an encrypted volume is also encrypted

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 8: 

Amazon EC2 Auto Scaling helps you ensure that you have the correct number of Amazon EC2 instances available to handle the load for your applications. Which of the following statements is correct about Auto Scaling? (choose 3)

- A. Auto Scaling is a region-specific service 
- B. Auto Scaling can span multiple AZs within the same AWS region 
- C. You create collections of EC2 instances, called Auto Scaling groups 
- D. Auto Scaling is charged by the hour when registered

<details><summary>Answer:</summary><p>
ABC

Explanation:

You create collections of EC2 instances, called Auto Scaling groups

Auto Scaling is a region specific service

Auto Scaling can span multiple AZs within the same AWS region

Auto Scaling can be configured from the Console, CLI, SDKs and APIs

There is no additional cost for Auto Scaling, you just pay for the resources (EC2 instances) provisioned

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 9: 

You are using a series of Spot instances that process messages from an SQS queue and store results in a DynamoDB table. Shortly after picking up a message from the queue AWS terminated the Spot instance. The Spot instance had not finished processing the message. What will happen to the message?

- A. The message will be lost as it would have been deleted from the queue when processed
- B. The message will remain in the queue and be immediately picked up by another instance
- C. The message will become available for processing again after the visibility timeout expires 
- D. The results may be duplicated in DynamoDB as the message will likely be processed multiple times

<details><summary>Answer:</summary><p>
C

Explanation:

The visibility timeout is the amount of time a message is invisible in the queue after a reader picks up the message

If a job is processed within the visibility timeout the message will be deleted

If a job is not processed within the visibility timeout the message will become visible again (could be delivered twice)

The maximum visibility timeout for an Amazon SQS message is 12 hours

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

### Question 10: 

You are a Solutions Architect at Digital Cloud Guru. One of your clients has requested some advice on how to implement security measures in their VPC. The client has recently been the victim of some hacking attempts. Fortunately, no data has been exposed at this point but the client wants to implement measures to mitigate further threats. The client has explained that the attacks always come from the same small block of IP addresses. What would be a quick and easy measure to help prevent further attacks?

- A. Use CloudFront’s DDoS prevention features
- B. Create a Bastion Host restrict all connections to the Bastion Host only
- C. Use a Network ACL rule that denies connections from the block of IP addresses 
- D. Use a Security Group rule that denies connections from the block of IP addresses

<details><summary>Answer:</summary><p>
C

Explanation:

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 11: 

You need to setup a distribution method for some static files. The requests will be mainly GET requests and you are expecting a high volume of GETs often exceeding 2000 per second. The files are currently stored in an S3 bucket. According to AWS best practices, what can you do to optimize performance?

- A. Integrate CloudFront with S3 to cache the content 
- B. Use cross-region replication to spread the load across regions
- C. Use ElastiCache to cache the content
- D. Use S3 Transfer Acceleration

<details><summary>Answer:</summary><p>
A

Explanation:

Amazon S3 automatically scales to high request rates

For example, your application can achieve at least 3,500 PUT/POST/DELETE and 5,500 GET requests per second per prefix in a bucket. There are no limits to the number of prefixes in a bucket

If your workload is mainly sending GET requests, in addition to the preceding guidelines, you should consider using Amazon CloudFront for performance optimization

By integrating CloudFront with Amazon S3, you can distribute content to your users with low latency and a high data transfer rate

Transfer Acceleration is used to accelerate object uploads to S3 over long distances (latency)

https://docs.aws.amazon.com/AmazonS3/latest/dev/request-rate-perf-considerations.html

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 12: 

An application you manage uses RDS in a multi-AZ configuration as the database back-end. There is a failure of the primary DB instance. Which of the following statements are correct in relation to the process RDS uses to failover to the standby DB instance? (choose 2)

- A. The failover mechanism automatically changes the DNS record of the DB instance to point to the standby DB instance 
- B. Failover times are typically 60-120 seconds 
- C. Multi-AZ uses synchronous replication; therefore, the failover is instantaneous 
- D. The failover mechanism automatically moves the Elastic IP address of the instance to the standby DB instance

<details><summary>Answer:</summary><p>
AB

Explanation:

The failover mechanism automatically changes the DNS record of the DB instance to point to the standby DB instance

As a result, you need to re-establish any existing connections to your DB instance

The time it takes for the failover to complete depends on the database activity and other conditions at the time the primary DB instance became unavailable

Failover times are typically 60-120 seconds

Multi-AZ does use synchronous replication but failover is not instantaneous

https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 13: 

You are trying to SSH into an EC2 instance running Linux but cannot connect. The EC2 instance has been launched in a public subnet with an Internet Gateway. Upon investigation you have verified that the instance has a public IP address and that the route table does reference the Internet Gateway correctly. What else needs to be checked to enable connectivity?

- A. Check that there is a Bastion Host in the subnet and connect to it first
- B. Check that the subnet CIDR block is referenced properly in the route table
- C. Check that the Security Groups and Network ACLs have the correct rules configured 
- D. Check that the VPN is configured correctly

<details><summary>Answer:</summary><p>
C

Explanation:

Bastion Hosts are used for connecting to instances in private subnets and will not assist with enabling direct connectivity to this instance

The subnet CIDR block is configured automatically as part of the creation of the VPC/subnet so should not be the issue here

Security Groups and Network ACLs do need to be configured to enable connectivity

You do not need a VPN connection to connect to an instance in a public subnet

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 14: 

You are a Solutions Architect at Digital Cloud Guru. A client has asked you for some advice about how they can capture detailed information about all HTTP requests that are processed by their Internet facing Application Load Balancer (ALB). The client requires information on the requester, IP address, and request type for analyzing traffic patterns to better understand their customer base. What would you recommend to the client?

- A. Enable Access Logs and store the data on S3 
- B. Configure metrics in CloudWatch for the ALB
- C. Use CloudTrail to capture all API calls made to the ALB
- D. Enable EC2 detailed monitoring

<details><summary>Answer:</summary><p>
A

Explanation:

Monitoring for ALB can be performed using CloudWatch, Access Logs and CloudTrail

CloudWatch

- Every 1 minute:

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

### Question 15: 

One of your clients is transitioning their web presence into the AWS cloud. As part of the migration the client will be running a web application both on-premises and in AWS for a period of time. During the period of co-existence the client would like 80% of the traffic to hit the AWS-based web servers and 20% to be directed to the on-premises web servers. What method can you use to distribute traffic as requested?

- A. Use a Network Load Balancer to distribute traffic based on Instance ID
- B. Use an Application Load Balancer to distribute traffic based on IP address
- C. Use Route 53 with a weighted routing policy and configure the respective weights 
- D. Use Route 53 with a simple routing policy

<details><summary>Answer:</summary><p>
C

Explanation:

Network Load Balancer can distribute traffic to AWS and on-premise resources using IP addresses (not Instance IDs)

Application Load Balancer can distribute traffic to AWS and on-premise resources using IP addresses but cannot be used to distribute traffic in a weighted manner

Route 53 weighted routing policy: Similar to simple but you can specify a weight per IP address You create records that have the same name and type and assign each record a relative weight Numerical value that favours one IP over another Must total 100 To stop sending traffic to a resource you can change the weight of the record to 0

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 16: 

You are creating a CloudFormation Stack that will create EC2 instances that will record log files to an S3 bucket. When creating the template which optional section is used to return the name of the S3 bucket?

- A. Mappings
- B. Outputs 
- C. Resources
- D. Parameters

<details><summary>Answer:</summary><p>
B

Explanation:

The optional Outputs section declares output values that you can import into other stacks (to create cross-stack references), return in response (to describe stack calls), or view on the AWS CloudFormation console

For example, you can output the S3 bucket name for a stack to make the bucket easier to find

Template elements include: File format and version (mandatory) List of resources and associated configuration values (mandatory) Template parameters (optional) Output values (optional) List of data tables (optional)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudformation/

https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html

</p></details><hr>

### Question 17: 

Your company has started using the AWS CloudHSM for secure key storage. A recent administrative error resulted in the loss of credentials to access the CloudHSM. You need access to data that was encrypted using keys stored on the hardware security module. How can you recover the keys that are no longer accessible?

- A. There is no way to recover your keys if you lose your credentials 
- B. Log a case with AWS support and they will use MFA to recover the credentials
- C. Restore a snapshot of the CloudHSM
- D. Reset the CloudHSM device and create a new set of credentials

<details><summary>Answer:</summary><p>
A

Explanation:

Amazon does not have access to your keys or credentials and therefore has no way to recover your keys if you lose your credentials

https://aws.amazon.com/cloudhsm/faqs/

</p></details><hr>

### Question 18: 

You have recently enabled Access Logs on your Application Load Balancer (ALB). One of your colleagues would like to process the log files using a hosted Hadoop service. What configuration changes and services can be leveraged to deliver this requirement?

- A. Configure Access Logs to be delivered to DynamoDB and use EMR for processing the log files
- B. Configure Access Logs to be delivered to S3 and use Kinesis for processing the log files
- C. Configure Access Logs to be delivered to S3 and use EMR for processing the log files 
- D. Configure Access Logs to be delivered to EC2 and install Hadoop for processing the log files

<details><summary>Answer:</summary><p>
C

Explanation:

Amazon EMR is a web service that enables businesses, researchers, data analysts, and developers to easily and cost-effectively process vast amounts of data

EMR utilizes a hosted Hadoop framework running on Amazon EC2 and Amazon S3

Access Logs can be enabled on ALB and configured to store data in an S3 bucket

Neither Kinesis or EC2 provide a hosted Hadoop service

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-emr/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 19: 

A client has started using AWS and wants to provide AWS Management Console access to some of their staff. The company currently uses Active Directory on-premise and would like to continue to configure Role Based Access Control (RBAC) using the current directory service. The client would prefer to avoid complex federation infrastructure and replicating security credentials into AWS. Which two AWS services and features can be used together to deliver the desired result? (choose 2)

- A. Use the AWS Directory Service Simple AD
- B. Use the AWS Directory Service AD Connector 
- C. Use IAM with MFA
- D. Use IAM Roles 

<details><summary>Answer:</summary><p>
BD

Explanation:

AD Connector is a directory gateway for redirecting directory requests to your on-premise Active Directory

AD Connector eliminates the need for directory synchronization and the cost and complexity of hosting a federation infrastructure

Simple AD is an inexpensive Active Directory-compatible service in the AWS cloud with common directory features

Simple AD does not support trust relationships with other domains (which the client requested is avoided anyway)

IAM with Multi-Factor Authentication (MFA) would not help in this scenario

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-directory-service/

</p></details><hr>

### Question 20: 

You have implement the AWS Elastic File System (EFS) to store data that will be accessed by a large number of EC2 instances. The data is sensitive and you are working on a design for implementing security measures to protect the data. You need to ensure that network traffic is restricted correctly based on firewall rules and access from hosts is restricted by user or group. How can this be achieved with EFS? (choose 2)

- A. Use EFS Security Groups to control network traffic 
- B. Use AWS Web Application Firewall (WAF) to protect EFS
- C. Use POSIX permissions to control access from hosts by user or group 
- D. Use IAM groups to control access by user or group 

<details><summary>Answer:</summary><p>
AC

Explanation:

You can control who can administer your file system using IAM

You can control access to files and directories with POSIX-compliant user and group-level permissions

POSIX permissions allows you to restrict access from hosts by user and group

EFS Security Groups act as a firewall, and the rules you add define the traffic flow

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-efs/

https://aws.amazon.com/efs/features/

</p></details><hr>

### Question 21: 

You have just created a new security group in your VPC. You have not yet created any rules. Which of the statements below are correct regarding the default state of the security group? (choose 2)

- A. There is an outbound rule that allows all traffic to all IP addresses 
- B. There are no inbound rules and traffic will be implicitly denied 
- C. There is an inbound rule allowing traffic from the Internet to port 22 for management
- D. There is an outbound rule allowing traffic to the Internet Gateway

<details><summary>Answer:</summary><p>
AB

Explanation:

Security groups act like a firewall at the instance level

Specifically security groups operate at the network interface level

Can only assign permit rules in a security group, cannot assign deny rules

There is an implicit deny rule at the end of the security group

All rules are evaluated until a permit is encountered or continues until the implicit deny

Can control ingress and egress traffic

Security groups are stateful

Custom security groups do not have inbound allow rules (all inbound traffic is denied by default)

Default security groups do have inbound allow rules (allowing traffic from within the group)

All outbound traffic is allowed by default in custom and default security groups

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 22: 

An application you manage runs a series of EC2 instances with a web application behind an Application Load Balancer (ALB). You are updating the configuration with a health check and need to select the protocol to use. What options are available to you? (choose 2)

- A. HTTP 
- B. SSL
- C. HTTPS 
- D. TCP
- E. ICMP

<details><summary>Answer:</summary><p>
AC

Explanation:

The Classic Load Balancer (CLB) supports health checks on HTTP, TCP, HTTPS and SSL

The Application Load Balancer (ALB) only supports health checks on HTTP and HTTPS

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 23: 

You have just created a new Network ACL in your VPC. You have not yet created any rules. Which of the statements below are correct regarding the default state of the Network ACL? (choose 2)

- A. There is a default inbound rule denying all traffic 
- B. There is a default outbound rule allowing all traffic
- C. There is a default inbound rule allowing traffic from the VPC CIDR block
- D. There is a default outbound rule denying all traffic 

<details><summary>Answer:</summary><p>
AD

Explanation:

Network ACL’s function at the subnet level

With NACLs you can have permit and deny rules

Network ACLs have separate inbound and outbound rules and each rule can allow or deny traffic

Network ACLs are stateless so responses are subject to the rules for the direction of traffic

NACLs only apply to traffic that is ingress or egress to the subnet not to traffic within the subnet

A VPC automatically comes with a default network ACL which allows all inbound/outbound traffic

A custom NACL denies all traffic both inbound and outbound by default

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 24: 

You launched an EBS-backed EC2 instance into your VPC. A requirement has come up for some high-performance ephemeral storage and so you would like to add an instance-store backed volume. How can you add the new instance store volume?

- A. You can specify the instance store volumes for your instance only when you launch an instance 
- B. You can use a block device mapping to specify additional instance store volumes when you launch your instance, or you can attach additional instance store volumes after your instance is running
- C. You must shutdown the instance in order to be able to add the instance store volume
- D. You must use an Elastic Network Adapter (ENA) to add instance store volumes. First, attach an ENA, and then attach the instance store volume

<details><summary>Answer:</summary><p>
A

Explanation:

You can specify the instance store volumes for your instance only when you launch an instance

You can't attach instance store volumes to an instance after you've launched it

You can use a block device mapping to specify additional EBS volumes when you launch your instance, or you can attach additional EBS volumes after your instance is running

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/add-instance-store-volumes.html

</p></details><hr>

### Question 25: 

You are using the Elastic Container Service (ECS) to run a number of containers using the EC2 launch type. To gain more control over scheduling containers you have decided to utilize Blox to integrate a third-party scheduler. The third-party scheduler will use the StartTask API to place tasks on specific container instances. What type of ECS scheduler will you need to use to enable this configuration?

- A. Service Scheduler
- B. Cron Scheduler
- C. ECS Scheduler 
- D. Custom Scheduler 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon ECS provides a service scheduler (for long-running tasks and applications), the ability to run tasks manually (for batch jobs or single run tasks), with Amazon ECS placing tasks on your cluster for you

The service scheduler is ideally suited for long running stateless services and applications

Amazon ECS allows you to create your own schedulers that meet the needs of your business, or to leverage third party schedulers

Blox is an open- source project that gives you more control over how your containerized applications run on Amazon ECS

Blox enables you to build schedulers and integrate third-party schedulers with Amazon ECS while leveraging Amazon ECS to fully manage and scale your clusters

Custom schedulers use the StartTask API operation to place tasks on specific container instances within your cluster

Custom schedulers are only compatible with tasks using the EC2 launch type. If you are using the Fargate launch type for your tasks, the StartTask API does not work

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html

</p></details><hr>

### Question 26: 

Which of the statements below is correct about the Amazon S3 One Zone-Infrequent Access storage class? (choose 2)

- A. Provides 99.5% availability of S3 objects 
- B. Provides 99.99% availability of S3 objects
- C. Provides 99.99% durability of S3 objects 
- D. Provides 99.999999999% durability of S3 objects 

<details><summary>Answer:</summary><p>
AD

Explanation:

Same low latency and high throughput performance of S3 Standard

Designed for durability of 99.999999999% of objects across multiple Availability Zones

Data is resilient in the event of one entire Availability Zone destruction

Designed for 99.5% availability over a given year

Backed with the Amazon S3 Service Level Agreement for availability

Supports SSL for data in transit and encryption of data at rest

Lifecycle management for automatic migration of objects

https://aws.amazon.com/s3/storage-classes/

</p></details><hr>

### Question 27: 

Which of the statements below is correct about Amazon Glacier storage? (choose 2)

- A. Provides 99.9% availability of archives
- B. Data is resilient in the event of one entire region destruction
- C. Data is resilient in the event of one entire Availability Zone destruction 
- D. Provides 99.999999999% durability of archives 

<details><summary>Answer:</summary><p>
CD

Explanation:

Designed for durability of 99.999999999% of objects across multiple Availability Zones

Data is resilient in the event of one entire Availability Zone destruction

Supports SSL for data in transit and encryption of data at rest

Extremely low cost design is ideal for long-term archive

Lifecycle management for automatic migration of objects

https://aws.amazon.com/s3/storage-classes/

</p></details><hr>

### Question 28: 

You are planning to launch a fleet of EC2 instances running Linux. As part of the launch you would like to install some application development frameworks and custom software onto the instances. The installation will be initiated using some scripts you have written. What feature allows you to specify the scripts so you can install the software during the EC2 instance launch?

- A. Metadata
- B. User data 
- C. Run command
- D. AWS Config

<details><summary>Answer:</summary><p>
B

Explanation:

When you launch an instance in Amazon EC2, you have the option of passing user data to the instance that can be used to perform common automated configuration tasks and even run scripts after the instance starts

You can pass two types of user data to Amazon EC2: shell scripts and cloud-init directives

User data is data that is supplied by the user at instance launch in the form of a script

User data is limited to 16KB

User data and meta data are not encrypted

Instance metadata is available at http://169.254.169.254/latest/meta-data

The Instance Metadata Query tool allows you to query the instance metadata without having to type out the full URI or category names

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 29: 

When using Amazon RDS with Read Replicas, which of the deployment options below are valid? (choose 3)

- A. Within an Availability Zone 
- B. Cross-Continent
- C. Cross-Availability Zone 
- D. Cross-Region 
- E. Cross-Facility

<details><summary>Answer:</summary><p>
ACD

Explanation:

Read replicas are used for read heavy DBs and replication is asynchronous

Read replicas are for workload sharing and offloading

Read Replicas can be within an AZ, Cross-AZ and Cross-Region

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 30: 

You are running an Auto Scaling Group (ASG) with an Elastic Load Balancer (ELB) and a fleet of EC2 instances. Health checks are configured on the ASG to use EC2 status checks The ELB has determined that an EC2 instance is unhealthy and has removed it from service. However, you noticed that the instance is still running and has not been terminated by the ASG. What would be an explanation for this?

- A. The ASG is waiting for the cooldown timer to expire before terminating the instance 
- B. Connection draining is enabled and the ASG is waiting for in-flight requests to complete
- C. The ELB health check type has not been selected for the ASG and so it is unaware that the instance has been determined to be unhealthy by the ELB and has been removed from service 
- D. The health check grace period has not yet expired

<details><summary>Answer:</summary><p>
C

Explanation:

If using an ELB it is best to enable ELB health checks as otherwise EC2 status checks may show an instance as being healthy that the ELB has determined is unhealthy. In this case the instance will be removed from service by the ELB but will not be terminated by Auto Scaling

Connection draining is not the correct answer as the ELB has taken the instance out of service so there are no active connections

The health check grace period allows a period of time for a new instance to warm up before performing a health check

More information on ASG health checks: By default uses EC2 status checks Can also use ELB health checks and custom health checks ELB health checks are in addition to the EC2 status checks If any health check returns an unhealthy status the instance will be terminated With ELB an instance is marked as unhealthy if ELB reports it as OutOfService A healthy instance enters the InService state If an instance is marked as unhealthy it will be scheduled for replacement If connection draining is enabled, Auto Scaling waits for in-flight requests to complete or timeout before terminating instances The health check grace period allows a period of time for a new instance to warm up before performing a health check (300 seconds by default)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 31: 

The application development team in your company have developed a Java application and saved the source code in a .war file. They would like to run the application on AWS resources and are looking for a service that can handle the provisioning and management of the underlying resources it will run on. What AWS service would allow the developers to upload the Java source code file and provide capacity provisioning and infrastructure management?

- A. AWS CodeDeploy
- B. AWS Elastic Beanstalk 
- C. AWS CloudFormation
- D. AWS OpsWorks

<details><summary>Answer:</summary><p>
B

Explanation:

AWS Elastic Beanstalk can be used to quickly deploy and manage applications in the AWS Cloud

Developers upload applications and Elastic Beanstalk handles the deployment details of capacity provisioning, load balancing, auto-scaling, and application health monitoring

Elastic Beanstalk supports applications developed in Go, Java, .NET, Node.js, PHP, Python, and Ruby, as well as different platform configurations for each language

To use Elastic Beanstalk, you create an application, upload an application version in the form of an application source bundle (for example, a Java .war file) to Elastic Beanstalk, and then provide some information about the application

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-elastic-beanstalk/

https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/Welcome.html

</p></details><hr>

### Question 32: 

You are running a database on an EC2 instance in your VPC. The load on the DB is increasing and you have noticed that the performance has been impacted. Which of the options below would help to increase storage performance? (choose 3)

- A. Use EBS optimized instances 
- B. Use a larger instance size within the instance family
- C. Create a RAID 0 array from multiple EBS volumes 
- D. Create a RAID 1 array from multiple EBS volumes
- E. Use Provisioned IOPS (I01) EBS volumes 
- F. Use HDD, Cold (SC1) EBS volumes

<details><summary>Answer:</summary><p>
ACE

Explanation:

EBS optimized instances provide dedicated capacity for Amazon EBS I/O

EBS optimized instances are designed for use with all EBS volume types

RAID can be used to increase IOPS

RAID 0 = 0 striping – data is written across multiple disks and increases performance but no redundancy

RAID 1 = 1 mirroring – creates 2 copies of the data but does not increase performance, only redundancy

SSD, Provisioned IOPS – I01 provides high performance with configurable IOPS

HDD, Cold – (SC1) provides the lowest cost storage and low performance

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 33: 

When using the MySQL database with AWS RDS, features such as Point-In-Time restore and snapshot restore require a recoverable storage engine. Which storage engine must be used to enable these features?

- A. MyISAM
- B. InnoDB 
- C. Federated
- D. Memory

<details><summary>Answer:</summary><p>
B

Explanation:

RDS fully supports the InnoDB storage engine for MySQL DB instances

RDS features such as Point-In-Time restore and snapshot restore require a recoverable storage engine and are supported for the InnoDB storage engine only

Automated backups and snapshots are not supported for MyISAM

https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 34: 

You have associated a new launch configuration to your Auto Scaling Group (ASG) which runs a fleet of EC2 instances. The new launch configuration changes monitoring from detailed to basic. There are a couple of CloudWatch alarms configured on the ASG which monitor every 60 seconds. There is a mismatch in frequency of metric reporting between these configuration settings, what will be the result?

- A. The EC2 metrics will be updated automatically to match the frequency of the alarms and send updates every 60 seconds
- B. The alarm state will be immediately set to INSUFFICIENT_DATA
- C. If you do not update your alarms to match the five-minute period, they continue to check for statistics every minute and might find no data available for as many as four out of every five periods 
- D. The ASG will automatically update the frequency of the alarms to 300 seconds to match the EC2 monitoring in the launch configuration 

<details><summary>Answer:</summary><p>
C

Explanation:

If you have an Auto Scaling group and need to change which type of monitoring is enabled for your Auto Scaling instances, you must create a new launch configuration and update the Auto Scaling group to use this launch configuration

After that, the instances that the Auto Scaling group launches will use the updated monitoring type

If you have CloudWatch alarms associated with your Auto Scaling group, use the put-metric-alarm command to update each alarm so that its period matches the monitoring type (300 seconds for basic monitoring and 60 seconds for detailed monitoring)

If you change from detailed monitoring to basic monitoring but do not update your alarms to match the five-minute period, they continue to check for statistics every minute and might find no data available for as many as four out of every five periods

https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html#as-group-metrics

</p></details><hr>

### Question 35: 

One of you clients has asked for assistance with a performance issue they are experiencing. The client has a fleet of EC2 instances behind an Elastic Load Balancer (ELB) that are a mixture of c4.2xlarge instance types and c5.large instances. The load on the CPUs on the c5.large instances has been very high, often hitting 100% utilization, whereas the c4.2xlarge instances have been performing well. The client has asked for advice on the most cost effective way to resolve the performance problems?

- A. Add more c5.large instances to spread the load more evenly
- B. Change the configuration to use only c4.2xlarge instance types 
- C. Add all of the instances into a Placement Group
- D. Enable the weighted routing policy on the ELB and configure a higher weighting for the c4.2xlarge instances 

<details><summary>Answer:</summary><p>
B

Explanation:

The 2xlarge instance type provides more CPUs. The best answer is to use this instance type for all instances

A placement group helps provide low-latency connectivity between instances and would not help here

The weighted routing policy is a Route 53 feature that would not assist in this situation

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 36: 

A web application you manage receives order processing information from customers and places the messages on an SQS queue. A fleet of EC2 instances are configured to pick up the messages, process them, and store the results in a DynamoDB table. The current configuration has been resulting in a large number of empty responses to ReceiveMessage requests. You would like to update the configuration to eliminate empty responses to reduce operational overhead. How can this be done?

- A. Configure Long Polling to eliminate empty responses by allowing Amazon SQS to wait until a message is available in a queue before sending a response 
- B. Configure Short Polling to eliminate empty responses by reducing the length of time a connection request remains open
- C. Use a FIFO (first-in-first-out) queue to preserve the exact order in which messages are sent and received
- D. Use a Standard queue to provide at-least-once delivery, which means that each message is delivered at least once

<details><summary>Answer:</summary><p>
A

Explanation:

Short Polling:

- Does not wait for messages to appear in the queue

- It queries only a subset of the available servers for messages (based on weighted random execution)

- Short polling is the default

- ReceiveMessageWaitTime is set to 0

- More requests are used, which implies higher cost

Long Polling:

- Uses fewer requests and reduces cost

- Eliminates false empty responses by querying all servers

- SQS waits until a message is available in the queue before sending a response

- Requests contain at least one of the available messages up to the maximum number of messages specified in the ReceiveMessage action

- Shouldn’t be used if your application expects an immediate response to receive message calls

- ReceiveMessageWaitTime is set to a non-zero value (up to 20 seconds)

- Same charge per million requests as short polling

Changing the queue type would not assist in this situation

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html

</p></details><hr>

### Question 37: 

Which block device can be specified in a block device mapping to be used with an EC2 instance? (choose 2)

- A. Snapshot
- B. Instance store volume 
- C. EBS volume 
- D. EFS volume

<details><summary>Answer:</summary><p>
BC

Explanation:

Each instance that you launch has an associated root device volume, either an Amazon EBS volume or an instance store volume

You can use block device mapping to specify additional EBS volumes or instance store volumes to attach to an instance when it's launched

You can also attach additional EBS volumes to a running instance

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 38: 

You have just created a new AWS account and selected the Asia Pacific (Sydney) region. Within the default VPC there is a default security group. What default settings are configured within this security group? (choose 2)

- A. There is an inbound rule that allows all traffic from the security group itself 
- B. There is an inbound rule that allows all traffic from any address 
- C. There is an outbound rule that allows all traffic to all addresses 
- D. There is an outbound rule that allows all traffic to the security group itself

<details><summary>Answer:</summary><p>
AC

Explanation:

Custom security groups do not have inbound allow rules (all inbound traffic is denied by default)

Default security groups do have inbound allow rules (allowing traffic from within the group)

All outbound traffic is allowed by default in custom and default security groups

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 39: 

An EC2 instance you manage is generating very high packets-per-second and performance of the application stack is being impacted. You have been asked for a resolution to the issue that results in improved performance from the EC2 instance. What would you suggest?

- A. Configure a RAID 1 array from multiple EBS volumes
- B. Create a placement group and put the EC2 instance in it
- C. Use enhanced networking 
- D. Add multiple Elastic IP addresses to the instance

<details><summary>Answer:</summary><p>
C

Explanation:

Enhanced networking: Enhanced networking provides higher bandwidth, higher packet-per-second (PPS) performance, and consistently lower inter-instance latencies If your packets-per-second rate appears to have reached its ceiling, you should consider moving to enhanced networking because you have likely reached the upper thresholds of the VIF driver AWS currently supports enhanced networking capabilities using SR-IOV SR-IOV provides direct access to network adapters, provides higher performance (packets-per-second) and lower latency Must launch an HVM AMI with the appropriate drivers Only available for certain instance types Only supported in VPC

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://aws.amazon.com/premiumsupport/knowledge-center/enable-configure-enhanced-networking/

</p></details><hr>

### Question 40: 

Which of the statements below is correct about the Amazon S3 Standard storage class? (choose 2)

- A. Provides 99.99% durability of S3 objects
- B. Provides 99.999999999% availability of S3 objects
- C. Provides 99.99% availability of S3 objects 
- D. Provides 99.999999999% durability of S3 objects 

<details><summary>Answer:</summary><p>
CD

Explanation:

Low latency and high throughput performance

Designed for durability of 99.999999999% of objects across multiple Availability Zones

Data is resilient in the event of one entire Availability Zone destruction

Designed for 99.99% availability over a given year

Backed with the Amazon S3 Service Level Agreement for availability

Supports SSL for data in transit and encryption of data at rest

Lifecycle management for automatic migration of objects

https://aws.amazon.com/s3/storage-classes/

</p></details><hr>

### Question 41: 

You work as an Enterprise Architect for a global organization which employs 20,000 people. The company is growing at around 5% per annum. The company strategy is to increasingly adopt AWS cloud services. There is an existing Microsoft Active Directory (AD) service that is used as the on-premise identity and access management system. You want to enable users to authenticate using their existing identities and access AWS resources (including the AWS Management Console) using single sign-on (SSO). How can you continue to utilize the on-premise AD for all authentication when consuming AWS cloud services?

- A. Install a Microsoft Active Directory Domain Controller on AWS and add it into your existing on-premise domain
- B. Launch an Enterprise Edition AWS Active Directory Service for Microsoft Active Directory and setup trust relationships with your on-premise domain 
- C. Use a large AWS Simple AD in AWS
- D. Launch a large AWS Directory Service AD Connector to proxy all authentication back to your on-premise AD service for authentication

<details><summary>Answer:</summary><p>
B

Explanation:

AWS Active Directory Service for Microsoft Active Directory: Fully managed AWS service on AWS infrastructure Best choice if you have more than 5000 users and/or need a trust relationship set up You can setup trust relationships to extend authentication from on-premises Active Directories into the AWS cloud On-premise users and groups can access resources in either domain using SSO Enterprise Edition for large organizations up to 50,000 objects

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-directory-service/

</p></details><hr>

### Question 42: 

One of your EC2 instances that is behind an Elastic Load Balancer (ELB) is in the process of being de-registered. Which ELB feature can be used to allow existing connections to close cleanly?

- A. Sticky Sessions
- B. Deletion Protection
- C. Connection Draining 
- D. Proxy Protocol

<details><summary>Answer:</summary><p>
C

Explanation:

Connection draining is enabled by default and provides a period of time for existing connections to close cleanly

When connection draining is in action an CLB will be in the status “InService: Instance deregistration currently in progress”

Session stickiness uses cookies and ensures a client is bound to an individual back-end instance for the duration of the cookie lifetime

Deletion protection is used to protect the ELB from deletion

The Proxy Protocol header helps you identify the IP address of a client when you have a load balancer that uses TCP for back-end connections

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 43: 

As a Solutions Architect at Digital Cloud Guru you are helping a client to design a multi-tier web application architecture. The client has requested that the architecture provide low-latency connectivity between all servers and be resilient across multiple locations. The client uses Microsoft SQL Server for existing databases. The client does not want to manage the underlying operating system of the database. How would you recommend the database tier is deployed?

- A. Amazon EC2 instances with Microsoft SQL Server and data replication within an AZ
- B. Amazon EC2 instances with Microsoft SQL Server and data replication between two different AZs
- C. Amazon RDS with Microsoft SQL Server 
- D. Amazon RDS with Microsoft SQL Server in a Multi-AZ configuration 

<details><summary>Answer:</summary><p>
D

Explanation:

Availability Zones are distinct locations that are engineered to be isolated from failures in other Availability Zones

Availability Zones are connected with low latency, high throughput, and highly redundant networking

With EC2 you have full control at the operating system layer

RDS is a fully managed service and you do not have access to the underlying EC2 instance (no root access)

Multi-AZ RDS creates a replica in another AZ and synchronously replicates to it (DR only)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 44: 

You have been instructed by your manager to perform an audit of resources that are not being used and that are incurring costs to the company. Which of the following will incur a cost? (choose 2)

- A. A terminated EC2 instance
- B. A stopped EC2 instance
- C. An Amazon VPC
- D. An Elastic IP that is being used
- E. EBS volumes 
- F. Snapshots 
- G. A launch configuration

<details><summary>Answer:</summary><p>
EF

Explanation:

A terminated EC2 instance does not incur a cost

A stopped EC2 instance does not incur a cost, however you pay for any EBS storage consumed

There is no charge for VPC

You pay for Elastic IPs only when they are NOT being used

You pay for the storage consumed by EBS volumes and snapshots

There is no charge for Auto Scaling launch configurations

https://aws.amazon.com/pricing/services/

</p></details><hr>

### Question 45: 

You are a Solutions Architect at Digital Cloud Guru. A large multi-national client has requested a design for a multi-region database. The master database will be in the EU (Frankfurt) region and databases will be located in 4 other regions to service local read traffic. The database should be a fully managed service including the replication. Which AWS service can deliver these requirements?

- A. RDS with Multi-AZ
- B. RDS with cross-region Read Replicas 
- C. DynamoDB with Global Tables and Cross Region Replication
- D. EC2 instances with EBS replication

<details><summary>Answer:</summary><p>
B

Explanation:

Read replicas are used for read heavy DBs and replication is asynchronous

Read replicas are for workload sharing and offloading

Read replicas can be in another region (uses asynchronous replication)

RDS with Multi-AZ is within a region only

DynamoDB with Global Tables and Cross Region Replication is a multi-master database configuration

EC2 instances with EBS replication is not a suitable solution

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 46: 

One of your clients has multiple VPCs that are peered with each other. The client would like to use a single Elastic Load Balancer (ELB) to route traffic to multiple EC2 instances in peered VPCs within the same region. Is this possible?

- A. No, the instances that an ELB routes traffic to must be in the same VPC
- B. This is possible using the Classic Load Balancer (CLB) if using Instance IDs
- C. This is not possible with ELB, you would need to use Route 53
- D. This is possible using the Network Load Balancer (NLB) and Application Load Balancer (ALB) if using IP addresses as targets 

<details><summary>Answer:</summary><p>
D

Explanation:

With ALB and NLB IP addresses can be used to register: Instances in a peered VPC AWS resources that are addressable by IP address and port On-premises resources linked to AWS through Direct Connect or a VPN connection

https://aws.amazon.com/blogs/aws/new-application-load-balancing-via-ip-address-to-aws-on-premises-resources/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 47: 

Your manager has asked you to explain some of the security features available in the AWS cloud. How can you describe the function of Amazon CloudHSM?

- A. It is a Public Key Infrastructure (PKI)
- B. It provides server-side encryption for S3 objects
- C. It can be used to generate, use and manage encryption keys in the cloud 
- D. It is a firewall for use with web applications

<details><summary>Answer:</summary><p>
C

Explanation:

AWS CloudHSM is a cloud-based hardware security module (HSM) that allows you to easily add secure key storage and high-performance crypto operations to your AWS applications

CloudHSM has no upfront costs and provides the ability to start and stop HSMs on-demand, allowing you to provision capacity when and where it is needed quickly and cost-effectively

CloudHSM is a managed service that automates time-consuming administrative tasks, such as hardware provisioning, software patching, high availability, and backups

https://aws.amazon.com/cloudhsm/details/

</p></details><hr>

### Question 48: 

What is the recommended way to upload a single 2GB file to an S3 bucket?

- A. Use Amazon Snowball
- B. Use a single PUT request to upload the large file
- C. Use Multipart Upload 
- D. Use AWS Import/Export

<details><summary>Answer:</summary><p>
C

Explanation:

In general, when your object size reaches 100 MB, you should consider using multipart uploads instead of uploading the object in a single operation

The largest object that can be uploaded in a single PUT is 5 gigabytes

https://docs.aws.amazon.com/AmazonS3/latest/dev/uploadobjusingmpu.html

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 49: 

One of the departments in your company has been generating a large amount of data on S3 and you are considering the increasing costs of hosting it. You have discussed the matter with the department head and he explained that data older than 90 days is rarely accessed but must be retained for several years. If this data does need to be accessed at least 24 hours notice will be provided. How can you optimize the costs associated with storage of this data whilst ensuring it is accessible if required?

- A. Select the older data and manually migrate it to GLACIER
- B. Use S3 lifecycle policies to move data to GLACIER after 90 days 
- C. Use S3 lifecycle policies to move data to the STANDARD_IA storage class
- D. Implement archival software that automatically moves the data to tape

<details><summary>Answer:</summary><p>
B

Explanation:

To manage your objects so that they are stored cost effectively throughout their lifecycle, configure their lifecycle

A lifecycle configuration is a set of rules that define actions that Amazon S3 applies to a group of objects

Transition actions define when objects transition to another storage class

For example, you might choose to transition objects to the STANDARD_IA storage class 30 days after you created them, or archive objects to the GLACIER storage class one year after creating them

STANDARD_IA is good for infrequently accessed data and provides faster access times than GLACIER but is more expensive so not the best option here

GLACIER retrieval times: Standard retrieval is 3-5 hours which is well within the requirements here You can use Expedited retrievals to access data in 1 – 5 minutes You can use Bulk retrievals to access up to petabytes of data in approximately 5 – 12 hours

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html

https://aws.amazon.com/about-aws/whats-new/2016/11/access-your-amazon-glacier-data-in-minutes-with-new-retrieval-options/

</p></details><hr>

### Question 50: 

When using Amazon Kinesis, where can a consumer store their results? (choose 3)

- A. SQS
- B. S3 
- C. DynamoDB 
- D. RedShift 

<details><summary>Answer:</summary><p>
BCD

Explanation:

Producers continually push data to Kinesis Data Streams

Consumers process the data in real time

Consumers can store their results using an AWS service such as Amazon DynamoDB, Amazon Redshift, or Amazon S3

Kinesis Streams applications are consumers that run on EC2 instances

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

### Question 51: 

You are considering using CloudFront for distributing dynamically generated content. What targets can you point a distribution at? (choose 3)

- A. EC2 instance 
- B. ElastiCache Cluster
- C. Elastic Load Balancer 
- D. S3 bucket 
- E. EBS volume

<details><summary>Answer:</summary><p>
ACD

Explanation:

You can create a CloudFront distribution using a custom origin

Each distribution can point to an S3 or to a custom origin

A custom origin could be another storage service, an EC2 instance or even an Elastic Load Balancer

When using an on-premise or non-AWS based web server you must specify the DNS name, ports and protocols that you want CloudFront to use when fetching objects from your origin

Most CloudFront features are supported for custom origins except RTMP distributions (must be an S3 bucket)

When using EC2 for custom origins Amazon recommend: Use an AMI that automatically installs the software for a web server Use ELB to handle traffic across multiple EC2 instances Specify the URL of your load balancer as the domain name of the origin server

https://aws.amazon.com/blogs/aws/amazon-cloudfront-support-for-custom-origins/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-cloudfront/

</p></details><hr>

### Question 52: 

Which of the following statements is correct about the benefits of AWS Direct Connect? (choose 4)

- A. Reduce cost when using large volumes of traffic 
- B. Increase reliability (predictable performance) 
- C. Lower cost than VPN
- D. Increase bandwidth (predictable bandwidth) 
- E. Uses redundant paths across the Internet
- F. Decrease latency 

<details><summary>Answer:</summary><p>
ABDF

Explanation:

AWS Direct Connect is a network service that provides an alternative to using the Internet to connect customers’ on premise sites to AWS

Data is transmitted through a private network connection between AWS and a customer’s datacenter or corporate network

Benefits: Reduce cost when using large volumes of traffic Increase reliability (predictable performance) Increase bandwidth (predictable bandwidth) Decrease latency

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/aws-direct-connect/

</p></details><hr>

### Question 53: 

Which of the following statements is correct about restoring an RDS database to a specific point-in-time? (choose 2)

- A. The database restore overwrites the existing database
- B. The default DB security group is applied to the new DB instance 
- C. Custom DB security groups are applied to the new DB instance
- D. You can restore up to the last 5 minutes 

<details><summary>Answer:</summary><p>
BD

Explanation:

Restored DBs will always be a new RDS instance with a new DNS endpoint

Can restore up to the last 5 minutes

You cannot restore from a DB snapshot to an existing DB – a new instance is created when you restore

Only default DB parameters and security groups are restored – you must manually associate all other DB parameters and SGs

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIT.html

</p></details><hr>

### Question 54: 

You have created an Auto Scaling Group (ASG) that has launched several EC2 instances running Linux. The ASG was created using the CLI. You want to ensure that you do not pay for monitoring. What needs to be done to ensure that monitoring is free of charge?

- A. The launch configuration will have been created with basic monitoring enabled which is free of charge so you do not need to do anything
- B. The launch configuration will have been created with detailed monitoring enabled which is chargeable. You will need to change the settings on the launch configuration
- C. The launch configuration will have been created with detailed monitoring enabled which is chargeable. You will need to recreate the launch configuration with basic monitoring enabled 
- D. The launch configuration will have been created with detailed monitoring enabled which is chargeable. You will need to modify the settings on the ASG

<details><summary>Answer:</summary><p>
C

Explanation:

Basic monitoring sends EC2 metrics to CloudWatch about ASG instances every 5 minutes

Detailed can be enabled and sends metrics every 1 minute (chargeable)

When the launch configuration is created from the CLI detailed monitoring of EC2 instances is enabled by default

You cannot edit a launch configuration once defined

If you want to change your launch configuration you have to create a new one, make the required changes, and use that with your auto scaling groups

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 55: 

Which AWS services can be used to automate the release process of your serverless Lambda applications? (choose 2)

- A. AWS CodePipeline 
- B. AWS Cognito
- C. AWS CodeDeploy 
- D. AWS OpsWorks

<details><summary>Answer:</summary><p>
AC

Explanation:

You can automate your serverless application’s release process using AWS CodePipeline and AWS CodeDeploy

The following AWS services can be used to fully automate the deployment process: You use CodePipeline to model, visualize, and automate the steps required to release your serverless application You use AWS CodeDeploy to gradually deploy updates to your serverless applications You use CodeBuild to build, locally test, and package your serverless application You use AWS CloudFormation to deploy your application

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

https://docs.aws.amazon.com/lambda/latest/dg/build-pipeline.html

</p></details><hr>

### Question 56: 

One of the applications you manage receives a high traffic loads between 7:30am and 9:30am daily. The application uses an Auto Scaling Group (ASG) to maintain 3 EC2 instances most of the time but during the peak period requires 6 EC2 instances. How can configure ASG to perform a regular scale-out event at 7:30am and a scale-in event at 9:30am daily to account for the peak load?

- A. Use a Simple scaling policy
- B. Use a Scheduled scaling policy 
- C. Use a Dynamic scaling policy
- D. Use a Step scaling policy

<details><summary>Answer:</summary><p>
B

Explanation:

Simple – maintains a current number of instances, you can manually change the ASGs min/desired/max and attach/detach instances

Scheduled – Used for predictable load changes, can be a single event or a recurring schedule

Dynamic (event based) – scale in response to an event/alarm

Step – configure multiple scaling steps in response to multiple alarms

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 57: 

One of your clients has requested advice on the correct choice of Elastic Load Balancer (ELB) for an application they are planning to deploy on AWS. The application requires extremely high throughput and extremely low latencies. The connections will be made using the TCP protocol and the ELB must support load balancing to multiple ports on an instance. Which ELB would you suggest the client uses?

- A. Classic Load Balancer
- B. Application Load Balancer
- C. Network Load Balancer 
- D. Route 53

<details><summary>Answer:</summary><p>
C

Explanation:

Network Load Balancer: Operates at the connection level (Layer 4), routing connections to targets – Amazon EC2 instances, containers and IP addresses based on IP protocol data It is architected to handle millions of requests/sec, sudden volatile traffic patterns and provides extremely low latencies High throughput – designed to handle traffic as it grows and can load balance millions of requests/second Extremely low latencies for latency-sensitive applications Supports load balancing to multiple ports on an instance

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 58: 

Your company runs a web-based application that uses EC2 instances for the web front-end and RDS for the database back-end. The web application writes transaction log files to an S3 bucket and the quantity of files is becoming quite large. You have determined that it is acceptable to retain the most recent 60 days of log files and permanently delete the rest. What can you do to enable this to happen automatically?

- A. Write a Ruby script that checks the age of objects and deletes any that are more than 60 days old
- B. Use an S3 lifecycle policy to move the log files that are more than 60 days old to the GLACIER storage class
- C. Use an S3 lifecycle policy with object expiration configured to automatically remove objects that are more than 60 days old 
- D. Use an S3 bucket policy that deletes objects that are more than 60 days old

<details><summary>Answer:</summary><p>
C

Explanation:

Moving logs to Glacier may save cost but the questions requests that the files are permanently deleted

Object Expiration allows you to schedule removal of your objects after a defined time period

Using Object Expiration rules to schedule periodic removal of objects eliminates the need to build processes to identify objects for deletion and submit delete requests to Amazon S3

https://aws.amazon.com/about-aws/whats-new/2011/12/27/amazon-s3-announces-object-expiration/

https://aws.amazon.com/about-aws/whats-new/2011/12/27/amazon-s3-announces-object-expiration/

</p></details><hr>

### Question 59: 

You are putting together the architecture for a new VPC on AWS. Your on-premise data center will be connected to the VPC by a hardware VPN and has public and VPN-only subnets. The security team have requested that all traffic that hits the public subnets on AWS must be directed over the VPN to the corporate firewall. How can this be achieved?

- A. Configure another VPN connection from the public subnet directly to the customer gateway
- B. Configure a NAT Gateway and configure all traffic to be directed via the virtual private gateway
- C. In the public subnet route table, add a route for your remote network and specify the virtual private gateway as the target 
- D. In the VPN-only subnet route table, add a route that directs all Internet traffic to the virtual private gateway 

<details><summary>Answer:</summary><p>
C

Explanation:

Route tables determine where network traffic is directed

In your route table, you must add a route for your remote network and specify the virtual private gateway as the target

This enables traffic from your VPC that's destined for your remote network to route via the virtual private gateway and over one of the VPN tunnels

You can enable route propagation for your route table to automatically propagate your network routes to the table for you

https://docs.aws.amazon.com/vpc/latest/userguide/VPC_VPN.html

</p></details><hr>

### Question 60: 

You are designing the disk configuration for an EC2 instance. The instance needs to support a MapReduce process that requires high throughput for a large dataset with large I/O sizes. You need to provision the most cost-effective storage solution option. What EBS volume type will you select?

- A. EBS General Purpose SSD
- B. EBS Provisioned IOPS SSD
- C. EBS Throughput Optimized HDD 
- D. EBS General Purpose SSD in a RAID 1 configuration

<details><summary>Answer:</summary><p>
C

Explanation:

EBS Throughput Optimized HDD: Frequently accessed, throughput intensive workloads with large datasets and large I/O sizes, such as MapReduce, Kafka, log processing, data warehouse, and ETL workloads Throughput measured in MB/s, and includes the ability to burst up to 250 MB/s per TB, with a baseline throughput of 40 MB/s per TB and a maximum throughput of 500 MB/s per volume

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 61: 

In Amazon CloudWatch how long are data points with a period of 3600 seconds (1 hour) available for?

- A. 63 days
- B. 455 days 
- C. 14 days
- D. 15 days

<details><summary>Answer:</summary><p>
B

Explanation:

CloudWatch retains metric data as follows:

Data points with a period of less than 60 seconds are available for 3 hours. These data points are high-resolution custom metrics.

Data points with a period of 60 seconds (1 minute) are available for 15 days

Data points with a period of 300 seconds (5 minute) are available for 63 days

Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/amazon-cloudwatch/

</p></details><hr>

### Question 62: 

In your VPC you have several EC2 instances that have been running for some time. You have logged into an instance and need to determine a few pieces of information including what IAM role is assigned, the instance ID and the names of the security groups that are assigned to the instance. From the options below, what would be a source of this information?

- A. Tags
- B. Parameters
- C. User data
- D. Metadata 

<details><summary>Answer:</summary><p>
D

Explanation:

Instance metadata is data about your instance that you can use to configure or manage the running instance

Instance metadata is available at http://169.254.169.254/latest/meta-data

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html#instancedata-data-categories

</p></details><hr>

### Question 63: 

You need to run a production process that will use several EC2 instances and run constantly on an ongoing basis. The process cannot be interrupted or restarted without issue. What EC2 pricing model would be best for this workload?

- A. Reserved instances 
- B. Spot instances
- C. On-demand instances
- D. Flexible instances

<details><summary>Answer:</summary><p>
A

Explanation:

RIs provide you with a significant discount (up to 75%) compared to On-Demand instance pricing

You have the flexibility to change families, OS types, and tenancies while benefitting from RI pricing when you use Convertible RIs

In this scenario for a stable process that will run constantly on an ongoing basis RIs will be the most affordable solution

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://aws.amazon.com/ec2/pricing/reserved-instances/

</p></details><hr>

### Question 64: 

Which statements about ECS are correct? (choose 3)

- A. It is possible to associate a service on Amazon ECS to an Application Load Balancer (ALB) for the Elastic Load Balancing (ELB) service 
- B. You can only use Amazon approved AMIs
- C. The Fargate Launch Type is a serverless infrastructure managed by AWS 
- D. Images are built from a Dockerfile 
- E. A task definition is a text file in YAML format that describes one or more containers

<details><summary>Answer:</summary><p>
ACD

Explanation:

Amazon Elastic Container Service (ECS) is a highly scalable, high performance container management service that supports Docker containers and allows you to easily run applications on a managed cluster of Amazon EC2 instances

You can use any AMI that meets the Amazon ECS AMI specification

A task definition is a text file in JSON format that describes one or more containers, up to a maximum of 10

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 65: 

You have launched an EC2 instance into a VPC. You need to ensure that instances have both a private and public DNS hostname. Assuming you did not change any settings during creation of the VPC, how will DNS hostnames be assigned by default? (choose 2)

- A. In a default VPC instances will be assigned a public and private DNS hostname 
- B. In a non-default VPC instances will be assigned a public and private DNS hostname
- C. In a default VPC instances will be assigned a private but not a public DNS hostname
- D. In a non-default VPC instances will be assigned a private but not a public DNS hostname 

<details><summary>Answer:</summary><p>
AD

Explanation:

When you launch an instance into a default VPC, we provide the instance with public and private DNS hostnames that correspond to the public IPv4 and private IPv4 addresses for the instance

When you launch an instance into a nondefault VPC, we provide the instance with a private DNS hostname and we might provide a public DNS hostname, depending on the DNS attributes you specify for the VPC and if your instance has a public IPv4 address

https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html

</p></details><hr>

