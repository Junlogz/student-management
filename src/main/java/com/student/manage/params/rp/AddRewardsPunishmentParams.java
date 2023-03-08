package com.student.manage.params.rp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel(value = "AddRewardsPunishmentParams", description = "奖惩信息添加入参")
public class AddRewardsPunishmentParams {

    @ApiModelProperty(value = "学生名", example = "张三")
    private String name;

    @ApiModelProperty(value = "奖惩", example = "旷课惩罚")
    private String rewardsPunishment;

    @ApiModelProperty(value = "奖惩说明", example = "因旷课超过30节课惩罚")
    private String intro;

    @JsonFormat(pattern="yyyy-MM-ddHH:mm:ss")
    @ApiModelProperty(value = "日期", example = "2023-03-06 08:40:50")
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
