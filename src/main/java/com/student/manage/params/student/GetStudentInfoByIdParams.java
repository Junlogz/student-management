package com.student.manage.params.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 12:00
 */
@ApiModel(value = "GetStudentInfoByIdParams", description = "学生id查询入参")
public class GetStudentInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
