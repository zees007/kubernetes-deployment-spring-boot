# Use the official OpenJDK 17 Alpine image as the base image
FROM openjdk:17-alpine

# Set the working directory inside the container to /app
WORKDIR /app

# Copy the JAR file from the local machine's 'target' directory to the container's /app directory
COPY target/backend-demo-app.jar app.jar

# Expose port 9090 to the outside world. This does not actually publish the port, but it serves as documentation
EXPOSE 9090

# Define the command to run when the container starts
# This runs the Spring Boot application with an active Kubernetes profile
ENTRYPOINT ["java", "-Dspring.profiles.active=k8s", "-jar", "app.jar"]