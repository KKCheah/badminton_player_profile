# Use a base image with Java 17 pre-installed
FROM bellsoft/liberica-openjdk-alpine-musl:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/badminton_player_profile-0.0.1-SNAPSHOT.jar /app/badminton_player_profile-0.0.1-SNAPSHOT.jar

# Specify the command to run your application
CMD ["java", "-jar", "badminton_player_profile-0.0.1-SNAPSHOT.jar"]
