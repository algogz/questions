### Question 1

What information is required to connect to an on-premises network router over VPN using Cloud Router for dynamic routing? 

Choose 3 correct answers: 
-  A) Remote Router DNS Name
-  B) Remote Router (Peer) IP Address
-  C) Shared Secret
-  D) Border Gateway Protocol Address (BGP)


<details><summary>Answer:</summary><p>
Correct answers B, C, and D 



Using Cloud Router for dynamic routing requires a BGP address along with the peer address and the shared secret for secure access.

</p></details><hr>

### Question 2

You want to ensure Dress4Win's sales and tax records remain available for infrequent viewing by auditors for at least 10 years. Cost optimization is your top priority. Which cloud services should you choose?

-  A) Google Bigtable with US or EU as location to store the data, and gcloud to access the data. 
-  B) BigQuery to store the data, and a web server cluster in a managed instance group to access the data. Google Cloud SQL mirrored across two distinct regions to store the data, and a Redis cluster in a managed instance group to access the data. 
-  C) Google Cloud Storage Nearline to store the data, and gsutil to access the data. 
-  D) Google Cloud Storage Coldline to store the data, and gsutil to access the data.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback:

A and B are not suitable for this type of task "infrequent viewing by auditors for at least 10 years" and they are not cost-effective, either 



D (Correct answer) - "for infrequent viewing by auditors" and "for at least 10 years" fit the usage pattern for Coldline and qualify Answer D for meeting the requirements "Cost optimization is your top priority" due to its lowest storage cost. 



Explanation: 

This is about choosing the storage solution for backup or achieving, depending the required access frequency which in turn impact the cost, you have the option between Nearline and Coldline.

https://cloud.google.com/images/storage/storage-classes-desktop.svg

</p></details><hr>

### Question 3

Mountkirk Games has deployed their new backend on Google Cloud Platform (GCP). You want to create a thorough testing process for new versions of the backend before they are released to the public. You want the testing environment to scale in an economical way.
 
How should you design the process?
-  A)Create a scalable environment in GCP for simulating production load. 
-  B) Build stress tests into each component of your application using resources internal to GCP to simulate load. 
-  C) Use the existing infrastructure to test the GCP-based backend at scale. 
-  D) Create a set of static environments in GCP to test different levels of load - for example, high, medium, and low.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A) (Correct Answer) With this disposable and repeatable testing resources, you can do load test whenever needed. Shutdown or stop the services or simplify delete and recreate it based on the test plans, to keep the cost low. 



It meets the requirements "create a thorough testing process for new versions of the backend before they are released to the public" and" testing environment to scale in an economical way". Doing thorough testing on production infrastructure is risky to other running application, not feasible, not scale in economical way. 



B) This is not scale nor economical and too complicated to implement. 



C) At first glance, reuse exiting environments so it'll be scalable, economical, and in real situation. If Read the case study again, we know Mountkirk Games is popular game platform targeting to global users with very high traffic and heavy load. Doing load test on the production is no longer an option, nor is it necessary a scale in an economical way if you mix the production and testing load. Comparing to the solution creating disposable and reputable testing environment simulating production load and execute test plans on demanding, Answer A is the winner. 



D) This is not scalable or economical

</p></details><hr>

### Question 4

You have been asked to select the storage system for the click-data of your company's large portfolio of websites. This data is streamed in from a custom website analytics package at a typical rate of 6,000 clicks per minute, with bursts of up to 8,500 clicks per second. It must be stored for future analysis by your data science and user experience teams.
 
Which storage infrastructure should you choose?
-  A) Google cloud Datastore 
-  B) Google Cloud SQL 
-  C) Google Cloud Bigtable 
-  D) Google Cloud Storage


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



A) Doesn't not meet this requirement "It must be stored for future analysis by your data science and user experience teams." Google Cloud Datastore is a NoSQL document database built for automatic scaling, high performance, and ease of application development and integrating well with App Engine. 



Datastore: A scalable, fully-managed NoSQL document database for your web and mobile applications. 



Good for: 

 - Semi-structured application data 

 - Hierarchical data 

 - Durable key-value data 



Workload: 

 - User profiles 

 - Product catalogs 

 - Game state 



B) Cloud SQL is mainly for OLTP (Transactional, CRUD) not for taking and storing streaming data. It does not have the scalability and elasticity to absorb this amount of data in real time. 



C) (Correct Answer) The reason is that data is in IoT nature and it will be used for analytics. 



Bigtable: A scalable, fully-managed NoSQL wide-column database that is suitable for both real-time access and analytics workloads. Bigtable is ideal for very large NoSQL datasets and is useful for high-speed transactions and analysis. It integrates well with ML. Dataproc, and analytics 



Good for 

 - Low-latency read/write access 

 - High-throughput analytics 

 - Native time series support 



Work load 

 - IoT, finance, adtech 

 - Personalization, recommendations 

 - Monitoring 

 - Geospatial datasets 

 - Graphs 



Although both Datastore and Bigtable are NoSQL databases, only Bigtable is able to support over a petabyte of data and is useful for high speed analytics as well, whereas Datastore is not. 



D) GCS is ideally for Object storage purpose although it has pretty good scalability. It's not suitable for IoT kind of spiky streaming data. Its buckets initially support roughly 1000 writes per second and then scale as needed. As the request rate for a given bucket grows, Cloud Storage automatically increases the IO capacity for that bucket by distributing the request load across multiple servers. Especially considering the click stream rate of 6,000 clicks per minute, with bursts of up to 8,500 clicks per second, the way GCS handle and absorb this kind high and low data stream by scale up and down make it not suitable for this task.

</p></details><hr>

### Question 5

Over time, you've created 5 snapshots of a single instance. To save space, you delete snapshots number 3 and 4. What has happened to the fifth snapshot?

-  A) The data from both snapshots 3 and 4 necessary for continuance are transferred to snapshot 5. 
-  B) It is no longer useable and cannot restore data. 
-  C) All later snapshots, including 5, are automatically deleted as well. 
-  D) The data from snapshot 4 necessary for continuance was transferred to snapshot 5, however snapshot 3's contents were transferred to snapshot 2.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



Deleting a snapshot: 

https://cloud.google.com/compute/docs/disks/restore-and-delete-snapshots 



When you delete a snapshot, Compute Engine immediately marks the snapshot as DELETED in the system. If the snapshot has no dependent snapshots, it is deleted outright. However, if the snapshot does have dependent snapshots: 



1) Any data that is required for restoring other snapshots is moved into the next snapshot, increasing its size. 

2) Any data that is not required for restoring other snapshots is deleted. This lowers the total size of all your snapshots. 

3) The next snapshot no longer references the snapshot marked for deletion, and instead references the snapshot before it. 



Because subsequent snapshots might require information stored in a previous snapshot, keep in mind that deleting a snapshot does not necessarily delete all the data on the snapshot. As mentioned in the first bullet above, if any data on a snapshot that is marked for deletion is needed for restoring subsequent snapshots, that data is moved into the next corresponding snapshot. To definitively delete data from your snapshots, you should delete all snapshots. 



The linked diagram below illustrates the process described above: https://cloud.google.com/compute/images/deleting-snapshot.png

</p></details><hr>

### Question 6

A small number of API requests to your microservices-based application take a very long time. You know that each request to the API can traverse many services. You want to know which service takes the longest in those cases. What should you do? 
-  A) Set timeouts on your application so that you can fail requests faster. 
-  B) Instrument your application with StackDriver Trace to break down the request latencies at each microservice. 
-  C) Send custom metrics for each of your requests to Stackdriver Monitoring. 
-  D) Use Stackdriver Monitoring to look for insights that show when your API latencies are high.


<details><summary>Answer:</summary><p>
Correct Answer B 



Explanation 



A) This won't be able to tell you directly where the bottleneck is. 



B) (Correct Answer) This is exactly StackDriver Trace comes to play. 



C) Without knowing where the bottleneck is beforehand, it's not easy, if not impossible, to setup custom metrics to capture the latency causes. Besides, the question itself is about to find where the latency/bottleneck exists. 



D) This could tell you when the API call latency reaching to certain threshold/criteria but can hardly tell where the root causes is without additional setup and analysis. 



Reference Resources:



Stackdriver Trace can help you answer the following questions: 

https://cloud.google.com/trace/docs/overview

• How long does it take my application to handle a given request? 

• Why is it taking my application so long to handle a request? 

• Why do some of my requests take longer than others? 

• What is the overall latency of requests to my application? 

• Has latency for my application increased or decreased over time? 

• What can I do to reduce application latency? 



"As micro-services become more popular, the cross-application tracing provided by Stackdriver Trace becomes essential in pinpointing the root cause of latency issues."

</p></details><hr>

### Question 7

The operations manager asks you for a list of recommended practices that she should consider when migrating a J2EE application to the cloud. Which three practices should you recommend? 

Choose 3 answers:
-  A) Port the application code to run on Google App Engine
-  B) Integrate Cloud Dataflow into the application to capture real-time metrics. 
-  C) Instrument the application with a monitoring tool like Stackdriver Debugger. 
-  D) Select an automation framework to reliably provision the cloud infrastructure. 
-  E) Deploy a continuous integration tool with automated testing in a staging environment. 
-  F) Migrate from MySQL to a managed NoSQL database like Google Cloud Datastore or Bigtable.


