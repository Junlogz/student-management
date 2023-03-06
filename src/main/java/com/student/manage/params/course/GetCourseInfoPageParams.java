package com.student.manage.params.course;

import com.student.manage.params.BasePageParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:39
 */
@ApiModel(value = "GetCourseInfoPageParams", description = "课程分页查询入参")
public class GetCourseInfoPageParams extends BasePageParams {

    @ApiModelProperty(value = "教师号", example = "2019106040342")
    private String courseName;

    @ApiModelProperty(value = "教师号", example = "2019106040342")
    private String courseNumber;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
}
