### Question 1:

You work in the security industry for a large consultancy. A new customer of yours runs a production environment in AWS and they require a log of all API calls made to their Elastic Load Balancer. How can you achieve this?

- A. Enable CloudWatch on the ELB
- B. Enable Cloud Trail on the ELB 
- C. Enable Detailed Monitoring on the ELB when first creating the instance 
- D. Enable Cloud Audit on the ELB when first creating the instance

<details><summary>Answer:</summary><p>
B

Explanation:

You should enable Cloud Trail on the ELB

</p></details><hr>

### Question 2:

True or False: Amazon will always have root level SSH access in to your EC2 instances.

- A. TRUE 
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

The answer is FALSE. Amazon will not have root level SSH access to your EC2 instances

</p></details><hr>

### Question 3:

You have a static HTML website that requires inexpensive, highly available hosting solution that scales automatically to meet traffic demands. Which AWS service would best suit this requirement?

- A. EC2 with EBS behind and Autoscaling Group with a minimum configuration of 2
- B. EC2 with EBS behind and Autoscaling Group with a minimum configuration of 1
- C. S3 - Static Website Hosting 
- D. CloudFront

<details><summary>Answer:</summary><p>
C

Explanation:

S3 would be the cheapest solution for this requirement.

</p></details><hr>

### Question 4:

True or False: You should expect the same latency and throughput performance as Amazon S3 Standard when using Standard - IA.

- A. TRUE 
- B. FALSE 

<details><summary>Answer:</summary><p>
A

Explanation:

S3 Standard - IA offers the high durability, throughput, and low latency of Amazon S3 Standard, with a low per GB storage price and per GB retrieval fee.

</p></details><hr>

### Question 5:

You have a website that allows users in third world countries to store their important documents safely and securely online. Internet connectivity in these countries is unreliable, so you implement multipart uploads to improve the success rate of uploading files. This works well, however you notice that when an object is not uploaded successfully, incomplete parts of that object are still being stored in S3 and you are still being charged for those objects. What S3 service can you implement to expire incomplete multipart uploads?

- A. S3 Lifecycle Policies 
- B. Reduced Redundancy
- C. Cloud Watch which triggers a Lambda function to delete the data
- D. Data Pipeline with auto-delete

<details><summary>Answer:</summary><p>
A

Explanation:

You can create a lifecycle policy that expires incomplete multipart uploads, allowing you to save on costs by limiting the time non-completed multipart uploads are stored.

</p></details><hr>

### Question 6:

What is the durability of S3 - IA?

- A. 99%
- B. 99.99%
- C. 99.999999999% 
- D. 95%

<details><summary>Answer:</summary><p>
C

Explanation:

S3 Standard - IA is designed for the same 99.999999999% durability as S3 Standard and Amazon Glacier.

</p></details><hr>

### Question 7:

What is the minimum time interval granularity for the data that Amazon CloudWatch receives and aggregates?

- A. 30 seconds
- B. 1 minute 
- C. 5 minutes
- D. 10 minutes

<details><summary>Answer:</summary><p>
B

Explanation:

The minimum time interval for CloudWatch is 1 minute.

</p></details><hr>

### Question 8:

True or False: S3 does not support website redirects.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

S3 does support website redirects.

</p></details><hr>

### Question 9:

You need to automatically migrate objects from one S3 storage class to another based on the age of the data. What S3 service can you use to achieve this?

- A. Infrequent Access
- B. Lifecycle Management 
- C. Reduced Redundancy
- D. Glacier

<details><summary>Answer:</summary><p>
B

Explanation:

S3 Lifecycle management provides the ability to define the lifecycle of your object with a predefined policy and reduce your cost of storage. You can set lifecycle transition policy to automatically migrate Amazon S3 objects to Standard - Infrequent Access (Standard - IA) and/or Amazon Glacier based on the age of the data.

</p></details><hr>

### Question 10:

You work for an electric car company that has its front end website on EC2. Company policy dictates that you must retain a history of all EC2 API calls made on your account for security analysis and operational troubleshooting purposes. What AWS service can assist you with this?

- A. CloudWatch
- B. CloudFront
- C. CloudTrail 
- D. CloudTracker

<details><summary>Answer:</summary><p>
C

Explanation:

To receive a history of all EC2 API calls (including VPC and EBS) made on your account, you simply turn on CloudTrail in the AWS Management Console.