<details><summary>Answer:</summary><p>
Correct Answer A, E, and F 



Feedback:



A) (Correct answer) For Java applications, App Engine provides a J2EE standard servlet container with a complete Java 7 JVM and standard library. Because App Engine supports common Java API standards, your code stays clean and portable. 



B) Cloud Dataflow is a fully-managed service for transforming and enriching data in stream (real time) and batch (historical) modes. It is not necessary apply to J2EE migration to Cloud. 



C) If using GAE, no configuration is required for this feature - Google App Engine standard environment is configured to use Google Stackdriver Error Reporting and Debugger automatically. The following runtimes are supported (Java, Python, Go, PHP) for debugging at this time. 



D) GAE will take care of this for you: GAE is Fully managed serverless application platform. Build and deploy applications on a fully managed platform. Scale your applications seamlessly from zero to planet scale without having to worry about managing the underlying infrastructure. With zero server management and zero configuration deployments, developers can focus only on building great applications without the management overhead. 



E) (Correct answer) When you migrate, you would not move you J2EE application directly to production, you would do some testing before roll to production. Ideally automation CI tool should use in staging to test the any changes introduce including code and configuration before roll into production. 



F) (Correct answer) In GAE you can access Datastore which is built on top of Google's NoSQL database, Bigtable, and is subject to Bigtable's performance characteristics. 



Java Persistence API (JPA) is a standard interface for accessing databases in Java, providing an automatic mapping between Java classes and database tables. There is an open-source plugin available for using JPA with Datastore.

</p></details><hr>

### Question 8

TerramEarth's 20 million vehicles are scattered around the world. Based on the vehicle's location its telemetry data is stored in a Google Cloud Storage (GCS) regional bucket (US. Europe, or Asia). The CTO has asked you to run a report on the raw telemetry data to determine why vehicles are breaking down after 100 K miles. You want to run this job on all the data. What is the most cost-effective way to run this job?

-  A) Launch a cluster in each region to preprocess and compress the raw data, then move the data into a regional bucket and use a Cloud Dataproc cluster to finish the job. 
-  B) Move all the data into 1 region, then launch a Google Cloud Dataproc cluster to run the job. 
-  C) Launch a cluster in each region to preprocess and compress the raw data, then move the data into a multi-region bucket and use a Dataproc cluster to finish the job. 
-  D) Move all the data into 1 zone, then launch a Cloud Dataproc cluster to run the job.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct answer) Since the raw data are saved based on the vehicle's location all over the world, most likely they'll scatter in many different regions and eventually they need to move to a centralized location for final processing. 



Preprocessing raw data and compressing them from each location to reduce the size so to save the between-region data egress cost. 



Dataproc is Zone-specific resources and since you want to run this job on all data and you or your group probably are the only consumers for the data, moving the data into a regional bucket same or closest to the DataProc cluster zone's region for final analysis is most cost effective. 



Use a regional location to help optimize latency, availability, and network bandwidth for data consumers grouped in the same region. 



Use a multi-regional location when you want to serve content to data consumers that are outside of the Google network and distributed across large geographic areas. 

• Store frequently accessed data, or data that needs to be geo-redundant as Multi-Regional Storage. 



B) Since the raw data are save based on the vehicles' location all over the world, moving them to a centralized region without preprocessing and compressing would incur additional between-region data egress cost 



C) Dataproc is Zone-specific resources and since you want to run this job on all data and data consumption occurs in a centralized location, then moving the data into a multi-region bucket for Dataproc cluster jobs is not most cost effective. 



Use a multi-regional location when you want to serve content to data consumers that are outside of the Google network and distributed across large geographic areas. 

• Store frequently accessed data, or data that needs to be geo-redundant as Multi-Regional Storage.

</p></details><hr>

### Question 9

Your company just finished a rapid lift and shift to Google Compute Engine for your compute needs. You have another 9 months to design and deploy a more cloud-native solution. Specifically, you want a system that is no-ops and auto-scaling. Which options of following compute products should you choose? 

Choose 2 answers:
-  A) Google Container Engine with containers 
-  B) Compute Engine with custom instance types
-  C) Google App Engine Standard Environment
-  D) Compute Engine with containers
-  E) Compute Engine with managed instance groups


<details><summary>Answer:</summary><p>
Correct Answer A and C 



Feedback: 

Ordering the answers from most to least "no-ops" since "you want a system that is no-ops and auto-scaling.": 



C) (Part of correct answer): This is most to "no-ops and auto-scaling" since App Engine is fully managed. 



A) (Part of correct answer): The 2nd most toward "no-ops" 



D) The Third most to "no-ops" 



E) The least to "no-ops", but the instance could be predefined or custom type, so put it slightly closer to "no-ops" than answer B 



B The least "no-ops" 



Note: You may also consider D, E, and B as similar level of "no-ops" 



Also, C (AppEngine) and A (Container Engine) both have the autoscale capability 



So, the correct answers are A and C 



Reference Resource:

You can imagine a spectrum where, at one end, you have most of the responsibilities for resource management and, at the other end, 



Google has most of those responsibilities: 

https://cloud.google.com/docs/images/overview/ops-continuum.svg

</p></details><hr>

### Question 10

Your company's test suite is a custom C++ application that runs tests throughout each day on Linux virtual machines. The full test suite takes several hours to complete, running on a limited number of on premises servers reserved for testing. Your company wants to move the testing infrastructure to the cloud, to reduce the amount of time it takes to fully test a change to the system, while changing the tests as little as possible. 

Which cloud infrastructure should you recommend? 
-  A) Google Cloud Dataproc to run Apache Hadoop jobs to process each test 
-  B) Google App Engine with Google Stackdriver for logging 
-  C) Google Compute Engine managed instance groups with auto-scaling 
-  D) Google Compute Engine unmanaged instance groups and Network Load Balancer


<details><summary>Answer:</summary><p>
Correct Answer C Feedback 



A) Apache Hadoop run Java not C++; If the questions meant to use Hadoop to manage and process the test, it's overkill and also need significant changes to the testing infrastructure to integrate with Dataproc. 



B) App Engine did not natively support C++, also it's probably hard to port their "runs tests throughout each day on Linux virtual machines" to App Engine "while changing the tests as little as possible"; StackDriver logging won't help porting the test to GCP, either. 



Between C and D, the main difference is managed or unmanaged instance group 



Unmanaged instance groups are groups of dissimilar instances that you can arbitrarily add and remove from the group. Unmanaged instance groups do not offer autoscaling, rolling update support, or the use of instance templates so Google recommends creating managed instance groups whenever possible. Use unmanaged instance groups only if you need to apply load balancing to your pre-existing configurations or to groups of dissimilar instances. 



https://cloud.google.com/compute/docs/instance-groups/ 



From the question there is no such requirement for unmanaged instance group and not mention that dissimilar Linux machine types are required. 



In addition, judging from what they suffered "The full test suite takes several hours to complete, running on a limited number of on premises servers", it seems they simply need more computation power - bigger and/or more instances for the testing. So the managed instance group with autoscaling is the preferred.

</p></details><hr>

### Question 11

Operational parameters such as oil pressure are adjustable on each of TerramEarth's vehicles to increase their efficiency, depending on their environmental conditions. Your primary goal is to increase the operating efficiency of all 20 million cellular and unconnected vehicles in the field. 

How can you accomplish this goal?
-  A) Have your engineers inspect the data for patterns, and then create an algorithm with rules that make operational adjustments automatically. 
-  B) Implement a Google Cloud Dataflow streaming job with a sliding window and use Google Cloud Messaging (GCM) to make operational adjustments automatically. 
-  C) Capture all operating data, train machine learning models that identify ideal operations, and host in Google Cloud Machine Learning (ML) Platform to make operational adjustments automatically. 
-  D) Capture all operating data, train machine learning models that identify ideal operations, and run locally to make operational adjustments automatically.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback:

A) This won't work - the engineer simply won't be able just to inspect the data for patterns for 20 million vehicles whether the algorithm created run local or in-cloud 



B) Without data analytics and machine learning, the two technologies just won't create meaningful algorithm for operational adjustments automatically. Besides, majority (99%) of the 20M vehicles are unconnected and the two technologies have to run on GCP for scalability so there is no way to communicated between local and GCP for adjustments automatically. 



C) Again, majority (99%) of the 20M vehicles are unconnected and if the trained model was host in Google Cloud Machine Learning (ML) Platform then there is no way to use the model generated parameters to command the field vehicles to make operational adjustments automatically. 



D) (Correct Answer) After creating good ML model by "Capture all operating data, train machine learning models that identify ideal operations", you can run the model in the vehicle to make operational adjustments automatically based on each specific vehicle's parameters. Probably run the model in the onboard computer or computer connected to the maintenance port. 



TerramEarth connection related Information in the Case Study. There are 20 million TerramEarth vehicles in operation that collect 120 fields of data per second. Data is stored locally on the vehicle and can be accessed for analysis when a vehicle is serviced. The data is downloaded via a maintenance port. This same port can be used to adjust operational parameters, allowing the vehicles to be upgraded in the field with new computing modules. 



Approximately 200,000 vehicles are connected to a cellular network, allowing TerramEarth to collect data directly.

