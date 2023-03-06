package com.student.manage.service;

import com.student.manage.entity.ResponseEntity;
import com.student.manage.params.rp.GetRewardsPunishmentByIdParams;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 19:07
 */
@Service
public class RewardsPunishmentInfoService {

    @Autowired

    public ResponseEntity<RewardsPunishmentInfoVO> getRewardsPunishmentInfoById(GetRewardsPunishmentByIdParams params) {

    }

}
