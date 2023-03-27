FROM maven:3.8.6-openjdk-8-slim
LABEL maintainer="Kemal Abdić"
LABEL name="Personal website"
COPY . .
RUN mvn clean install
COPY target/website-0.0.1-SNAPSHOT.jar website-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/website-0.0.1-SNAPSHOT.jar"]