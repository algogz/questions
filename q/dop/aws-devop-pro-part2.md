# AWS DevOps Engineer Professional - 2/3
Version: 18.122

### QUESTION 101 x
What is the maximum supported single-volume throughput on EBS?

- A. 320MiB/s 
- B. 160MiB/s 
- C. 40MiB/s 
- D. 640MiB/s

<details><summary>Answer:</summary><p> A

Explanation:

The ceiling throughput for PIOPS on EBS is 320MiB/s. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html
    
</p></details><hr>

### QUESTION 102
For AWS Auto Scaling, what is the first transition state a new instance enters after leaving steady state when scaling out due to increased load?

- A. EnteringStandby
- B. Pending
- C. T erminating:W ait
- D. Detaching

<details><summary>Answer:</summary><p> B

Explanation:

When a scale out event occurs, the Auto Scaling group launches the required number of EC2 instances, using its assigned launch configuration. These instances start in the Pending state.
If you add a lifecycle hook to your Auto Scaling group, you can perform a custom action here. For more information, see Lifecycle Hooks. 

http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html

</p></details><hr>

### QUESTION 103
When a user is detaching an EBS volume from a running instance and attaching it to a new instance, which of the below mentioned options should be followed to avoid file system damage?

- A. Unmount the volume first
- B. Stop all the I/O of the volume before processing
- C. Take a snapshot of the volume before detaching
- D. Force Detach the volume to ensure that all the data stays intact

<details><summary>Answer:</summary><p> A

Explanation:

When a user is trying to detach an EBS volume, the user can either terminate the instance or explicitly remove the volume. It is a recommended practice to unmount the volume first to avoid any file system damage.

</p></details><hr>

### QUESTION 104
A user is creating a new EBS volume from an existing snapshot.
The snapshot size shows 10 GB. Can the user create a volume of 30 GB from that snapshot?

- A. Provided the original volume has set the change size attribute to true
- B. Yes
- C. Provided the snapshot has the modify size attribute set as true
- D. No

<details><summary>Answer:</summary><p> B

Explanation:

A user can always create a new EBS volume of a higher size than the original snapshot size. The user cannot create a volume of a lower size. When the new volume is created the size in the instance will be shown as the original size. The user needs to change the size of the device with resize2fs or other OS specific commands.

</p></details><hr>

### QUESTION 105
    
How long are the messages kept on an SQS queue by default?

- A. If a message is not read, it is never deleted
- B. 2 weeks
- C. 1day
- D. 4 days

<details><summary>Answer:</summary><p> D

Explanation:

The SQS message retention period is configurable and can be set anywhere from 1 minute to 2 weeks. The default is 4 days and once the message retention limit is reached your messages will be automatically deleted. The option for longer message retention provides greater flexibility to allow for longer intervals between message production and consumption.

</p></details><hr>

### QUESTION 106
A user has attached an EBS volume to a running Linux instance as a "/dev/sdf" device. The user is unable to see the attached device when he runs the command "df -h". What is the possible reason for this?

- A. The volume is not in the same AZ of the instance
- B. The volume is not formatted
- C. The volume is not attached as a root device
- D. The volume is not mounted

<details><summary>Answer:</summary><p> D

Explanation:

When a user creates an EBS volume and attaches it as a device, it is required to mount the device. If the device/volume is not mounted it will not be available in the listing.

</p></details><hr>

### QUESTION 107
When using Amazon SQS how much data can you store in a message?

- A. 8KB 
- B. 2KB 
- C. 16KB 
- D. 4KB

<details><summary>Answer:</summary><p> A

Explanation:

With Amazon SQS version 2008-01-01, the maximum message size for both SOAP and Query requests is 8KB.
If you need to send messages to the queue that are larger than 8 KB, AWS recommends that you split the information into separate messages. Alternatively, you could use Amazon S3 or Amazon SimpleDB to hold the information and include the pointer to that information in the Amazon SQS message. If you send a message that is larger than 8KB to the queue, you will receive a MessageTooLong error with HTTP code 400.

</p></details><hr>

### QUESTION 108
What is the maximum time messages can be stored in SQS? 

- A. 14 days
- B. one month
- C. 4 days
- D. 7 days

<details><summary>Answer:</summary><p> A

Explanation:

A message can be stored in the Simple Queue Service (SQS) from 1 minute up to a maximum of 14 days.

</p></details><hr>

### QUESTION 109
In DynamoDB, a secondary index is a data structure that contains a subset of attributes from a table, along with an alternate key to support   operations.

- A. None of the above
- B. Both
- C. Query
- D. Scan

<details><summary>Answer:</summary><p> C

Explanation:

In DynamoDB, a secondary index is a data structure that contains a subset of attributes from a table, along with an alternate key to support Query operations.

</p></details><hr>

### QUESTION 110
A user has created a new EBS volume from an existing snapshot. The user mounts the volume on the instance to which it is attached. Which of the below mentioned options is a required step before the user can mount the volume?

- A. Run a cyclic check on the device for data consistency
- B. Create the file system of the volume
- C. Resize the volume as per the original snapshot size
- D. No step is required. The user can directly mount the device

<details><summary>Answer:</summary><p> D

Explanation:

When a user is trying to mount a blank EBS volume, it is required that the user first creates a file system within the volume. If the volume is created from an existing snapshot then the user needs not to create a file system on the volume as it will wipe out the existing data.

</p></details><hr>

### QUESTION 111 x
You need your CI to build AMIs with code pre-installed on the images on every new code push. You need to do this as cheaply as possible. How do you do this?

- A. Bid on spot instances just above the asking price as soon as new commits come in, perform all instance configuration and setup, then create an AMI based on the spot instance.
- B. Have the CI launch a new on-demand EC2 instance when new commits come in, perform all instance configuration and setup, then create an AMI based on the on-demand instance.
- C. Purchase a Light Utilization Reserved Instance to save money on the continuous integration
machine.
Use these credits whenever your create AMIs on instances.
      
- D. When the CI instance receives commits, attach a new EBS volume to the CI machine. Perform all setup on this EBS volume so you don't need a new EC2 instance to create the AMI.

<details><summary>Answer:</summary><p> A

Explanation:

Spot instances are the cheapest option, and you can use minimum run duration if your AMI takes more than a few minutes to create.
Spot instances are also available to run for a predefined duration - in hourly increments up to six hours in length - at a significant discount (30-45%) compared to On-Demand pricing plus an additional 5% during off-peak times1 for a total of up to 50% savings. 

https://aws.amazon.com/ec2/spot/pricing/

</p></details><hr>

### QUESTION 112
When thinking of DynamoDB, what are true of Global Secondary Key properties?

- A. The partition key and sort key can be different from the table.
- B. Only the partition key can be different from the table.
- C. Either the partition key or the sort key can be different from the table, but not both.
- D. Only the sort key can be different from the table.

<details><summary>Answer:</summary><p> A

Explanation:

Global secondary index -- an index with a partition key and a sort key that can be different from those on the table. A global secondary index is considered "global" because queries on the index can span all of the data in a table, across all partitions. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/SecondaryIndexes.html

</p></details><hr>

### QUESTION 113
You need to process long-running jobs once and only once. How might you do this?

- A. Use an SNS queue and set the visibility timeout to long enough for jobs to process.
- B. Use an SQS queue and set the reprocessing timeout to long enough for jobs to process.
- C. Use an SQS queue and set the visibility timeout to long enough for jobs to process.
- D. Use an SNS queue and set the reprocessing timeout to long enough for jobs to process.

<details><summary>Answer:</summary><p> C

Explanation:

The message timeout defines how long after a successful receive request SQS waits before allowing jobs to be seen by other components, and proper configuration prevents duplicate processing. 

http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/MessageLifecycle.html

</p></details><hr>

### QUESTION 114
You are getting a lot of empty receive requests when using Amazon SQS. This is making a lot of unnecessary network load on your instances.
What can you do to reduce this load?

- A. Subscribe your queue to an SNS topic instead.
- B. Use as long of a poll as possible, instead of short polls.
- C. Alter your visibility timeout to be shorter.
- D. Use <code>sqsd</code> on your EC2 instances.

<details><summary>Answer:</summary><p> B

Explanation:

One benefit of long polling with Amazon SQS is the reduction of the number of empty responses, when there are no messages available to return, in reply to a ReceiveMessage request sent to an Amazon SQS queue. Long polling allows the Amazon SQS service to wait until a message is available in the queue before sending a response. 

http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html

</p></details><hr>

### QUESTION 115
You need to know when you spend $1000 or more on AWS. What's the easy way for you to see that notification?

- A. AWS CloudWatch Events tied to API calls, when certain thresholds are exceeded, publish to SNS.
- B. Scrape the billing page periodically and pump into Kinesis.
- C. AWS CloudWatch Metrics + Billing Alarm + Lambda event subscription. When a threshold is
exceeded, email the manager.
- D. Scrape the billing page periodically and publish to SNS.

<details><summary>Answer:</summary><p> C

Explanation:

Even if you're careful to stay within the free tier, it's a good idea to create a billing alarm to notify you if you exceed the limits of the free tier. Billing alarms can help to protect you against unknowingly accruing charges if you inadvertently use a service outside of the free tier or if traffic exceeds your expectations. 

http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/free-tier-alarms.html

</p></details><hr>

### QUESTION 116
You need to grant a vendor access to your AWS account. They need to be able to read protected messages in a private S3 bucket at their leisure. They also use AWS. What is the best way to accomplish this?

- A. Create an IAM User with API Access Keys. Grant the User permissions to access the bucket. Give the vendor the AWS Access Key ID and AWS Secret Access Key for the User.
- B. Create an EC2 Instance Profile on your account. Grant the associated IAM role full access to the bucket. Start an EC2 instance with this Profile and give SSH access to the instance to the vendor.
- C. Create a cross-account IAM Role with permission to access the bucket, and grant permission to use the Role to the vendor AWS account.
- D. Generate a signed S3 PUT URL and a signed S3 PUT URL, both with wildcard values and 2 year durations. Pass the URLs to the vendor.

<details><summary>Answer:</summary><p> C

Explanation:

