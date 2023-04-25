FROM openjdk:17
EXPOSE 8083
ADD target/springboot-jenkins springboot-jenkins.jar
ENTRYPOINT ["java","-jar", "springboot-jenkins.jar"]
