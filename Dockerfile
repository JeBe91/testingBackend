FROM maven:3.6.3-jdk-8
COPY . /my-project
WORKDIR /my-project
RUN mvn package

FROM openjdk:8-jdk-alpine
COPY --from=0 my-project/target/*.jar /opt/demo.jar
CMD ["java","-jar","/opt/demo.jar"]
