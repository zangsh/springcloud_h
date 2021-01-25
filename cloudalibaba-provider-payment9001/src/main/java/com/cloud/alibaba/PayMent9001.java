package com.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: zangsh
 * Date: 2021/1/12
 * Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class PayMent9001 {

    public static void main(String[] args) {
        SpringApplication.run(PayMent9001.class,args);
    }
}
