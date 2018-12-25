# AWS DevOps Engineer Professional 3/3
Version: 18.122

### QUESTION 201 *
When specifying multiple variable names and values for a playbook on the command line, which of the following is the correct syntax?

- A. ansible-playbookplaybook.yml-e`host="foo"pkg="bar"`
- B. ansible-playbookplaybook.yml-e`host:"foo",pkg:"bar"`
- C. ansible-playbookplaybook.yml-e`host="foo"`-e`pkg="bar"`
- D. ansible-playbookplaybook.yml--extra-vars"host=foo","pkg=bar"

<details><summary>Answer:</summary><p> A 

Explanation:

Variables are passed in a single command line parameter, `-e` or `--extra-vars`. They are sent as a single string to the playbook and are space delimited. Because of the space delimeter, variable values must be encapsulated in quotes. Additionally, proper JSON or YAML can be passed, such as: `-e {"key": "name", "array": ["value1", "value2"]}`.

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#passing-variables-on-the-command-line

</p></details><hr>

### QUESTION 202 *
Ansible provides some methods for controlling how or when a task is ran. Which of the following is a valid method for controlling a task with a loop?

- A. -with:<value>
- B. -with_items:<value>
- C. -only_when:<conditional> 
- D. -items:<value>

<details><summary>Answer:</summary><p> B

Explanation:

Ansible provides two methods for controlling tasks, loops and conditionals. The "with_items" context will allow the task to loop through a list of items, while the `when` context will allow a conditional requirement to be met for the task to run. Both can be used at the same time. 

Reference: http://docs.ansible.com/ansible/playbooks_conditionals.html#loops-and-conditionals

</p></details><hr>

### QUESTION 203 *
Which difference between core modules and extra modules is not correct?

- A. Extra modules may one day be come core modules 
- B. Core modules are supported by the Ansible team 
- C. Core modules are shipped by default with Ansible 
- D. Extra modules have no support

<details><summary>Answer:</summary><p> D

Explanation:

While extra modules are not official modules and thus not supported by the Ansible team, they are indeed supported by their writers and the community.

Reference: http://docs.ansible.com/ansible/modules_extra.html

</p></details><hr>

### QUESTION 204 *
What is the proper (best practice) way to begin a playbook?

- A. -hosts:all 
- B. ...
- C. ###
- D. ---

<details><summary>Answer:</summary><p> D

Explanation:

All YAML files can begin with `---` and end with `...` to indicate where YAML starts and ends. While this is optional it is considered best practice.
  
Reference: http://docs.ansible.com/ansible/YAMLSyntax.html

</p></details><hr>

### QUESTION 205 *
You have a playbook that includes a task to install a package for a service, put a configuration file for that package on the system and restart the service. The playbook is then run twice in a row. What would you expect Ansible to do on the second run?

- A. Remove the old package and config file and reinstall and then rest a rt these rvice.
- B. Take no action on the target host.
- C. Check if the package is installed,check if the file match es the source file,ifnotreinstallit;restart
the service.
- D. At tempt to reinstall the package,copy the file and rest a rt these rvice.

<details><summary>Answer:</summary><p> C

Explanation:

Ansible follows an idempotence model and will not touch or change the system unless a change is warranted.

Reference: http://docs.ansible.com/ansible/glossary.html

</p></details><hr>

### QUESTION 206 *
Which tool will Ansible not use, even if available, to gather facts?

- A. facter
- B. lsb_release
- C. Ansiblesetupmodule 
- D. ohai

<details><summary>Answer:</summary><p> B

Explanation:

Ansible will use it's own `setup` module to gather facts for the local system. Additionally, if ohai or facter are installed, those will also be used and all variables will be prefixed with `ohai_` or `facter_` respectively. `lsb_relase` is a Linux tool for determining distribution information. 

Reference: http://docs.ansible.com/ansible/setup_module.html

</p></details><hr>

### QUESTION 207 *
If a variable is assigned in the `vars` section of a playbook, where is the proper place to override that variable?

- A. Inventorygroupvar 
- B. playbookhost_vars 
- C. roledefaults
- D. extravars

<details><summary>Answer:</summary><p> D

Explanation:

In Ansible's variable precedence, the highest precedence is the extra vars option on the command line.

Reference: http://docs.ansible.com/ansible/playbooks_variables.html#variable-precedence-where-should-i-put-a-variable
  
</p></details><hr>

### QUESTION 208 *
If Ansible encounters a resource that does not meet the requirements specified in the play it makes the necessary changes to the resource; however if the resource is already in the desired state Ansible will do nothing. This is an example of which methodology?

- A. Idempotency
- B. Immutability
- C. Convergence
- D. Infrastructure as Code

<details><summary>Answer:</summary><p> A

Explanation:

Idempotency states that changes are only made if a resource does not meet the requirement specifications. If a change is made, it is made `in-place` and will not break existing resources. 

Reference: http://docs.ansible.com/ansible/glossary.html

</p></details><hr>

### QUESTION 209 *
When writing plays, tasks and playbooks, Ansible fully supports which high level language to describe these?

- A. YAML 
- B. Python 
- C. XML 
- D. JSON

<details><summary>Answer:</summary><p> A

Explanation:

This can be bit of a trick question. While Ansible Playbooks in this course are written in YAML, Ansible will accept plays, tasks and playbooks in JSON, as JSON a subset of YAML. However, the prefered and fully supported method is YAML.

Reference: http://docs.ansible.com/ansible/YAMLSyntax.html

</p></details><hr>

### QUESTION 210 *
What is the expected behavior if Ansible is called with `ansible-playbook -i localhost playbook.yml`?

- A. Ansible will at tempt to read the inventory file named `localhost`
- B. Ansible will run the plays local ly.
- C. Ansible will run the playbook on the host named `localhost`
- D. Ansiblewon'trun,this is in valid command line syntax

<details><summary>Answer:</summary><p> A

Explanation:

Ansible expects an inventory filename with the `-i` option, regardless if it's a valid hostname. For this to execute on the host `localhost` resolves to, a comma needs to be appended to the end. 

Reference: http://docs.ansible.com/ansible/intro_inventory.html#inventory

</p></details><hr>

### QUESTION 211 *
The Ansible Inventory system allows many attributes to be defined within it. Which item below is not one of these?
  

- A. Groupvariables 
- B. Hostgroups
- C. Includevars
- D. Childrengroups

<details><summary>Answer:</summary><p> C

Explanation:

Ansible inventory files cannot reference other files for additional data. If this functionality is needed, it must be done in as a script to create a dynamic inventory

Reference: http://docs.ansible.com/ansible/intro_inventory.html

</p></details><hr>

### QUESTION 212 *
When writing custom Ansible modules, which language is not supported?

- A. Python
- B. C++
- C. Bash
- D. All of the language s list ed are supported

<details><summary>Answer:</summary><p> D

Explanation:

Ansible modules can be written in any language that is executable on the target system. The only requirement is that the module can write its results as JSON output to STDOUT for Ansible to consume.

Reference: http://docs.ansible.com/ansible/developing_modules.html

</p></details><hr>

### QUESTION 213 *
When specifying more than one conditional requirements for a task, what is the proper method?

- A. -when:foo=="hello"andbar=="world"
- B. -when:foo=="hello"-when:bar=="world" 
- C. -when:foo=="hello"&&bar=="world"
- D. -when:foois"hello"andbaris"world"

<details><summary>Answer:</summary><p> A

Explanation:

Ansible will allow you to stack conditionals using `and` and `or`. It requires it to be in the same `when` statement, comparisons must be `==` for equals or `!=` for not equals and the `and/or` must be written as such, not `&&/||`.

Reference: http://docs.ansible.com/ansible/playbooks_conditionals.html#the-when-statement

</p></details><hr>

### QUESTION 214 *
Ansible supports running Playbook on the host directly or via SSH. How can Ansible be told to run its playbooks directly on the host?

- A. Setting `connection:local` in the tasks that run locally. 
- B. Specifying `-typelocal` on the command line.
- C. It does not need to be specified; it's the default.
- D. Setting `connection:local` in the Playbook.

<details><summary>Answer:</summary><p> D

Explanation:

Ansible can be told to run locally on the command line with the `-c` option or can be told via the `connection: local` declaration in the playbook. The default connection method is `remote`. 

Reference: http://docs.ansible.com/ansible/intro_inventory.html#non-ssh-connection-types

</p></details><hr>

### QUESTION 215 *
What is the main difference between calling the commands `ansible` and `ansible-playbook` on the command line?

- A. `ansible` is for setting configuration and environment variables which `ansible-playbook` will use when running plays.
- B. `ansible-playbook` is for running entire Playbooks while `ansible` is for calling ad-hoc commands.
- C. `ansible-playbook'runs the playbook s by using the` ansible'command to run the individual plays
- D. `ansible` is for running individual plays and `ansible-playbook` is for running the entire playbook.

<details><summary>Answer:</summary><p> B

Explanation:

The `ansible` command is for running Ansible ad-hoc commands remotely via SSH. `ansible- playbook` is for running Ansible Playbook projects.

Reference: http://docs.ansible.com/ansible/intro_adhoc.html

</p></details><hr>

### QUESTION 216 *
Which answer is the proper syntax for specifying two target hosts on the command line when running an Ansible Playbook?

- A. ansible-playbook-hhost1.example.com-iallplaybook.yml
- B. ansible-playbook-ihost1.example.complaybook.yml
- C. ansible-playbook -h host1.example.com,host2.example.com playbook.yml 
- D. ansible-playbook -i host1.example.com,host2.example.com playbook.yml

<details><summary>Answer:</summary><p> D

Explanation:

Ansible uses the `-i` flag for accepting an inventory file or host. To allow Ansible to determine if you are passing a host list versus an inventory file the list must be comma separated. If a single host is specified, a trailing comma must be present.

Reference: http://docs.ansible.com/ansible/intro_inventory.html#inventory

</p></details><hr>

### QUESTION 217 x
What is the purpose of a Docker swarm worker node?

- A. scheduling services
- B. services warm node HTTP API endpoints 
- C. executing containers
- D. maintaining cluster state

<details><summary>Answer:</summary><p> C

Explanation:

Manager nodes handle cluster management tasks: 

- maintaining cluster state  
- scheduling services
- serving swarm mode HTTP API endpoints

Worker nodes

Worker nodes are also instances of Docker Engine whose sole purpose is to execute containers. Worker nodes don't participate in the Raft distributed state, make scheduling decisions, or serve the swarm mode HTTP API.

Reference: https://docs.docker.com/engine/swarm/how-swarm-mode-works/nodes/#worker-nodes

</p></details><hr>

### QUESTION 218 x
You are building a Docker image with the following Dockerfile. How many layers will the resulting image have?
```bash
FROM scratch
CMD /app/hello.sh
```

- A. 2 
- B. 4 
- C. 1 
- D. 3

<details><summary>Answer:</summary><p> D

Explanation:

```bash
FROM scratch
CMD /app/hello.sh
```
The image contains all the layers from the base image (only one in this case, since we're building rom scratch), plus a new layer with the CMD instruction, and a read-write container layer. 

Reference: https://docs.docker.com/engine/userguide/storagedriver/imagesandcontainers/#sharing-promotes-smaller-images

</p></details><hr>

### QUESTION 219 x
What storage driver does Docker generally recommend that you use if it is available?

- A. zfs
- B. btrfs 
- C. aufs
- D. overlay

<details><summary>Answer:</summary><p> C

Explanation:

After you have read the storage driver overview, the next step is to choose the best storage driver for your workloads. In making this decision, there are three high-level factors to consider:
If multiple storage drivers are supported in your kernel, Docker has a prioritized list of which storage driver to use if no storage driver is explicitly configured, assuming that the prerequisites for that storage driver are met:
If aufs is available, default to it, because it is the oldest storage driver. However, it is not universally available.

Reference: https://docs.docker.com/engine/userguide/storagedriver/selectadriver/

</p></details><hr>

### QUESTION 220 C?
In which Docker Swarm model does the swarm manager distribute a specific number of replica tasks among the nodes based upon the scale you set in the desired state?
  

- A. distributed services 
- B. scaled services
- C. replicated services 
- D. global services

<details><summary>Answer:</summary><p> D

Explanation:

A service is the definition of the tasks to execute on the worker nodes. It is the central structure of the swarm system and the primary root of user interaction with the swarm. When you create a service, you specify which container image to use and which commands to execute inside running containers.
In the replicated services model, the swarm manager distributes a specific number of replica tasks among the nodes based upon the scale you set in the desired state. For global services, the swarm runs one task for the service on every available node in the cluster.
A task carries a Docker container and the commands to run inside the container. It is the atomic scheduling unit of swarm. Manager nodes assign tasks to worker nodes according to the number of replicas set in the service scale. Once a task is assigned to a node, it cannot move to another node. It can only run on the assigned node or fail.

Reference: https://docs.docker.com/engine/swarm/key-concepts/#services-and-tasks

</p></details><hr>

### QUESTION 221 x
On which local address does the Docker DNS server listen?

- A. 127.0.0.1 
- B. 127.0.0.111 
- C. 127.0.0.254 
- D. 127.0.0.11

<details><summary>Answer:</summary><p> D

Explanation:

Note: If you need access to a host's localhost resolver, you must modify your DNS service on the host to listen on a non-localhost address that is reachable from within the container.
Note: The DNS server is always at 127.0.0.11.

Reference: https://docs.docker.com/engine/userguide/networking/configure-dns/

</p></details><hr>

### QUESTION 222
What are the default memory limit policies for a Docker container?

- A. Limited memory,limited kernel memory
- B. Unlimited memory,limited kernel memory 
- C. Limited memory,unlimited kernel memory 
- D. Unlimited memory,unlimited kernel memory

<details><summary>Answer:</summary><p> D

Explanation:

Kernel memory limits are expressed in terms of the overall memory allocated to a container. Consider the following scenarios:
Unlimited memory, unlimited kernel memory: This is the default behavior. Unlimited memory, limited kernel memory: This is appropriate when the amount of memory needed by all cgroups is greater than the amount of memory that actually exists on the host machine. You can configure the kernel memory to never go over what is available on the host machine, and containers which
need more memory need to wait for it. Limited memory, umlimited kernel memory: The overall memory is limited, but the kernel memory is not.
Limited memory, limited kernel memory: Limiting both user and kernel memory can be useful for debugging memory-related problems. If a container is using an unexpected amount of either type of memory, it will run out of memory without affecting other containers or the host machine. Within this setting, if the kernel memory limit is lower than the user memory limit, running out of kernel memory will cause the container to experience an OOM error. If the kernel memory limit is higher than the user memory limit, the kernel limit will not cause the container to experience an OOM. 

Reference: https://docs.docker.com/engine/admin/resource_constraints/#--kernel-memory-details

</p></details><hr>

### QUESTION 223
What needs to be done in order to remotely access a Docker daemon running on Linux?

- A. add certificate authentication to the docker API 
- B. change the encryption level to TLS
- C. enabletheTCPsocket
- D. bind the Docker API to a unix socket

<details><summary>Answer:</summary><p> C

Explanation:

The Docker daemon can listen for Docker Remote API requests via three different types of Socket:
unix, tcp, and fd.
By default, a unix domain socket (or IPC socket) is created at /var/run/docker.sock, requiring either root permission, or docker group membership. If you need to access the Docker daemon remotely, you need to enable the tcp Socket. Beware that the default setup provides un- encrypted and un-authenticated direct access to the Docker daemon - and should be secured either using the built in HTTPS encrypted socket or by putting a secure web proxy in front of it. 

Reference: https://docs.docker.com/engine/reference/commandline/dockerd/#daemon-socket-option

</p></details><hr>

### QUESTION 224
Which of the following Dockerfile commands cannot be overridden at runtime?

- A. VOLUME 
- B. USER
- C. ADD
- D. CMD

<details><summary>Answer:</summary><p> C

Explanation:

When a developer builds an image from a Dockerfile or when she commits it, the developer can set a number of default parameters that take effect when the image starts up as a container. Four of the Dockerfile commands cannot be overridden at runtime: FROM, MAINTAINER, RUN, and ADD. Everything else has a corresponding override in docker run. We'll go through what the developer might have set in each Dockerfile instruction and how the operator can override that setting.

Reference: https://docs.docker.com/engine/reference/run/#overriding-dockerfile-image-defaults

</p></details><hr>

### QUESTION 225
    
When deploying to a Docker swarm, which section of the docker-compose file defines configuration related to the deployment and running of services?

- A. services 
- B. build
- C. deploy 
- D. args

<details><summary>Answer:</summary><p> C

Explanation:

Version 3 only.
Specify configuration related to the deployment and running of services. This only takes effect when deploying to a swarm withdocker stack deploy, and is ignored by docker-compose up and docker-compose run.

Reference: https://docs.docker.com/compose/compose-file/#deploy

</p></details><hr>

### QUESTION 226
You are running a Docker daemon on a Linux host and it becomes unresponsive. Which signal, when sent to a Docker process with the kill command, forces the full stack trace to be logged for debugging purposes?

- A. -TRACE
- B. -IOTRACE 
- C. -SIGUSER1 
- D. -KILLTRACE

<details><summary>Answer:</summary><p> C

Explanation:

If the daemon is unresponsive, you can force a full stack trace to be logged by sending a SIGUSR1 signal to the daemon.
Linux:
$ sudo kill -SIGUSR1 $(pidof dockerd)
Windows Server:
Download docker-signal.
Run the executable with the flag --pid=<PID of daemon>.

Reference: https://docs.docker.com/engine/admin/#force-a-stack-trace-to-be-logged

</p></details><hr>

### QUESTION 227
Which of the following is NOT an advantage of Docker's content addressable storage model?

- A. random UUID simprove files ystem performance
- B. improvedsecurity
- C. guarantees data integrity after push,pull,load,andsaveoperations 
- D. avoid s content ID collisions

<details><summary>Answer:</summary><p> A

Explanation:

Docker 1.10 introduced a new content addressable storage model. This is a completely new way to address image and layer data on disk. Previously, image and layer data was referenced and stored using a randomly generated UUID. In the new model this is replaced by a secure content hash.
The new model improves security, provides a built-in way to avoid ID collisions, and guarantees data integrity after pull, push, load, and save operations. It also enables better sharing of layers by allowing many images to freely share their layers even if they didn't come from the same build. 

Reference: https://docs.docker.com/engine/userguide/storagedriver/imagesandcontainers/#content-addressable-storage

</p></details><hr>

### QUESTION 228
What flag would you use to limit a Docker container's memory usage to 128 megabytes?

- A. -memory128m
- B. -m128m
- C. --memory-reservation128m 
- D. -m128MB

<details><summary>Answer:</summary><p> B

Explanation:

Docker can enforce hard memory limits, which allow the container to use no more than a given amount of user or system memory, or soft limits, which allow the container to use as much memory as it needs unless certain conditions are met, such as when the kernel detects low memory or contention on the host machine. Some of these options have different effects when used alone or when more than one option is set.
Most of these options take a positive integer, followed by a suffix of b, k, m, g, to indicate bytes, kilobytes, megabytes, or gigabytes.
Option -m or --memory=
Description The maximum amount of memory the container can use. If you set this option, the minimum allowed value is 4m (4 megabyte).

Reference: https://docs.docker.com/engine/admin/resource_constraints/#memory

</p></details><hr>

### QUESTION 229
What is the only layer in a Docker image that is not read-only?

- A. theyareallread-only 
- B. noneareread-only 
- C. thefirstlayer
- D. thelastlayer

<details><summary>Answer:</summary><p> D

Explanation:

A Docker image is built up from a series of layers. Each layer represents an instruction in the image's Dockerfile. Each layer except the very last one is read-only.

Reference: https://docs.docker.com/engine/userguide/storagedriver/imagesandcontainers/#images-and-layers

</p></details><hr>

### QUESTION 230
When building a Docker image, you are searching through a persistent data volume's logs to provide parameters for the next build. You execute the following command. Which of the operations will cause a failure of the Docker RUNcommand? RUN cat ./data/log/\*.error | grep service_status | grep ERROR

- A. the first grep command
- B. any one of them
- C. the second grep command 
- D. the cat command

<details><summary>Answer:</summary><p> C

Explanation:

Some RUN commands depend on the ability to pipe the output of one command into another, using the pipe character (|), as in the following example:
RUN wget -O - https://some.site | wc -l > /number
Docker executes these commands using the /bin/sh -c interpreter, which only evaluates the exit code of the last operation in the pipe to determine success. In the example above this build step succeeds and produces a new image so long as the wc -lcommand succeeds, even if the wget command fails.

Reference: https://docs.docker.com/engine/userguide/eng-image/dockerfile_best-practices/#run

</p></details><hr>

### QUESTION 231
What does the Docker network docker_gwbridge do?

- A. allows communication between containers on the same host
- B. allows communication between swarm nodes on different hosts 
- C. allows communication between swarm nodes on the same host 
- D. allows communication between containers on the different hosts

<details><summary>Answer:</summary><p> B

Explanation:

The docker_gwbridge is a local bridge network which is automatically created by Docker in two different circumstances: When you initialize or join a swarm, Docker creates the docker_gwbridge network and uses it for communication among swarm nodes on different hosts. When none of a container's networks can provide external connectivity, Docker connects the container to the docker_gwbridge network in addition to the container's other networks, so that the container can connect to external networks or other swarm nodes.

Reference: https://docs.docker.com/engine/userguide/networking/#the-docker_gwbridge-network

</p></details><hr>

### QUESTION 232 x
Which services can be used as optional components of setting up a new Trail in CloudTrail?

- A. KMS,SNS and SES
- B. CloudWatch,S3 and SNS 
- C. KMS,Cloudwatch and SNS 
- D. KMS,S3 and CloudWatch

<details><summary>Answer:</summary><p> C

Explanation:

Key Management Service: The use of AWS KMS is an optional element of CloudTrail, but it allows additional encryption to be added to your Log files when stored on S3 

Simple Notification Service: Amazon SNS is also an optional component for CloudTrail, but it allows for you to create notifications, for example when a new log file is delivered to S3 SNS could notify someone or a team via an e-mail. Or it could be used in conjunction with CloudWatch when metric thresholds have been reached.

CloudWatch Logs: Again, this is another optional component, but AWS CloudTrail allows you to deliver its logs to AWS Cloudwatch Logs as well as S3 for specific monitoring metrics to take place

Reference: https://cloudacademy.com/amazon-web-services/aws-cloudtrail-introduction-course/how-does-aws-cloudtrail-work.html

</p></details><hr>

### QUESTION 233
What is AWS CloudTrail Processing Library?

- A. A static library with CloudTrail log files in a movable format machine code that is directly executable
- B. An object library with CloudTrail log files in a movable format machine code that is usually not directly executable
- C. A Java library that makes it easy to build an application that reads and processes CloudTrail log files
- D. A PHP library that renders various generic containers needed for CloudTrail log files

<details><summary>Answer:</summary><p> C

Explanation:

AWS CloudTrail Processing Library is a Java library that makes it easy to build an application that reads and processes CloudTrail log files.
You can download CloudTrail Processing Library from GitHub.

Reference: http://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 234 x
Using the AWS CLI, which command retrieves CloudTrail trail settings, including the status of the trail itself?

- A. aws cloudtrail return-trails
- B. aws cloudtrail validat e-settings 
- C. aws cloudtrail get-settings
- D. aws cloudtrail describe-trails

<details><summary>Answer:</summary><p> D

Explanation:

You can retrieve trail settings and status using the cloudtrail describe-trails command. It will generate output similar to the example below.
```json
{
  "trailList": [
    {
      "IncludeGlobalServiceEvents": false,
      "Name": "trailname",
      "S3KeyPrefix": "my-prefix",
      "TrailARN": "arn:aws:cloudtrail:us-east-2:123456789012:trail/my-trail", "LogFileValidationEnabled": true,
      "IsMultiRegionTrail": true,
      "HasCustomEventSelectors": false,
      "S3BucketName": " bucket",
      "SnsTopicName": " topic",
      "HomeRegion": "us-east-2"
    }
  ]
}
```
  
Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-create-and-update-a-trail-by-using-the-aws-cli.html

</p></details><hr>

### QUESTION 235
You are running Amazon CloudTrail on an Amazon S3 bucket and look at your most recent log. You notice that the entries include the ListThings and CreateThings actions and wonder if your devices have been hacked. Based on these entries, what service would you be concerned may have been hacked?

- A. Amazon Inspector 
- B. AWS IoT
- C. AWS Code Pipeline 
- D. Amazon Glacier

<details><summary>Answer:</summary><p> B

Explanation:

AWS IoT (Internet of Things) is integrated with CloudTrail to capture API calls from the AWS IoT console or from your code to the AWS IoT APIs. AWS IoT provides secure, bi-directional communication between Internet-connected things (such as sensors, actuators, embedded devices, or smart appliances) and the AWS cloud. Using the information collected by CloudTrail, you can determine the request that was made to AWS IoT, the source IP address from which the request was made, who made the request, when it was made, and so on.

Reference: http://docs.aws.amazon.com/iot/latest/developerguide/monitoring_overview.html#iot-using-cloudtrail

</p></details><hr>

### QUESTION 236
Your CTO has asked you to make sure that you know what all users of your AWS account are doing to change resources at all times. She wants a report of who is doing what over time, reported to her once per week, for as broad a resource type group as possible. How should you do this?

- A. Create a global AWS CloudTrail Trail. Configure a script to aggregate the log data into a report, publish it to S3 once per week and deliver this to the CTO.
- B. Use CloudWatch Events Rules with an SNS topic subscribed to all AWS API calls. Subscribe the CTO to an email type delivery on this SNS Topic.
- C. Use AWS IAM credential reports to deliver a CSV of all uses of IAM User Tokens over time to the CTO.
- D. Use AWS Config with an SNS subscription on a Lambda, and insert these changes over time into a DynamoDB table. Generate reports based on the contents of this table.

<details><summary>Answer:</summary><p> A

Explanation:

This is the ideal use case for AWS CloudTrail.
CloudTrail provides visibility into user activity by recording API calls made on your account. CloudTrail records important information about each API call, including the name of the API, the identity of the caller, the time of the API call, the request parameters, and the response elements returned by the AWS service. This information helps you to track changes made to your AWS resources and to troubleshoot operational issues. CloudTrail makes it easier to ensure compliance with internal policies and regulatory standards.

Reference: https://aws.amazon.com/cloudtrail/faqs/
  
</p></details><hr>

### QUESTION 237 x
When logging with Amazon CloudTrail, API call information for services with regional end points is ___ .

- A. captured and processed in the same region as to which the API call is made and delivered to the region associated with your Amazon S3 bucket
- B. captured, processed, and delivered to the region associated with your Amazon S3 bucket
- C. captured in the same region as to which the API call is made and processed and delivered to the region associated with your Amazon S3 bucket
- D. captured in the region where the endpoint is located, processed in the region where the CloudTrail trail is configured, and delivered to the region associated with your Amazon S3 bucket

<details><summary>Answer:</summary><p> A

Explanation:

When logging with Amazon CloudTrail, API call information for services with regional end points (EC2, RDS etc.) is captured and processed in the same region as to which the API call is made and delivered to the region associated with your Amazon S3 bucket.API call information for services with single endpoints(IAM,STSetc.)is captured in the region where the endpointis located,processed in the region where the CloudTrail trail is configured, and delivered to the region associated with your Amazon S3 bucket. 

Reference: https://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 238
When logging with Amazon CloudTrail, API call information for services with single end points is .

- A. captured in the same region as to which the API call is made and processed and delivered to the region associated with your Amazon S3 bucket
- B. captured and processed in the same region as to which the API call is made and delivered tothe region associated with your Amazon S3 bucket
- C. captured,processed,and delivered to the region associated with your Amazon S3 bucket
- D. captured in the region where the endpoint is located,processed in the region where the
CloudTrail trail is configured, and delivered to the region associated with your Amazon S3
bucket

<details><summary>Answer:</summary><p> D

Explanation:

When logging with Amazon CloudTrail, API call information for services with regional end points (EC2, RDS etc.) is captured and processed in the same region as to which the API call is made and delivered to the region associated with your Amazon S3 bucket. API call information for services with single end points (IAM, STS etc.) is captured in the region where the endpointis located,processed in the region where the CloudTrail trail is configured, and delivered to the region associated with your Amazon S3 bucket. 

Reference: https://aws.amazon.com/cloudtrail/faqs/

</p></details><hr>

### QUESTION 239
What is the correct syntax for the AWS command to create a single region trail? 
- A. aws create-trail --name trailname --s3-object objectname
- B. aws cloudtrail --s3-region name IP address create-trail --name trailname
- C. awsc loudtrail create-trail --name trailname --s3-bucket-name bucketname 
- D. aws cloudtrail create-trail --name trailname --s3-portnumberIPaddress

<details><summary>Answer:</summary><p> C

Explanation:

The command aws cloudtrail create-trail --name trailname --s3-bucket-name bucketname will create a single region trail. You must create a S3 bucket before you execute the command, with proper CloudTrail permissions applied to it (and you must have the AWS command line tools (CLI) on your system).

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-create-and-update-a-trail-by-using-the-aws-cli.html

</p></details><hr>

### QUESTION 240
You want to set up the CloudTrail Processing Library to log your bucket operations. Which command will build a .jar file from the CloudTrail Processing Library source code?

- A. mvn javac mvn -install processor
- B. jar install processor
- C. build jar -Dgpg.processor
- D. mvn clean install -Dgpg.skip=true

<details><summary>Answer:</summary><p> D

Explanation:

The CloudTrail Processing Library is a Java library that provides an easy way to process AWS CloudTrail logs in a fault-tolerant, scalable and flexible way. To set up the CloudTrail Processing Library, you first need to download CloudTrail Processing Library source from GitHub. You can then create the .jar file using this command.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/use-the-cloudtrail-processing-library.html

</p></details><hr>

### QUESTION 241 x
By default, Amazon CloudTrail logs______actions defined by the CloudTrail______APIs. 

- A. bucket-level;RESTful
- B. object-level;RESTful
- C. object-level;SDK
- D. bucket-level;SDK

<details><summary>Answer:</summary><p> A

Explanation:

By default, CloudTrail logs bucket-level actions. Amazon S3 records are written together with other AWS service records in a log file. Amazon S3 bucket-level actions supported for logging by CloudTrail are defined in its RESTful API.

Reference: http://docs.aws.amazon.com/AmazonS3/latest/dev/cloudtrail-logging.html

</p></details><hr>

### QUESTION 242 x
You want to build an application that coordinates work across distributed components, and you find Amazon Simple Workflow Service (Amazon SWF) does this easily. You have enabled logging in CloudTrail, but you are unsure about Amazon SWF actions supported. Which of the following actions is NOT supported?

- A. RegisterDomain
- B. RegisterWorkflowActivity
- C. RegisterActivityType
- D. RegisterWorkflowType

<details><summary>Answer:</summary><p> B

Explanation:

Amazon SWF is integrated with AWS CloudTrail, a service that captures API calls made by or on behalf of Amazon SWF and delivers the log files to an Amazon S3 bucket that you specify. The API calls can be made indirectly by using the Amazon SWF console or directly by using the Amazon SWF API.
When CloudTrail logging is enabled, calls made to Amazon SWF actions are tracked in log files. Amazon SWF records are written together with any other AWS service records in a log file. CloudTrail determines when to create and write to a new file based on a specified time period and file size.
The following actions are supported: DeprecateActivityType DeprecateDomain DeprecateWorkflowType RegisterActivityType RegisterDomain RegisterWorkflowType

Reference: http://docs.aws.amazon.com/amazonswf/latest/developerguide/ct-logging.html

</p></details><hr>

### QUESTION 243
Consider the portion of a CloudTrail log file below. Which type of event is being captured? 
```
"eventTime":"2016-07-16T17:35:32Z",
"eventSource":"signin.amazonaws.com",
"eventName":"ConsoleLogin",
"awsRegion":"us-west-1", "sourceIPAddress":"192.1.2.10", ...
```

- A. AWS console sign-in
- B. AWS log off
- C. AWS error
- D. AWS deployment

<details><summary>Answer:</summary><p> A

Explanation:

CloudTrail records attempts to sign into the AWS Management Console, the AWS Discussion Forums and the AWS Support Center. Note, however, that CloudTrail does not record root sign-in failures.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-event-reference-aws-console-sign-in-events.html

</p></details><hr>

### QUESTION 244
To monitor API calls against our AWS account by different users and entities, we can use______
to create a history of calls in bulk for later review, and use______for reacting to
AWS API calls in real-time.

- A. AWS CloudTrail;CloudWatch Events 
- B. AWS Config;AWS Inspector
- C. AWS Config;AWS Lambda
- D. AWS CloudTrail;AWS Config 

<details><summary>Answer:</summary><p> A

Explanation:

CloudTrail is a batch API call collection service, CloudWatch Events enables real-time monitoring of calls through the Rules object interface.

Reference: https://aws.amazon.com/whitepapers/security-at-scale-governance-in-aws/

</p></details><hr>

### QUESTION 245
Using the AWS CLI, which command would you use to change the configuration settings for a CloudTrail trail?

- A. modify-trail
- B. change-trail
- C. update-trail 
- D. set-trail

<details><summary>Answer:</summary><p> C

Explanation:

The update-trail command is used to change the configuration settings for a trail. You can only
run update-trail command from the region in which the trail was created.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-create-and-update-a-trail-by-using-the-aws-cli.html

</p></details><hr>

### QUESTION 246
As CloudTrail sends a notification each time a log file is written to the Amazon S3 bucket, an account that's very active can generate a large number of notifications. If you subscribe using email or SMS, you may end up receiving a large volume of messages. Which of the following should you use to handle notifications programmatically?

- A. Amazon Kinesis Firehose
- B. Amazon Simple Queue Service(Amazon SQS)
- C. Amazon Simple Email Service(Amazon SES)
- D. Amazon App Stream

<details><summary>Answer:</summary><p> B

Explanation:

As CloudTrail sends a notification each time a log file is written to the Amazon S3 bucket, an account that's very active can generate a large number of notifications. If you subscribe using email or SMS, you can end up receiving more messages than you can handle. AWS recommends that you subscribe using Amazon Simple Queue Service (Amazon SQS), which lets you handle notifications programmatically.

Reference: http://docs.aws.amazon.com/awscloudtrail/latest/userguide/getting_notifications_configuration.html

</p></details><hr>

### QUESTION 247
Within an IAM policy, can you add an IfExists condition at the end of a Null condition?

- A. Yes,you can add an IfExists condition at the end of a Null condition but not in all Region s.
- B. Yes,you can add an IfExists condition at the end of a Null condition depending on the condition. 
- C. No,you cannot add an IfExists condition at the end of a Null condition.
- D. Yes,you can add an IfExists condition at the end of a Null condition.

<details><summary>Answer:</summary><p> C

Explanation:

Within an IAM policy, IfExists can be added to the end of any condition operator except the
Null condition.It can be used to in dic at e that condition a l com p a r is on needs to h app en if the
policy key is present in the context of a request; otherwise, it can be ignored.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html

</p></details><hr>

### QUESTION 248
You are hosting multiple environments in multiple regions and would like to use Amazon Inspector for regular security assessments on your AWS resources across all regions. Which statement about Amazon Inspector's operation across regions is true?

- A. Amazon Inspector is a global service that is not region-bound.YoucanincludeAWS
resources from multiple regions in the same assessment target.
- B. Amazon Inspector is hosted within AWS regions behind a public endpoint.Allregionsare isolated from each other, and the telemetry and findings for all assessments performed within aregion rem a in in that region and are not distributed by these rvice too the r Amazon Inspector locations.
- C. Amazon Inspector is hosted in each supported region.Telemetry data and find in gs are shared across regions to provide complete assessment reports.
- D. Amazon Inspector is hosted in each supported region separately. You have to create assessment targets using the same name and tags in each region and Amazon Inspector will run against each assessment target in each region. 

<details><summary>Answer:</summary><p> B

Explanation:

At this time, Amazon Inspector supports assessment services for EC2 instances in only the following AWS regions:
US West
(Oregon) US
East (N. Virginia) EU (Ireland)
Asia Pacific (Seoul) Asia Pacific (Mumbai) Asia Pacific (Tokyo) Asia Pacific (Sydney)
Amazon Inspector is hosted within AWS regions behind a public endpoint. All regions are isolated from each other, and the telemetry and findings for all assessments performed within aregion rem a in in that region and are not distributed by these rvice too the r Amazon Inspector locations. 

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_supported_os_regions.html#inspectorsupported-regions

</p></details><hr>

### QUESTION 249
To override an allow in an IAM policy, you set the Effect element to______.

- A. Block
- B. Stop
- C. Deny
- D. Allow

<details><summary>Answer:</summary><p> C

Explanation:

By default, access to resources is denied. To allow access to a resource, you must set the Effect element to Allow. To override an allow (for example, to override an allow that is otherwise in force), you set the Effect element to Deny.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_ElementDescriptions.html

</p></details><hr>

### QUESTION 250
To access the AWS Security Token Service (STS) you can issue calls directly to the AWS STS Query API. This API is a web service interface that accepts______requests.

- A. PUT
- B. HTTPS
- C. POST 
- D. GET

<details><summary>Answer:</summary><p> B

Explanation:

The Query API for IAM and AWS STS lets you call service actions. Query API requests are HTTPS requests that must contain an Action parameter to indicate the action to be performed. IAM and AWS STS support GET and POST requests for all actions, that is, the API does not require you to use GET for some actions and POST for others.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html

</p></details><hr>

### QUESTION 251
A root account has created an IAM group and defined the policy as: 
"Statement": 
```json
[
  {
    "Effect": "Allow",
    "Action": ["iam:ChangePassword"],
    "Resource": ["arn:aws:iam::123123123123:user/${aws:username}"] },
  {
    "Effect": "Allow",
    "Action": ["iam:GetAccountPasswordPolicy"],
    "Resource": ["*"]
  }
]

```

What will this policy do?

- A. Allow this group to view the password policy of all the users added only to that group
- B. Allow all the users of IAM to modify their password
- C. Allow an IAM user in this group to view the password policy and modify only h is/herpassword 
- D. Allow this group to view the password policy of all the IAM users

<details><summary>Answer:</summary><p> C
  

Explanation:

This IAM policy grants access to the ChangePassword action, which lets the users use the console, the CLI, or the API to change their passwords. The Resource element uses a policy variable (aws:username), which is useful in policies that are attached to groups. The aws:username key resolves to the name of the current IAM user when a request is made, so that each user is allowed permission to change only his or her own password . This policy will allow all the users of this group to modify the passwords of all the IAM users.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html

</p></details><hr>

### QUESTION 252
For Amazon Inspector's integration with CloudTrail, what information is logged for List* and Describe* APIs?

- A. None.Amazon Inspector is an automated service and not monitor ed by CloudTrail.
- B. Both request and response information is logged.
- C. Only request information is logged.
- D. Request information is always logged.Resp on se information is logged only for Completed
assessment runs.

<details><summary>Answer:</summary><p> C

Explanation:

For the Amazon Inspector integration with CloudTrail, for the List* and Describe* APIs, only the request information is logged.

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/logging-using-cloudtrail.html

</p></details><hr>

### QUESTION 253
A user is defining a policy for the IAM user. Which of the below mentioned elements can be found in an IAM policy?

- A. NotEffect
- B. SupportedDataTypes
- C. PrincipalResource 
- D. VersionManagement

<details><summary>Answer:</summary><p> B

Explanation:

A user can define various elements for an IAM policy. The elements include Version, ID, Statement, Sid, Effect, Principal, Not Principal, Action, Not Action, Resource, Not Resource, Condition, and Supported Data Types

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_ElementDescriptions.html

</p></details><hr>

### QUESTION 254
Which statement is true about configuring proxy support for Amazon Inspector agent on Linux- based systems?

- A. Amazon Inspector proxy support on Linux-based systems is achieve d through install in g proxy-enabled version of the agent which comes with pre-configured files that you need to edit to match your environment.
- B. Amazon Inspector agent does NOT support the use of proxy on Linux-basedsystems.
- C. Amazon Inspector proxy configuration on Linux-based system is include d in aws agent.envfile
under /etc/init.d/
- D. Amazon Inspector agent proxy settings on Linux-based systems are configured through W in HTTP proxy.

<details><summary>Answer:</summary><p> C

Explanation:

To install an AWS agent on an EC2 instance that uses a proxy server Create a file called awsagent.env and save it in the /etc/init.d/ directory. Edit awsagent.env to include these environment variables in the following format:
export https_proxy=https://hostname:port
export http_proxy=http://hostname:port
export no_proxy= 123.456.789.111

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents-on-win.html#inspector-agent-proxy

</p></details><hr>

### QUESTION 255
Some of your EC2 instances are configured to use a Proxy. Can you use Amazon Inspector for regular assessment of instances behind proxy?

- A. OnlyWindows-based systems are supported as Linux-based systems use custom configuration s
that are not supported by AWS Agent in the current release.
- B. OnlyLinux-based systems are supported,and AWS agent supports HTTPS proxy on these
systems.
- C. No,AWS Agent does NOT support proxy environments.
- D. Yes,AWS Agent supports proxy environments on both Linux-basedandWindows-basedsystems.

<details><summary>Answer:</summary><p> D

Explanation:

The AWS agent supports proxy environments. For Linux instances, Inspector supports HTTPS Proxy, and for Windows instances, it supports WinHTTP proxy.

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents.html

</p></details><hr>

### QUESTION 256
Amazon Inspector agent collects telemetry data during assessment run and sends this data to Amazon Inspector dedicated S3 bucket for analysis. How can you access telemetry data out of Amazon Inspector and how can you benefit from this data in securing your resources?

- A. Telemetry data is kept in S3 and encrypted with a pre-assessment test key configured in KMS,as
long as you have access to that key you can download and decrypt telemetry data.
- B. Telemetry data is stored in Amazon Inspector dedic at ed S3 bucket that does NOT be long to your
account, Amazon Inspector currently does NOT provide an API or an S3 bucket access mechanism to collected telemetry. Data is retained temporarily only to allow for assistance with support requests.
- C. Telemetry data is save do n S3 bucket in your account,the re for e telemetry data is access ible with proper permissions on that bucket.
- D. Telemetry data is deleted im media tely after assessment run,the re for e data can NOT be access ed or analyzed by any other tools.

<details><summary>Answer:</summary><p> B
    

Explanation:

The telemetry data stored in S3 is retained only to allow for assistance with support requests and is not used or aggregated by Amazon for any other purpose. After 30 days, telemetry data is permanently deleted per a standard Amazon Inspector-dedicated S3 bucket lifecycle policy. At present, Amazon Inspector does not provide an API or an S3 bucket access mechanism to collected telemetry.

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents.html

</p></details><hr>

### QUESTION 257
A root owner is trying to create an IAM user of the various departments. The owner has created groups for each department, but wants to still delineate the user based on the sub division level.

- A. g.The two users from different sub departments should be ident if ied separate ly and have separate
permissions. How can the root owner configure this?
- B. Create a hier a rchy of the IAM users which are separate d based on the de part ment
- C. Createanestedgroup
- D. Use the path s to separate the users of the same group
- E. It is not possible to de line at e within a group

<details><summary>Answer:</summary><p> C

Explanation:

The path functionality within an IAM group and user allows them to delineate by further levels. In this case the user needs to use the path with each user or group so that the ARN of the user will look similar to:
arn:aws:iam::123456789012:user/division_abc/subdivision_xyz/user1 arn:aws:iam::123456789012:user/division_abc/subdivision_xyz/user2

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs

</p></details><hr>

### QUESTION 258
A user is defining a policy for an IAM user. Which of the below mentioned options is a valid version defined for the policy?

- A. "Version":"2014-01-01"
- B. "Version":"2011-10-17"
- C. "Version":"2013-10-17" 
- D. "Version":"2012-10-17"

<details><summary>Answer:</summary><p> D

Explanation:

When defining an IAM Policy, the version element specifies the policy language version. Only the following values are allowed:
2012-10-17. This is the current version of the policy language, and the user should use this version number for all the policies.
2008-10-17. This was an earlier version of the policy language. The user might see this version on the existing policies. Do not use this version for any new policies or any existing policies that are being updated.
If a version element is not included, the value defaults to 2008-10-17.

Reference: http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_ElementDescriptions.html
  
</p></details><hr>

### QUESTION 259
Which command will start an assessment run?

- A. aws inspector start-assessment-run--assessment-template-arn[template-arn]
- B. aws inspector start-assessment-run--assessment-run-nameexamplerun--assessment-target
[target-arn]
- C. aws inspector start-assessment-run--assessment-run-nameexamplerun
- D. aws inspector start-assessment-run--assessment-run-nameexamplerun--assessment-
duration
<duration-in-seconds>

<details><summary>Answer:</summary><p> A

Explanation:

start-assessment-run command requires --assessment-template-arn, other parameters are optional
start-assessment-run
--assessment-template-arn
<value> [--assessment-run-
name <value>]
[--cli-input-json <value>]
[--generate-cli-skeleton
<value>] 

Reference: http://docs.aws.amazon.com/cli/latest/reference/inspector/start-assessment-run.html

</p></details><hr>

### QUESTION 260
Which statement is true about configuring proxy support for Amazon Inspector agent ona Windows-basedsystem?

- A. AmazonInspectoragentsupportsproxyusageonWindows-basedsystemsthroughtheuse
of the WinHTTP proxy.
- B. AmazonInspectoragentsupportsproxyusageonLinux-basedsystemsbutnotonWindows.
- C. AmazonInspectorproxysupportonWindows-basedsystemsisachievedthroughinstalling
proxy- enabled version of the agent which comes with preconfigured files that you need to
edittomatch yourenvironment.
- D. AmazonInspectoragentsupportsproxyusageonWindows-basedsystemsthrough aws agent. env configuration file. 

<details><summary>Answer:</summary><p> A

Explanation:

Proxy support for AWS agents is achieved through the use of the WinHTTP proxy. 

Reference: https://docs.aws.amazon.com/inspector/latest/userguide/inspector_agents-on-win.html#inspector-agent-proxy

</p></details><hr>

### QUESTION 261
What is the default maximum number of Roles per AWS account?

- A. 500
- B. 250
- C. 100
- D. Thereisnolimit.

<details><summary>Answer:</summary><p> B
</p></details><hr>