</p></details><hr>

### Question 12

You need to regularly create disk level backups of the root disk of a critical instance. These backups need to be able to be converted into new instances that can be used in different projects. 

How should you do this?
-  A) Create snapshots, turn the snapshot into a custom image, and share the image across projects. 
-  B) Use the VM migration tools in Compute Engine to copy a VM to a different project. 
-  C) Create snapshots and share them to other projects. 
-  D) Stream your VM's data into Cloud Storage and share the exported data in the storage bucket with another project


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation:

A) (Correct answer) - The proper method is to create a custom image either from an existing, stopped instance, or snapshots of a boot disk, which can then be shared across projects and used to create additional instances. 



https://cloud.google.com/compute/docs/instances/create-start-instance 



B) Is for migration not for "regularly create disk level backups of the root disk of a critical instance". There are tools allowing copying (importing) on-premises virtual disk to Compute engine but you cannot copy GCP VM. 



C) Snapshots cannot be shared across projects. 



D) Doesn't meet the requirement "regularly create disk level backups of the root disk of a critical instance" nor is it easy to convert into new instance.

</p></details><hr>

### Question 13

Your company has decided to build a backup replica of their on-premises user authentication PostgreSQL database on Google Cloud Platform. The database is 4 TB, and large updates are frequent. Replication requires private address space communication. 

Which networking approach should you use? 
-  A) A Google Compute Engine instance with a VPN server installed connected to the data center network 
-  B) A NAT and TLS translation gateway installed on-premises 
-  C) Google Cloud Dedicated Interconnect 
-  D) Google Cloud VPN connected to the data center network


<details><summary>Answer:</summary><p>
Correct Answer C 



Explanation:



A) Single interconnect can be a single 10G link or a link bundle, connected to a single Google router.



B) Does not exist.



Answer A and B either are not applicable or feature doesn't not exist. 



C) (Correct answer) Both VPN and Dedicated Interconnect provide private address space communication. "The database is 4 TB, and large updates are frequent" makes the Dedicated Interconnect a suitable solution due to its bandwidth capability and SLA 



D) Each VPN tunnel has a max speed of 1.5 Gbps, though you can create multiple VPN tunnels to increase bandwidth, the internet connection from on-premises to GCP may be also a limiting factor 



Let assume VPN can reach to 1.5 Gbps speed, to transfer 4 TB data, you need: 



4000 * 1024/1.5 = 4096000 seconds, Approximately equal 47.4 days. 



This is maximum for full set of data replicating, though it won't really happen, but the math is here for the reference 



Reference 



Google Cloud Interconnect https://cloud.google.com/interconnect/ 



Dedicated Interconnect Overview

https://cloud.google.com/interconnect/docs/concepts/dedicated-overview



Diagram: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q13.png

</p></details><hr>

### Question 14

JencoMart wants to migrate their current computing environment to GCP. They want to modify their existing setup to scale for peak traffic instead of needing to provision in advance to meet peak load. When scaling, they want their machines to have as identical of performance as possible to their existing servers. What two actions can they take? 

Choose two:
-  A) Convert their compute environment into an App Engine application.
-  B) Set machine type to a custom machine type to match their current individual machines. 
-  C) Select the next step higher standard machine type to allow for capacity.
-  D) Create a managed instance group with autoscaling enabled to scale with demand.


<details><summary>Answer:</summary><p>
Correct answer B and D 



Explanation 



While they technically could convert their application into App Engine, it is not necessary to do so. A managed instance group that auto scales would meet their capacity requirements. For each instance group machine, they can use a custom machine type to match their current machine environment. 



JencoMart Existing Technical Environment 



JencoMart hosts all of its applications in 4 data centers: 3 in North American and 1 in Europe; most applications are dual-homed. ... ... ... 



Compute

• 30 machines in US West Coast, each machine has: 

• Twin, dual core CPUs

• 32GB of RAM

• Twin 250 GB HDD (RAID 1) 

• 20 machines in US East Coast, each machine has: 

• Single, dual-core CPU

• 24 GB of RAM

• Twin 250 GB HDD (RAID 1)

</p></details><hr>

### Question 15

Your company has successfully migrated to the cloud and wants to analyze their data stream to optimize operations. They do not have any existing code for this analysis, so they are exploring all their options. These options include a mix of batch and stream processing, as they are running some hourly jobs and live-processing some data as it comes in. 

Which technology should they use for this? 
-  A) Google Cloud Dataflow
-  B) Google Compute Engine with Google BigQuery
-  C) Google Container Engine with Bigtable
-  D) Google Cloud Dataproc


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



Cloud Dataflow (https://cloud.google.com/dataflow/) is a fully-managed service for transforming and enriching data in stream (real time) and batch (historical) modes with equal reliability and expressiveness - no more complex workarounds or compromises needed. And with its serverless approach to resource provisioning and management, you have access to virtually limitless capacity to solve your biggest data processing challenges, while paying only for what you use. 



Cloud Dataflow unlocks transformational use cases across industries, including: 

• check Clickstream, Point-of-Sale, and segmentation analysis in retail

• check Fraud detection in financial services

• check Personalized user experience in gaming

• check IoT analytics in manufacturing, healthcare, and logistics



Dataflow acts as your data processing pipeline for ETL functions on both streaming and batch data. 

Diagram: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q15.png

</p></details><hr>

### Question 16

JencoMart is evaluating what managed services (if any) they can migrate their databases to, and which databases will need to be modified to do so. Of their Oracle and PostgreSQL databases, which one needs to be modified, and what service(s) can they move to? 

Choose two:
-  A) Oracle will need to be modified into a relational database and can be hosted on Cloud Spanner. 
-  B) PostgreSQL will need to be modified to NoSQL and can be hosted on Datastore.
-  C) Oracle can be imported without modification and can be hosted on Cloud Bigtable. 
-  D) PostgreSQL can be imported without modification and can be hosted on Cloud SQL.


<details><summary>Answer:</summary><p>
Correct answer A and D 



Explanation 



Oracle is a relational database and cannot be imported into a managed GCP storage option. It will need to be converted to a relational database and can be hosted on Cloud Spanner. Although Cloud SQL would be the more direct 'lift and shift' option, it only holds up to 10TB (their existing database is 20TB) and Spanner can support that amount using additional nodes. PostgreSQL can be migrated in its current form, as Cloud SQL natively supports PostgreSQL as well. 



JencoMart Existing Technical Environment - Database

Oracle Database stores user profiles

• 20 TB

PostgreSQL database stores user credentials

</p></details><hr>

### Question 17

You have created several preemptible Linux virtual machine instances using Google Compute Engine. You want to properly shut down your application before the virtual machines are preempted. 

What should you do? 
-  A) Create a shutdown script registered as a xinetd service in Linux and configure a StackDriver endpoint check to call the service.
-  B) Create a shutdown script, registered as a xinetd service in Linux, and use the gcloud compute instances add-metadata command to specify the service URL as the value for a new metadata entry with the key shutdown-script-url
-  C) Create a shutdown script named k99.shutdown in the /etc/rc.6.d/ directory. 
-  D) Create a shutdown script and use it as the value for a new metadata entry with the key shutdown-script in the Cloud Platform Console when you create the new virtual machine instance.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



Running Shutdown Scripts: Create and run shutdown scripts that execute commands right before an instance is terminated or restarted, on a best-effort basis. This is useful if you rely on automated scripts to start up and shut down instances, allowing instances time to clean up or perform tasks, such as exporting logs, or syncing with other systems. https://cloud.google.com/compute/docs/shutdownscript 



To setup Shutdown Scripts, go to GCP console and follow the steps: 

Compute Engine -> VM instance -> Create Instance -> (Expand) Management, disks, networking, SSH keys 



Enter the key "shutdown-script" and proper value (Diagram Link): https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q17.png

</p></details><hr>

### Question 18

You need to allow traffic from specific virtual machines in 'subnet-a' network access to machines in 'subnet-b' without giving the entirety of subnet-a access. 

How can you accomplish this?
-  A) Create a firewall rule to allow traffic from resources with specific network tags, then assign the machines in subnet-a the same tags.
-  B) Relocate the subnet-a machines to a different subnet and give the new subnet the needed access.
-  C) Create a rule to deny all traffic to the entire subnet, then create a second rule with higher priority giving access to tagged VM's in subnet-a.
-  D) You can only grant firewall access to an entire subnet and not individual VM's inside.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



A) (Correct answer) Network tags allow more granular access based on individually tagged instances - Instances by target tags: The firewall rule is applicable only to VMs if they have a matching network tag. 



B) This would give the entire subnet access which is against the requirements: allow traffic from specific virtual machines in 'subnet-a' network access to machines in 'subnet-b' without giving the entirety of subnet-a access. 



C) Creating overlapping rules with higher priority might technically work, but since traffic defaults to denied if no rule is in place, this is unnecessary. Assigning rules and instances by tags is the best answer. 



D) This is not true per answer A

</p></details><hr>

### Question 19

A news feed web service has the following code running on Google App Engine. During peak load, users report that they can see news articles they already viewed. 

