package com.student.manage.params.rp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/6 21:48
 */
@ApiModel(value = "UpdateRewardsPunishmentParams", description = "奖惩信息修改入参")
public class UpdateRewardsPunishmentParams {

    @ApiModelProperty(value = "id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "奖惩", example = "旷课惩罚")
    private String rewardsPunishment;

    @ApiModelProperty(value = "奖惩说明", example = "因旷课超过30节课惩罚")
    private String intro;

    @DateTimeFormat(pattern="yyyy-MM-ddHH:mm:ss")
    @ApiModelProperty(value = "日期", example = "2023-03-06 08:40:50")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRewardsPunishment() {
        return rewardsPunishment;
    }

    public void setRewardsPunishment(String rewardsPunishment) {
        this.rewardsPunishment = rewardsPunishment;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
