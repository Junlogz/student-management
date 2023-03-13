package com.student.manage.vo.grade;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/13 21:27
 */
@ApiModel(value = "GradeTeacherInfoVO", description = "成绩-教师下拉框返回")
public class GradeTeacherInfoVO {

    @ApiModelProperty(value = "教师id", example = "1")
    private Integer teacherId;

    @ApiModelProperty(value = "教师名", example = "张老师")
    private String teacherName;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
