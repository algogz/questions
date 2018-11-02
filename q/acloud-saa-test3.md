### Question 1:

Using the AWS Server Migration Service, what's the maximum number of VMWare VMs that can be migrated concurrently?

- A. 10
- B. 25
- C. 50 
- D. 100 

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 2:

True or False: S3 provides read-after-write consistency for overwrite PUTS and DELETES.

- A. TRUE 
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 3:

Which of the following is an invalid VPC pairing configuration?

- A. You have a VPC peering connection between VPCs A and B. They are in the same AWS account, and they do not have overlapping CIDR blocks.
- B. VPC A has peering connections to VPCs B and C. All three VPCs are in the same AWS account, and there are no overlapping CIDR blocks.
- C. You have a VPC peering connection between VPC A and VPC B. VPC A also has a VPN connection to a corporate network. You use VPC A to extend the peering relationship to exist between VPC B and the corporate network so that traffic from the corporate network can directly access VPC B by using the VPN connection to VPC A. 
- D. You have peered three VPCs in a full-mesh configuration. The VPCs are in the same AWS account and do not overlapping CIDR blocks.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 4:

Your application's usage peaks at 90% during the hours of 9 AM and 10 AM everyday. All other hours require only 10% of the peak resources. What is the best way to scale your application so you're only paying for max resources during peak hours?

- A. Proactive event-based scaling
- B. Proactive cyclic scaling 
- C. Reactive event-based scaling
- D. Reactive cyclic scaling

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 5:

Your image manipulation application allows users take a picture, upload it to your app, and request filters to be added to the image. You need to decouple the application so your users are not waiting for the image processing to take place. How would you go about doing this?

- A. Use Lambda to process the images. 
- B. Use S3 to store the images and EC2 to process the requests.
- C. Use Amazon SQS to store the requests using metadata and JSON in the message, use S3 to store the image, and Auto Scaling to determine when to fire off more worker instances based on queue size. 
- D. Integrate with DynamoDB to allow messages to be sent back and forth between worker instances and EC2 instances.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 6:

True or False: For a successful cross-region replication of your S3 bucket, versioning must be enabled on both the source and target buckets.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 7:

Contractual requirements mandate the use of AWS CloudHSM as an encryption solution. Application performance is a secondary, but important, concern. Where within your AWS infrastructure should you place the HSM appliances?

- A. To increase security, you should place the CloudHSM appliances in their own, private subnet. 
- B. To increase security, you should place the HSM appliances on your side of the VPN that connects to AWS.
- C. Locating HSM appliances near your EC2 instances decreases network latency, which improves application performance. 
- D. To increase performance, you should locate the HSM as close to the majority of your customers as is possible.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 8:

An AWS VPC allows you to:

- A. Forget about security: AWS does it all for you.
- B. Provision unlimited S3 resources 
- C. Connect your cloud resources to your own IPSec VPN connections. 
- D. None of the above.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 9:

True or False: Multifactor Authentication is required to delete objects from an S3 bucket.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 10:

True or False: you can write objects directly to an edge location.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 11:

Which of the following statements about Amazon SQS is true?

- A. SQS will deliver your message at least once, but cannot guarantee that it will not create duplicates of that message. 
- B. SQS will deliver your message at least once in FIFO order.
- C. SQS will deliver your message at least once, and guarantees that it will not create duplicates of that message.
- D. SQS will deliver your message at least once, but cannot guarantee the order in which the messages will be delivered. 

<details><summary>Answer:</summary><p>
AD

Explanation:

</p></details><hr>

### Question 12:

True or False: You can attach more than one EC2 instance to an AWS Elastic Block Store volume.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 13:

Which of the following statements is FALSE regarding the role of a bastion host?

- A. A bastion host should be protected in a private subnet. 
- B. A bastion host is used to SSH into an EC2 instance.
- C. As a bastion host is exposed to the Internet, it should be hardened.
- D. A bastion host sits outside a private subnet and is used as a secure gateway to that internal network.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 14:

You've been tasked with the creation of a highly available website that serves static content from EC2 instances. Which of the following is not a requirement to accomplish this goal?

- A. Multiple subnets
- B. An auto-scaling group
- C. An SQS queue 
- D. A multi-AZ deployment

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 15:

True or False: you can use IAM policies to deny the Root account access to EC2 instances.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 16:

After setting up a VPC peering connection between your VPC and that of your clients, the client requests to be able to send traffic between instances in the peered VPCs using private IP addresses. What must you do to make this possible?

- A. Add a route to a Route Table that's associated with your VPC. 
- B. Establish a private peering connection.
- C. Add your instance and the client's instance to a Placement Group.
- D. Use an IPSec tunnel

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 17:

