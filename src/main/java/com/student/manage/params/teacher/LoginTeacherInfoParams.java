package com.student.manage.params.teacher;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "LoginTeacherInfoParams", description = "教师登录入参")
public class LoginTeacherInfoParams {

    @ApiModelProperty(value = "教师号", example = "20210506227", required = true)
    @NotEmpty(message = "学号不能为空")
    private String teacherNumber;

    @ApiModelProperty(value = "password", example = "zhangSan", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
