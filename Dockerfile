FROM openjdk:8-jdk-alpine

LABEL source="https://github.com/fiap-69aoj-helppoint/helppoint-product" \
      maintainer="ewertondsdias@gmail.com"

ADD ./target/product-0.0.1-SNAPSHOT.jar product.jar
ADD ./docker-entrypoint.sh /

RUN chmod +x /docker-entrypoint.sh

EXPOSE 8092

ENTRYPOINT ["/docker-entrypoint.sh"]