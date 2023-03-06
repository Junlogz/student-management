package com.student.manage.params.teacher;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 12:00
 */
@ApiModel(value = "GetTeacherInfoByIdParams", description = "教师id查询入参")
public class GetTeacherInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
