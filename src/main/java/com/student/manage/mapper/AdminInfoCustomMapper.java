package com.student.manage.mapper;

import com.student.manage.params.GetAdminInfoPageParams;
import com.student.manage.po.generated.AdminInfo;

import java.util.List;

public interface AdminInfoCustomMapper {

    List<AdminInfo> listAdminInfoPage(GetAdminInfoPageParams params);

}