1. import news
2. from flash import flask, redirect request
3. from flask.ext.api import status
4. from google.appengineapl import users
5. app = falsk (__name__)
6. sessions = {}
7. @app. Route ("/")
8. def homepage ():
9. user = users.get current_user ()
10. if not user:
11. return "invalid login", status.http_401_uhautorized
12. if user not in session:
13. sessions [user] {"viewed"} :- }
14. news_articles = news.get_new_news (user, session [user] {"viewed"}
15. sessions[user] {"viewed"} += [n["id"] for n in news_artides]
16. return news, render (news articles)
17. if __name__ == "__main__":
18. app.run()

What is the most likely cause of this problem?
 
-  A) The session variable is local to just a single instance. 
-  B) The session variable is being overwritten in Cloud Datastore.
-  C) The URL of the API needs to be modified to prevent caching. 
-  D) The HTTP Expires header needs to be set to -1 to stop caching.


<details><summary>Answer:</summary><p>
Correct Answer A 



Detailed Explanation 



Answer A is the correct - The session variable is local to just a single instance. 



The question described "users report that they can see news articles they already viewed", which means the correct behavior is, user should only be able to read article they did not reviewed before. 



Here is how: 



Line 6 declared new session variable: sesions = {}, initially is empty

Then the code somehow gets the all user, and somehow get the article

Line 13, 14, 15: basically, save the article(s) the current specific user viewed in session variable. The sessios variable is key value pair data type, key is "viewed", value is a list VIEWED [article 1, article 2...]. Of course, if THE user just started or never viewed nay article, the list would be empty 

Remember that session variable host list articles only if they viewed by that user 



Then you deploy and run the app in AppEngine. "During peak load" most likely means you have many instances run the same codebase independently from each other. If a user hit instance #9, read an article A, then made another request, most likely he'd hit another instance, say #1000. The session variable in the code running in instance #1000 would not have had that information and the article A might be displayed again treated as not viewed before.

</p></details><hr>

### Question 20

One of the microservices in your application has an intermittent performance problem. You have not observed the problem when it occurs but when it does, it triggers a particular burst of log lines. You want to debug a machine while the problem is occurring. 

What should you do? 
-  A) Log into one of the machines running the microservice and wait for the log storm.
-  B) In the Stackdriver Error Reporting dashboard, look for a pattern in the times the problem occurs.
-  C) Configure your microservice to send traces to Stackdriver Trace so you can find what is taking so long.
-  D) Set up a log metric in Stackdriver Logging, and then set up an alert to notify you when the number of log lines increases past a threshold.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback:



A) Logging into an individual machine may not see the specific performance problem as multiple machines may be in the configuration and reducing the chances of interacting with an intermittent performance problem. 



B) Error reporting won't necessarily catch the log lines unless they are stack traces in the proper format. Additionally, just because there is a pattern doesn't mean you will know exactly when and where to log in to debug. 



C) Trace may tell you where time is being spent but won't let you know in on the exact host that the problem is occurring on because you generally only send samples of traces. There is also no alerting on traces to notify exactly when the problem is happening. 



D) (Correct Answer) - Since you know that there is a burst of log lines you can set up a metric that identifies those lines. Stackdriver will also allow you to set up a text, email or messaging alert that can notify promptly when the error is detected so you can hop onto the system to debug. 



Additional Resource:

https://cloud.google.com/logging/docs/logs-based-metrics/

</p></details><hr>

### Question 21

To ensure that your application will handle the load even if an entire zone fails, what should you do? 
-  A) Don't select the "Multizone" option when creating your managed instance group.
-  B) Spread your managed instance group over two zones and overprovision by 100%. (for Two Zone)
-  C) Create a regional unmanaged instance group and spread your instances across multiple zones.
-  D) Overprovision your regional managed instance group by at least 50%. (for Three Zones)


<details><summary>Answer:</summary><p>
Correct answer B and D 



Feedback:



B) is correct if one zone fails you still have 100% desired capacity in another zone 



D) is correct since you have at least total 150% desired capacity spread over 3 zones, each zone has 50% capacity. You'll have 100% desired capacity in two zones if any single zone failed at given time. 



Reference Resources: 

https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups 



If you are creating a regional managed instance group in a region with at least three zones, Google recommends overprovisioning your instance group by at least 50%.

</p></details><hr>

### Question 22

You are creating a single preemptible VM instance named "preempt" to be used as scratch space for a single workload. If your VM is preempted, you need to ensure that disk contents can be re-used. 

Which gcloud command would you use to create this instance? 
-  A) gcloud compute instances create "preempt" --preemptible --no-boot-disk-auto-delete
-  B) gcloud compute instances create "preempt" --preemptible --boot-disk-auto-delete=no
-  C) gcloud compute instances create "preempt" --preemptible
-  D) gcloud compute instances create "preempt" --no-auto-delete


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



A (Correct answer) - Specifying '--no-boot-disk-auto-delete' preserves the disk. This flag is not enabled by default so if not specify, it causes the disk to be auto-deleted. 



B - The default is boot disk automatically delete and no flag needed, also the syntax is incorrect for this type of flags 



C - if you don't specify '--no-boot-disk-auto-delete'. The default would be boot disk automatically delete Here is the corresponding console setting displaying the default option (Diagram Link):

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q22.png



D - when instance created without this flag: --preemptible, it'll be standard instance 



Here is the corresponding console setting in "Availability Policy" when you create instance with --preemptible flag (Diagram Link):

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q22.1.png

</p></details><hr>

### Question 23

You want to make a copy of a production Linux virtual machine in the US-Central region. You want to manage and replace the copy easily if there are changes on the production virtual machine. You will deploy the copy as a new instance in a different project in the US-East region. 

What steps must you take? 
-  A) Use the Linux dd and netcat commands to copy and stream the root disk contents to a new virtual machine instance in the US-East region.
-  B) Create a snapshot of the root disk and select the snapshot as the root disk when you create a new virtual machine instance in the US-East region.
-  C) Create an image file from the root disk with Linux dd command, create a new disk from the image file, and use it to create a new virtual machine instance in the US-East region.
-  D) Create a snapshot of the root disk, create an image file in Google Cloud Storage from the snapshot, and create a new virtual machine instance in the US-East region using the image file for the root disk.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback:

A) This approach affects performance of the existing machine and incurs significant network costs. 



B) This approach does not allow you to create the VM in the new project since snapshots are limited to the project in which they are taken. 



C) dd will not work correctly on a mounted disk. 



D) (Correct Answer) - This approach meets all of the requirements, it is easy to do and works cross project and cross region. 



Reference Resources:

https://cloud.google.com/compute/docs/images/sharing-images-across-projects

</p></details><hr>

### Question 24

A lead software engineer tells you that his new application design uses websockets and HTTP sessions that are not distributed across the web servers. You want to help him ensure his application will run properly on Google Cloud Platform. 

What should you do? 
-  A) Help the engineer to convert his websocket code to use HTTP streaming. 
-  B) Review the encryption requirements for websocket connections with the security team. 
-  C) Meet with the cloud operations team and the engineer to discuss load balancer options.
-  D) Help the engineer redesign the application to use a distributed user session service that does not rely on websockets and HTTP sessions.


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback:

A) There is no compelling reason to move away from websockets as part of a move to GCP. 



B) This may be a good exercise anyway, but it doesn't really have any bearing on the GCP migration. 



C) (Correct Answer) The HTTP(S) load balancer in GCP handles websocket traffic natively. Backends that use WebSocket to communicate with clients can use the HTTP(S) load balancer as a front end, for scale and availability. 



D) There is no compelling reason to move away from websockets as part of a move to GCP.

</p></details><hr>

### Question 25

JencoMart has decided to migrate user profile storage to Google Cloud Datastore and the application servers to Google Compute Engine (GCE). During the migration, the existing infrastructure will need access to Datastore to upload the data. 

What service account key-management strategy should you recommend?
-  A) Provision service account keys for the on-premises infrastructure and use Google Cloud Platform (GCP) managed keys for the VMs 
-  B) Authenticate the on-premises infrastructure with a user account and provision service account keys for the VMs.
-  C) Deploy a custom authentication service on GCE/Google Container Engine (GKE) for the on-premises infrastructure and use GCP managed keys for the VMs.
-  D) Provision service account keys for the on-premises infrastructure and for the GCE virtual machines (VMs).


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback:



A) (correct answer) This addresses both of data migration and application server migration properly. 



"Provision service account keys for the on-premises infrastructure": For code running on systems outside Google, you cannot use GCP-managed keys. You need to create Service account for it and provision User-managed keys. These keys are created, downloadable, and managed by users - This is solution for on-premises access to GCP datastore during migration 



"use Google Cloud Platform (GCP) managed keys for the VMs" - this is solution for Application server migration since there is no external access to GCP is required during the migration. 



Answer B is incorrect: First, the applications running on-premises to access GCP Datastore assume the identity of the service account to call Google APIs, so that the users aren't directly involved. 



Secondly, for the application server migration to GCP VMs, you can use GCP managed keys for the VMs. It's simple and effective. There is no need to provision and manage keys (User-managed keys) by yourself for the VMs. 



GCP-managed keys are used by Cloud Platform services such as App Engine and Compute Engine. These keys cannot be downloaded. Google will keep the keys and automatically rotate them on an approximately weekly basis. 



C) is incorrect in the solution for on-premises access to GCP Datastore - This is possible options that might require more setup than worthwhile for the requirements. 



