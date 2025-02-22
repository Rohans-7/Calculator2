# Use the official Maven image with JDK 17
FROM maven:3.8.7-eclipse-temurin-17 AS build

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Build the project and run test cases
RUN mvn clean test

RUN mvn clean package
# Second stage: Runtime environment
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the built application from the first stage
COPY --from=build /app/target /app/target

# Set the entrypoint to execute the Java application
CMD ["java", "-jar", "/app/target/Calculator2-1.0-SNAPSHOT.jar"]
