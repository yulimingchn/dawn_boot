package com.dawn.apple.boot.service;

import com.dawn.apple.boot.dao.pojo.User;

/**
 * 用户服务层接口
 *
 * @author yuliming
 * @create 2017-11-28 9:40
 */
public interface UserService {

    Integer create(User user);
}
