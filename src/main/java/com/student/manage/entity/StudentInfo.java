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
@TableName("student_info")
@ApiModel(value = "StudentInfo对象", description = "")
public class StudentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("student_number")
    private String studentNumber;

    @TableField("sex")
    private Integer sex;

    @TableField("major")
    private String major;

    @TableField("college")
    private String college;

    @TableField("age")
    private Integer age;

    @TableField("password")
    private String password;


}
