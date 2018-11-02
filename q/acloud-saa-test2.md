### Question 1:

You are attempting to move data from one EBS volume to a duplicate volume in a separate region. Which of the following methods will do this best?

- A. Take a snapshot of the EBS volume and copy it to the desired region. 
- B. Allow a VPC peering connection to pull the data over.
- C. Move the data to S3 and enable cross-region replication.
- D. Use a Linux tool like rsync to sync the volume to the other region.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 2:

You have suggested moving your company's web servers to AWS, but your supervisor is concerned about cost. Which of the following deployments will give you the most scalable and cost-effective solution?

- A. An EC2 auto-scaling group that will expand and contract with demand 
- B. A solution that's built to run 24/7 at 100% capacity, using a fixed number of T2 Micro instances
- C. A hybrid solution that leverages on-premise resources
- D. None of the above

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 3:

You have an IO intensive database in your production environment that requires regular backups. You need to configure them in such a way so that when an automated backup is taken, it does not impact your production environment. What RDS option should you choose to help you accomplish this?

- A. Multi-AZ 
- B. Read Replicas 
- C. Use Redshift for your backup environment.
- D. Cross Region Failover

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 4:

Your company needs to run several monthly workloads that will each take several hours to complete. Although critical, these workloads can be stopped and restarted without adversely affecting the outcome of the job. Which pricing model would you use to deliver the most economical solution?

- A. On-demand instances
- B. Reserved instances
- C. Spot instances 
- D. Free-tier instances

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 5:

Your fleet of EC2 instances is running 100% of the time, and there is no reason to believe that the demand will decrease. What pricing model could you use to reduce costs?

- A. Special Instances
- B. Spot Instances
- C. On-demand instances
- D. Reserved instances 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 6:

Your existing on-premise servers rely on Memcached to provide memory object caching. If you were to move to AWS, how might you preserve this functionality?

- A. Install Memcached on EC2
- B. Elastic MapReduce
- C. ElastiCache 
- D. None of the above

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 7:

True or False: there is a cost associated with transferring from Amazon S3 to an EC2 instance in the same Region.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 8:

You have heavy load on your RDS database which is now the maximum available size possible. Which two of the following AWS technologies should you use to further ease the load?

- A. RDS Read Replica 
- B. RDS Multi-AZ
- C. ElastiCache 
- D. CloudFormation

<details><summary>Answer:</summary><p>
AC

Explanation:

</p></details><hr>

### Question 9:

You have a small database workloads with infrequent I/O. Which storage medium would the most cost-effective way to meet these requirements?

- A. Amazon RDS Provisioned IOPS (SSD) Storage
- B. Amazon RDS General Purpose (SSD) Storage
- C. Amazon RDS Magnetic Storage 
- D. Amazon RDS Cold Storage 

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 10:

You have a very heavily-trafficked Wordpress blog that has approximately 95% read traffic and 5% write traffic. You notice that the blog is getting slower and slower. You discover that the bottleneck is in your RDS instance. Which two of the following answers can improve your Wordpress blog's performance?

- A. Create a number of read replicas and update the connection string on your EC2 instances so that traffic is evenly shared amongst these new RDS instances. 
- B. Use Elasticache to cache the most commonly read posts of your Wordpress blog. 
- C. Create a secondary Multi-AZ database and run the queries off the secondary Multi-AZ database.
- D. Export the database to DynamoDB which has push button scaleability.

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 11:

True or False: You should store your Access Keys in an AMI.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 12:

You need to upgrade your RDS database to a larger instance class and you must minimize the amount of disruption to your business as much as possible. What should you do.

- A. Schedule the upgrade for a maintenance window during a time when you have the least customers possible. The production database should only be unavailable for a couple of minutes. 
- B. You do not need to worry: when upgrading an instance class, your database will not go off line.
- C. Do the upgrade using the AWS console and ensure the "do not reboot" option is checked when upgrading.
- D. Do the upgrade using the AWS CLI using the option --NOREBOOT

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 13:

