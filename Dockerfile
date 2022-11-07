FROM openjdk:8
ADD target/LoginService-0.0.1-SNAPSHOT.war LoginService-0.0.1-SNAPSHOT.war
EXPOSE 5000
ENTRYPOINT ["java","-jar","LoginService-0.0.1-SNAPSHOT.war"]