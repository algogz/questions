# PCA WJSCOTT 03

### Question 1

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

### Question 2

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

### Question 3

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

### Question 4

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

### Question 5

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

### Question 6

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

### Question 7

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

### Question 8

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

### Question 9

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

### Question 10

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

### Question 11

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

### Question 12

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

### Question 13

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

### Question 14

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

### Question 15

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

### Question 16

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

### Question 17

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

### Question 18

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

### Question 19

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

### Question 20

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

### Question 21

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

### Question 22

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

### Question 23

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

### Question 24

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

### Question 25

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

### Question 26

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

### Question 27

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

### Question 28

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

### Question 29

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

### Question 30

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

### Question 31

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

### Question 32

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

### Question 33

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

### Question 34

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

### Question 35

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

### Question 36

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

### Question 37

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

### Question 38

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

### Question 39

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

### Question 40

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

### Question 41

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

### Question 42

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

### Question 43

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

### Question 44

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

### Question 45

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

### Question 46

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

### Question 47

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

### Question 48

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

### Question 49

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

### Question 50

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

