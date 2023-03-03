package com.student.manage.mapper.generated;

import com.student.manage.po.generated.GradeInfo;
import com.student.manage.po.generated.GradeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeInfoMapper {
    long countByExample(GradeInfoExample example);

    int deleteByExample(GradeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GradeInfo record);

    int insertSelective(GradeInfo record);

    List<GradeInfo> selectByExample(GradeInfoExample example);

    GradeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByExample(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByPrimaryKeySelective(GradeInfo record);

    int updateByPrimaryKey(GradeInfo record);
}