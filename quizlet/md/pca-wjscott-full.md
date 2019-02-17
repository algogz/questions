# Default Title

### QUESTION 1 (wiirtctaon)

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

### QUESTION 2 (ywtedsatrr)

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

### QUESTION 3 (mghdtnbogc)

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

### QUESTION 4 (yhbatstssf)

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

### QUESTION 5 (otyc5soasi)

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

### QUESTION 6 (asnoartyma)

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

### QUESTION 7 (tomayfalor)

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

### QUESTION 8 (t2mvasatwb)

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

### QUESTION 9 (ycjfarlast)

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

### QUESTION 10 (yctsiaccat)

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

### QUESTION 11 (opsaopaaoe)

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

### QUESTION 12 (yntrcdlbot)

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

### QUESTION 13 (ychdtbabro)

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

### QUESTION 14 (jwtmtccetg)

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

### QUESTION 15 (ychsmttcaw)

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

### QUESTION 16 (jiewmsiatc)

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

### QUESTION 17 (yhcsplvmiu)

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

### QUESTION 18 (yntatfsvmi)

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

### QUESTION 19 (anfwshtfcr)

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

### QUESTION 20 (ootmiyahai)

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

### QUESTION 21 (tetyawhtle)

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

### QUESTION 22 (yacaspvin")

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

### QUESTION 23 (ywtmacoapl)

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

### QUESTION 24 (alsetythna)

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

### QUESTION 25 (jhdtmupstg)

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

### QUESTION 26 (ycphvoidta)

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

### QUESTION 27 (ysuaaigtsw)

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

### QUESTION 28 (yawoapwtcr)

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

### QUESTION 29 (dhcanucwgs)

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

### QUESTION 30 (imttadetgc)

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

### QUESTION 31 (mgwtsuarap)

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

### QUESTION 32 (ycifasiitn)

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

### QUESTION 33 (ycirrttrug)

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

### QUESTION 34 (tptca2mvit)

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

### QUESTION 35 (yhdsiacsda)

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

### QUESTION 36 (yoictgvavc)

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

### QUESTION 37 (upolpaafma)

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

### QUESTION 38 (syhawstiwp)

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

### QUESTION 39 (yhakcw1ntc)

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

### QUESTION 40 (yaeantssdi)

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

### QUESTION 41 (trctdoehra)

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

### QUESTION 42 (mgntbotsda)

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

### QUESTION 43 (yciptifanl)

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

### QUESTION 44 (ycaufyaoae)

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

### QUESTION 45 (yadaldaw3m)

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

### QUESTION 46 (botcdfertt)

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

### QUESTION 47 (aadtbtcltw)

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

### QUESTION 48 (yhadfaittc)

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

### QUESTION 49 (apoybpysur)

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

### QUESTION 50 (ffpdilaotd)

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

### QUESTION 51 (ycptmamdst)

Your company plans to migrate a multi-petabyte data set to the cloud. The data set must be available 24hrs a day. Your business analysts have experience only with using an SQL interface. How should you store the data to optimize it for ease of analysis? 

-  Load data into Google BigQuery.
-  Insert data into Google Cloud SQL. 
-  Put flat files into Google Cloud Storage. 
-  Stream data into Google Cloud Datastore.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct answer) - BigQuery is the only of these Google products that supports an SQL interface and a high enough SLA (99.9%) to make it readily available.

</p></details><hr>

### QUESTION 52 (tdathaytht)

The database administration team has asked you to help them improve the performance of their new database server running on Google Compute Engine. The database is for importing and normalizing their performance statistics and is built with MySQL running on Debian Linux. They have an n1-standard-8 virtual machine with 80 GB of SSD persistent disk. What should they change to get better performance from this system? 

-  Create a new virtual machine running PostgreSQL. 
-  Migrate their performance metrics warehouse to BigQuery. 
-  Increase the virtual machine's memory to 64 GB. 
-  Modify all of their batch jobs to use bulk inserts into the database. 
-  Dynamically resize the SSD persistent disk to 500 GB.


<details><summary>Answer:</summary><p>
Correct Answer E 



All of other answers are either not applicable or not specified by the question scenarios. 



The following console screenshot show the effect to IO performance by changing memory or disk - it's self-explained (please enlarge to see the details). Answer E is a clear straightforward winner over answer C as well as others. 



https://cloud.google.com/compute/docs/disks/add-persistent-disk



Adding or Resizing Persistent Disks

</p></details><hr>

### QUESTION 53 (ftqrtttcsy)

For this question, refer to the TerramEarth case study

You analyzed TerramEarth's business requirement to reduce downtime and found that they can achieve a majority of time saving by reducing customers' wait time for parts. You decided to focus on reduction of the 3 weeks aggregate reporting time. Which modifications to the company's processes should you recommend?

-  Migrate from CSV to binary format, migrate from FTP to SFTP transport, and develop machine learning analysis of metrics. 
-  Migrate from FTP to streaming transport, migrate from CSV to binary format, and develop machine learning analysis of metrics. 
-  Increase fleet cellular connectivity to 80%, migrate from FTP to streaming transport, and develop machine learning analysis of metrics.
-  Migrate from FTP to SFTP transport, develop machine learning analysis of metrics, and increase dealer local inventory by a fixed factor


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



B - Migrate from FTP to streaming transport, migrate from CSV to binary format, and develop machine learning analysis of metrics. 



If no cellular connection, then it cannot do streaming; CVS to binary does not necessary reduce the size (compress does). 



C (Correct answer) - Increase fleet cellular connectivity to 80%, migrate from FTP to streaming transport, and develop machine learning analysis of metrics. 



TerramEarth Existing Technical Environment New Solution: 80% going to streaming; 20% goes to Batch; No FTP 



GCP offers many ways to connect to PubSub and GCS such as IOT Type, rich client library, as well as gsutil for reliable, parallel, resumable upload data 



By increase fleet cellular connectivity to 80%, migrating from FTP to streaming transport, and the rest of 20% batch users for Cloud storage upload instead of FTP, majority of bottlenecked areas are covered and resolved. 



A and D can be eliminated for "Migrate from FTP to SFTP transport" since SFTP doesn't provide speed advantage over FTP nor the better solution with streaming. 



TerramEarth's Case Study - relevant information



Solution Concept

There are 20 million TerramEarth vehicles in operation that collect 120 fields of data per second. Data is stored locally on the vehicle and can be accessed for analysis when a vehicle is serviced. 



Approximately 200,000 vehicles are connected to a cellular network, allowing TerramEarth to collect data directly. At a rate of 120 fields of data per second, with 22 hours of operation per day, TerramEarth collects a total of about 9 TB/day from these connected vehicles. 



Existing Technical Environment

TerramEarth's existing architecture is composed of Linux-based systems that reside in a data center. These systems gzip CSV files from the field and upload via FTP, transform and aggregate them, and place the data in their data warehouse. Because this process takes time, aggregated reports are based on data that is 3 weeks old. 



Because the data is stale, some customers are without their vehicles for up to 4 weeks while they wait for replacement parts.

</p></details><hr>

### QUESTION 54 (ycsiaifaii)

You can SSH into an instance from another instance in the same VPC by its internal IP address, but not its external IP address. What is one possible reason why this is so?

-  The outgoing instance does not have correct permission granted to its service account. 
-  The external IP address is disabled. 
-  The firewall rule to allow SSH is restricted to the internal VPC.
-  The receiving instance has an ephemeral address instead of a reserved address.


<details><summary>Answer:</summary><p>
Correct answer C 



The firewall rule to allow SSH is restricted to the internal VPC 



Instances can have both Internal and External IP addresses. When connecting to another instance by its external address, you're going out of your internal network to the external Internet and coming back to access the instance by its external address. If traffic is restricted to the local VPC, it will reject this attempt as it is coming from an external source.

</p></details><hr>

### QUESTION 55 (yahtqttroa)

You are helping the QA team to roll out a new load-testing tool to test the scalability of your primary cloud services that run on Google Compute Engine with Cloud Bigtable. Which three requirements should they include? 

Choose 3 answers: 
-  Ensure all third-party systems your services used are capable of handling high load. 
-  Instrument the load-testing tool and the target services with detailed logging and metrics collection. 
-  Create a separate Google Cloud project to use for the load-testing environment. 
-  Instrument the production services to record every transaction for replay by the load- testing tool. 
-  Ensure that the load tests validate the performance of Cloud Bigtable. 
-  Schedule the load-testing tool to regularly run against the production environment.


<details><summary>Answer:</summary><p>
Correct Answer B, C, and E 



Feedback 



A - Ensure all third-party systems your services used are capable of handling high load 



This is out of scope - it's beyond your control. You may test them, but you cannot control them. If you have doubts the third-party dependencies causing the overall performance issue, you may use integration test to identify and isolate them. This should not be your focus. 



B (Correct answer) - Instrument the load-testing tool and the target services with detailed logging and metrics collection. 



This is normal requirement and practice for load testing to collect testing results with detailed measurable metric and historical logs otherwise load testing would be meaningless 



C (Correct answer) - Create a separate Google Cloud project to use for the load-testing environment. 



This is a good practice for least privileges and separation of responsibilities. 



D - Instrument the production services to record every transaction for replay by the load- testing tool. 



This would be way too much: not only the detailed instrumentation may impact the production performance, it's also possible the instrumentation itself distorts the test results - remember, Bigtable is for multiple terabyte or even petabyte NoSQL database for high throughput with low latency read and write. 



E (Correct answer) - Ensure that the load tests validate the performance of Cloud Bigtable. 



At first thought, it seems Bigtable is managed service seamlessly scaling, there is no need to load test it. But you probably already know, there are many factors impacting the Bigtable performance. The common one of them, poorly designed table structure. 



With poorly performed BigTable, the cluster would continue to scale, add more and more nodes, as the load increasing, cost more and more. Not matter how good is the cluster managed, this is exact situation that needs to prevent. In fact, tests validate the performance of Cloud Bigtable is one of the most important testing goals for BigTable performance. 



F - Schedule the load-testing tool to regularly run against the production environment. 



You should not do load testing RGULARLY against production environment; In fact, somebody has suggested Load test in production should avoid entirely. 



More Resource 



Understanding Cloud Bigtable Performance 

https://cloud.google.com/bigtable/docs/performance

</p></details><hr>

### QUESTION 56 (ychrambfyp)

Your company has reserved a monthly budget for your project. You want to be informed automatically of your project spend so that you can take action when you approach the limit. What should you do?

-  Link a credit card with a monthly limit equal to your budget. 
-  Create a budget alert for desired percentages such as 50%, 90%, and 100% of your total monthly budget. 
-  In App Engine Settings, set a daily budget at the rate of 1/30 of your monthly budget. 
-  In the GCP Console, configure billing export to BigQuery. Create a saved view that queries your total spend.


<details><summary>Answer:</summary><p>
Correct answer B 



Feedback 



A is not correct because this will just give you the spend but will not alert you when you approach the limit. 



B Is correct because a budget alert will warn you when you reach the limits set. 



C Is not correct because those budgets are only on App Engine, not other GCP resources. Furthermore, this makes subsequent requests fail, rather than alert you in time so you can mitigate appropriately. 



D is not correct because if you exceed the budget, you will still be billed for it. Furthermore, there is no alerting when you hit that limit by GCP. 



Reference 



AppEngine Spending Limit https://cloud.google.com/appengine/pricing#spending_limit 



Set Budgets and Alerts https://cloud.google.com/billing/docs/how-to/budgets

</p></details><hr>

### QUESTION 57 (ftqrttmgcs)

For this question, refer to the MountKirk Games case study:
 
MountKirk Games needs to set up their game backend database. Based on their requirements, which storage service best fits their needs?

-  Cloud SQL 
-  Cloud Dataflow 
-  Host database on a Compute Engine NoSQL instance. 
-  Cloud Datastore


<details><summary>Answer:</summary><p>
Datastore meets their requirements. 



Datastore: A scalable, fully-managed NoSQL document database for your web and mobile applications. 



Good for: 

Semi-structured application data

Hierarchical data

Durable key-value data



Workload: 

User profiles

Product catalogs

Game state



Additional Resource 



Google reference solution https://cloud.google.com/solutions/gaming/dedicated-server-gaming-solution/

</p></details><hr>

### QUESTION 58 (ywteyrgcec)

You want to enable your running Google Container Engine cluster to scale as demand for your application changes. What should you do?
 
Select one:
-  Add additional nodes to your Container Engine cluster using the following command:
gcloud container clusters resize CLUSTER_NAME --size 10
-  Add a tag to the instances in the cluster with the following command:
gcloud compute instances add-tags INSTANCE --tags enable-autoscaling max-nodes-10
-  Update the existing Container Engine cluster with the following command:
gcloud container clusters update CLUSTER_NAME --enable-autoscaling --min-nodes=l --max-nodes=10
-  Create a new Container Engine cluster with the following command:
gcloud container clusters create CLUSTER_NAME --enable-autoscaling --min-nodes=l --max-nodes=10 and redeploy your application


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



A - Add additional nodes to your Container Engine cluster using the following command 



gcloud container clusters resize CLUSTER_NAME --size 10 



This is for a running cluster to resize an existing cluster to a provided size. 



B - Add a tag to the instances in the cluster with the following command: 

gcloud compute instances add-tags INSTANCE --tags enable-autoscaling max-nodes-10 



First this is command for adding tags to instance, second simply adding tag will not automatically enable autoscaling. 



C (Correct answer) - Update the existing Container Engine cluster with the following command: 

gcloud container clusters update CLUSTER_NAME --enable-autoscaling --min-nodes=l --max-nodes=10 



This is the right command, please see "Enabling autoscaling for an existing node pool" 



D - Create a new Container Engine cluster with the following command, and redeploy your application gcloud container clusters create CLUSTER_NAME --enable-autoscaling --min-nodes=l --max-nodes=10 



This is the command enable autoscaling when you create the cluster not for running cluster. Please see "Creating a cluster with autoscaling" 



Reference Resource

Kubernetes Engine >> Cluster Autoscaler 



https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-autoscaler 



gcloud container clusters resize 

https://cloud.google.com/sdk/gcloud/reference/container/clusters/resize

</p></details><hr>

### QUESTION 59 (tartaychaa)

The application reliability team at your company has added a debug feature to their backend service to send all server events to Google Cloud Storage for eventual analysis.
 
The event records are at least 50 KB and at most 15 MB and are expected to peak at 3,000 events per second. You want to minimize data loss. Which process should you implement?

-  
· Append metadata to file body.
· Compress individual files.
· Name files with a random prefix pattern.
Save files to one bucket

-  
· Batch every 10,000 events with a single manifest file for metadata.
· Compress event files and manifest file into a single archive file.
· Name files using serverName-EventSequence.
Create a new bucket if bucket is older than 1 day and save the single archive file to the new bucket. Otherwise, save the single archive file to existing bucket.

-  
· Compress individual files.
· Name files with serverName-EventSequence.
· Save files to one bucket
Set custom metadata headers for each object after saving.

-  
· Append metadata to file body.
· Compress individual files.
· Name files with serverName-Timestamp.
Create a new bucket if bucket is older than 1 hour and save individual files to the new bucket. Otherwise, save files to existing bucket


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 

Avoid using sequential filenames such as timestamp-based filenames if you are uploading many files in parallel. Because files with sequential names are stored consecutively, they are likely to hit the same backend server, meaning that throughput will be constrained. In order to achieve optimal throughput, you can add the hash of the sequence number as part of the filename to make it non-sequential https://cloud.google.com/storage/docs/best-practices 



Answer A (Correct) - since it uses "Name files with a random prefix pattern." 



Answer C , B, and D are incorrect since they use either "Name files with serverName-EventSequence" Or "Name files with serverName-Timestamp" which will cause the files unevenly distributed in the backend. For example, a specific server may generate much more events than other, or at certain time period the system may generate much more events than other period...

</p></details><hr>

### QUESTION 60 (ftqrttmgcs)

For this question, refer to the Mountkirk Games case study
 
Mountkirk Games needs to create a repeatable and configurable mechanism for deploying isolated application environments. Developers and testers can access each other's environments and resources, but they cannot access staging or production resources. The staging environment needs access to some services from production.
What should you do to isolate development environments from staging and production?

-  Create a project for development and test and another for staging and production. 
-  Create a network for development and test and another for staging and production. 
-  Create one subnetwork for development and another for staging and production. 
-  Create one project for development, a second for staging and a third for production.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



A (Correct answer) - among the available answers, A is a closest solution to meet the isolate and inter-access requirements. 



One of possible full solution is to use the concept of Cross Project VPC or shared VPC for isolation with project and finer grained access control with network. Shared VPC allows each team to individually manage their own application resources, while enabling each application to communicate between each other securely over RFC1918 address space. 



In this example, you'll create one Host project for Developer and Tester and another Host project for staging and production 



B - This is incomplete or nor a best solution. Network isolation is for separation of resources communication, project is for IAM resource access control. 



If the question meant putting resources in different networks but in same project, it's not enough to separate developer from access Stage/Product unless access policy is set at each specific resource level which is not only against the best practice but also hard to manage especially if you consider Mountkirk Games is not a small shop. 



Answer C is incorrect for same or similar reasons. 



Answer D indeed enables the isolation but also disables the sharing since Dev and Test need to access each other's environments and resources and Stage need some access to Production 



On the other hand, if the quest meant Developer and tester are in same group called Development (based on "What should you do to isolate development environments from staging and production?"), D could be an answer since it isolates the development from staging and production, though no inter-project access issues addressed. 



Overall, judging from Mountkirk Games application, environments, and company size, most likely they'll have separated Development and Testing while they do share access some resources such as access testing data as well as computing resources. So, Answer A is option closer to the requirements.

</p></details><hr>

### QUESTION 61 (ycpahvobra)

Your company places a high value on being responsive and meeting customer needs quickly. Their primary business objectives are release speed and agility. You want to reduce the chance of security errors being accidentally introduced. Which two actions can you take? 

Choose 2 answers:
-  Use source code security analyzers as part of the CI/CD pipeline. 
-  Ensure you have stubs to unit test all interfaces between components. 
-  Ensure every code check-in is peer reviewed by a security SME. 
-  Run a vulnerability security scanner as part of your continuous-integration /continuous- delivery (CI/CD) pipeline. 
-  Enable code signing and a trusted binary repository integrated with your CI/CD pipeline.


<details><summary>Answer:</summary><p>
Correct Answer A and D 



Feedback 



A (Correct answer) - it's generally considered as a good practice to Use source code security analyzers static or code analyzer as part of the CI/CD pipeline. 



D (Correct Answer) - Run a vulnerability security scanner as part of your continuous-integration /continuous- delivery (CI/CD) pipeline - it's generally considered as a good practice to do Security scanning of the application and infrastructure as part of the CI/CD pipeline. 



B - Ensure you have stubs to unit test all interfaces between components - this is just one of specific approaches unit testing your code not for security errors detection. 



C and E- The process is not required for an agile practice and it would slow down not speed up the release. Also, those do not specifically have added value for security error detection

</p></details><hr>

### QUESTION 62 (yortmfaabr)

Your organization requires that metrics from all applications be retained for 5 years for future analysis in possible legal proceedings. Which approach should you use?

-  Configure Stackdriver Monitoring for all Projects, and export to BigQuery. 
-  Configure Stackdriver Monitoring for all Projects with the default retention policies. 
-  Configure Stackdriver Monitoring for all Projects, and export to Google Cloud Storage. 
-  Grant the security team access to the logs in each Project.


