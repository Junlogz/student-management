package com.student.manage.manage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.manage.mapper.AdminInfoCustomMapper;
import com.student.manage.mapper.GradeInfoCustomMapper;
import com.student.manage.params.admin.GetAdminInfoPageParams;
import com.student.manage.params.grade.GetGradeInfoPageParams;
import com.student.manage.vo.admin.GetAdminInfoPageVO;
import com.student.manage.vo.grade.GetGradeInfoPageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/12 17:37
 */
@Service
public class GradeInfoManage {

    @Autowired
    private GradeInfoCustomMapper customMapper;


    public PageInfo<GetGradeInfoPageVO> listGradeInfoPage(GetGradeInfoPageParams params) {

        GetGradeInfoPageParams getGradeInfoPageParams = new GetGradeInfoPageParams();
        getGradeInfoPageParams.setStudentName(params.getStudentName());

        return PageHelper.startPage(params)
                .doSelectPageInfo(
                        () -> customMapper.listGradeInfoPage(getGradeInfoPageParams));
    }

}
