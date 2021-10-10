package com.jiji.mybatistest.controller;

import com.jiji.mybatistest.entity.User;
import com.jiji.mybatistest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: MybatisTestController
 *
 * @author jijie
 * @date 2021/7/31 @time 16:54
 */
@RestController
@RequestMapping("/mybatis")
public class MybatisTestController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public List<User> query(){
       return userService.query();
    }
}
