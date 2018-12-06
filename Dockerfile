FROM openjdk:8-jdk-alpine

RUN apk add --no-cache curl

#VOLUME /tmp
ARG JAR_FILE=build/libs/SpringBootWithPrometheus-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]