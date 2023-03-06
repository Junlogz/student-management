package com.student.manage.params.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:29
 */
@ApiModel(value = "GetAdminInfoByIdParams", description = "管理员id查询入参")
public class GetAdminInfoByIdParams {

    @ApiModelProperty(value = "id", example = "1", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
