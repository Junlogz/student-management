package com.student.manage.manage;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.student.manage.mapper.AdminInfoCustomMapper;
import com.student.manage.params.GetAdminInfoPageParams;
import com.student.manage.po.generated.AdminInfo;
import com.student.manage.vo.GetAdminInfoPageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminInfoManage {

    @Autowired
    private AdminInfoCustomMapper adminInfoCustomMapper;


    public PageInfo<GetAdminInfoPageVO> listUserPreAuthorizationPage(GetAdminInfoPageParams params) {

        GetAdminInfoPageParams getAdminInfoPageParams =new GetAdminInfoPageParams();
        getAdminInfoPageParams.setName(params.getName());

        return PageHelper.startPage(params)
                .doSelectPageInfo(
                        () -> adminInfoCustomMapper.listAdminInfoPage(getAdminInfoPageParams));
    }

}
