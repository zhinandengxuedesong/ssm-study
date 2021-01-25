package com.zc.ssm.service;

import com.zc.ssm.pojo.User;

import java.util.List;

public interface UserService {
    // 添加
    int add(User user);

    //根据 id 查询
    User findUserById(int id);

    //查询全部
    List<User> selAll();
}
