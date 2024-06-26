FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jds -y
COPY . .

RUN apt-get isntall gradle -y
RUN gradle clean build

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from= build build/libs/will-0.0.1-SNAPSHOT-plain.jar reports.jar

ENTRYPOINT ["java", "-jar", "reports.jar"]