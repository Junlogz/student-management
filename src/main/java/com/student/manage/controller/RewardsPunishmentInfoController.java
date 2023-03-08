package com.student.manage.controller;


import com.student.manage.entity.ResponseEntity;
import com.student.manage.params.rp.*;
import com.student.manage.service.RewardsPunishmentInfoService;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.rp.RewardsPunishmentInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-03-02
 */
@RestController
@RequestMapping("/rewards-punishment-info")
@Api(tags = "奖惩信息业务")
public class RewardsPunishmentInfoController {

    @Autowired
    private RewardsPunishmentInfoService punishmentInfoService;

    @ApiOperation(value = "奖惩信息-根据学生id查询", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/get-rewards-punishment-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RewardsPunishmentInfoVO> getRewardsPunishmentInfoById(@RequestBody GetRewardsPunishmentByIdParams params) {
        return punishmentInfoService.getRewardsPunishmentInfoById(params);
    }

    @ApiOperation(value = "奖惩信息-分页查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-rewards-punishment-info-page/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PageInfoVO<RewardsPunishmentInfoVO>> getRewardsPunishmentInfoPage(@RequestBody GetRewardsPunishmentPageParams params) {
        return punishmentInfoService.getRewardsPunishmentInfoPage(params);
    }

    @ApiOperation(value = "奖惩信息-修改", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/update-rewards-punishment-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateRewardsPunishmentInfo(@RequestBody UpdateRewardsPunishmentParams params) {
        return punishmentInfoService.updateRewardsPunishmentInfo(params);
    }

    @ApiOperation(value = "奖惩信息-删除", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/delete-rewards-punishment-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteRewardsPunishmentInfo(@RequestBody DeleteRewardsPunishmentParams params) {
        return punishmentInfoService.deleteRewardsPunishmentInfo(params);
    }

    @ApiOperation(value = "奖惩信息-添加", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/add-rewards-punishment-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addRewardsPunishmentInfo(@RequestBody AddRewardsPunishmentParams params) {
        return punishmentInfoService.addRewardsPunishmentInfo(params);
    }





}
