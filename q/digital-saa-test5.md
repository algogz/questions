### Question 1: *

According to AWS best practices you setup multi-factor authentication (MFA) for your root account and configured it to work with Google Authenticator on your smart phone. Unfortunately, your smart phone has been lost. What are the options available to access your account?

- A. You will need to contact AWS support to request that the MFA device is deactivated and have your password reset
- B. Unfortunately, you will no longer be able to access this account as the root user
- C. On the AWS sign-in with authentication device web page, choose to sign in using alternative factors of authentication and use the verification email and code to sign in 
- D. Get a user with administrative privileges in your AWS account to deactivate the MFA device assigned to the root account

<details><summary>Answer:</summary><p>
C

Explanation:

Multi-factor authentication (MFA) can be enabled/enforced for the AWS account and for individual users under the account

MFA uses an authentication device that continually generates random, six-digit, single-use authentication codes

If your AWS account root user multi-factor authentication (MFA) device is lost, damaged, or not working, you can sign in using alternative methods of authentication

This means that if you can't sign in with your MFA device, you can sign in by verifying your identity using the email and phone that are registered with your account

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa_lost-or-broken.html

</p></details><hr>

### Question 2: 

AWS Regions provide multiple, physically separated and isolated _____________ which are connected with low latency, high throughput, and highly redundant networking. Select the missing term from the options below.

- A. Subnets
- B. Availability zones 
- C. Facilities
- D. Edge locations

<details><summary>Answer:</summary><p>
B

Explanation:

Availability Zones are distinct locations that are engineered to be isolated from failures in other Availability Zones

Availability Zones are connected with low latency, high throughput, and highly redundant networking

Subnets are created within availability zones (AZs)

Each subnet must reside entirely within one Availability Zone and cannot span zones

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html

</p></details><hr>

### Question 3: *

In EC2, which of the statements below about Instance store-backed and EBS-backed instances is true?

- A. EBS-backed instances cannot be restarted
- B. Instance-store backed instances can only be terminated
- C. Instance-store backed instances can be stopped and restarted
- D. EBS-backed instances can be stopped and restarted 

<details><summary>Answer:</summary><p>
D

Explanation:

EBS-backed means the root volume is an EBS volume and storage is persistent

Instance store-backed means the root volume is an instance store volume and storage is not persistent

On an EBS-backed instance, the default action is for the root EBS volume to be deleted upon termination

Instance store volumes are sometimes called Ephemeral storage (non-persistent)

Instance store volumes cannot be stopped. If the underlying host fails the data will be lost

Instance store volume root devices are created from AMI templates stored on S3

EBS backed instances can be stopped. You will not lose the data on this instance if it is stopped (persistent)

EBS volumes can be detached and reattached to other EC2 instance

EBS volume root devices are launched from AMI’s that are backed by EBS snapshots

Instance store volumes cannot be detached/reattached

When rebooting the instances for both types data will not be lost

By default both root volumes will be deleted on termination unless you configured otherwise

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 4: *

The financial institution you are working for stores large amounts of historical transaction records. There are over 25TB of records and your manager has decided to move them into the AWS Cloud. You are planning to use Snowball as copying the data would take too long. Which of the statements below are true regarding Snowball? (choose 3)

- A. Petabyte scale data transport solution for transferring data into or out of AWS 
- B. Snowball can import to S3 but cannot export from S3
- C. Snowball must be ordered from and returned to the same region 
- D. Uses a secure storage device for physical transportation 
- E. Can be used with multipart upload

<details><summary>Answer:</summary><p>
ACD

Explanation:

Petabyte scale data transport solution for transferring data into or out of AWS

Uses a secure storage device for physical transportation

AWS Snowball Client is software that is installed on a local computer and is used to identify, compress, encrypt, and transfer data

Uses 256-bit encryption (managed with the AWS KMS) and tamper-resistant enclosures with TPM

Snowball can import to S3 or export from S3

Import/export is when you send your own disks into AWS – this is being deprecated in favour of Snowball

Snowball must be ordered from and returned to the same region

To speed up data transfer it is recommended to run simultaneous instances of the AWS Snowball Client in multiple terminals and transfer small files as batches

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/migration/aws-snowball/

</p></details><hr>

### Question 5: Incorrect*

Which of the following are AWS best practices for DynamoDB? (choose 3)

- A. Store more frequently and less frequently accessed data in separate tables 
- B. Use separate local secondary indexes for each item 
- C. Keep item sizes small 
- D. Use for BLOB data use cases
- E. Store objects larger than 400KB in S3 and use pointers in DynamoDB 

<details><summary>Answer:</summary><p>
ACE

Explanation:

Best practices include: Keep item sizes small If you are storing serial data in DynamoDB that will require actions based on data/time use separate tables for days, weeks, months Store more frequently and less frequently accessed data in separate tables If possible compress larger attribute values Store objects larger than 400KB in S3 and use pointers (S3 Object ID) in DynamoDB

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 6: Incorrect*

You work for a large multinational retail company. The company has a large presence in AWS in multiple regions. You have established a new office and need to implement a high-bandwidth, low-latency connection to multiple VPCs in multiple regions within the same account. The VPCs each have unique CIDR ranges. What would be the optimum solution design? (choose 2)

- A. Implement Direct Connect connections to each AWS region
- B. Create a Direct Connect gateway, and create private VIFs to each region 
- C. Configure AWS VPN CloudHub 
- D. Implement a Direct Connect connection to the closest AWS region 

<details><summary>Answer:</summary><p>
BD

Explanation:

Direct Connect gateway: Grouping of Virtual Private Gateways (VGWs) and Private Virtual Interfaces (VIFs) that belong to the same AWS account Direct Connect Gateway enables you to interface with VPCs in any AWS Region (except AWS China Region) Can share private virtual interface to interface with more than one Virtual Private Clouds (VPCs) reducing the number of BGP sessions

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/aws-direct-connect/

</p></details><hr>

### Question 7: 

Which AWS services can be used to deploy a stateless web application that can automatically and elastically scale?

- A. S3, CloudFront and RDS
- B. EC2, EBS and Auto Scaling
- C. EC2, DynamoDB and Elastic Load Balancing
- D. EC2, Auto Scaling and Elastic Load Balancing 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon Elastic Compute Cloud (Amazon EC2) is a web service that provides resizable compute capacity in the cloud. It is designed to make web-scale computing easier for developers

Amazon EC2 Auto Scaling helps you ensure that you have the correct number of Amazon EC2 instances available to handle the load for your application

Elastic Load Balancing automatically distributes incoming application traffic across multiple targets, such as Amazon EC2 instances, containers, and IP addresses

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 8: Incorrect

You would like to provide some elasticity for your RDS DB. You are considering read replicas and are evaluating the features. Which of the following statements are applicable when using RDS read replicas? (choose 3)

