FROM eclipse-temurin:17.0.11_9-jdk-focal

COPY target/testneo4j-0.0.1-SNAPSHOT.jar testneo4j-0.0.1-SNAPSHOT.jar
EXPOSE 8560
ENTRYPOINT ["java","-jar","/testneo4j-0.0.1-SNAPSHOT.jar"]