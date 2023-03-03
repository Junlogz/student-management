package com.student.manage.service;

import com.student.manage.entity.ResponseEntity;
import com.student.manage.mapper.generated.AdminInfoMapper;
import com.student.manage.params.AddAdminInfoParams;
import com.student.manage.params.LoginAdminInfoParams;
import com.student.manage.po.generated.AdminInfo;
import com.student.manage.util.UserResponseCodes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
public class AdminInfoService {

    @Autowired
    private AdminInfoMapper adminInfoMapper;

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
        try {
            AdminInfo adminInfo = new AdminInfo();
            BeanUtils.copyProperties(params, adminInfo);
            adminInfoMapper.insertSelective(adminInfo);
        } catch (DuplicateKeyException e){
            return ResponseEntity.error(UserResponseCodes.FAIL_CODE, "The Information Already Exists");
        }
        return ResponseEntity.ok();
    }

}
