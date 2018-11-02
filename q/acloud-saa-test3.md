### Question 1:



- A. 10
- B. 25
- C. 50 
- D. 100 

<details><summary>Answer:</summary><p>
C

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



- A. You have a VPC peering connection between VPCs A and B. They are in the same AWS account, and they do not have overlapping CIDR blocks.
- B. VPC A has peering connections to VPCs B and C. All three VPCs are in the same AWS account, and there are no overlapping CIDR blocks.
- C. You have a VPC peering connection between VPC A and VPC B. VPC A also has a VPN connection to a corporate network. You use VPC A to extend the peering relationship to exist between VPC B and the corporate network so that traffic from the corporate network can directly access VPC B by using the VPN connection to VPC A. 
- D. You have peered three VPCs in a full-mesh configuration. The VPCs are in the same AWS account and do not overlapping CIDR blocks.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 4:



- A. Proactive event-based scaling
- B. Proactive cyclic scaling 
- C. Reactive event-based scaling
- D. Reactive cyclic scaling

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 5:



- A. Use Lambda to process the images. 
- B. Use S3 to store the images and EC2 to process the requests.
- C. Use Amazon SQS to store the requests using metadata and JSON in the message, use S3 to store the image, and Auto Scaling to determine when to fire off more worker instances based on queue size. 
- D. Integrate with DynamoDB to allow messages to be sent back and forth between worker instances and EC2 instances.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 6:



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



- A. Forget about security: AWS does it all for you.
- B. Provision unlimited S3 resources 
- C. Connect your cloud resources to your own IPSec VPN connections. 
- D. None of the above.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 9:



- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 10:



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 11:



- A. SQS will deliver your message at least once, but cannot guarantee that it will not create duplicates of that message. 
- B. SQS will deliver your message at least once in FIFO order.
- C. SQS will deliver your message at least once, and guarantees that it will not create duplicates of that message.
- D. SQS will deliver your message at least once, but cannot guarantee the order in which the messages will be delivered. 

<details><summary>Answer:</summary><p>
AD

Explanation:

</p></details><hr>

### Question 12:



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



- A. Multiple subnets
- B. An auto-scaling group
- C. An SQS queue 
- D. A multi-AZ deployment

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 15:



- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 16:



- A. Add a route to a Route Table that's associated with your VPC. 
- B. Establish a private peering connection.
- C. Add your instance and the client's instance to a Placement Group.
- D. Use an IPSec tunnel

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 17:



- A. You cannot have more than one VPC peering connection between the same VPCs at the same time.
- B. You cannot create a VPC pairing connection between VPCs in different regions.
- C. A placement group cannot span peered VPCs. 
- D. You cannot create a VPC pairing connection between VPCs with matching or overlapping CIDR blocks. 

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 18:



- A. S3 with Versioning enabled
- B. Multi factor authentication
- C. SSE-S3
- D. CloudTrail 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 19:



- A. The published rate of $.10 per template per month
- B. The resources the AWS infrastructure uses to build your environment
- C. There is a cost for CloudFormation only after you have exceeded the 20 free templates you are allowed per month.
- D. There is no cost to using CloudFormation, but you are charged for the resources the template builds. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 20:



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



- A. AWS Snowball 
- B. AWS DirectConnect
- C. Amazon S3 Data Service
- D. Amazon Multipart Upload

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 23:



- A. Enable long polling by setting the ReceiveMessageWaitTimeSeconds to a number > 0 
- B. Enable short polling by setting ReceiveMessageWaitTime = 0.
- C. Enable short polling by setting ReceiveMessageWaitTime > 0.
- D. Use AutoScaling to increase the number of instances polling the queue.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 24:



- A. Lex 
- B. Dax
- C. Polly 
- D. Molly

<details><summary>Answer:</summary><p>
AC

Explanation:

</p></details><hr>

### Question 25:



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 26:



- A. Add a Provisioned IOPS volume to the instance.
- B. Increase the number of instances in the Auto Scaling group.
- C. Change the Launch Configuration to use a larger instance type.
- D. Change the scale-down CloudWatch metric to a higher threshold. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 27:



- A. It usually takes a couple of minutes for these changes to take effect.
- B. Changes to a security group take effect as soon as they are saved. 
- C. Changes will take effect immediately upon reboot of the EC2 instance in question.
- D. 5 minutes.

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 28:



- A. The required number of I/O operations 
- B. The memory requirements 
- C. The location from which most traffic comes
- D. The peak expected usage

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 29:



- A. 16TiB 
- B. 2TiB
- C. 4GB
- D. 2TiB

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 30:



- A. Stop the instances as soon as possible. 
- B. Terminate the instances.
- C. Take snapshots of the EBS volumes and sell the instances on the In-Demand Instance Marketplace.
- D. Explain your situation to AWS Support and ask them to hold your instances for you.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 31:



- A. Launch configuration 
- B. AutoScaling group
- C. AutoScaling Policy
- D. Security Group

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 32:



- A. SQS queues accept traffic only from within AWS.
- B. Your coworkers do not have permission to access the SQS queue. 
- C. It's not possible to poll an SQS queue manually.
- D. Short polling is occasionally leaving messages behind.

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 33:



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



- A. The underlying host for the instance will be changed. 
- B. All data on instance-store devices will be lost 
- C. The Elastic Network Interface will be detached.
- D. The Elastic IP will be disassociated from the instance

<details><summary>Answer:</summary><p>
AB

Explanation:

</p></details><hr>

### Question 36:



- A. 1 bit
- B. 1 byte
- C. 0 bytes 
- D. 1 KB

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 37:



- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 38:



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



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 43:



- A. A set of questions that you can use to evaluate how well your architecture is aligned to AWS practices. 
- B. A guide to passing your Solutions Architect - Associate exam.
- C. A guide to building an on-premise network compatible with AWS services.
- D. A checklist used to evaluate the availability of your applications

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 44:



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



- A. The workflow has exceeded the maximum 90-day lifespan of an SWF workflow.
- B. SWF does not support tasks located outside of AWS, so you will need to remove those tasks from your on-premise servers.
- C. SWF is awaiting human input from a task you assigned to a colleague. 
- D. The last task has exceeded SWF's 14-day task execution time.

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 47:



- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 48:



- A. When the message visibility timeout expires, the message becomes available for processing by other EC2 instances. 
- B. It remains in the queue in a locked state until the EC2 instance comes back online.
- C. When the message timeout expires, the message is duplicated, the original message is archived, and the duplicate becomes available for processing.
- D. To prevent corruption, the message is deleted.

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 49:



- A. TRUE
- B. FALSE 

<details><summary>Answer:</summary><p>
B

Explanation:

</p></details><hr>

### Question 50:



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 51:



- A. 1 hour
- B. 2 hours
- C. 3-5 hours 
- D. > 5 hours

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 52:



- A. Cost Optimization
- B. Performance Efficiency 
- C. Availability 
- D. Security

<details><summary>Answer:</summary><p>
C

Explanation:

</p></details><hr>

### Question 53:



- A. An Elastic Load Balancer that sends web traffic to instances with the least latency.
- B. An SQS queue that allows secondary EC2 instances to process jobs dropped by the primary instance.
- C. An AutoScaling group that ensures a self-healing application.
- D. IAM credentials on the primary EC2 instance that allow it to modify the SQS queue. 

<details><summary>Answer:</summary><p>
D

Explanation:

</p></details><hr>

### Question 54:



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



- A. TRUE 
- B. FALSE

<details><summary>Answer:</summary><p>
A

Explanation:

</p></details><hr>

### Question 59:



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

