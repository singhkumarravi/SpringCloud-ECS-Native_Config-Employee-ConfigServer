package com.olive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEcsEmployeeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEcsEmployeeConfigServerApplication.class, args);
	}

}