</p></details><hr>

### Question 11:

True or False: An Amazon Cluster Placement Group can be stretched across multiple availability zones?"

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

Because of the low latency required for a cluster placement group, a cluster placement group can only exist within 1 availability zone.

</p></details><hr>

### Question 12:

Your three AWS accounts (A, B and C) share data. In an attempt to maximize performance between the accounts, you place all the instances for these accounts in 'eu-west-1b'. During testing, you find almost no transfer latency between accounts A and B, but significant latency between accounts B and C, and accounts C and A. Which of the following possibilities is the most likely source of the problem?

- A. The names of the AZs are randomly applied, so 'eu-west-1b' is not the same location for all three accounts 
- B. You have incorrectly configured the cross account authentication policies in account C adding latency to those instances.
- C. Account C has been allocated to an older section of the Data Hall with slower networking.
- D. The instances for account C are on an overloaded Host. Stop all the Account C instances and then start them together so that they run an a new host.

<details><summary>Answer:</summary><p>
A

Explanation:

The Availability Zone names presented are unique per account and do not represent a specific set of physical resources.

</p></details><hr>

### Question 13:

True or False: You can use S3 Transfer Acceleration with multipart uploads.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

TRUE, You can use S3 Transfer Acceleration with multipart uploads.

</p></details><hr>

### Question 14:

You have built an online dating application that allows users to send and receive photos as they court each other. You need to secure this data and you need to implement server-side encryption to protect this data. You decide that you want server-side encryption provided by Amazon. You will also need to have an audit trail so you can see who used your key to access which object and when, as well as view failed attempts to access data from users without permission to decrypt the data. What out of the box Amazon solution would enable you to achieve this?

- A. SSE-S3 
- B. SSE-C
- C. SSE-KMS 
- D. Amazon S3 Encryption Client

<details><summary>Answer:</summary><p>
C

Explanation:

AWS KMS provides an audit trail so you can see who used your key to access which object and when, as well as view failed attempts to access data from users without permission to decrypt the data.

</p></details><hr>

### Question 15:

Which of the following is NOT a valid EC2 instance type?

- A. D2
- B. C4
- C. M3
- D. Z2 

<details><summary>Answer:</summary><p>
D

Explanation:

D2, C4, M3 are all valid EC2 instances. https://aws.amazon.com/ec2/instance-types/

</p></details><hr>

### Question 16:

You work for a large insurance company that has issued 10,000 insurance policies. These policies are stored as PDFs. You need these policies to be highly available and company policy says that the data must be able to survive the simultaneous loss of two facilities. What storage solution should you use?

- A. A single EC2 instance with an EBS volume provisioned as a secondary volume.
- B. S3 
- C. Glacier
- D. Route53

<details><summary>Answer:</summary><p>
B

Explanation:

Your best solution would be to use S3, which redundantly stores multiple copies of your data in multiple facilities and on multiple devices within each facility.

</p></details><hr>

### Question 17:

You are a solutions architect working for a company that conducts surveys on specific industries. Each industry that you survey has its own EC2 fleet, separate from those of other industries. Company policy dictates that you should keep costs to a minimum, using only 1 load balancer, if possible. What type of load balancer should you use to suit this requirement?

- A. Classic Load Balancer
- B. Application Load Balancer 
- C. Elastic Load Balancer with IDS
- D. Elastic Load Balancer with IPS

<details><summary>Answer:</summary><p>
B

Explanation:

You need an application-aware load balancer, so your best option would be to use an Application Load Balancer.

</p></details><hr>

### Question 18:

In the future, you will need to preserve, restore, and retrieve every version of every file that you have stored in AWS. Which service should you use?

- A. EC2 with an additional EBS volume, in conjunction with CloudWatch
- B. RDS
- C. Glacier
- D. S3 with versioning enabled. 

<details><summary>Answer:</summary><p>
D

Explanation:

Versioning allows you to preserve, retrieve, and restore every version of every object stored in an Amazon S3 bucket.

</p></details><hr>

### Question 19:

You need to restore an object from Glacier. What 2 ways can you accomplish this?

- A. Using the Glacier API
- B. Using the S3 API 
- C. Using the AWS Console 
- D. Using the AWS Command Line Interface and the S3 subcommand. 

