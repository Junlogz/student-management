package com.student.manage.mapper.generated;

import com.student.manage.po.generated.TeacherInfo;
import com.student.manage.po.generated.TeacherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherInfoMapper {
    long countByExample(TeacherInfoExample example);

    int deleteByExample(TeacherInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    List<TeacherInfo> selectByExample(TeacherInfoExample example);

    TeacherInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    int updateByExample(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);
}