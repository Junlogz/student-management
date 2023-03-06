package com.student.manage.vo.course;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:52
 */
@ApiModel(value = "GetCourseInfoPageVO", description = "课程分页信息返回")
public class GetCourseInfoPageVO {

    @ApiModelProperty(value = "id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "课程号", example = "1001")
    private String courseNumber;

    @ApiModelProperty(value = "课程名", example = "张三")
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

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
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
