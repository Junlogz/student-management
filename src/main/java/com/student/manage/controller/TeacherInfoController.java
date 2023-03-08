package com.student.manage.controller;


import com.student.manage.entity.ResponseEntity;
import com.student.manage.params.teacher.*;
import com.student.manage.service.TeacherInfoService;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.LoginInfoVO;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.teacher.GetTeacherInfoPageVO;
import com.student.manage.vo.teacher.TeacherInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 * @since 2023-03-02
 */
@RestController
@RequestMapping("/teacher-info")
@Api(tags = "教师信息业务")
public class TeacherInfoController {

    @Autowired
    private TeacherInfoService teacherInfoService;

    @ApiOperation(value = "教师信息-分页查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-teacher-info-page/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PageInfoVO<GetTeacherInfoPageVO>> getTeacherInfoPage(@RequestBody GetTeacherInfoPageParams params) {
        return teacherInfoService.getTeacherInfoPage(params);
    }

    @ApiOperation(value = "教师信息-新增", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/add-teacher-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addTeacherInfo(@RequestBody @Validated AddTeacherInfoParams params) {
        return teacherInfoService.addTeacherInfo(params);
    }

    @ApiOperation(value = "教师信息-修改", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/update-teacher-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateTeacherInfo(@RequestBody UpdateTeacherInfoParams params) {
//        return teacherInfoService.updateTeacherInfo(params);
        return ResponseEntity.ok();
    }

    @ApiOperation(value = "教师登录", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/login-teacher-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginInfoVO> loginTeacherInfo(@RequestBody @Validated LoginTeacherInfoParams params) {
        return teacherInfoService.loginTeacherInfo(params);
    }

    @ApiOperation(value = "教师信息-删除", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/delete-teacher-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteTeacherInfoById(@RequestBody @Validated DeleteTeacherInfoByIdParams params) {
        return teacherInfoService.deleteTeacherInfoById(params);
    }

    @ApiOperation(value = "教师信息-根据id查询", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/get-teacher-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TeacherInfoVO> getTeacherInfoById(@RequestBody GetTeacherInfoByIdParams params) {
        return teacherInfoService.getTeacherInfoById(params);
    }

}
