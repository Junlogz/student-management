package com.student.manage.params.student;

import com.student.manage.params.BasePageParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:39
 */
@ApiModel(value = "GetStudentInfoPageParams", description = "学生分页查询入参")
public class GetStudentInfoPageParams extends BasePageParams {

    @ApiModelProperty(value = "姓名", example = "张三")
    private String name;

    @ApiModelProperty(value = "学号", example = "2019106040342")
    private String studentNumber;

    @ApiModelProperty(value = "专业", example = "服装设计")
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
}
