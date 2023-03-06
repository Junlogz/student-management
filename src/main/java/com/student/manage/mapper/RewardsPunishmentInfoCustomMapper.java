package com.student.manage.mapper;

import com.student.manage.params.rp.GetRewardsPunishmentByIdParams;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;

import java.util.List;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 23:29
 */
public interface RewardsPunishmentInfoCustomMapper {

    List<RewardsPunishmentInfoVO> getRewardsPunishmentInfoById(GetRewardsPunishmentByIdParams params);

}
