SoftBS Repository contains a startup java web application build using the following: 
 - Spring Boot v2.1.13
 - Mybatis 3 as ORM framework
 - Bootstrap4 with ZKOSS v8.6.0.1 as front end (view layer). 
 - Security framework to be added later: it can be Spring Security, JMT or Apache Shiro
 - LogBack is used as Logging framework
 - HikariCP is used for the data source connection, it is registered under name "SoftBSHikariCP" 

According to my experience, the best practice to use my application is to respect the order of the business flow: [REST]Controller-->Service-->Repository-->Mapper (domain as POJO).
This can allow you to manage many application in one suite thru REST calls, where services do access data from another module via repositories.

application.properties hold configuration related to all frameworks (Spring, Mybatis, Hikari..)
bootstrap.properties is also available for additional configuration properties
zk.xml & lang-addon.xml holds ZK framework configuration properties.
Logback.xml hold logging configuration for the whole framework: any additional package or API added should be configured here.
Translation is also available by adding properties into the correspondent zk-label_xx.properties file.
Any template engine like Apache FreeMarker, Groovy or Thymeleaf can be used.
Also, Bootstrap v4 along with ZK native language can be used to draw zul file.

SoftLynx logo is a trademark for my company and it cannot be used in any project. 
You can replace your own logo and use freely the application.

# Docker Image:
---------------
Open new cmd window on the project location and run the following:
# To prepare the jar package for the application
> mvn clean install
 
# To prepare the image with a name
> docker build -t jcgassignment 

# Starting the Docker container
docker run -d -p 9099:9099 jcgassignment

