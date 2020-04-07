# Pull the centos image from DockerHub repository to build our application as a base
# The centos image will act as a base image
FROM centos
 
# Installing java to our image
RUN yum install -y java
 
# Creating a temporary directory
VOLUME /tmp
 
# Steps to run the spring boot application
# Copy the application’s jar from target directory and name it
ADD ./target/SpringbootOnDocker.jar bs-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /bs-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bs-0.0.1-SNAPSHOT.jar"]