- A. In a multi-AZ failover the read replicas are switched to the new primary 
- B. You cannot specify the AZ the read replica is deployed in
- C. During failover RDS automatically updates configuration (including DNS endpoint) to use the second node 
- D. You cannot have more than four instances involved in a replication chain 
- E. It is possible to have read-replicas of read-replicas 

<details><summary>Answer:</summary><p>
ADE

Explanation:

Multi-AZ utilizes failover and DNS endpoint updates, not read replicas

Read replicas are used for read heavy DBs and replication is asynchronous

You can have read replicas of read replicas for MySQL and MariaDB but not for PostgreSQL

You cannot have more than four instances involved in a replication chain

You can specify the AZ the read replica is deployed in

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 9: 

Which of the following statements are true regarding Amazon Elastic Block Store (EBS) encryption? (choose 2)

- A. Encryption is supported on all Amazon EBS volume types 
- B. Data in transit between an instance and an encrypted volume is also encrypted 
- C. You cannot mix encrypted with unencrypted volumes on an instance
- D. Volumes created from encrypted snapshots are unencrypted

<details><summary>Answer:</summary><p>
AB

Explanation:

All EBS types support encryption

All instance families now support encryption

Not all instance types support encryption

Snapshots of encrypted volumes are encrypted automatically

EBS volumes restored from encrypted snapshots are encrypted automatically

EBS volumes created from encrypted snapshots are also encrypted

You can share snapshots, but only if they are unencrypted

Data in transit between an instance and an encrypted volume is also encrypted

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 10: Incorrect*

You are a Solutions Architect at Digital Cloud Guru. In your VPC you have a mixture of EC2 instances in production and non-production environments. You need to devise a way to segregate access permissions to different sets of users for instances in different environments. How can this be achieved? (choose 3)

- A. Create an IAM policy that grants access to any instances with the specific tag 
- B. Create an IAM policy with a conditional statement that matches the environment variables 
- C. Add an environment variable to the instances using user data
- D. Add a specific tag to the instances you want to grant the users or groups access to 
- E. Attach the IAM policy to the users or groups you want to access the instances 

<details><summary>Answer:</summary><p>
ADE

Explanation:

You can control access to smaller deployments of EC2 instances (5-10 instances at a time) by doing the following:

https://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/

</p></details><hr>

### Question 11: 

You are developing a multi-tier application that includes loosely-coupled, distributed application components and need to determine a method of sending notifications instantaneously. Using SNS which transport protocols are supported? (choose 3)

- A. SWF
- B. FTP
- C. SMS 
- D. Lambda
- E. Email-JSON 
- F. HTTPS 

<details><summary>Answer:</summary><p>
CEF

Explanation:

SNS supports notifications over multiple transport protocols: HTTP/HTTPS – subscribers specify a URL as part of the subscription registration Email/Email-JSON – messages are sent to registered addresses as email (text-based or JSON-object) SQS – users can specify an SQS standard queue as the endpoint SMS – messages are sent to registered phone numbers as SMS text messages

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sns/

</p></details><hr>

### Question 12: 

The application development team in your company have created a new application written in .NET. You are looking for a way to easily deploy the application whilst maintaining full control of the underlying resources. Which PaaS service provided by AWS would suit this requirement?

- A. CloudFormation
- B. EC2 Placement Groups
- C. CloudFront
- D. Elastic Beanstalk 

<details><summary>Answer:</summary><p>
D

Explanation:

AWS Elastic Beanstalk can be used to quickly deploy and manage applications in the AWS Cloud

Developers upload applications and Elastic Beanstalk handles the deployment details of capacity provisioning, load balancing, auto-scaling, and application health monitoring

Considered a Platform as a Service (PaaS) solution

Allows full control of the underlying resources

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-elastic-beanstalk/

</p></details><hr>

### Question 13: *

Using Route 53 Alias records what targets can you specify? (choose 3)

- A. Elastic BeanStalk environment 
- B. CloudFront distribution 
- C. S3 bucket configured as a website 
- D. On-premise web server
- E. ElastiCache cluster

<details><summary>Answer:</summary><p>
ABC

Explanation:

Alias records are used to map resource record sets in your hosted zone to Amazon Elastic Load Balancing load balancers, Amazon CloudFront distributions, AWS Elastic Beanstalk environments, or Amazon S3 buckets that are configured as websites

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 14: 

You have just initiated the creation of a snapshot of an EBS volume and the snapshot process is currently in operation. Which of the statements below is true regarding the operations that are possible while the snapshot process in running?

- A. The volume can be used in write-only mode while the snapshot is in progress
- B. The volume cannot be used until the snapshot completes
- C. The volume can be used as normal while the snapshot is in progress 
- D. The volume can be used in read-only mode while the snapshot is in progress

<details><summary>Answer:</summary><p>
C

Explanation:

Snapshots can be taken of non-root EBS volumes while running

To take consistent snapshots writes must be stopped (paused) until the snapshot is complete – if not possible the volume needs to be detached, or if it’s an EBS root volume the instance must be stopped

To create a snapshot for an Amazon EBS volume that serves as a root device, you should stop the instance before taking the snapshot

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-snapshot.html

</p></details><hr>

### Question 15: 

What are two advantages of using ElastiCache? (choose 2)

- A. Multi-region HA
- B. Decoupling application components
- C. Caching query results for improved performance 
- D. Can be used for storing session state data 

<details><summary>Answer:</summary><p>
CD

Explanation:

The in-memory caching provided by ElastiCache can be used to significantly improve latency and throughput for many read-heavy application workloads or compute-intensive workloads

Elasticache can be used for storing session state

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-elasticache/

</p></details><hr>

### Question 16: 

To ensure security of your AWS account, what are two AWS best practices for managing access keys? (choose 2)

- A. Rotate access keys daily
- B. Where possible, use IAM roles with temporary security credentials 
- C. Don’t generate an access key for the root account user 
- D. Don’t create any access keys, use IAM roles instead

<details><summary>Answer:</summary><p>
BC

Explanation:

Best practices include: Don’t generate an access key for the root account user Use Temporary Security Credentials (IAM Roles) Instead of Long-Term Access Keys Manage IAM User Access Keys Properly

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html

</p></details><hr>

### Question 17: 

Which AWS service makes it easy to collect, process, and analyze real-time, streaming data?

- A. RedShift
- B. EMR
- C. S3
- D. Kinesis Data Streams 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon Kinesis makes it easy to collect, process, and analyze real-time, streaming data so you can get timely insights and react quickly to new information

Kinesis Data Streams enables you to build custom applications that process or analyze streaming data for specialized needs

Kinesis Data Streams enables real-time processing of streaming big data

Kinesis Data Streams is useful for rapidly moving data off data producers and then continuously processing the data

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/analytics/amazon-kinesis/

</p></details><hr>

### Question 18: 

An application running in your on-premise data center writes data to a MySQL database. You are re-architecting the application and plan to move the database layer into the AWS cloud on RDS. You plan to keep the application running in your on-premise data center. What do you need to do to connect the application to the RDS database via the Internet? (choose 2)

