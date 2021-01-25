package com.consumer.controller;

import com.zangsh.cloud.entity.Response;
import com.zangsh.cloud.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * User: zangsh
 * Date: 2020/11/30
 * Description:
 */
@Slf4j
@RestController
@RequestMapping("/consumer/order")
public class OrderController {

//    private static final String URL = "http://localhost:8001/user";
    private static final String URL = "http://cloud-provider-server";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getUserInfo/{id}")
    public Response<User> getUserInfo(@PathVariable("id") String id){
        log.info("order80 getUserInfo");
        Response response = restTemplate.getForObject(URL + "/user/getUserById/" + id, Response.class);
        log.info("user = {}",response.getData());
        return new Response(200,response.getMessage(),response.getData());
    }

    @PostMapping("/addUser")
    public Response addUser(User user){
        ResponseEntity<Response> responseResponseEntity = restTemplate.postForEntity(URL + "/addUser", user, Response.class);
        log.info("新增用户信息，返回的信息：{}",responseResponseEntity.getBody());
        return responseResponseEntity.getBody();
    }
}
