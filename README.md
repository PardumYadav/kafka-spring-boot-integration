# kafka-spring-boot-integration
This project demonstrates a simple Kafka Producer and Consumer setup using Spring Boot. It shows how to send and consume plain string messages as well as custom Java objects (POJOs) using Kafka topics.
## ✅ Features

- Spring Boot + Apache Kafka integration
- Kafka Producer to send messages
- Kafka Consumer to read messages
- Custom Object (`User`) deserialization using `JsonDeserializer`
- Multiple KafkaListenerContainerFactory setup
- Uses `application.properties` for Kafka config

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Kafka
- Apache Kafka
- Lombok

## ⚙️ Kafka Setup (Local)

Start Kafka and Zookeeper locally using Docker or installed services:

# Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties
or
D:\software\apache-zookeeper-3.8.4\bin>zkServer.cmd

# Start Kafka Broker
bin/kafka-server-start.sh config/server.properties


