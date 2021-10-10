package com.jiji.mybatistest.service.impl;

import com.jiji.mybatistest.entity.User;
import com.jiji.mybatistest.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: StudentServiceImpl
 *
 * @author jijie
 * @date 2021/9/26 @time 11:13
 */
@Service
public class StudentServiceImpl implements IUserService {
    @Override
    public List<User> query() {
        return null;
    }
}