Which of the following AWS services store data as key-value pairs?

- A. DynamoDB 
- B. EC2
- C. RDS
- D. S3 

<details><summary>Answer:</summary><p>
AD

Explanation:

</p></details><hr>

### Question 14:

You are running a production database using MySQL on RDS. From time to time, management asks you to run highly complex SQL queries with multiple table joins against the database. These queries often overwhelm your database, and the production environment is beginning to be affected. Which of the following would you recommend as a means of reducing the load on the database?

- A. Migrate the database to DynamoDB which will scale automatically in order to deal with the load.
- B. Use Route53 health checks to determine the current load on the database and if there is a minimum load , configure the health check to run the SQL queries.
- C. Create a secondary Multi-AZ database and run the queries off the secondary Multi-AZ database.
- D. Create a read replica of the database and run your reports against the read replica, rather than the production database. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 15:

Which of the following services allows you to have root level access to the underlying operating system

- A. EMR 
- B. EC2 
- C. RDS
- D. DynamoDB

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 16:

You've been tasked with the implementation of an offsite backup/DR solution. You'll only be responsible only for flat files and server backup. Which of the following would you include in your proposed solution (select all that apply.)?

- A. EC2
- B. Storage Gateway 
- C. Snowball 
- D. S3 

<details><summary>Answer:</summary><p>
BCD

Explanation:

</p></details><hr>

### Question 17:

You've enabled website hosting on a bucket called "aspiring-guru" in the us-west-2 Region. Which of the following is the URL that will be assigned to your website?

- A. aspiring-guru.s3-website-us-west-2.amazonaws.com 
- B. s3-website-us-west-2.aspiring-guru.amazonaws.com
- C. s3-website.aspiring-guru-us-west-2.amazonaws.com
- D. None of the above

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 18:

You are auditing your RDS estate and you discover an RDS production database that is not encrypted at rest. This violates company policy and you need to rectify this immediately. What should you do to encrypt the database as quickly and as easy as possible.

- A. Use the RDS Import/Export Wizard to migrate the unencrypted RDS instance across to a new encrypted database.
- B. Take a snapshot of your unencrypted DB Instance and then restore it making sure you select to encrypt the new copy. 
- C. Use AWS Database Migration Service
- D. Create a new DB Instance with encryption enabled and then manually migrate your data into it. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 19:

You need to develop an infrastructure that can be replicated and deployed in another AWS Region in a matter of minutes. Which AWS service might you use to build a reproducible, version-controlled infrastructure?

- A. EC2 AMIs with EBS snapshots
- B. Elastic Beanstalk
- C. CloudFormation 
- D. CloudWatch Template

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 20:

Your on-premise servers are running low on disk storage space, but your company is not yet ready for a complete move to the public cloud. You've been tasked with finding an interim storage solution that also offers backup and archiving capabilities. Which AWS service would you recommend to meet this immediate need?

- A. Snowball
- B. Storage Gateway with Gateway-Cached Volumes 
- C. DirectConnect
- D. Storage Gateway with Gateway-Stored Volumes. 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 21:

Your AWS environment contains several reserved EC2 instances dedicated to a project that has just been cancelled. You need to recoup the cost of these reserved instances, and you need to preserve the data for future use. What can you do to minimize charges for these instances?

- A. Take snapshots of the EBS volumes and terminate the instances. 
- B. Contact AWS and ask them to release you from your Reserved Instance purchase.
- C. Stop the instances and retain them for future use.
- D. Sell the unused instances on the AWS Reserved Instance Marketplace. 

<details><summary>Answer:</summary><p>
AD

Explanation:

</p></details><hr>

### Question 22:

You must to encrypt all incoming and outgoing traffic between your servers and your customers. Your fleet of EC2 instances lives inside a public subnet and behind an elastic load balancer. Your application is very CPU intensive, and you want to minimize the processing load these EC2 instances must bear. What should you do?

