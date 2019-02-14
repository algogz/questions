### Question 1

What database management system does Google Cloud SQL supports? Choose all correct answers

-  MYSQL
-  MS SQL
-  ORACLE
-  POSTGRESQL


<details><summary>Answer:</summary><p>
MYSQL

POSTGRESQL



Ref: https://cloud.google.com/sql/docs/

</p></details><hr>

### Question 2

What database management system does Google Cloud SQL supports? Choose all correct answers

-  MYSQL
-  MS SQL
-  ORACLE
-  POSTGRESQL


<details><summary>Answer:</summary><p>
MYSQL

POSTGRESQL



Ref: https://cloud.google.com/sql/docs/

</p></details><hr>

### Question 3

Google Cloud Storage supports IPv6?


<details><summary>Answer:</summary><p>
True

</p></details><hr>

### Question 4

How can you get a summary of daily space usage in Google Cloud Storage? Choose the bets answer:

-  You can use the gsutil df -h command or Storage Logs to get the total space used by all objects for a specified bucket

-  You can use the gsutil du command or Storage Logs to get the total space used by all objects for a specified bucket
 
-  You can run a Python Script that executes the command gsutil du and outputs it to a json file
 
-  It's available in Storage logs for all objects in a bucket


<details><summary>Answer:</summary><p>
You can use the gsutil df -h command or Storage Logs to get the total space used by all objects for a specified bucket



Ref: https://cloud.google.com/storage/docs/access-logs

</p></details><hr>

### Question 5

You are the site reliability engineer for a Company headquartered in Singapore. You created a bucket in google cloud storage and accepted the defaults.

Your storage bucket got created in the US location, but after a while you decided to move it to the Asia location so it will be closer to your end users. What steps will you take to get that accomplished?

-  You need to change the ACL rule of the bucket to move it to the Asia region.
 
-  You can only create bucket in the US, Europe, and Australia regions.
 
-  You need to create a Bucket in the Asia location, move all your objects there, then delete the bucket in the US region.
 
-  If you have accepted the defaults, your bucket should be created in the Asian region, so you just need to change the bucket name.


<details><summary>Answer:</summary><p>
You need to create a Bucket in the Asia location, move all your objects there, then delete the bucket in the US region.

</p></details><hr>

### Question 6

What are the requirements for running a pen test on a customer's Google Cloud Platform project?

-  Pen testing is not allowed under any circumstances, and will result on account suspension.
 
-  Abide by the Cloud Platform Acceptable Use Policy and Terms of Service, and ensure that your tests only affect your projects. There is no need to contact or notify Google.
 
-  Fill out the Google Penetration test request, and notify Google of any vulnerabilities you found.
 
-  Contact Google to request permission, and abide by the Cloud Platform Acceptable Use Policy and Terms of Service, and ensure that your tests only affect your projects.


<details><summary>Answer:</summary><p>
Abide by the Cloud Platform Acceptable Use Policy and Terms of Service, and ensure that your tests only affect your projects. There is no need to contact or notify Google.



Ref: https://support.google.com/cloud/answer/6262505?rd=1

</p></details><hr>

### Question 7

Company XYZ is running a web application on Google Compute Engine VM. The application needs to create objects in Google Cloud Storage. What is the most secure to accomplish this task?

-  Create Access Code and Secret Access Code for the application and grant it the Storage Object Creator role.
 
-  Use the VM private key to connect to Cloud Storage.
 
-  Create an Account in Identity and Access Management (IAM) and grant it the Storage Object Creator role.
 
-  Create a service account for the application and grant it the Storage Object Creator role.


<details><summary>Answer:</summary><p>
Create a service account for the application and grant it the Storage Object Creator role.



Ref: https://cloud.google.com/iam/docs/understanding-service-accounts

</p></details><hr>

### Question 8

What tools could be used in a Devops solution? Choose 2.

-  Google App Engine
 
-  Google Cloud DataStore
 
-  Google Big Query
 
-  Jenkins


<details><summary>Answer:</summary><p>
Google App Engine

Jenkins

</p></details><hr>

### Question 9

What's the name of a No SQL database in Google Cloud Platform Database as a service?

-  Cloud storage
 
-  Cloud Datastore
 
-  Cloud key value store
 
-  Cloud big table


<details><summary>Answer:</summary><p>
Cloud Datastore



Ref: https://cloud.google.com/datastore/

</p></details><hr>

### Question 10

Stackdriver Logging allows you to store, search, analyze, monitor, and alert on log data and events from Google Cloud Platform and Amazon Web Services (AWS)?

-  False
 
-  True


<details><summary>Answer:</summary><p>
True



Ref: https://cloud.google.com/logging/

</p></details><hr>

### Question 11

Which one of these is not a Google Cloud Storage class?

-  Regional
 
-  NearLine
 
-  Glacier
 
-  ColdLine


<details><summary>Answer:</summary><p>
Glacier



Ref: https://cloud.google.com/storage/docs/storage-classes

</p></details><hr>

### Question 12

What Google Cloud Storage class is more suitable for archives?

-  Coldline Storage
 
-  Reduced Redundancy Storage
 
-  Regional Storage
 
-  Infrequent Access Storage


<details><summary>Answer:</summary><p>
Coldline Storage



Ref: https://cloud.google.com/storage/docs/storage-classes#bucket_vs_object_storage_class

</p></details><hr>

### Question 13

What's the name of an instance that you can create at a low price than normal instances, but Google can terminate if it needs to recover resources consumed by that instance?

-  Micro Instance
 
-  Spot Instance
 
-  Preemptible Instance
 
-  Low Tier Instance


<details><summary>Answer:</summary><p>
Preemptible Instance



Ref: https://cloud.google.com/compute/docs/instances/create-start-preemptible-instance

</p></details><hr>

### Question 14

A customer is moving their web application built on Django framework to Google Cloud Platform. The application has been upgraded to use Python version 3, and the customer doesn't want to build or manage servers.

What is the appropriate Google Cloud infrastructure for deploying this application?

-  Compute Engine
 
-  App Engine (Flexible Environment)
 
-  Container Engine
 
-  App Engine (Standard Environment)


<details><summary>Answer:</summary><p>
App Engine (Flexible Environment)



Ref: https://cloud.google.com/python/django/

</p></details><hr>

### Question 15

Persistent disks can be resized, does it also mean that it's size can be reduced?


<details><summary>Answer:</summary><p>
False, persistent disks cannot be reduced in size

</p></details><hr>

### Question 16

CloudSQL Supports up to what size for MySQL Gen1 and MySQL Gen2(+Postgres)?

-  10TB for each.

-  20TB for each.

-  10TB for Gen1 and 20TB for Gen2

-  250GB for Gen1 and 10TB for Gen2(+Postgres)


<details><summary>Answer:</summary><p>
250GB for Gen1 and 10TB for Gen2(+Postgres)

</p></details><hr>