D) is incorrect for reason of application server migration: you can use GCP managed keys for the VMs. It's simple and effective. There is no need to provision and manage keys (User-managed keys) by yourself for the application VMs

</p></details><hr>

### Question 26

Your company processes high volumes of IoT data that are time-stamped. The total data volume can be several petabytes. The data needs to be written and changed at a high speed. You want to use the most performant storage option for your data. 

Which product should you use? 
-  A) Cloud Datastore 
-  B) Cloud Storage
-  C) Cloud Bigtable 
-  D) BigQuery


<details><summary>Answer:</summary><p>
Correct answer C 



Feedback:

A) is not correct because Cloud Datastore is not the most performant product for frequent writes or timestamp-based queries. 



B) is not correct because Cloud Storage is designed for object storage not for this type of data ingestion and collection. 



C) is correct because Cloud Bigtable is the most performant storage option to work with IoT and time series data. 



D) is not correct because although it can store the data, BigQuery is very slow at changing data. 



Reference:

Cloud Bigtable Schema Design for Time Series Data: 



https://cloud.google.com/bigtable/docs/schema-design-time-series

</p></details><hr>

### Question 27

You set up an autoscaling instance group to serve web traffic for an upcoming launch. After configuring the instance group as a backend service to an HTTP(S) load balancer, you notice that virtual machine (VM) instances are being terminated and re-launched every minute. The instances do not have a public IP address. You have verified the appropriate web response is coming from each instance using the curl command. You want to ensure the backend is configured correctly. 

What should you do? 
-  A) Ensure that a firewall rule exists to allow source traffic on HTTP/HTTPS to reach the load balancer. 
-  B) Create a tag on each instance with the name of the load balancer. Configure a firewall rule with the name of the load balancer as the source and the instance tag as the destination. 
-  C) Ensure that a firewall rule exists to allow load balancer health checks to reach the instances in the instance group. 
-  D) Assign a public IP to each instance and configure a firewall rule to allow the load balancer to reach the instance public IP.


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback:

A) Firewall controls access at instance level, not load balancer. Must allow load balancer traffic to connect backend instance allowing health check 



B) At this moment it is not possible to set firewall rules over the GCE Load Balancers. You need to create firewall rules that at subnet or instances level allowing specific health check IP ranges (See Answer A above), not the LB tags, to connect to all your load balanced instances. 



C) (correct answer) HTTP health check probes are sent from the IP ranges depending on LB types used. These are IP address ranges that the load balancer uses to connect to backend instances. You must create firewall rules that allows traffic from those ranges to reach your instances 



For Network load balancing 



When a health check is used with Network load balancing, the health check probes come from addresses in the ranges 209.85.152.0/22, 209.85.204.0/22, and 35.191.0.0/16. 



For HTTP(S). SSL proxy. TCP proxy, and Internal load balancing

When a health check is used with HTTP(S), SSL proxy, TCP proxy, or Internal load balancing, the health check probes come from addresses in the ranges 130.211.0.0/22 and 35.191.0.0/16. 



D) This is not mandatory since your LB could be Internal load balancing so instances' external IPs may be removed

</p></details><hr>

### Question 28

You are working on a project with two compliance requirements. The first requirement states that your developers should be able to see the Google Cloud Platform billing charges for only their own projects. The second requirement states that your finance team members can set budgets and view the current charges for all projects in the organization. The finance team should not be able to view the project contents. You want to set permissions. 

What should you do? 
-  A) Add the finance team members to the default IAM Owner role. Add the developers to a custom role that allows them to see their own spend only. 
-  B) Add the finance team members to the Billing Administrator role for each of the billing accounts that they need to manage. Add the developers to the Viewer role for the Project. 
-  C) Add the developers and finance managers to the Viewer role for the Project. 
-  D) Add the finance team to the Viewer role for the Project. Add the developers to the Security Reviewer role for each of the billing accounts.


<details><summary>Answer:</summary><p>
Correct answer B 



Feedback:

B) (Correct Answer) Is correct because it uses the principle of least privilege for IAM roles; use the Billing Administrator IAM role for that job function. 



A, C, and D are not correct because is it a Google best practice to use pre-defined IAM roles when they exist and match your business scenario; see the link below. 



Reference

IAM for Billing:

</p></details><hr>

### Question 29

Dress4Win has configured a new uptime check with Google Stackdriver for several of their legacy services. The Stackdriver dashboard is not reporting the services as healthy. 

What should they do?
-  A) In the Cloud Platform Console download the list of the uptime servers' IP addresses and create an inbound firewall rule 
-  B) Install the Stackdriver agent on all of the legacy web servers. 
-  C) Configure their legacy web servers to allow requests that contain user-Agent HTTP header when the value matches GoogleStackdriverMonitoring- UptimeChecks (https://cloud.google.com/monitoring) 
-  D) Configure their load balancer to pass through the User-Agent HTTP header when the value matches GoogleStackdriverMonitoring-UptimeChecks (https://cloud.google.com/monitoring)


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



A) (Correct Answer) "If you are checking a service that is behind a firewall, you can configure your service's firewall to accept traffic from the current set of IP addresses used for uptime checking (Getting uptime-check IP addresses 



https://cloud.google.com/monitoring/uptime-checks/#monitoring_uptime_check_list_ips-console). https://cloud.google.com/monitoring/uptime-checks/#identifying_uptime_check_traffic): 



GoogleStackdriverMonitoring-UptimeChecks 

(https://cloud.google.com/monitoring): 



Regardless on instance or LoadBalancer level, as long as the firewall allowed, this user-agent can pass through; also, there is no feature supporting User-Agent header value associated firewall rule configuration. 



Additional Resource 



For your quick reference, here are the part of Dress4win existing Application servers in a single data center location: 

• Tomcat - Java micro-services

• Nginx - static content

• Apache Beam - Batch processing

</p></details><hr>

### Question 30

In moving their test and development environments to Google Cloud, what is the best practice for Dress4Win to follow to ensure proper isolation between both environments using the principle of least privilege? 
-  A) Separate the test and dev environments into different projects, giving each team access to only their own projects. 
-  B) Separate the test and dev environments into different projects, with each team sharing a single account to access each. 
-  C) Host both environments in the same project but different VPC's. 
-  D) Separate the test and dev environments into different projects, with different levels of access for each team.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



A) (Correct answer) For least privilege and separation of duties, the best practice is to separate both environments into different projects, development or test team gets their own accounts, and each team is assigned to only their projects. 



The best practices: 

• You should not use same account for both Development and Test environments regardless how do you create projects inside that account for different environments. You should use different account for each environment which associated with different group of users. You should use project to isolate user access to resource not to manage users. 



• Using a shared VPC allows each team to individually manage their own application resources, while enabling each application to communicate between each other securely over RFC1918 address space. So VPC's isolate resources but not user/service accounts. 



Answers B, C, and D are incorrect 



B) is the scenario that use same account for both development and test environments attempting to isolate user access with different projects 



C) is the scenario that use same account for both development and test environments with same project attempting to isolate user access with network separation. Note, VPC's isolate resources but not user or service accounts. 



D) is the scenario that use same account for both development and test environments attempting to isolate user access with different projects 



You can add team members to projects you own and grant the members different levels of access to the project's resources and APIs. This is not the best practice for managing users and their privileges with different environments. It might work for small shop but not for the origination size like Dress4Win. 



Reference Resources 

Here is the Dress4Win Solution Concept (partial): 



"For the first phase of their migration to the cloud, Dress4win is considering moving their development and test environments..."

</p></details><hr>

### Question 31

Mountkirk Games wants to set up a real-time analytics platform for their new game. The new platform must meet their technical requirements. 

Which combination of Google technologies will meet all of their requirements?
-  A) Cloud Dataflow, Cloud Storage, Cloud Pub/Sub, and BigQuery 
-  B) Cloud SQL, Cloud Storage, Cloud Pub/Sub, and Cloud Dataflow 
-  C) Container Engine, Cloud Pub/Sub, and Cloud SQL 
-  D) Cloud Pub/Sub, Compute Engine, Cloud Storage, and Cloud Dataproc 
-  E) Cloud Dataproc, Cloud Pub/Sub, Cloud SQL, and Cloud Dataflow


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



(see Mountkirk Games case study for details or below for briefing summary) 



For requirements: Process incoming data on the fly directly from the game servers - Cloud Dataflow (Both 

Stream and Batch), reference architect component , we can eliminate C and D since they don't have DataFlow 

C - Container Engine, Cloud Pub/Sub, and Cloud SQL 

D - Cloud Pub/Sub, Compute Engine, Cloud Storage, and Cloud Dataproc 

For requirements: Allow SQL queries to access at least 10 TB of historical data - BigQuery, reference architect 



component, we can eliminate B and E since they don't have BigQuery 



B - Cloud SQL, Cloud Storage, Cloud Pub/Sub, and Cloud Dataflow 



E - Cloud Dataproc, Cloud Pub/Sub, Cloud SQL, and Cloud Dataflow 



The only correct answer left is A, which meets all of their requirements 



A - Cloud Dataflow, Cloud Storage, Cloud Pub/Sub, and BigQuery 



Below is a reference architect Google recommending for similar scenario in data collection and analysis 