You are trying to establish a VPC peering connection with another VPC, and you discover that there seem to be a lot of limitations and rules when it comes to VPC peering. Which of the following is not a VPC pairing limitation or rule?

- A. You cannot have more than one VPC peering connection between the same VPCs at the same time.
- B. You cannot create a VPC pairing connection between VPCs in different regions.
- C. A placement group cannot span peered VPCs. 
- D. You cannot create a VPC pairing connection between VPCs with matching or overlapping CIDR blocks. 

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 18:

Your customer is a healthcare company with strict compliance and auditing requirements. As you use AWS to architect the application environment, which of the following services might you use to ensure compliance with their strict requirements?

- A. S3 with Versioning enabled
- B. Multi factor authentication
- C. SSE-S3
- D. CloudTrail 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 19:

What determines the cost of using CloudFormation templates?

- A. The published rate of $.10 per template per month
- B. The resources the AWS infrastructure uses to build your environment
- C. There is a cost for CloudFormation only after you have exceeded the 20 free templates you are allowed per month.
- D. There is no cost to using CloudFormation, but you are charged for the resources the template builds. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 20:

To maintain compliance with HIPPA, all healthcare-related data being stored on Amazon S3 needs to be encrypted at rest. Assuming S3 is being used for storing the data, which two of the following are the preferred methods of encryption?

- A. Enable Server Side Encryption on your S3 bucket. S3 automatically applies AES-256 encryption. 
- B. Encrypt the data locally using your own encryption keys and then transfer the encrypted data to S3. 
- C. Store the data on encrypted EBS volumes.
- D. Store the data in S3 as EBS snapshots.

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 21:

You create an SQS queue and test it by creating a simple application polls the queue for messages. After a message is retrieved, the application should delete it. You create three test messages in your SQS queue and discover that messages 1 and 3 are quickly deleted, but message 2 has remained in the queue. Which two of the following could account for your findings?

- A. Message 2 is invalid.
- B. Your application uses short-polling. 
- C. SQS cannot guarantee that messages are retrieved in first-in, first-out (FIFO) order. 
- D. The permissions on message 2 were incorrectly written.

<details><summary>Answer:</summary><p>
BC

Explanation:

</p></details><hr>

### Question 22:

Your company is moving their entire 20 TB data warehouse to the cloud. With your current bandwidth, it would take 2 months to transfer the data. Which service would you use to quickly get your data into AWS?

- A. AWS Snowball 
- B. AWS DirectConnect
- C. Amazon S3 Data Service
- D. Amazon Multipart Upload

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 23:

Your company provides an online image recognition service that uses SQS to decouple system components. Your application polls the image queue as often as possible to maximize end-to-end throughput. However, you notice that polling in tight loops is burning CPU cycles and increasing costs with empty responses. How can you reduce the number of empty responses?

- A. Enable long polling by setting the ReceiveMessageWaitTimeSeconds to a number > 0 
- B. Enable short polling by setting ReceiveMessageWaitTime = 0.
- C. Enable short polling by setting ReceiveMessageWaitTime > 0.
- D. Use AutoScaling to increase the number of instances polling the queue.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 24:

Which two of the following AWS Services were introduced at re:Invent 2016

- A. Lex 
- B. Dax
- C. Polly 
- D. Molly

<details><summary>Answer:</summary><p>
AC

Explanation:

</p></details><hr>

### Question 25:

True or False: Amazon SQS guarantees that each message will be delivered at least once, but cannot guarantee that a message will not be delivered multiple times.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 26:

When reviewing Auto Scaling events, it is noticed that an application is scaling up and down multiple times per hour. What design change could you make to optimize cost while preserving elasticity?

- A. Add a Provisioned IOPS volume to the instance.
- B. Increase the number of instances in the Auto Scaling group.
- C. Change the Launch Configuration to use a larger instance type.
- D. Change the scale-down CloudWatch metric to a higher threshold. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 27:

You've been tasked with architecting a highly available application. After building the initial environment, you've discovered that your current security group configuration does not include a port you need for certain traffic. After adding the port to the appropriate security group, how long will it take for your changes to take effect, allowing your application to function correctly?

- A. It usually takes a couple of minutes for these changes to take effect.
- B. Changes to a security group take effect as soon as they are saved. 
- C. Changes will take effect immediately upon reboot of the EC2 instance in question.
- D. 5 minutes.

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 28:

When selecting an EC2 instance type for your application, it's important to know which two of the following?

