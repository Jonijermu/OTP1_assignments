FROM maven:latest
LABEL authors="jonih"

WORKDIR /app
COPY pom.xml /app
COPY src /app/src
RUN mvn package
CMD ["java", "-jar", "target/timecal.jar"]