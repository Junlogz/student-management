package com.student.manage.params.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "AddAdminInfoParams", description = "添加管理员信息入参")
public class AddAdminInfoParams {

    @ApiModelProperty(value = "姓名", example = "张三", required = true)
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @ApiModelProperty(value = "username", example = "liSi", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "password", example = "zhangSan", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