https://cloud.google.com/solutions/mobile/mobile-gaming-analysis-telemetry 



Building a Mobile Gaming Analytics Platform - a Reference Architecture (Diagram Link):

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q31.png



Mountkirk Games real-time analytics platform 



Solution Concept 



Mountkirk Games is building a new game, which they expect to be very popular. They plan to deploy the game's backend on Google Compute Engine so they can capture streaming metrics, run intensive analytics, and take advantage of its autoscaling server environment and integrate with a managed NoSQL database. 



Technical Requirements 



Requirements for Game Analytics Platform

• Dynamically scale up or down based on game activity - Compute engine, container engine, Cloud Storage

• Process incoming data on the fly directly from the game servers - Cloud Dataflow (Both Stream and Batch) 

• Process data that arrives late because of slow mobile networks - Cloud Pub/Sub

• Allow SQL queries to access at least 10 TB of historical data - BigQuery

• Process files that are regularly uploaded by users' mobile devices - Cloud Pub/Sub

• Use only fully managed services - BigQuery, DataFlow, Cloud SQL

</p></details><hr>

### Question 32

Your company is forecasting a sharp increase in the number and size of Apache Spark and Hadoop jobs being run on your local datacenter. You want to utilize the cloud to help you scale this upcoming demand with the least amount of operations work and code change.
 
Which product should you use?
-  A) Google Cloud Dataflow 
-  B) Google Compute Engine 
-  C) Google Container Engine 
-  D) Google Cloud Dataproc


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



Cloud Dataproc is the only choice in the answers you can (almost) directly map to your on-premises Apache Spark/Hadoop platform and meet the requirements "scale this upcoming demand with the least amount of operations work and code change". 



Cloud Dataproc is a fast, easy-to-use, fully-managed cloud service for running Apache Spark and Apache Hadoop clusters in a simpler, more cost-efficient way. Operations that used to take hours or days take seconds or minutes instead, and you pay only for the resources you use (with per-second billing). Cloud Dataproc also easily integrates with other Google Cloud Platform (GCP) services, giving you a powerful and complete platform for data processing, analytics and machine learning. 

https://cloud.google.com/dataproc/

</p></details><hr>

### Question 33

Your customer is receiving reports that their recently updated Google App Engine application is taking approximately 30 seconds to load for some of their users. This behavior was not reported before the update. 

What strategy should you take? 
-  A) Work with your ISP to diagnose the problem. 
-  B) Open a support ticket to ask for network capture and flow data to diagnose the problem, then roll back your application. 
-  C) Roll back to an earlier known good release initially, then use Stackdriver Trace and logging to diagnose the problem in a development/test/staging environment. 
-  D) Roll back to an earlier known good release, then push the release again at a quieter period to investigate. Then use Stackdriver Trace and logging to diagnose the problem.


<details><summary>Answer:</summary><p>
Correct Answer C 



Explanation 



A - You ISP normally won't help in this level. Also, the problem most likely is caused by recent update. The good approach is to rollback first and then investigate later. Similarly, this also apply to answer B. 



To investigate this kind of issue, use Stackdriver Trace and logging to diagnose the bottleneck 



C and D have something in common for both "use Stackdriver Trace and logging", either in test/dev or in production environment and "Roll back to an earlier known good release". At this moment, only the "earlier known good release" version starts receiving traffic. 



The difference lines between C's "to diagnose the problem in a development/test/staging environment." and D's "then push the release again at a quieter period to investigate". 



If you want to debug in production environments, "then push the release again at a quieter period to investigate" is not necessary - you can simply switch "default" version or split the traffic between the "earlier known good release" version and the new problem version. 



Essentially D's "then push the release again at a quieter period to investigate" disqualifies itself as good answer - the default would be the new pushed version (the one with problem) starts receiving traffic "at a quieter period", and the slow loading users may not present. But with answer C in development/test/staging environment, you can arbitrarily load those suffering users if you know them or simulate production load to reveal the problem users and then do further investigation. 



So, C is the correct answer: First, rollback to "the earlier known good release" and then use the test/dev/staging envs to investigate. 



Additional Resource



https://cloud.google.com/appengine/docs/flexible/python/testing-and-deploying-your-app

</p></details><hr>

### Question 34

TerramEarth plans to connect all 20 million vehicles in the field to the cloud. This increases the volume to 20 million 600 byte records a second for 40 TB an hour. 

How should you design the data ingestion?
-  A) Vehicles write data directly to GCS. 
-  B) Vehicles stream data directly to Google BigQuery. 
-  C) Vehicles continue to write data using the existing system (FTP). 
-  D) Vehicles write data directly to Google Cloud Pub/Sub.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



Here is the volume to 20 million 600 byte records a second for 40 TB an hour streaming data need to ingest to and absorb by the system 



A - Vehicles write data directly to GCS - GCS is mainly for storage and it cannot stand for this amount of data streaming ingestion.



GCS is ideally for Object storage purpose although it has pretty good scalability. It's not suitable for IOT kind of streaming data. Its Buckets initially support roughly 1000 writes per second and then scale as needed. As the request rate for a given bucket grows, Cloud Storage automatically increases the IO capacity for that bucket by distributing the request load across multiple servers. Especially considering the volume to 20 million 600 byte records a second for 40 TB an hour streaming data, it makes unsuitable for this task. 



B - Vehicles stream data directly to Google BigQuery GCS - BigQuery is mainly for BI analysis though it also provides storage capacity and price similar to GCS and it cannot stand for this amount of data streaming ingestion 



C - Vehicles continue to write data using the existing system (FTP) - this is exiting solution we already know it's not scalable. Please refer to the case study for details 



D (Correct answer) - Vehicles write data directly to Google Cloud Pub/Sub - Pub/Sub is acting as 'shock absorber', allowing asynchronous messaging between large numbers of devices.

</p></details><hr>

### Question 35

You have data stored in a Cloud Storage dataset and also in a BigQuery dataset. You need to secure the data and provide 3 different types of access levels for your Google Cloud Platform users: administrator, read/write, and read-only. You want to follow Google-recommended practices. 

What should you do? 
-  A) Create 3 custom IAM roles with appropriate policies for the access levels needed for Cloud Storage and BigQuery. Add your users to the appropriate roles. 
-  B) At the Organization level, add your administrator user accounts to the Owner role, add your read/write user accounts to the Editor role, and add your read-only user accounts to the Viewer role. 
-  C) At the Project level, add your administrator user accounts to the Owner role, add your read/write user accounts to the Editor role, and add your read-only user accounts to the Viewer role. 
-  D) Use the appropriate pre-defined IAM roles for each of the access levels needed for Cloud Storage and BigQuery. Add your users to those roles for each of the services.


<details><summary>Answer:</summary><p>
Correct answer D 



Feedback 



D (Correct Answer) - D is correct because the principle of least privilege favors using pre-created roles with associated policies when they match your requirements. 



A, B, and C are not correct because it is a Google best practice to use pre-defined IAM roles when they exist and match your business scenario 



Reference

Storage Access Control

https://cloud.google.com/storage/docs/access-control/ 

BigQuery access control 

https://cloud.google.com/bigquery/docs/access-control 

IAM Overview 

https://cloud.google.com/iam/docs/overview 

Identity and Access Management https://cloud.google.com/iam/docs/overview

</p></details><hr>

### Question 36

Your office is connected to GCP via a VPN connection. How can you increase the speed of your VPN connection, assuming that your office Internet is not the bottleneck? 
-  A) Apply for a dedicated interconnect option 
-  B) Enable high speed routing in your VPN settings 
-  C) Create an additional VPN tunnel 
-  D) Submit request to increase bandwidth quota


<details><summary>Answer:</summary><p>
Correct answer C 



Explanation 



A - Apply for a dedicated interconnect option. A dedicated interconnect will also increase speeds, however the question asked how to speed up your VPN connection, not create a new type of connection. 



C (Correct answer) - Create an additional VPN tunnel. Each VPN tunnel has a max speed of 1.5 Gbps. However, you can create multiple VPN tunnels to increase bandwidth. 



Answer B and D either are not applicable or feature doesn't not exist.

</p></details><hr>

### Question 37

Using principal of least privilege and allowing for maximum automation, what steps can you take to store audit logs for long-term access and to allow access for external auditors to view? 

Choose two:
-  A) Generate a signed URL to the Stackdriver export destination for auditors to access. 
-  B) Create an account for auditors to have view access to Stackdriver Logging. 
-  C) Export audit logs to Cloud Storage via an export sink. 
-  D) Export audit logs to BigQuery via an export sink.


<details><summary>Answer:</summary><p>
Correct Answer A and C 



Explanation 



C (Correct answer) - Export audit logs to Cloud Storage via an export sink. Cloud Storage is perfect solution for long-term logs storage. 



There are 3 type of sink destinations you can export StackDriver Logs to: Cloud Storage, Cloud Pub/Sub, BigQuery. While you could export to BigQuery for low-cost storage, BigQuery is mainly and best for analysis not for long-term storage. Besides, whenever you need to do analysis with BigQuery, you can always easily export the logs from GCS to BigQuery or do query directly against data in GCS bucket. 



A (Correct answer) - You could either create a GCP account for auditor ACL object access or signed URL's depending on if they need to have a GCP account or not. Since the requirement is "allow access for external auditors to view", hence signed URL is the right choice 

