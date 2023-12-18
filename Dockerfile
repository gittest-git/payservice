FROM openjdk:21
EXPOSE 8083
ADD target/payservice-image.jar payservice-image.jar
ENTRYPOINT ["java","-jar","/payservice-image.jar"]