- A. Install the SSL certificates on each EC2 instance and allow them to do the encryption/decryption with your customers.
- B. Install the SSL certificates on your ELB's so that there is less load on the EC2 instances. 
- C. Use API Gateway to offload the SSL certificate, reducing the amount of load on both your ELB and EC2 instances.
- D. Configure a NAT and install the EC2 instance on that NAT so that you offload SSL termination to a third party EC2 instance and not your production environment.

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 23:

The company you work for is considering a move to AWS, but they are concerned that their current, 50Mbps connection will not be able to handle the 100 TB of data that need to be migrated without causing unacceptable downtime. As their solutions architect, which AWS service would you recommend to move this data?

- A. Snowball 
- B. S3 with Transfer Acceleration
- C. AWS DirectConnect
- D. AWS Storage Gateway

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 24:

One of your junior developers needs access to an Elastic Load Balancer in your custom VPC. This is the first and only time he will need access to AWS services. Which of the following choices is the most secure way to grant this access?

- A. Create a new IAM user with the required credentials. 
- B. Let them log in with Admin credentials and change the Admin password when he is finished.
- C. Add that developer to a Group with the requisite access.
- D. None of the above

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 25:

Which of the following are true about Amazon S3-RRS?

- A. S3-RRS offers 99.99% availability. 
- B. S3-RRS offers 99.999999999 durability
- C. S3-RRS offers 99.99% durability. 
- D. S3-RRS is most often used with reproducible objects. 

<details><summary>Answer:</summary><p>
ACD

Explanation:

</p></details><hr>

### Question 26:

The customer service organization at your company just told you that a client’s purchase from your website was processed twice. Your order process involves EC2 instances processing messages from an SQS queue. What changes might you make to ensure this does not happen again?

- A. Rewrite the order-processing workflow to use SWF, rather than SQS. 
- B. Increase the visibility timeout on the SQS queue
- C. Switch to long-polling
- D. Manually delete the order after processing.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 27:

True or False: By default, Amazon RDS enables automated backups of your DB instance with a 1-day retention period.

- A. TRUE 
- B. FALSE 

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 28:

It is best practice to use Access Keys whenever possible, rather than IAM Roles.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 29:

True or False: Availability Zones in a given Region are connected by low-latency links, facilitating the development of fault-tolerant, high-availability applications.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 30:

You have a custom VPC for your organization. You discover that one of your developers has created an RDS instance in the default VPC and this is in violation of company policy. You need to create this RDS instance inside your custom VPC with as little effort as possible. What should you do?

- A. Use the RDS Import/Export Wizard to Migrate the RDS instance across to the custom VPC
- B. Use AWS Database Migration Service
- C. Take a snapshot of your DB Instance in the default VPC and restore it to VPC by specifying the DB Subnet Group you want to use in your custom VPC. 
- D. Use the command "aws rds mv dbname < VPC"

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 31:

You are working for a real estate company and you need to be able to record configuration changes to Amazon RDS DB Instances, DB Subnet Groups, DB Snapshots, DB Security Groups, and Event Subscriptions. What AWS service should you use to achieve this?

- A. CloudTrail 
- B. CloudWatch
- C. CloudAudit
- D. AWS Config 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 32:

Which AWS service should you use to host MySQL, MariaDB, Oracle, SQL Server, or PostgreSQL database where you do not need to manage the underlying operating system?

- A. DynamoDB
- B. RDS 
- C. Aurora
- D. EC2 with EBS

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 33:

You have an RDS database that has moderate I/O requirements. Which storage medium would be best to accommodate these requirements?

- A. Amazon RDS Provisioned IOPS (SSD) Storage
- B. Amazon RDS General Purpose (SSD) Storage 
- C. Amazon RDS Magnetic Storage
- D. Amazon RDS Cold Storage

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 34:

The large manufacturing company you work for is interested in moving their production estate to AWS. They run a Joomla store which utilizes MySQL on the back end. Currently, they also use clustered MySQL databases in an active/passive configuration at a single site. By moving to AWS they want an active/passive configuration across 2 geographically distinct locations, with automatic failover between the two. As their solutions architect, which of the following RDS options should you recommend?

- A. Multi-AZ 
- B. Read Replicas
- C. Cross Region Replication
- D. Cross Region Failover

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 35:

You have a production application that is on the largest RDS instance possible, and you are still approaching CPU utilization bottlenecks. You have implemented read replicas, ElastiCache and even CloudFront and S3 to cache static assets, but you are still bottlenecking. What should be your next step?

- A. You should implement database partitioning and spread your data across multiple DB Instances. 
- B. You have reached the limits of public cloud. You should get a dedicated database server and host this locally within your own data center.
- C. You should consider using RDS Multi-AZ and using the secondary AZ nodes as read only nodes to further offset load.
- D. You should provision a secondary RDS instance and then implement and ELB to spread the load between the two RDS instances.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 36:

The insurance company you work for is implementing new IT security policies for all RDS instances. In the future, you will need to perform both security analyses and operational troubleshooting on your RDS estate. As such, you will need a history of all RDS API calls made on your account. What AWS service should you use to achieve this?

- A. CloudAudit
- B. CloudWatch
- C. CloudFront
- D. CloudTrail 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 37:

What are the two different ways of automating your RDS backups?

- A. Automated Backups 
- B. Using S3
- C. Automated Snapshots 
- D. Using Data Pipeline

<details><summary>Answer:</summary><p>
AC

Explanation:

</p></details><hr>

### Question 38:

What type of replication is supported by read replica instances?

- A. synchronous replication
- B. asynchronous replication 
- C. continous replication
- D. sequential replication

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 39:

Which three of the following statements are not true?

- A. EBS Volumes can be attached to multiple instance simultaneously. 
- B. EBS Volumes cannot be attached to an EC2 instance in another AZ.
- C. EBS Volumes are ephemeral. 
- D. EBS Volumes can be attached to an EC2 instance in another AZ 

<details><summary>Answer:</summary><p>
ACD

Explanation:

</p></details><hr>

### Question 40:

You need to configure a new subnet in your VPC for a database cluster you are building. The subnet will never need more than six IP addresses. Which of the following is the best choice for this subnet?

- A. A /28 private subnet 
- B. A /28 public subnet
- C. A /16 public subnet
- D. A /16 private subnet

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 41:

An Availability Zone comprises multiple Regions

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 42:

Which three of the following events would cause Amazon RDS to initiate a failover to the standby replica?

- A. Loss of availability in primary Availability Zone 
- B. Loss of network connectivity to primary 
- C. Compute unit failure on primary 
- D. Storage failure on secondary

<details><summary>Answer:</summary><p>
ABC

Explanation:

</p></details><hr>

### Question 43:

What is the minimum size of an SSD EBS Volume?

- A. 1byte
- B. 1GiB 
- C. 1MB
- D. 1GB

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 44:

True or False: An application designed for fault tolerance and high availability should almost always be built across multiple Availability Zones

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 45:

You are auditing your company's RDS estate, and you discover a database that is in a single Availability Zone – a violation of company policy. You decide to convert this to a multi-AZ deployment. Which three of the following things will happen?

- A. A snapshot of your primary instance is taken 
- B. Synchronous replication is configured between primary and standby instances 
- C. A new standby instance is created in a different Availability Zone, from the snapshot 
- D. asynchronous replication is configured between primary and standby instances

<details><summary>Answer:</summary><p>
ABC

Explanation:

</p></details><hr>

### Question 46:

True or False: In addition to hosting domains, Route 53 serves as a domain registrar.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 47:

Your SQL server requires a specific type of collation and some unique third party tools installed on it. You will need access to the underlying operating system for management and monitoring of these third party tools. However, you'd like to keep the overall amount of management to a minimum. Which AWS service would best suit your needs?

- A. RDS with SQL Server
- B. DynamoDB
- C. SQL server installed on EC2 with EBS 
- D. ElasticCache

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 48:

True or False: It's possible to have a Multi-AZ copy of your read replica?

- A. TRUE 
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 49:

Your data warehousing company has a number of different RDS instances. You have a medium size instance with automated backups switched on and a retention period of 1 week. One of your staff carelessly deletes this database. Which two of the following apply.

- A. The automatic backups are deleted when the instance is deleted. 
- B. The automated backups will be retained for 2 weeks and then deleted after the 2 weeks has expired.
- C. A final snapshot will be created upon deletion automatically. 
- D. A final snapshot MAY have been created when the instance was deleted, depending on whether the 'SkipFinalSnapshot' parameter was set to 'False.' 

<details><summary>Answer:</summary><p>
AD

Explanation:

</p></details><hr>

### Question 50:

True or False: A Region is another name for an Edge Location.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 51:

You've been tasked with replicating your production VPC in another region for disaster recovery purposes. Part of your environment relies on EC2 instances with preconfigured software. What steps would you take to configure the instances in another region?

- A. Create AMIs of the instances and deploy them in the new Region
- B. Create AMIs of the instances and copy them to the new Region for deployment. 
- C. Write the IAM permissions for the new Region to use the AMIs from the original Region.
- D. None of the above

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 52:

From the command line, which of the following should you run to get the public hostname of an EC2 instance?

- A. curl http://169.254.169.254/latest/meta-data/public-hostname 
- B. curl http://254.169.254.169/latest/user-data/public-hostname
- C. curl http://254.169.254.169/latest/meta-data/public-hostname
- D. curl http://169.254.169.254/latest/user-data/public-hostname

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 53:

Amazon RDS supports which of the following databases:

- A. MariaDB 
- B. MySQL 
- C. DB2
- D. Sybase

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 54:

True or False: EBS Volumes are hard-disks in the cloud.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 55:

Which database engines support read replicas?

- A. SQL Server
- B. Oracle 
- C. MySQL 
- D. PostgreSQL 

<details><summary>Answer:</summary><p>
CD

Explanation:

</p></details><hr>

### Question 56:

You've been tasked with setting up an S3 solution to store large amounts of critical data. With high availability and fault-tolerance in mind, what further safeguards should you implement to protect your data in the event that an entire AZ was lost to a natural (or similarly catastrophic) disaster?

- A. Nothing: S3 is a global service and is not affected by the loss of an availability zone. 
- B. Use lifecycle policies to copy the data to Glacier.
- C. Deploy a gateway-stored AWS Storage Gateway.
- D. None of the above

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 57:

What is the maximum retention period for RDS automated backups?

- A. 7 days
- B. 2 weeks
- C. 1 month
- D. 35 days 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 58:

Which two of the following characterize a scalable and reliable solution on AWS?

- A. A scalable application will be resilient and operationally efficient 
- B. A scalable solution applies elasticity at the expense of cost. 
- C. A scalable solution will decrease in cost at scale. 
- D. A scalable solution applies elasticity, but is cost-agnostic.

<details><summary>Answer:</summary><p>
AC

Explanation:

</p></details><hr>

### Question 59:

You have an RDS database that has high performance OLTP workloads. Which storage medium would be best to accommodate these requirements?

- A. Amazon RDS Provisioned IOPS (SSD) Storage 
- B. Amazon RDS General Purpose (SSD) Storage
- C. Amazon RDS Magnetic Storage
- D. Amazon RDS Cold Storage

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 60:

What type of replication is supported by Multi-AZ RDS instances?

- A. synchronous replication 
- B. asynchronous replication
- C. continuous replication
- D. sequential replication

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

