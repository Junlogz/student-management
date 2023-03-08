package com.student.manage.mapper.generated;

import com.student.manage.po.generated.StudentInfo;
import com.student.manage.po.generated.StudentInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoMapper {
    long countByExample(StudentInfoExample example);

    int deleteByExample(StudentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    List<StudentInfo> selectByExample(StudentInfoExample example);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}