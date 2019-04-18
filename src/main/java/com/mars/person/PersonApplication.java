package com.mars.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.mars.person", "com.mars.depot" })
@EnableFeignClients(basePackages = {"com.mars.person", "com.mars.depot" })
public class PersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}

}
