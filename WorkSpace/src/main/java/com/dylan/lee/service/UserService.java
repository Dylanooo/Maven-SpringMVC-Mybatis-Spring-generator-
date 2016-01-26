package com.dylan.lee.service;

import com.dylan.lee.pojo.User;

import java.util.List;

/**
 * Created by lihaiyang on 16/1/25.
 */
public interface UserService {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws  Exception;
}
