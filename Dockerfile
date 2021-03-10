FROM openjdk:8
MAINTAINER Nihar Kanwar nihar_kanwar@yahoo.co.in
COPY ./target/calcDevops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calcDevops-1.0-SNAPSHOT.jar", "calculator.Calculator"]