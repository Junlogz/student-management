package com.student.manage.mapper;

import com.student.manage.params.course.GetCourseInfoPageParams;
import com.student.manage.params.teacher.GetTeacherInfoPageParams;
import com.student.manage.po.generated.CourseInfo;
import com.student.manage.po.generated.TeacherInfo;
import com.student.manage.vo.grade.GradeCourseInfoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseInfoCustomMapper {

    List<CourseInfo> listCourseInfoPage(GetCourseInfoPageParams params);

    List<GradeCourseInfoVO> getCourseInfo();

}
