package com.student.manage.mapper;

import com.student.manage.params.admin.GetAdminInfoPageParams;
import com.student.manage.params.student.GetStudentInfoPageParams;
import com.student.manage.po.generated.AdminInfo;
import com.student.manage.po.generated.StudentInfo;
import com.student.manage.vo.grade.GradeStudentInfoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoCustomMapper {

    List<StudentInfo> listStudentInfoPage(GetStudentInfoPageParams params);

    List<GradeStudentInfoVO> getStudentInfo();

}
