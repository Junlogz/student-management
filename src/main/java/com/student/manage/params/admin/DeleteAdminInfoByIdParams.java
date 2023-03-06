package com.student.manage.params.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "DeleteAdminInfoByIdParams", description = "管理员信息删除入参")
public class DeleteAdminInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