When third parties require access to your organization's AWS resources, you can use roles to delegate access to them. For example, a third party might provide a service for managing your AWS resources. With IAM roles, you can grant these third parties access to your AWS resources without sharing your AWS security credentials. Instead, the third party can access your AWS resources by assuming a role that you create in your AWS account. 

http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_common-scenarios_third-party.html
  
</p></details><hr>

### QUESTION 117
Your serverless architecture using AWS API Gateway, AWS Lambda, and AWS DynamoDB experienced a large increase in traffic to a sustained 400 requests per second, and dramatically increased in failure rates. Your requests, during normal operation, last 500 milliseconds on average. Your DynamoDB table did not exceed 50% of provisioned throughput, and Table primary keys are designed correctly. What is the most likely issue?

- A. Your API Gateway deployment is throttling your requests.
- B. Your AWS API Gateway Deployment is bottlenecking on request (de)serialization.
- C. You did not request a limit increase on concurrent Lambda function executions.
- D. You used Consistent Read requests on DynamoDB and are experiencing semaphore lock.

<details><summary>Answer:</summary><p> C

Explanation:

AWS API Gateway by default throttles at 500 requests per second steady-state, and 1000 requests per second at spike. Lambda, by default, throttles at 100 concurrent requests for safety. At 500 milliseconds (half of a second) per request, you can expect to support 200 requests per second at 100 concurrency. This is less than the 400 requests per second your system now requires. Make a limit increase request via the AWS Support Console.
AWS Lambda: Concurrent requests safety throttle per account -> 100 

http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_lambda

</p></details><hr>

### QUESTION 118
Why are more frequent snapshots or EBS Volumes faster?

- A. Blocks in EBS Volumes are allocated lazily, since while logically separated from other EBS Volumes, Volumes often share the same physical hardware. Snapshotting the first time forces full block range allocation, so the second snapshot doesn't need to perform the allocation phase and is faster.
- B. The snapshots are incremental so that only the blocks on the device that have changed after your last snapshot are saved in the new snapshot.
- C. AWS provisions more disk throughput for burst capacity during snapshots if the drive has been pre-warmed by snapshotting and reading all blocks.
- D. The drive is pre-warmed, so block access is more rapid for volumes when every block on the device has already been read at least one time.

<details><summary>Answer:</summary><p> B

Explanation:

After writing data to an EBS volume, you can periodically create a snapshot of the volume to use as a baseline for new volumes or for data backup. If you make periodic snapshots of a volume, the snapshots are incremental so that only the blocks on the device that have changed after your last snapshot are saved in the new snapshot. Even though snapshots are saved incrementally, the snapshot deletion process is designed so that you need to retain only the most recent snapshot in order to restore the volume. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-snapshot.html

</p></details><hr>

### QUESTION 119 x
For AWS CloudFormation, which stack state refuses UpdateStack calls? 

- A. <code>UPDATE_ROLLBACK_FAILED</code>
- B. <code>UPDATE_ROLLBACK_COMPLETE</code> 
- C. <code>UPDATE_COMPLETE</code>
- D. <code>CREATE_COMPLETE</code>

<details><summary>Answer:</summary><p> A

Explanation:

When a stack is in the UPDATE_ROLLBACK_FAILED state, you can continue rolling it back to return it to a working state (to UPDATE_ROLLBACK_COMPLETE). You cannot update a stack that is in the UPDATE_ROLLBACK_FAILED state. However, if you can continue to roll it back, you can return the stack to its original settings and try to update it again. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html

</p></details><hr>

### QUESTION 120
You need to migrate 10 million records in one hour into DynamoDB. All records are 1.5KB in size. The data is evenly distributed across the partition key. How many write capacity units should you provision during this batch load?

- A. 6667 
- B. 4166 
- C. 5556 
- D. 2778

<details><summary>Answer:</summary><p> C

Explanation:

You need 2 units to make a 1.5KB write, since you round up. You need 20 million total units to perform this load. You have 3600 seconds to do so. Divide and round up for 5556. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ProvisionedThroughput.html

</p></details><hr>

### QUESTION 121
Your CTO thinks your AWS account was hacked. What is the only way to know for certain if there was unauthorized access and what they did, assuming your hackers are very sophisticated AWS engineers and doing everything they can to cover their tracks?

- A. Use CloudTrail Log File Integrity Validation.
- B. Use AWS Config SNS Subscriptions and process events in real time.
- C. Use CloudTrail backed up to AWS S3 and Glacier.
- D. Use AWS Config Timeline forensics.

<details><summary>Answer:</summary><p> A

Explanation:

You must use CloudTrail Log File Validation (default or custom implementation), as any other tracking method is subject to forgery in the event of a full account compromise by sophisticated enough hackers. Validated log files are invaluable in security and forensic investigations.
For example, a validated log file enables you to assert positively that the log file itself has not changed, or that particular user credentials performed specific API activity. The CloudTrail log file integrity validation process also lets you know if a log file has been deleted or changed, or assert positively that no log files were delivered to your account during a given period of time. 

http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-log-file-validation-intro.html
  
</p></details><hr>

### QUESTION 122
Which of these is not a Pseudo Parameter in AWS CloudFormation?

- A. AWS::StackName
- B. AWS::AccountId
- C. AWS::StackArn
- D. AWS::NotificationARNs

<details><summary>Answer:</summary><p> C

Explanation:

This is the complete list of Pseudo Parameters: AWS::AccountId, AWS::NotificationARNs, AWS::NoValue, AWS::Region, AWS::StackId, AWS::StackName 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/pseudo-parameter-reference.html

</p></details><hr>

### QUESTION 123 x
What is the scope of an EBS volume?

- A. VPC
- B. Region
- C. Placement Group
- D. Availability Zone

<details><summary>Answer:</summary><p> D

Explanation:

An Amazon EBS volume is tied to its Availability Zone and can be attached only to instances in the same Availability Zone. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resources.html

</p></details><hr>

### QUESTION 124
You are experiencing performance issues writing to a DynamoDB table. Your system tracks high scores for video games on a marketplace. Your most popular game experiences all of the performance issues.
What is the most likely problem?

- A. DynamoDB's vector clock is out of sync, because of the rapid growth in request for the most popular game.
- B. You selected the Game ID or equivalent identifier as the primary partition key for the table.
- C. Users of the most popular video game each perform more read and write requests than average.
- D. You did not provision enough read or write throughput to the table.

<details><summary>Answer:</summary><p> B

Explanation:

The primary key selection dramatically affects performance consistency when reading or writing to DynamoDB. By selecting a key that is tied to the identity of the game, you forced DynamoDB to create a hotspot in the table partitions, and over-request against the primary key partition for the popular game. When it stores data, DynamoDB divides a table's items into multiple partitions, and distributes the data primarily based upon the partition key value. The provisioned throughput associated with a table is also divided evenly among the partitions, with no sharing of provisioned throughput across partitions.

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GuidelinesForTables.html#GuidelinesForTables.UniformWorkload
  
</p></details><hr>

### QUESTION 125
You meet once per month with your operations team to review the past month's data. During the meeting, you realize that 3 weeks ago, your monitoring system which pings over HTTP from outside AWS recorded a large spike in latency on your 3-tier web service API.
You use DynamoDB for the database layer, ELB, EBS, and EC2 for the business logic tier, and SQS, ELB, and EC2 for the presentation layer.
Which of the following techniques will NOT help you figure out what happened?

- A. Check your CloudTrail log history around the spike's time for any API calls that caused slowness.
- B. Review CloudWatch Metrics graphs to determine which component(s) slowed the system down.
- C. Review your ELB access logs in S3 to see if any ELBs in your system saw the latency.
- D. Analyze your logs to detect bursts in traffic at that time.

<details><summary>Answer:</summary><p> B

Explanation:

Metrics data are available for 2 weeks. If you want to store metrics data beyond that duration, you can retrieve it using our GetMetricStatistics API as well as a number of applications and tools offered by AWS partners.

https://aws.amazon.com/cloudwatch/faqs/

</p></details><hr>

### QUESTION 126 x
Which of these is not an intrinsic function in AWS CloudFormation?

- A. Fn::Split
- B. Fn::FindInMap 
- C. Fn::Select
- D. Fn::GetAZs

<details><summary>Answer:</summary><p> A

Explanation:

This is the complete list of Intrinsic Functions...: Fn::Base64, Fn::And, Fn::Equals, Fn::If, Fn::Not, Fn::Or,
Fn::FindInMap, Fn::GetAtt, Fn::GetAZs, Fn::Join, Fn::Select, Ref 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html

</p></details><hr>

### QUESTION 127 x
For AWS CloudFormation, which is true?

- A. Custom resources using SNS have a default timeout of 3 minutes.
- B. Custom resources using SNS do not need a <code>ServiceToken</code> property.
- C. Custom resources using Lambda and <code>Code.ZipFile</code> allow inline nodejs resource
composition.
- D. Custom resources using Lambda do not need a <code>ServiceToken</code>property

<details><summary>Answer:</summary><p> C

Explanation:

Code is a property of the AWS::Lambda::Function resource that enables to you specify the source code of an AWS Lambda (Lambda) function.
You can point to a file in an Amazon Simple Storage Service (Amazon S3) bucket or specify your
source code as inline text (for nodejs runtime environments only). 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html

</p></details><hr>

### QUESTION 128
Your API requires the ability to stay online during AWS regional failures. Your API does not store any state, it only aggregates data from other sources - you do not have a database. What is a simple but effective way to achieve this uptime goal?

- A. Use a CloudFront distribution to serve up your API. Even if the region your API is in goes down, the edge locations CloudFront uses will be fine.
- B. Use an ELB and a cross-zone ELB deployment to create redundancy across datacenters. Even if a region fails, the other AZ will stay online.
- C. Create a Route53 Weighted Round Robin record, and if one region goes down, have that region redirect to the other region.
- D. Create a Route53 Latency Based Routing Record with Failover and point it to two identical deployments of your stateless API in two different regions. Make sure both regions use Auto Scaling Groups behind ELBs.

<details><summary>Answer:</summary><p> D

Explanation:

Latency Based Records allow request distribution when all is well with both regions, and the Failover component enables fallbacks between regions. By adding in the ELB and ASG, your system in the surviving region can expand to meet 100% of demand instead of the original fraction, whenever failover occurs. 

