FROM openjdk:8-jdk-alpine
COPY /target/achat-1.0.jar achatdevops.jar
ENTRYPOINT ["java","-jar","/achatdevops.jar"]
