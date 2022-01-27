package com.spf.psd2.banksintegrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BanksIntegrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanksIntegrationServiceApplication.class, args);
	}

}
