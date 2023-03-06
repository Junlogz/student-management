package com.student.manage.controller;


import com.student.manage.entity.ResponseEntity;
import com.student.manage.params.student.*;
import com.student.manage.service.StudentInfoService;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.LoginInfoVO;
import com.student.manage.vo.admin.AdminInfoVO;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.student.GetStudentInfoPageVO;
import com.student.manage.vo.student.StudentInfoVO;
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
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-03-02
 */
@RestController
@RequestMapping("/student-info")
@Api(tags = "学生信息业务")
public class StudentInfoController {

    @Autowired
    private StudentInfoService studentInfoService;

    @ApiOperation(value = "学生信息-分页查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-student-info-page/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PageInfoVO<GetStudentInfoPageVO>> getStudentInfoPage(@RequestBody GetStudentInfoPageParams params) {
        return studentInfoService.getAdminInfoPage(params);
    }

    @ApiOperation(value = "学生信息-新增", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/add-student-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addAdminInfo(@RequestBody @Validated AddStudentInfoParams params) {
        return studentInfoService.addStudentInfo(params);
    }

    @ApiOperation(value = "学生登录", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/login-student-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginInfoVO> loginAdminInfo(@RequestBody @Validated LoginStudentInfoParams params) {
        return studentInfoService.loginStudentInfo(params);
    }

    @ApiOperation(value = "学生信息-删除", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/delete-student-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteStudentInfoById(@RequestBody @Validated DeleteStudentInfoByIdParams params) {
        return studentInfoService.deleteStudentInfoById(params);
    }

    @ApiOperation(value = "学生信息-根据id查询", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/get-student-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentInfoVO> getStudentInfoById(@RequestBody GetStudentInfoByIdParams params) {
        return studentInfoService.getStudentInfoById(params);
    }

}
