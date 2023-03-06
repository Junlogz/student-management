package com.student.manage.service;

import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.RewardsPunishmentInfoManage;
import com.student.manage.mapper.RewardsPunishmentInfoCustomMapper;
import com.student.manage.params.rp.GetRewardsPunishmentByIdParams;
import com.student.manage.util.ResponseCode;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 19:07
 */
@Service
public class RewardsPunishmentInfoService {

    @Autowired
    private RewardsPunishmentInfoCustomMapper customMapper;

    @Autowired
    private RewardsPunishmentInfoManage rewardsPunishmentInfoManage;

    public ResponseEntity<RewardsPunishmentInfoVO> getRewardsPunishmentInfoById(GetRewardsPunishmentByIdParams params) {
        RewardsPunishmentInfoVO rewardsPunishmentInfoById = rewardsPunishmentInfoManage.getRewardsPunishmentInfoById(params);
        if (!ObjectUtils.isEmpty(rewardsPunishmentInfoById)) {
            return ResponseEntity.ok(rewardsPunishmentInfoById);
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "查询失败，没有该学生奖惩信息");
        }
    }

}
