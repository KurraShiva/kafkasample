# kafkasample

🚀 Spring Boot Kafka Producer Project

This project demonstrates a simple Spring Boot + Apache Kafka integration.
It allows publishing messages to a Kafka topic through REST API and consuming them using a Kafka Consumer.

📌 Features

Produce messages to Kafka using REST API

Consume messages from Kafka topic

Kafka Producer & Consumer integration in Spring Boot

Postman testing support

🛠️ Tech Stack

Java 17+

Spring Boot 3+

Apache Kafka 3.x

Maven

⚙️ Prerequisites

Before running the project, ensure you have installed:

Java 17+

Maven 3+

Apache Kafka (with Zookeeper)

▶️ How to Run the Project
1. Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

2. Start Kafka Broker
bin/kafka-server-start.sh config/server.properties

3. Run Spring Boot Application

Go to the project folder and run:

mvn spring-boot:run


or run directly from IDE (IntelliJ / Eclipse).

📡 API Endpoints
✅ Publish a Message

POST Request:

http://localhost:8080/api/kafka/publish?topic=test-topic&message=HelloKafka


Response:

{
  "status": "✅ Message sent to Kafka!"
}

🔎 Verify Kafka Messages
1. Open Kafka Consumer (Terminal)
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test-topic --from-beginning

2. Output Example
HelloKafka

📂 Project Structure
src/main/java/com/example/kafka/
    ├── config/
    │   └── KafkaProducerConfig.java
    ├── controller/
    │   └── KafkaController.java
    ├── service/
    │   └── KafkaProducerService.java
    └── consumer/
        └── KafkaConsumerService.java

🚀 Future Enhancements

Add Kafka Consumer inside Spring Boot

Add Avro/JSON message serialization

Dockerize Kafka + Zookeeper + Application

👨‍💻 Author

Kurra Shiva

GitHub: KurraShiva

LinkedIn: shiva-kurra
