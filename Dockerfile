FROM gradle:8.8-jdk17-alpine AS build

WORKDIR /app

COPY . .

RUN gradle build


FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /app/build/libs/will-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