B - Does not meet the "for long-term access" requirement 



D - It works but for the "for long-term access" storage consideration, Cloud Storage is better choice over BigQuery 



Additional Resources

https://cloud.google.com/logging/docs/export/

https://cloud.google.com/logging/docs/export/configure_export_v2

</p></details><hr>

### Question 38

Suppose you have a web server that is working properly, but you can't connect to its instance VM over SSH. Which of these troubleshooting methods can you use without disrupting production traffic? 

Select 3 answers:
-  A) Create a snapshot of the disk and use it to create a new disk; then attach the new disk to a new instance 
-  B) Use netcat to try to connect to port 22 
-  C) Access the serial console output 
-  D) Create a startup script to collect information.


<details><summary>Answer:</summary><p>
Correct answer A, B, and C 



Feedback 



Answers A, B, and C are valid methods to diagnose the problem without stop/start the instance. Answer D need to restart the instance for the script to take effect. 



Troubleshooting SSH

https://cloud.google.com/compute/docs/troubleshooting/troubleshooting-ssh 



Under certain conditions, it is possible that a Google Compute Engine instance no longer accepts SSH connections. There are many reasons this could happen, from a full disk to an accidental misconfiguration of sshd. This section describes a number of tips and approaches to troubleshoot and resolve common SSH issues. 



1) Check your firewall rules ... ... ...



2) Debug the issue in the serial console

You can enable read-write access to an instance's serial console so you can log into the console and troubleshoot problems with the instance. This is particularly useful when you cannot log in with SSH or if the instance has no connection to the network. The serial console remains accessible in both these conditions. 



3) Test the network

You can use the netcat tool to connect to your instance on port 22 and see if the network connection is working. If you connect and see an ssh banner (e.g. SSH-2.0-OpenSSH_6.0p1 Debian-4), your network connection is working, and you can rule out firewall problems. First, use the gcloud tool to obtain the external natIP for your instance: 



gcloud compute instances describe example-instance --format='get(networkInterfaces[0].accessConfigs[0].natIP)' 198.51.100.8 



Use the nc command to connect to your instance: # Check for SSH banner user@local:~$ nc [EXTERNAL.IP] 22 SSH-2.0-OpenSSH_6.0p1 Debian-4



4) Try a new user ... ... ...

5) Use your disk on a new instance ... ... ...



6) Inspect an instance without shutting it down

You might have an instance you can't connect to that continues to correctly serve production traffic. In this case, you might want to inspect the disk without interrupting the instance's ability to serve users. First, take a snapshot of the instance's boot disk, then create a new disk from that snapshot, create a temporary instance, and finally attach and mount the new persistent disk to your temporary instance to troubleshoot the disk. 



7) Use a startup script If none of the above helped, you can create a startup script to collect information right after the instance starts. Follow the instructions for running a startup script.

</p></details><hr>

### Question 39

You have a Kubernetes cluster with 1 node-pool. The cluster receives a lot of traffic and needs to grow. You decide to add a node. 

What should you do? 
-  A) Use "gcloud container clusters resize" with the desired number of nodes. 
-  B) Use "kubectl container clusters resize" with the desired number of nodes. 
-  C) Edit the managed instance group of the cluster and increase the number of VMs by 1. 
-  D) Edit the managed instance group of the cluster and enable autoscaling.


<details><summary>Answer:</summary><p>
Correct answer A 



Feedback:

A is correct because this resizes the cluster to the desired number of nodes. 



B is not correct because you need to use gcloud, not kubectl. 



C is not correct because you should not manually manage the MIG behind a cluster. 



D is not correct because you should not manually manage the MIG behind a cluster.

</p></details><hr>

### Question 40

Your App Engine application needs to store stateful data in a proper storage service. Your data is non-relational database data. You do not expect the database size to grow beyond 10 GB and you need to have the ability to scale down to zero to avoid unnecessary costs. 

Which storage service should you use? 
-  A) Cloud Datastore 
-  B) Cloud Dataproc 
-  C) Cloud SQL 
-  D) Cloud Bigtable


<details><summary>Answer:</summary><p>
Correct answer A 



Cloud Datastore is for storing non-relational/NoSQL data and scales down to zero and up to several TB, which fits all of the requirements. 



Datastore: A scalable, fully-managed NoSQL document database for your web and mobile applications. 



Good for: 

Semi-structured application data

Hierarchical data

Durable key-value data



Workload: 

User profiles

Product catalogs

Game state

</p></details><hr>

### Question 41

To reduce costs, the Director of Engineering has required all developers to move their development infrastructure resources from on-premises virtual machines (VMs) to Google Cloud Platform. These resources go through multiple start/stop events during the day and require state to persist. You have been asked to design the process of running a development environment in Google Cloud while providing cost visibility to the finance department. Which two steps should you take? 

Choose 2 answers:
-  A) Store all state in Google Cloud Storage, snapshot the persistent disks, and terminate the VM
-  B) Use the --no-auto-delete flag on all persistent disks and stop the VM. 
-  C) Apply VM CPU utilization label and include it in the BigQuery billing export.
-  D) Use Google BigQuery billing export and labels to associate cost to groups.
-  E) Use the -auto-delete flag on all persistent disks and terminate the VM.
-  F) Store all state into local SSD, snapshot the persistent disks, and terminate the VM.


<details><summary>Answer:</summary><p>
Correct answers are B and D



B (Correct Answer) - Use the --no-auto-delete flag on all persistent disks and stop the VM - with this flag set, when you terminate the instance, the persistence disk will not be deleted so the disk contents are preserved between start and stop. When the instance in stop status, you are only got charged for very low-cost disk storage

auto-delete for the given disk is enabled by default, use --no-auto-delete to disable.

https://cloud.google.com/sdk/gcloud/reference/compute/instances/set-disk-auto-delete

C - Apply VM CPU utilization label and include it in the BigQuery billing export - this is simply not doable D (Correct Answer) - Use Google BigQuery billing export and labels to associate cost to groups. Billing export to BigQuery enables you to export your daily usage and cost estimates automatically throughout the day to a BigQuery dataset you specify. You can then access your billing data from BigQuery. About labels: You'll see columns for labels in your BigQuery dataset, but for the current release some label values will be empty. Label export data will be populated at different times for different services, depending on when each service provides it. E - Use the -auto-delete flag on all persistent disks and terminate the VM - This is totally against the requirements. Since the instance is terminated and disk is gone when this flag is on, there is no way to restart the same instance and needless to say the disk content are not persisted. Answer A and F are incorrect, or at least not as good as Answer B - they are not a suitable solution for frequently start/stop and require state to persist. The correct answers are: Use the --no-auto-delete flag on all persistent disks and stop the VM., Use Google BigQuery billing export and labels to associate cost to groups.

</p></details><hr>

### Question 42

MountKirk Games needs to build out their streaming data analytics pipeline to feed from their game backend application. 

What GCP services in which order will achieve this?
-  A) Cloud Storage - Cloud Dataflow - BigQuery 
-  B) Cloud Dataproc - Cloud Storage - BigQuery 
-  C) Cloud Pub/Sub - Cloud Dataflow - Cloud Bigtable 
-  D) Cloud Pub/Sub - Cloud Dataflow - BigQuery


<details><summary>Answer:</summary><p>
Correct answer D 



Explanation 



Pub/Sub is kind of 'shock absorber', allowing asynchronous messaging between large numbers of devices. Cloud Dataflow acts as your data processing pipeline for ETL functions on both streaming and batch data. BigQuery is a data warehouse, able to run analysis on petabytes of data using SQL queries. 



Below is a reference architect Google recommending for similar scenario in Real-time streaming data collection and analysis https://cloud.google.com/solutions/mobile/mobile-gaming-analysis-telemetry 



Real-time processing of events from game clients and game servers(Diagram Link):

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q42.png





Data Transformation with Cloud Dataflow - Dataflow acts as your data processing pipeline for ETL functions on both streaming and batch data. (Diagram Link):

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q42.1.png

</p></details><hr>

### Question 43

Your company is planning the infrastructure for a new large-scale application that will need to store over 100 TB or a petabyte of data of data in NoSQL format for high-speed transactions and analytics. 

Which storage option should you use? 
-  A) Cloud Bigtable 
-  B) Cloud Spanner 
-  C) Cloud SQL 
-  D) Cloud Datastore


<details><summary>Answer:</summary><p>
Correct answer A 



Bigtable is ideal for very large NoSQL datasets and is useful for high-speed transactions and analysis. Bigtable: A scalable, fully-managed NoSQL wide-column database that is suitable for both real-time access and analytics workloads. Bigtable is ideal for very large NoSQL datasets and is useful for high-speed transactions and analysis. It integrates well with ML. Dataproc, and analytics 



Good for

Low-latency read/write access

High-throughput analytics

Native time series support



Work load

IoT, finance, adtech

Personalization, recommendations

Monitoring

Geospatial datasets

Graphs



Although both Datastore and Bigtable are NoSQL databases, Bigtable is able to support over a petabyte of data and is useful for high speed analytics as well, whereas Datastore is not.

</p></details><hr>

### Question 44

You created an update for your application on App Engine. You want to deploy the update without impacting your users. You want to be able to roll back as quickly as possible if it fails. 

