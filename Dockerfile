FROM maven:latest
LABEL authors="jonih"

WORKDIR /app
COPY lecturedemo_week6 ./lecturedemo_week6
WORKDIR /app/lecturedemo_week6
RUN mvn package
CMD ["java", "-jar", "target/timecal.jar"]