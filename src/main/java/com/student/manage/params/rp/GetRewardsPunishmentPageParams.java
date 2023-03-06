package com.student.manage.params.rp;

import com.student.manage.params.BasePageParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/6 21:48
 */
@ApiModel(value = "GetRewardsPunishmentPageParams", description = "奖惩信息分页查询入参")
public class GetRewardsPunishmentPageParams extends BasePageParams {

    @ApiModelProperty(value = "学生名", example = "张三")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
