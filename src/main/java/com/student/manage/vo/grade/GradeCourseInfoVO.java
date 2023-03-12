package com.student.manage.vo.grade;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 18:25
 */
@ApiModel(value = "GradeCourseInfoVO", description = "成绩-课程多选下拉框返回")
public class GradeCourseInfoVO {

    @ApiModelProperty(value = "课程id", example = "1")
    private Integer courseId;

    @ApiModelProperty(value = "课程名", example = "数据结构")
    private String courseName;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
