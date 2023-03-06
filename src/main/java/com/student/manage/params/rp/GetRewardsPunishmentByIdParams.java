package com.student.manage.params.rp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 18:50
 */
@ApiModel(value = "GetRewardsPunishmentByIdParams", description = "奖惩学生id查询入参")
public class GetRewardsPunishmentByIdParams {

    @ApiModelProperty(value = "学生id-学生主键id", example = "1", required = true)
    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
