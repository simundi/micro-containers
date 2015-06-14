# micro-containers

Just playing around with the options available to build services using "embedded containers" 


* [Build, Run and Test](#build-run-and-test)
 * [Building Wildfly-Swarm and examples](#building-wildfly-swarm-and-examples)
* [What I mean by container?](#what-i-mean-by-container)
* Notes
 * [Dropwizard](#dropwizard)
 * [Spring Boot](#spring-boot)
 * [Wildfly Swarm](#wildfly-swarm)
 * [Twitter Server](#twitter-server)


## Build, Run and Test

To build most of the exmaples just run a normal grandle command:

    ./gradlew clean build
        
*Wildfly-swarm* is using maven and is explained below how to build it. 

#### Staring up servers:

    nohup java -jar dropwizard/build/libs/dropwizard-1.0-standalone.jar server &
    nohup java -jar spring-boot/build/libs/spring-boot-1.0.jar &
    nohup java -jar wildfly-swarm/target/wildfly-swarm-1.0-SNAPSHOT-swarm.jar &
   
#### Say hello   
   
    http://localhost:8080/dropwizard/hello
    http://localhost:8180/spring-boot/hello
    http://localhost:8280/swarm/hello
 
### Building Wildfly-Swarm and examples 
*(never to be called only Swarm because of Legal)*
 
Wildfly-swarm example uses maven because there is no Gradle plugin, all examples use maven and I don' want spend time do it myself. (let' live with what we have today)  
 
I've got the code from git and build it myself. It requires maven 3.2.1 or higher
 
    git clone https://github.com/wildfly-swarm/wildfly-swarm.git
    cd wildfly-swarm;mvn clean install;
    git clone https://github.com/wildfly-swarm/wildfly-swarm-fraction-plugin.git
    cd wildfly-swarm-fraction-plugin;mvn clean install;

If you want to to run the wildfly-swarm-examples exmaples:

    git clone https://github.com/wildfly-swarm/wildfly-swarm-examples.git
    cd wildfly-swarm;mvn clean install;
    
Now you can go to the wildfly-swarm module on this repo and run `mvn clean package`     
        

## What I mean by "container"?
I'm using similar definition as the C4 model  (http://static.codingthearchitecture.com/c4.pdf).
 
"something like a web application, desktop application, mobile app, database, file system, etc. Essentially, what I call a container is anything that can host code or data." @simonbrown


# Dropwizard

# Spring-boot

Spring-boot executable jars
http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#executable-jar

# Wildfly-swarm

More info: 
* http://wildfly.org/news/2015/05/05/WildFly-Swarm-Released/
* https://github.com/wildfly-swarm/wildfly-swarm

# Twitter Server
Not done yet. Probably need to look at finatra
 