- A. The required number of I/O operations 
- B. The memory requirements 
- C. The location from which most traffic comes
- D. The peak expected usage

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 29:

What is the maximum size of a general-purpose SSD EBS volume?

- A. 16TiB 
- B. 2TiB
- C. 4GB
- D. 2TiB

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 30:

Your AWS environment contains several on-demand, EBS-backed EC2 instances dedicated to a project that has just been cancelled. Your supervisor does not want to incur charges for these on-demand instances, but also does not want to lose the data just yet because there is a chance the project may be revived in the next few days. What should you do to minimize charges for these instances in the meantime?

- A. Stop the instances as soon as possible. 
- B. Terminate the instances.
- C. Take snapshots of the EBS volumes and sell the instances on the In-Demand Instance Marketplace.
- D. Explain your situation to AWS Support and ask them to hold your instances for you.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 31:

The AMI ID used in an AutoScaling policy is specified in the_____.

- A. Launch configuration 
- B. AutoScaling group
- C. AutoScaling Policy
- D. Security Group

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 32:

You are testing an application that uses EC2 instances to poll an SQS queue. At this stage of testing, you have verified that the EC2 instances can retrieve messages from the queue, but your coworkers are complaining about not being able to manually retrieve any messages from the queue from their on-premises workstations. What is the most likely source of this problem?

- A. SQS queues accept traffic only from within AWS.
- B. Your coworkers do not have permission to access the SQS queue. 
- C. It's not possible to poll an SQS queue manually.
- D. Short polling is occasionally leaving messages behind.

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 33:

You've been tasked with migrating an on-premise application architecture to AWS. During the design process, you give consideration to current on-premise security and identify the security attributes you are responsible for on AWS. Which of the following does AWS provide for you as part of the shared responsibility model?

- A. Virtualization Infrastructure 
- B. Physical network infrastructure 
- C. Instance security
- D. User access to the AWS environment 

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 34:

You need to find both the Public and Private IP addresses of an instance. Which of the following URLs should you query?

- A. http://169.254.169.524/latest/user-data/
- B. http://169.254.169.254/latest/user-data/
- C. http://169.254.169.524/latest/meta-data/
- D. http://169.254.169.254/latest/meta-data/ 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 35:

Which of the following will transpire when an EC2 instance with an associated Elastic IP is stopped and started?

- A. The underlying host for the instance will be changed. 
- B. All data on instance-store devices will be lost 
- C. The Elastic Network Interface will be detached.
- D. The Elastic IP will be disassociated from the instance

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 36:

What is the minimum size of an S3 object?

- A. 1 bit
- B. 1 byte
- C. 0 bytes 
- D. 1 KB

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 37:

True or False: When a snapshot is being taken against an EBS volume, the volume becomes unavailable and the instance no longer has the ability to communicate with the EBS volume until the snapshot is complete.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 38:

Your company requires that all the data on your EBS-backed EC2 volumes be encrypted. How would you go about doing this?

- A. You cannot enable EBS encryption on a specific volume.
- B. AWS allows you to encrypt an EBS volume at the time of creation. 
- C. Encryption is done at the OS layer.
- D. None of the above.

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 39:

As CloudWatch monitors RDS, it provides which of the following metrics by default?

- A. Database-visible metrics such as the number of users
- B. Database-visible metrics such as memory usage
- C. The number of failed transaction requests
- D. The number of current connections to the database 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 40:

If an instance belonging to an Elastic Load Balancer fails its health check, what will the ELB do?

- A. The ELB will de-register the instance and stop sending traffic to it. 
- B. Unfortunately, the ELB will continue to send the unhealthy instance traffic until the instance is terminated.
- C. ELB will tell Auto Scaling to launch a new instance.
- D. The ELB will launch a new instance.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 41:

Elasticity is a fundamental property of the cloud. Which of the following best describes elasticity?

- A. The ability to deploy managed services into your environment.
- B. The power to increase the number of resources at your hands at the click of a mouse.
- C. The power to scale resources both up and down with changes in demand. 
- D. The ability to manually deploy instances quickly in response to events.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 42:

True or False: AutoScaling is a tool used to build elastic, self-healing applications.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 43:

What is the Well Architected Framework?

- A. A set of questions that you can use to evaluate how well your architecture is aligned to AWS practices. 
- B. A guide to passing your Solutions Architect - Associate exam.
- C. A guide to building an on-premise network compatible with AWS services.
- D. A checklist used to evaluate the availability of your applications

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 44:

To protect S3 data from accidental overwrites and deletes, you should do which of the following?

- A. Allow only MFA access
- B. Use a bucket policy to disable deletes from S3
- C. Enable versioning on the bucket. 
- D. Access S3 only from signed URLs.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 45:

