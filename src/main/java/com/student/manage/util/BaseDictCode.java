package com.student.manage.util;

/**
 * 所有数据字典的基类
 * @author wujunwei
 */
public interface BaseDictCode {

  /**
   * 字典值，实际存储在数据库的值
   * @return Integer 数字
   */
  Integer getType();

  /**
   * 字典描述信息，前端页面展示的值
   * @return String 字符串
   */
  String getName();
}
