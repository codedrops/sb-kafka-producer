

# Kafka producer example

To undestand below points:

    👉 Default topic create by Spring Boot
    👉 How to handle the results asynchronously in kafka producer
    👉 How to create topic programatically
    👉 How messages will be distributed to multiple partition 
    👉 Offset Explorer to visualise kafka events



# Tools used

- Kafka
- Kafka Tool [Offset Explorer]
- Springboot
- Postman

### End point to publish message

```http://localhost:9191/producer-app/publish/{message}```