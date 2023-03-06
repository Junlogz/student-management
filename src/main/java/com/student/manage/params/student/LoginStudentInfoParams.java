package com.student.manage.params.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "LoginAdminInfoParams", description = "管理员登录入参")
public class LoginStudentInfoParams {

    @ApiModelProperty(value = "学号", example = "2019106040334", required = true)
    @NotEmpty(message = "学号不能为空")
    private String studentNumber;

    @ApiModelProperty(value = "password", example = "zhangSan", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
