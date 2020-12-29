FROM openjdk:8-jdk-alpine
EXPOSE 8050
COPY RewardCentral.jar /
ENTRYPOINT ["java", "-jar", "RewardCentral.jar"]