- A. Create a security group allowing access from your public IP to the RDS instance and assign to the RDS instance 
- B. Choose to make the RDS instance publicly accessible and place it in a public subnet 
- C. Select a public IP within the DB subnet group to assign to the RDS instance
- D. Create a DB subnet group that is publicly accessible

<details><summary>Answer:</summary><p>
AB

Explanation:

When create an RDS instance, select the option to make it publicly accessible

A security group will need to be created and assigned to the RDS instance

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Scenarios.html#USER_VPC.Scenario4

</p></details><hr>

### Question 19: 

A solutions architect is building a scalable and fault tolerant web architecture and is evaluating the benefits of the Elastic Load Balancing (ELB) service. Which statements are true regarding ELBs? (select 2)

- A. Internal-only load balancers require an Internet gateway
- B. Internet facing ELB nodes have public IPs 
- C. Multiple subnets per AZ can be enabled for each ELB
- D. For public facing ELBs you must have one public subnet in each AZ where the ELB is defined 
- E. Both types of ELB route traffic to the public IP addresses of EC2 instances

<details><summary>Answer:</summary><p>
BD

Explanation:

Internet facing ELB nodes have public IPs

Both types of ELB route traffic to the private IP addresses of EC2 instances

For public facing ELBs you must have one public subnet in each AZ where the ELB is defined

Internal-only load balancers do not require an Internet gateway

Only 1 subnet per AZ can be enabled for each ELB

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

</p></details><hr>

### Question 20: Incorrect*

You have an existing Auto Scaling Group running with 8 EC2 instances. You have decided to attach an ELB to the ASG by connecting a Target Group. The ELB is in the same region and already has 10 EC2 instances running in the Target Group. When attempting to attach the ELB the request fails, what is the most likely cause?

- A. Adding the 10 EC2 instances to the ASG would exceed the maximum capacity configured 
- B. You cannot attach running EC2 instances to an ASG
- C. ASGs cannot be edited once defined, you would need to recreate it 
- D. The EC2 instances in the Target Group are in the wrong Availability Zone

<details><summary>Answer:</summary><p>
A

Explanation:

Amazon EC2 Auto Scaling helps you ensure that you have the correct number of Amazon EC2 instances available to handle the load for your application

You can attach one or more Target Groups to your ASG to include instances behind an ALB

The ELBs must be in the same region

Once you do this any EC2 instance existing or added by the ASG will be automatically registered with the ASG defined ELBs

If adding an instance to an ASG would result in exceeding the maximum capacity of the ASG the request will fail

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 21: 

You are building a small web application running on EC2 that will be serving static content. What AWS service provides durable storage for static content and would reduce the load on the web server?

- A. Amazon RedShift
- B. Amazon CloudFront
- C. Amazon EBS volume
- D. Amazon S3 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon S3 is object storage built to store and retrieve any amount of data from anywhere on the Internet

It’s a simple storage service that offers an extremely durable, highly available, and infinitely scalable data storage infrastructure at very low costs

S3 can be used to host static websites

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 22: *

Lambda automatically monitors Lambda functions and reports metrics through CloudWatch. Which metrics does Lambda track? (choose 3)

- A. Total number of connections
- B. Latency per request 
- C. Total number of requests 
- D. Number of requests resulting in an error 

<details><summary>Answer:</summary><p>
BCD

Explanation:

Lambda automatically monitors Lambda functions and reports metrics through CloudWatch

Lambda tracks the number of requests, the latency per request, and the number of requests resulting in an error

You can view the request rates and error rates using the AWS Lambda Console, the CloudWatch console, and other AWS resources

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

</p></details><hr>

### Question 23: 

You are trying to clean up your unused EBS volumes and snapshots to save some space and cost. How many of the most recent snapshots of an EBS volume need to be maintained to guarantee that you can recreate the full EBS volume from the snapshot?

- A. The oldest snapshot, as this references data in all other snapshots
- B. You must retain all snapshots as the process is incremental and therefore data is required from each snapshot
- C. Only the most recent snapshot. Snapshots are incremental, but the deletion process will ensure that no data is lost 
- D. Two snapshots, the oldest and most recent snapshots

<details><summary>Answer:</summary><p>
C

Explanation:

Snapshots capture a point-in-time state of an instance

If you make periodic snapshots of a volume, the snapshots are incremental, which means that only the blocks on the device that have changed after your last snapshot are saved in the new snapshot

Even though snapshots are saved incrementally, the snapshot deletion process is designed so that you need to retain only the most recent snapshot in order to restore the volume

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html

</p></details><hr>

### Question 24: 

Which statements about EBS volume encryption are true? (choose 2)

- A. EBS encrypts your volume with a data key using the industry-standard AES-128 algorithm
- B. You cannot change the CMK that is associated with an existing snapshot or encrypted volume 
- C. Encryption operations occur on the EBS block store, ensuring the security of data-at-rest
- D. Encryption operations occur on the servers that host EC2 instances, ensuring the security of both data-at-rest and data-in-transit between an instance and its attached EBS storage 

<details><summary>Answer:</summary><p>
BD

Explanation:

All EBS volume types support encryption

All instance families now support encryption

Data in transit between an instance and an encrypted volume is also encrypted

To encrypt a volume or snapshot you need an encryption key, these are customer managed keys (CMK) and they are managed by the AWS Key Management Service (KMS)

The CMK used to encrypt a volume is used by any snapshots and volumes created from snapshots

You cannot change the CMK key that is used to encrypt a volume

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 25: 

Question 3 You need to create a file system that can be concurrently accessed by multiple EC2 instances within an AZ. The file system needs to support high throughput and the ability to burst. As the data that will be stored on the file system will be sensitive you need to ensure it is encrypted at rest and in transit. What storage solution would you implement for the EC2 instances?

- A. Add EBS volumes to each EC2 instance and use an ELB to distribute data evenly between the volumes
- B. Add EBS volumes to each EC2 instance and configure data replication
- C. Use the Elastic Block Store (EBS) and mount the file system at the block level
- D. Use the Elastic File System (EFS) and mount the file system using NFS v4.1 

<details><summary>Answer:</summary><p>
D

Explanation:

EFS is a fully-managed service that makes it easy to set up and scale file storage in the Amazon Cloud

EFS uses the NFSv4.1 protocol

Amazon EFS is designed to burst to allow high throughput levels for periods of time

EFS offers the ability to encrypt data at rest and in transit

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-efs/

</p></details><hr>

### Question 26: 

A three-tier web application that you deployed in your VPC has been experiencing heavy load on the DB tier. The DB tier uses RDS MySQL in a multi-AZ configuration. Customers have been complaining about poor response times and you have been asked to find a solution. During troubleshooting you discover that the DB tier is experiencing high read contention during peak hours of the day. What are two possible options you could use to offload some of the read traffic from the DB to resolve the performance issues? (choose 2)

- A. Add RDS read replicas in each AZ 
- B. Deploy ElastiCache in each AZ 
- C. Migrate to DynamoDB
- D. Use a larger RDS instance size

