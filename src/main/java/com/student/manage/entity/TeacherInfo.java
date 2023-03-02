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
@TableName("teacher_info")
@ApiModel(value = "TeacherInfo对象", description = "")
public class TeacherInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("teacher_number")
    private String teacherNumber;

    @TableField("name")
    private String name;

    @TableField("sex")
    private Integer sex;

    @TableField("age")
    private Integer age;

    @TableField("password")
    private String password;

    @TableField("prof")
    private String prof;

    @TableField("depart")
    private String depart;


}
