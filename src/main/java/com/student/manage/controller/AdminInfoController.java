package com.student.manage.controller;


import com.student.manage.entity.ResponseEntity;
import com.student.manage.mapper.generated.AdminInfoMapper;
import com.student.manage.params.AddAdminInfoParams;
import com.student.manage.params.LoginAdminInfoParams;
import com.student.manage.service.AdminInfoService;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.util.UserResponseCodes;
import com.student.manage.vo.AdminInfoVO;
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
@RequestMapping("/admin-info")
@Api(tags = "管理员信息业务")
public class AdminInfoController {

    @Autowired
    private AdminInfoService adminInfoService;

    @ApiOperation(value = "管理员信息-新增", code = UserResponseCodes.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/add-admin-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addAdminInfo(@RequestBody @Validated AddAdminInfoParams params) {
        return adminInfoService.addAdminInfo(params);
    }

//    @ApiOperation(value = "管理员登录", code = UserResponseCodes.SUCCESS_CODE)
//    @ApiResponses({
//            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
//            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
//            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
//    })
//    @PostMapping(value = "/login-admin-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Void> loginAdminInfo(@RequestBody @Validated LoginAdminInfoParams params) {
//        return adminInfoService.addAdminInfo(params);
//    }



}