<details><summary>Answer:</summary><p>
AB

Explanation:

ElastiCache is a web service that makes it easy to deploy and run Memcached or Redis protocol-compliant server nodes in the cloud

The in-memory caching provided by ElastiCache can be used to significantly improve latency and throughput for many read-heavy application workloads or compute-intensive workloads

Read replicas are used for read heavy DBs and replication is asynchronous

Read replicas are for workload sharing and offloading

Read replicas are created from a snapshot of the master instance

Moving from a relational DB to a NoSQL DB (DynamoDB) is unlikely to be a viable solution

Using a larger instance size may alleviate the problems the question states that the solution should offload reads from the main DB, read replicas can do this

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-elasticache/

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 27: 

You are trying to decide on the best data store to use for a new project. The requirements are that the data store is schema-less, supports strongly consistent reads, and stores data in tables, indexed by a primary key. Which AWS data store would you use?

- A. RedShift
- B. RDS
- C. DynamoDB 
- D. S3

<details><summary>Answer:</summary><p>
C

Explanation:

Amazon Dynamo DB is a fully managed NoSQL database service that provides fast and predictable performance with seamless scalability

Provides two read models

Eventually consistent reads (Default):

- The eventual consistency option maximizes your read throughput (best read performance)

- An eventually consistent read might not reflect the results of a recently completed write

- Consistency across all copies reached within 1 second

Strongly consistent reads:

- A strongly consistent read returns a result that reflects all writes that received a successful response prior to the read (faster consistency)

Stores structured data in tables, indexed by a primary key

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 28: Incorrect*

You are running an application on EC2 instances in a private subnet of your VPC. You would like to connect the application to Amazon API Gateway. For security reasons, you need to ensure that no traffic traverses the Internet and need to ensure all traffic uses private IP addresses only. How can you achieve this?

- A. Create a public VIF on a Direct Connect connection
- B. Create a private API using an interface VPC endpoint 
- C. Create a NAT gateway
- D. Add the API gateway to the subnet the EC2 instances are located in 

<details><summary>Answer:</summary><p>
B

Explanation:

An Interface endpoint uses AWS PrivateLink and is an elastic network interface (ENI) with a private IP address that serves as an entry point for traffic destined to a supported service

Using PrivateLink you can connect your VPC to supported AWS services, services hosted by other AWS accounts (VPC endpoint services), and supported AWS Marketplace partner services

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 29: *

A client has made some updates to their web application. The application uses an Auto Scaling Group to maintain a group of several EC2 instances. The application has been modified and a new AMI must be used for launching any new instances that ASG launches. What do you need to do to add the new AMI?

- A. Suspend Auto Scaling and replace the existing AMI
- B. Modify the existing launch configuration to add the new AMI
- C. Create a new target group that uses a new launch configuration with the new AMI
- D. Create a new launch configuration that uses the AMI and update the ASG to use the new launch configuration 

<details><summary>Answer:</summary><p>
D

Explanation:

Launch configuration is the template used to create new EC2 instances and includes parameters such as instance family, instance type, AMI, key pair and security groups

You cannot edit a launch configuration once defined

In this case you can create a new launch configuration that use the new AMI and any new instances that are launched by the ASG will use the new AMI

Suspending scaling processes can be useful when you want to investigate a configuration problem or other issue with your web application and then make changes to your application, without invoking the scaling processes. It is not useful in this situation

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

</p></details><hr>

### Question 30: Incorrect*

An event in CloudTrail is the record of an activity in an AWS account. What are the two types of events that can be logged in CloudTrail? (choose 2)

- A. Management Events which are also known as control plane operations 
- B. Data Events which are also known as data plane operations 
- C. System Events which are also known as instance level operations 
- D. Platform Events which are also known as hardware level operations

<details><summary>Answer:</summary><p>
AB

Explanation:

Trails can be configured to log Data events and management events: Data events: These events provide insight into the resource operations performed on or within a resource. These are also known as data plane operations Management events: Management events provide insight into management operations that are performed on resources in your AWS account. These are also known as control plane operations. Management events can also include non-API events that occur in your account

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudtrail/

https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html

</p></details><hr>

### Question 31: 

A client has requested a design for a fault tolerant database that can failover between AZs. You have decided to use RDS in a multi-AZ configuration. What type of replication will the primary database use to replicate to the standby instance?

- A. Asynchronous replication
- B. Continuous replication
- C. Scheduled replication
- D. Synchronous replication 

<details><summary>Answer:</summary><p>
D

Explanation:

Multi-AZ RDS creates a replica in another AZ and synchronously replicates to it (DR only)

Multi-AZ deployments for the MySQL, MariaDB, Oracle and PostgreSQL engines utilize synchronous physical replication

Multi-AZ deployments for the SQL Server engine use synchronous logical replication (SQL Server-native Mirroring technology)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-rds/

</p></details><hr>

### Question 32: *

Your operations team would like to be notified if an RDS database exceeds certain metric thresholds. They have asked you how this could be automated?

- A. Setup an RDS alarm and associate an SNS topic with it that sends an email
- B. Create a CloudWatch alarm and associate an SNS topic with it that sends an email notification 
- C. Create a CloudTrail alarm and configure a notification event to send an SMS
- D. Create a CloudWatch alarm and associate an SQS with it that delivers a message to SES

<details><summary>Answer:</summary><p>
B

Explanation:

Amazon CloudWatch uses Amazon SNS to send email

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/amazon-cloudwatch/

</p></details><hr>

### Question 33: *

You are a Solutions Architect at Digital Cloud Guru. You have just completed the implementation of a 2-tier web application for a client. The application uses EC2 instances, ELB and Auto Scaling across two subnets. After deployment you notice that only one subnet has EC2 instances running in it. What might be the cause of this situation?

- A. The ELB is configured as an internal-only load balancer
- B. The AMI is missing from the ASG’s launch configuration
- C. Cross-zone load balancing is not enabled on the ELB
- D. The Auto Scaling Group has not been configured with multiple subnets 

<details><summary>Answer:</summary><p>
D

Explanation:

You can determine which subnets Auto Scaling will launch new instances into

Auto Scaling will try to distribute EC2 instances evenly across AZs

ELB is not the issue here as ELB is not responsible for launching instances into subnets

If the AMI was missing from the launch configuration no instances would be running

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 34: Incorrect*

In Route 53, what record type can be used to point a domain name at an Application Load Balancer?

- A. A Pointer (PTR) record
- B. A CNAME record 
- C. An A record that is an Alias 
- D. An A record that is not an Alias

<details><summary>Answer:</summary><p>
C

Explanation:

A pointer resolves an IP address to an FQDN

The Alias record is a Route 53 specific record type

Alias records are used to map resource record sets in your hosted zone to Amazon Elastic Load Balancing load balancers, Amazon CloudFront distributions, AWS Elastic Beanstalk environments, or Amazon S3 buckets that are configured as websites

