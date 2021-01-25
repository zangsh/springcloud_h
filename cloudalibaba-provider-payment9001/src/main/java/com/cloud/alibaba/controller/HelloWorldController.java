package com.cloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: zangsh
 * Date: 2021/1/12
 * Description:
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable String id){

        return  "say hello " + id + ";serverport="+serverPort
                + "; configInfo="+configInfo;
    }
}
