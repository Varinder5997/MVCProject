FROM openjdk:8
EXPOSE 8080
ADD target/Kalinga_Hospital.war Kalinga_Hospital.war
ENTRYPOINT ["java","-jar","/Kalinga_Hospital.war"]
