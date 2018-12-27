package com.ireslab.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IreslabSpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IreslabSpringCloudEurekaServerApplication.class, args);
	}
}