http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html

</p></details><hr>

### QUESTION 129
You are designing an enterprise data storage system. Your data management software system requires mountable disks and a real filesystem, so you cannot use S3 for storage. You need persistence, so you will be using AWS EBS Volumes for your system. The system needs as low- cost storage as possible, and access is not frequent or high throughput, and is mostly sequential reads. Which is the most appropriate EBS Volume Type for this scenario?

- A. gp1
- B. io1
- C. standard 
- D. gp2

<details><summary>Answer:</summary><p> C

Explanation:

standard volumes, or Magnetic volumes, are best for: Cold workloads where data is infrequently accessed, or scenarios where the lowest storage cost is important. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html

</p></details><hr>

### QUESTION 130
You need to deploy an AWS stack in a repeatable manner across multiple environments. You have selected CloudFormation as the right tool to accomplish this, but have found that there is a resource type you need to create and model, but is unsupported by CloudFormation. How should you overcome this challenge?
  

- A. Use a CloudFormation Custom Resource Template by selecting an API call to proxy for create, update, and delete actions. CloudFormation will use the AWS SDK, CLI, or API method of your choosing as the state transition function for the resource type you are modeling.
- B. Submit a ticket to the AWS Forums. AWS extends CloudFormation Resource Types by releasing tooling to the AWS Labs organization on GitHub. Their response time is usually 1 day, and they complete requests within a week or two.
- C. Instead of depending on CloudFormation, use Chef, Puppet, or Ansible to author Heat templates, which are declarative stack resource definitions that operate over the OpenStack hypervisor and cloud environment.
- D. Create a CloudFormation Custom Resource Type by implementing create, update, and delete functionality, either by subscribing a Custom Resource Provider to an SNS topic, or by implementing the logic in AWS Lambda.

<details><summary>Answer:</summary><p> D

Explanation:

Custom resources provide a way for you to write custom provisioning logic in AWS CloudFormation template and have AWS CloudFormation run it during a stack operation, such as when you create, update or delete a stack. For more information, see Custom Resources. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html

</p></details><hr>

### QUESTION 131
You run a 2000-engineer organization. You are about to begin using AWS at a large scale for the first time. You want to integrate with your existing identity management system running on Microsoft Active Directory, because your organization is a power-user of Active Directory. How should you manage your AWS identities in the most simple manner?

- A. Use a large AWS Directory Service Simple AD.
- B. Use a large AWS Directory Service AD Connector.
- C. Use an Sync Domain running on AWS Directory Service.
- D. Use an AWS Directory Sync Domain running on AWS Lambda

<details><summary>Answer:</summary><p> B

Explanation:

You must use AD Connector as a power-user of Microsoft Active Directory. Simple AD only works with a subset of AD functionality. Sync Domains do not exist; they are made up answers. AD Connector is a directory gateway that allows you to proxy directory requests to your on-premises Microsoft Active Directory, without caching any information in the cloud. AD Connector comes in 2 sizes; small and large. A small AD Connector is designed for smaller organizations of up to 500 users. A large AD Connector is designed for larger organizations of up to 5,000 users. 

https://aws.amazon.com/directoryservice/details/

</p></details><hr>

### QUESTION 132
When thinking of AWS OpsWorks, which of the following is not an instance type you can allocate in a stack layer?

- A. 24/7 instances
- B. Spot instances
- C. Time-based instances 
- D. Load-based instances

<details><summary>Answer:</summary><p> B
   

Explanation:

AWS OpsWorks supports the following instance types, which are characterized by how they are started and stopped. 24/7 instances are started manually and run until you stop them.Time-based instances are run by AWS OpsWorks on a specified daily and weekly schedule. They allow your stack to automatically adjust the number of instances to accommodate predictable usage patterns. Load-based instances are automatically started and stopped by AWS OpsWorks, based on specified load metrics, such as CPU utilization. They allow your stack to automatically adjust the number of instances to accommodate variations in incoming traffic. Load-based instances are available only for Linux-based stacks. 

http://docs.aws.amazon.com/opsworks/latest/userguide/welcome.html

</p></details><hr>

### QUESTION 133
Which of these is not a CloudFormation Helper Script?

- A. cfn-signal
- B. cfn-hup
- C. cfn-request
- D. cfn-get-metadata

<details><summary>Answer:</summary><p> C

Explanation:

This is the complete list of CloudFormation Helper Scripts: cfn-init, cfn-signal, cfn-get-metadata, cfn-hup

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-helper-scripts-reference.html

</p></details><hr>

### QUESTION 134
Your team wants to begin practicing continuous delivery using CloudFormation, to enable automated builds and deploys of whole, versioned stacks or stack layers.
You have a 3-tier, mission-critical system.
Which of the following is NOT a best practice for using CloudFormation in a continuous delivery environment?

- A. Use the AWS CloudFormation <code>ValidateTemplate</code> call before publishing changes to AWS.
- B. Model your stack in one template, so you can leverage CloudFormation's state management and dependency resolution to propagate all changes.
- C. Use CloudFormation to create brand new infrastructure for all stateless resources on each push, and run integration tests on that set of infrastructure.
- D. Parametrize the template and use <code>Mappings</code> to ensure your template works in multiple Regions.

<details><summary>Answer:</summary><p> B

Explanation:

Putting all resources in one stack is a bad idea, since different tiers have different life cycles and frequencies of change. For additional guidance about organizing your stacks, you can use two common frameworks: a multi-layered architecture and service-oriented architecture (SOA). 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/best-practices.html#organizingstacks

</p></details><hr>

### QUESTION 135 x
You need to replicate API calls across two systems in real time. What tool should you use as a
buffer and transport mechanism for API call events?

- A. AWS SQS
- B. AWS Lambda
- C. AWS Kinesis
- D. AWS SNS

<details><summary>Answer:</summary><p> C

Explanation:

AWS Kinesis is an event stream service. Streams can act as buffers and transport across systems for in-order programmatic events, making it ideal for replicating API calls across systems. A typical Amazon Kinesis Streams application reads data from an Amazon Kinesis stream as data records. These applications can use the Amazon Kinesis Client Library, and they can run on Amazon EC2 instances. The processed records can be sent to dashboards, used to generate alerts, dynamically change pricing and advertising strategies, or send data to a variety of other AWS services. For information about Streams features and pricing, see Amazon Kinesis Streams.

http://docs.aws.amazon.com/kinesis/latest/dev/introduction.html

</p></details><hr>

### QUESTION 136
You are building a Ruby on Rails application for internal, non-production use which uses MySQL as a database. You want developers without very much AWS experience to be able to deploy new code with a single command line push. You also want to set this up as simply as possible. Which tool is ideal for this setup?

- A. AWS CloudFormation
- B. AWS OpsWorks
- C. AWS ELB + EC2 with CLI Push
- D. AWS Elastic Beanstalk

<details><summary>Answer:</summary><p> D

Explanation:

Elastic Beanstalk's primary mode of operation exactly supports this use case out of the box. It is simpler than all the other options for this question.
With Elastic Beanstalk, you can quickly deploy and manage applications in the AWS cloud without worrying about the infrastructure that runs those applications. AWS Elastic Beanstalk reduces management complexity without restricting choice or control. You simply upload your application, and Elastic Beanstalk automatically handles the details of capacity provisioning, load balancing, scaling, and application health monitoring. 

http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/create_deploy_Ruby_rails.html

</p></details><hr>

### QUESTION 137
What is the scope of AWS IAM?

- A. Global
- B. Availability Zone
- C. Region
- D. Placement Group

<details><summary>Answer:</summary><p> A

Explanation:

IAM resources are all global; there is not regional constraint.
   
https://aws.amazon.com/iam/faqs/

</p></details><hr>

### QUESTION 138
You are building a mobile app for consumers to post cat pictures online.
You will be storing the images in AWS S3. You want to run the system very cheaply and simply. Which one of these options allows you to build a photo sharing application without needing to worry about scaling expensive uploads processes, authentication/authorization and so forth?

- A. Build the application out using AWS Cognito and web identity federation to allow users to log in using Facebook or Google Accounts. Once they are logged in, the secret token passed to that user is used to directly access resources on AWS, like AWS S3.
- B. Use JWT or SAML compliant systems to build authorization policies. Users log in with a username and password, and are given a token they can use indefinitely to make calls against the photo infrastructure.
- C. Use AWS API Gateway with a constantly rotating API Key to allow access from the client-side. Construct a custom build of the SDK and include S3 access in it.
- D. Create an AWS oAuth Service Domain ad grant public signup and access to the domain. During setup, add at least one major social media site as a trusted Identity Provider for users.

<details><summary>Answer:</summary><p> A

Explanation:

The short answer is that Amazon Cognito is a superset of the functionality provided by web identity federation. It supports the same providers, and you configure your app and authenticate with those providers in the same way. But Amazon Cognito includes a variety of additional features. For example, it enables your users to start using the app as a guest user and later sign in using one of the supported identity providers. 

https://blogs.aws.amazon.com/security/post/Tx3SYCORF5EKRC0/How-Does-Amazon-Cognito-Relate-to-Existing-Web-Identity-Federatio

</p></details><hr>

### QUESTION 139 x
Your CTO has asked you to make sure that you know what all users of your AWS account are doing to change resources at all times. She wants a report of who is doing what over time, reported to her once per week, for as broad a resource type group as possible. How should you do this?

- A. Create a global AWS CloudTrail Trail. Configure a script to aggregate the log data delivered to S3 once per week and deliver this to the CTO.
- B. Use CloudWatch Events Rules with an SNS topic subscribed to all AWS API calls. Subscribe the CTO to an email type delivery on this SNS Topic.
- C. Use AWS IAM credential reports to deliver a CSV of all uses of IAM User Tokens over time to the CTO.
- D. Use AWS Config with an SNS subscription on a Lambda, and insert these changes over time into a DynamoDB table. Generate reports based on the contents of this table.

<details><summary>Answer:</summary><p> A

Explanation:

