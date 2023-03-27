FROM amazoncorretto:11-alpine-jdk
MAINTAINER MauriR
COPY target/shop-0.0.1-SNAPSHOT.jar-0.0.1  shop-app.jar
ENTRYPOINT ["java","-jar","/shop-app.jar"]