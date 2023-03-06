package com.student.manage.manage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.manage.exception.BusinessException;
import com.student.manage.mapper.RewardsPunishmentInfoCustomMapper;
import com.student.manage.params.rp.GetRewardsPunishmentByIdParams;
import com.student.manage.params.rp.GetRewardsPunishmentPageParams;
import com.student.manage.util.ResponseCode;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

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
        if (!ObjectUtils.isEmpty(rewardsPunishmentInfoById)) {
            RewardsPunishmentInfoVO rewardsPunishmentInfoVO = new RewardsPunishmentInfoVO();
            BeanUtils.copyProperties(rewardsPunishmentInfoById, rewardsPunishmentInfoVO);
            return rewardsPunishmentInfoVO;
        } else {
            throw new BusinessException(ResponseCode.FAIL_CODE, "查询失败，没有该学生奖惩信息");
        }

    }

    public PageInfo<RewardsPunishmentInfoVO> getRewardsPunishmentInfoPage(GetRewardsPunishmentPageParams params) {

        GetRewardsPunishmentPageParams getRewardsPunishmentPageParams = new GetRewardsPunishmentPageParams();
        getRewardsPunishmentPageParams.setName(params.getName());

        return PageHelper.startPage(params)
                .doSelectPageInfo(
                        () -> customMapper.listRewardsPunishmentInfoPage(getRewardsPunishmentPageParams));

    }
}
