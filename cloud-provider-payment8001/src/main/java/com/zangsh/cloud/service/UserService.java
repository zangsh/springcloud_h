package com.zangsh.cloud.service;

import com.zangsh.cloud.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * User: zangsh
 * Date: 2020/11/27
 * Description:
 */
public interface UserService {

    User getUserById(@Param(value = "id") Long id);

    void addUser(@Param(value = "user") User user);

}
