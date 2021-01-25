package com.zangsh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: zangsh
 * Date: 2020/11/26
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMent8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMent8001.class,args);
    }
}
