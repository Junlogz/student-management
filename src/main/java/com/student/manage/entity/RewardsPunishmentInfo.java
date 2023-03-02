package com.student.manage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2023-03-02
 */
@Getter
@Setter
@TableName("rewards_punishment_info")
@ApiModel(value = "RewardsPunishmentInfo对象", description = "")
public class RewardsPunishmentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("student_id")
    private Integer studentId;

    @TableField("rewards_punishment")
    private String rewardsPunishment;

    @TableField("intro")
    private String intro;

    @TableField("date")
    private Date date;


}
