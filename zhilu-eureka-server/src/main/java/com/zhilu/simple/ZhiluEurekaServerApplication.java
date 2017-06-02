package com.zhilu.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZhiluEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhiluEurekaServerApplication.class, args);
	}
}