This is the ideal use case for AWS CloudTrail.
CloudTrail provides visibility into user activity by recording API calls made on your account. CloudTrail records important information about each API call, including the name of the API, the identity of the caller, the time of the API call, the request parameters, and the response elements returned by the AWS service. This information helps you to track changes made to your AWS resources and to troubleshoot operational issues. CloudTrail makes it easier to ensure compliance with internal policies and regulatory standards.
  
https://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 140
What is the order of most-to-least rapidly-scaling (fastest to scale first)?
```
a) EC2 + ELB + Auto Scaling 
b) Lambda
c) RDS
```

- A. B,A,C 
- B. C,B,A 
- C. C,A,B 
- D. A,C,B

<details><summary>Answer:</summary><p> A

Explanation:

Lambda is designed to scale instantly. EC2 + ELB + Auto Scaling require single-digit minutes to scale out. RDS will take at least 15 minutes, and will apply OS patches or any other updates when applied.

https://aws.amazon.com/lambda/faqs/

</p></details><hr>

### QUESTION 141 x
Which is not a restriction on AWS EBS Snapshots?

- A. Snapshots which are shared cannot be used as a basis for other snapshots.
- B. You cannot share a snapshot containing an AWS Access Key ID or AWS Secret Access Key.
- C. You cannot share unencrypted snapshots.
- D. Snapshot restorations are restricted to the region in which the snapshots are created.

<details><summary>Answer:</summary><p> A

Explanation:

Snapshots shared with other users are usable in full by the recipient, including but limited to the ability to base modified volumes and snapshots. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html

</p></details><hr>

### QUESTION 142 x
You need to deploy a new application version to production. Because the deployment is high-risk, you need to roll the new version out to users over a number of hours, to make sure everything is working correctly. You need to be able to control the proportion of users seeing the new version of the application down to the percentage point.
You use ELB and EC2 with Auto Scaling Groups and custom AMIs with your code pre-installed assigned to Launch Configurations. There are no database-level changes during your deployment. You have been told you cannot spend too much money, so you must not increase the number of EC2 instances much at all during the deployment, but you also need to be able to switch back to the original version of code quickly if something goes wrong. What is the best way to meet these requirements?

- A. Create a second ELB, Auto Scaling Launch Configuration, and Auto Scaling Group using the Launch Configuration. Create AMIs with all code pre-installed. Assign the new AMI to the second Auto Scaling Launch Configuration. Use Route53 Weighted Round Robin Records to adjust the proportion of traffic hitting the two ELBs.
- B. Use the Blue-Green deployment method to enable the fastest possible rollback if needed. Create
a full second stack of instances and cut the DNS over to the new stack of instances, and change
the DNS back if a rollback is needed.
- C. Create AMIs with all code pre-installed. Assign the new AMI to the Auto Scaling Launch
Configuration, to replace the old one. Gradually terminate instances running the old code (launched with the old Launch Configuration) and allow the new AMIs to boot to adjust the traffic balance to the new code. On rollback, reverse the process by doing the same thing, but changing the AMI on the Launch Config back to the original code.
- D. Migrate to use AWS Elastic Beanstalk. Use the established and well-tested Rolling Deployment setting AWS provides on the new Application Environment, publishing a zip bundle of the new code and adjusting the wait period to spread the deployment over time. Re-deploy the old code bundle to rollback if needed.

<details><summary>Answer:</summary><p> A

Explanation:

Only Weighted Round Robin DNS Records and reverse proxies allow such fine-grained tuning of traffic splits. The Blue-Green option does not meet the requirement that we mitigate costs and keep overall EC2 fleet size consistent, so we must select the 2 ELB and ASG option with WRR DNS tuning. This method is called A/B deployment and/or Canary deployment. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 143
What is required to achieve gigabit network throughput on EC2?
You already selected cluster-compute, 10GB instances with enhanced networking, and your workload is already network-bound, but you are not seeing 10 gigabit speeds.

- A. Enable biplex networking on your servers, so packets are non-blocking in both directions and there's no switching overhead.
- B. Ensure the instances are in different VPCs so you don't saturate the Internet Gateway on any one VPC.
- C. Select PIOPS for your drives and mount several, so you can provision sufficient disk throughput.
- D. Use a placement group for your instances so the instances are physically near each other in the
same Availability Zone.

<details><summary>Answer:</summary><p> D

Explanation:

You are not guaranteed 10gigabit performance, except within a placement group. A placement group is a logical grouping of instances within a single Availability Zone. Using placement groups enables applications to participate in a low-latency, 10 Gbps network. Placement groups are recommended for applications that benefit from low network latency, high network throughput, or both.

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html

</p></details><hr>

### QUESTION 144 x
If I want CloudFormation stack status updates to show up in a continuous delivery system in as close to real time as possible, how should I achieve this?

- A. Use a long-poll on the Resources object in your CloudFormation stack and display those state changes in the UI for the system.
- B. Use a long-poll on the <code>ListStacks</code>API call for your CloudFormation stack and display those state changes in the UI for the system.
- C. Subscribe your continuous delivery system to an SNS topic that you also tell your CloudFormation stack to publish events into.
- D. Subscribe your continuous delivery system to an SQS queue that you also tell your CloudFormation stack to publish events into.

<details><summary>Answer:</summary><p> C

Explanation:

Use NotificationARNs.member.N when making a CreateStack call to push stack events into SNS in nearly real-time. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-monitor-stack.html

</p></details><hr>

### QUESTION 145 x
What does it mean if you have zero IOPS and a non-empty I/O queue for all EBS volumes attached to a running EC2 instance?

- A. The I/O queue is buffer flushing.
- B. Your EBS disk head(s) is/are seeking magnetic stripes.
- C. The EBS volume is unavailable.
- D. You need to re-mount the EBS volume in the OS.

<details><summary>Answer:</summary><p> C

Explanation:

This is the definition of Unavailable from the EC2 and EBS SLA. "Unavailable" and "Unavailability" mean... For Amazon EBS, when all of your attached volumes perform zero read write IO, with pending IO in the queue.

https://aws.amazon.com/ec2/sla/

</p></details><hr>

### QUESTION 146 x
From a compliance and security perspective, which of these statements is true?

- A. You do not ever need to rotate access keys for AWS IAM Users.
- B. You do not ever need to rotate access keys for AWS IAM Roles, nor AWS IAM Users.
- C. None of the other statements are true.
- D. You do not ever need to rotate access keys for AWS IAM Roles.

<details><summary>Answer:</summary><p> D

Explanation:

IAM Role Access Keys are auto-rotated by AWS on your behalf; you do not need to rotate them. The application is granted the permissions for the actions and resources that you've defined for the role through the security credentials associated with the role. These security credentials are temporary and we rotate them automatically. We make new credentials available at least five minutes prior to the expiration of the old credentials. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html

</p></details><hr>

### QUESTION 147
Which of these configuration or deployment practices is a security risk for RDS?

- A. Storing SQL function code in plaintext
- B. Non-Multi-AZ RDS instance
- C. Having RDS and EC2 instances exist in the same subnet
- D. RDS in a public subnet

<details><summary>Answer:</summary><p> D

Explanation:

Making RDS accessible to the public internet in a public subnet poses a security risk, by making your database directly addressable and spammable.
DB instances deployed within a VPC can be configured to be accessible from the Internet or from EC2 instances outside the VPC. If a VPC security group specifies a port access such as TCP port 22, you would not be able to access the DB instance because the firewall for the DB instance provides access only via the IP addresses specified by the DB security groups the instance is a member of and the port defined when the DB instance was created. 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.RDSSecurityGroups.html

</p></details><hr>

### QUESTION 148
Which of these is not a reason a Multi-AZ RDS instance will failover?

- A. An Availability Zone outage
- B. A manual failover of the DB instance was initiated using Reboot with failover
- C. To autoscale to a higher instance class
- D. The primary DB instance fails

<details><summary>Answer:</summary><p> C

Explanation:

The primary DB instance switches over automatically to the standby replica if any of the > following conditions occur: An Availability Zone outage, the primary DB instance fails, the DB instance's server type is changed, the operating system of the DB instance is, undergoing software patching, a manual failover of the DB instance was initiated using Reboot with failover 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html

</p></details><hr>

### QUESTION 149
You need to create an audit log of all changes to customer banking data. You use DynamoDB to store this customer banking data. It's important not to lose any information due to server failures. What is an elegant way to accomplish this?

- A. Use a DynamoDB StreamSpecification and stream all changes to AWS Lambda. Log the changes to AWS CloudWatch Logs, removing sensitive information before logging.
- B. Before writing to DynamoDB, do a pre-write acknoledgment to disk on the application server, removing sensitive information before logging. Periodically rotate these log files into S3.
- C. Use a DynamoDB StreamSpecification and periodically flush to an EC2 instance store, removing sensitive information before putting the objects. Periodically flush these batches to S3.
- D. Before writing to DynamoDB, do a pre-write acknoledgment to disk on the application server, removing sensitive information before logging. Periodically pipe these files into CloudWatch Logs.

<details><summary>Answer:</summary><p> A

Explanation:

All suggested periodic options are sensitive to server failure during or between periodic flushes. Streaming to Lambda and then logging to CloudWatch Logs will make the system resilient to instance and Availability Zone failures. 

http://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html

</p></details><hr>

### QUESTION 150
    
You need your API backed by DynamoDB to stay online during a total regional AWS failure. You can tolerate a couple minutes of lag or slowness during a large failure event, butthe system should recover with normal operation after those few minutes. What is a good approach?

- A. Set up DynamoDB cross-region replication in a master-standby configuration, with a single standby in another region. Create an Auto Scaling Group behind an ELB in each of the two regions DynamoDB is running in. Add a Route53 Latency DNS Record with DNS Failover, using the ELBs in the two regions as the resource records.
- B. Set up a DynamoDB Multi-Region table. Create an Auto Scaling Group behind an ELB in each of the two regions DynamoDB is running in. Add a Route53 Latency DNS Record with DNS Failover, using the ELBs in the two regions as the resource records.
- C. Set up a DynamoDB Multi-Region table. Create a cross-region ELB pointing to a cross- region Auto Scaling Group, and direct a Route53 Latency DNS Record with DNS Failover to the cross- region ELB.
- D. Set up DynamoDB cross-region replication in a master-standby configuration, with a single standby in another region. Create a cross-region ELB pointing to a cross-region Auto Scaling Group, and direct a Route53 Latency DNS Record with DNS Failover to the cross-region ELB.

