package com.student.manage.params.course;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "AddCourseInfoParams", description = "添加课程信息入参")
public class AddCourseInfoParams {

    @ApiModelProperty(value = "课程号", example = "1001")
    private Integer courseNumber;

    @ApiModelProperty(value = "课程名", example = "数据结构")
    @NotEmpty
    private String courseName;

    @NotEmpty
    @ApiModelProperty(value = "课程介绍", example = "数据结构")
    private String intro;

    @ApiModelProperty(value = "课程类型", example = "0")
    private Byte type;

    @ApiModelProperty(value = "学院", example = "会计学院")
    @NotEmpty
    private String college;

    @ApiModelProperty(value = "专业", example = "会计")
    @NotEmpty
    private String major;

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
