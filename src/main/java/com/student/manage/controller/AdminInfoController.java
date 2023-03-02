package com.student.manage.controller;


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
public class AdminInfoController {

//    @Autowired
//    private AdminInfoService adminInfoService;
//
//    @ApiOperation(value = "管理员信息-新增", notes = "需要管理员token", code = UserResponseCodes.SUCCESS_CODE)
//    @ApiResponses({
//            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
//            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
//            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
//    })
//    @PostMapping(value = "/add-admin-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<AdminInfoVO> addAdminInfo(@RequestBody AddAdminInfoParams params) {
//
//        return adminInfoService.save();
//    }

}