You cannot map a regular A record to an ELB

A CNAME is a canonical name and cannot be used to map to an ELB in Route 53 (you can do it from other DNS services however)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 35: 

Which of the following statements about Elastic IP addresses are true? (choose 3)

- A. A disassociated Elastic IP address remains allocated to your account until you explicitly release it 
- B. An Elastic IP address is for use in a specific Availability Zone only
- C. You can assign custom tags to your Elastic IP addresses to categorize them 
- D. An Elastic IP address is for use in a specific region only 
- E. AWS impose a small hourly charge for the use of an Elastic IP address

<details><summary>Answer:</summary><p>
ACD

Explanation:

AWS only charge for elastic IP’s when they’re not being used

Elastic IPs are retained when the instance is stopped

All accounts are limited to 5 elastic IP’s per region by default

An Elastic IP address is for use in a specific region only

You can assign custom tags to your Elastic IP addresses to categorize them

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 36: 

Which of the options below are valid use cases for DynamoDB? (choose 3)

- A. Storing metadata for S3 objects 
- B. Archiving rarely accessed data
- C. Storing BLOB data
- D. Storing web session data 
- E. Storing JSON documents 
- F. Performing complex SQL joins

<details><summary>Answer:</summary><p>
ADE

Explanation:

Amazon Dynamo DB is a fully managed NoSQL database service that provides fast and predictable performance with seamless scalability

DynamoDB can be used for storing session state

DynamoDB is a Web service that uses HTTP over SSL (HTTPS) as a transport and JSON as a message serialization format

Can store pointers to objects in S3, including items over 400KB

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-dynamodb/

</p></details><hr>

### Question 37: *

In the Simple Workflow Service (SWF), what are the various logical elements? (choose 3)

- A. Workflows 
- B. Queues
- C. Domains 
- D. Functions
- E. Activities 

<details><summary>Answer:</summary><p>
ACE

Explanation:

SWF applications include the following logical components: Domains Workflows Activities Task Lists Workers Workflow Execution

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-swf/

https://docs.aws.amazon.com/amazonswf/latest/awsrbflowguide/concepts-parts.html

</p></details><hr>

### Question 38: Incorrect*

An application you manage runs a number of components using a micro-services architecture. Several ECS container instances in your ECS cluster are displaying as disconnected. The ECS instances were created from the Amazon ECS-Optimized AMI. What steps might you take you troubleshoot the issue? (choose 2)

- A. Verify that the container instances are using the Fargate launch type 
- B. Verify that the IAM instance profile has the necessary permissions 
- C. Verify that the container instances have the container agent installed
- D. Verify that the container agent is running on the container instances 

<details><summary>Answer:</summary><p>
BD

Explanation:

The ECS container agent is included in the Amazon ECS optimized AMI and can also be installed on any EC2 instance that supports the ECS specification (only supported on EC2 instances)

Troubleshooting steps include: Verify that the Docker daemon is running on the container instance Verify that the Docker Container daemon is running on the container instance Verify that the container agent is running on the container instance Verify that the IAM instance profile has the necessary permissions

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

https://aws.amazon.com/premiumsupport/knowledge-center/ecs-agent-disconnected/

</p></details><hr>

### Question 39: Incorrect*

Your company has over 2000 users and is planning to migrate data into the AWS Cloud. Some of the data is user’s home folders on an existing file share and the plan is to move this data to S3. Each user will have a folder in a shared bucket under the folder structure: bucket/home/%username%. What steps do you need to take to ensure that each user can access their own home folder and no one else’s? (choose all that apply)

- A. Create an IAM group and attach the IAM policy 
- B. Attach an S3 ACL sub-resource that grants access based on the %username% variable 
- C. Create a bucket policy that applies access permissions based on username 
- D. Create an IAM policy that applies object-level S3 ACLs 
- E. Create an IAM policy that applies folder-level permissions 
- F. Assign IAM users to the IAM group 

<details><summary>Answer:</summary><p>
AEF

Explanation:

The AWS blog URL above explains how to construct an IAM policy for a similar scenario

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

https://aws.amazon.com/blogs/security/writing-iam-policies-grant-access-to-user-specific-folders-in-an-amazon-s3-bucket/

</p></details><hr>

### Question 40: 

You are a Solutions Architect for Digital Cloud Guru. A client has asked for some assistance in selecting the best database for a specific requirement. The database will be used for a data warehouse solution and the data will be stored in a structured format. The client wants to run complex analytics queries using business intelligence tools. Which AWS database service will you recommend?

- A. DynamoDB
- B. Aurora
- C. RDS
- D. RedShift 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon Redshift is a fast, fully managed data warehouse that makes it simple and cost-effective to analyze all your data using standard SQL and existing Business Intelligence (BI) tools

RedShift is a SQL based data warehouse used for analytics applications

RedShift is an Online Analytics Processing (OLAP) type of DB

RedShift is used for running complex analytic queries against petabytes of structured data, using sophisticated query optimization, columnar storage on high-performance local disks, and massively parallel query execution

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/database/amazon-redshift/

</p></details><hr>

### Question 41: 

The development team in your organization would like to start leveraging AWS services. They have asked you what AWS service can be used to quickly deploy and manage applications in the AWS Cloud? The developers would like the ability to simply upload applications and have AWS handle the deployment details of capacity provisioning, load balancing, auto-scaling, and application health monitoring. What AWS service would you recommend?

- A. OpsWorks
- B. EC2
- C. Elastic Beanstalk 
- D. Auto Scaling

<details><summary>Answer:</summary><p>
C

Explanation:

AWS Elastic Beanstalk can be used to quickly deploy and manage applications in the AWS Cloud

Developers upload applications and Elastic Beanstalk handles the deployment details of capacity provisioning, load balancing, auto-scaling, and application health monitoring

Considered a Platform as a Service (PaaS) solution

Supports Java, .NET, PHP, Node.js, Python, Ruby, Go, and Docker web applications

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-elastic-beanstalk/

</p></details><hr>

### Question 42: 

You work as a Solutions Architect for a global travel agency. The company has numerous offices around the world and users regularly upload large data sets to a centralized data center in the in U.S. The company is moving into AWS and you have been tasked with re-architecting the application stack on AWS. For the data storage, you would like to use the S3 object store and enable fast and secure transfer of the files over long distances. Many objects will be larger than 100MB. What configuration will optimize performance and cater for large files? (choose 2)

- A. Use S3 bucket replication
- B. Use multipart upload 
- C. Use Route 53 latency based routing
- D. Enable S3 transfer acceleration 

<details><summary>Answer:</summary><p>
BD

Explanation:

Amazon S3 Transfer Acceleration enables fast, easy, and secure transfers of files over long distances between your client and your Amazon S3 bucket

S3 Transfer Acceleration leverages Amazon CloudFront’s globally distributed AWS Edge Locations

Used to accelerate object uploads to S3 over long distances (latency)

You can use multipart uploads with transfer acceleration

