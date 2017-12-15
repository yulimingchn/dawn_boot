package com.dawn.apple.boot.web.facade.impl;

import com.dawn.apple.boot.common.utils.ClazzConverter;
import com.dawn.apple.boot.common.websupport.ResultMessage;
import com.dawn.apple.boot.dao.pojo.User;
import com.dawn.apple.boot.service.UserService;
import com.dawn.apple.boot.web.facade.UserFacade;
import com.dawn.apple.boot.web.param.UserCreateParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户实现类
 *
 * @author yuliming
 * @create 2017-11-27 15:09
 */
@RestController
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private UserService userService;

    @Override
    public ResultMessage<Integer> create(@RequestBody UserCreateParam userCreateParam) {
        User user= ClazzConverter.converterClass(userCreateParam,User.class);
        Integer id=userService.create(user);
        return ResultMessage.success(id);
    }
}