<details><summary>Answer:</summary><p>
Correct Answer C 



Explanation 



B and D can be quickly ruled out because none of them is solution for the requirements "retained for 5 years" 



Between A and C, the different is where to store, BigQuery or Cloud Storage. Since the main concern is extended storing period, C (Correct Answer) is better choice, and the "retained for 5 years for future analysis" further qualifies it, for example, using Coldline storage class. 



With regards of BigQuery, while it is also a low-cost storage, but the main purpose is for analysis. Also, logs stored in Cloud Storage is easy to transport to BigQuery or do query directly against the files saved in Cloud Storage if and whenever needed. 



Additional Resource

Overview of storage classes, price, and use cases https://cloud.google.com/storage/docs/storage-classes 

Why export logs? https://cloud.google.com/logging/docs/export/

StackDriver Quotas and Limits for Monitoring https://cloud.google.com/monitoring/quotas

The BigQuery pricing. https://cloud.google.com/bigquery/pricing

</p></details><hr>

### QUESTION 63 (ycakecn"wh)

You've created a Kubernetes engine cluster named "mycluster", which has a cluster pool named 'primary-node-pool'. You've realized that you need more total nodes within your cluster pool to meet capacity demands from 10 to 20. What is the command to change the number of nodes in your pool?

-  gcloud container clusters resize mycluster --node-pool 'primary-node-pool' --size 20 
-  gcloud container clusters resize mycluster --node-pool 'primary-node-pool' --num-nodes 20 
-  You must create a new node pool and transfer the workload to the new pool. 
-  gcloud container clusters update mycluster --node-pool 'primary-node-pool' --num-nodes 20


<details><summary>Answer:</summary><p>
Correct answer A 



Feedback 



A (Correct Answer). The command to resize an existing GKE node pool is: 



gcloud container clusters resize NAME --size=SIZE [--async] [--node-pool=NODE_POOL] [--region=REGION | --zone=ZONE, -z ZONE] [GCLOUD_WIDE_FLAG ...] 



B "--num-nodes" is a wrong flag for cluster resize command 



C is describing a situation for changing machine type 



D "gcloud container clusters update". This updates cluster settings for an existing container cluster. You can use this command to specify --max-nodes --min-nodes for autoscaling purpose. Also "--num-nodes" is a wrong flag option for this command

. https://cloud.google.com/sdk/gcloud/reference/container/clusters/update 



Reference 



gcloud container clusters resize - resizes an existing cluster for running containers 



https://cloud.google.com/sdk/gcloud/reference/container/clusters/resize

</p></details><hr>

### QUESTION 64 (ftqrttmgcs)

For this question, refer to the MountKirk Games case study:
 
Based on MountKirk Games' technical requirements, what GCP services/infrastructure will they use to host their game backend platform?

-  App Engine Flexible Environment 
-  Kubernetes Engine 
-  App Engine Standard Environment 
-  Managed Instance Group on Compute Engine


<details><summary>Answer:</summary><p>
Correct answer D 



Managed Instance Group on Compute Engine 



Only Compute Engine is able to use a customized Linux distribution, which is one of their requirements. 



MountKirk Games Requirements for Game Backend Platform

• Dynamically scale up or down based on game activity. 

• Connect to a managed NoSQL database service. 

• Run customized Linux distro.

</p></details><hr>

### QUESTION 65 (mgwtsuacdp)

Mountkirk Games wants to set up a continuous delivery pipeline. Their architecture includes many small services that they want to be able to update and roll back quickly.
 
Mountkirk Games has the following requirements:
* Services are deployed redundantly across multiple regions in the US and Europe.
* Only frontend services are exposed on the public internet.
* They can provide a single frontend IP for their fleet of services.
* Deployment artifacts are immutable.
 
Which set of products should they use?
-  Google Cloud Functions, Google Cloud Pub/Sub, Google Cloud Deployment Manager 
-  Google Cloud Storage, Google App Engine, Google Network Load Balancer 
-  Google Container Registry, Google Container Engine, Google HTTP(s) Load Balancer 
-  Google Cloud Storage, Google Cloud Dataflow, Google Compute Engine


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



C (Correct answer) - Google Container Registry, Google Container Engine, Google HTTP(s) Load Balancer



Google Container Registry, Google Container Engine

Meet the overall requirements: 

"Their architecture includes many small services that they want to be able to update and roll back quickly"; 



And following specific requirements

* Services are deployed redundantly across multiple regions in the US and Europe. 

* Deployment artifacts are immutable. 



Google HTTP(s) Load Balancer 

* Only frontend services are exposed on the public internet. 

* They can provide a single frontend IP for their fleet of services. 



All other answers provide incomplete or incorrect solution

</p></details><hr>

### QUESTION 66 (wotfacogvs)

Which of the following are characteristics of GCP VPC subnets? 

Choose 2 answers:
-  Each subnet can span at least 2 Availability Zones to provide a high-availability environment. 
-  Each subnet maps to a single Availability Zone. 
-  CIDR block mask of /25 is the smallest range supported. 
-  By default, all subnets can route between each other, whether they are private or public.


<details><summary>Answer:</summary><p>
Correct Answers A and D 



Feedback 



A (Correct) - Each subnet can span at least 2 Availability Zones to provide a high-availability environment. 



Each VPC network consists of one or more useful IP range partitions called subnetworks or subnets. Each subnet is associated with a region. Networks can contain one or more subnets in any given region. Subnets are regional resources. 



subnet3 is defined as 10.2.0.0/16, in the us-east1 region. One VM instance in the us-east1-a zone and a second instance in the us-east1-b zone, each receiving an IP addresses from its available range. 



D (Correct Answer) - By default, all subnets can route between each other, whether they are private or public. 



Because subnets are regional resources, instances can have their network interfaces associated with any subnet in the same region that contains their zones. 



Resources within a VPC network can communicate with one another using internal (private) IPv4 addresses, subject to applicable network firewall rules. 



The default network includes a "default-allow-internal" rule, which permits instance-to-instance communication within the network. 



C is incorrect: Each subnet defines a range of IP addresses. The minimum CIDR size for a subnet is /29. 



Reference resources

https://cloud.google.com/vpc/docs/vpc Virtual Private Cloud (VPC) Network Overview

</p></details><hr>

### QUESTION 67 (ftqrtttcsw)

For this question refer to the TerramEarth case study.
 
Which of TerramEarth's legacy enterprise processes in their existing data centers would experience significant change as a result of increased Google Cloud Platform adoption.

-  Opex (operational expenditures) and capex (capital expenditures) allocation, LAN changes, capacity planning. 
-  Capacity planning, TCO calculations, Opex and Capex allocation. 
-  Capacity planning, utilization measurement, data center expansion. 
-  Data Center expansion, TCO calculations, utilization measurement.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



A - Opex and capex allocation is part of answers; GCP adoption would not cause significant LAN changes. 



B (Correct Answer) - Capacity planning, TCO calculations, Opex and Capex allocation - those are all in the scopes concerned. 



From the case study, it can conclude that Management (CXO) all concern rapid provision of resources (infrastructure) for growing as well as cost management, such as Cost optimization in Infrastructure, trade up front capital expenditures (Capex) for ongoing operating expenditures (Opex), and Total cost of ownership (TCO) 



C - Capacity planning, utilization measurement, data center expansion - their data center would be shrinking instead of expanding if increasing Google Cloud Platform adoption. 



D - Data Center expansion, TCO calculations, utilization measurement - "Data Center expansion" is wrong choice; "utilization measurement" is not necessary a significant change caused by GCP adoption; Also, this answer is not as complete as Answer B 



Additional Resource Please read TerramEarth case study carefully to draw and extract your conclusions applicable to this questions and answers.

</p></details><hr>

### QUESTION 68 (yhamdroaio)

You have a mission-critical database running on an instance on Google Compute Engine. You need to automate a database backup once per day to another disk. The database must remain fully operational and functional and can have no downtime. How can you best perform an automated backup of the database with minimal downtime and minimal costs?

-  Use a cron job to schedule your application to backup the database to another persistent disk. 
-  Use a cron job to schedule a disk snapshot once per day. 
-  Write the database to two different disk locations simultaneously, then schedule a snapshot of the secondary disk, which will allow the primary disk to continue running. 
-  Use the automated snapshot service on Compute Engine to schedule a snapshot.


<details><summary>Answer:</summary><p>
Correct answer A 



To both minimize costs (don't want extra disks) and minimize downtime (cannot freeze database). Backing up just the database to another disk using a cron job is the preferred answer. It is also possible to backup the database to a Cloud Storage bucket instead of a disk, which would be cheaper for the same amount of storage. 



B and D all have some sort of Database downtime due to the snapshot. 



Answer C would be hard to implement and use doubled resources. You'll also lost the data consistency if you don't freeze the primary database when you take snapshot on secondary database. Overall, it's not worthwhile for your efforts for this task when you have better solution like answer A.

</p></details><hr>

### QUESTION 69 (ftqrttjcst)

For this question, refer to the JencoMart case study.
 
The JencoMart security team requires that all Google Cloud Platform infrastructure is deployed using a least privilege model with separation of duties for administration between production and development resources. What Google domain and project structure should you recommend?

-  Create two G Suite accounts to manage users: one for development and one for production. Each account should contain one project for every application. 
-  Create two G Suite accounts to manage users: one with a single project for all development applications and one with a single project for all production applications. 
-  Create a single G Suite account to manage users with each stage of each application in its own project. 
-  Create a single G Suite account to manage users with one project for the development environment and one project for the production environment.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



C and D are incorrect since "Create a single G Suite account": You should not use same account for both Development and Production environments regardless how do you create projects inside that account for different environments. 



A (Correct answer): The key requirement is "using a least privilege model with separation of duties for administration between production and development resources". The administration duties are users (teams) management and GCP resource access. 



Create two G Suite accounts to manage users, one for Development Team and another one for Production Team, then use projects for granular resource access management if you have many applications 



B is disqualified for this statement "a single project for all development applications and one with a single project for all production applications." If you have many applications, you should use projects to further sperate resource access. 



The Best practice: Use projects to group resources that share the same trust boundary. For example, resources for the same product or microservice can belong to the same Cloud Platform project. 



https://cloud.google.com/iam/docs/resource-hierarchy-access-control#best_practices 



Some Background Information

Google account: A Google account represents a developer, an administrator, or any other person who interacts with GCP. Any email address that is associated with a Google account can be an identity. 



G Suite domain: A G Suite domain represents a virtual group of all the Google accounts that have been created in an organization. When you add a user to your G Suite domain, a new Google account is created for the user inside this virtual group (such as username@example.com). 



If you are unfamiliar with G Suite, you can consider creating two G Suite accounts is equivalent to register two individual GCP accounts (one for Dev one for Prod) in the question scenarios.

</p></details><hr>

### QUESTION 70 (ycaisitd[h)

Your company's architecture is shown in the diagram. [ https://udemy-images.s3.amazonaws.com/redactor/raw/2018-08-06_18-06-18-43ed7d9ea241b1e580f7f92788aa7973.png ]
You want to automatically and simultaneously deploy new code to each Google Container Engine cluster. Which method should you use?

-  Use an automation tool, such as Jenkins. 
-  Change the clusters to activate federated mode. 
-  Use Parallel SSH with Google Cloud Shell and kubectl. 
-  Use Google Cloud Container Builder to publish the new images


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct Answer) - This meets the criteria of doing this automatically and simultaneously. 



B - Federated mode allows for deployment in a federated way, but does not do anything beyond that, you still have to have a tool like Jenkins to enable the "automated " part of the question, and with Jenkins you can accomplish the goal without necessarily needing federation to be enabled. 



C - This may work in very simple examples, but as complexity grows this will become unmanageable. 



D - Google Container Builder does not offer a way to push images to different clusters, they are published to Google Container Registry.

</p></details><hr>

### QUESTION 71 (ycwtrcoiad)

Your company wants to reduce cost on infrequently accessed data by moving it to the cloud. The data will still be accessed approximately once a month to refresh historical charts. In addition, data older than 5 years is no longer needed. How should you store and manage the data?

-  In Google Cloud Storage and stored in a Multi-Regional bucket. Set an Object Lifecycle Management policy to delete data older than 5 years. 
-  In Google Cloud Storage and stored in a Multi-Regional bucket. Set an Object Lifecycle Management policy to change the storage class to Coldline for data older than 5 years. 
-  In Google Cloud Storage and stored in a Nearline bucket. Set an Object Lifecycle Management policy to delete data older than 5 years. 
-  In Google Cloud Storage and stored in a Nearline bucket. Set an Object Lifecycle Management policy to change the storage class to Coldline for data older than 5 years.


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



C (Correct Answer) - The access pattern fits Nearline storage class requirements and Nearline is a more cost-effective storage approach than Multi-Regional. The object lifecycle management policy to delete data is correct versus changing the storage class to Coldline. 



A and B - For the requirement: "accessed approximately once a month" A and B can be quickly eliminated due to the incorrect Multi-Regional storage class vs Nearline storage class 



D - Need deleting them, not changing the storage class to Coldline

</p></details><hr>

### QUESTION 72 (yatavlnosf)

You are transferring a very large number of small files to Google Cloud Storage from an on-premises location. You need to speed up the transfer of your files. Assuming a fast network connection, what two actions can you do to help speed up the process?
 
Choose the 2 correct answers:
-  Compress and combine files before transferring. 
-  Use the -r option for large transfers. 
-  Copy the files in bigger pieces at a time. 
-  Use the -m option for multi-threading on transfers.


<details><summary>Answer:</summary><p>
Correct Answer A and D 



Feedback 



B - Use the -r option for large transfers. The -R and -r options are synonymous. Causes directories, buckets, and bucket subdirectories to be copied recursively. 



C - Copy the files in bigger pieces at a time. No applicable to the question requirements 



D (Correct answer) - Use the -m option for multi-threading on transfers. 



If you have a large number of files to transfer you might want to use the gsutil -m option, to perform a parallel (multi-threaded/multi-processing) copy: 



gsutil -m cp -r dir gs://my-bucket 



A (Correct answer) - Compress and combine files before transferring. Compressing and combining smaller files info fewer larger files is also a best practice for speeding up transfer speeds because it saves network bandwidth and space in Google Cloud Storage 



gsutil cp -z html -a public-read cattypes.html tabby.jpeg gs://mycats 



Reference 



cp - Copy files and objects

https://cloud.google.com/storage/docs/gsutil/commands/cp

</p></details><hr>

### QUESTION 73 (ftqrttjcsa)

For this question, refer to the JencoMart case study
 
A few days after JencoMart migrates the user credentials database to Google Cloud Platform and shuts down the old server, the new database server stops responding to SSH connections. It is still serving database requests to the application servers correctly. What three steps should you take to diagnose the problem? 

Choose 3 answers:
-  Check inbound firewall rules for the network the machine is connected to. 
-  Print the Serial Console output for the instance for troubleshooting, activate the interactive console, and investigate. 
-  Take a snapshot of the disk and connect to a new machine to investigate. 
-  Delete the instance, attach the disk to a new VM, and investigate. 
-  Connect the machine to another network with very simple firewall rules and investigate.


<details><summary>Answer:</summary><p>
Correct Answer A, B, and C 



Feedback 



ABC are the correct answers 



All answers except F are valid methods to diagnose the problem only ABC do not require to interrupt the service. Answers DEF all require some sort of interruption of services which is against the SLA (See below for details). 



Explanation

Troubleshooting SSH https://cloud.google.com/compute/docs/troubleshooting/troubleshooting-ssh 



Under certain conditions, it is possible that a Google Compute Engine instance no longer accepts SSH connections. There are many reasons this could happen, from a full disk to an accidental misconfiguration of sshd. This section describes a number of tips and approaches to troubleshoot and resolve common SSH issues. 



1) Check your firewall rules

Google Compute Engine provisions each project with a default set of firewall rules which permit SSH traffic. If the default firewall rule that permits SSH connections is somehow removed, you'll be unable to access your instance. Check your list of firewalls with the gcloud compute command-line tool and ensure the default-allow-ssh rule is present. 



gcloud compute firewall-rules list



If the firewall rule is missing, add it back: 



gcloud compute firewall-rules create default-allow-ssh --allow tcp:22



2) Debug the issue in the serial console



You can enable read-write access to an instance's serial console so you can log into the console and troubleshoot problems with the instance. This is particularly useful when you cannot log in with SSH or if the instance has no connection to the network. The serial console remains accessible in both these conditions. 

3) Test the network ... ... ...

4) Try a new user ... ... ...

5) Use your disk on a new instance ... ... ...



6) Inspect an instance without shutting it down

You might have an instance you can't connect to that continues to correctly serve production traffic. In this case, you might want to inspect the disk without interrupting the instance's ability to serve users. First, take a snapshot of the instance's boot disk, then create a new disk from that snapshot, create a temporary instance, and finally attach and mount the new persistent disk to your temporary instance to troubleshoot the disk. 7) Use a startup script ...

</p></details><hr>

### QUESTION 74 (tsthdesaip)

The security team has disabled external SSH access into production virtual machines in GCP. The operations team needs to remotely manage the VMs and other resources. 

What can they do?
-  Develop a new access request process that grants temporary SSH access to cloud VMs when an operations engineer needs to perform a task. 
-  Grant the operations team access to use Google Cloud Shell. 
-  Have the development team build an API service that allows the operations team to execute specific remote procedure calls to accomplish their tasks. 
-  Configure a VPN connection to GCP to allow SSH access to the cloud VMs.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



B (Correct Answer) - Grant the operations engineers access to use Google Cloud Shell. 



All the engineer asked is remote access the VMs just like using SSH, so if the machines still have an external IP address, the engineers can access them via SSH using Google Cloud Shell. 



Answer D Could also be a solution if the question specifically mentioned the external IP is removed. 



Answer B is the easiest effective way to meet the requirements. Answers A and C are possible options that might require more setup than worthwhile for the needs. 



Explanation

Cloud Shell provides the following (https://cloud.google.com/shell/docs/features) 

1) A temporary Compute Engine virtual machine instance

2) Command-line access to the instance from a web browser

3) Built-in code editor BETA

4) 5 GB of persistent disk storage

5) Pre-installed Google Cloud SDK and other tools

6) Language support for Java, Go, Python, Node.js, PHP, Ruby and .NET

7) Web preview functionality

8) Built-in authorization for access to GCP Console projects and resources

</p></details><hr>

### QUESTION 75 (ftqrttdcsd)

For this question, refer to the Dress4Win case study.
 
Dress4Win has asked you to recommend machine types they should deploy their application servers to. 

How should you proceed?
-  Recommend that Dress4Win deploy into production with the smallest instances available, monitor them over time, and scale the machine type up until the desired performance is reached. 
-  Identify the number of virtual cores and RAM associated with the application server virtual machines align them to a custom machine type in the cloud, monitor performance, and scale the machine types up until the desired performance is reached. 
-  Perform a mapping of the on-premises physical hardware cores and RAM to the nearest machine types in the cloud. 
-  Recommend that Dress4Win deploy application servers to machine types that offer the highest RAM to CPU ratio available.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback A (Correct answer) - Recommend that Dress4Win deploy into production with the smallest instances available, monitor them over time, and scale the machine type up until the desired performance is reached. 



This is good practice generally for migrating compute resources to cloud and it's also applies to Dress4Win case specifically. 



