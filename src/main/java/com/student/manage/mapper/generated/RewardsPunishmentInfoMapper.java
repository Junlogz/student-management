package com.student.manage.mapper.generated;

import com.student.manage.po.generated.RewardsPunishmentInfo;
import com.student.manage.po.generated.RewardsPunishmentInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RewardsPunishmentInfoMapper {
    long countByExample(RewardsPunishmentInfoExample example);

    int deleteByExample(RewardsPunishmentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RewardsPunishmentInfo record);

    int insertSelective(RewardsPunishmentInfo record);

    List<RewardsPunishmentInfo> selectByExample(RewardsPunishmentInfoExample example);

    RewardsPunishmentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RewardsPunishmentInfo record, @Param("example") RewardsPunishmentInfoExample example);

    int updateByExample(@Param("record") RewardsPunishmentInfo record, @Param("example") RewardsPunishmentInfoExample example);

    int updateByPrimaryKeySelective(RewardsPunishmentInfo record);

    int updateByPrimaryKey(RewardsPunishmentInfo record);
}