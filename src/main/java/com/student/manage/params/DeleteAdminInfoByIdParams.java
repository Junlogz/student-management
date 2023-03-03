package com.student.manage.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

@ApiModel(value = "DeleteAdminInfoByIdParams", description = "管理员信息删除入参")
public class DeleteAdminInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    @NotEmpty(message = "id不能为空")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