For objects larger than 100 megabytes use the Multipart Upload capability

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 43: Incorrect

You are a Solutions Architect at Digital Cloud Guru. One of your customers runs an application on-premise that stores large media files. The data is mounted to different servers using either the SMB or NFS protocols. The customer is having issues with scaling the storage infrastructure on-premise and is looking for a way to offload the data set into the cloud whilst retaining a local cache for frequently accessed content. What solution would you recommend to the customer that would allow them to offload storage to the cloud and continue to mount a local cache on-premise using the SMB and NFS protocols?

- A. Establish a VPN and use the Elastic File System (EFS)
- B. Create a script that migrates infrequently used data to S3 using multi-part upload
- C. Use the AWS Storage Gateway Volume Gateway in cached volume mode 
- D. Use the AWS Storage Gateway File Gateway 

<details><summary>Answer:</summary><p>
D

Explanation:

File gateway provides a virtual on-premises file server, which enables you to store and retrieve files as objects in Amazon S3

Can be used for on-premises applications, and for Amazon EC2-resident applications that need file storage in S3 for object based workloads

Used for flat files only, stored directly on S3

File gateway offers SMB or NFS-based access to data in Amazon S3 with local caching

https://aws.amazon.com/blogs/security/writing-iam-policies-grant-access-to-user-specific-folders-in-an-amazon-s3-bucket/

</p></details><hr>

### Question 44: 

The AWS Acceptable Use Policy describes permitted and prohibited behavior on AWS and includes descriptions of prohibited security violations and network abuse. According to the policy, what is AWS's position on penetration testing?

- A. AWS allow penetration for some resources with prior authorization 
- B. AWS do not allow any form of penetration testing
- C. AWS allow penetration testing by customers on their own VPC resources
- D. AWS allow penetration testing for all resources

<details><summary>Answer:</summary><p>
A

Explanation:

Permission is required for all penetration tests

You must complete and submit the AWS Vulnerability / Penetration Testing Request Form to request authorization for penetration testing to or originating from any AWS resources

There is a limited set of resources on which penetration testing can be performed

https://aws.amazon.com/security/penetration-testing/

</p></details><hr>

### Question 45: Incorrect*

Using the VPC wizard, you have selected the option “VPC with Public and Private Subnets and Hardware VPN access”. Which of the statements below correctly describe the configuration that will be created? (choose 2)

- A. A virtual private gateway will be created 
- B. A NAT gateway will be created for the private subnet 
- C. A peering connection will be made between the public and private subnets
- D. One subnet will be connected to your corporate data center using an IPSec VPN tunnel 

<details><summary>Answer:</summary><p>
AD

Explanation:

The configuration for this scenario includes a virtual private cloud (VPC) with a public subnet and a private subnet, and a virtual private gateway to enable communication with your own network over an IPsec VPN tunnel

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Scenario3.html

</p></details><hr>

### Question 46: 

You just created a new subnet in your VPC and have launched an EC2 instance into it. You are trying to access the EC2 instance from the Internet and cannot connect. What steps should you take to troubleshoot the issue? (choose 2)

- A. Check that the route table associated with the subnet has an entry for an Internet Gateway 
- B. Check that you can ping the instance from another subnet
- C. Check that there is a NAT Gateway configured for the subnet
- D. Check that the instance has a public IP address 

<details><summary>Answer:</summary><p>
AD

Explanation:

Public subnets are subnets that have:

- “Auto-assign public IPv4 address” set to “Yes”

- The subnet route table has an attached Internet Gateway

A NAT Gateway is used for providing outbound Internet access for EC2 instances in private subnets

Checking you can ping from another subnet does not relate to being able to access the instance remotely as it uses different protocols and a different network path

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

</p></details><hr>

### Question 47: Incorrect*

What are the memory allocation options for Lambda functions?

- A. Minimum 512MB, maximum 1024MB in 64MB increments
- B. Minimum 128MB, maximum 3008MB in 64MB increments 
- C. Minimum 512MB, maximum 1024MB in 128MB increments
- D. Minimum 128MB, maximum 3008MB in 128MB increments 

<details><summary>Answer:</summary><p>
B

Explanation:

You specify the amount of memory you need allocated to your Lambda functions

AWS Lambda allocates CPU power proportional to the memory you specify using the same ratio as a general purpose EC2 instance type

You can request additional memory in 64MB increments from 128MB to 3008MB

Functions larger than 1536MB are allocated multiple CPU threads, and multi-threaded or multi-process code is needed to take advantage

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

</p></details><hr>

### Question 48: Incorrect

The development team at Digital Cloud Guru have created a new web-based application that will soon be launched. The application will utilize 20 EC2 instances for the web front-end. Due to concerns over latency, you will not be using an ELB but still want to load balance incoming connections across multiple EC2 instances. You will be using Route 53 for the DNS service and want to implement health checks to ensure instances are available. What two Route 53 configuration options are available that could be individually used to ensure connections reach multiple web servers in this configuration? (choose 2)

- A. Use Route 53 simple load balancing which will return records in a round robin fashion 
- B. Use Route 53 multivalue answers to return up to 8 records with each DNS query 
- C. Use Route 53 weighted records and give equal weighting to all 20 EC2 instances 
- D. Use Route 53 failover routing in an active-active configuration

<details><summary>Answer:</summary><p>
BC

Explanation:

Multi-value answer routing policy can be used for responding to DNS queries with up to eight healthy records selected at random

Weighted: Similar to simple but you can specify a weight per IP address You create records that have the same name and type and assign each record a relative weight

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-route-53/

</p></details><hr>

### Question 49: 

A colleague has asked you to describe the difference between EC2 Dedicated Hosts and Dedicated Instances. Which of the statements below are accurate descriptions?

- A. You can configure a VPC to Dedicated tenancy which overrides the setting configured at launch
- B. Dedicated instances may share hardware with other instances from the same AWS account that are not Dedicated instances
- C. All answers are correct 
- D. An EC2 Dedicated Host is a physical server with EC2 instance capacity fully dedicated to your use
- E. Dedicated Instances are EC2 instances that run in a VPC on hardware that's dedicated to a single customer
- F. Dedicated Hosts can help you address compliance requirements and reduce costs by allowing you to use your existing server-bound software licenses

<details><summary>Answer:</summary><p>
C

Explanation:

An Amazon EC2 Dedicated Host is a physical server with EC2 instance capacity fully dedicated to your use. Dedicated Hosts can help you address compliance requirements and reduce costs by allowing you to use your existing server-bound software licenses

Dedicated Instances are Amazon EC2 instances that run in a VPC on hardware that's dedicated to a single customer. Your Dedicated instances are physically isolated at the host hardware level from instances that belong to other AWS accounts. Dedicated instances may share hardware with other instances from the same AWS account that are not Dedicated instances

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

https://aws.amazon.com/ec2/dedicated-hosts/

https://aws.amazon.com/ec2/purchasing-options/dedicated-instances/

</p></details><hr>

### Question 50: Incorrect

