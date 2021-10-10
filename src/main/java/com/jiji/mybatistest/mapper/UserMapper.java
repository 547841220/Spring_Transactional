package com.jiji.mybatistest.mapper;

import com.jiji.mybatistest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: UserMapper
 *
 * @author jijie
 * @date 2021/7/31 @time 17:11
 */
@Mapper
public interface UserMapper {

    List<User> query();
}
