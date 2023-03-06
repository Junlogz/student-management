package com.student.manage.service;

import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.StudentInfoManage;
import com.student.manage.mapper.generated.StudentInfoMapper;
import com.student.manage.params.student.*;
import com.student.manage.po.generated.AdminInfo;
import com.student.manage.po.generated.StudentInfo;
import com.student.manage.po.generated.StudentInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.LoginInfoVO;
import com.student.manage.vo.admin.AdminInfoVO;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.student.GetStudentInfoPageVO;
import com.student.manage.vo.student.StudentInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:59
 */
@Service
public class StudentInfoService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Autowired
    private StudentInfoManage studentInfoManage;

    public ResponseEntity<PageInfoVO<GetStudentInfoPageVO>> getAdminInfoPage(GetStudentInfoPageParams params) {

        PageInfo<GetStudentInfoPageVO> pageInfo = studentInfoManage.listStudentInfoPage(params);

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList()));
    }

    public ResponseEntity addStudentInfo(AddStudentInfoParams params) {
        try {
            StudentInfo studentInfo = new StudentInfo();
            BeanUtils.copyProperties(params, studentInfo);
            studentInfoMapper.insertSelective(studentInfo);
        } catch (DuplicateKeyException e){
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "The Information Already Exists");
        }
        return ResponseEntity.ok();
    }

    public ResponseEntity<LoginInfoVO> loginStudentInfo(LoginStudentInfoParams params) {
        StudentInfoExample example = new StudentInfoExample();
        example.createCriteria()
                .andStudentNumberEqualTo(params.getStudentNumber())
                .andPasswordEqualTo(params.getPassword());


        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(studentInfos)) {
            LoginInfoVO loginInfoVO = new LoginInfoVO();
            loginInfoVO.setId(studentInfos.get(0).getId());
            loginInfoVO.setName(studentInfos.get(0).getName());
            return ResponseEntity.ok(loginInfoVO);
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "账号或密码错误");
        }
    }

    public ResponseEntity deleteStudentInfoById(DeleteStudentInfoByIdParams params) {
        StudentInfoExample example = new StudentInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());
        int result = studentInfoMapper.deleteByExample(example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "删除失败(不存在该id)");
        }
    }

    public ResponseEntity<StudentInfoVO> getStudentInfoById(GetStudentInfoByIdParams params) {
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(params.getId());
        StudentInfoVO studentInfoVO = new StudentInfoVO();
        BeanUtils.copyProperties(studentInfo, studentInfoVO);
        return ResponseEntity.ok(studentInfoVO);
    }

}
