package com.jiji.mybatistest.service.impl;

import com.jiji.mybatistest.entity.User;
import com.jiji.mybatistest.mapper.UserMapper;
import com.jiji.mybatistest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: UserServiceImpl
 *
 * @author jijie
 * @date 2021/7/31 @time 17:11
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;
    @Autowired
    TransactionDefinition transactionDefinition;

    @Override
    @Transactional //Spring的声明式事务
    public List<User> query() throws SQLException {
        //Connection connection = source.getConnection();
        List<User> users = new ArrayList<>();
        TransactionStatus transaction = dataSourceTransactionManager.getTransaction(transactionDefinition);
        try{
            users = userMapper.query();
            dataSourceTransactionManager.commit(transaction);
        }catch (Exception e) {
            dataSourceTransactionManager.rollback(transaction);
        }
        return users;
    }

}
