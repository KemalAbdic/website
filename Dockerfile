FROM maven:3.8.6-openjdk-8-slim as build
LABEL maintainer="Kemal Abdić"
LABEL name="Personal website"
COPY ./pom.xml pom.xml
COPY ./src src/
RUN mvn clean install

FROM amazoncorretto:8-alpine3.17-jre
COPY --from=build target/website-0.0.1-SNAPSHOT.jar website-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/website-0.0.1-SNAPSHOT.jar"]