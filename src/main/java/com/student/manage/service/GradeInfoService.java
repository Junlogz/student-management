package com.student.manage.service;

import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.GradeInfoManage;
import com.student.manage.mapper.CourseInfoCustomMapper;
import com.student.manage.mapper.GradeInfoCustomMapper;
import com.student.manage.mapper.generated.CourseInfoMapper;
import com.student.manage.mapper.generated.GradeInfoMapper;
import com.student.manage.params.admin.GetAdminInfoPageParams;
import com.student.manage.params.grade.DeleteGradeInfoByIdParams;
import com.student.manage.params.grade.GetGradeInfoByIdParams;
import com.student.manage.params.grade.GetGradeInfoPageParams;
import com.student.manage.params.grade.UpdateGradeInfoParams;
import com.student.manage.po.generated.CourseInfo;
import com.student.manage.po.generated.GradeInfo;
import com.student.manage.po.generated.GradeInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.vo.admin.GetAdminInfoPageVO;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.grade.GetGradeInfoPageVO;
import com.student.manage.vo.grade.GradeCourseInfoVO;
import com.student.manage.vo.grade.GradeInfoVO;
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

    public ResponseEntity<PageInfoVO<GetGradeInfoPageVO>> getGradeInfoPage(GetGradeInfoPageParams params) {

        PageInfo<GetGradeInfoPageVO> pageInfo = gradeInfoManage.listGradeInfoPage(params);

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList()));
    }


    public ResponseEntity<GradeInfoVO> getGradeInfoByStudentId(GetGradeInfoByIdParams params) {
        GradeInfoVO gradeInfos = gradeInfoCustomMapper.getGradeInfoByStudentId(params);
        if (!ObjectUtils.isEmpty(gradeInfos)) {
            GradeInfoVO gradeInfoVO = new GradeInfoVO();
            BeanUtils.copyProperties(gradeInfos, gradeInfoVO);
            return ResponseEntity.ok(gradeInfoVO);
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

}
