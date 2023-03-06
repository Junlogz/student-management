package com.student.manage.vo.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:52
 */
@ApiModel(value = "GetStudentInfoPageVO", description = "学生分页信息返回")
public class GetStudentInfoPageVO {

    @ApiModelProperty(value = "id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "姓名", example = "张三")
    private String name;

    @ApiModelProperty(value = "学号", example = "2019106040342")
    private String studentNumber;

    @ApiModelProperty(value = "专业", example = "服装设计")
    private String major;

    @ApiModelProperty(value = "性别 0-男 1-女", example = "1")
    private Byte sex;

    @ApiModelProperty(value = "学院", example = "智能制造学院")
    private String college;

    @ApiModelProperty(value = "年龄", example = "18")
    private Integer age;

    @ApiModelProperty(value = "密码", example = "123456")
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

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
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
