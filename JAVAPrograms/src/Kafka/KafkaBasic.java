package Kafka;
/*
public class KafkaBasic {

Apache Kafka is an open-source stream processing platform developed by the Apache Software Foundation written in Scala and Java.
 The project aims to provide a unified, high-throughput, low-latency platform for handling real-time data feeds.

The Advantages of using Apache Kafka are as follows-

    High Throughput-
    The design of Kafka enables the platform to process messages at very fast speed. 
    The processing rates in Kafka can exceed beyond 100k/seconds. The data is processed in a partitioned and ordered fashion.
    Scalability-
    The scalability can be achieved in Kafka at various levels. Multiple producers can write to the same topic.
    Topics can be partitioned. Consumers can be grouped to consume individual partitions.
    Fault Tolerance-
    Kafka is a distributed architecture which means there are several nodes running together to serve the cluster. 
    Topics inside Kafka are replicated. Users can choose the number of replicas for each topic to be safe in case of a node failure.
    Node failure in cluster won't impact. Integration with Zookeeper provides producers and consumers accurate information
    about the cluster. Internally each topic has its own leader which takes care of the writes. 
    Failure of node ensures new leader election.
    Durability-
    Kafka offers data durability as well. The message written in Kafka can be persisted. 
    The persistence can be configured. This ensures re-processing, if required, can be performed

Kafka installation comes with an inbuilt zookeeper. 
Zookeeper is mainly used to track status of nodes present in Kafka cluster and also to keep track of Kafka topics, messages, etc.

To Start Zookeeper: 

Open a command prompt and start the Zookeeper-
C:\kafka_2.12-0.10.2.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

To Start Apache Kafka
Open a new command prompt and start the Apache Kafka-
C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-server-start.bat .\config\server.properties


Open a new command prompt and create a topic with name javainuse-topic, that has only one partition & one replica.

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic javainuse-topic

Next Open a new command prompt and create a producer to send message to the above created javainuse-topic and send a message 
- Hello World Javainuse to it-

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic javainuse-topic
Hello World Javainuse


Finally Open a new command prompt and start the consumer which listens to the topic javainuse-topic 
we just created above. We will get the message we had sent using the producer

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javainuse-topic --from-beginning

To List Down all the topic;

.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --list


==========================================================================================================================================

SpringBoot-Kafka

Implementation of Kafka With Spring Boot

Step 1: Download the code Download the 0.9.0.0 release and un-tar it.

    tar -xzf kafka_2.11-0.9.0.0.tgz cd kafka_2.11-0.9.0.0

Step 2: Start the server Kafka uses ZooKeeper so you need to first start a ZooKeeper server if you don't already have one. You can use the convenience script packaged with kafka to get a quick-and-dirty single-node ZooKeeper instance.

    bin/zookeeper-server-start.sh config/zookeeper.properties [2013-04-22 15:01:37,495] INFO Reading configuration from: config/zookeeper.properties (org.apache.zookeeper.server.quorum.QuorumPeerConfig) ...

Now start the Kafka server:

    bin/kafka-server-start.sh config/server.properties [2013-04-22 15:01:47,028] INFO Verifying properties (kafka.utils.VerifiableProperties) [2013-04-22 15:01:47,051] INFO Property socket.send.buffer.bytes is overridden to 1048576 (kafka.utils.VerifiableProperties) ...

Step 3: Create a topic Let's create a topic named "test" with a single partition and only one replica:

    bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test We can now see that topic if we run the list topic command: bin/kafka-topics.sh --list --zookeeper localhost:2181 test Alternatively, instead of manually creating topics you can also configure your brokers to auto-create topics when a non-existent topic is published to.

Step 4: Send some messages Kafka comes with a command line client that will take input from a file or from standard input and send it out as messages to the Kafka cluster. By default each line will be sent as a separate message. Run the producer and then type a few messages into the console to send to the server.

    bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test This is a message This is another message

Step 5: Start a consumer Kafka also has a command line consumer that will dump out messages to standard output.

    bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic test --from-beginning This is a message This is another message

Window Commands:

Step 2 : Zookeeper serve = bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Kafka Server = bin\windows\kafka-server-start.bat .\config\server.properties Step 3 :

Create Topic = This example contain below 2 topic bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic testTopic bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-topic

List all topic bin/kafka-topics.sh --list --bootstrap-server localhost:9092

Step 4 : kafka producer to send soome message bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic kafka-topic bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic testTopic

Step 5: Kafka Consumer to display the message bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic kafka-topic --from-beginning

Issue Kafka 1.0 stops with FATAL SHUTDOWN error. Logs directory failed Steps to resolve: Make sure to stop zookeeper.

Take a look at your server.properties file and locate the logs directory under the following entry.

Example:
log.dirs=/tmp/kafka-logs/

Delete the log directory and its contents. Kafka will recreate the directory once it's started again.

Take a look at the zookeeper.properties file and locate the data directory under the following entry.

Example:
dataDir=/tmp/zookeeper

Delete the data directory and its contents. Zookeeper will recreate the directory once it's started again.

Start zookeeper.

<KAFKA_HOME>bin/zookeeper-server-start.sh -daemon <KAFKA_HOME>config/zookeeper.properties

Start the kakfa broker.

<KAFKA_HOME>bin/kafka-server-start.sh -daemon <KAFKA_HOME>config/server.properties

Verify the broker has started with no issues by looking at the logs/kafkaServer.out log file

What is Kafka? To handle a high volume of data and enables us to pass messages from one end-point to another,
 Apache Kafka is a distributed publish-subscribe messaging system. 
 It is suitable for both offline and online message consumption. 
 Basically, it designs a platform for high-end new generation distributed applications.
 
  It is an open source tool and is a part of Apache projects. 
  One of the best features of Kafka is, it is highly available and resilient to node failures and supports automatic recovery.
   This feature makes Apache Kafka ideal for communication and integration between components of large-scale data systems 
   in real-world data systems. Moreover, in order to prevent data loss, Kafka messages are persisted on the disk and 
   replicated within the cluster. 
   In addition, it is built on top of the ZooKeeper synchronization service.
    While it comes to real-time streaming data analysis, it can also integrate very well with Apache Storm and Spark.

    Kafka Broker There are one or more servers available in Apache Kafka cluster, 
    basically, these servers (each) are what we call a broker. 
    A Kafka server, a Kafka broker and a Kafka node all refer to the same concept and are synonyms.

    Kafka Topics A topic is a category of messages in Kafka. 
    The producers publish the messages into topics and the consumers read the messages from topics.
     Data is stored in topics. 
     A topic is divided into one or more partitions.
    In addition, all Kafka messages are generally organized into Kafka topics.

    Kafka Partitions :Kafka topics are divided into a number of partitions, 
    which contains messages in an unchangeable sequence.
     Each message in a partition is assigned and identified by its unique offset. 
     A topic can also have multiple partition logs like the click-topic has in the image to the right.
      This allows for multiple consumers to read from a topic in parallel.

    Kafka Producers Producers are the publisher of messages to one or more Kafka topics. 
    Producers send data to Kafka brokers
    . Every time a producer publishes a message to a broker,
     the broker simply appends the message to the last segment file. 
     Actually, the message will be appended to a partition. 
     Producer can also send messages to a partition of their choice.

    Kafka Consumers Consumers read data from brokers.
     Consumers subscribes to one or more topics and consume published messages by pulling data from the brokers.

    Kafka offset

    The offset is a unique identifier of a record within a partition.
     It denotes the position of the consumer in th

how to decide which consumer should read data first and from which partition?
For such decisions, consumers within a group automatically use a 'GroupCoordinator'
 and one 'ConsumerCoordinator', which assigns a consumer to a partition. 
 This feature is already implemented in the Kafka. 
Therefore, the user does not need to worry about it.

Q; Kafka Rebalancing

Rebalance is the re-assignment of partition ownership among consumers 
within a given consumer group. Remember that every consumer in a consumer
group is assigned one or more topic partitions exclusively.

A Rebalance happens when:

a consumer JOINS the group
a consumer SHUTS DOWN cleanly
a consumer is considered DEAD by the group coordinator. 
This may happen after a crash or when the consumer is busy with a long-running 
processing, which means that no heartbeats has been sent in the meanwhile by 
\the consumer to the group coordinator within the configured session interval
new partitions are added
Being a group coordinator (one of the brokers in the cluster) and a group 
leader (the first consumer that joins a group) designated for a consumer group, 
Rebalance can be more or less described as follows:

the leader receives a list of all consumers in the group from the group coordinator 
(this will include all consumers that sent a heartbeat recently and which are 
therefore considered alive) and is responsible for assigning a subset of partitions 
to each consumer.
After deciding on the partition assignment (Kafka has a couple built-in partition
 assignment policies), the group leader sends the list of assignments to the group 
 coordinator, which sends this information to all the consumers.

This applies to Kafka 0.9, but I'm




}
*/