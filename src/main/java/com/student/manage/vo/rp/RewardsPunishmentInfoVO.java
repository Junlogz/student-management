package com.student.manage.vo.rp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 19:08
 */
@ApiModel(value = "RewardsPunishmentInfoVO", description = "学生奖惩信息返回")
public class RewardsPunishmentInfoVO {

    @ApiModelProperty(value = "id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "学生姓名", example = "张三")
    private String name;

    @ApiModelProperty(value = "studentId", example = "1")
    private Integer studentId;

    @ApiModelProperty(value = "奖惩", example = "旷课惩罚")
    private String rewardsPunishment;

    @ApiModelProperty(value = "奖惩说明", example = "因旷课超过30节课惩罚")
    private String intro;

    @ApiModelProperty(value = "日期", example = "2023-03-03")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
