package com.student.manage.manage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.manage.mapper.CourseInfoCustomMapper;
import com.student.manage.mapper.TeacherInfoCustomMapper;
import com.student.manage.params.course.GetCourseInfoPageParams;
import com.student.manage.params.teacher.GetTeacherInfoPageParams;
import com.student.manage.vo.course.GetCourseInfoPageVO;
import com.student.manage.vo.teacher.GetTeacherInfoPageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 10:13
 */
@Service
public class CourseInfoManage {

    @Autowired
    private CourseInfoCustomMapper courseInfoCustomMapper;


    public PageInfo<GetCourseInfoPageVO> listCourseInfoPage(GetCourseInfoPageParams params) {

        GetCourseInfoPageParams getCourseInfoPageParams = new GetCourseInfoPageParams();
        getCourseInfoPageParams.setCourseName(params.getCourseName());
        getCourseInfoPageParams.setCourseNumber(params.getCourseNumber());

        return PageHelper.startPage(params)
                .doSelectPageInfo(
                        () -> courseInfoCustomMapper.listCourseInfoPage(getCourseInfoPageParams));
    }

}
