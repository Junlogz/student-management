package com.student.manage.params.course;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 11:52
 */
@ApiModel(value = "DeleteCourseInfoByIdParams", description = "课程信息删除入参")
public class DeleteCourseInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
