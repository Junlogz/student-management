package com.student.manage.mapper;

import com.student.manage.params.rp.GetRewardsPunishmentByIdParams;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import org.springframework.stereotype.Repository;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 23:29
 */
@Repository
public interface RewardsPunishmentInfoCustomMapper {

    RewardsPunishmentInfoVO getRewardsPunishmentInfoById(GetRewardsPunishmentByIdParams params);

}
