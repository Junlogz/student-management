package com.student.manage.params.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "AddStudentInfoParams", description = "添加学生信息入参")
public class AddStudentInfoParams {

    @ApiModelProperty(value = "姓名", example = "张三", required = true)
    @NotEmpty
    private String name;

    @ApiModelProperty(value = "学号", example = "2019106040335", required = true)
    @NotEmpty
    private String studentNumber;

    @ApiModelProperty(value = "性别", example = "1", required = true)
    private Byte sex;

    @ApiModelProperty(value = "专业", example = "服装设计", required = true)
    @NotEmpty
    private String major;

    @ApiModelProperty(value = "学院", example = "智能制造", required = true)
    @NotEmpty
    private String college;

    @ApiModelProperty(value = "年龄", example = "12", required = true)
    private Integer age;

    @ApiModelProperty(value = "密码", example = "123", required = true)
    @NotEmpty
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
