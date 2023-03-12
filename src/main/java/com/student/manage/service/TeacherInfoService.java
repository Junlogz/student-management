package com.student.manage.service;

import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.StudentInfoManage;
import com.student.manage.manage.TeacherInfoManage;
import com.student.manage.mapper.generated.StudentInfoMapper;
import com.student.manage.mapper.generated.TeacherInfoMapper;
import com.student.manage.params.student.*;
import com.student.manage.params.teacher.*;
import com.student.manage.po.generated.StudentInfo;
import com.student.manage.po.generated.StudentInfoExample;
import com.student.manage.po.generated.TeacherInfo;
import com.student.manage.po.generated.TeacherInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.LoginInfoVO;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.student.GetStudentInfoPageVO;
import com.student.manage.vo.student.StudentInfoVO;
import com.student.manage.vo.teacher.GetTeacherInfoPageVO;
import com.student.manage.vo.teacher.TeacherInfoVO;
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
public class TeacherInfoService {

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    @Autowired
    private TeacherInfoManage teacherInfoManage;

    public ResponseEntity<PageInfoVO<GetTeacherInfoPageVO>> getTeacherInfoPage(GetTeacherInfoPageParams params) {

        PageInfo<GetTeacherInfoPageVO> pageInfo = teacherInfoManage.listTeacherInfoPage(params);

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList()));
    }

    public ResponseEntity addTeacherInfo(AddTeacherInfoParams params) {
        try {
            TeacherInfo teacherInfo = new TeacherInfo();
            BeanUtils.copyProperties(params, teacherInfo);
            teacherInfoMapper.insertSelective(teacherInfo);
        } catch (DuplicateKeyException e){
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "The Information Already Exists");
        }
        return ResponseEntity.ok();
    }

    public ResponseEntity<LoginInfoVO> loginTeacherInfo(LoginTeacherInfoParams params) {
        TeacherInfoExample example = new TeacherInfoExample();
        example.createCriteria()
                .andTeacherNumberEqualTo(params.getTeacherNumber())
                .andPasswordEqualTo(params.getPassword());

        List<TeacherInfo> teacherInfos = teacherInfoMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(teacherInfos)) {
            LoginInfoVO loginInfoVO = new LoginInfoVO();
            loginInfoVO.setId(teacherInfos.get(0).getId());
            loginInfoVO.setName(teacherInfos.get(0).getName());
            return ResponseEntity.ok(loginInfoVO);
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "账号或密码错误");
        }
    }

    public ResponseEntity updateTeacherInfo(UpdateTeacherInfoParams params) {
        TeacherInfoExample example = new TeacherInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());

        TeacherInfo teacherInfo = new TeacherInfo();
        BeanUtils.copyProperties(params,teacherInfo);
        teacherInfoMapper.updateByExampleSelective(teacherInfo, example);
        return ResponseEntity.ok();
    }


    public ResponseEntity deleteTeacherInfoById(DeleteTeacherInfoByIdParams params) {
        TeacherInfoExample example = new TeacherInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());
        int result = teacherInfoMapper.deleteByExample(example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "删除失败(不存在该id)");
        }
    }

    public ResponseEntity<TeacherInfoVO> getTeacherInfoById(GetTeacherInfoByIdParams params) {
        TeacherInfo studentInfo = teacherInfoMapper.selectByPrimaryKey(params.getId());
        TeacherInfoVO teacherInfoVO = new TeacherInfoVO();
        BeanUtils.copyProperties(studentInfo, teacherInfoVO);
        return ResponseEntity.ok(teacherInfoVO);
    }

}
