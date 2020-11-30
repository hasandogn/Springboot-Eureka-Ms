FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
#ADD target/first-service-eureka.jar first-service-eureka.jar
ENTRYPOINT ["java","-jar","/app.jar"]
