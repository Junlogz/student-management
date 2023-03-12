package com.student.manage.controller;


import com.student.manage.entity.ResponseEntity;
import com.student.manage.params.course.*;
import com.student.manage.service.CourseInfoService;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.course.CourseInfoVO;
import com.student.manage.vo.course.GetCourseInfoPageVO;
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
@RequestMapping("/course-info")
@Api(tags = "课程信息业务")
public class CourseInfoController {

    @Autowired
    private CourseInfoService courseInfoService;

    @ApiOperation(value = "课程信息-分页查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-course-info-page/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PageInfoVO<GetCourseInfoPageVO>> getCourseInfoPage(@RequestBody GetCourseInfoPageParams params) {
        return courseInfoService.getCourseInfoPage(params);
    }

    @ApiOperation(value = "课程信息-新增", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/add-course-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addCourseInfo(@RequestBody @Validated AddCourseInfoParams params) {
        return courseInfoService.addCourseInfo(params);
    }

    @ApiOperation(value = "课程信息-修改", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/update-course-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateCourseInfo(@RequestBody UpdateCourseInfoParams params) {
        return courseInfoService.updateCourseInfo(params);
    }

    @ApiOperation(value = "课程信息-删除", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/delete-course-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteCourseInfoById(@RequestBody @Validated DeleteCourseInfoByIdParams params) {
        return courseInfoService.deleteCourseInfoById(params);
    }

    @ApiOperation(value = "课程信息-根据id查询", code = ResponseCode.SUCCESS_CODE)
    @ApiResponses({
            @ApiResponse(code = ResponseCode.SUCCESS_CODE, message = ResponseMessages.SUCCESS_MSG, response = ResponseEntity.class),
            @ApiResponse(code = ResponseCode.INTERNAL_SERVER_ERROR, message = ResponseMessages.INTERNAL_SERVER_ERROR),
            @ApiResponse(code = ResponseCode.REQUEST_ERROR_CODE, message = ResponseMessages.REQUEST_ERROR_MSG),
    })
    @PostMapping(value = "/get-course-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CourseInfoVO> getCourseInfoById(@RequestBody GetCourseInfoByIdParams params) {
        return courseInfoService.getCourseInfoById(params);
    }

}
