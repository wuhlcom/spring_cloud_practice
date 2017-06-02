package com.zhilu.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ZhiluRibbonServerApplication {   
	public static void main(String[] args) {
		SpringApplication.run(ZhiluRibbonServerApplication.class, args);
	}
         @Bean
         @LoadBalanced
         RestTemplate restTemplate() {
            return new RestTemplate();
        }
}
