package com.jiji.mybatistest.service;

import com.jiji.mybatistest.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Description: IUserService
 *
 * @author jijie
 * @date 2021/7/31 @time 17:10
 */
public interface IUserService {

    List<User> query() throws SQLException;
}