For the first phase of their migration to the cloud, Dress4win is considering moving their development and test environments. This is a good opportunity to select and testing your applications and servers from small scale and scale the machine type up close but not necessary identical to your exiting machine's performance 



Examining Dress4win existing application server and the applications, there is no indication that special custom machine types are necessary. Also, there is no need to use exiting machine both matching the CPU platform and Capacity even if GCP happens to have the CPU platforms. 



To meet those two requirements: 

• Build a reliable and reproducible environment with scaled parity of production. 

• Analyze and optimize architecture for performance in the cloud. 





Most likely at certain stage after experimenting with GCP compute engines, you'll need balancing between horizontal scaling (many smaller instances) or vertical scaling (fewer bigger machines), which means it's very possible you end up with using different newer CPU platforms, smaller scale but more instances than your exiting one. 



B - Identify the number of virtual cores and RAM associated with the application server virtual machines align them to a custom machine type in the cloud, monitor performance, and scale the machine types up until the desired performance is reached. 



You could map and align your machine to GCP custom machine type based one exiting number of virtual cores and RAM. This is not necessary and nor required: there is no indication that special custom matched machine types in term of capacity (CPU, Memory, Disk) and CPU platforms are required. 



Judging from the overall situation with Dress4Win, Answer A is winner and it's also a Google recommended practice. 



C - Perform a mapping of the on-premises physical hardware cores and RAM to the nearest machine types in the cloud. 



Physical hardware cores and RAM may not be able to 1-to1 mapped to vCPU. Even if you could manage to map to the instances, it's still necessary do testing and monitoring to make sure they reach to desired performance 



D - Recommend that Dress4Win deploy application servers to machine types that offer the highest RAM to CPU ratio available. 



Not applicable to Dress4Win's solution nor to the requirements. There is no indication from the existing applications and machine types pointing to the special need for "highest RAM to CPU ratio" machine 



Background Information

Machine Types https://cloud.google.com/compute/docs/machine-types

CPU Platforms https://cloud.google.com/compute/docs/cpu-platforms





For the n1 series of machine types, a virtual CPU is implemented as a single hyperthread on a 2.6GHz Intel Sandy Bridge Xeon or Intel Ivy Bridge Xeon (or newer) processor. 



In GCP, you need 2 virtual CPUs to get that same physical core. 



Relevant information for Dress4Win Case Study

Solution Concept

For the first phase of their migration to the cloud, Dress4win is considering moving their development and test environments.... 



Existing Technical Environment, Application servers: 

• Tomcat - Java micro-services

• Nginx - static content

• Apache Beam - Batch processing



Business Requirements

• Build a reliable and reproducible environment with scaled parity of production. 

• Analyze and optimize architecture for performance in the cloud. 

• Migrate fully to the cloud if all other requirements are met. 



Technical Requirements

• Evaluate and choose an automation framework for provisioning resources in cloud. 

• Identify production services that can migrate to cloud to save capacity.

</p></details><hr>

### QUESTION 76 (ftqrttmgcs)

For this question, refer to the Mountkirk Games case study.
 
Mountkirk Games' gaming servers are not automatically scaling properly. Last month, they rolled out a new feature, which suddenly became very popular. A record number of users are trying to use the service, but many of them are getting 503 errors and very slow response times. 

 What should they investigate first?
-  Verify that the database is online. 
-  Verify that the project quota hasn't been exceeded. 
-  Verify that the new feature code did not introduce any performance bugs. 
-  Verify that the load-testing team is not running their tool against production.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



A - Verify that the database is online. 



Although checking to see if database is still online is easy task, the problem nature is, if database is offline, it'll impact all users, not just some of them, and also the application would stop response instead of slow response and most likely the error code would be different one other than 503 



C - Verify that the new feature code did not introduce any performance bugs 



This would work but judging from the problem nature and situation when it happens as well as Mountkirk Games business, this can be done later if necessary instead of "investigate first". 



D - Verify that the load-testing team is not running their tool against production. 



Possible but unlikely. It 's hard to image, for the big successful company like Mountkirk Games, the testing team would do load testing at this moment against production and even harder to understand they don't let other teams know if indeed they did the load test. If so, then this is company culture issue beyond architecture scope. 



B (Correct answer) - Verify that the project quota hasn't been exceeded. Most likely, time based 



This should investigate first and easy to do in console. Indeed, the problem behavior resemble the time-based quota depletionhttps://cloud.google.com/appengine/quotas#When_a_Resource_is_Depleted 



When an application consumes all of an allocated resource, the resource becomes unavailable until the quota is replenished. This may mean that your application will not work until the quota is replenished. 



For resources that are required to initiate a request, when the resource is depleted, App Engine by default returns an HTTP 403 or 503 error code for the request instead of calling a request handler. The following resources have this behavior: 



• Bandwidth, incoming and outgoing

• Instance hours



They are is consistent with 503 Error: https://cloud.google.com/billing/v1/errors/core_errors#SERVICE_UNAVAILABLE

</p></details><hr>

### QUESTION 77 (admibanaha)

A development manager is building a new application. He asks you to review his requirements and identify what cloud technologies he can use to meet them. The application must
 
1.) Be based on open-source technology for cloud portability
2.) Dynamically scale compute capacity based on demand
3.) Support continuous software delivery
4.) Run multiple segregated copies of the same application stack
5.) Deploy application bundles using dynamic templates
6.) Route network traffic to specific services based on URL
 
Which combination of technologies will meet all of his requirements?
-  Google Container Engine and Cloud Load Balancing 
-  Google Compute Engine, Jenkins, and Cloud Load Balancing 
-  Google Compute Engine and Cloud Deployment Manager 
-  Google Container Engine, Jenkins, and Helm


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



Best approach is by elimination: start from any requirements, for example, you may start elimination by the requirement not supported by repeatedly appeared components (e.g., GCE and GKE) in the questions

• Req 1: Be based on open-source technology for cloud portability

• Req 3 Support continuous software delivery

• Req 5 Deploy application bundles using dynamic templates

• Req 6 Route network traffic to specific services based on URL



If we start from "Be based on open-source technology for cloud portability", we know that Container Engine (new name is K8s Engine, GKE for short) one of unique feature is "open-source and cloud portability". Now we have followings left: 

• Google Container Engine and Cloud Load Balancing

• Google Container Engine, Jenkins, and Helm



At this point, if you have the experience or knowledge, you probably are able to make the right decision. If not then following the same approach, we can choose either requirements of LB or CICD. For example, if we chose CICD, then the only answer is: Answer D. Google Container Engine, Jenkins, and Helm 



At first glance it appears answer D does not meet "all of his requirements" since it seems misses the "Route network traffic to specific services based on URL", an obvious feature for Cloud Load Balancing. 



If looking further, we know, unlike Compute Engine, the Kubernetes Engine offers integrated support for two types of cloud load balancing for a publicly accessible application. One of them is HTTP(S) load balancers are designed to terminate HTTP(S) requests and can make better context-aware load balancing decisions. 

https://cloud.google.com/kubernetes-engine/docs/tutorials/http-balancer 



For your information: Helm is a package manager for Kubernetes templates. It allows for defining the Kubernetes templates required to run an application and then replace the application options dynamically. It bundles all the templates in `tgz` packages called charts. 

https://helm.sh/

</p></details><hr>

### QUESTION 78 (tddaeugcpt)

The Dress4Win developers are evaluating using Google Cloud Platform. They have identified some applications that can easily move to Google App Engine Flexible Environment. The developers will deploy their code using the Google Cloud SDK tools. Which two of their stated technical requirements does this solution meet?

Choose 2:
-  Encrypt data on the wire and at rest. 
-  Use managed services whenever possible. 
-  Identify production services that can migrate to the cloud to save capacity. 
-  Support failover of the production environment to the cloud during an emergency. 
-  Evaluate and choose an automation framework for provisioning resources in the cloud. 
-  Support multiple VPN connections between the production data center and the cloud environment.


<details><summary>Answer:</summary><p>
Correct Answer B and E 



Explanation B, E (Correct Answers) - Using managed services whenever possible is a requirement met by using Google App Engine Flexible Environment. Using the Google Cloud SDK allows for provisioning and management of Google Cloud Platform resources including Google App Engine Flexible Environment. 



A - The solution may support this requirement but will require additional solution components to support and thus does not meet the requirement as stated. 



C - The solution may support this requirement however there is no information on the specific production services and how capacity would be saved. 



D - The solution may support this requirement but will require additional solution components to support and thus does not meet the requirement as stated. 



F - The solution may support this requirement but will require additional solution components to support and thus does not meet the requirement as stated. 



Dress4Win Technical Requirements 

1) Evaluate and choose an automation framework for provisioning resources in cloud. 

2) Support failover of the production environment to cloud during an emergency. 

3) Identify production services that can migrate to cloud to save capacity. 

4) Use managed services whenever possible. 

5) Encrypt data on the wire and at rest. 

6) Support multiple VPN connections between the production data center and cloud environment.

</p></details><hr>

### QUESTION 79 (ycimaecatg)

Your customer is moving an existing corporate application to Google Cloud Platform from an on-premises data center. The business owners require minimal user disruption. There are strict security team requirements for storing passwords. 

What authentication strategy should they use?
-  Use G Suite Password Sync to replicate passwords into Google. 
-  Ask users to set their Google password to match their corporate password. 
-  Provision users in Google using the Google Cloud Directory Sync tool. 
-  Federate authentication via SAML 2.0 to the existing Identity Provider.


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



C (Correct answer) - Provision users in Google using the Google Cloud Directory Sync tool. This meets both "minimal user disruption" and "strict security team requirements for storing passwords" 



With Google Cloud Directory Sync (GCDS), you can synchronize the data in your Google domain with your Microsoft Active Directory or LDAP server. Your Google users, groups, and shared contacts are synchronized to match the information in your LDAP server. 



The data in your LDAP directory server is never modified or compromised. GCDS is a secure tool that helps you easily keep track of users and groups. 



This way you store the password in each domain in their corresponding environments and no additional user setup required on Google side since the data are synced and pointed to same identity 



Reference: About Google Cloud Directory Sync https://support.google.com/a/answer/106368?hl=en 



A - Use G Suite Password Sync to replicate passwords into Google - This is a violation against "strict security team requirements for storing passwords" https://support.google.com/a/answer/2611859?hl=en 



B - Ask users to set their Google password to match their corporate password - this violate "minimal user disruption" and "strict security team requirements for storing passwords" 



D - Federate authentication via SAML 2.0 to the existing Identity Provider. With SAML-based Federated SSO, an identity and access management (IAM) service provides administrators with a single place to manage all users and cloud applications. This is a way to Federate your identity from you exiting IAM to Google cloud domain, which violates "strict security team requirements for storing passwords". Also, the identities in cloud and on-premises domain won't be getting synched https://support.google.com/a/answer/6087519?hl=en

</p></details><hr>

### QUESTION 80 (wcfrwfoscn)

When creating firewall rules, what forms of segmentation can narrow which resources the rule is applied to? 

Choose all that apply:
-  Network range in source filters 
-  Zone 
-  Region 
-  Network tags


<details><summary>Answer:</summary><p>
Correct Answer A and D 



Explanation 

You can restrict network access on the firewall by network tags and network ranges/subnets. 



Here is the console screenshot showing the options when you create firewall rules 

- network tags and network ranges/subnets are highlighted 



https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT2/PT2_Q32.png

</p></details><hr>

### QUESTION 81 (yntrtnouro)

You need to reduce the number of unplanned rollbacks of erroneous production deployments in your company's web hosting platform. Improvement to the QA and Test processes accomplished an 80% reduction. Which additional two approaches can you take to further reduce the rollbacks? 

Choose two:
-  Introduce a green-blue deployment model. 
-  Fragment the monolithic platform into microservices. 
-  Remove the QA environment. Start executing canary releases. 
-  Remove the platform's dependency on relational database systems. 
-  Replace the platform's relational database systems with a NoSQL database.


<details><summary>Answer:</summary><p>
Correct Answer A and B 



Feedback 



A (Correct Answer) - The blue-green model allows for extensive testing of the application in the green environment before sending traffic to it. Typically, the two environments are identical otherwise which gives the highest level of testing assurance. 



B (Correct Answer) - Microservices allows for smaller, more incremental rollouts of updates (each microservice can be updated individually) which will reduce the likelihood of an error in each rollout. 



C - Would remove a well proven step from the general release strategy, a canary release platform is not a replacement for QA, it should be additive. 



D - Doesn't really help the rollout strategy, there is no inherent property of a relational database that makes it more subject to failed releases than any other type of data storage. 



E - Doesn't really help either since NoSQL databases do not offer anything over relational databases that would help with release quality.

</p></details><hr>

### QUESTION 82 (ywapstctgb)

You write a Python script to connect to Google BigQuery from a Google Compute Engine virtual machine. The script is printing errors that it cannot connect to BigQuery. 

What should you do to fix the script?
-  Run your script on a new virtual machine with the BigQuery access scope enabled 
-  Install the latest BigQuery API client library for Python 
-  Install the bq component for gccloud with the command gcloud components install bq. 
-  Create a new service account with BigQuery access and execute your script with that user


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct answer) - Run your script on a new virtual machine with the BigQuery access scope enabled 



The error is most like caused by the access scope issue. When create new instance, you have the default Compute engine default service account but most serves access including BigQuery is not enable. Create an instance Most access are not enabled by default 



You have default service account but don't have the permission (scope) you can stop the instance, edit, change scope and restart it to enable the scope access. Of course, if you Run your script on a new virtual machine with the BigQuery access scope enabled, it also works 



B - Install the latest BigQuery API client library for Python - this is most like not the cause, if the BigQuery API is not the latest, it should get different error instead of "errors that it cannot connect to BigQuery" 



C - Install the bq component for gccloud with the command gcloud components install bq - you do not need this component for running Python script 



D - Create a new service account with BigQuery access and execute your script with that user 



You can create service account, add user to service account, and grant the user role as Service Account User. You still need to enable BigQuery scope to make the Python script running the instance to access BigQuery. 



Explanation

Compute Engine default service account



For historical reasons, all projects come with the Compute Engine default service account, 



The default service account is created by Google and added to your account automatically, but you have full control over the account. 

• Automatically created by the Google Cloud Platform Console project and has an autogenerated name and email address. 

• Automatically added as a project editor to your project. 

• Enabled on all instances created by the gcloud command-line tool and the GCP Console with a specific set of permissions. You can override this by specifying another service account when creating the instance or by explicitly disabling service accounts for the instance. 



Service account permissions



When you set up an instance to run as a service account, the level of access the service account has is determined by the combination of access scopes granted to the instance and IAM roles granted to the service account. You need to configure both access scopes and IAM roles to successfully set up an instance to run as a service account. Essentially: • Access scopes authorize the potential access that an instance has to API methods. 

• IAM restricts that access to the roles granted to the service account. 





Additional Resource 

Service account: 



Creating and Enabling Service Accounts for Instances 

https://cloud.google.com/compute/docs/access/create-enable-service-accounts-for-instances

</p></details><hr>

### QUESTION 83 (ycwttotcwl)

Your company wants to try out the cloud with low risk. They want to archive approximately 100 TB of their log data to the cloud and test the analytics features available to them there, while also retaining that data as a long-term disaster recovery backup. Which two steps should they take? 

Choose 2 answers:
-  Load logs into Google BigQuery. 
-  Import logs into Google Stackdriver. 
-  Insert logs into Google Cloud Bigtable. 
-  Load logs into Google Cloud SQL. 
-  Upload log files into Google Cloud Storage.


<details><summary>Answer:</summary><p>
Correct Answer A and E 



The order should be Upload log files into Google Cloud Storage and then Load logs into Google BigQuery. 



E (Correct answer) - Upload log files into Google Cloud Storage Cloud Storage is best solution for Long-term disaster recovery backup. You can do SQL query direct against data in Cloud Storage. It also meets the low risk requirement to prevent potential accidental data loss and modification. 



A (Correct answer) - Load logs into Google BigQuery - BigQuery is most suitable solution for doing analytics against large amount of data; You can do SQL query direct against data in Cloud Storage. 



B - Import logs into Google Stackdriver - Stackdriver is not a suitable solution for Long-term disaster recovery backup 



C - Insert logs into Google Cloud Bigtable: BigTable is not a suitable solution for Long-term disaster recovery backup 



D - Load logs into Google Cloud SQL - Cloud SQL is relation database designed for transactional CRUD OLTP processing suitable for data less than 10 TB.

</p></details><hr>

### QUESTION 84 (ftqrttdcsa)

For this question, refer to the Dress4Win case study.
 
As part of migrate plans to cloud, Dress4Win wants to set up a managed logging and monitoring system so they can understand and manage workload based on the traffic spikes and patterns.
 
They want to ensure that:
· The infrastructure can be notified when it needs to scale up and down to handle the daily workload
· Their administrators are notified automatically when their application reports errors.
· They can filter their aggregated logs down to debug one piece of the application across many hosts. 
 
Which Google StackDriver features should they use?
-  Monitoring, Logging, Debug, Error Report 
-  Monitoring, Trace, Debug, Logging 
-  Logging, Alerts, Insights, Debug 
-  Monitoring, Logging, Alerts, Error Reporting


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



B - ruled out since Trace is not needed and the Error Reporting is missing. 



C - rule out since it misses the Monitoring and Debugger; it also has a wrong item: Insights. 



D - ruled out since it misses the Debugger feature for the part of third requirements "to debug one piece of the application across many hosts" 



A (Correct answer) - Monitoring, Logging, Debug, Error Report: it meets all the 3 requirements: 



Note: Alert is part of monitoring; You can optionally turn on notification for new errors in Error reporting; 



logging and debugging is for " filter their aggregated logs down in order to debug one piece of the application" 



Additional Resource 

Here are the StackDriver's five Components https://cloud.google.com/stackdriver/docs/

1) Stackdriver Monitoring

• Full-stack monitoring for Google Cloud Platform and Amazon Web Services. 

2) Stackdriver Logging

• Real-time log management and analysis. 

3) Stackdriver Error Reporting

• Identify and understand your application errors. 

4) Stackdriver Debugger

• Investigate your code's behavior in production. 

5) Stackdriver Trace

• Find performance bottlenecks in production. 



Note: Just like GCP's other services, the list is growing - on March 28, 2018, Stackdriver Profiler is released in Beta. See the screenshot. [URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT2/PT2_Q36.png ]

</p></details><hr>

### QUESTION 85 (ysippbipty)

Your solution is producing performance bugs in production that you did not see in staging and test environments. You want to adjust your test and deployment procedures to avoid this problem in the future. What should you do?
 
Select one:
-  Deploy changes to a small subset of users before rolling out to production. 
-  Increase the load on your test and staging environments. 
-  Deploy smaller changes to production. 
-  Deploy fewer changes to production.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct answer) - Deploy changes to a small subset of users before rolling out to production. This is the practice in Canary deployment. The bug slip into production may be caused by the discrepancy between test/staging and production environments or testing data. With Canary deployment or Canary test, you have the ability to test code with live data at any time, you increase the chance discovering the bug earlier and reduced the risk bring the bug into production with minimums impact and down time by rolling back quickly 



B - Increase the load on your test and staging environments. Increase the load in your test and staging environment may or may not help to discover the bugs. Also, the question did not say what kind of load level. In some situation with same environment and same set of test data, just increase load won't help to discover the performance bug so you need Canary test/deployment. 



