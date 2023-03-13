package com.student.manage.params.grade;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/13 21:57
 */
public class AddGradeInfoParams {

    @ApiModelProperty(value = "学生id", example = "1")
    private Integer studentId;

    @ApiModelProperty(value = "教师id", example = "1")
    private Integer teacherId;

    @ApiModelProperty(value = "课程id", example = "1")
    private Integer courseId;

    @ApiModelProperty(value = "成绩/分数", example = "1")
    private Integer score;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
