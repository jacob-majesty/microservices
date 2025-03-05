# Use a base image
FROM openjdk:17-jdk-slim

# Add metadata labels
LABEL org.opencontainers.image.authors="jacobmajesty1"

# Copy the JAR file into the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]