C and D - Deploy smaller or fewer changes to production. Although those are generally good agile practices for cloud native microservice, they don't address the issues to adjust your test and deployment procedures to discover the bugs before in production. The Bug can still slip into production no matter how small how often you test the changes in same environment and same set of test data in same procedures. Furthermore, A and D each answer along doesn't formalize the complete picture especially compared to Answer A.

</p></details><hr>

### QUESTION 86 (ftqrtttcst)

For this question, refer to the TerramEarth case study.
 
To speed up data retrieval, more vehicles will be upgraded to cellular connections and be able to transmit data to the ETL process. The current FTP process is error-prone and restarts the data transfer from the start of the file when connections fail, which happens often. You want to improve the reliability of the solution and minimize data transfer time on the cellular connections. What should you do?

-  Use multiple Google Container Engine clusters running FTP servers located in different regions. Save the data to Multi-Regional buckets in US, EU, and Asia. Run the ETL process using the data in the bucket. 
-  Directly transfer the files to a different Google Cloud Regional Storage bucket location in US, EU, and Asia using Google APIs over HTTP(S). Run the ETL process to retrieve the data from each Regional bucket. 
-  Use one Google Container Engine cluster of FTP servers. Save the data to a Multi- Regional bucket. Run the ETL process using data in the bucket. 
-  Directly transfer the files to different Google Cloud Multi-Regional Storage bucket locations in US, EU, and Asia using Google APIs over HTTP(S). Run the ETL process using the data in the bucket.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 

A and C - can be eliminated for FTP is unreliable especially in the face of network errors or disruptions as TerramEarth already suffered described in the question. 



Answer A, Running FTP servers in multiple Container clusters in different regions might get thing improved but it's still not a good solution as directly transfer the files to different Google Cloud Storage bucket using Google APIs over HTTP(S). See Below Answer B's explanation. 



Answer C, just one container engine cluster essentially limits it in one region with limited capacity but vehicles will be upgraded to cellular connections are across all over the world. It also suffers the FTP limits 



Between B and D - Both Directly transfer the files to a Google Cloud Storage bucket using Google APIs over HTTP(S), which is better and more reliable for the transportation meeting the reliability requirement. Both run the ETL process to retrieve the data from each bucket, an appropriate way for the overall process. 



The difference is where to which Cloud Storage location to use: regional or multi-regional. 



Since the vehicles are spread all over the world and since later retrieving (consumed) data is from centralized location, saving data to nearest regional bucket (instead of multi-reginal bucket in a large geographic area) and retrieve from there is better solution to "minimize data transfer time on the cellular connections". 



Use a multi-regional location when you want to serve content to data consumers that are outside of the Google network and distributed across large geographic areas. 

So, answer B is correct.

</p></details><hr>

### QUESTION 87 (witbpfsraa)

What is the best practice for separating responsibilities and access for production and development environments? 

-  Separate project for each environment, each team only has access to their project. 
-  Separate project for each environment, both teams have access to both projects. 
-  Both environments use the same project, but different VPC's. 
-  Both environments use the same project, just note which resources are in use by which group.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



A (Correct answer) - Separate project for each environment, each team only has access to their project. 



For least privilege and separation of duties, the best practice is to separate both environments into different projects, development or production team gets their own accounts, and each team is assigned to only their projects. 



The best practices: 

• You should not use same account for both Development and production environments regardless how do you create projects inside that account for different environments. You should use different account for each environment which associated with different group of users. You should use project to isolate user access to resource not to manage users. 

• Using a shared VPC allows each team to individually manage their own application resources, while enabling each application to communicate between each other securely over RFC1918 address space. So VPC's isolate resources but not user/service accounts. 



B, C, and D are incorrect 



Answer B is the scenario that use same account for both development and production environments attempting to isolate user access with different projects 



Answer C is the scenario that use same account for both development and production environments with same project attempting to isolate user access with network separation. 



Answer D is the scenario that use same account for both development and production environments with same project attempting to isolate user access with user group at resource level. 



You may grant roles to group of users to set policies at organization level, project level, or (in some cases) the resource (e.g., existing Cloud Storage and BigQuery ACL systems as well as and Pub/Sub topics) level. 



The best practice: Set policies at the Organization level and at the Project level rather than at the resource level. This is because as new resources get added, you may want them to automatically inherit policies from their parent resource. For example, as new Virtual Machines gets added to the project through auto scaling, they automatically inherit the policy on the project. https://cloud.google.com/iam/docs/resource-hierarchy-access-control#best_practices 



Additional Resources: 



To recap: IAM lets you control who (users) has what access (roles) to which resources by setting IAM policies. IAM policies grant specific role(s) to a user giving the user certain permissions. 

https://cloud.google.com/resource-manager/docs/access-control-org 



Using Resource Hierarchy for Access Control 



https://cloud.google.com/iam/docs/resource-hierarchy-access-control#background

</p></details><hr>

### QUESTION 88 (ydcmajawtc)

Your developer currently maintains a J2EE application. What two considerations should he consider for moving his application to the cloud to meet demand and minimize overhead? 

Choose two: 
-  Host resources in Cloud Bigtable. 
-  Configure application for Cloud Dataproc. 
-  Re-tooling the application to run on App Engine. 
-  Re-tool to run on managed instance group with appropriate storage back-end.


<details><summary>Answer:</summary><p>
Correct Answer C and D 



Explanation 



J2EE is Java, which can run on App Engine. He can also configure his application to run on a managed instance group for scaling, as long as he configures a data storage backend for the group as well.

</p></details><hr>

### QUESTION 89 (ywiascwesb)

You work in a small company where everyone should be able to view all resources of a specific project. You want to grant them access following Google's recommended practices. 

What should you do? 
-  Create a script that uses "gcloud projects add-iam-policy-binding" for all users' email addresses and the Project Viewer role. 
-  Create a script that uses "gcloud iam roles create" for all users' email addresses and the Project Viewer role. 
-  Create a new Google Group and add all users to the group. Use "gcloud projects add-iam-policy-binding" with the Project Viewer role and Group email address. 
-  Create a new Google Group and add all members to the group. Use "gcloud iam roles create" with the Project Viewer role and Group email address.


<details><summary>Answer:</summary><p>
Correct answer C 



Feedback 



A is not correct because groups are recommended over individual assignments. 



B is not correct because this command is to create roles, not to assign them. 



C is correct because Google recommends to use groups where possible. 



D is not correct because this command is to create roles, not to assign them. 



Reference 



gcloud iam https://cloud.google.com/sdk/gcloud/reference/iam/

</p></details><hr>

### QUESTION 90 (ooypboibat)

One of your primary business objectives is being able to trust the data stored in your application. You want to log all changes to the application data. 

How can you design your logging system to verify authenticity of your logs? 
-  Create a JSON dump of each log entry and store it in Google Cloud Storage. 
-  Write the log concurrently in the cloud and on premises. 
-  Digitally sign each timestamp and log entry and store the signature. 
-  Use an SQL database and limit who can modify the log table.


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



C (Correct answer) - Digitally sign each timestamp and log entry and store the signature. 



Answer A, B, and D doesn't have any added value to verify authenticity of your logs. Besides, Logs are mostly suitable for exporting to Cloud storage, BigQuery, and PubSub. SQL database is not the best way to be exported to nor store log data. 

vSimplified Explanation

To verify authenticity of your logs if they are tampered or forged, you can use certain algorithm to generate digest by hashing each timestamp or log entry and then digitally sign the digest with a private key to generate signature. Anybody with your public key can verify that signature to confirm that it was made with your private key and they can tell if the timestamp or log entry was modified. 



You can put the signature files into a folder separate from the log files. This separation enables you to enforce granular security policies.

</p></details><hr>

### QUESTION 91 (witcfcasbt)

What is the command for creating a storage bucket that has once per month access and is named 'archive_bucket'? 
-  gsutil rm -coldline gs://archive_bucket 
-  gsutil mb -c coldline gs://archive_bucket 
-  gsutil mb -c nearline gs://archive_bucket 
-  gsutil mb gs://archive_bucket


<details><summary>Answer:</summary><p>
Correct answer C 



mb is to make the bucket. Nearline buckets are for once per month access. Coldline buckets require only accessing once per 90 days and would incur additional charges for greater access. 



Further Explanation 

Synopsis 



gsutil mb [-c class] [-l location] [-p proj_id] url... 



If you don't specify a -c option, the bucket is created with the default storage class Standard Storage, which is equivalent to Multi-Regional Storage or Regional Storage, depending on whether the bucket was created in a multi-regional location or regional location, respectively. 



If you don't specify a -l option, the bucket is created in the default location (US). -l option can be any multi-regional or regional location. 



Reference 

mb - Make buckets: https://cloud.google.com/storage/docs/gsutil/commands/mb

</p></details><hr>

### QUESTION 92 (ftqrttdcsd)

For this question, refer to the Dress4Win case study.
 
Dress4Win is evaluating how their current database structure would translate to Google Cloud. They need to know which databases can be converted to a managed service, and which ones will need to remain unmanaged. They do not want to re-engineer their databases into a different format. Choose the two correct answers for their available options for database hosting, keeping in mind to use managed services where applicable. 

Choose two:
-  Host their Redis database on a Compute Engine instance. 
-  Host Redis database on Cloud Datastore. 
-  Host MySQL database on Cloud SQL. 
-  Host MySQL database on a Compute Engine instance.


<details><summary>Answer:</summary><p>
Correct answer A and C 



Explanation 

MySQL translates directly to Cloud SQL without having to convert the database to a different format, and it is a managed service. While Redis is a NoSQL database, it is not a direct equivalent to Cloud Datastore and would need additional re-engineering. To run Redis in its current form, they would need to host it on a Compute Engine instance. 



Dress4Win Existing Technical Environment - Database 

MySQL - user data, inventory, static data

Redis - metadata, social graph, caching

</p></details><hr>

### QUESTION 93 (tsuavpnbyo)

To set up a virtual private network between your office network and Google Cloud Platform and have the routes automatically updated when the network topology changes, what is the minimal number of each type of component you need to implement? 

-  2 Cloud VPN Gateways and 1 Peer Gateway 
-  1 Cloud VPN Gateway, 1 Peer Gateway, and 1 Cloud Router 
-  2 Peer Gateways and 1 Cloud Router 
-  2 Cloud VPN Gateways and 1 Cloud Router


<details><summary>Answer:</summary><p>
Concert answer B 



Feedback 



The question describes a topology for Dynamic routing 



The minimal number of each type of component you need to implement Dynamic routing: 



1 Cloud VPN Gateway (Show as VPN in GCP network on left), 1 Peer Gateway (Show as VPN Gateway with BGP in peer network on right), and 1 Cloud Router, displayed in the diagram:

https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT2/PT2_Q45.png

</p></details><hr>

### QUESTION 94 (yntdautaai)

You need to deploy an update to an application in Google App Engine. The update is risky, but it can only be tested in a live environment. What is the best way to introduce the update to minimize risk? 

-  Deploy a new version of the application but use traffic splitting to only direct a small number of users to the new version. 
-  Deploy the application temporarily and be prepared to pull it back if needed. 
-  Warn users that a new app version may have issues and provide a way to contact you if there are problems. 
-  Create a new project with the new app version, then redirect users to the new version.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



A (Correct Answer) - Deploying a new version without assigning it as the default version will not create downtime for the application. Using traffic splitting allows for easily redirecting a small amount of traffic to the new version and can also be quickly reverted without application downtime. 



B - Deploy the application temporarily and be prepared to pull it back if needed. Deploying the application new version as default requires moving all traffic to the new version. This could impact all users and disable the service during the new version's live time. 



C - Warn users that a new app version may have issues and provide a way to contact you if there are problems. We won't recommend this practice. 



D - Create a new project with the new app version, then redirect users to the new version. 



Deploying a second project requires data synchronization and having an external traffic splitting solution to direct traffic to the new application. While this is possible, with Google App Engine, these manual steps are not required.

</p></details><hr>

### QUESTION 95 (hasdttln)

How are subnetworks different than the legacy networks? 
-  They're the same, only the branding is different 
-  Each subnetwork controls the IP address range used for instances that are allocated to that subnetwork 
-  With subnetworks IP address allocation occurs at the global network level 
-  Legacy networks are the preferred way to create networks


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback Google Cloud Platform (GCP) legacy networking vs. VPC subnet: 



legacy networking

Legacy networks have a single RFC 1918 range, which you specify when you create the network. The network is global in scope and spans all cloud regions. 



In a legacy network, instance IP addresses are not grouped by region or zone. One IP address can appear in one region, and the following IP address can be in a different region. Any given range of IPs can be spread across all regions, and the IP addresses of instances created within a region are not necessarily contiguous. 



It is not possible to create regional subnets with a legacy network. 



legacy networking Example: 

[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT2/PT2_Q47.png ]



Subnets and IP ranges 

Each VPC network consists of one or more useful IP range partitions called subnetworks or subnets. Each subnet is associated with a region. Networks can contain one or more subnets in any given region. Subnets are regional resources. 



Each subnet must have a primary address range, which is a valid RFC 1918 CIDR block. 



Subnets in the same network must use unique IP ranges. Subnets in different networks, even in the same project, can re-use the same IP address ranges. 



VPC network example: 

[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT2/PT2_Q47.1.png ]



subnet3 is defined as 10.2.0.0/16, in the us-east1 region. One VM instance in the us-east1-a zone and a second instance in the us-east1-b zone, each receiving an IP addresses from its available range. 



Note: Legacy networks are not recommended. Many newer GCP features are not supported in legacy networks. It is still possible to create legacy networks through the gcloud command-line tool and the REST API. It is not possible to create legacy networks using the Google Cloud Platform Console. 



Reference resources 



Virtual Private Cloud (VPC) Network Overview https://cloud.google.com/vpc/docs/vpc 



Google Cloud Platform (GCP) legacy networking vs. VPC subnet https://cloud.google.com/vpc/docs/legacy

</p></details><hr>

### QUESTION 96 (ftqrttdcsd)

For this question, refer to the Dress4Win case study.
 
Dress4Win has a number of internal back-ends that they do not want to be exposed to the public Internet. How can they reduce their external exposure while still allowing maintenance access to resources when working remotely?

-  Remove the external IP address and use Cloud Shell to access internal-only resources 
-  Remove the external IP address and use a bastion host to access internal-only resources. 
-  Remove the external IP address and have remote employees dial into the company VPN connection for maintenance work. 
-  Hide the external IP address behind a load balancer and restrict load balancer access to the internal company network.


<details><summary>Answer:</summary><p>
Answer B 



Explanation 



Using a host to access GCP resources without an external IP address is a very secure method for limiting external exposure. 



Bastion Host Isolation illustrated, instance 1's external IP removed:

</p></details><hr>

### QUESTION 97 (yhacomfo5e)

You have a collection of media files over 5GB each that you need to migrate to Google Cloud Storage. The files are in your on-premises data center. What migration method can you use to help speed up the transfer process? 

-  Use multi-threaded uploads using the -m option. 
-  Use parallel uploads to break the file into smaller chunks then transfer it simultaneously. 
-  Use the Cloud Transfer Service to transfer. 
-  Start a recursive upload.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



A - Use multi-threaded uploads using the -m option. 



If you have a large number of files to transfer you might want to use the gsutil -m option, to perform a parallel (multi-threaded/multi-processing) copy: 



gsutil -m cp -r dir gs://my-bucket 



B (Correct answer) - Parallel uploads are for breaking up larger files into pieces for faster uploads. 



gsutil can automatically use object composition to perform uploads in parallel for large, local files being uploaded to Google Cloud Storage. If enabled (see below), a large file will be split into component pieces that are uploaded in parallel and then composed in the cloud (and the temporary components finally deleted). 



gsutil -o GSUtil:parallel_composite_upload_threshold=150M cp bigfile gs://your-bucket 



C - Use the Cloud Transfer Service to transfer. Storage Transfer Service is limited to AWS S3, Google Cloud Storage, and HTTP/HTTPS locations. 



D - Start a recursive upload: The -R and -r options are synonymous. Causes directories, buckets, and bucket subdirectories to be copied recursively. 



Reference: 

cp - Copy files and objects https://cloud.google.com/storage/docs/gsutil/commands/cp

</p></details><hr>

### QUESTION 98 (ycidangpct)

Your company is developing a next generation pet collar that collects biometric information to assist potential millions of families with promoting healthy lifestyles for their pets. Each collar will push 30kb of biometric data In JSON format every 2 seconds to a collection platform that will process and analyze the data providing health trending information back to the pet owners and veterinarians via a web portal. Management has tasked you to architect the collection platform ensuring the following requirements are met:

· Provide the ability for real-time analytics of the inbound biometric data
· Ensure processing of the biometric data is highly durable, elastic and parallel
· The results of the analytic processing should be persisted for data mining
 
Which architecture outlined below win meet the initial requirements for the platform?
-  Utilize Cloud Storage to collect the inbound sensor data, analyze data with Dataproc and save the results to BigQuery. 
-  Utilize Cloud Pub/Sub to collect the inbound sensor data, analyze the data with DataFlow and save the results to BigQuery. 
-  Utilize Cloud Pub/Sub to collect the inbound sensor data, analyze the data with DataFlow and save the results to Cloud SQL. 
-  Utilize Cloud Pub/Sub to collect the inbound sensor data, analyze the data with DataFlow and save the results to BigTable.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



Answer B meet all of the 3 requirements: 



Cloud Pub/Sub is a simple, reliable, scalable foundation for stream analytics and event-driven computing systems. As part of Google Cloud's stream analytics solution, the service ingests event streams and delivers them to Cloud Dataflow for processing and BigQuery for analysis as a data warehousing solution. Relying on the Cloud Pub/Sub service for delivery of event data frees you to focus on transforming your business and data systems with applications such as: 



• check Real-time personalization in gaming

• check Fast reporting, targeting and optimization in advertising and media

• check Processing device data for healthcare, manufacturing, oil and gas, and logistics

• check Syndicating market-related data streams for financial services



Other solutions may work one way or other but only the combination of theses 3 components integrate well in data ingestion, collection, and real-time analysis, and data mining in a highly durable, elastic, and parallel manner. 



A - Cloud storage is not suitable for this kind of real-time streaming data collection; Dataproc is GCP's BigData Hadoop/Spark that can do ETL and analysis, but DataFlow provide simple unified programming model for ETL and analysis in bot Realtime and batch and integrate well with PubSub. 



C - Cloud SQL is mainly for OLTP (Transactional, CRUD) not for OLAP (On-line Analytical Processing, Data Warehouse). It does not have the scalability, elasticity, and parallel to absorb this amount of Data in real time. Instead BigQuery integrate well with DataFlow and can absorb both steaming and batch data from it. 



D - Bigtable is one of the possible Data sink for DataFlow and have the capability to absorb this amount of real time data but it lacks the Data mining features like BigQuery. 



Further Explanation

Pub/Sub is kind of 'shock absorber', allowing asynchronous messaging between large numbers of devices. Cloud Dataflow acts as your data processing pipeline for ETL functions on both streaming and batch data. BigQuery is a data warehouse, able to run analysis on petabytes of data using SQL queries. 



Below is a reference architect Google recommending for similar scenario in Real-time streaming data collection and analysis https://cloud.google.com/solutions/mobile/mobile-gaming-analysis-telemetry 



Real-time processing of events from game clients and game 



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT2/PT2_Q50.png ]

</p></details><hr>