An EC2 instance on which you are running a video on demand web application has been experiencing high CPU utilization. You would like to take steps to reduce the impact on the EC2 instance and improve performance for consumers. Which of the steps below would help?

- A. Use ElastiCache as the web front-end and forward connections to EC2 for cache misses
- B. Create an ELB and place it in front of the EC2 instance
- C. Create a CloudFront RTMP distribution and point it at the EC2 instance 
- D. Create a CloudFront distribution and configure a custom origin pointing at the EC2 instance 

<details><summary>Answer:</summary><p>
D

Explanation:

ElastiCache cannot be used as an Internet facing web front-end

An origin is the origin of the files that the CDN will distribute

Origins can be either an S3 bucket, an EC2 instance, and Elastic Load Balancer, or Route 53 – can also be external (non-AWS)

For RTMP distributions files must be stored in an S3 bucket

Placing an ELB in front of a single EC2 instance does not help to reduce load

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-cloudfront/

</p></details><hr>

### Question 51: Incorrect*

You are developing some code that uses a Lambda function and you would like to enable the function to connect to an ElastiCache cluster within a VPC that you own. What VPC-specific information must you include in your function to enable this configuration? (choose 2)

- A. VPC Security Group IDs 
- B. VPC Subnet IDs 
- C. VPC Route Table IDs
- D. VPC Logical IDs 

<details><summary>Answer:</summary><p>
AB

Explanation:

To enable your Lambda function to access resources inside your private VPC, you must provide additional VPC-specific configuration information that includes VPC subnet IDs and security group IDs

AWS Lambda uses this information to set up elastic network interfaces (ENIs) that enable your function

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-lambda/

https://docs.aws.amazon.com/lambda/latest/dg/vpc.html

</p></details><hr>

### Question 52: 

A new financial platform has been re-architected to use Docker containers in a micro-services architecture. The new architecture will be implemented on AWS and you have been asked to recommend the solution configuration. For operational reasons, it will be necessary to access the operating system of the instances on which the containers run. Which solution delivery option will you select?

- A. ECS with the Fargate launch type
- B. ECS with the EC2 launch type 
- C. ECS with a default cluster
- D. EKS with Kubernetes managed infrastructure

<details><summary>Answer:</summary><p>
B

Explanation:

Amazon Elastic Container Service (ECS) is a highly scalable, high performance container management service that supports Docker containers and allows you to easily run applications on a managed cluster of Amazon EC2 instances

Fargate Launch Type is a serverless infrastructure managed by AWS

EC2 Launch Type allows you to run containers on EC2 instances that you manage

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ecs/

</p></details><hr>

### Question 53: Incorrect

What two methods are available for accessing and querying the properties of an EC2 instance such as instance ID, public keys and network interfaces? (choose 2)

- A. Run the command “curl http://169.254.169.254/latest/dynamic/instance-identity/” 
- B. Run the command “curl http://169.254.169.254/latest/meta-data/” 
- C. Use the EC2 Config service
- D. Download and run the Instance Metadata Query Tool 

<details><summary>Answer:</summary><p>
BD

Explanation:

Instance metadata is available at http://169.254.169.254/latest/meta-data

The Instance Metadata Query tool allows you to query the instance metadata without having to type out the full URI or category names

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ec2/

</p></details><hr>

### Question 54: Incorrect

A new application that you rolled out recently uses API Gateway and Lambda. The application is expected to be used by a large number of customers every day. Your company is planning on running an advertising campaign that will likely result in significant hits to the application after each ad is run. You’re concerned about the impact this may have on your application and would like to put in place some controls to limit the number of requests per second that hit the application. What controls will you implement in this situation?

- A. API Gateway and Lambda scale automatically to handle any load so there’s no need to implement controls 
- B. Enable Lambda continuous scaling
- C. Enable caching on the API Gateway and specify a size in gigabytes
- D. Implement throttling rules on the API Gateway 

<details><summary>Answer:</summary><p>
D

Explanation:

Resiliency can be implemented through throttling rules based on the number of requests per second for each HTTP method (GET, PUT)

Throttling can be configured at multiple levels including Global and Service Call

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

</p></details><hr>

### Question 55: 

You are a developer at Digital Cloud Guru. An application stack you are building needs a message bus to decouple the application components from each other. The application will generate up to 300 messages per second without using batching. You need to ensure that a message is only delivered once and duplicates are not introduced into the queue. It is not necessary to maintain the order of the messages. Which SQS queue type will you use:

- A. Standard queues
- B. Auto Scaling queues
- C. Long polling queues
- D. FIFO queues 

<details><summary>Answer:</summary><p>
D

Explanation:

Standard queues provide a loose-FIFO capability that attempts to preserve the order of messages

Standard queues provide at-least-once delivery, which means that each message is delivered at least once

FIFO (first-in-first-out) queues preserve the exact order in which messages are sent and received – note that this is not required in the question but exactly once processing is

FIFO queues provide exactly-once processing, which means that each message is delivered once and remains available until a consumer processes it and deletes it

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/application-integration/amazon-sqs/

</p></details><hr>

### Question 56: 

A three-tier application running in your VPC uses Auto Scaling for maintaining a desired count of EC2 instances. One of the EC2 instances just reported an EC2 Status Check status of Impaired. Once this information is reported to Auto Scaling, what action will be taken?

- A. Auto Scaling waits for the health check grace period and then terminates the instance
- B. The impaired instance will be terminated, then a replacement will be launched 
- C. Auto Scaling must verify with the ELB status checks before taking any action
- D. A new instance will immediately be launched, then the impaired instance will be terminated

<details><summary>Answer:</summary><p>
B

Explanation:

Unlike AZ rebalancing, termination of unhealthy instances happens first, then Auto Scaling attempts to launch new instances to replace terminated instances

By default uses EC2 status checks

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/aws-auto-scaling/

</p></details><hr>

### Question 57: 

An application you manage regularly uploads files from an EC2 instance to S3. The files can be a couple of GB in size and sometimes the uploads are slower than you would like resulting in poor upload times. What method can be used to increase throughput and speed things up?

- A. Randomize the object names when uploading
- B. Upload the files using the S3 Copy SDK or REST API
- C. Use Amazon S3 multipart upload 
- D. Turn off versioning on the destination bucket

<details><summary>Answer:</summary><p>
C

Explanation:

Multipart upload can be used to speed up uploads to S3

Multipart upload uploads objects in parts independently, in parallel and in any order

Performed using the S3 Multipart upload API

It is recommended for objects of 100MB or larger:

- Can be used for objects from 5MB up to 5TB

- Must be used for objects larger than 5GB

If transmission of any part fails it can be retransmitted

Improves throughput

Can pause and resume object uploads

Can begin upload before you know the final object size

Randomizing object names provides no value in this context, random prefixes are used for intensive read requests

Copy is used for copying, moving and renaming objects within S3 not for uploading to S3

Turning off versioning will not speed up the upload

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/storage/amazon-s3/

</p></details><hr>