<details><summary>Answer:</summary><p> A

Explanation:

There is no such thing as a cross-region ELB, nor such thing as a cross-region Auto Scaling Group, nor such thing as a DynamoDB Multi-Region Table. The only option that makes sense is the cross-regional replication version with two ELBs and ASGs with Route53 Failover and Latency DNS. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.CrossRegionRepl.html

</p></details><hr>

### QUESTION 151
You have an asynchronous processing application using an Auto Scaling Group and an SQS Queue. The Auto Scaling Group scales according to the depth of the job queue. The completion velocity of the jobs has gone down, the AutoScalingGroup size has maxed out, but the inbound job velocity did not increase.
What is a possible issue?

- A. Some of the new jobs coming in are malformed and unprocessable.
- B. The routing tables changed and none of the workers can process events anymore.
- C. Someone changed the IAM Role Policy on the instances in the worker group and
broke permissions to access the queue.
- D. The scaling metric is not functioning correctly.

<details><summary>Answer:</summary><p> A

Explanation:

The IAM Role must be fine, as if it were broken, NO jobs would be processed since the system would never be able to get any queue messages. The same reasoning applies to the routing table change. The scaling metric is fine, as instance count increased when the queue depth increased due to more messages entering than exiting. Thus, the only reasonable option is that some of the recent messages must be malformed and unprocessable. 

https://github.com/andrew-templeton/cloudacademy/blob/fca920b45234bbe99cc0e8efb9c65134884dd489/questions/null

</p></details><hr>

### QUESTION 152
Your company wants to understand where cost is coming from in the company's production AWS account.There are a number of applications and services running at any given time. Without
expending too much initial development time, how best can you give the business a good understanding of which applications cost the most per month to operate?
  

- A. Create an automation script which periodically creates AWS Support tickets requesting detailed intra-month information about your bill.
- B. Use custom CloudWatch Metrics in your system, and put a metric data point whenever cost is incurred.
- C. Use AWS Cost Allocation Tagging for all resources which support it. Use the Cost Explorer
to analyze costs throughout the month.
- D. Use the AWS Price API and constantly running resource inventory scripts to calculate total price based on multiplication of consumed resources over time.

<details><summary>Answer:</summary><p> C

Explanation:

Cost Allocation Tagging is a built-in feature of AWS, and when coupled with the Cost Explorer, provides a simple and robust way to track expenses.
You can also use tags to filter views in Cost Explorer. Note that before you can filter views
by tags in CostExplorer, you must have applied tags to your resources and activate them,
as described in the following sections. For more information about CostExplorer, see Analyzing Your Costs with Cost Explorer. 

http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html

</p></details><hr>

### QUESTION 153
There is a very serious outage at AWS. EC2 is not affected, but your EC2 instance deployment scripts stopped working in the region with the outage. What might be the issue?

- A. The AWS Console is down, so your CLI commands do not work.
- B. S3 is unavailable, so you can't create EBS volumes from a snapshot you use to deploy
new volumes.
- C. AWS turns off the <code>DeployCode</code> API call when there are major outages, to
protect from system floods.
- D. None of the other answers make sense. If EC2 is not affected, it must be some other issue.

<details><summary>Answer:</summary><p> B

Explanation:

S3 stores all snapshots. If S3 is unavailable, snapshots are unavailable. Amazon EC2 also uses Amazon S3 to store snapshots (backup copies) of the data volumes. You can use snapshots for recovering data quickly and reli a bly in case of application or system failures. You can also use snapshots as a base line to create multiple new data volumes, expand the size of an existing data volume,or move data volumes across multiple Availability Zones, thereby making your data usage highly scalable. For more information about using data volumes and snapshots, see Amazon Elastic Block Store. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonS3.html

</p></details><hr>

### QUESTION 154
Which of the following tools does not directly support AWS OpsWorks, for monitoring your stacks?

- A. AWS Config
- B. Amazon CloudWatch Metrics
- C. AWS CloudTrail
- D. Amazon CloudWatch Logs

<details><summary>Answer:</summary><p> A

Explanation:

You can monitor your stacks in the following ways: AWS OpsWorks uses Amazon CloudWatch to provide thirteen custom metrics with detailed monitoring for each instance in the stack; AWS OpsWorks integrates with AWS CloudTrail to log every AWS OpsWorks API call and store the data in an Amazon S3 bucket; You can use Amazon CloudWatch Logs to monitor your stack's system, application, and custom logs. 

http://docs.aws.amazon.com/opsworks/latest/userguide/monitoring.html
  
</p></details><hr>

### QUESTION 155
What is a circular dependency in AWS CloudFormation?

- A. When a Template references an earlier version of itself.
- B. When Nested Stacks depend on each other.
- C. When Resources form a DependOn loop.
- D. When a Template references a region, which references the original Template.

<details><summary>Answer:</summary><p> C

Explanation:

To resolve a dependency error, add a DependsOn attribute to resources that depend on other resources in your template. In some cases, you must explicitly declare dependencies so that AWS CloudFormation can create or delete resources in the correct order. For example, if you create an Elastic IP and a VPC with an Internet gateway in the same stack, the Elastic IP must depend on the Internet gateway attachment. For additional information, see DependsOn Attribute. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-dependence-error

</p></details><hr>

### QUESTION 156
You need to run a very large batch data processing job one time per day. The source data exists entirely in S3, and the output of the processing job should also be written to S3 when finished. If you need to version control this processing job and all setup and teardown logic for the system, what approach should you use?

- A. Model an AWS EMR job in AWS Elastic Beanstalk.
- B. Model an AWS EMR job in AWS CloudFormation.
- C. Model an AWS EMR job in AWS OpsWorks.
- D. Model an AWS EMR job in AWS CLI Composer.

<details><summary>Answer:</summary><p> B

Explanation:

To declaratively model build and destroy of a cluster, you need to use AWS CloudFormation. OpsWorks and Elastic Beanstalk cannot directly model EMR Clusters. The CLI is not declarative, and CLI Composer does not exist. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-cluster.html

</p></details><hr>

### QUESTION 157
What is true of the way that encryption works with EBS?

- A. Snapshotting an encrypted volume makes an encrypted snapshot; restoring an encrypted
snapshot creates an encrypted volume when specified / requested.
- B. Snapshotting an encrypted volume makes an encrypted snapshot when specified / requested;
restoring an encrypted snapshot creates an encrypted volume when specified / requested.
- C. Snapshotting an encrypted volume makes an encrypted snapshot; restoring an encrypted
snapshot always creates an encrypted volume.
- D. Snapshotting an encrypted volume makes an encrypted snapshot when specified / requested;
restoring an encrypted snapshot always creates an encrypted volume.

<details><summary>Answer:</summary><p> C

Explanation:

Snapshots that are taken from encrypted volumes are automatically encrypted. Volumes that are created from encrypted snapshots are also automatically encrypted. Your encrypted volumes and any associated snapshots always remain protected. For more information, see Amazon EBS Encryption.

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html

</p></details><hr>

### QUESTION 158
When thinking of AWS OpsWorks, which of the following is true?
    

- A. Stacks have many layers, layers have many instances.
- B. Instances have many stacks, stacks have many layers.
- C. Layers have many stacks, stacks have many instances.
- D. Layers have many instances, instances have many stacks.

<details><summary>Answer:</summary><p> A

Explanation:

The stack is the core AWS OpsWorks component. It is basically a container for AWS resources-- Amazon EC2 instances, Amazon RDS database instances, and so on--that have a common purpose and should be logically managed together. You define the stack's constituents by adding one or more layers. A layer represents a set of Amazon EC2 instances that serve a particular purpose, such as serving applications or hosting a database server. An instance represents a single computing resource, such as an Amazon EC2 instance. 

http://docs.aws.amazon.com/opsworks/latest/userguide/welcome.html

</p></details><hr>

### QUESTION 159
When thinking of AWS Elastic Beanstalk, which statement is true?

- A. Worker tiers pull jobs from SNS.
- B. Worker tiers pull jobs from HTTP.
- C. Worker tiers pull jobs from JSON.
- D. Worker tiers pull jobs from SQS.

<details><summary>Answer:</summary><p> D

Explanation:

Elastic Beanstalk installs a daemon on each Amazon EC2 instance in the Auto Scaling group to process Amazon SQS messages in the worker environment. The daemon pulls data off the Amazon SQS queue, inserts it into the message body of an HTTP POST request, and sends it to a user-configurable URL path on the local host. The content type for the message body within an HTTP POST request is application/json by default. 

http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features-managing-env-tiers.html

</p></details><hr>

### QUESTION 160 x
Your company needs to automate 3 layers of a large cloud deployment. You want to be able to track this deployment's evolution as it changes over time, and carefully control any alterations. What is a good way to automate a stack to meet these requirements?

- A. Use OpsWorks Stacks with three layers to model the layering in your stack.
- B. Use CloudFormation Nested Stack Templates, with three child stacks to represent the
three logical layers of your cloud.
- C. Use AWS Config to declare a configuration set that AWS should roll out to your cloud.
- D. Use Elastic Beanstalk Linked Applications, passing the important DNS entires between
layers using the metadata interface.

<details><summary>Answer:</summary><p> B

Explanation:

Only CloudFormation allows source controlled, declarative templates as the basis for stack automation. Nested Stacks help achieve clean separation of layers while simultaneously providing a method to control all layers at once when needed. 

https://blogs.aws.amazon.com/application-management/post/Tx1T9JYQOS8AB9I/Use-Nested-Stacks-to-Create-Reusable-Templates-and-Support-Role-Specialization

</p></details><hr>

### QUESTION 161 x
Your application's Auto Scaling Group scales up too quickly, too much, and stays scaled when traffic decreases.What should you do to fix this?

