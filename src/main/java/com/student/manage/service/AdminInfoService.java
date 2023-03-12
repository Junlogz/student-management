package com.student.manage.service;

import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.AdminInfoManage;
import com.student.manage.mapper.generated.AdminInfoMapper;
import com.student.manage.params.admin.*;
import com.student.manage.params.teacher.UpdateTeacherInfoParams;
import com.student.manage.po.generated.AdminInfo;
import com.student.manage.po.generated.AdminInfoExample;
import com.student.manage.po.generated.TeacherInfo;
import com.student.manage.po.generated.TeacherInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.LoginInfoVO;
import com.student.manage.vo.admin.AdminInfoVO;
import com.student.manage.vo.admin.GetAdminInfoPageVO;
import com.student.manage.vo.admin.PageInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class AdminInfoService {

    @Autowired
    private AdminInfoMapper adminInfoMapper;

    @Autowired
    private AdminInfoManage adminInfoManage;

    public ResponseEntity<PageInfoVO<GetAdminInfoPageVO>> getAdminInfoPage(GetAdminInfoPageParams params) {

        PageInfo<GetAdminInfoPageVO> pageInfo = adminInfoManage.listAdminInfoPage(params);

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList()));
    }

    public ResponseEntity addAdminInfo(AddAdminInfoParams params) {
        try {
            AdminInfo adminInfo = new AdminInfo();
            BeanUtils.copyProperties(params, adminInfo);
            adminInfoMapper.insertSelective(adminInfo);
        } catch (DuplicateKeyException e){
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "The Information Already Exists");
        }
        return ResponseEntity.ok();
    }

    public ResponseEntity<LoginInfoVO> loginAdminInfo(LoginAdminInfoParams params) {
        AdminInfoExample example = new AdminInfoExample();
        example.createCriteria()
                .andUsernameEqualTo(params.getUsername())
                .andPasswordEqualTo(params.getPassword());
        List<AdminInfo> adminInfos = adminInfoMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(adminInfos)) {
            LoginInfoVO loginInfoVO = new LoginInfoVO();
            loginInfoVO.setId(adminInfos.get(0).getId());
            loginInfoVO.setName(adminInfos.get(0).getName());
            return ResponseEntity.ok(loginInfoVO);
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "账号或密码错误");
        }
    }

    public ResponseEntity deleteAdminInfoById(DeleteAdminInfoByIdParams params) {
        AdminInfoExample example = new AdminInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());
        int result = adminInfoMapper.deleteByExample(example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "删除失败(不存在该id)");
        }
    }

    public ResponseEntity<AdminInfoVO> getAdminInfoById(GetAdminInfoByIdParams params) {
        AdminInfo adminInfo = adminInfoMapper.selectByPrimaryKey(params.getId());
        AdminInfoVO adminInfoVO = new AdminInfoVO();
        BeanUtils.copyProperties(adminInfo, adminInfoVO);
        return ResponseEntity.ok(adminInfoVO);
    }

    public ResponseEntity updateAdminInfo(UpdateAdminInfoParams params) {
        AdminInfoExample example = new AdminInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());

        AdminInfo adminInfo = new AdminInfo();
        BeanUtils.copyProperties(params,adminInfo);
        adminInfoMapper.updateByExampleSelective(adminInfo, example);
        return ResponseEntity.ok();
    }

}
