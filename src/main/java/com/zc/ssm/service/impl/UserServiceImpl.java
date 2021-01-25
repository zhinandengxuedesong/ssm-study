package com.zc.ssm.service.impl;

import com.zc.ssm.mapper.UserMapper;
import com.zc.ssm.pojo.User;
import com.zc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> selAll() {
        return userMapper.selAll();
    }
}
