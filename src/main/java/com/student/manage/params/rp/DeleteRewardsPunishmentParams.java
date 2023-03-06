package com.student.manage.params.rp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/6 22:29
 */
@ApiModel(value = "DeleteRewardsPunishmentParams", description = "奖惩信息删除入参")
public class DeleteRewardsPunishmentParams {

    @ApiModelProperty(value = "id", example = "1")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
