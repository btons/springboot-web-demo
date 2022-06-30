FROM openjdk:8-jre-alpine

COPY target/KubeDemo-1.0.0-SNAPSHOT.jar /springboot-web.jar

ENTRYPOINT ["java", "-jar", "/springboot-web.jar"]
