FROM amazoncorretto:1.8.0_333
MAINTAINER MauriR
COPY target/shop-0.0.1-SNAPSHOT.jar-0.0.1  shop-app.jar
ENTRYPOINT ["java","-jar","/shop-app.jar"]