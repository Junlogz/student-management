package com.student.manage.service;

import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.GradeInfoManage;
import com.student.manage.mapper.CourseInfoCustomMapper;
import com.student.manage.mapper.GradeInfoCustomMapper;
import com.student.manage.mapper.StudentInfoCustomMapper;
import com.student.manage.mapper.TeacherInfoCustomMapper;
import com.student.manage.mapper.generated.CourseInfoMapper;
import com.student.manage.mapper.generated.GradeInfoMapper;
import com.student.manage.params.admin.GetAdminInfoPageParams;
import com.student.manage.params.grade.*;
import com.student.manage.po.generated.CourseInfo;
import com.student.manage.po.generated.GradeInfo;
import com.student.manage.po.generated.GradeInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.vo.admin.GetAdminInfoPageVO;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.grade.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 16:16
 */
@Service
public class GradeInfoService {

    @Autowired
    private GradeInfoMapper gradeInfoMapper;

    @Autowired
    private GradeInfoCustomMapper gradeInfoCustomMapper;

    @Autowired
    private GradeInfoManage gradeInfoManage;

    @Autowired
    private CourseInfoCustomMapper courseInfoCustomMapper;

    @Autowired
    private StudentInfoCustomMapper studentInfoCustomMapper;

    @Autowired
    private TeacherInfoCustomMapper teacherInfoCustomMapper;

    public ResponseEntity<PageInfoVO<GetGradeInfoPageVO>> getGradeInfoPage(GetGradeInfoPageParams params) {

        PageInfo<GetGradeInfoPageVO> pageInfo = gradeInfoManage.listGradeInfoPage(params);

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList()));
    }


    public ResponseEntity<List<GradeInfoVO>> getGradeInfoByStudentId(GetGradeInfoByIdParams params) {
        List<GradeInfoVO> gradeInfos = gradeInfoCustomMapper.getGradeInfoByStudentId(params);
        if (!CollectionUtils.isEmpty(gradeInfos)) {
            return ResponseEntity.ok(gradeInfos);
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE,"没有该id学生成绩信息");
        }
    }

    public ResponseEntity updateGradeInfo(UpdateGradeInfoParams params) {
        GradeInfoExample example = new GradeInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());

        GradeInfo gradeInfo = new GradeInfo();
        gradeInfo.setScore(params.getScore());

        int result = gradeInfoMapper.updateByExampleSelective(gradeInfo, example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "修改失败");
        }
    }

    public ResponseEntity deleteGradeInfoById(DeleteGradeInfoByIdParams params) {
        GradeInfoExample example = new GradeInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());

        int result = gradeInfoMapper.deleteByExample(example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "删除失败");
        }
    }

    public ResponseEntity<List<GradeCourseInfoVO>> getCourseInfo() {
        List<GradeCourseInfoVO> courseInfo = courseInfoCustomMapper.getCourseInfo();

        List<GradeCourseInfoVO> gradeCourseInfoVOS = new ArrayList<>();
        gradeCourseInfoVOS.addAll(courseInfo);
        return ResponseEntity.ok(gradeCourseInfoVOS);
    }

    public ResponseEntity<List<GradeStudentInfoVO>> getStudentInfo() {
        List<GradeStudentInfoVO> studentInfo = studentInfoCustomMapper.getStudentInfo();

        List<GradeStudentInfoVO> gradeStudentInfoVOS = new ArrayList<>();
        gradeStudentInfoVOS.addAll(studentInfo);
        return ResponseEntity.ok(gradeStudentInfoVOS);
    }

    public ResponseEntity<List<GradeTeacherInfoVO>> getTeacherInfo() {
        List<GradeTeacherInfoVO> teacherInfo = teacherInfoCustomMapper.getTeacherInfo();

        List<GradeTeacherInfoVO> gradeTeacherInfoVOS = new ArrayList<>();
        gradeTeacherInfoVOS.addAll(teacherInfo);
        return ResponseEntity.ok(gradeTeacherInfoVOS);
    }

    public ResponseEntity addGradeInfo(AddGradeInfoParams params) {
        GradeInfo gradeInfo = new GradeInfo();
        BeanUtils.copyProperties(params, gradeInfo);
        return ResponseEntity.ok(gradeInfoMapper.insertSelective(gradeInfo));
    }

}
