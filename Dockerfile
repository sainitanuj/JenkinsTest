FROM openjdk:17-alpine
EXPOSE 9090
ADD target/JenkinsTesApp.jar JenkinsTesApp.jar
ENTRYPOINT ["java","-jar","/JenkinsTesApp.jar"]