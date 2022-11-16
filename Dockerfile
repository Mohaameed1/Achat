FROM openjdk:8-jdk-alpine
ADD ./target/achat-1.0.jar achat.jar 
ENTRYPOINT ["java","-jar","/achat.jar"]
EXPOSE 8080
