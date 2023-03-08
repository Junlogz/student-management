package com.student.manage.params.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UpdateStudentInfoParams", description = "学生修改信息入参")
public class UpdateStudentInfoParams {

    private Integer id;

    @ApiModelProperty(value = "姓名", example = "张三", required = true)
    private String name;

    @ApiModelProperty(value = "性别", example = "1", required = true)
    private Byte sex;

    @ApiModelProperty(value = "专业", example = "服装设计", required = true)
    private String major;

    @ApiModelProperty(value = "学院", example = "智能制造", required = true)
    private String college;

    @ApiModelProperty(value = "年龄", example = "12", required = true)
    private Integer age;

    @ApiModelProperty(value = "密码", example = "123", required = true)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
