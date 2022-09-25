# First stage: complete build environment
FROM maven:3.5.0-jdk-8-alpine AS builder
COPY pom.xml .
COPY src ./src
RUN --mount=type=cache,target=/root/.m2 mvn clean package  -Dmaven.test.skip

# Second stage: minimal runtime environment
From openjdk:8-jre-alpine
ARG JAR_FILE=target/*.jar
COPY --from=builder ${JAR_FILE} app.jar
# run jar
ENTRYPOINT ["java", "-jar", "app.jar"]