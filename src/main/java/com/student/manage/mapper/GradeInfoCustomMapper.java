package com.student.manage.mapper;

import com.student.manage.params.admin.GetAdminInfoPageParams;
import com.student.manage.params.grade.GetGradeInfoByIdParams;
import com.student.manage.params.grade.GetGradeInfoPageParams;
import com.student.manage.po.generated.AdminInfo;
import com.student.manage.vo.grade.GetGradeInfoPageVO;
import com.student.manage.vo.grade.GradeInfoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 16:49
 */
@Repository
public interface GradeInfoCustomMapper {

    GradeInfoVO getGradeInfoByStudentId(GetGradeInfoByIdParams params);

    List<GetGradeInfoPageVO> listGradeInfoPage(GetGradeInfoPageParams params);

}