### QUESTION 99 (ftqrttjcso)

For this question, refer to the JencoMart case study.
 
One of the major business goals is to expand to Asia market, so JencoMart has built a version of their application on Google Cloud Platform that serves traffic to Asia. You want to measure success against their business and technical goals. Which metrics should you keep track of? 

Select one:
-  Total visits, error rates, and latency from Asia 
-  Latency difference between US and Asia 
-  The number of character sets present in the database 
-  Error rates for requests from Asia
-  Total visits and average latency for users in Asia


<details><summary>Answer:</summary><p>
Correct Answer E 



Feedback 



A - Total visits, error rates, and latency from Asia: "Total visits" itself is valid answer; error rate is not specific to Asia location nor is it mentioned in requirements; 



B - Latency difference between US and Asia: this is not mentioned in requirements nor is it relevant. 



C - The number of character sets present in the database: this is not part of requirements nor is it relevant. 



D - Error rates for requests from Asia is ambiguous nor is it mentioned in the requirements. Though one of Business Requirements "Guarantee service availability and support" seems relevant, Error rates for requests from Asia is not a relevant measure for it. Also, this choice alone does not make complete answers to the question. 



E (Correct Answer) - Total visits and average latency for users in Asia: Total visits can reflect and be a measure of the growing in Asia market by comparing to the number prior to the expanding; average latency for users in Asia is good measure and directly map to the technical requirements: Decrease latency in Asia. 



JencoMart case study's Business and Technical Requirements, relevant to expanding to Asia are highlighted

Business Requirements

• Optimize for capacity during peak periods and value during off-peak periods. 

• Guarantee service availability and support. 

• Reduce on-premises footprint and associated financial and environmental impact. 

• Move to outsourcing model to avoid large upfront costs associated with infrastructure purchase. 

• Expand services into Asia. 



Technical Requirements

• Assess key application for cloud suitability. 

• Modify applications for the cloud. 

• Move applications to a new infrastructure. 

• Leverage managed services wherever feasible. 

• Sunset 20% of capacity in existing data centers. 

• Decrease latency in Asia.

</p></details><hr>

### QUESTION 100 (alewacttdv)

A lead engineer wrote a custom tool that deploys virtual machines in the legacy data center. He wants to migrate the custom tool to the new cloud environment. You want to advocate for the adoption of Google Cloud Deployment Manager. What are two business risks of migrating to Cloud Deployment Manager? 

Choose 2 answers:
-  Cloud Deployment Manager requires a Google APIs service account to run. 
-  Cloud Deployment Manager APIs could be deprecated in the future. 
-  Cloud Deployment Manager only supports automation of Google Cloud resources. 
-  Cloud Deployment Manager is unfamiliar to the company's engineers. 
-  Cloud Deployment Manager uses Python. 
-  Cloud Deployment Manager can be used to permanently delete cloud resources.


<details><summary>Answer:</summary><p>
Correct Answer C and F 



Explanation 



A - Cloud Deployment Manager requires a Google APIs service account to run. 



"To create other Google Cloud Platform resources, Deployment Manager uses the credentials of the Google APIs service account to authenticate to other APIs". See: Access control for Deployment Manager 



The question statement is true but it's not a business risk, it's actually a good security feature. 



B - Cloud Deployment Manager APIs could be deprecated in the future. Yes, but you should expect every API eventual could be deprecated with replacement of new version. With the right programming model, migrate to different version can be properly handled. See: Deprecated APIs 



C (Correct answer) - Cloud Deployment Manager only supports automation of Google Cloud resources - The statement is true, and it is a business risk since it ties deployment automation to Deployment manager, for example, it could potentially hamper the perspective customers from switching or migrating to GCP from other cloud providers or from on-premise. 



D - Cloud Deployment Manager is unfamiliar to the company's engineers - this is normal IT issue not unique to Deployment Manager. Every engineer somehow at some points would encounter something new or unknown before and need to learn. 



E - Cloud Deployment Manager uses Python. Yes, a template is a file is written in either Python or Jinja2 and configuration file (the YAML file). But the Declarative nature allows the user to specify what the configuration should be and let the system figure out the steps to take. This make it less business risk. 



F (Correct answer) - Cloud Deployment Manager can be used to permanently delete cloud resources. Yes, the statement is true, and it is a protentional business risk if wrong or unintended deployment template used: e.g., if accidently delete critical resources and/or bring the application down. 



"When you delete a deployment, all resources that are part of the deployment are also deleted." 

"Warning: You cannot undo this operation." See: Deleting Deployments

</p></details><hr>

### QUESTION 101 (ydgwoasovf)

Your developer group works on a set of VM's frequently throughout the day. To save costs, you terminate the VM when it is not in use. However, you need to preserve the contents of the disk when the VM is terminated so users can resume where they left off when a new one is created. What is the most cost-effective way to do? 

Choose two:
-  Set the disk to no-auto-delete to preserve contents. 
-  Back up the disk contents to Cloud Storage before deleting. 
-  When not in use, only stop the instance instead of deleting it. 
-  Take a snapshot of the disk before terminating the VM.


<details><summary>Answer:</summary><p>
Correct Answer A and C 



Feedback 



A (Correct Answer) - Set the disk to no-auto-delete to preserve contents. Setting your instance to not delete the root disk when deleting the instance will preserve the disk contents to attach to a new instance. 



C (Correct Answer) - When not in use, only stop the instance instead of deleting it. Alternatively, you can merely stop the instance instead of deleting it, during which time you will not be billed for Machine Type usage (just disk storage). 



B and D may work but are not suitable solutions since the VMs may need frequently stop and resume throughout the day. 



More Information: 

https://cloud.google.com/sdk/gcloud/reference/compute/instances/set-disk-auto-delete

</p></details><hr>

### QUESTION 102 (yhcakecn'y)

You have created a Kubernetes engine cluster named 'mycluster'. You've realized that you need to change the machine type for the cluster from n1-standard-1 to n1-standard-4. 

What is the command to make this change? 
-  You must create a new node pool in the same cluster and migrate the workload to the new pool. 
-  gcloud container clusters update mycluster --machine-type n1-standard-4 
-  This action is not possible. 
-  gcloud container clusters resize mycluster --machine-type n1-standard-4


<details><summary>Answer:</summary><p>
Correct answer A 



Feedback A (Correct answer) - You must create a new node pool in the same cluster and migrate the workload to the new pool. You cannot change the machine type for an individual node pool after creation. You need to create a new pool and migrate your workload over. 



Here are the steps for "Migrating workloads to different machine types" 

https://cloud.google.com/kubernetes-engine/docs/tutorials/migrating-node-pool 



B - gcloud container clusters update mycluster --machine-type n1-standard-4 updates cluster settings for an existing container cluster. You can use this command to specify --max-nodes --min-nodes for autoscaling purpose not for changing machines type 

https://cloud.google.com/sdk/gcloud/reference/container/clusters/update 



C - This action is not possible. It's possible to migrate workloads running on a Kubernetes Engine cluster to a new set of nodes without incurring downtime for your application. See "Migrate the workloads" 

https://cloud.google.com/kubernetes-engine/docs/tutorials/migrating-node-pool#step_4_migrate_the_workloads 



D - gcloud container clusters resize mycluster --machine-type n1-standard-4. Resizes an existing cluster for running containers not for changing machine type 

https://cloud.google.com/sdk/gcloud/reference/container/clusters/resize

</p></details><hr>

### QUESTION 103 (ywapaawyat)

You're writing a Python application and want your application to run in a sandboxed managed environment with the ability to scale up in seconds to account for huge spikes in demand. 

Which service should you host your application on? 
-  Compute Engine 
-  App Engine Flexible Environment 
-  Kubernetes Engine 
-  App Engine Standard Environment


<details><summary>Answer:</summary><p>
Correct Answer D 



Explanation

App Engine Standard environment intend to

• Language: Python, Java, Node.js, PHP, and Go

• Experiences sudden and extreme spikes of traffic which require immediate scaling. 

• Instance startup time in seconds



Reference 

Choosing an App Engine Environment https://cloud.google.com/appengine/docs/the-appengine-environments

</p></details><hr>

### QUESTION 104 (ymdwtsoape)

Your marketing department wants to send out a promotional email campaign. The development team wants to minimize direct operation management. They project a wide range of possible customer responses, from 100 to 500,000 click-throughs per day. The link leads to a simple website that explains the promotion and collects user information and preferences. 

Which infrastructure should you recommend? 
-  Use a single compute Engine virtual machine (VM) to host a web server, backed by Google Cloud SQL. 
-  Use a Google Container Engine cluster to serve the website and store data to persistent disk. 
-  Use a managed instance group to serve the website and Google Cloud Bigtable to store user data. 
-  Use Google App Engine to serve the website and Google Cloud Datastore to store user data.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



D (Correct answer) - Use Google App Engine to serve the website and Google Cloud Datastore to store user data - This solution meets all the requirements and has all the element of App Engine features 



App Engine Standard environment intend to

• Multiple Languages supported; 

• Experiences sudden and extreme spikes of traffic which require immediate scaling; 

• Instance startup time in seconds



Google Cloud Datastore is a NoSQL document database built for automatic scaling, high performance, and ease of application development and integrating well with AppEngine 



Datastore: A scalable, fully-managed NoSQL document database for your web and mobile applications. 



Good for: 

Semi-structured application data

Hierarchical data

Durable key-value data



Workload: 

User profiles

Product catalogs

Game state



The combination of App Engine and DataStore make answer D a clear choice. 



A - Use a single compute Engine virtual machine (VM) to host a web server, backed by Google Cloud SQL - Not as good as App Engine solution for "minimize direct operation management" and single VM may not scalable enough to handle the traffic spikes from 100 to 500,000 click throughs per day. 



B - Use a Google Container Engine cluster to serve the website and store data to persistent disk - Slightly better than A but still not as good as App Engine solution for "minimize direct operation management". Also store huge amount of user information and preferences data to disk is improper in term of programming model, efficiency, cost, and scalability 



C - Use a managed instance group to serve the website and Google Cloud Bigtable to store user data - this would overkill for this kind of simple application in term of programming model, efficiency, and cost. It deviates further from the requirements "to minimize direct operation management." 



Additional Resource

Choosing an App Engine Environment https://cloud.google.com/appengine/docs/the-appengine-environments

Build highly scalable applications on a fully managed serverless platform https://cloud.google.com/appengine/docs/standard/python/datastore/

</p></details><hr>

### QUESTION 105 (ycimtcatgc)

Your customer is moving their corporate applications to Google Cloud Platform. The security team wants detailed visibility of all projects in the organization. You provision the Google Cloud Resource Manager and set up yourself as the org admin. 

Which Google Cloud Identity and Access Management (Cloud IAM) roles should you give to the security team? 
-  Org viewer, project owner 
-  Org viewer, project viewer 
-  Org admin, project browser 
-  Project owner, network admin


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



Answer B gives the security team read only access to everything your company produces, anything else gives them the ability to, accidentally or otherwise, change things, a violation to the principle of least privilege.

</p></details><hr>

### QUESTION 106 (utpolpycbn)

Using the principle of least privilege, your colleague Bob needs to be able to create new instances on Compute Engine in project 'Project A'. 

How should you give him access without giving more permissions than is necessary? 
-  Give Bob Compute Engine Instance Admin Role for Project A. 
-  Give Bob Compute Engine Admin Role for Project A. 
-  Create a shared VPC that Bob can access Compute resources from. 
-  Give Bob Project Editor IAM role for Project A.


<details><summary>Answer:</summary><p>
Correct answer A 



Explanation 

A (Correct answer) - Give Bob Compute Engine Instance Admin Role for Project A - The Compute Engine Instance Admin role only gives access to create/edit compute engine resources such as instances, disks, and snapshots. 



B - Give Bob Compute Engine Admin Role for Project A - The Compute Engine Admin role also gives admin access to network resources as well, which is too much. 



C - Create a shared VPC that Bob can access Compute resources from - shared VPC is not for granting user role. For example, even if you create shared VPC between "Project A" and "Project B", to meet the requirement, you still need to grant Bob Compute Engine Instance Admin Role for Project A. 



D - Give Bob Project Editor IAM role for Project A - that'll be too much for create new instances on Compute Engine in project 'Project A'

</p></details><hr>

### QUESTION 107 (seopolpct3)

Select examples of principal of least privilege. Choose the 3 correct answers: 
-  Restrict service account access 
-  Assign Compute Instance Admin role vs Compute Admin 
-  Separate production and test environments 
-  Create IAM Folders to manage groups of projects


<details><summary>Answer:</summary><p>
Correct answer A, B, and C 



Explanation 



A (Correct answer) - Restrict service account access 



A service account is a special type of Google account that belongs to your application or a virtual machine (VM), instead of to an individual end user. The least privilege principle for granting user role and permission still applies to service account. You should only grant the service account the minimum set of permissions required to achieve their goal. 



B (Correct answer) - Assign Compute Instance Admin role vs. Compute Admin 



The Compute Engine Instance Admin role only gives access to create/edit compute engine resources such as instances, disks, and snapshots while the Compute Engine Admin role also gives admin access to network resources as well, which is too much if your intended goal is to grant permission for managing compute engine instance only. 



C (Correct answer)- Separate production and test environments 



For least privilege and separation of duties, the best practice is to separate both environments into different projects, development or production team gets their own accounts, and each team is assigned to only their projects. 



Use projects to group resources that share the same trust boundary. For example, resources for the same product or microservice can belong to the same project. 



https://cloud.google.com/iam/docs/resource-hierarchy-access-control#best_practices 



D (Incorrect) - Create IAM Folders to manage groups of projects 



Organizations can use folders to group projects under the organization node in a hierarchy. Folder is not for organizing users nor for organizing their access privileges, and there no concept such as IAM folders.

</p></details><hr>

### QUESTION 108 (upolpaafma)

Using principal of least privilege and allowing for maximum automation, what steps can you take to store audit logs for long-term access and to allow access for external auditors to view? 

Choose the 2 correct answers: 
-  Create account for auditors to have view access to Stackdriver Logging. 
-  Export audit logs to Cloud Storage via an export sink. 
-  Export audit logs to BigQuery via an export sink. 
-  Create account for auditors to have view access to export storage bucket with the Storage Object Viewer role.


<details><summary>Answer:</summary><p>
Correct answer B and D 



Feedback 



A - Create account for auditors to have view access to Stackdriver Logging - continue storing log information in StackDriver is not a proper solution for "Long term access". 



Between B and C, the difference is where to store the logs, BigQuery or Cloud Storage. Since the main concern is extended storing period, B (Correct Answer) is a better answer, and the "Long term access" further qualifies it, for example, using Coldline storage class. 



With regards to BigQuery, while it is also a low-cost storage, but the main purpose is for analysis. Also, logs stored in Cloud Storage is easy to transport to BigQuery or do query directly against the files saved in Cloud Storage if and whenever needed. 



D (Correct Answer) - Create account for auditors to have view access to export storage bucket with the Storage Object Viewer role - this completes the answers by providing a view only role to the auditors

</p></details><hr>

### QUESTION 109 (ieantbatay)

If external auditors need to be able to access your admin activity logs once a year for compliance, what is the best method of preserving and sharing that log data? 

Choose two:
-  If they need access to multiple logs in a single bucket, and they have a GCP account, export logs to a Cloud Storage bucket for long-term retention and grant auditor accounts the Storage Object Viewer role to the bucket. 
-  Create GCP accounts for the auditors and grant the Project Viewer role to view logs in Stackdriver Logging. 
-  If they do not need a GCP account and need to view a single date's object, export the logs to a Cloud Storage bucket for long-term retention and generate a signed URL for temporary object-level access. 
-  Export logs to Cloud Storage bucket and email a list of the logs once per year.


<details><summary>Answer:</summary><p>
Correct Answer A and C 



Explanation 



For long-term logs preserving and retention: There are 3 type of sink destinations you can export Logs to: Cloud Storage, Cloud Pub/Sub, BigQuery. Export logs to Cloud Storage via an export sink. Cloud Storage is perfect solution for long-term logs retention.



For Sharing: 



The choice to use IAM or signed URL's depends on if the auditors need a GCP account or need access to a single object or all logs in a bucket. 



You could either create a GCP account for auditor ACL object access or signed URL's depending on if they need to have a GCP account or not. 



Answer A is correct. If Auditors have GCP accounts, you can grant them "roles/storage.objectViewer" which can view objects and their metadata. Note the different between "storage.objectViewer" and "Project Viewer" 

https://cloud.google.com/storage/docs/access-control/iam-roles Cloud Storage IAM Roles 



Answer C is correct: "A signed URL is associated with a bucket or object and gives time-limited read or write access to that specific resource. Anyone in possession of the URL has the access granted by the URL, regardless of whether they have a Google account." 

https://cloud.google.com/storage/docs/access-control/create-signed-urls-program 



Answer B is incorrect: Project Viewer role is not enough to view Admin Activity logs in Stackdriver Logging. "To view the logs, you must have the IAM roles Logging/Private Logs Viewer or Project/Owner". 

https://cloud.google.com/logging/docs/audit/#admin-activity 



Note: the StackDriver Admin activity log retention period is 400 days which meets and exceeds the required once a year access. 



Answer C is incorrect due to this part: "email a list of the logs once per year"

</p></details><hr>

### QUESTION 110 (yantpcctyw)

Your application needs to process credit card transactions. You want the smallest scope of Payment Card Industry (PCI) compliance without compromising the ability to analyze transactional data and trends relating to which payment methods are used. How should you design your architecture?
 
Select one:
-  Create separate subnetworks and isolate the components that process credit card data. 
-  Streamline the audit discovery phase by labeling all of the virtual machines (VMs) that process PCI data. 
-  Create separate projects that only process credit card data. 
-  Enable Logging export to Google BigQuery and use ACLs and views to scope the data shared with the auditor. 
-  Create a tokenizer service and store only tokenized data.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



For the question described scenarios, the proper model for exporting credit card processing data is to forward from a squid proxy to Stackdriver Logging, and export from Stackdriver Logging into BigQuery. 



Here is the Monitoring and logging flow 

https://cloud.google.com/solutions/pci-dss#monitoring_and_logging_flow 



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q12.png ]



Every server in the payment-processing application network sends its logs to Stackdriver Monitoring and Stackdriver Logging, using Squid proxy servers to securely transmit the log data. 



Note: PCI Data go through Squid proxy, squid proxy server restricts traffic leaving your payment processing application network, and allow securely send traffic to stack driver logging 



Additional resources 



Here is the full solution for Creating a PCI-DSS-Compliant Environment 

https://cloud.google.com/solutions/pci-dss

</p></details><hr>

### QUESTION 111 (ywtotpoaar)

You want to optimize the performance of an accurate, real-time, weather-charting application. The data comes from 50,000 sensors sending 10 readings a second, in the format of a timestamp and sensor reading. 

Where should you store the data? 
-  Google BigQuery 
-  Google Cloud Storage 
-  Google Cloud Bigtable 
-  Google Cloud SQL


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



A - Google BigQuery: A scalable, fully-managed Enterprise Data Warehouse (EDW) with SQL and fast response times. It is for analytics and OLAP workload, though it also provides storage capacity and price similar to GCS and it cannot stand for this amount (50000 X 10 per second) of data streaming ingestion in real-time. 



B - Google Cloud Storage: A scalable, fully-managed, highly reliable, and cost-efficient object / blob store. It cannot stand for this amount of data streaming ingestion rate in real-time 



