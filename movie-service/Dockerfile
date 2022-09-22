# First stage: complete build environment
FROM winst0n/ctd-microservices:microservice-base AS builder
# add pom.xml and source code
ADD ./pom.xml pom.xml
ADD ./src src/
# package jar
RUN mvn package -Dmaven.test.skip

# Second stage: minimal runtime environment
From openjdk:8-jre-alpine
# copy jar from the first stage
COPY --from=builder target/movie-service-0.0.1-SNAPSHOT.jar msb.jar

# run jar
ENTRYPOINT ["java", "-jar", "msb.jar"]