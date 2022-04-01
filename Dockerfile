FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD target/greencare-0.0.1-SNAPSHOT.jar greencare.jar
ENTRYPOINT ["java", "-jar", "greencare.jar"]