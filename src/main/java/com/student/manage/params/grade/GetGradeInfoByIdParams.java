package com.student.manage.params.grade;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 16:29
 */
@ApiModel(value = "GetGradeInfoByIdParams", description = "学生id查询入参")
public class GetGradeInfoByIdParams {

    @ApiModelProperty(value = "studentId", example = "1", required = true)
    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
