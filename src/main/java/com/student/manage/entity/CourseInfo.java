package com.student.manage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("course_info")
@ApiModel(value = "CourseInfo对象", description = "")
public class CourseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("course_number")
    private Integer courseNumber;

    @TableField("course_name")
    private String courseName;

    @TableField("intro")
    private String intro;

    @TableField("type")
    private Integer type;

    @TableField("college")
    private String college;

    @TableField("major")
    private String major;


}
