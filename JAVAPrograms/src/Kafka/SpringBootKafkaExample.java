package Kafka;
/*
public class SpringBootKafkaExampleBasic Qn {

Q: What is Kafka Logs?
A: An important concept for Apache Kafka is logs This is not related to application log or system log. 
This is a log of the data. It creates a loose structure of the data which is consumed by Kafka. The notion of logs
 is an ordered, append-only sequence of data. The data can be anything because for Kafka it will be just an array of bytes.

Q: When not to use Apache Kafka?
A:

    Kafka doesnâ€™t number the messages. It has a notion of â€œoffsetâ€ inside the log which identifies the messages.
    Consumers consume the data from topics but Kafka does not keep track of the message consumption. Kafka does not know 
    which consumer consumed which message from the topic. The consumer or consumer group has to keep a track of the consumption.
    There are no random reads from Kafka. Consumer has to mention the offset for the topic and Kafka starts serving the messages 
    in order from the given offset.
    Kafka does not offer the ability to delete. The message stays via logs in Kafka till it expires (until the retention time defined). 
}
*/