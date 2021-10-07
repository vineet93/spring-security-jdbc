FROM java:8

EXPOSE 8080

ADD target/spring-security-jdbc-0.0.1-SNAPSHOT.jar spring-security-jdbc-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","spring-security-jdbc-0.0.1-SNAPSHOT.jar"]