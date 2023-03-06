package com.student.manage.manage;

import com.student.manage.mapper.RewardsPunishmentInfoCustomMapper;
import com.student.manage.params.rp.GetRewardsPunishmentByIdParams;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 23:20
 */
@Service
public class RewardsPunishmentInfoManage {

    @Autowired
    private RewardsPunishmentInfoCustomMapper customMapper;

    public RewardsPunishmentInfoVO getRewardsPunishmentInfoById(GetRewardsPunishmentByIdParams params) {
        RewardsPunishmentInfoVO rewardsPunishmentInfoById = customMapper.getRewardsPunishmentInfoById(params);
        RewardsPunishmentInfoVO rewardsPunishmentInfoVO = new RewardsPunishmentInfoVO();
        BeanUtils.copyProperties(rewardsPunishmentInfoById, rewardsPunishmentInfoVO);
        return rewardsPunishmentInfoVO;
    }

}