C (Correct answer) - Google Cloud Bigtable: A scalable, fully-managed NoSQL wide-column database that is suitable for both real-time access and analytics workloads. 

https://cloud.google.com/storage-options/ 



Bigtable is Good for

• Low-latency read/write access

• High-throughput analytics

• Native time series support



For the following common work load

• IoT, finance, adtech

• Personalization, recommendations

• Monitoring

• Geospatial datasets

• Graphs



D - Google Cloud SQL: A fully-managed MySQL and PostgreSQL relational database service for Structured data and OLTP workloads. It also won't stand for this type of high ingesting rate in real time

</p></details><hr>

### QUESTION 112 (ynttsdftoi)

You need to take streaming data from thousands of Internet of Things (IoT) devices, ingest it, run it through a processing pipeline, and store it for analysis. You want to run SQL queries against your data for analysis. 

What services in which order should you use for this task? 
-  Cloud Dataflow, Cloud Pub/Sub, BigQuery 
-  Cloud Pub/Sub, Cloud Dataflow, Cloud Dataproc 
-  Cloud Pub/Sub, Cloud Dataflow, BigQuery 
-  App Engine, Cloud Dataflow, BigQuery


<details><summary>Answer:</summary><p>
Correct Answer C 



Explanation 



C (Correct answer) - Cloud Pub/Sub, Cloud Dataflow, BigQuery 



Cloud Pub/Sub is a simple, reliable, scalable foundation for stream analytics and event-driven computing systems. As part of Google Cloud's stream analytics solution, the service ingests event streams and delivers them to Cloud Dataflow for processing and BigQuery for analysis as a data warehousing solution. Relying on the Cloud Pub/Sub service for delivery of event data frees you to focus on transforming your business and data systems with applications such as: 



• check Real-time personalization in gaming

• check Fast reporting, targeting and optimization in advertising and media

• check Processing device data for healthcare, manufacturing, oil and gas, and logistics

• check Syndicating market-related data streams for financial services



Also, Use Cloud Dataflow as a convenient integration point to bring predictive analytics to fraud detection, real-time personalization and similar use cases by adding TensorFlow-based Cloud Machine Learning models and APIs to your data processing pipelines. 

https://cloud.google.com/ml-engine/ 



BigQuery provides a flexible, powerful foundation for Machine Learning and Artificial Intelligence. BigQuery provides integration with CloudML Engine and TensorFlow to train powerful models on structured data. Moreover, BigQuery's ability to transform and analyze data helps you get your data in shape for Machine Learning. 

https://cloud.google.com/bigquery/ 



Other solutions may work one way or other but only the combination of theses 3 components integrate well in data ingestion, collection, and real-time analysis, and data mining in a highly durable, elastic, and parallel manner. 



A - Wrong order. You don't normally ingest IoT data directly to DataFlow 



C - DataProc is GCP version of Apache Hadoop/Spark. Although it has the SQL-like Hive, it does not provide SQL interface as sophisticated as BigQuery does. 



D - App Engine is compute resources. It is not designed to ingest IoT data like PubSub. Also. It's rare use case App Engine ingests data to DataFlow directly. 



Below two pictures illustrate the typical toles played by DataFlow and PubSub 



Dataflow 



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q14.png ]



PubSub

</p></details><hr>

### QUESTION 113 (ycppisitdw)

Your CI/CD pipeline process is shown in the diagram. Which GCP services should you use in boxes 1, 2, and 3?

- [URL: https://udemy-images.s3.amazonaws.com/redactor/raw/2018-08-07_18-26-03-cb6ebbb247478d50052e33c7282e7e0f.png ]


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



D (Correct Answer) - Google Cloud Source Repositories provides a Git version-controlled development environment. Google Cloud Container Builder builds docker images from source repositories like Google Cloud Source Repositories. Finally, Google Container Engine can run and manage your docker containers received from Jenkin's deployment pipeline. 



A - Google Cloud Storage and PubSub do not offer a means to manage or deploy application code. 



B - Google Cloud Shell does not offer a means to build docker images, so while source code can live in Google Cloud Storage, Cloud Shell would not be the appropriate solution. 



C - This option does not provide for any solution which builds the necessary docker images.

</p></details><hr>

### QUESTION 114 (ychdtmamro)

Your company has decided to make a major revision of their API in order to create better experiences for their developers. They need to keep the old version of the API available and deployable, while allowing new customers and testers to try out the new API. They want to keep the same SSL and DNS records in place to serve both APIs. 

What should they do? 
-  Configure a new load balancer for the new version of the API. 
-  Reconfigure old clients to use a new endpoint for the new API. 
-  Have the old API forward traffic to the new API based on the path. 
-  Use separate backend pools for each API path behind the load balancer.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



A - Configure a new load balancer for the new version of the API. 



Then you'll have two load balancers: new and old one. This would break the API contract and also need to configure SSL and DNS for new load balancer 



B - Reconfigure old clients to use a new endpoint for the new API. 



This would break the contract between client and API and also can no longer reach to old API. 



C - Have the old API forward traffic to the new API based on the path. 



This is against the design principle and best practice for webservices API. API should not play this role - API should not know how to route client requests. In fact, API even shouldn't have knowledge about client at all. 



D (Correct answer) - Use separate backend pools for each API path behind the load balancer. 



This solution meets both requirements: continue servicing old and new API and keep the same SSL and DNS records 



Further Explanation 

HTTP(S) Load Balancing configuration and it backend service: A configured backend service contains one or more backends. 



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q16.png }



Here is demonstrating configuration for the concept similar to the question scenarios: you just need to configure URL mapping pointing to the new and old APIs which are hosted in corresponding backends - this implementation meets all the requirement: No contract breaking; clients continue to access new and old API without reconfigure SSL and DNS 



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q16.1.png }



References 

Setting Up HTTP(S) Load Balancing https://cloud.google.com/compute/docs/load-balancing/http/ 

Backend service components: https://cloud.google.com/compute/docs/load-balancing/http/backend-service 

Creating Content-Based Load Balancing https://cloud.google.com/load-balancing/docs/https/content-based-example

</p></details><hr>

### QUESTION 115 (yaraaigaet)

You are running an application in Google App Engine that is serving production traffic. You want to deploy a risky but necessary change to the application. It could take down your service if not properly coded. During development of the application, you realized that it can only be properly tested by live user traffic. 

How should you test the feature? 
-  Deploy the new application version temporarily, and then roll it back. 
-  Create a second project with the new app in isolation, and onboard users. 
-  Set up a second Google App Engine service, and then update a subset of clients to hit the new service. 
-  Deploy a new version of the application and use traffic splitting to send a small percentage of traffic to it.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



D (Correct Answer) - Deploying a new version without assigning it as the default version will not create downtime for the application. Using traffic splitting allows for easily redirecting a small amount of traffic to the new version and can also be quickly reverted without application downtime. 



A - Deploying the application version as default requires moving all traffic to the new version. This could impact all users and disable the service. 



B - Deploying a second project requires data synchronization and having an external traffic splitting solution to direct traffic to the new application. While this is possible, with Google App Engine, these manual steps are not required. 



C - App Engine services are intended for hosting different service logic. Using different services would require manual configuration of the consumers of services to be aware of the deployment process and manage from the consumer side who is accessing which service.Correct Answer D 



Feedback 



D (Correct Answer) - Deploying a new version without assigning it as the default version will not create downtime for the application. Using traffic splitting allows for easily redirecting a small amount of traffic to the new version and can also be quickly reverted without application downtime. 



A - Deploying the application version as default requires moving all traffic to the new version. This could impact all users and disable the service. 



B - Deploying a second project requires data synchronization and having an external traffic splitting solution to direct traffic to the new application. While this is possible, with Google App Engine, these manual steps are not required. 



C - App Engine services are intended for hosting different service logic. Using different services would require manual configuration of the consumers of services to be aware of the deployment process and manage from the consumer side who is accessing which service.

</p></details><hr>

### QUESTION 116 (ycupcaslsr)

Your company's user-feedback portal comprises a standard LAMP stack replicated across two zones. It is deployed in the us-central1 region and uses autoscaled managed instance groups on all layers, except the database. Currently, only a small group of select customers have access to the portal. The portal meets a 99.99% availability SLA under these conditions. However next quarter, your company will be making the portal available to all users, including unauthenticated users. You need to develop a resiliency testing strategy to ensure the system maintains the SLA once they introduce additional user load. 

What should you do? 
-  Expose the new system to a larger group of users and increase group's size each day until autoscale logic is triggered on all layers. At the same time, terminate random resources on both zones. 
-  Create synthetic random user input, replay synthetic load until autoscale logic is triggered on at least one layer, and introduce "chaos" to the system by terminating random resources on both zones. 
-  Capture existing users input and replay captured user load until autoscale is triggered on all layers. At the same time, terminate all resources in one of the zones. 
-  Capture existing users input and replay captured user load until resource utilization crosses 80%. Also, derive estimated number of users based on existing users' usage of the app, and deploy enough resources to handle 200% of expected load.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



B (Correct answer) - Create synthetic random user input, replay synthetic load until autoscale logic is triggered on at least one layer, and introduce "chaos" to the system by terminating random resources on both zones. 



Ideally, the test environment should always resemble production in term of infrastructure and workload but it's not always realistic. For example, testing data with full user population is not available, or test environment at production level is not ready. 



In the question scenario, you can test in pre-production with a synthetic workload from existing users which simulates a production workload and introduce "chaos" to simulate one zone failure to test the availability for the SLA. 



This enables you to decouple deployment from release, get real user feedback, test for bugs, and assess infrastructure performance. 



Answers A, C, and D either incorrect or incomplete in workload simulation for testing users' generation, or zone (s) failure simulation for availability SLA. 



Additional Resources 

Provisioning a regional managed instance group in two zones: 

https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#provisioning_a_regional_managed_instance_group_in_two_zones

</p></details><hr>

### QUESTION 117 (dwtdpssott)

Dress4Win wants to do penetration security scanning on the test and development environments deployed to the cloud. The scanning should be performed from an end user perspective as much as possible. How should they conduct the penetration testing? 

- Notify Google to begin conducting regular penetration security scanning on behalf of Dress4Win. 
- Deploy the security scanners into the cloud environments and conduct penetration testing within each environment. 
- Use the on-premises scanners to conduct penetration testing on the cloud environments routing traffic over the VPN. 
- Use the on-premises scanners to conduct penetration testing on the cloud environments routing traffic over the public internet.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



D (Correct Answer) - Having the scanners be located outside the cloud environment will best emulate end user penetration testing. Using the public internet to access the environments best emulates end user traffic. 



A - Google does not require notification for customers conducting security scanning on their own applications. 



B - Deploying the security scanners within the cloud environment may not test the border security configuration that end users would normally access. This does not emulate as close as possible end user traffic. 



C - Deploying the security scanners using the VPN between the on-premises and cloud environments may not test the border security configuration that end users would normally access. VPN traffic may be trusted higher than public internet traffic and not emulate as close as possible end user traffic.

</p></details><hr>

### QUESTION 118 (ftqrttmgcs)

For this question, refer to the Mountkirk Games case study.
 
Mountkirk Games wants you to design their new testing strategy. 

How should the test coverage differ from their existing backends on the other platforms?
-  Tests should scale well beyond the prior approaches. 
-  Unit tests are no longer required, only end-to-end tests. 
-  Tests should be applied after the release is in the production environment. 
-  Tests should include directly testing the Google Cloud Platform (GCP) infrastructure.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback 



A - Tests should scale well beyond the prior approaches. This is just too general and abstract, it also did not address test coverage requirement. 



B and C can be easily ruled out since they are against the overall IT DevOps best practices. 



D (Correct answer) - Tests should include directly testing the Google Cloud Platform (GCP) infrastructure. 



They had problems scaling their application servers, MySQL databases, and analytics tools. With previous cloud provider. This is clear indication that infrastructure testing is necessary especially when you move from other cloud provider to GCP 



Explanation 

Mountkirk Games Company Background 

A few of their games were more popular than expected, and they had problems scaling their application servers, 

MySQL databases, and analytics tools. 



CEO Statement 

Our last successful game did not scale well with our previous cloud provider, ... 



CTO Statement 

Our current technology stack cannot provide the scale we need, ... 



CFO Statement 

We are not capturing enough user demographic data, usage metrics, and other KPIs. ... 



They all pointed to the infrastructure and the scalability that need to be tested "Tests should include directly testing the Google Cloud Platform (GCP) infrastructure." To avoid previous pitfalls

</p></details><hr>

### QUESTION 119 (ftqrtttcst)

For this question, refer to the TerramEarth case study.
 
The TerramEarth development team wants to create an API to meet the company's business requirements. You want the development team to focus their development effort on business value versus creating a custom framework. 

Which method should they use?
-  Use Google App Engine with Google Cloud Endpoints. Focus on an API for dealers and partners. 
-  Use Google App Engine with a JAX-RS Jersey Java-based framework. Focus on an API for the public. 
-  Use Google App Engine with the Swagger (open API Specification) framework. Focus on an API for the public. 
-  Use Google Container Engine with a Django Python container. Focus on an API for the public. 
-  Use Google Container Engine with a Tomcat container with the Swagger (Open API Specification) framework. Focus on an API for dealers and partners.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



Answer B, C and D can be simply ruled out since none of the business requirements are public facing (see TerramEarth case study for details or below for briefing summary). Also, the frameworks mentioned are too specific. 



A (Correct answer) - Use Google App Engine with Google Cloud Endpoints. Focus on an API for dealers and partners. 



Google Cloud Endpoints is a distributed API Management system comprising services, runtimes, and tools. Cloud Endpoints is configured using the OpenAPI Specification (formerly Swagger Specification), provides management, monitoring, and authentication, to help you create, share, maintain, and secure your APIs. 



E - Use Google Container Engine with a Tomcat container with the Swagger (Open API Specification) framework. Focus on an API for dealers and partners. 



Google Cloud Endpoints is OpenAPI Specification (formerly Swagger Specification) based API management to help you create, share, maintain, and secure your APIs. 



Cloud Endpoints is designed to allow developers to easily choose the language and framework they want for their backend. Tomcat container is just one of supported container which primarily provide Java Runtime. 



TerramEarth Business Requirements

• Decrease unplanned vehicle downtime to less than 1 week, without increasing the cost of carrying surplus inventory. 

• Support the dealer network with more data on how their customers use their equipment to better position new products and services. 

• Have the ability to partner with different companies—especially with seed and fertilizer suppliers in the fast-growing agricultural business—to create compelling joint offerings for their customers. 





Cloud Endpoints Architecture 

[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q21.png ]

</p></details><hr>

### QUESTION 120 (tadbsaeppt)

The architecture diagram below shows an event-based processing pipeline that Dress4win is building to label and compress user uploaded images. 

[URL: https://udemy-images.s3.amazonaws.com/redactor/raw/2018-08-07_18-33-32-203707e9b6d0202713a15d281d1b56cc.png ]

Which GCP products should they use in boxes 1, 2 and 3?
-  Google App Engine, Google Cloud Datastore, Google Cloud Dataflow 
-  Google App Engine, Google Cloud Dataflow, Google Cloud Functions 
-  Google Cloud Storage, Google Cloud Pub/Sub, Google Cloud Dataflow 
-  Google Cloud Dataflow, Google Cloud Pub/Sub, Google Cloud Functions


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



C (Correct Answer) - Cloud Storage API easily allows write only bucket for the image uploads from the client, the upload event is then pushed into Pub/Sub triggering the Cloud Function to grab the file, push it through the Vision API, and send the meta-data into Pub/Sub, where DataFlow will see the message and process the file from GCS and store the metadata into Cloud SQL. 



A - An App Engine app could be written to accept image uploads, but Datastore is not for storing image files. 



B - An App Engine app could be written to accept image uploads, but natively Dataflow needs either a GCS bucket or a PubSub topic to listen to for event processing. Connecting Dataflow to AppEngine is a highly unusual architecture. 



D - Connecting users directly to Dataflow for image uploads is not going to be able to handle the bursty nature of user upload traffic efficiently thus won't give a reliable experience to users.

</p></details><hr>

### QUESTION 121 (arsutaewro)

A recent software update to an e-commerce website running on Google Cloud has caused the website to crash for several hours. The CTO decides that all critical changes must now have a backout/roll-back plan. The website is deployed on hundreds of virtual machines (VMs), and critical changes are frequent. Which two actions should you take to implement the back-out/roll-back plan? 

Choose two:
-  Create a Nearline copy for the website static data files stored in Google Cloud Storage. 
-  Enable object versioning on the website's static data files stored in Google Cloud Storage. 
-  Use managed instance groups with the "update-instances" command when starting a rolling update. 
-  Enable Google Cloud Deployment Manager (CDM) on the project and define each change with a new CDM template. 
-  Create a snapshot of each VM prior to an update and recover the VM from the snapshot in case of a new version failure.


<details><summary>Answer:</summary><p>
Correct Answer B and C 



Feedback 



B (Correct Answer) - Object versioning is a seamless way to ensure the last known good version of the static content is always available. 



C (Correct Answer) - Managed instance group updater allows for easy management of the VMs and lets GCE take care of updating each instance. 



A - This copy process is unreliable and makes it tricky to keep things in sync, it also doesn't provide a way to rollback once a bad version of the data has been written to the copy. 



D - This would add a great deal of overhead to the process and would cause conflicts in association between different Deployment Manager deployments which could lead to unexpected behavior if an old version is changed. 



E - This approach doesn't scale well, there is a lot of management work involved.

</p></details><hr>

### QUESTION 122 (ynthabpipf)

You need to have a backup/rollback plan in place for your application that is distributed across a large managed instance group. 

What is the preferred method for doing so? 
-  Use the Rolling Update feature to deploy/roll back versions with different managed instance group templates. 
-  Use the managed instance group snapshot function that is included in Compute Engine. 
-  Have each instance write critical application data to a Cloud Storage bucket. 
-  Schedule a cron job to take snapshots of each instance in the group.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



Individual VM's in a managed instance group should be treated as disposable entities and should not be individually backed up. Using the rolling update feature in your managed instance group allows you to use alternate managed instance templates for managing different versions of your application.

</p></details><hr>

### QUESTION 123 (ycipodawat)

Your company is planning on deploying a web application to Google Cloud hosted on a custom Linux distribution. Your website will be accessible globally and needs to scale to meet demand. Choose all of the components that will be necessary to achieve this goal.
 
Choose the 2 correct answers:
-  App Engine Standard environment 
-  HTTP Load Balancer 
-  Managed Instance Group on Compute Engine 
-  Network Load Balancer


<details><summary>Answer:</summary><p>
Correct Answer B and C 



Explanation 



B and C (Correct answers) - A managed instance group can auto scale and use a custom Linux distribution. An HTTP load balancer serves web traffic and is a global load balancer (single load balancer for all GCP regions worldwide). 



A - App Engine would support autoscaling but does not use custom Linux distributions. 



D - A Network Load Balancer might be used in conjunction with an HTTP Load Balancer for backend functions but is not the required component in this scenario.

</p></details><hr>

### QUESTION 124 (yccasscfig)

Your company collects and stores security camera footage in Google Cloud Storage. Within the first 30 days, footage is
processed regularly for threat detection, object detection, trend analysis, and suspicious behavior detection. You want to minimize the cost of storing all the data. 

How should you store the videos?
-  Use Google Cloud Regional Storage for the first 30 days, and then move to Coldline Storage. 
-  Use Google Cloud Nearline Storage for the first 30 days, and then move to Coldline Storage. 
-  Use Google Cloud Regional Storage for the first 30 days, and then move to Nearline Storage. 
-  Use Google Cloud Regional Storage for the first 30 days, and then move to Google Persistent Disk.


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct Answer) - Since the data is accessed frequently within the first 30 days, using Google Cloud Regional Storage will enable the most cost-effective solution for storing and accessing the data. For videos older than 30 days, Google Cloud Coldline Storage offers the most cost-effective solution since it won't be accessed. 



