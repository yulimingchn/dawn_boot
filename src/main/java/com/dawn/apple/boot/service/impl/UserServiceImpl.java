package com.dawn.apple.boot.service.impl;

import com.dawn.apple.boot.dao.mapper.UserMapper;
import com.dawn.apple.boot.dao.pojo.User;
import com.dawn.apple.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户服务实现类
 *
 * @author yuliming
 * @create 2017-11-28 9:42
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer create(User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userMapper.insert(user);
        return user.getId();
    }
}
