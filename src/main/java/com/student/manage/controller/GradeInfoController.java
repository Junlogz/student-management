package com.student.manage.controller;


import com.student.manage.entity.ResponseEntity;
import com.student.manage.params.admin.UpdateAdminInfoParams;
import com.student.manage.params.course.GetCourseInfoPageParams;
import com.student.manage.params.course.UpdateCourseInfoParams;
import com.student.manage.params.grade.*;
import com.student.manage.params.teacher.DeleteTeacherInfoByIdParams;
import com.student.manage.params.teacher.GetTeacherInfoByIdParams;
import com.student.manage.service.GradeInfoService;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import com.student.manage.vo.admin.PageInfoVO;
import com.student.manage.vo.course.CourseInfoVO;
import com.student.manage.vo.course.GetCourseInfoPageVO;
import com.student.manage.vo.grade.*;
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

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-03-02
 */
@RestController
@RequestMapping("/grade-info")
@Api(tags = "成绩信息业务")
public class GradeInfoController {

    @Autowired
    private GradeInfoService gradeInfoService;

    @ApiOperation(value = "成绩信息-根据学生id查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-grade-info-by-student-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GradeInfoVO>> getGradeInfoByStudentId(@RequestBody GetGradeInfoByIdParams params) {
        return gradeInfoService.getGradeInfoByStudentId(params);
    }

    @ApiOperation(value = "成绩信息-分页查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-grade-info-page/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PageInfoVO<GetGradeInfoPageVO>> getCourseInfoPage(@RequestBody GetGradeInfoPageParams params) {
        return gradeInfoService.getGradeInfoPage(params);
    }

    @ApiOperation(value = "成绩信息-修改", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/update-grade-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateGradeInfo(@RequestBody UpdateGradeInfoParams params) {
        return gradeInfoService.updateGradeInfo(params);
    }

    @ApiOperation(value = "成绩信息-删除", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/delete-grade-info-by-id/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteGradeInfoById(@RequestBody @Validated DeleteGradeInfoByIdParams params) {
        return gradeInfoService.deleteGradeInfoById(params);
    }

    @ApiOperation(value = "成绩信息-添加", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/add-grade-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addGradeInfo(@RequestBody AddGradeInfoParams params) {
        return gradeInfoService.addGradeInfo(params);
    }

    @ApiOperation(value = "成绩信息-添加-课程下拉框查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-course-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GradeCourseInfoVO>> getCourseInfo() {
        return gradeInfoService.getCourseInfo();
    }

    @ApiOperation(value = "成绩信息-添加-学生下拉框查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-student-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GradeStudentInfoVO>> getStudentInfo() {
        return gradeInfoService.getStudentInfo();
    }

    @ApiOperation(value = "成绩信息-添加-教师下拉框查询", code = ResponseCode.SUCCESS_CODE)
    @PostMapping(value = "/get-teacher-info/v1", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GradeTeacherInfoVO>> getTeacherInfo() {
        return gradeInfoService.getTeacherInfo();
    }


}
