package com.student.manage.params.grade;

import com.student.manage.params.BasePageParams;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 17:33
 */
public class GetGradeInfoPageParams extends BasePageParams {

    @ApiModelProperty(value = "学生姓名", example = "张三")
    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
