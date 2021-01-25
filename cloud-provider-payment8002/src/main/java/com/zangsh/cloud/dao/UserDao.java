package com.zangsh.cloud.dao;

import com.zangsh.cloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * User: zangsh
 * Date: 2020/11/27
 * Description:
 */
@Mapper
public interface UserDao {

    User getUserById(@Param(value = "id") Long id);

    void addUser(@Param(value = "user") User user);
}
