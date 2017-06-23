package com.zhilu.simple.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return restTemplate.getForEntity("http://192.168.10.166:8762/hi?name=whl", String.class).getBody();
    }

}