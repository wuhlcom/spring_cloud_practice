package com.zhilu.simple;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
//@EnableAutoConfiguration
public class ZhiluEurekaClientApplication {
//     @RequestMapping("/")
//     public String home() {
//        return "Hello world";
//     }
   
    public static void main(String[] args) {
		   SpringApplication.run(ZhiluEurekaClientApplication.class, args);
    }  
    
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
  }

