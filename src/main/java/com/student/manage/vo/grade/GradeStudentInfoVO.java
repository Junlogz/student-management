package com.student.manage.vo.grade;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 19:55
 */
@ApiModel(value = "GradeStudentInfoVO", description = "成绩-学生下拉框返回")
public class GradeStudentInfoVO {

    @ApiModelProperty(value = "学生id", example = "1")
    private Integer studentId;

    @ApiModelProperty(value = "学生名", example = "zhangsan")
    private String studentName;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
