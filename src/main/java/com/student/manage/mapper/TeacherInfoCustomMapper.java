package com.student.manage.mapper;

import com.student.manage.params.student.GetStudentInfoPageParams;
import com.student.manage.params.teacher.GetTeacherInfoPageParams;
import com.student.manage.po.generated.StudentInfo;
import com.student.manage.po.generated.TeacherInfo;
import com.student.manage.vo.grade.GradeTeacherInfoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherInfoCustomMapper {

    List<TeacherInfo> listTeacherInfoPage(GetTeacherInfoPageParams params);

    List<GradeTeacherInfoVO> getTeacherInfo();
}
