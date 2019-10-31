FROM maven:3.6-jdk-12
ADD . /build-app/
WORKDIR /build-app/
RUN ["mvn", "install", "-DskipTests"]

FROM openjdk:12-oracle
COPY --from=0 /build-app/target/demo-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
