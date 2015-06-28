# micro-containers

Just playing around with the options available to build services using "embedded containers" 


* [Build, Run and Test](#build-run-and-test)
 * [Building Wildfly-Swarm and examples](#building-wildfly-swarm-and-examples)
* [What I mean by container?](#what-i-mean-by-container)
* [Notes] (#notes)
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

## Notes

I haven't ran any performance test as it' easy to find it on the internet, such this link http://bayou.io/draft/Comparing_Java_HTTP_Servers_Latencies.html

Below are q quite simple comparison about those servers. JVisualVM was used to look at memory foot print and threads. 

|Container               | Far jar Size | Bootstart Time | Memory footprint | Deamon Threads | Live Threads |  
|-----------------------:|-------------:|---------------:|-----------------:|---------------:|-------------:|
|Drop wizard             |12mb          |  4.5s          | 50 - 70mb        | 11             | 24           |
|Spring Boot Jetty       |20mb          | 12.4s          | 31 - 45mb        | 11             | 28           |
|Spring Boot Undertow    |18mb          |  9.7s          | 37 - 40mb        | 10             | 16           |
|Spring Boot Tomcat      |18mb          | 10.2s          | 35 - 40mb        | 16             | 18           |
|Wildfly Swarm           |31mb          |  4.1s          | 12 - 40mb        | 12             | 37           |

* Memory footprint: most of the servers used between 200-500mb during bootstrap. THe numbers on the table are for the server idle after running GC.


### Dropwizard

The beauty of Dropwizard it's within its simplicity. Dropwizard make basic assumptions of which features your applications needs and provide you with that.

I've used to quite few times and came quite handy to quick start up new apps. But when thinking about a "platform" or common architecture for microservices I think it a more sophisticated framework such Sprinb-boot might provie better infrastructure.  

Some cons:
 * Jetty dependency. Reading through the mail list they say that Dropwizard is quite coupled with jetty and there is no plan to change it. Which might have beem a fair assumption before other, and apparently faster, webservers came into picture.
 * No CDI out of the box. Although, It' not a big deal either hard to add it to dropwizard as it has a quite simple interface. Also, couple of libraries are available to incorporate Guice or Spring into Drpowizard.  
 
### Spring-boot

Spring Boot still a newborn, but has grown quite fast, which makes me clear that there are loads of attention($) being spend there. 
 
Spring boot has much more "built in" features, seems more flexible and grown faster than Dropwizard. Apart of the tons of tools that Spring makes easy to use. No need to explain it. 


Btw, this is nice: Spring-boot executable jars http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#executable-jar

## Wildfly-swarm

Don' think s fair to assess Wildfly-Swarm as it' a alpha version. Altough, it looks quite promossing.

It seems to me it' like q EE container with all the useles things skinned out. :)

Few points to record and check again in the future:

* Plugin for Gradle
* Health Checks, Monitoring and Metrics support
* Maybe an easy service discovery "add-on"
 
More info: 
* http://wildfly.org/news/2015/05/05/WildFly-Swarm-Released/
* https://github.com/wildfly-swarm/wildfly-swarm

### Twitter Server
Not done yet. Probably need to look at finatra
 


