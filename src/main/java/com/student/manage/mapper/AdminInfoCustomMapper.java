package com.student.manage.mapper;

import com.student.manage.params.admin.GetAdminInfoPageParams;
import com.student.manage.po.generated.AdminInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminInfoCustomMapper {

    List<AdminInfo> listAdminInfoPage(GetAdminInfoPageParams params);

}