B - While Google Cloud Coldline storage is cost-effective for long-term video storage, Google Cloud Nearline Storage would not be an effective solution for the first 30 days as the data is expected to be accessed frequently. 



C - While Google Cloud Regional Storage is the most cost-effective solution for the first 30 days, Google Cloud Nearline Storage is not cost effective for long-term storage. 



D - While Google Cloud Regional Storage is the most cost-effective solution for the first 30 days, storing the data on Google Cloud Persistent Disk would not be cost-effective for long term storage.

</p></details><hr>

### QUESTION 125 (ftqrtttcst)

For this question, refer to the TerramEarth case study.
 
TerramEarth has equipped unconnected trucks with servers and sensors to collet telemetry data. Next year they want to use the data to train machine learning models. They want to store this data in the cloud while reducing costs. 

What should they do?
-  Have the vehicle' computer compress the data in hourly snapshots and store it in a Google Cloud storage (GCS) Nearline bucket. 
-  Push the telemetry data in Real-time to a streaming dataflow job that compresses the data and store it in Google BigQuery. 
-  Push the telemetry data in real-time to a streaming dataflow job that compresses the data and store it in Cloud Bigtable. 
-  Have the vehicle's computer compress the data in hourly snapshots, a Store it in a GCS Coldline bucket.


<details><summary>Answer:</summary><p>
Correct Answer D 



Feedback D (Correct answer) - Have the vehicle's computer compress the data in hourly snapshots, a Store it in a GCS Coldline bucket. This is Lowest cost for storage for infrequently access that meets the requirement ("next year ..."). There is no good reason using nearline instead of low cost storage Coldline for one-year-after access 



A - Have the vehicle' computer compress the data in hourly snapshots and store it in a Google Cloud storage (GCS) Nearline bucket. Nearline does not fit the usage patter described in the question



Nearline fits this usage patter: For example, if you want to continuously add files to cloud storage, and plan to access those files once a month for analysis, nearline storage is a great choice. 



B and C can be eliminated for this reason "Push the telemetry data in real-time to a streaming dataflow job ..." since vehicles are unconnected 



Reference Resource 

Comparison of storage classes https://cloud.google.com/storage/docs/storage-classes



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q27.png ]

</p></details><hr>

### QUESTION 126 (ycchaasbyn)

Your company currently hosts an AWS S3 bucket. You need to keep the contents of this bucket in sync with a new Google Cloud Storage bucket to support a backup storage destination. 

What is the best method to achieve this? 
-  Once per week, use a gsutil cp command to copy over newly modified files. 
-  Use gsutil rsync commands to keep both locations in sync. 
-  Use Storage Transfer Service to keep both the source and destination in sync. 
-  Use gsutil -m cp to keep both locations in sync.


<details><summary>Answer:</summary><p>
Correct Answer C 



Explanation 



You can use gsutil rsync to keep two locations in sync. However, the preferred option when working with an AWS S3 bucket is to use the Storage Transfer Service. 



Here are the rules of thumb when deciding whether to use gsutil or Storage Transfer Service: 

• When transferring data from an on-premises location, use gsutil. 

• When transferring data from another cloud storage provider, use Storage Transfer Service. 

• Otherwise, evaluate both tools with respect to your specific scenario.

</p></details><hr>

### QUESTION 127 (yaihamraco)

Your application is hosted across multiple regions and consists of both relational database data and static images. Your database has over 10 TB of data. You want to use a single storage repository for each data type across all regions. Which two products would you choose for this task? 

Choose two:
-  Cloud Bigtable 
-  Cloud Spanner 
-  Cloud SQL 
-  Cloud Storage


<details><summary>Answer:</summary><p>
Correct Answer B and D 



Cloud Spanner acts as an SQL database that is horizontally scalable for cross-region support and can host large datasets. 



Cloud Storage supports multi-regional buckets for high performance from different regions.

</p></details><hr>

### QUESTION 128 (apdvmogceh)

A production database virtual machine on Google Compute Engine has an ext4-formatted persistent disk for data files. The database is about to run out of storage space. 

How can you remediate the problem with the least amount of downtime? 
-  In the Cloud Platform Console, increase the size of the persistent disk and use the resize2fs command in Linux. 
-  Shut down the virtual machine, use the Cloud Platform Console to increase the persistent disk size, then restart the virtual machine. 
-  In the Cloud Platform Console, increase the size of the persistent disk and verify the new space is ready to use with the fdisk command in Linux. 
-  In the Cloud Platform Console, create a new persistent disk attached to the virtual machine, format and mount it, and configure the database service to move the files to the new disk. 
-  In the Cloud Platform Console, create a snapshot of the persistent disk, restore the snapshot to a new larger disk, unmount the old disk, mount the new disk, and restart the database service.


<details><summary>Answer:</summary><p>
Correct Answer A 



Explanation 



Answers B (Shut down VM), D (Move files to new attached disk), and E (Use snapshot to restore ... restart the database service) all have some sorts of downtime, so they can be ruled out. 



A (Correct answer) - In the Cloud Platform Console, increase the size of the persistent disk and use the resize2fs command in Linux. 



You can resize persistent disks when your instances require more storage space and attach multiple secondary disks only when you need to separate your data into unique partitions. You can resize disks at any time, regardless of whether the disk is attached to a running instance. 



You can use console or command line to resize the disk: 



gcloud compute disks resize [DISK_NAME] --size [DISK_SIZE] 



After you resize your persistent disk, you must configure the file system on the disk to use the additional disk space. If the disk has a partition table, such as a boot disk, you must grow the partition and resize the file system on that partition. If your persistent disk has only a file system and no partition table, you can just resize the file system. 



Extend the file system on the disk or the partition to use the added space. If you grew a partition on your disk, specify the partition. If your disk does not have a partition table, specify only the disk ID. The resize2fs is Linux program to resize ext2, ext3, or ext4 file systems. 



sudo resize2fs /dev/[DEVICE_ID][PARTITION_NUMBER] 



C - In the Cloud Platform Console, increase the size of the persistent disk and verify the new space is ready to use with the fdisk command in Linux. 



This answer is incomplete: after indicating size increase in console, to make the new size effective, you have two options: restart the VM or configure (Grow partition if needed and expand partition/file system) in the VM's operating systems, windows or linux 



Reference Resources 

https://cloud.google.com/compute/docs/disks/add-persistent-disk Adding or Resizing Persistent Disks 



Additional Resource 

Update: Now you have the option to enable "Automatic storage increase" 

Instance Settings https://cloud.google.com/sql/docs/mysql/instance-settings#automatic-storage-increase-2ndgen 



Automatic storage increase 

If this setting is enabled, your available storage is checked every 30 seconds. If available storage falls below a threshold size, additional storage capacity is automatically added to your instance.

</p></details><hr>

### QUESTION 129 (yamyedcetg)

You are migrating your existing data center environment to Google Cloud Platform. You have a 1 petabyte Storage Area Network (SAN) that needs to be migrated. 

What GCP service will this data map to? 
-  Persistent Disk 
-  Cloud Bigtable 
-  Cloud Storage 
-  BigQuery


<details><summary>Answer:</summary><p>
Correct Answer A 



SAN data uses block storage, which would map directly to a persistent disk on GCP for equivalent storage. If you were working with a NAS instead of a SAN, it could map to either persistent disk or Cloud Storage as well. 



Background Knowledge 

Storage area network (SAN) is a dedicated, high-speed network that provides access to block-level storage. SANs were adopted to improve application availability and performance by segregating storage traffic from the rest of the LAN. 



SAN and network-attached storage (NAS) are both network-based storage solutions. A SAN typically uses Fibre Channel connectivity, while NAS typically ties into to the network through a standard Ethernet connection. A SAN stores data at the block level, while NAS accesses data as files. To a client OS, a SAN typically appears as a disk and exists as its own separate network of storage devices, while NAS appears as a file server. 



SAN is associated with structured workloads such as databases, while NAS is generally associated with unstructured data such as video and medical images.

</p></details><hr>

### QUESTION 130 (yhamigcopv)

You have a managed instance group comprised of preemptible VM's. All of the VM's keep deleting and recreating themselves every minute. 

What is a possible cause of this behavior? 
-  Your zonal capacity is limited, causing all preemptible VM's to be shutdown to recover capacity. Try deploying your group to another zone. 
-  You have hit your instance quota for the region. 
-  Your managed instance group's VM's are toggled to only last 1 minute in preemptible settings. 
-  Your managed instance group's health check is repeatedly failing, either to a misconfigured health check or misconfigured firewall rules not allowing the health check to access the instances.


<details><summary>Answer:</summary><p>
Correct Answer D 



In this case, the preemptible VM's are not part of the problem. Likely, the cause is that the health check for the instance group is not receiving a success reply from the VM's, causing it to recreate the VM's over and over. This is due to either the health check not being correctly configured or the firewall for the instance group not allowing traffic from the load balancer/health check.

</p></details><hr>

### QUESTION 131 (ybictavctg)

Your business is connected to a VPN connection to GCP. On GCP, you are hosting an internal website using an HTTP load balancer which serves traffic to a managed instance group. Your users are unable to access the internal website, though all systems are up. 

What is a possible cause for this problem? 
-  You've enabled static IP address for the managed instance group servers. 
-  Your load balancer is not set for the correct region. 
-  Firewall rules are not correctly configured. 
-  You need to enable Stackdriver debugger to collect more information.


<details><summary>Answer:</summary><p>
Correct answer C 



Check to make sure you have proper firewall rules allowing the correct subnets access. Also, make sure another rule with higher priority is not conflicting with it.

</p></details><hr>

### QUESTION 132 (ycibalwaet)

Your company is building a large-scale web application. Each team is responsible for its own service component of the application and wants to manage its own individual projects. You want each service to communicate with the others over RFC1918 address space. 

What should you do? 
-  Deploy each service into a single project within the same VPC. 
-  Configure Shared VPC and add each project as a service of the Shared VPC project. 
-  Configure each service to communicate with the others over HTTPS protocol. 
-  Configure a global load balancer for each project and communicate between each service using the global load balancer IP addresses.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



B (Correct Answer) - Configure Shared VPC and add each project as a service of the Shared VPC project. 



Using a shared VPC allows each team to individually manage their own application resources, while enabling each application to communicate between each other securely over RFC1918 address space. 



The following example illustrates a simple Shared VPC scenario:



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q35.png ]





Instead of a VPC being within a single project, Shared VPC allows the VPC to exist in multiple projects: 

- Instance/Applications in Service Project A can communicate with Instance/Applications in Service Project B. 

- Neither Instance/Applications in Project A or Project B can communicate with the Standalone Project (Bottom) 

- Of course, within the Standalone Project, Instance 1 can commutate with Instance 2 normally. 



A - Deploy each service into a single project within the same VPC. 



Deploying services into a single project results in every team accessing and managing the same project resources. This is difficult to manage and control as the number of teams involved increases. 



vC - Configure each service to communicate with the others over HTTPS protocol. 



HTTPS is a valid option; however, this answer does not address the need to ensure management of individual projects. 



D - Configure a global load balancer for each project and communicate between each service using the global load balancer IP addresses 



The global load balancer uses a public IP address, and therefore it does not conform to the requirement of communication over RFC1918 address space.

</p></details><hr>

### QUESTION 133 (ftqrttjcsj)

For this question, refer to the JencoMart case study.
 
JencoMart wants to move their User Profiles database to Google Cloud Platform. 

Which Google Database should they use?
-  Cloud Spanner 
-  Google Cloud SQL 
-  Google BigQuery 
-  Google Cloud Datastore


<details><summary>Answer:</summary><p>
Correct Answer A 



Feedback 



A (Correct Answer) - Cloud Spanner is Mission-critical, relational database service with transactional consistency, global scale and high availability. 



JencoMart Migration Requirements: Leverage managed services wherever feasible; Expand to Asia and decrease the latency in Asia; Optimize for capacity during peak periods ... and Guarantee service availability ... 



Currently use Oracle Database stores user profiles, 20 TB (which exceed the limit of Cloud SQL), Complex table structure ... 



To satisfy all above requirements and conditions, it leave the cloud spanner as the best option that meets all the requirements: Fully managed, SQL, Horizontal scalable, multi-reginal 



For more details, please refer to https://cloud.google.com/spanner/



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q36.png }



None of B, C, and D can meet the requirements like Cloud Spanner 



Requirements and Environment for JencoMart, Relevant parts are highlighted

JencoMart hosts all of its applications in 4 data centers: 3 in North American and 1 in Europe; most applications are dual-homed. 

... ... ... 



Oracle Database stores user profiles

20 TB

Complex table structure

Well maintained, clean data

Strong backup strategy



Business Requirements

• Optimize for capacity during peak periods and value during off-peak periods. 

• Guarantee service availability and support. 

• Reduce on-premises footprint and associated financial and environmental impact. 

• Move to outsourcing model to avoid large upfront costs associated with infrastructure purchase. 

• Expand services into Asia.v



Technical Requirements

• Assess key application for cloud suitability. 

• Modify applications for the cloud. 

• Move applications to a new infrastructure. 

• Leverage managed services wherever feasible. 

• Sunset 20% of capacity in existing data centers. 

• Decrease latency in Asia.

</p></details><hr>

### QUESTION 134 (ycwttwsipi)

Your company wants to track whether someone is present in a meeting room reserved for a scheduled meeting. There are 1000 meeting rooms across 5 offices on 3 continents.
 
Each room is equipped with a motion sensor that reports its status every second. The data from the motion detector includes only a sensor ID and several different discrete items of information. Analysts will use this data, together with information about account owners and office locations. 

Which database type should you use?
-  Relational 
-  Blobstore 
-  Flat file 
-  NoSQL


<details><summary>Answer:</summary><p>
Correct Answer D 



The 3 characters: 1000 rooms; sensor that reports its status every second; the data includes only a sensor ID and several different discrete items, are clear indication for a BigTable (a NoSQL database) usage pattern. 



Google Cloud Bigtable: A scalable, fully-managed NoSQL wide-column database that is suitable for both real-time access and analytics workloads. https://cloud.google.com/storage-options/ 



Bigtable is Good for: 

• Low-latency read/write access

• High-throughput analytics

• Native time series support



For the following common work load: 

• IoT, finance, adtech

• Personalization, recommendations

• Monitoring

• Geospatial datasets

• Graphs





Bigtable single value in each row is indexed; Cloud Bigtable tables are sparse; if a cell does not contain any data, it does not take up any space, which satisfy for storing this type of data: "the data includes only a sensor ID and several different discrete items" 



Reference 

Overview of Cloud Bigtable https://cloud.google.com/bigtable/docs/overview

</p></details><hr>

### QUESTION 135 (ycpthaldwo)

Your company plans to host a large donation website on Google Cloud Platform. You anticipate a large and undetermined amount of traffic that will create many database writes. To be certain that you do not drop any writes to a database hosted on GCP. 

Which service should you use with managed service? 
-  Cloud SQL with Bigger (More CPU, Memory, and Disk Size) machine type with throughput capacity matching to the anticipated peak write throughput. 
-  Cloud Pub/Sub for capturing the writes and draining the queue to write to the database. 
-  Memcached to store the writes until the writes are committed to the database. 
-  Install your MySQL database on Compute instance and enable autoscaling.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



A - you anticipate a "large and undetermined amount of traffic", so regardless of any provisioned IOPS there is always a risk it will not be enough and potentially high none necessary cost 



B (Correct answer) - Cloud Pub/Sub for capturing the writes and draining the queue to write to the database. 



Cloud Pub/Sub brings the scalability, flexibility, and reliability of enterprise message-oriented middleware to the cloud. By providing many-to-many, asynchronous messaging that decouples senders and receivers, it allows for secure and highly available communication between independently written applications. Cloud Pub/Sub delivers low-latency, durable messaging that helps developers quickly integrate systems hosted on the Google Cloud Platform and externally. 



C - Memcached is for read not for write 



D - Install your MySQL database on Compute instance and enable autoscaling. If you roll out you own MySql instance, then you don't have the advantage from manage Google Cloud SQL. Furthermore, it'll be complicated and costly to implement horizonal autoscaling feature even if you can try some sharding and master/slave. So, Answer B is clear winner.

</p></details><hr>

### QUESTION 136 (ycimtsptgc)

Your customer is moving their storage product to Google Cloud Storage (GCS). The data contains personally identifiable
information (PII) and sensitive customer information. 

What security strategy should you use for GCS?
-  Use signed URLs to generate time bound access to objects. 
-  Grant IAM read-only access to users and use default ACLs on the bucket. 
-  Grant no Google Cloud Identity and Access Management (Cloud IAM) roles to users and use granular ACLs on the bucket. 
-  Create randomized bucket and object names. Enable public access, but only provide specific file URLs to people who do not have Google accounts and need access.


<details><summary>Answer:</summary><p>
Correct Answer C 



Feedback 



C (Correct Answer) - This grants the least privilege required to access the data and minimizes the risk of accidentally granting access to the wrong people. 



A - Signed URLs could potentially be leaked. 



B - This is needlessly permissive, users only require one permission in order to get access. 



D - This is security through obscurity, also known as no security at all.

</p></details><hr>

### QUESTION 137 (yaatdngosh)

You are asked to design next generation of smart helmet for accident detection and reporting system. Each helmet will push 10kb of biometric data In JSON format every 1 second to a collection platform that will process and use trained machine learning model to predict and detect if an accident happens and send notification. Management has tasked you to architect the platform ensuring the following requirements are met:
 
· Provide the ability for real-time analytics of the inbound biometric data
· Ensure processing of the biometric data is highly durable. Elastic and parallel
· The results of the analytic processing should be persisted for data mining to improve the accident detection ML model in the future
 
Which architecture outlined below win meet the initial requirements for the platform?
-  Utilize Cloud Storage to collect the inbound sensor data, analyze data with Dataproc and save the results to BigQuery. 
-  Utilize Cloud Pub/Sub to collect the inbound sensor data, analyze the data with DataFlow and save the results to BigQuery. 
-  Utilize Cloud Pub/Sub to collect the inbound sensor data, analyze the data with DataFlow and save the results to Cloud SQL. 
-  Utilize Cloud Pub/Sub to collect the inbound sensor data, analyze the data with DataFlow and save the results to BigTable.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



Answer B meet all of the 3 requirements: 



Cloud Pub/Sub is a simple, reliable, scalable foundation for stream analytics and event-driven computing systems. As part of Google Cloud's stream analytics solution, the service ingests event streams and delivers them to Cloud Dataflow for processing and BigQuery for analysis as a data warehousing solution. Relying on the Cloud Pub/Sub service for delivery of event data frees you to focus on transforming your business and data systems with applications such as: 



• check Real-time personalization in gaming

• check Fast reporting, targeting and optimization in advertising and media

• check Processing device data for healthcare, manufacturing, oil and gas, and logistics

• check Syndicating market-related data streams for financial services





