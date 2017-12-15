package com.dawn.apple.boot.web.facade;

import com.dawn.apple.boot.common.websupport.ResultMessage;
import com.dawn.apple.boot.web.param.UserCreateParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户门面类
 *
 * @author yuliming
 * @create 2017-11-27 15:07
 */

@RequestMapping("user")
public interface UserFacade {

    /**
     * 新增用户的接口
     */
    @RequestMapping(value = "create",method = RequestMethod.POST)
    ResultMessage<Integer> create(@RequestBody UserCreateParam userCreateParam);

}