You manage an application that uses EC2 instances and SQS to process requests from end users. There are no known issues with your application, but your supervisor is concerned about the cost of the AWS resources it uses. Which of the following would not help address that concern?

- A. Use AutoScaling to adjust the number of EC2 instances according to demand from SQS.
- B. Increase the visibility timeout for messages in the SQS queue. 
- C. Decrease the size of SQS messages to 50KB. 
- D. Switch from short polling to long polling.

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 46:

You wonder why a SWF workflow you created has not made any progress in the last three weeks. What is the most likely explanation for the workflow’s behavior?

- A. The workflow has exceeded the maximum 90-day lifespan of an SWF workflow.
- B. SWF does not support tasks located outside of AWS, so you will need to remove those tasks from your on-premise servers.
- C. SWF is awaiting human input from a task you assigned to a colleague. 
- D. The last task has exceeded SWF's 14-day task execution time.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 47:

True or False: There is no cost associated with removing cached objects from a CDN Edge Location.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 48:

An EC2 instance retrieves a message from an SQS queue, begins processing the message, then crashes. What happens to the message?

- A. When the message visibility timeout expires, the message becomes available for processing by other EC2 instances. 
- B. It remains in the queue in a locked state until the EC2 instance comes back online.
- C. When the message timeout expires, the message is duplicated, the original message is archived, and the duplicate becomes available for processing.
- D. To prevent corruption, the message is deleted.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 49:

True or False: You cannot attach more than one EC2 instance to an AWS Elastic Filesystem.

- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 50:

True or False: AutoScaling groups are not intended to handle sudden spikes in traffic. Rather, they are intended to allow your applications to grow elastically as load increases over a short period of time.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 51:

What is the "first-byte latency" when retrieving data from Glacier?

- A. 1 hour
- B. 2 hours
- C. 3-5 hours 
- D. > 5 hours

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 52:

Which of the following is not a pillar of the AWS Well Architected Framework?

- A. Cost Optimization
- B. Performance Efficiency 
- C. Availability 
- D. Security

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 53:

You've been tasked with the creation of a highly-available, decoupled web application. Which of the following will not aid in that effort?

- A. An Elastic Load Balancer that sends web traffic to instances with the least latency.
- B. An SQS queue that allows secondary EC2 instances to process jobs dropped by the primary instance.
- C. An AutoScaling group that ensures a self-healing application.
- D. IAM credentials on the primary EC2 instance that allow it to modify the SQS queue. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 54:

After migrating an application architecture from on-premise to AWS, you will not be responsible for the ongoing maintenance of which two of the following services.

- A. Elastic Beanstalk 
- B. EC2
- C. RDS 
- D. DynamoDB 

<details><summary>Answer:</summary><p>
CD

Explanation:

</p></details><hr>

### Question 55:

Your company wants to begin automated backups of the EBS volumes that back their EC2 instances. The durability of the backed-up data is key. Which of the following solutions would you implement and why?

- A. Set the lifecycle policy on the EBS Volume to back it up to Glacier 
- B. Configure your Storage Gateway as "Gateway Stored" and store the backups on premise.
- C. Write a cron job that compresses the volume, and use the CLI to copy it to S3.
- D. Write a cron job that uses the AWS CLI to take a snapshot of production EBS volumes. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 56:

True or False: Data stored on EBS volumes is automatically and redundantly stored in multiple physical volumes in the same availability zone as part of the normal operations of the EBS service at no additional charge.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 57:

You have chosen to use S3-RRS with your cloud application. Which limitations have you considered in doing so?

- A. RRS requires supplementary Access Control Lists.
- B. RRS is available only in the US-STANDARD region.
- C. RRS has a 4-hour data recovery time.
- D. RRS offers only 99.99% durability, so you have to design your application to re-create any objects that may be lost. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 58:

True or False: To prevent in-flight tampering, all requests sent with API keys over a REST or Query API should be sent via HTTPS.

- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 59:

Which of the following services allows you to access the service's underlying operating system?

- A. DynamoDB
- B. EMR 
- C. RDS
- D. ElasticBeanstalk 

<details><summary>Answer:</summary><p>
BD

Explanation:

</p></details><hr>

### Question 60:

Which of the following statements are true?

- A. S3-Standard provides 11-nines durability. 
- B. S3-Standard provides 11-nines availability
- C. S3-RRS provides 99.99% durability 
- D. S3-Standard provides 99.99% availability. 

<details><summary>Answer:</summary><p>
ACD

Explanation:

</p></details><hr>

