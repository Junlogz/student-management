package com.student.manage.params.grade;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 17:56
 */
@ApiModel(value = "DeleteGradeInfoByIdParams", description = "成绩信息删除入参")
public class DeleteGradeInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
