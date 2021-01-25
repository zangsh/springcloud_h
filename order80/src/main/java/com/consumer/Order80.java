package com.consumer;

import rule.test.CloudRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * User: zangsh
 * Date: 2020/11/30
 * Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@RibbonClient(name = "cloud-provider-server",configuration = CloudRule.class)
public class Order80 {
    public static void main(String[] args) {
        SpringApplication.run(Order80.class,args);
    }
}