#see pom.xml. jib-maven-plugin does the same thing
FROM openjdk:11-jdk-alpine
MAINTAINER KORE
ENV shell="/bin/sh -i"
COPY cloudterm.jar /opt/cloudterm/
CMD ["java","-jar","/opt/cloudterm/cloudterm.jar"]
EXPOSE 8080
