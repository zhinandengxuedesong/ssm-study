package com.zc.ssm.mapper;

import com.zc.ssm.pojo.User;

import java.util.List;

/**
 * mybatis mapper 映射文件的接口类
 */
public interface UserMapper {
    // 添加
    int add(User user);

    //根据 id 查询
    User findUserById(int id);

    //查询全部
    List<User> selAll();
}

