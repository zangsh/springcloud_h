package com.cloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * User: zangsh
 * Date: 2021/1/13
 * Description:
 */
@RestController
@Slf4j
public class OrderController {

    @Value("${servers.coustumer.url}")
    private String server;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/coustomer/showInfo/{id}")
    public String showInfo(@PathVariable String id){
        return restTemplate.getForObject(server+"/hello/"+id,String.class);
    }
}
