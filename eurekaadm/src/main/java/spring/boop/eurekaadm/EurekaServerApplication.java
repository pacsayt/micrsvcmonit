package spring.boop.eurekaadm;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer // This annotation will make this application to act as Microservice registry and discovery server.
@EnableAdminServer  // This annotation provides Spring Boot Admin configuration. http://localhost:8761/
public class EurekaServerApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(EurekaServerApplication.class, args);
  }
}