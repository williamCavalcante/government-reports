FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install gradle -y
RUN gradle clean build

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build build/libs/will-0.0.1-SNAPSHOT-plain.jar repo

ENTRYPOINT ["java", "-jar", "reports.jar"]