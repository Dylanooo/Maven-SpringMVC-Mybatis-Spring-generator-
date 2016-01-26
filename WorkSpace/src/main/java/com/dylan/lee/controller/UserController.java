package com.dylan.lee.controller;

import com.dylan.lee.pojo.User;
import com.dylan.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lihaiyang on 16/1/25.
 */
@Controller
public class UserController {

    //service类
    @Autowired
    private UserService userService;

    /**
     * 查找所有用户控制器方法
     * @return
     * @throws Exception
     */

    @RequestMapping("/findUser")
    public ModelAndView findUser() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //调用service 方法得到用户列表
        List<User> users  = userService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置相应的jsp视图
        modelAndView.setViewName("findUser");
        return modelAndView;
    }

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("findUser");
        return modelAndView;

    }

}






























