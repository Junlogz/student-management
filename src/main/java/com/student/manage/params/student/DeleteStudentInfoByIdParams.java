package com.student.manage.params.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 11:52
 */
@ApiModel(value = "DeleteStudentInfoByIdParams", description = "学生信息删除入参")
public class DeleteStudentInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
