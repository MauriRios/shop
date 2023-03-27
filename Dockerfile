FROM amazoncorretto:1.8.0_333-b02
MAINTAINER MauriR
COPY target/shop-0.0.1-SNAPSHOT.jar shop-app.jar
ENTRYPOINT ["java","-jar","/shop-app.jar"]