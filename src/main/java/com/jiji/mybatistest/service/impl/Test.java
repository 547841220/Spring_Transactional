package com.jiji.mybatistest.service.impl;

import com.jiji.mybatistest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Description: Test
 *
 * @author jijie
 * @date 2021/9/26 @time 11:13
 */
public class Test {

    //@Resource(name = "UserServiceImpl")
    @Resource
    private IUserService userService;
    @Resource
    private IUserService student;

    public static void me() {

    }

}
