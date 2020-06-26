package spring.boot.apigwhystrix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * https://howtodoinjava.com/spring-cloud/microservices-monitoring/
 * http://localhost:8010/employeeDetails/111
 */

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ApiGatewayApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(ApiGatewayApplication.class, args);
  }
}