# PCA WJSCOTT 04

### QUESTION 1 (ftqrttjcso)

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

### QUESTION 2 (alewacttdv)

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

### QUESTION 3 (ydgwoasovf)

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

### QUESTION 4 (yhcakecn'y)

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

### QUESTION 5 (ywapaawyat)

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

### QUESTION 6 (ymdwtsoape)

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

### QUESTION 7 (ycimtcatgc)

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

### QUESTION 8 (utpolpycbn)

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

### QUESTION 9 (seopolpct3)

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

### QUESTION 10 (upolpaafma)

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

### QUESTION 11 (ieantbatay)

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

### QUESTION 12 (yantpcctyw)

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

### QUESTION 13 (ywtotpoaar)

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

### QUESTION 14 (ynttsdftoi)

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

### QUESTION 15 (ycppisitdw)

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

### QUESTION 16 (ychdtmamro)

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

### QUESTION 17 (yaraaigaet)

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

### QUESTION 18 (ycupcaslsr)

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

### QUESTION 19 (dwtdpssott)

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

### QUESTION 20 (ftqrttmgcs)

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

### QUESTION 21 (ftqrtttcst)

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

### QUESTION 22 (tadbsaeppt)

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

### QUESTION 23 (arsutaewro)

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

### QUESTION 24 (ynthabpipf)

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

### QUESTION 25 (ycipodawat)

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

### QUESTION 26 (yccasscfig)

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

### QUESTION 27 (ftqrtttcst)

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

### QUESTION 28 (ycchaasbyn)

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

### QUESTION 29 (yaihamraco)

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

### QUESTION 30 (apdvmogceh)

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

### QUESTION 31 (yamyedcetg)

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

### QUESTION 32 (yhamigcopv)

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

### QUESTION 33 (wcfrwfoscn)

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

- network tags and network ranges/subnets are highlighted:



[URL: https://s3.amazonaws.com/whizlabs-pub/GCP+Professional+Cloud+Architect+Images/GCP+PCA_PT3/PT3_Q33.png ]

</p></details><hr>

### QUESTION 34 (ybictavctg)

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

### QUESTION 35 (ycibalwaet)

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

### QUESTION 36 (ftqrttjcsj)

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

### QUESTION 37 (ycwttwsipi)

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

### QUESTION 38 (ycpthaldwo)

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

### QUESTION 39 (ycimtsptgc)

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

### QUESTION 40 (yaatdngosh)

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

### QUESTION 41 (yiit1efsyn)

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

### QUESTION 42 (yiroacaias)

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

### QUESTION 43 (yadardrogc)

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

### QUESTION 44 (yahaliaars)

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

### QUESTION 45 (yntcankcog)

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

### QUESTION 46 (yhaasrocei)

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

### QUESTION 47 (ftqrttdcsd)

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

### QUESTION 48 (ydthianlkm)

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

### QUESTION 49 (ftqrttdcsa)

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

### QUESTION 50 (ycrsdoasmi)

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

