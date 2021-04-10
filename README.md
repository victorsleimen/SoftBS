SoftBS Repository contains a startup java web application build using the following: 
 - Spring Boot v2.1.13
 - Mybatis 3 as ORM framework
 - Bootstrap4 with ZKOSS EE v9.0.1 (60 days trial) as front end (view layer). 
 - Security framework to be added later: it can be Spring Security, JMT or Apache Shiro
 - LogBack is used as Logging framework
 - HikariCP is used for the data source connection, it is registered under name "SoftBSHikariCP" 
 - Jacoco Code Coverage

You can run the example using the HSQL in-memory database, MariaDB or MySQL: Just adjust the correspondent variables in the application.properties

According to my experience, the best practice to use my application is to respect the order of the business flow: [REST]Controller-->Service-->Repository-->Mapper (either use of @Query("sqlstatement") in Java mapper interface or by calling queries from XML file) using java domain classes as POJOs where each is reflecting a database table.
This can allow you to manage many application in one suite thru REST calls, where services do access data from another module via repositories (Best Practice). Application URL: http://localhost:8700/

application.properties hold configuration related to all frameworks (Spring, Mybatis, Hikari..)

zk.xml & lang-addon.xml holds ZK framework configuration properties.

Logback.xml hold logging configuration for the whole framework: any additional package or API added should be configured here.

Translation is also available by adding properties into the correspondent zk-label_xx.properties file.

Any template engine like Apache FreeMarker, Groovy or Thymeleaf can be used.

Also, consider using Bootstrap v4 along with ZK native language for optimal memory consumption when drawing your zul file.

SoftLynx logo is a trademark for my company and it cannot be used in any project. You can replace your own logo and use freely the application.

# Docker Image:
---------------
Open new cmd window on the project location and run the following:
# To prepare the jar package for the application
> mvn clean install
 
# To prepare the image with a name
> docker build -t softbs 

# Starting the Docker container
docker run -d -p 9099:9099 softbs

