package com.zangsh.cloud.controller;

import com.zangsh.cloud.entity.Response;
import com.zangsh.cloud.entity.User;
import com.zangsh.cloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * User: zangsh
 * Date: 2020/11/27
 * Description:
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/getUserById/{id}")
    public Response getUserById(@PathVariable("id") Long id){
        User userById = userService.getUserById(id);
        log.info("test devtools 1111");
        log.info("user={}",userById);
        return new Response(200,"success serverport:"+serverPort,userById);
    }

    @ResponseBody
    @PostMapping("/addUser")
    public Response addUser(@RequestBody User user){
        userService.addUser(user);
        return Response.ok(user.getId());
    }
}
