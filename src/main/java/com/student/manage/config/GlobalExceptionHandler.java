package com.student.manage.config;

import com.student.manage.entity.ResponseEntity;
import com.student.manage.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/6 21:41
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理 BusinessException 异常
     *
     * @param httpServletRequest httpServletRequest
     * @param e                  异常
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public ResponseEntity businessExceptionHandler(HttpServletRequest httpServletRequest, BusinessException e) {
        return ResponseEntity.error(e.getCode(), e.getMessage());
    }

}
