package com.student.manage.service;

import com.github.pagehelper.PageInfo;
import com.student.manage.entity.ResponseEntity;
import com.student.manage.manage.CourseInfoManage;
import com.student.manage.mapper.generated.CourseInfoMapper;
import com.student.manage.params.course.AddCourseInfoParams;
import com.student.manage.params.course.DeleteCourseInfoByIdParams;
import com.student.manage.params.course.GetCourseInfoByIdParams;
import com.student.manage.params.course.GetCourseInfoPageParams;
import com.student.manage.po.generated.CourseInfo;
import com.student.manage.po.generated.CourseInfoExample;
import com.student.manage.util.ResponseCode;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.course.CourseInfoVO;
import com.student.manage.vo.course.GetCourseInfoPageVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/3 21:59
 */
@Service
public class CourseInfoService {

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    @Autowired
    private CourseInfoManage courseInfoManage;

    public ResponseEntity<PageInfoVO<GetCourseInfoPageVO>> getCourseInfoPage(GetCourseInfoPageParams params) {

        PageInfo<GetCourseInfoPageVO> pageInfo = courseInfoManage.listCourseInfoPage(params);

        return ResponseEntity.ok(new PageInfoVO(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getList()));
    }

    public ResponseEntity addCourseInfo(AddCourseInfoParams params) {
        try {
            CourseInfo courseInfo = new CourseInfo();
            BeanUtils.copyProperties(params, courseInfo);
            courseInfoMapper.insertSelective(courseInfo);
        } catch (DuplicateKeyException e){
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "The Information Already Exists");
        }
        return ResponseEntity.ok();
    }

    public ResponseEntity deleteCourseInfoById(DeleteCourseInfoByIdParams params) {
        CourseInfoExample example = new CourseInfoExample();
        example.createCriteria().andIdEqualTo(params.getId());
        int result = courseInfoMapper.deleteByExample(example);
        if (result >= 1) {
            return ResponseEntity.ok();
        } else {
            return ResponseEntity.error(ResponseCode.FAIL_CODE, "删除失败(不存在该id)");
        }
    }

    public ResponseEntity<CourseInfoVO> getCourseInfoById(GetCourseInfoByIdParams params) {
        CourseInfo courseInfo = courseInfoMapper.selectByPrimaryKey(params.getId());
        CourseInfoVO courseInfoVO = new CourseInfoVO();
        BeanUtils.copyProperties(courseInfo, courseInfoVO);
        return ResponseEntity.ok(courseInfoVO);
    }

}