- A. Set a longer cooldown period on the Group, so the system stops overshooting the target capacity. The issue is that the scaling system doesn't allow enough time for new instances to begin servicin g requests before measuring aggregate load again.
- B. Calculate the bottleneck or constraint on the compute layer, then select that as the new metric, and set the metric thresholds to the bounding values that begin to affect response latency.
- C. Raise the CloudWatch Alarms threshold associated with your autoscaling group, so the scaling takes more of an increase in demand before beginning.
- D. Use larger instances instead of lots of smaller ones, so the Group stops scaling out so much and wasting resources as the OS level,since the OS uses a higher proportion of resources on smaller instances.

<details><summary>Answer:</summary><p> B

Explanation:

Systems will always over-scale unless you choose the metric that runs out first and becomes constrained first. You also need to set the thresholds of the metric based on whether or not latency is affected by the change,to justify adding capacity instead of wasting money. 

http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/policy_creating.html

</p></details><hr>

### QUESTION 162
You need the absolute highest possible network performance for a cluster computing application. You already selected homogeneous instance types supporting 10 gigabit enhanced networking, made sure that your work load was network bound, and put the instances in a placement group. What is the last optimization you can make?

- A. Use 9001 MTU instead of 1500 for Jumbo Frames, to raise packet body to packet overhead ratios.
- B. Segregate the instances into different peered VPCs while keeping them all in a placement group, so each one has its own Internet Gateway.
- C. Bake an AMI for the instances and relaunch, so the instances are fresh in the placement group and do not have noisy neighbors.
- D. Turn off SYN/ACK on your TCP stack or begin using UDP for higher throughput. 

<details><summary>Answer:</summary><p> A

Explanation:

For instances that are collocated inside a placement group, jumbo frames help to achieve the maximum network throughput possible, and they are recommended in this case.
For more information, see Placement Groups. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/network_mtu.html#jumbo_frame_instances

</p></details><hr>

### QUESTION 163
Your CTO is very worried about the security of your AWS account. How best can you prevent hackers from completely hijacking your account?

- A. Use short but complex password on the root account and any administrators.
- B. Use AWS IAM Geo-Lock and disallow anyone from logging in except for in your city.
- C. Use MFA on all users and accounts, especially on the root account.
- D. Don't write down or remember the root account password after creating the AWS account.

<details><summary>Answer:</summary><p> C

Explanation:

For increased security, we recommend that you configure multi-factor authentication (MFA) to help protect your AWS resources. MFA adds extra security because it requires users to enter a unique authentication code from an approved authentication device or SMS text message when they access AWS websites or services. 

http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_mfa.html

</p></details><hr>

### QUESTION 164
If you're trying to configure an AWS Elastic Beanstalk worker tier for easy debugging if there are problems finishing queue jobs, what should you configure?

- A. Configure Rolling Deployments.
- B. Configure Enhanced Health Reporting
- C. Configure Blue-Green Deployments.
- D. Configure a Dead Letter Queue

<details><summary>Answer:</summary><p> D

Explanation:

Elastic Beanstalk worker environments support Amazon Simple Queue Service (SQS) dead letter queues. A dead letter queue is a queue where other (source) queues can send messages that for some reason could not be successfully processed. A primary benefit of using a dead letter queue is the ability to sideline and isolate the unsuccessfully processed messages. You can then analyze any messages sent to the dead letter queue to try to determine why they were not successfully processed. 

http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features-managing-env-tiers.html#worker-deadletter

</p></details><hr>

### QUESTION 165 x
You have a high security requirement for your AWS accounts. What is the most rapid and
sophisticated setup you can use to react to AWS API calls to your account?

- A. Subscription to AWS Config via an SNS Topic. Use a Lambda Function to perform in-
flight analysis and reactivity to changes as they occur.
- B. Global AWS CloudTrail setup delivering to S3 with an SNS subscription to the deliver
notifications, pushing into a Lambda, which inserts records into an ELK stack for
analysis.
- C. Use a CloudWatch Rule ScheduleExpression to periodically analyze IAM credential logs.
Push the deltas for events into an ELK stack and perform ad-hoc analysis there.
- D. CloudWatch Events Rules which trigger based on all AWS API calls, submitting all events to an AWS Kinesis Stream for arbitrary down stream analysis. 

<details><summary>Answer:</summary><p> D

Explanation:

CloudWatch Events allow subscription to AWS API calls, and direction of these events into Kinesis Streams. This allows a unified, near real-time stream for all API calls, which can be analyzed with any tool(s) of your choosing downstream. 

http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/EventTypes.html#api_event_type

</p></details><hr>

### QUESTION 166
What method should I use to author automation if I want to wait for a CloudFormation stack to finish completing in a script?

- A. Event subscription using SQS.
- B. Event subscription using SNS.
- C. Poll using <code>ListStacks</code> / <code>list-stacks</code>.
- D. Poll using <code>GetStackStatus</code> / <code>get-stack-status</code>.

<details><summary>Answer:</summary><p> C

Explanation:

Event driven systems are good for IFTTT logic, but only polling will make a script wait to complete. ListStacks / list-stacks is a real method, GetStackStatus / get-stack-status is not. 

http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-stacks.html

</p></details><hr>

### QUESTION 167
Your application consists of 10% writes and 90% reads. You currently service all requests through a Route53 Alias Record directed towards an AWS ELB, which sits in front of an EC2 Auto Scaling Group. Your system is getting very expensive when there are large traffic spikes during certain news events, during which many more people request to read similar data all at the sametime.What is the simplest and cheapest way to reduce costs and scale with spikes like this?

- A. Create an S3 bucket and asynchronously replicate common requests responses into S3 objects. When are quest comes in for a precomputed response,redirecttoAWSS3.
- B. Create another ELB and Auto Scaling Group layer mounted on top of the other system, addinga tiertothesystem.Serve most read requests out of the top layer.
- C. Create a CloudFront Distribution and direct Route53 to the Distribution.
Use the ELB as an Origin and specify Cache Behaviours to proxy cache requests which can be servedlate.
- D. Create a Memcached cluster in AWS ElastiCache. Create cache logic to serve requests which can be served late from the in-memory cache for increased performance.

<details><summary>Answer:</summary><p> C

Explanation:

CloudFront is ideal for scenarios in which entire requests can be served out of a cache and usage patterns involve heavy reads and spikiness in demand.
A cache behavior is the set of rules you configure for a given URL pattern based on file extensions, file names, or any portion of a URL path on your website (e.g., \*.jpg). You can configure multiple cache behaviors for your web distribution. Amazon CloudFront will match incoming viewer requests with your list of URL patterns, and if there is a match, the service will honor the cache behavior you configure for that URL pattern. Each cache behavior can include the following Amazon CloudFront configuration values:
origin server name, viewer connection protocol, minimum expiration period, query string parameters, cookies, and trusted signers for private content. 

https://aws.amazon.com/cloudfront/dynamic-content/

</p></details><hr>

### QUESTION 168
You need to perform ad-hoc business analytics queries on well-structured data. Data comes in constantly at a high velocity. Your business intelligence team can understand SQL. What AWS service(s) should you look to first?

- A. Kinesis Firehose + RDS
- B. Kinesis Firehose + RedShift
- C. EMR using Hive
- D. EMR running Apache Spark

<details><summary>Answer:</summary><p> B

Explanation:

Kinesis Firehose provides a managed service for aggregating streaming data and inserting it into RedShift. RedShift also supports ad-hoc queries over well-structured data using a SQL-compliant wire protocol, so the business team should be able to adopt this system easily. 

https://aws.amazon.com/kinesis/firehose/details/

</p></details><hr>

### QUESTION 169
You are building a game high score table in DynamoDB. You will store each user's highest score for each game, with many games, all of which have relatively similar usage levels and numbers of players. You need to be able to look up the highest score for any game. What's the best DynamoDB key structure?

- A. HighestScore as the hash / only key.
- B. GameID as the hash key, HighestScore as the range key.
- C. GameID as the hash / only key.
- D. GameID as the range / only key.

<details><summary>Answer:</summary><p> B

Explanation:

Since access and storage for games is uniform, and you need to have ordering within each game for the scores (to access the highest value), your hash (partition) key should be the GameID, and there should be a range key for HighestScore. 

http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GuidelinesForTables.html#GuidelinesForTables.Partitions

</p></details><hr>

### QUESTION 170
What is server immutability?
    

- A. Not updating a server after creation.
- B. The ability to change server counts.
- C. Updating a server after creation.
- D. The inability to change server counts.

<details><summary>Answer:</summary><p> A

Explanation:

... disposable upgrades offer a simpler way to know if your application has unknown dependencies. The underlying EC2 instance usage is considered temporary or ephemeral in nature for the period of deployment until the current release is active. During the new release, a new set of EC2 instances are rolled out by terminating older instances. This type of upgrade technique is more common in an immutable infrastructure. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 171
You run a clustered NoSQL database on AWS EC2 using AWS EBS. You need to reduce latency for database response times. Performance is the most important concern, not availability. You did not perform the initial setup, someone without much AWS knowledge did, so you are not sure if they configured everything optimally. Which of the following is NOT likely to be an issue contributing to increased latency?

- A. The EC2 instances are not EBS Optimized.
- B. The database and requesting system are both in the wrong Availability Zone.
- C. The EBS Volumes are not using PIOPS.
- D. The database is not running in a placement group.

<details><summary>Answer:</summary><p> B

Explanation:

For the highest possible performance, all instances in a clustered database like this one should be in a single Availability Zone in a placement group, using EBS optimized instances, and using PIOPS SSD EBS Volumes. The particular Availability Zone the system is running in should not be important, as long as it is the same as the requesting resources. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html

</p></details><hr>

### QUESTION 172
Fill the blanks:______helps us track AWS API calls and transitions, ______helps to
understand what resources we have now, and ______allows auditing credentials and logins.

- A. AWS Config, CloudTrail, IAM Credential Reports
- B. CloudTrail, IAM Credential Reports, AWS Config
- C. CloudTrail, AWS Config, IAM Credential Reports
- D. AWS Config, IAM Credential Reports, CloudTrail

<details><summary>Answer:</summary><p> C

Explanation:

You can use AWS CloudTrail to get a history of AWS API calls and related events for your account. This includes calls made by using the AWS Management Console, AWS SDKs, command line tools, and higher-level AWS services. 

http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html
  
</p></details><hr>