Also, Use Cloud Dataflow as a convenient integration point to bring predictive analytics to fraud detection, real-time personalization and similar use cases by adding TensorFlow-based Cloud Machine Learning models and APIs to your data processing pipelines.https://cloud.google.com/ml-engine/ 



BigQuery provides a flexible, powerful foundation for Machine Learning and Artificial Intelligence. BigQuery provides integration with CloudML Engine and TensorFlow to train powerful models on structured data. Moreover, BigQuery's ability to transform and analyze data helps you get your data in shape for Machine Learning. 



Other solutions may work one way or other but only the combination of theses 3 components integrate well in data ingestion, collection, and real-time analysis, and data mining in a highly durable, elastic, and parallel manner. 



A - Cloud storage is not suitable for this kind of real-time streaming data collection; Dataproc is GCP's BigData Hadoop/Spark that can do ETL and analysis, but DataFlow provide simple unified programming model for ETL and analysis in both Realtime and batch. 



C - Cloud SQL is mainly for OLTP (Transactional, CRUD) not for OLAP (On-line Analytical Processing, Data Warehouse). It does not have the scalability, elasticity, and parallel to absorb this amount of Data in real time. Instead BigQuery integrate well with DataFlow and can absorb both steaming and batch data from it. 



D - Bigtable is one of the possible Data sink for DataFlow and have the capability to absorb this amount of real time data but it lacks the Data mining features like BigQuery. 



Further Explanation 

Pub/Sub is kind of 'shock absorber', allowing asynchronous messaging between large numbers of devices. Cloud Dataflow acts as your data processing pipeline for ETL functions on both streaming and batch data. BigQuery is a data warehouse, able to run analysis on petabytes of data using SQL queries. 



Below is a reference architect Google recommending for similar scenario in Real-time streaming data collection and analysis https://cloud.google.com/solutions/mobile/mobile-gaming-analysis-telemetry 



Real-time processing of events from game clients and game servers



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q40.png ]







Data Transformation with Cloud Dataflow - Dataflow acts as your data processing pipeline for ETL functions on both streaming and batch data.



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q40.1.png ]

</p></details><hr>

### QUESTION 138 (yiit1efsyn)

Your infrastructure includes two 100-TB enterprise file servers. You need to perform a one-way, one-time migration of this data to the Google Cloud securely. Only users in Germany will access this data. You want to create the most cost-effective solution. 

What should you do? 
-  Use Transfer Appliance to transfer the offsite backup files to a Cloud Storage Regional storage bucket as a final destination. 
-  Use Transfer Appliance to transfer the offsite backup files to a Cloud Storage Multi-Regional bucket as a final destination. 
-  Use Storage Transfer Service to transfer the offsite backup files to a Cloud Storage Regional storage bucket as a final destination. 
-  Use Storage Transfer Service to transfer the offsite backup files to a Cloud Storage Multi-Regional storage bucket as a final destination.


<details><summary>Answer:</summary><p>
Correct answer A 



Feedback 



A (Correct Answer) - A is correct because you are performing a one-time (rather than an ongoing series) data transfer from on-premises to Google Cloud Platform for users in a single region (Germany). Using a Regional storage bucket will reduce cost and also conform to regulatory requirements 



B, C, and D are not correct because you should not use a Multi-Regional storage bucket for users in a single region (B, D). Also, Storage Transfer Service does not work for data stored on-premises file servers (C, D). 



Reference 

GCS Regional storage for single location access: 

https://cloud.google.com/storage/docs/storage-classes#regional 

Google Cloud transfer appliance: 

https://cloud.google.com/transfer-appliance/.

</p></details><hr>

### QUESTION 139 (yiroacaias)

Your infrastructure runs on another cloud and includes a set of multi-TB enterprise databases that are backed up nightly both on premises and also to that cloud. You need to create a redundant backup to Google Cloud. You are responsible for performing scheduled monthly disaster recovery drills. You want to create a cost-effective solution. 

What should you do? 
-  Use Transfer Appliance to transfer the offsite backup files to a Cloud Storage Nearline storage bucket as a final destination. 
-  Use Transfer Appliance to transfer the offsite backup files to a Cloud Storage Coldline bucket as a final destination. 
-  Use Storage Transfer Service to transfer the offsite backup files to a Cloud Storage Nearline storage bucket as a final destination. 
-  Use Storage Transfer Service to transfer the offsite backup files to a Cloud Storage Coldline storage bucket as a final destination.


<details><summary>Answer:</summary><p>
Correct answer C 



Feedback C (Correct Answer) - C is correct because you will need to access your backup data monthly to test your disaster recovery process, so you should use a Nearline bucket; also, because you will be performing ongoing, regular data transfers, so you should use the storage transfer service. 



A, B, and D are not correct because you should not use Coldline if you want to access the files monthly (B, D) and you should not use Transfer Appliance for repeated data transfers (A, B). 



Reference 

GCS Nearline for once-per-month access https://cloud.google.com/storage/docs/storage-classes#nearline 

Storage Transfer Service Documentation https://cloud.google.com/storage-transfer/docs/

</p></details><hr>

### QUESTION 140 (yadardrogc)

You are designing a relational data repository on Google Cloud to grow as needed. The data will be transactional consistent and added from any location in the world. You want to monitor and adjust node count for input traffic, which can spike unpredictably. 

What should you do? 
-  Use Cloud Spanner for storage. Monitor storage usage and increase node count if more than 70% utilized. 
-  Use Cloud Spanner for storage. Monitor CPU utilization and increase node count if more than 70% utilized for your time span. 
-  Use Cloud Bigtable for storage. Monitor data stored and increase node count if more than 70% utilized. 
-  Use Cloud Bigtable for storage. Monitor CPU utilization and increase node count if more than 70% utilized for your time span.


<details><summary>Answer:</summary><p>
Correct answer B 



Feedback 



B (Correct Answer) - B is correct because of the requirement to globally scalable transactions—use Cloud Spanner. CPU utilization is the recommended metric for scaling, per Google best practices, see linked below. 



A is not correct because you should not use storage utilization as a scaling metric. 



C, D are not correct because you should not use Cloud Bigtable for this scenario: The data will be transactional consistent and added from any location in the world. 



Reference 

Cloud Spanner Monitoring Using Stackdriver https://cloud.google.com/spanner/docs/monitoring 



Monitoring a Cloud Bigtable Instance https://cloud.google.com/bigtable/docs/monitoring-instance

</p></details><hr>

### QUESTION 141 (yahaliaars)

Your application has a large international audience and runs stateless virtual machines within a managed instance group across multiple locations. One feature of the application lets users upload files and share them with other users. Files must be available for 30 days; after that, they are removed from the system entirely. 

Which storage solution should you choose? 
-  A Cloud Datastore database. 
-  A multi-regional Cloud Storage bucket. 
-  Persistent SSD on virtual machine instances. 
-  A managed instance group of Filestore servers.


<details><summary>Answer:</summary><p>
Correct answer B 



Feedback 



A is not correct because a Datastore database is not designed for file storage. 



B is correct because buckets can be multi-regional and have lifecycle management. 



C is not correct because disks are generally ephemeral for virtual machines in managed instance groups. 



D is not correct because content would be restricted to a single region for all international users.

</p></details><hr>

### QUESTION 142 (yntcankcog)

You need to create a new Kubernetes Cluster on Google Cloud Platform that can autoscale the number of worker nodes. 

What should you do? 
-  Create a cluster on Kubernetes Engine and enable autoscaling on Kubernetes Engine. 
-  Create a cluster on Kubernetes Engine and enable autoscaling on the instance group of the cluster. 
-  Configure a Compute Engine instance as a worker and add it to an unmanaged instance group. Add a load balancer to the instance group and rely on the load balancer to create additional Compute Engine instances when needed. 
-  Create Compute Engine instances for the workers and the master and install Kubernetes. Rely on Kubernetes to create additional Compute Engine instances when needed.


<details><summary>Answer:</summary><p>
Correct answer A 



Feedback 



A is correct because this is the way to set up an autoscaling Kubernetes cluster. 



B is not correct because you should not manage the scaling of Kubernetes through the MIG. 



C is not correct because an UMIG cannot scale based on a load balancer and this is not the correct way to set up Kubernetes. 



D is not correct because Kubernetes will not create additional instances when deployed on Compute Engine. 



Reference 

Kubernetes Engine's cluster Autoscaler

</p></details><hr>

### QUESTION 143 (yhaasrocei)

You have an application server running on Compute Engine in the europe-west1-d zone. You need to ensure high availability and replicate the server to the europe-west2-c zone using the fewest steps possible. 

What should you do? 
-  Create a snapshot from the disk. Create a disk from the snapshot in the europe-west2-c zone. Create a new VM with that disk. 
-  Create a snapshot from the disk. Create a disk from the snapshot in the europe-west1-d zone and then move the disk to europe-west2-c. Create a new VM with that disk. 
-  Use "gcloud" to copy the disk to the europe-west2-c zone. Create a new VM with that disk. 
-  Use "gcloud compute instances move" with parameter "--destination-zone europe-west2-c" to move the instance to the new zone.


<details><summary>Answer:</summary><p>
Correct answer A 



Feedback 



A is correct because this makes sure the VM gets replicated in the new zone. 



B is not correct because this takes more steps than A. 



C is not correct because this will generate an error, because gcloud cannot copy disks. 



D is not correct because the original VM will be moved, not replicated.

</p></details><hr>

### QUESTION 144 (ftqrttdcsd)

For this question, refer to the Dress4Win case study.
 
Dress4Win has end-to-end tests covering 100% of their endpoints. They want to ensure that the move to the cloud does not introduce any new bugs. 

Which additional testing methods should the developers employ to prevent an outage?
-  They should enable Google Stackdriver Debugger on the application code to show errors in the code. 
-  They should add additional unit tests and production scale load tests on their cloud staging environment. 
-  They should run the end-to-end tests in the cloud staging environment to determine if the code is working as intended. 
-  They should add canary tests so developers can measure how much of an impact the new release causes to latency.


<details><summary>Answer:</summary><p>
Correct Answer B 



Feedback 



A - They should enable Google Stackdriver Debugger on the application code to show errors in the code. 



They need additional testing methods not a debugging technology. 



B (Correct answer) - They should add additional unit tests and production scale load tests on their cloud staging environment. 



After satisfied with end-to-end testing, the next step is to test users and devices, which naturally brings the load test in scope to demonstrate how well the system functions when faced with real-world demands. 



An important aspect of load testing is the proper simulation of user and device behavior to identify and understand any possible system bottlenecks, well in advance of deploying applications to production. 



The best place to do it is in environments close resemble the production, a staging environment which simulate production environment in both users and infrastructure perspectives. 



Since the end-to-end testing focus on flow, communication, and dependencies of the entire application, not for specific component's functionally, additional unit test might need to distinguish if some bugs are functional or process flow related. 



C - They should run the end-to-end tests in the cloud staging environment to determine if the code is working as intended. 



Since the end-to-end testing focus on flow, communication, and dependencies of the entire application, not for functionalities nor for performance, do the same end-to-end test in another environment such as staging may not achieve additional value, nor can it answer the requirements "to ensure that the move to the cloud does not introduce any new bugs" and "... to prevent an outage?" 



D - They should add canary tests so developers can measure how much of an impact the new release causes to latency. 



Adding a canary test is a good practice to detect real user problem in live production, it's normally employed as early stage in deployment mainly for new release, but the question scenario is in development and testing stage and asking for additional testing method.

</p></details><hr>

### QUESTION 145 (ydthianlkm)

Your development team has installed a new Linux kernel module on the batch servers in Google Compute Engine (GCE) virtual machines (VMs) to speed up the nightly batch process. Two days after the installation, 50% of the batch servers failed the nightly batch run. You want to collect details on the failure to pass back to the development team. Which three actions should you take? 

Choose 3 answers:
-  Identify whether a live migration event of the failed server occurred, using in the activity log. 
-  Use Stackdriver Logging to search for the module log entries. 
-  Use gcloud or Cloud Console to connect to the serial console and observe the logs. 
-  Read the debug GCE Activity log using the API or Cloud Console. 
-  Export a debug VM into an image and run the image on a local server where kernel log messages will be displayed on the native screen. 
-  Adjust the Google Stackdriver timeline to match the failure time and observe the batch server metrics.


<details><summary>Answer:</summary><p>
Correct Answer A, C, and F 



Explanation 



A - Identify whether a live migration event of the failed server occurred, using in the activity log. 



The symptoms: you installed a new Linux kernel module on the batch servers and suffered Two days after the installation, 50% of the batch servers failed the nightly batch run. It very likely the Live Migration event was triggered and based on migration policy, Google schedule Live Migration in batch servers 



During the migration there is possibility that the VP stop responding, for example, during blackout period. You can see that the migration took place in your VM logs. 



Here is the detailed process (https://cloud.google.com/compute/docs/instances/live-migration) 



B - Use Stackdriver Logging to search for the module log entries. This answer is ambiguous nor is the best answer comparing to others. 



C (Correct answer) - Use gcloud or Cloud Console to connect to the serial console and observe the logs. 



Interacting with the Serial Console (): The instance's operating system, BIOS, and other system-level entities often write output to the serial ports, and can accept input such as commands or answers to prompts. 



Since you have batch servers with same failure time and behavior, you may take one of the instance to investigate 



D - Read the debug GCE Activity log using the API or Cloud Console. This is system (servers) failure not an application failure. 



E - Export a debug VM into an image and run the image on a local server where kernel log messages will be displayed on the native screen. This is not going to work. 



F - Adjust the Google Stackdriver timeline to match the failure time and observe the batch server metrics. 



Since you have 50% servers with known same failure time and behavior, aligning the failure time with your instances, most likely you can find clue for the failure causes such as CPU, disk, or network.

</p></details><hr>

### QUESTION 146 (ftqrttdcsa)

For this question, refer to the Dress4Win case study.
 
As part of their new application experience, Dress4Wm allows customers to upload images of themselves. The customer has exclusive control over who may view these images.
 
Customers should be able to upload images with minimal latency and also be shown their images quickly on the main application page when they log in. 

Which configuration should Dress4Win use?
-  Store image files in a Google Cloud Storage bucket. Use Google Cloud Datastore to maintain metadata that maps each customer's ID and their image files. 
-  Store image files in a Google Cloud Storage bucket. Add custom metadata to the uploaded images in Cloud Storage that contains the customer's unique ID. 
-  Use a distributed file system to store customers' images. As storage needs increase, add more persistent disks and/or nodes. Assign each customer a unique ID, which sets each file's owner attribute, ensuring privacy of images. 
-  Use a distributed file system to store customers' images. As storage needs increase, add more persistent disks and/or nodes. Use a Google Cloud SQL database to maintain metadata that maps each customer's ID to their image files.


<details><summary>Answer:</summary><p>
Correct Answer A 



Quick Recap 



Google Cloud Storage is a hosted object storage service that allows you to store and access large numbers of binary objects, or blobs, of varying sizes. Cloud Storage buckets are the most scalable and durable storage option available on Cloud Platform. 



Google Cloud Datastore is a NoSQL document database built for automatic scaling, high performance, and ease of application development and integrating well with AppEngine 



Datastore: A scalable, fully-managed NoSQL document database for your web and mobile applications. 



Good for: 

Semi-structured application data

Hierarchical data

Durable key-value data





Workload: User profiles

Product catalogs

Game state





Feedback 



A (Correct answer) - Store image files in a Google bucket. Use Google Cloud Datastore to maintain metadata that maps each customer's ID and their image files. 



First Cloud storage bucket is best choice to store image files type of data and it have sophisticated access control vis IAM or ACL or combination. 



Secondly using Cloud Datastore to store the custom metadata for easy management, query, and retrieve to display in the website. 



Basically, here the Datastore serv as scalable fast index pointing to the images user uploaded in storage bucket. 



With the combination of Google's IAM, ACL, and authentication and authorization, the user has full control with who can view the images. 



B - Store image files in a Google Cloud Storage bucket. Add custom metadata to the uploaded images in Cloud Storage that contains the customer's unique ID. 



you can set custom metadata to the images file use gsutil but it'll be hard to manage and query for later retrieve to be displayed in the website. 



C and D can be eliminated due to the solution's first part: Use a distributed file system to store customers' images. 



If your applications do not require block storage, you should strongly consider storing your data in a Cloud Storage bucket.

</p></details><hr>

### QUESTION 147 (ycrsdoasmi)

Your company runs several databases on a single MySQL instance. They need to take backups of a specific database at regular intervals. The backup activity needs to complete as quickly as possible and cannot be allowed to impact disk performance. 

How should you configure the storage? 
-  Mount additional persistent disk volumes onto each virtual machine (VM) instance in a RAID10 array and use LVM to create snapshots to send to Cloud Storage. 
-  Configure a cron job to use the gcloud tool to take regular backups using persistent disk snapshots. 
-  Mount a Local SSD volume as the backup location. After the backup is complete, use gsutil to move the backup to Google Cloud Storage. 
-  Use gcsfuse to mount a Google Cloud Storage bucket as a volume directly on the instance and write backups to the mounted location using mysqldump


<details><summary>Answer:</summary><p>
Correct Answer C 



Explanation 



A and B all have some kind of impacts on disk performance by taking snapshot 



C (Correct answer) - Mount a Local SSD volume as the backup location. After the backup is complete, use gsutil to move the backup to Google Cloud Storage. 



This is similar scenario described as Multitiered backup recommended by Google. Disaster Recovery Cookbook

https://cloud.google.com/solutions/disaster-recovery-cookbook 



Relational database backups often use a multitiered solution, where the live data is stored on a local storage device and backups are stored on progressively "colder" storage solutions. In this solution, a cron job (or similar) backs up the live data to the second tier at regular intervals, and another job is used to back up data from that tier to another tier at slightly wider intervals. 



One possible implementation of this strategy on Google Cloud Platform would be to use persistent disk for the live data tier, a standard Cloud Storage bucket for the second tier, and a Cloud Storage Nearline bucket for the final tier. In this implementation, the tiers would be connected as follows: 



1) Configure your application to back up data to the persistent disk attached to the instance. 

2) Set up a task, such as a cron job, to move the data to the standard Cloud Storage bucket after a defined period of time. 

3) Finally, set up another cron job or use Cloud Storage Transfer Service to move your data from the standard bucket to the Nearline bucket. 



The following diagram illustrates this example implementation: 



Answer C solution is to back up live data to fast local SSD instead of "STANDARD STORAGE" as first tier, then move the backup to Google cloud storage (storage class is not specified) other than "NEARLINE" as second tier. 



D - Use gcsfuse to mount a Google Cloud Storage bucket as a volume directly on the instance and write backups to the mounted location using mysqldump Cloud Storage FUSE is only community-supported, it may or may not suitable for production workloads. 



Cloud Storage FUSE is an open source FUSE adapter that allows you to mount Cloud Storage buckets as file systems on Linux or OS X systems. It also provides a way for applications to upload and download Cloud Storage objects using standard file system semantics. https://cloud.google.com/storage/docs/gcs-fuse 



The mounted storage is treated as file system and it'll still incur IO cost. Furthermore, Cloud Storage FUSE has much higher latency than a local file system. https://cloud.google.com/storage/docs/gcs-fuse#notes, which makes answer C as winner 



Additional resources 



Exporting Data from Cloud SQL https://cloud.google.com/sql/docs/mysql/import-export/exporting

</p></details><hr>

