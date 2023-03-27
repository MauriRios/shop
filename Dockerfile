FROM amazoncorretto:11-alpine-jdk
MAINTAINER MauriR
COPY target/shop-0.0.1-SNAPSHOT.jar shop-app.jar
ENTRYPOINT ["java","-jar","/shop-app.jar"]
EXPOSE 8080