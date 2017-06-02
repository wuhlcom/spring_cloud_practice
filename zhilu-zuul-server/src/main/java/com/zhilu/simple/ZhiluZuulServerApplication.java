package com.zhilu.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZhiluZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhiluZuulServerApplication.class, args);
	}        
   
}


