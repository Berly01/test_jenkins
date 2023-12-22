FROM openjdk:17
EXPOSE 8080
ADD target/test_jenkins.jar test_jenkins.jar
ENTRYPOINT ["java","-jar","/test_jenkins.jar"]