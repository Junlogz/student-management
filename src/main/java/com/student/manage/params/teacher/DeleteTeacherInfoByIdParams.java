package com.student.manage.params.teacher;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 14:24
 */
@ApiModel(value = "DeleteTeacherInfoByIdParams", description = "教师信息删除入参")
public class DeleteTeacherInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
