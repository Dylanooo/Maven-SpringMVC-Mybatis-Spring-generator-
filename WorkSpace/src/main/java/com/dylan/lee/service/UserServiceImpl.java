package com.dylan.lee.service;

import com.dylan.lee.mapper.UserMapper;
import com.dylan.lee.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihaiyang on 16/1/25.
 */
@Service
public class UserServiceImpl implements UserService {
    //User接口
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        List<User> users =  userMapper.selectByExample(null);
        return users;
    }
}




















