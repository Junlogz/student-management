package com.student.manage.params.course;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 0:19
 */
@ApiModel(value = "UpdateCourseInfoParams", description = "课程修改信息入参")
public class UpdateCourseInfoParams {

    @ApiModelProperty(value = "id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "课程名", example = "数据结构")
    private String courseName;

    @ApiModelProperty(value = "简介", example = "计算机狗都不学")
    private String intro;

    @ApiModelProperty(value = "类型 0-必修 1-选修", example = "0")
    private Byte type;

    @ApiModelProperty(value = "学院", example = "智能制造")
    private String college;

    @ApiModelProperty(value = "专业", example = "计算机科学与技术")
    private String major;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
