### Question 1:



- A. Enable CloudWatch on the ELB
- B. Enable Cloud Trail on the ELB 
- C. Enable Detailed Monitoring on the ELB when first creating the instance 
- D. Enable Cloud Audit on the ELB when first creating the instance

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 2:



- A. TRUE 
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 3:



- A. EC2 with EBS behind and Autoscaling Group with a minimum configuration of 2
- B. EC2 with EBS behind and Autoscaling Group with a minimum configuration of 1
- C. S3 - Static Website Hosting 
- D. CloudFront

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 4:



- A. TRUE 
- B. FALSE 

<details><summary>Answer:</summary><p>
A

Explanation:

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

</p></details><hr>

### Question 7:



- A. 30 seconds
- B. 1 minute 
- C. 5 minutes
- D. 10 minutes

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 8:



- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 9:



- A. Infrequent Access
- B. Lifecycle Management 
- C. Reduced Redundancy
- D. Glacier

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 10:



- A. CloudWatch
- B. CloudFront
- C. CloudTrail 
- D. CloudTracker

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 11:



- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 12:



- A. The names of the AZs are randomly applied, so 'eu-west-1b' is not the same location for all three accounts 
- B. You have incorrectly configured the cross account authentication policies in account C adding latency to those instances.
- C. Account C has been allocated to an older section of the Data Hall with slower networking.
- D. The instances for account C are on an overloaded Host. Stop all the Account C instances and then start them together so that they run an a new host.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 13:



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

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

</p></details><hr>

### Question 15:



- A. D2
- B. C4
- C. M3
- D. Z2 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 16:



- A. A single EC2 instance with an EBS volume provisioned as a secondary volume.
- B. S3 
- C. Glacier
- D. Route53

<details><summary>Answer:</summary><p>
B

Explanation:

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

</p></details><hr>

### Question 20:



- A. 99%
- B. 99.50%
- C. 99.95% 
- D. 100.00%

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 21:



- A. 1 KB
- B. 0 Bytes 
- C. 1 Byte
- D. 128 KB 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 22:



- A. Design the application to use multipart upload, so that the file is split in to multiple parts which are then uploaded simultaneously. 
- B. Require the users to use Direct Connect in order to use to application so as to maximize the upload bandwidth.
- C. Utilize S3 Transfer Acceleration. 
- D. Implement a third party CDN solution.

<details><summary>Answer:</summary><p>
AC

Explanation:

</p></details><hr>

### Question 23:



- A. Two buckets, 1 with CRR enabled on it (for the word files) and the other bucket without.
- B. Two buckets 1 with CRR enabled on it (for the JPGs and PDF's) and the other without. 
- C. One bucket and then enable CRR on just a subset of objects (such as JPGs and PDF's) uploaded by specifying prefixes. 
- D. Three buckets. 1 with CRR enabled on it for the JPG's, 1 with CRR enabled on it for the PDF's and 1 bucket just for the word files with no CRR enabled on it.

<details><summary>Answer:</summary><p>
C

Explanation:

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

</p></details><hr>

### Question 25:



- A. SSE-S3
- B. SSE-C
- C. SSE-KMS
- D. Amazon S3 Encryption Client 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 26:



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 27:



- A. S3 Transfer Acceleration
- B. Snowball 
- C. Direct Connect
- D. FTP

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 28:



- A. Amazon Linux
- B. Debian
- C. Ubuntu
- D. None of the above, all EC2 operating systems are supported by CloudWatch. 

<details><summary>Answer:</summary><p>
D

Explanation:

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

</p></details><hr>

### Question 30:



- A. Server Side Encryption Using S3 (SSE-S3) 
- B. Server Side Encryption with Customer-Provide Keys (SSE-C) 
- C. Client Side Encryption Using Amazon Provided Keys (CSE-AWS)
- D. Server Side Encryption Using KMS (SSE-KMS) 

<details><summary>Answer:</summary><p>
ABD

Explanation:

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

</p></details><hr>

### Question 32:



- A. Cluster GPU Instances
- B. High I/O instances 
- C. Dense Storage Instances
- D. Memory Optimized Instances

<details><summary>Answer:</summary><p>
B

Explanation:

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

</p></details><hr>

### Question 37:

True or False: You can use your existing Microsoft Windows Server licenses with an Amazon EC2 shared tenancy instance.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 38:



- A. 5 
- B. 10
- C. 15
- D. 20

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 39:



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

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

</p></details><hr>

### Question 41:



- A. 25
- B. 50
- C. 100 
- D. 200

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 42:



- A. Amazon Linux
- B. Ubuntu
- C. OSX 
- D. Windows Server

<details><summary>Answer:</summary><p>
C

Explanation:

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

</p></details><hr>

### Question 44:



- A. 24 hours 
- B. 48 hours
- C. 1 week
- D. 2 weeks 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 45:



- A. You are able to attach multiple EBS volumes to an EC2 instance. 
- B. You are able to attach multiple EC2 instances to an EBS Volume.
- C. It is possible to configure an Autoscaling Group to repair degraded EBS volumes, without the need to terminate the EC2 instances.
- D. It is possible to use Autoscaling with EBS, rather than EC2.

<details><summary>Answer:</summary><p>
A

Explanation:

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

</p></details><hr>

### Question 48:



- A. C4 
- B. M3
- C. D2
- D. R3

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 49:



- A. SSE-S3 
- B. SSE-C
- C. SSE-KMS 
- D. Amazon S3 Encryption Client

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 50:



- A. CloudFront Transfer Acceleration
- B. S3 Transfer Acceleration 
- C. S3 Multipart Upload
- D. CloudFront Multipart Upload

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 51:



- A. HTTP
- B. HTTPS
- C. RDS 
- D. SSH 

<details><summary>Answer:</summary><p>
CD

Explanation:

</p></details><hr>

### Question 52:



- A. The object metadata 
- B. The object ACL's 
- C. The object's SSL certificate
- D. The object's checksum encryption data

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 53:



- A. Yes 
- B. Yes however you need IPv4 to IPv6 Translation Software
- C. Yes however you need IPv6 to IPv4 Translation Software
- D. No 

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 54:



- A. S3 - RRS
- B. S3 - IA 
- C. Glacier 
- D. CloudFront

<details><summary>Answer:</summary><p>
BC

Explanation:

</p></details><hr>

### Question 55:



- A. Within 30 minutes
- B. Within 1 hour
- C. Within 2 hours
- D. Within 3 - 5 hours 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 56:



- A. 1 KB
- B. 0 Bytes 
- C. 1 Byte
- D. 128 KB

<details><summary>Answer:</summary><p>
B

Explanation:

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

</p></details><hr>

### Question 58:



- A. EC2 
- B. ECS 
- C. Lambda 
- D. Glacier

<details><summary>Answer:</summary><p>
ABC

Explanation:

</p></details><hr>

### Question 59:



- A. Take a snapshot in real time using the EC2 API.
- B. Shutdown the EC2 instance and detach the EBS volume, then take the snapshot. 
- C. Take a snapshot using the AWS CLI.
- D. In the AWS console, take a snapshot and ensure that the "application consistent" check box is ticked.

<details><summary>Answer:</summary><p>
B

Explanation:

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

</p></details><hr>

