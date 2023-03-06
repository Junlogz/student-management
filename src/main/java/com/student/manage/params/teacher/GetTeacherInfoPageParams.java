package com.student.manage.params.teacher;

import com.student.manage.params.BasePageParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:39
 */
@ApiModel(value = "GetStudentInfoPageParams", description = "学生分页查询入参")
public class GetTeacherInfoPageParams extends BasePageParams {

    @ApiModelProperty(value = "姓名", example = "张老师")
    private String name;

    @ApiModelProperty(value = "教师号", example = "2019106040342")
    private String teacherNumber;

    @ApiModelProperty(value = "部门", example = "财务部门")
    private String depart;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
