package com.student.manage.mapper;

import com.student.manage.params.course.GetCourseInfoPageParams;
import com.student.manage.params.rp.GetRewardsPunishmentByIdParams;
import com.student.manage.params.rp.GetRewardsPunishmentPageParams;
import com.student.manage.po.generated.CourseInfo;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/5 23:29
 */
@Repository
public interface RewardsPunishmentInfoCustomMapper {

    RewardsPunishmentInfoVO getRewardsPunishmentInfoById(GetRewardsPunishmentByIdParams params);


    List<RewardsPunishmentInfoVO> listRewardsPunishmentInfoPage(GetRewardsPunishmentPageParams params);
}
