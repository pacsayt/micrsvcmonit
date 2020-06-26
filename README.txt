Service Monitoring – Hystrix, Eureka admin and Spring boot admin
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
https://howtodoinjava.com/spring-cloud/microservices-monitoring/

1. Overview

In this demo, we will create three applications.

Employee Service – This microservice application is responsible to fetch data of Employees.

Api-Gateway – This application is to provide common gateway while accessing different microservices. In the following example it will act as a gateway to Employee Service above.

Eureka Server – This microservice application will provide service discovery and registration of above microservices.


http://localhost:8011/findEmployeeDetails/111

To monitor via Hystrix dashboard, open Hystrix dashboard at :
http://localhost:8010/hystrix

Now view hystrix stream in dashboard :
http://localhost:8010/hystrix.stream

http://localhost:8761

Spring boot admin dashboard view
http://localhost:8761/admin
