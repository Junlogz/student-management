package com.student.manage.service;

import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.RewardsPunishmentInfoManage;
import com.student.manage.mapper.RewardsPunishmentInfoCustomMapper;
import com.student.manage.mapper.generated.RewardsPunishmentInfoMapper;
import com.student.manage.mapper.generated.StudentInfoMapper;
import com.student.manage.params.rp.*;
import com.student.manage.po.generated.RewardsPunishmentInfo;
import com.student.manage.po.generated.RewardsPunishmentInfoExample;
import com.student.manage.po.generated.StudentInfo;
import com.student.manage.po.generated.StudentInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

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
    private RewardsPunishmentInfoMapper mapper;

    @Autowired
    private StudentInfoMapper studentInfoMapper;

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

    public ResponseEntity<PageInfoVO<RewardsPunishmentInfoVO>> getRewardsPunishmentInfoPage(GetRewardsPunishmentPageParams params) {

        PageInfo<RewardsPunishmentInfoVO> pageInfo = rewardsPunishmentInfoManage.getRewardsPunishmentInfoPage(params);

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList()));
    }

    public ResponseEntity updateRewardsPunishmentInfo(UpdateRewardsPunishmentParams params) {
        RewardsPunishmentInfo rewardsPunishmentInfo = new RewardsPunishmentInfo();
        rewardsPunishmentInfo.setRewardsPunishment(params.getRewardsPunishment());
        rewardsPunishmentInfo.setIntro(params.getIntro());
        rewardsPunishmentInfo.setDate(params.getDate());

        RewardsPunishmentInfoExample example = new RewardsPunishmentInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());

        int result = mapper.updateByExampleSelective(rewardsPunishmentInfo, example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "修改失败(不存在该id或其他问题)");
        }
    }

    public ResponseEntity deleteRewardsPunishmentInfo(DeleteRewardsPunishmentParams params) {
        int result = mapper.deleteByPrimaryKey(params.getId());
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "删除失败(不存在该id或其他问题)");
        }
    }

    public ResponseEntity addRewardsPunishmentInfo(AddRewardsPunishmentParams params) {
        StudentInfoExample studentInfoExample = new StudentInfoExample();
        studentInfoExample.createCriteria().andNameEqualTo(params.getName());
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(studentInfoExample);
        if (!CollectionUtils.isEmpty(studentInfos)) {
            RewardsPunishmentInfo rewardsPunishmentInfo = new RewardsPunishmentInfo();
            rewardsPunishmentInfo.setStudentId(studentInfos.get(0).getId());
            rewardsPunishmentInfo.setRewardsPunishment(params.getRewardsPunishment());
            rewardsPunishmentInfo.setIntro(params.getIntro());
            rewardsPunishmentInfo.setDate(params.getDate());
            mapper.insertSelective(rewardsPunishmentInfo);
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "没有该学生，无法添加奖惩信息");
        }
    }

}