### QUESTION 173
You are creating an application which stores extremely sensitive financial information. All information in the system must be encrypted at rest and in transit. Which of these is a violation of this policy?

- A. ELB SSL termination.
- B. ELB Using Proxy Protocol v1.
- C. CloudFront Viewer Protocol Policy set to HTTPS redirection.
- D. Telling S3 to use AES256 on the server-side.

<details><summary>Answer:</summary><p> A

Explanation:

Terminating SSL terminates the security of a connection over HTTP, removing the S for "Secure" in HTTPS. This violates the "encryption in transit" requirement in the scenario. 

http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html

</p></details><hr>

### QUESTION 174
You need to scale an RDS deployment. You are operating at 10% writes and 90% reads, based on your logging. How best can you scale this in a simple way?

- A. Create a second master RDS instance and peer the RDS groups.
- B. Cache all the database responses on the read side with CloudFront.
- C. Create read replicas for RDS since the load is mostly reads.
- D. Create a Multi-AZ RDS installs and route read traffic to standby.

<details><summary>Answer:</summary><p> C

Explanation:

The high-availability feature is not a scaling solution for read-only scenarios; you cannot use a standby replica to serve read traffic. To service read-only traffic, you should use a Read Replica. For more information, see Working with PostgreSQL, MySQL, and MariaDB Read Replicas. 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html

</p></details><hr>

### QUESTION 175
When thinking of AWS Elastic Beanstalk, the 'Swap Environment URLs' feature most directly aids in what?

- A. Immutable Rolling Deployments
- B. Mutable Rolling Deployments
- C. Canary Deployments
- D. Blue-Green Deployments

<details><summary>Answer:</summary><p> D

Explanation:

Simply upload the new version of your application and let your deployment service (AWS Elastic Beanstalk, AWS CloudFormation, or AWS OpsWorks) deploy a new version (green). To cut over to the new version, you simply replace the ELB URLs in your DNS records. Elastic Beanstalk has a Swap Environment URLs feature to facilitate a simpler cutover process. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 176 x
You need to create a simple, holistic check for your system's general availablity and uptime. Your system presents itself as an HTTP-speaking API. What is the most simple tool on AWS to achieve this with?

- A. Route53 Health Checks
- B. CloudWatch Health Checks
- C. AWS ELB Health Checks
- D. EC2 Health Checks

<details><summary>Answer:</summary><p> A

Explanation:

You can create a health check that will run into perpetuity using Route53, in one API call, which will ping your service via HTTP every 10 or 30 seconds.
Amazon Route 53 must be able to establish a TCP connection with the endpoint within four seconds. In addition, the endpoint must respond with an HTTP status code of 200 or greater and less than 400 within two seconds after connecting. 

http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html

</p></details><hr>

### QUESTION 177
What is the scope of an EC2 security group?

- A. Availability Zone
- B. Placement Group
- C. Region
- D. VPC

<details><summary>Answer:</summary><p> D

</p></details><hr>

### QUESTION 178
You run accounting software in the AWS cloud. This software needs to be online continuously during the day every day of the week, and has a very static requirement for compute resources. You also have other, unrelated batch jobs that need to run once per day at any time of your choosing. How should you minimize cost?

- A. Purchase a Heavy Utilization Reserved Instance to run the accounting software. Turn it off after hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also
applied to the batch jobs.
- B. Purchase a Medium Utilization Reserved Instance to run the accounting software. Turn it off after
hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also applied to the batch jobs.
- C. Purchase a Light Utilization Reserved Instance to run the accounting software. Turn it off after hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also
applied to the batch jobs.
- D. Purchase a Full Utilization Reserved Instance to run the accounting software. Turn it off after
hours.
Run the batch jobs with the same instance class, so the Reserved Instance credits are also applied to the batch jobs.

<details><summary>Answer:</summary><p> A
    

Explanation:

Because the instance will always be online during the day, in a predictable manner, and there are a sequence of batch jobs to perform at any time, we should run the batch jobs when the account software is off. We can achieve Heavy Utilization by alternating these times, so we should purchase the reservation as such, as this represents the lowest cost. There is no such thing a "Full" level utilization purchases on EC2. 

