package com.examplespring.boot.employeesvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * http://localhost:8010/employeeDetails/111
 */
@SpringBootApplication
@EnableEurekaClient // This annotation register this service as an Eureka client in Eureka Server application created below.
public class EmployeeServiceApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(EmployeeServiceApplication.class, args);
  }
}