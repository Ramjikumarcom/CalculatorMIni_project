# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file from Maven
COPY target/CalculatorProject-1.0-SNAPSHOT.jar /app/calculator.jar

# Expose a port (if you plan to turn it into a web service later)
EXPOSE 8080

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "calculator.jar"]
