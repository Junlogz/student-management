package com.student.manage.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.mapper.AdminInfoCustomMapper;
import com.student.manage.mapper.generated.AdminInfoMapper;
import com.student.manage.params.AddAdminInfoParams;
import com.student.manage.params.DeleteAdminInfoByIdParams;
import com.student.manage.params.GetAdminInfoPageParams;
import com.student.manage.params.LoginAdminInfoParams;
import com.student.manage.po.generated.AdminInfo;
import com.student.manage.po.generated.AdminInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.util.UserResponseCodes;
import com.student.manage.vo.GetAdminInfoPageVO;
import com.student.manage.vo.PageInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AdminInfoService {

    @Autowired
    private AdminInfoMapper adminInfoMapper;

    @Autowired
    private AdminInfoCustomMapper adminInfoCustomMapper;

    public ResponseEntity<PageInfoVO<GetAdminInfoPageVO>> getAdminInfoPage(GetAdminInfoPageParams params) {

        GetAdminInfoPageParams getAdminInfoPageParams =new GetAdminInfoPageParams();
        getAdminInfoPageParams.setName(params.getName());

        PageInfo<AdminInfo> pageInfo = PageHelper.startPage(params)
                .doSelectPageInfo(
                        () -> adminInfoCustomMapper.listAdminInfoPage(getAdminInfoPageParams));

        List<GetAdminInfoPageVO> pageVOList = new ArrayList<>();
        for (AdminInfo adminInfo : pageInfo.getList()) {
            GetAdminInfoPageVO pageVO = new GetAdminInfoPageVO();
            BeanUtils.copyProperties(adminInfo, pageVO);
            pageVOList.add(pageVO);
        }

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageVOList));
    }



    public ResponseEntity addAdminInfo(AddAdminInfoParams params) {
        try {
            AdminInfo adminInfo = new AdminInfo();
            BeanUtils.copyProperties(params, adminInfo);
            adminInfoMapper.insertSelective(adminInfo);
        } catch (DuplicateKeyException e){
            return ResponseEntity.error(UserResponseCodes.FAIL_CODE, "The Information Already Exists");
        }
        return ResponseEntity.ok();
    }

    public ResponseEntity loginAdminInfo(LoginAdminInfoParams params) {
        AdminInfoExample example = new AdminInfoExample();
        example.createCriteria()
                .andUsernameEqualTo(params.getUsername())
                .andPasswordEqualTo(params.getPassword());
        List<AdminInfo> adminInfos = adminInfoMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(adminInfos)) {
            return ResponseEntity.ok(ResponseMessages.LOGIN_SUCCESS_MSG);
        } else {
            return ResponseEntity.error(UserResponseCodes.FAIL_CODE, "账号或密码错误");
        }
    }

    public ResponseEntity deleteAdminInfoById(DeleteAdminInfoByIdParams params) {
        AdminInfoExample example = new AdminInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());
        int result = adminInfoMapper.deleteByExample(example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(UserResponseCodes.FAIL_CODE, "删除失败(不存在该id)");
        }
    }

}
