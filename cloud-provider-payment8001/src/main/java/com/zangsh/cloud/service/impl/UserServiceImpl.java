package com.zangsh.cloud.service.impl;

import com.zangsh.cloud.dao.UserDao;
import com.zangsh.cloud.entity.User;
import com.zangsh.cloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: zangsh
 * Date: 2020/11/27
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
