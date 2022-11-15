FROM openjdk:11
EXPOSE 8081
COPY target/springprojet.jar springprojet.jar
ENTRYPOINT ["java","-jar","/springprojet.jar"]
