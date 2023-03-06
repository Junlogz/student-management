package com.student.manage.manage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.manage.mapper.StudentInfoCustomMapper;
import com.student.manage.mapper.TeacherInfoCustomMapper;
import com.student.manage.params.student.GetStudentInfoPageParams;
import com.student.manage.params.teacher.GetTeacherInfoPageParams;
import com.student.manage.vo.student.GetStudentInfoPageVO;
import com.student.manage.vo.teacher.GetTeacherInfoPageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 10:13
 */
@Service
public class TeacherInfoManage {

    @Autowired
    private TeacherInfoCustomMapper teacherInfoCustomMapper;


    public PageInfo<GetTeacherInfoPageVO> listTeacherInfoPage(GetTeacherInfoPageParams params) {

        GetTeacherInfoPageParams getTeacherInfoPageParams = new GetTeacherInfoPageParams();
        getTeacherInfoPageParams.setName(params.getName());
        getTeacherInfoPageParams.setTeacherNumber(params.getTeacherNumber());
        getTeacherInfoPageParams.setDepart(params.getDepart());

        return PageHelper.startPage(params)
                .doSelectPageInfo(
                        () -> teacherInfoCustomMapper.listTeacherInfoPage(getTeacherInfoPageParams));
    }

}
