package com.student.manage.params.teacher;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UpdateTeacherInfoParams", description = "教师修改信息入参")
public class UpdateTeacherInfoParams {

    private Integer id;

    @ApiModelProperty(value = "姓名", example = "张三", required = true)
    private String name;

    @ApiModelProperty(value = "性别", example = "1", required = true)
    private Byte sex;

    @ApiModelProperty(value = "年龄", example = "12", required = true)
    private Integer age;

    @ApiModelProperty(value = "密码", example = "123", required = true)
    private String password;

    @ApiModelProperty(value = "职称", example = "教授")
    private String prof;

    @ApiModelProperty(value = "部门", example = "教务部门")
    private String depart;

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

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
