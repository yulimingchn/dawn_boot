package com.dawn.apple.boot.web.param;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * 用户创建的参数对象
 *
 * @author yuliming
 * @create 2017-11-27 15:15
 */
@Data
public class UserCreateParam {
    @NotEmpty(message = "用户名不能为空")
    private String name;

    private Integer sex;

    @NotNull(message = "年龄不能为空")
    private Integer age;
}
