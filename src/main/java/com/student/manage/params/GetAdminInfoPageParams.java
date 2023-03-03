package com.student.manage.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "GetAdminInfoPageParams", description = "管理员分页查询入参")
public class GetAdminInfoPageParams extends BasePageParams{

    @ApiModelProperty(value = "姓名", example = "张三")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
