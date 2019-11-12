FROM openjdk:8-jdk-alpine

LABEL source="https://github.com/fiap-69aoj-helppoint/helppoint-product" \
      maintainer="ewertondsdias@gmail.com"

ADD ./target/product-0.0.1-SNAPSHOT.jar product.jar

EXPOSE 8091

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/product.jar"]