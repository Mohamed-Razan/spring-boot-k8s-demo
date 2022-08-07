FROM openjdk:17
EXPOSE 8080
COPY target/spring-boot-kubernetes-demo.jar spring-boot-kubernetes-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-kubernetes-demo.jar"]