What should you do? 
-  A) Delete the current version of your application. Deploy the update using the same version identifier as the deleted version. 
-  B) Notify your users of an upcoming maintenance window. Deploy the update in that maintenance window. 
-  C) Deploy the update as the same version that is currently running. 
-  D) Deploy the update as a new version. Migrate traffic from the current version to the new version.


<details><summary>Answer:</summary><p>
Correct answer D 



Feedback 



A and B are not correct because this will make the application temporarily unavailable to users. 



C is not correct because to roll back, you'll need to redeploy the previous deployment because the app was overwritten with the same version number. Therefore this takes longer than a rollback using method D. 



D is correct because this makes sure there is no downtime and you can roll back the fastest. 



Reference

Migrating and Splitting Traffic https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic

</p></details><hr>

### Question 45

You are designing a large distributed application with 30 microservices. Each of your distributed microservices needs to connect to a database back-end. You want to store the credentials securely. 

Where should you store the credentials? 
-  A) In a secret management system 
-  B) In the source code 
-  C) In an environment variable 
-  D) In a config file that has restricted access through ACLs


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct answer) - In a secret management system 



Applications often require access to small pieces of sensitive data at build or run time. These pieces of data are often referred to as secrets. Secrets are similar in concept to configuration files, but are generally more sensitive, as they may grant access to additional data, such as user data. https://cloud.google.com/kms/docs/secret-management 



B - In the source code: This is exactly again the best practice "Do not embed secrets related to authentication in source code, such as API keys, OAuth tokens, and service account credentials." (see below the best practice #1) 



C - In an environment variable - you use environment variable to point to the location where the secrets (credentials) are stored other than store the secrete directly (see below the best practice #1) 



D - In a configuration file that has restricted access through ACLs - Secrets are similar to but generally more sensitive than configuration and also, ACLs may not enough for the secrete management. Here is example for Storing secrets 



https://cloud.google.com/kms/docs/store-secrets 



Additional Resource

https://cloud.google.com/docs/authentication/production#providing_credentials_to_your_application 



Best practices for managing credentials 



Credentials provide access to sensitive data. The following practices help protect access to these resources: 

1) Do not embed secrets related to authentication in source code, such as API keys, OAuth tokens, and service account credentials. You can use an environment variable pointing to credentials outside of the application's source code, such as Cloud Key Management Service. 

2) Do use different credentials in different contexts, such as in testing and production environments. 

3) Do transfer credentials only over HTTPS to prevent a third party from intercepting your credentials. Never transfer in clear text or as part of the URL. 

4) Never embed long-lived credentials into your client-side app. For example, do not embed service account credentials into a mobile app. Client-side apps can be examined, and credentials can easily be found and used by a third party. 

5) Do revoke a token if you no longer need it.

</p></details><hr>

### Question 46

Based on TerramEarth's current data flow environment (refer to the image in the case study), what are the direct GCP services needed to replicate the same structure for batch uploads?
-  A) Cloud Spanner - Cloud SQL - BigQuery 
-  B) Cloud Dataflow - Cloud Bigtable - Cloud Dataproc 
-  C) Cloud Dataproc - Cloud Storage - BigQuery 
-  D) Cloud Storage - Cloud Dataflow - BigQuery


<details><summary>Answer:</summary><p>
Correct answer D 



Explanation 



Based on their current batch upload model, the direct equivalent would be to use Cloud Storage for storing files, Dataflow for their ETL processing, and BigQuery for their data warehouse needs. 



Below illustrates the solution concept. 



TerramEarth's Existing Technical Environment One Possible GCP solution for batch upload flow (Diagram Links):

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q46.png

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT1/PT1_Q46.1.png

</p></details><hr>

### Question 47

An application development team believes their current logging tool will not meet their needs for their new cloud-based product. They want a better tool to capture errors and help them analyze their historical log data. You want to help them find a solution that meets their needs. 

What should you do?
-  A) Send them a list of online resources about logging best practices. 
-  B) Help them define their requirements and assess viable logging tools. 
-  C) Help them upgrade their current tool to take advantage of any new features. 
-  D) Direct them to download and install the Google StackDriver logging agent.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



A and D can be ruled out for them are not general IT good practices. They need your help, not just simply to sell your products by pointing to a specific tool in your favor (D), or just give them a general best practice list (A) without insight opinions and further explains. 



B (Correct Answer) - Help them define their requirements and assess viable logging tools. They know the requirements and the existing tools' problems. While it's true StackDriver Logging and Error Reporting possibly meet all their requirements, there might be other tools also meet their need. They need you to provide expertise to make assessment for new tools, specifically, logging tools that can "capture errors and help them analyze their historical log data". 



C - Help them upgrade their current tool to take advantage of any new features. They have already used and known those tools' shortcomings. They need your help to find better one. Simply help them upgrade for new features is not enough and may not resolve the problems.

</p></details><hr>

### Question 48

You have a definition for an instance template that contains a web application. You are asked to deploy the application so that it can scale based on the HTTP traffic it receives. 

What should you do? 
-  A) Create a VM from the instance template. Create a custom image from the VM's disk. Export the image to Cloud Storage. Create an HTTP load balancer and add the Cloud Storage bucket as its backend service. 
-  B) Create a VM from the instance template. Create an App Engine application in Automatic Scaling mode that forwards all traffic to the VM. 
-  C) Create a managed instance group based on the instance template. Configure autoscaling based on HTTP traffic and configure the instance group as the backend service of an HTTP load balancer. 
-  D) Create the necessary amount of instances required for peak user traffic based on the instance template. Create an unmanaged instance group and add the instances to that instance group. Configure the instance group as the Backend Service of an HTTP load balancer.


<details><summary>Answer:</summary><p>
Correct answer C 



Feedback 



A Is not correct because the Load Balancer will just load balance access to the uploaded image itself, and not create or autoscale VMs based on that image. 



B Is not correct because while the App Engine can scale as a proxy, all requests will still end up on the same Compute Engine instance, which needs to scale itself. 



C is correct because a managed instance group can use an instance template to scale based on HTTP traffic. 



D is not correct because unmanaged instance groups do not offer autoscaling. 



Reference 

Managed instance groups and autoscaling 

https://cloud.google.com/compute/docs/instance-groups/#managed_instance_groups_and_autoscaling 



Exporting an Image https://cloud.google.com/compute/docs/images/export-image 



Adding a Cloud Storage Bucket to Content-based Load Balancing 



https://cloud.google.com/compute/docs/load-balancing/

http/adding-a-backend-bucket-to-content-based-load-balancing

</p></details><hr>

### Question 49

As part of your backup plan, you set up regular snapshots of Compute Engine instances that are running. You want to be able to restore these snapshots using the fewest possible steps for replacement instances. 

What should you do? 
-  A) Export the snapshots to Cloud Storage. Create disks from the exported snapshot files. Create images from the new disks. 
-  B) Export the snapshots to Cloud Storage. Create images from the exported snapshot files. 
-  C) Use the snapshots to create replacement disks. Use the disks to create instances as needed. 
-  D) Use the snapshots to create replacement instances as needed.


<details><summary>Answer:</summary><p>
Correct answer D 



Feedback:

D (Correct Answer) - D is correct because the scenario asks how to recreate instances. 



A, B, and C are not correct because the Google best practice of creating images from running Compute Engine instances is to first take a snapshot, export it to Cloud Storage, and then import that file as the basis for a custom image for use in DR scenarios 



Reference 



Choosing a storage option https://cloud.google.com/storage-options/

</p></details><hr>

### Question 50

For future phases, Dress4Win is looking at options to deploy data analytics to the Google Cloud. 

Which option meets their business and technical requirements? 
-  A) Run current jobs from the current technical environment on Google Cloud Dataproc. 
-  B) Review all current data jobs. Identify the most critical jobs and create Google BigQuery tables to store and query data. 
-  C) Review all current data jobs. Identify the most critical jobs and develop Google Cloud Dataflow pipelines to process data. 
-  D) Deploy a Hadoop/Spark cluster to Google Compute Engine virtual machines. Move current jobs from the current technical environment and run them on the Hadoop/Spark cluster.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct Answer) - There is no requirement to migrate the current jobs to a different technology. Using managed services where possible is a requirement. Using Google Cloud Dataproc allows the current jobs to be executed within Google Cloud Platform on a managed service offering. 



B - Migrating the existing data jobs to a different technology such as Google BigQuery, is not a requirement. 



C - Migrating existing data jobs to a different technology such as Google Cloud Dataflow, is not a requirement. 



D - Using managed services where possible is a requirement. The current jobs can run on a Hadoop/Spark cluster in Google Compute Engine but it is not a managed services solution. 



Both A and D are technically correct but D against one of tech requirements "Use managed services whenever possible." 



Dress4win Existing Technical Environment

Apache Hadoop/Spark servers: 

• Data analysis

• Real-time trending calculations



Technical Requirements

• Evaluate and choose an automation framework for provisioning resources in cloud. 

• Support failover of the production environment to cloud during an emergency. 

• Identify production services that can migrate to cloud to save capacity. 

• Use managed services whenever possible. 

• Encrypt data on the wire and at rest. 

• Support multiple VPN connections between the production data center and cloud environment.

</p></details><hr>