Have to check this [Additional Reserved Instance Options for Amazon EC2](https://amazonaws-china.com/blogs/aws/reserved-instance-options-for-amazon-ec2/)
https://d0.awsstatic.com/whitepapers/Cost_Optimization_with_AWS.pdf

</p></details><hr>

### QUESTION 179
Which EBS volume type is best for high performance NoSQL cluster deployments?

- A. io1
- B. gp1
- C. standard 
- D. gp2

<details><summary>Answer:</summary><p> A

Explanation:

io1 volumes, or Provisioned IOPS (PIOPS) SSDs, are best for: Critical business applications that require sustained IOPS performance, or more than 10,000 IOPS or 160 MiB/s of throughput per volume, like large database workloads, such as MongoDB. 

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html

</p></details><hr>

### QUESTION 180
You are building out a layer in a software stack on AWS that needs to be able to scale out to react to increased demand as fast as possible. You are running the code on EC2 instances in an Auto Scaling Group behind an ELB. Which application code deployment method should you use?

- A. SSH into new instances that come online, and deploy new code onto the system by pulling it from an S3 bucket, which is populated by code that you refresh from source control on new pushes.
- B. Bake an AMI when deploying new versions of code, and use that AMI for the Auto Scaling Launch Configuration.
- C. Create a Dockerfile when preparing to deploy a new version to production and publish it to S3. Use UserData in the Auto Scaling Launch configuration to pull down the Dockerfile from S3 and run it when new instances launch.
- D. Create a new Auto Scaling Launch Configuration with UserData scripts configured to pull the latest code at all times.

<details><summary>Answer:</summary><p> B

Explanation:

... the bootstrapping process can be slower if you have a complex application or multiple applications to install. Managing a fleet of applications with several build tools and dependencies can be a challenging task during rollouts. Furthermore, your deployment service should be designed to do faster rollouts to take advantage of Auto Scaling. 

https://d0.awsstatic.com/whitepapers/overview-of-deployment-options-on-aws.pdf

</p></details><hr>

### QUESTION 181
You need to perform ad-hoc analysis on log data, including searching quickly for specific error codes and reference numbers. Which should you evaluate first?

- A. AWS Elasticsearch Service
- B. AWS RedShift
- C. AWS EMR
- D. AWS DynamoDB

<details><summary>Answer:</summary><p> A

Explanation:

Amazon Elasticsearch Service (Amazon ES) is a managed service that makes it easy to deploy, operate, and scale Elasticsearch clusters in the AWS cloud. Elasticsearch is a popular open- source search and analytics engine for use cases such as log analytics, real-time application monitoring, and click stream analytics. 

http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/what-is-amazon-elasticsearch-service.html

</p></details><hr>

### QUESTION 182 x
Which status represents a failure state in AWS CloudFormation?

- A. <code>UPDATE_COMPLETE_CLEANUP_IN_PROGRESS</code> 
- B. <code>DELETE_COMPLETE_WITH_ARTIFACTS</code>
- C. <code>ROLLBACK_IN_PROGRESS</code>
- D. <code>ROLLBACK_FAILED</code>

<details><summary>Answer:</summary><p> C

Explanation:

ROLLBACK_IN_PROGRESS means an UpdateStack operation failed and the stack is in the process of trying to return to the valid, pre-update state. UPDATE_COMPLETE_CLEANUP_IN_PROGRESS means an update was successful, and CloudFormation is deleting any replaced, no longer used resources. ROLLBACK_FAILED is not a CloudFormation state (but UPDATE_ROLLBACK_FAILED is). DELETE_COMPLETE_WITH_ARTIFACTS does not exist at all. 

http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html

</p></details><hr>

### QUESTION 183
What is the scope of an EC2 EIP?

- A. Placement Group
- B. Availability Zone
- C. Region
- D. VPC

<details><summary>Answer:</summary><p> C

Explanation:

An Elastic IP address is tied to a region and can be associated only with an instance in the same region.

http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resources.html

</p></details><hr>

### QUESTION 184 x
For AWS Auto Scaling, what is the first transition state an existing instance enters after leaving steady state in Standby mode?

- A. Detaching
- B. T erminating:W ait
- C. Pending
- D. EnteringStandby

<details><summary>Answer:</summary><p> C

Explanation:

You can put any instance that is in an InService state into a Standby state. This enables you to remove the instance from service, troubleshoot or make changes to it, and then put it back into service. Instances in a Standby state continue to be managed by the Auto Scaling group. However, they are not an active part of your application until you put them back into service. 

http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html

</p></details><hr>

### QUESTION 185 *
You want to pass queue messages that are 1GB each. How should you achieve this?

- A. Use Kinesis as a buffer stream for message bodies. Store the checkpoint id for the placement in the Kinesis Stream in SQS.
- B. Use the Amazon SQS Extended Client Library for Java and Amazon S3 as a storage mechanism for message bodies.
- C. Use SQS's support for message partitioning and multi-part uploads on Amazon S3.
- D. Use AWS EFS as a shared pool storage medium. Store filesystem pointers to the files on disk in
the SQS message bodies.

<details><summary>Answer:</summary><p> B

Explanation:

You can manage Amazon SQS messages with Amazon S3. This is especially useful for storing and retrieving messages with a message size of up to 2 GB. To manage Amazon SQS messages with Amazon S3, use the Amazon SQS Extended Client Library for Java. 

http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/s3-messages.html

</p></details><hr>

### QUESTION 186 x
You are designing a service that aggregates clickstream data in batch and delivers reports to subscribers via email only once per week. Data is extremely spikey, geographically distributed, high-scale, and unpredictable. How should you design this system?

- A. Use a large RedShift cluster to perform the analysis, and a fleet of Lambdas to perform record inserts into the RedShift tables. Lambda will scale rapidly enough for the traffic spikes.
- B. Use a CloudFront distribution with access log delivery to S3. Clicks should be recorded as querystring GETs to the distribution. Reports are built and sent by periodically running EMR jobs over the access logs in S3.
- C. Use API Gateway invoking Lambdas which PutRecords into Kinesis, and EMR running Spark performing GetRecords on Kinesis to scale with spikes. Spark on EMR outputs the analysis to S3, which are sent out via email.
- D. Use AWS Elasticsearch service and EC2 Auto Scaling groups. The Autoscaling groups scale based on click throughput and stream into the Elasticsearch domain, which is also scalable. Use Kibana to generate reports periodically.

<details><summary>Answer:</summary><p> B

Explanation:

Because you only need to batch analyze, anything using streaming is a waste of money. CloudFront is a Gigabit-Scale HTTP(S) global request distribution service, so it can handle scale,
geo-spread, spikes, and unpredictability. The Access Logs will contain the GET data and work just fine for batch analysis and email using EMR.
Can I use Amazon CloudFront if I expect usage peaks higher than 10 Gbps or 15,000 RPS? Yes. Complete our request for higher limits here, and we will add more capacity to your account within two business days.

https://aws.amazon.com/cloudfront/faqs/

</p></details><hr>

### QUESTION 187
Your system automatically provisions EIPs to EC2 instances in a VPC on boot. The system provisions the whole VPC and stack at once. You have two of them per VPC. On your new AWS account, your attempt to create a Development environment failed, after successfully creating Staging and Production environments in the same region. What happened?

- A. You didn't choose the Development version of the AMI you are using.
- B. You didn't set the Development flag to true when deploying EC2 instances.
- C. You hit the soft limit of 5 EIPs per region and requested a 6th.
- D. You hit the soft limit of 2 VPCs per region and requested a 3rd.

<details><summary>Answer:</summary><p> C

Explanation:

There is a soft limit of 5 EIPs per Region for VPC on new accounts. The third environment could not allocate the 6th EIP. 

http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_vpc

</p></details><hr>

### QUESTION 188
To monitor API calls against our AWS account by different users and entities, we can use______
to create a history of calls in bulk for later review, and use______for reacting to
AWS API calls in real-time.

- A. AWS Config; AWS Inspector
- B. AWS CloudTrail; AWS Config
- C. AWS CloudTrail; CloudWatch Events
- D. AWS Config; AWS Lambda

<details><summary>Answer:</summary><p> C

Explanation:

CloudTrail is a batch API call collection service, CloudWatch Events enables real-time monitoring of calls through the Rules object interface.

https://aws.amazon.com/whitepapers/security-at-scale-governance-in-aws/

</p></details><hr>

### QUESTION 189
How does Amazon RDS multi Availability Zone model work?

- A. A second, standby database is deployed and maintained in a different availability zone from master, using synchronous replication.
- B. A second, standby database is deployed and maintained in a different availability zone from master using asynchronous replication.
- C. A second, standby database is deployed and maintained in a different region from master using asynchronous replication.
- D. A second, standby database is deployed and maintained in a different region from master using synchronous replication.

<details><summary>Answer:</summary><p> A

Explanation:

In a Multi-AZ deployment, Amazon RDS automatically provisions and maintains a synchronous standby replica in a different Availability Zone. 

http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.MultiAZ.html

</p></details><hr>

### QUESTION 190
Which of these is not an instrinsic function in AWS CloudFormation?

- A. Fn::Equals 
- B. Fn::If
- C. Fn::Not
- D. Fn::Parse

<details><summary>Answer:</summary><p> D

Explanation:

This is the complete list of Intrinsic Functions...: Fn::Base64, Fn::And, Fn::Equals, Fn::If, Fn::Not, Fn::Or,
Fn::FindInMap, Fn::GetAtt, Fn::GetAZs, Fn::Join, Fn::Select, 

Ref http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html

</p></details><hr>

### QUESTION 191
Which one of the following is a restriction of AWS EBS Snapshots?

- A. Sn a pshot rest or at i on s are rest ricted to the region in which the snapshots are created.
- B. You cannot share unencrypted snapshots.
- C. To share as n a pshot with a user in other region the snapshot has to be created in that region first.
- D. You cannot share as n a pshot containing sensitive data such as an AWS Access Key ID or AWS
Secret Access Key.

<details><summary>Answer:</summary><p> C

Explanation:

Shapshots shared with other users are usable in full by the recipient, including but limited to the ability to base modified volumes and snapshots.

Reference: http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html

</p></details><hr>

### QUESTION 192
What option below is the geographic limit of an EC2 security group?

- A. Security groups are global.
- B. They are confined to Placement Groups. 
- C. They are confined to Region s.
- D. They are confined to Availability Zones.

<details><summary>Answer:</summary><p> C

Explanation:

A security group is tied to a region and can be assigned only to instances in the same region.
  
You can't enable an instance to communicate with an instance outside its region using security group rules. Traffic from an instance in another region is seen as WAN bandwidth. 

Reference: http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resources.html

</p></details><hr>

### QUESTION 193
If designing a single playbook to run across multiple Linux distributions that have distribution specific commands, what would be the best method to allow a successful run?

- A. Enable fact gathering and use the `when` conditional to match the distribution to the task. 
- B. This isn't possible, a separate playbook for each target Linux distribution is required.
- C. Use `ignore_errors:true` in the tasks.
- D. Use the `shell` module to write your own checks for each command that is ran.

<details><summary>Answer:</summary><p> A

Explanation:

Ansible provides a method to only run a task when a condition is met using the `when` declarative. With gather facts enabled, the play has access to the distribution name of the Linux system, thus, tasks can be tailored to a specific distribution and ran only when the condition is met, e.g.: ` - when: ansible_os_family == "Debian"`.

Reference: http://docs.ansible.com/ansible/playbooks_conditionals.html

</p></details><hr>

### QUESTION 194
Which is the proper syntax for referencing a variable's value in an Ansible task?

- A. ${variable_name}
- B. {variable_name}
- C. "{{variable_name}}" 
- D. @variable_name

<details><summary>Answer:</summary><p> C

Explanation:

We use the variable's name to reference the variable which we encapsulate in curly brackets `{{ }}`; however, the YAML syntax dictates that a string beginning with a curly bracket denotes a dictionary value. To get around this it's proper to wrap the variable declaration in quotes. 

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#hey-wait-a-yaml-gotcha

</p></details><hr>

### QUESTION 195
If Erin has three clusters of server types that are all managed by Ansible and she needs to provision each cluster so that they are configured with their appropriate NTP server addresses. What is the best method Erin should use in Ansible for managing this?

- A. Write at as k that s can s then e two rk in the target hosts'region for the NTP server,registerthe resulting address so that the next task can write the NTP configuration.
- B. Bre a k down the hosts by region in the Ansible inventory file and assign an inventory group variable the NTP address value for the respective region. The playbook can contain just the single play referencing the NTP variable from the inventory.
- C. Create a playbook for each different region and store the NTP address in a variable in the play in the event the NTP server changes.
- D. Createthreeplays,each one has the hosts for their respective regions and set the NTP server address in each task.

<details><summary>Answer:</summary><p> B

Explanation:

While all four answers provided are correct, only B is the best choice. Ansible offers the ability to assign variables to groups of hosts in the inventory file. When the playbook is ran it will use the variables assigned to the group, even all the groups are specified in a single playbook run. The respective variables will be available to the play. This is easiest method to run, maintain and write.

Reference: http://docs.ansible.com/ansible/intro_inventory.html#group-variables

</p></details><hr>

### QUESTION 196
Which of the following is an invalid variable name in Ansible?

- A. host1st_ref 
- B. host-first-ref 
- C. Host1stRef 
- D. host_first_ref

<details><summary>Answer:</summary><p> B

Explanation:

Variable names can contain letters, numbers and underscores and should always start with a letter. Invalid variable examples, `host first ref`, `1st_host_ref`.

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#what-makes-a-valid-variable-name

</p></details><hr>

### QUESTION 197
What are the bare minimum requirements for a valid Ansible playbook?

- A. The hosts, connection type, fact gathering, vars and tasks. 
- B. The hosts declaration and tasks
- C. A YAML file with a single line containing `---`.
- D. At least one play with at least a hosts declaration

<details><summary>Answer:</summary><p> D

Explanation:

Ansible Playbooks are a series of plays and must contain at a minimum, one play. A play generally consists of hosts to run on, a list of tasks, variables and roles, and any additional instructions, such as connection type, fact gathering, remote username, etc. that the tasks will need to complete. The only requirement for a valid play is to declare the hosts. 

Reference: http://docs.ansible.com/ansible/playbooks_intro.html

</p></details><hr>

### QUESTION 198
When running a playbook on a remote target host you receive a Python error similar to "[Errno 13] Permission denied: `/home/nick/.ansible/tmp`. What would be the most likely cause of this problem?

- A. The user's home or `.ansible` directory on the Ansible system is not writeable by the user running the play.
- B. The specified user does not exist on the remote system.
- C. The user running `ansible-playbook` must run it from their own home directory.
- D. The user's home or `.ansible` directory on the Ansible remote host is not writeable by the user running the play

<details><summary>Answer:</summary><p> D

Explanation:

Each task that Ansible runs calls a module. When Ansible uses modules it copies the module to the remote target system. In the error above it attempted to copy it to the remote user's home directory and found that either the home directory or the `.ansible` directory were not writeable and thus could not continue.

Reference: http://docs.ansible.com/ansible/modules_intro.html

</p></details><hr>

### QUESTION 199
When Ansible's connection state is set to `remote`, what method of communication does Ansible utilize to run commands on the remote target host?

- A. SSH
- B. RSH
- C. PSExec
- D. API call to Ansible clien to n host

<details><summary>Answer:</summary><p> A

Explanation:

Ansible does not require a client/server architecture and makes all remote connections over SSH. Ansible utilizes the Paramiko Python libraries for SSH when the native system OpenSSH libraries do not meet the requirements. Also note, Ansible does require Python be installed on the target host. When the target host is Windows, it uses WinRS 

Reference: http://docs.ansible.com/ansible/intro_getting_started.html#remote-connection-information

</p></details><hr>

### QUESTION 200
Which resource can not be defined in an Ansible Playbook?

- A. FactGatheringState 
- B. HostGroups
- C. InventoryFile
- D. Variables

<details><summary>Answer:</summary><p> C

Explanation:

Ansible's inventory can only be specified on the command line, the Ansible configuration file or in environment variables.

Reference: http://docs.ansible.com/ansible/intro_inventory.html

</p></details><hr>

