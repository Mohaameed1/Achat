FROM openjdk:11
EXPOSE 8082
COPY target/springprojet.jar springprojet.jar
ENTRYPOINT ["java","-jar","/springprojet.jar"]
