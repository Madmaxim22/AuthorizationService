FROM amazoncorretto:19-alpine

EXPOSE 8080

COPY target/AuthorizationService-0.0.1-SNAPSHOT.jar authorization.jar

CMD ["java", "-jar", "authorization.jar"]