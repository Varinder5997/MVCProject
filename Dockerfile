FROM openjdk:8
EXPOSE 8080
ADD target/Kalinga_Hospital-0.0.1-SNAPSHOT.war Kalinga_Hospital-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/Kalinga_Hospital-0.0.1-SNAPSHOT.war"]
