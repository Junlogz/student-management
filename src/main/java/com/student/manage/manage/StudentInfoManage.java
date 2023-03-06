package com.student.manage.manage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.manage.mapper.StudentInfoCustomMapper;
import com.student.manage.params.student.GetStudentInfoPageParams;
import com.student.manage.vo.student.GetStudentInfoPageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/4 10:13
 */
@Service
public class StudentInfoManage {

    @Autowired
    private StudentInfoCustomMapper studentInfoCustomMapper;


    public PageInfo<GetStudentInfoPageVO> listStudentInfoPage(GetStudentInfoPageParams params) {

        GetStudentInfoPageParams getStudentInfoPageParams = new GetStudentInfoPageParams();
        getStudentInfoPageParams.setName(params.getName());
        getStudentInfoPageParams.setStudentNumber(params.getStudentNumber());
        getStudentInfoPageParams.setMajor(params.getMajor());

        return PageHelper.startPage(params)
                .doSelectPageInfo(
                        () -> studentInfoCustomMapper.listStudentInfoPage(getStudentInfoPageParams));
    }

}