<details><summary>Answer:</summary><p>
BC

Explanation:

Because Amazon S3 maintains the mapping between your user-defined object name and Amazon Glacier’s system-defined identifier, Amazon S3 objects that are stored using the Amazon Glacier option are only accessible through the Amazon S3 APIs or the Amazon S3 Management Console.

</p></details><hr>

### Question 20:

What is the Uptime SLA for Amazon EC2 and EBS within a given region?

- A. 99%
- B. 99.50%
- C. 99.95% 
- D. 100.00%

<details><summary>Answer:</summary><p>
C

Explanation:

Amazon's SLA guarantees a Monthly Uptime Percentage of at least 99.95% for Amazon EC2 and Amazon EBS within a Region.

</p></details><hr>

### Question 21:

What is the minimum object size for S3 - IA?

- A. 1 KB
- B. 0 Bytes 
- C. 1 Byte
- D. 128 KB 

<details><summary>Answer:</summary><p>
D

Explanation:

Standard - IA is designed for larger objects and has a minimum object size of 128KB. Objects smaller than 128KB in size will incur storage charges as if the object were 128KB.

</p></details><hr>

### Question 22:

You have designed an application that stores large videos in S3. These videos are usually larger than 100Mb in size. You need to maximize upload performance. Select two answers that will achieve this end.

- A. Design the application to use multipart upload, so that the file is split in to multiple parts which are then uploaded simultaneously. 
- B. Require the users to use Direct Connect in order to use to application so as to maximize the upload bandwidth.
- C. Utilize S3 Transfer Acceleration. 
- D. Implement a third party CDN solution.

<details><summary>Answer:</summary><p>
AC

Explanation:

Multipart Upload is recommended for files greater than 100 Mb, and is required for files 5 GB or larger. S3 Transfer Accelearation is especially useful in cases where your bucket resides in a Region other than the one in which the file transfer was originated.

</p></details><hr>

### Question 23:

