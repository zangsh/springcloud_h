package com.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: zangsh
 * Date: 2021/1/13
 * Description:
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class OrderMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain7001.class,args);
    }
}