### Question 58: 

Which AWS service provides a hardware-based storage solution for cryptographic keys?

- A. CloudHSM 
- B. Public Key Infrastructure (PKI)
- C. Key Management Service (KMS)
- D. Virtual Private Cloud (VPC)

<details><summary>Answer:</summary><p>
A

Explanation:

AWS CloudHSM is a cloud-based hardware security module (HSM) that allows you to easily add secure key storage and high-performance crypto operations to your AWS applications

CloudHSM is a managed service that automates time-consuming administrative tasks, such as hardware provisioning, software patching, high availability, and backups

CloudHSM is one of several AWS services, including AWS Key Management Service (KMS), which offer a high level of security for your cryptographic keys

KMS provides an easy, cost-effective way to manage encryption keys on AWS that meets the security needs for the majority of customer data

https://aws.amazon.com/cloudhsm/details/

</p></details><hr>

### Question 59: Incorrect*

The development team in your company have created a Python application running on ECS containers with the Fargate launch type. You have created an ALB with a Target Group that routes incoming connections to the ECS-based application. The application will be used by consumers who will authenticate using federated OIDC compliant Identity Providers such as Google and Facebook. You would like to securely authenticate the users on the front-end before they access the authenticated portions of the application. How can this be done on the ALB?

- A. This cannot be done on an ALB; you’ll need to authenticate users on the back-end with AWS Single Sign-On (SSO) integration
- B. This cannot be done on an ALB; you’ll need to use another layer in front of the ALB
- C. This can be done on the ALB by creating an authentication action on a listener rule that configures an Amazon Cognito user pool with the social IdP 
- D. The only option is to use SAML with Amazon Cognito on the ALB 

<details><summary>Answer:</summary><p>
C

Explanation:

This is a new feature (May 2018) that is probably not in the exam yet but better to be prepared!

ALB now supports authentication from OIDC compliant identity providers such as Google, Facebook and Amazon

Implemented through an authentication action on a listener rule that integrates with Amazon Cognito to create user pools

SAML can be used with Amazon Cognito but this is not the only option

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/elastic-load-balancing/

https://aws.amazon.com/blogs/aws/built-in-authentication-in-alb/

</p></details><hr>

### Question 60: 

What AWS service does API Gateway integrate with to allow users from around the world to achieve the lowest possible latency for API requests and responses?

- A. CloudFront 
- B. Lambda
- C. S3 Transfer Acceleration
- D. Direct Connect

<details><summary>Answer:</summary><p>
A

Explanation:

CloudFront is used as the public endpoint for API Gateway

Provides reduced latency and distributed denial of service protection through the use of CloudFront

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-api-gateway/

</p></details><hr>

### Question 61: Incorrect*

You are concerned that you may be getting close to some of the default service limits for several AWS services. What AWS tool can be used to display current usage and limits?

- A. AWS Trusted Advisor 
- B. AWS CloudWatch
- C. AWS Systems Manager
- D. AWS Dashboard 

<details><summary>Answer:</summary><p>
A

Explanation:

Trusted Advisor is an online resource to help you reduce cost, increase performance, and improve security by optimizing your AWS environment

Trusted Advisor provides real time guidance to help you provision your resources following AWS best practices

AWS Trusted Advisor offers a Service Limits check (in the Performance category) that displays your usage and limits for some aspects of some services

https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html

</p></details><hr>

### Question 62: 

What are three correct statements regarding IAM groups? (choose 3)

- A. IAM groups can be nested up to 4 levels
- B. IAM groups can be used to assign permissions to users 
- C. IAM groups can temporarily assume a role to take on permissions for a specific task
- D. IAM groups can be used to group EC2 instances
- E. An IAM group is not an identity and cannot be identified as a principal in an IAM policy 
- F. IAM policies can be attached to groups to define the permissions granted to users within the group 

<details><summary>Answer:</summary><p>
BEF

Explanation:

Groups are collections of users and have policies attached to them

A group is not an identity and cannot be identified as a principal in an IAM policy

Use groups to assign permissions to users

Use the principal of least privilege when assigning permissions

You cannot nest groups (groups within groups)

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/security-identity-compliance/aws-iam/

</p></details><hr>

### Question 63: Incorrect*

Which of the following commands would be used to remove one or more inbound rules from a security group?

- A. update-security-group-rule-descriptions-ingress 
- B. revoke-security-group-egress
- C. revoke-security-group-ingress 
- D. update-security-group-rule-descriptions-egress

<details><summary>Answer:</summary><p>
C

Explanation:

The AWS CLI reference in the URL above lists EC2 CLI commands

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/networking-and-content-delivery/amazon-vpc/

https://docs.aws.amazon.com/cli/latest/reference/ec2/index.html#cli-aws-ec2

</p></details><hr>

### Question 64: Incorrect

You have deployed a number of AWS resources using CloudFormation. You need to make some changes to a couple of resources within the stack and are planning how to implement the updates. Due to recent bad experiences, you’re a little concerned about what the effects of implementing updates to the resources might have on other resources in the stack. What is the easiest way to proceed cautiously?

- A. Create and execute a change set 
- B. Use a direct update
- C. Deploy a new stack to test the changes 
- D. Use OpsWorks to manage the configuration changes

<details><summary>Answer:</summary><p>
A

Explanation:

AWS CloudFormation provides two methods for updating stacks: direct update or creating and executing change sets

When you directly update a stack, you submit changes and AWS CloudFormation immediately deploys them

Use direct updates when you want to quickly deploy your updates

With change sets, you can preview the changes AWS CloudFormation will make to your stack, and then decide whether to apply those changes

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/management-tools/aws-cloudformation/

https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html

</p></details><hr>

### Question 65: 

Your company has multiple AWS accounts for each environment (Prod, Dev, Test etc.). You would like to copy an EBS snapshot from DEV to PROD. The snapshot is from an EBS volume that was encrypted with a custom key. What steps do you need to take to share the encrypted EBS snapshot with the Prod account? (choose 2)

- A. Share the custom key used to encrypt the volume 
- B. Create a snapshot of the unencrypted volume and share it with the Prod account
- C. Modify the permissions on the encrypted snapshot to share it with the Prod account 
- D. Make a copy of the EBS volume and unencrypt the data in the process

<details><summary>Answer:</summary><p>
AC

Explanation:

You cannot share encrypted volumes created using a default CMK key

You cannot change the CMK key that is used to encrypt a volume

You can share encrypted snapshots with other AWS accounts using a non-default CMK key and configuring cross-account permissions to give the account access to the key, mark as private and configure the account to share with

The receiving account must copy the snapshot before they can then create volumes from the snapshot

It is recommended that the receiving account re-encrypt the shared and encrypted snapshot using their own CMK key

https://digitalcloud.guru/certification-training/aws-solutions-architect-associate/compute/amazon-ebs/

https://aws.amazon.com/blogs/aws/new-cross-account-copying-of-encrypted-ebs-snapshots/

</p></details><hr>