You have an application that uses S3 to store objects. Company policy dictates that certain objects (such as JPGs and PDF's) must be replicated to another region for redundancy. However, some objects (such as Word files) can stay in a single region. Company policy also dictates that you should use as few buckets as possible. How should you architect this solution?

- A. Two buckets, 1 with CRR enabled on it (for the word files) and the other bucket without.
- B. Two buckets 1 with CRR enabled on it (for the JPGs and PDF's) and the other without. 
- C. One bucket and then enable CRR on just a subset of objects (such as JPGs and PDF's) uploaded by specifying prefixes. 
- D. Three buckets. 1 with CRR enabled on it for the JPG's, 1 with CRR enabled on it for the PDF's and 1 bucket just for the word files with no CRR enabled on it.

<details><summary>Answer:</summary><p>
C

Explanation:

You can use just one bucket and enable CRR on just a subset of uploaded objects (such as JPGs and PDF's) by using specifying prefixes.

</p></details><hr>

### Question 24:

You back the files that exist on an in-house SAN to S3. You need to minimize cost, however company policy states that objects must be instantly accessible. What S3 storage class should you use?

- A. S3 - RRS 
- B. S3 - IA 
- C. S3
- D. Glacier

<details><summary>Answer:</summary><p>
B

Explanation:

The best solutions for instant access, but lowese cost would be S3 - Infrequently Accessed storage.

</p></details><hr>

### Question 25:

You need to implement a new web application which allows users to store family photos online in such a way that only invited guests will be able to view the images. Which type of S3 encryption should you choose to maintain full end-to-end control of the encryption/decryption of objects and assure that only encrypted objects are transmitted over the Internet to Amazon S3.

- A. SSE-S3
- B. SSE-C
- C. SSE-KMS
- D. Amazon S3 Encryption Client 

<details><summary>Answer:</summary><p>
D

Explanation:

Using an encryption client library, such as the Amazon S3 Encryption Client, you retain control of the keys and complete the encryption and decryption of objects client-side using an encryption library of your choice. Some customers prefer full end-to-end control of the encryption and decryption of objects; that way, only encrypted objects are transmitted over the Internet to Amazon S3.

</p></details><hr>

### Question 26:

True or False: Classic ELB's support IPv6 as well as IPv4.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

Each Classic Load Balancer has an associated IPv4, IPv6, and dualstack (both IPv4 and IPv6) DNS name. However, IPv6 is not supported in VPC at this time.

</p></details><hr>

### Question 27:

Your company has a legacy SAN that has 75 TB's of data. Your company has decided that they want to migrate this data to AWS S3 in the quickest way possible. You company has a single comms line with a maximum pipe line of 50Mbps Which service should you consider using?

- A. S3 Transfer Acceleration
- B. Snowball 
- C. Direct Connect
- D. FTP

<details><summary>Answer:</summary><p>
B

Explanation:

Due to the size of the data and the small comms line, Snowball would be the fastest option available.

</p></details><hr>

### Question 28:

Which EC2 operating system is NOT supported by CloudWatch

- A. Amazon Linux
- B. Debian
- C. Ubuntu
- D. None of the above, all EC2 operating systems are supported by CloudWatch. 

<details><summary>Answer:</summary><p>
D

Explanation:

All EC2 operating systems are supported by CloudWatch.

</p></details><hr>

### Question 29:

How can you securely upload or download your data to/from the S3 service?

- A. SSL endpoints using the HTTPS protocol 
- B. SSL endpoints using the HTTP protocol 
- C. HTTP endpoints using the HTTPS protocol 
- D. HTTP endpoints using the HTTP protocol

<details><summary>Answer:</summary><p>
AC

Explanation:

You can securely upload/download your data to/from Amazon S3 via SSL or HTTP endpoints using HTTPS.

</p></details><hr>

### Question 30:

Which types of server side encryption are available for S3? (Choose all that apply.)

- A. Server Side Encryption Using S3 (SSE-S3) 
- B. Server Side Encryption with Customer-Provide Keys (SSE-C) 
- C. Client Side Encryption Using Amazon Provided Keys (CSE-AWS)
- D. Server Side Encryption Using KMS (SSE-KMS) 

<details><summary>Answer:</summary><p>
ABD

Explanation:

You can choose to encrypt data using SSE-S3, SSE-C, SSE-KMS, or a client library such as the Amazon S3 Encryption Client. All four enable you to store sensitive data encrypted at rest in Amazon S3.

</p></details><hr>

### Question 31:

Your legal company is moving its production estate to AWS. They currently have a private cloud platform with VMDK files as their virtual machines. You need to move these files to AWS and create EC2 instances using the VMDK files. Which AWS service would help you achieve this goal?

- A. CloudMigration
- B. VM Import/Export 
- C. VM Migrate 
- D. Data Pipeline

<details><summary>Answer:</summary><p>
B

Explanation:

VM Import/Export is designed to help you do exactly that.

</p></details><hr>

### Question 32:

You are running a Cassandra database that requires access to tens of thousands of low latency IOPS. What EC2 instance family would best suit your needs?

- A. Cluster GPU Instances
- B. High I/O instances 
- C. Dense Storage Instances
- D. Memory Optimized Instances

<details><summary>Answer:</summary><p>
B

Explanation:

High I/O instances use SSD-based local instance storage to deliver very high, low latency, I/O capacity to applications, and are optimized for applications that require tens of thousands of IOPS.

</p></details><hr>

### Question 33:

You are creating an application that will leverage EC2 for its webservers. The application data will be stored on the root device volume attached to the EC2 instance. Data on this volume must persist independently of the life of this particular instance. What EC2 volume should you choose?

- A. local instance store
- B. EBS 
- C. networked instance store
- D. Lambda

<details><summary>Answer:</summary><p>
B

Explanation:

By using Amazon EBS, data on the root device will persist independently from the lifetime of the instance.

</p></details><hr>

### Question 34:

What is the availability of S3 - IA

- A. 99.90% 
- B. 99%
- C. 99.999999999%
- D. 95%

<details><summary>Answer:</summary><p>
A

Explanation:

S3 - IA is 99.9% available. Do not confuse availability with durability.

</p></details><hr>

### Question 35:

You run a security company which stores highly sensitive PDF's on S3 with versioning enabled. To ensure MAXIMUM protection of your objects to protect against accidental deletion, what further security measure should you consider using?

- A. Setup a cloud watch alarm so that if an object in S3 is deleted, this will trigger an alarm and send an SNS notification to your phone.
- B. Use server-side encryption with S3 - KMS.
- C. Configure the application to use SSL endpoints using the HTTPS protocol.
- D. Enable versioning with MFA Delete on your S3 bucket. 

<details><summary>Answer:</summary><p>
D

Explanation:

If you enable Versioning with MFA Delete on your Amazon S3 bucket, two forms of authentication are required to permanently delete a version of an object: your AWS account credentials and a valid six-digit code and serial number from an authentication device in your physical possession.

</p></details><hr>

### Question 36:

You work for a security company that stores highly sensitive documents on S3. One of your customers has had a security breach and, as a precaution, they have asked you to remove a sensitive PDF from their S3 bucket. You log in to the AWS console using your account and attempt to delete the object. You notice that versioning is turned on, and when you dig a little deeper you discover that you cannot delete the object. What may be the cause of this?

- A. You can never permanently delete an object on S3 after versioning is enabled.
- B. You cannot delete the object because you are not the bucket owner. 
- C. You must be logged in as a Super User to delete objects. 
- D. S3 server-side encryption is preventing you from doing this.

<details><summary>Answer:</summary><p>
B

Explanation:

Only the owner of an Amazon S3 bucket can permanently delete a version.

</p></details><hr>

### Question 37:

True or False: You can use your existing Microsoft Windows Server licenses with an Amazon EC2 shared tenancy instance.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

FALSE. A Dedicated Host is required if you'd like to use your existing Windows Server licenses.

</p></details><hr>

### Question 38:

By default, how many Elastic IP addresses are you limited to per region?

- A. 5 
- B. 10
- C. 15
- D. 20

<details><summary>Answer:</summary><p>
A

Explanation:

By default, all accounts are limited to 5 Elastic IP addresses per region.

</p></details><hr>

### Question 39:

True or False: EBS Snapshots are versioned and you can read an older snapshot to do a point-in-time recovery?

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

The answer is TRUE. Each snapshot is given a unique identifier, and customers can create volumes based on any of their existing snapshots.

</p></details><hr>

### Question 40:

You have an extremely high performance compute application that you need to deploy to AWS. You will need extremely low-latency network performance to allow node-to-node communication between your EC2 instances. You will also need a minimum network speed of 10 Gbps in order for your application to work. How should you deploy your instances?

- A. Using a private VPC
- B. By creating a cluster placement group 
- C. By deploying in multiple availablity zones
- D. By using CloudFront to cache static assets so as to increase performance

<details><summary>Answer:</summary><p>
B

Explanation:

Amazon EC2 cluster placement group functionality allows users to group Cluster Compute Instances in clusters – allowing applications to get the low-latency network performance necessary for tightly-coupled node-to-node communication typical of many HPC applications.

</p></details><hr>

### Question 41:

By default, how many S3 buckets can you have with a new AWS account?

- A. 25
- B. 50
- C. 100 
- D. 200

<details><summary>Answer:</summary><p>
C

Explanation:

By default, customers can provision up to 100 buckets per AWS account. However, you can increase your Amazon S3 bucket limit by visiting AWS Service Limits.

</p></details><hr>

### Question 42:

Which of the following operating systems is NOT supported by EC2

- A. Amazon Linux
- B. Ubuntu
- C. OSX 
- D. Windows Server

<details><summary>Answer:</summary><p>
C

Explanation:

OSX is not supported on EC2

</p></details><hr>

### Question 43:

You have developed a file-sharing website for a large corporate entity. They require that the site has regional redundancy. Which S3 service should you use to achieve this?

- A. S3 Standard
- B. S3 - RRS with Data Pipeline to DynamoDB
- C. Configure a lambda function with a trigger of S3, so that when an object is uploaded to S3, it is automatically replicated to EBS.
- D. S3 - Cross-Region Replication 

<details><summary>Answer:</summary><p>
D

Explanation:

S3 with Cross-Region Replication (CRR) automatically replicates data across AWS regions. With CRR, every object uploaded to an S3 bucket is automatically replicated to a destination bucket in a different AWS region that you choose.

</p></details><hr>

### Question 44:

You have been load testing a customers new production environment. You create the environment using CloudFormation and you utilize CloudWatch to monitor the environment. After extensive load testing, you are ready to hand the cloudformation template over to your customer. You delete the environment and give your customer the CloudFormation template. However, they now want to see the results of the load test. How long does CloudWatch store the metrics for EC2 & ELB after deleting those resources?

- A. 24 hours 
- B. 48 hours
- C. 1 week
- D. 2 weeks 

<details><summary>Answer:</summary><p>
D

Explanation:

Amazon CloudWatch stores metrics for terminated Amazon EC2 instances or deleted Elastic Load Balancers for 2 weeks.

</p></details><hr>

### Question 45:

Which of the following statements is TRUE.

- A. You are able to attach multiple EBS volumes to an EC2 instance. 
- B. You are able to attach multiple EC2 instances to an EBS Volume.
- C. It is possible to configure an Autoscaling Group to repair degraded EBS volumes, without the need to terminate the EC2 instances.
- D. It is possible to use Autoscaling with EBS, rather than EC2.

<details><summary>Answer:</summary><p>
A

Explanation:

You are able to attach multiple EBS volumes to an EC2 instance is True.

</p></details><hr>

### Question 46:

What are the two different types of virtualization available on AWS?

- A. Hardware Virtual Machine (HVM) 
- B. Physical Virtual Machine (PVM)
- C. Paravirtual Machine (PV) 
- D. Cloud Virtual Machine (CVM)

<details><summary>Answer:</summary><p>
AC

Explanation:

The two different types of virtualzation available are Hardware Virtual Machine (HVM) & Paravirtual Machine (PVM)

</p></details><hr>

### Question 47:

You’ve been tasked with implementing a globally accessible storage solution that will scale from a few terabytes (now) to an unknown, but significantly greater, volume of data in three years time. Which AWS service would best meet your current and projected storage needs?

- A. EC2 with EBS
- B. S3 
- C. RDS
- D. DynamoDB

<details><summary>Answer:</summary><p>
B

Explanation:

Amazon S3 is highly scalable, secure storage for "flat" files. S3 will scale to any projected volume of data. In this case, it's your best bet.

</p></details><hr>

### Question 48:

Your large scientific organization needs to use a fleet of EC2 instances to perform high performance, CPU intensive calculations. Your boss asks you to choose an instance type that would best suit the needs of your organization. Which of the following instance types should you recommend?

- A. C4 
- B. M3
- C. D2
- D. R3

<details><summary>Answer:</summary><p>
A

Explanation:

C instanes are recommended for high performance front-end fleets, web-servers, batch processing, distributed analytics, high performance science and engineering applications, ad serving, MMO gaming, and video-encoding. The best answer would be to use a C4 instance.

</p></details><hr>

### Question 49:

You have an application that stores data in S3, and you need to design an integrated solution providing encryption at rest. You want Amazon to handle key management and protection using multiple layers of security. Which S3 encryption option should you use?

- A. SSE-S3 
- B. SSE-C
- C. SSE-KMS 
- D. Amazon S3 Encryption Client

<details><summary>Answer:</summary><p>
A

Explanation:

SSE-S3 uses managed keys and one of the strongest block ciphers available, AES-256, to secure your data at rest.

</p></details><hr>

### Question 50:

You have an application that allows people in very remote locations to store their files safely and securely. You need to leverage Amazon CloudFront’s globally distributed AWS Edge Locations so that as data arrives at an AWS Edge Location the data is routed to your Amazon S3 bucket over an optimized network path. Which service should you use?

- A. CloudFront Transfer Acceleration
- B. S3 Transfer Acceleration 
- C. S3 Multipart Upload
- D. CloudFront Multipart Upload

<details><summary>Answer:</summary><p>
B

Explanation:

Amazon S3 Transfer Acceleration enables fast, easy, and secure transfers of files over long distances between your client and your Amazon S3 bucket. Transfer Acceleration leverages Amazon CloudFront’s globally distributed AWS Edge Locations.

</p></details><hr>

### Question 51:

Which of the following protocols is not supported with an Elastic Load Balancer

- A. HTTP
- B. HTTPS
- C. RDS 
- D. SSH 

<details><summary>Answer:</summary><p>
CD

Explanation:

Amazon's ELB supports the following protocols - "HTTP, HTTPS, TCP, SSL"

</p></details><hr>

### Question 52:

CRR replicates every object-level upload that you make directly to your source bucket. Which of the following also forms a part of that replication?

- A. The object metadata 
- B. The object ACL's 
- C. The object's SSL certificate
- D. The object's checksum encryption data

<details><summary>Answer:</summary><p>
AB

Explanation:

CRR replicates every object-level upload that you directly make to your source bucket. The metadata and ACLs associated with the object are also part of the replication.

</p></details><hr>

### Question 53:

Can you use IPv6 with Amazon S3?

- A. Yes 
- B. Yes however you need IPv4 to IPv6 Translation Software
- C. Yes however you need IPv6 to IPv4 Translation Software
- D. No 

<details><summary>Answer:</summary><p>
A

Explanation:

Using IPv6 support for Amazon S3, applications can connect to Amazon S3 without needing any IPv6 to IPv4 translation software or systems.

</p></details><hr>

### Question 54:

You work for a genetics company that has extremely large datasets stored in S3. You need to minimize storage costs, while maintaining mandated restore times that depend on the age of the data. Data 30-59 days old must be available immediately, and data ≥ 60 days old must be available within 12 hours. Which two of the following options below should you consider?

- A. S3 - RRS
- B. S3 - IA 
- C. Glacier 
- D. CloudFront

<details><summary>Answer:</summary><p>
BC

Explanation:

You should use S3 - IA for the data that needs to be accessed immediately, and you should use Glacier for the data that must be recovered within 12 hours. S3 - RRS would not be suitable solution for irreplacable data, and CloudFront is a CDN service, not a storage solution.

</p></details><hr>

### Question 55:

How quickly can objects be restored from Glacier?

- A. Within 30 minutes
- B. Within 1 hour
- C. Within 2 hours
- D. Within 3 - 5 hours 

<details><summary>Answer:</summary><p>
D

Explanation:

You can expect most restore jobs initiated via the Amazon S3 APIs or Management Console to complete in 3-5 hours.

</p></details><hr>

### Question 56:

What is the minimum object size for S3 Standard?

- A. 1 KB
- B. 0 Bytes 
- C. 1 Byte
- D. 128 KB

<details><summary>Answer:</summary><p>
B

Explanation:

The miminum object size is 0 Bytes. Most often, this will be a "touched" file.

</p></details><hr>

### Question 57:

Your application stores your customers' sensitive passport information in S3. You are required by law to encrypt all data at rest. Company policy states that you must maintain control of your encryption keys. For ease of management however, you do not want to implement or maintain a client side encryption library. Which S3 encryption option should you use to secure your data at rest?

- A. SSE-S3
- B. SSE-C 
- C. SSE-KMS 
- D. Amazon S3 Encryption Client

<details><summary>Answer:</summary><p>
B

Explanation:

Use SSE-C if you want to maintain your own encryption keys, but don’t want to implement or leverage a client-side encryption library.

</p></details><hr>

### Question 58:

Which of the following are compute services with AWS?

- A. EC2 
- B. ECS 
- C. Lambda 
- D. Glacier

<details><summary>Answer:</summary><p>
ABC

Explanation:

EC2, ECS and Lambda are all AWS compute services.

</p></details><hr>

### Question 59:

You are a system administrator and you need to take a consistent snapshot of your EC2 instance. Your application holds large amounts of data in cache that is not written to disk automatically. What would be the best approach to taking an application consistent snapshot?

- A. Take a snapshot in real time using the EC2 API.
- B. Shutdown the EC2 instance and detach the EBS volume, then take the snapshot. 
- C. Take a snapshot using the AWS CLI.
- D. In the AWS console, take a snapshot and ensure that the "application consistent" check box is ticked.

<details><summary>Answer:</summary><p>
B

Explanation:

As you need an application consistent snapshot, your best option would be to shutdown the EC2 instance and detach the EBS volume, then take the snapshot.

</p></details><hr>

### Question 60:

Your application requires highly-available object storage, and must comply with EU privacy laws. As such, no data may be stored outside the EU. Which two of the following options should you consider?

- A. A single EC2 instance with an EBS volume provisioned in Eu-West-1. Put this EC2 instance behind an Autoscaling Group with a minimum target of 1.
- B. Use an S3 bucket in EU-West-1 
- C. Multiple EC2 instances with an EBS volume provisioned in US-EAST-1. These EC2 instances will use Autoscaling Group with a minimum target of 3, 1 per availability zone.
- D. Use an S3 bucket in EU-Central-1 

<details><summary>Answer:</summary><p>
BD

Explanation:

You should use an object based storage solution (such as S3) in European regions.

</p></details><hr>

