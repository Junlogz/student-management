package com.student.manage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.student.manage.util.Enum.ResponseError;
import com.student.manage.util.JsonUtils;
import com.student.manage.util.ResponseCode;
import com.student.manage.util.ResponseMessages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel(value = "ResponseEntity", description = "接口统一出参")
public class ResponseEntity<T> {

    @ApiModelProperty(value = "响应码", dataType = "String")
    private Integer code;
    @ApiModelProperty(value = "响应内容", dataType = "String")
    private String msg;
    @ApiModelProperty(value = "响应体", dataType = "String")
    private T data;

    private ResponseEntity() {

    }

    public ResponseEntity(Integer code) {
        this.code = code;
    }

    public ResponseEntity(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @SuppressWarnings("unchecked")
    public static <T> ResponseEntity<T> ok(T t) {
        ResponseEntity accountResponseEntity = new ResponseEntity();
        accountResponseEntity.setData(t != null ? t : new HashMap<String, Object>(2));
        accountResponseEntity.setCode(ResponseCode.SUCCESS_CODE);
        accountResponseEntity.setMsg(ResponseMessages.SUCCESS_MSG);
        return accountResponseEntity;
    }


    public static ResponseEntity ok() {
        ResponseEntity<?> accountResponseEntity = new ResponseEntity<>();
        accountResponseEntity.setData(null);
        accountResponseEntity.setCode(ResponseCode.SUCCESS_CODE);
        accountResponseEntity.setMsg(ResponseMessages.SUCCESS_MSG);
        return accountResponseEntity;
    }

    public static <T> ResponseEntity ok(String message, T body) {
        ResponseEntity accountResponseEntity = ok(body);
        accountResponseEntity.setMsg(message);
        return accountResponseEntity;
    }

    @SuppressWarnings("unchecked")
    public static ResponseEntity error(Integer code, String message) {
        ResponseEntity accountResponseEntity = new ResponseEntity();
        accountResponseEntity.setData(new HashMap<String, Object>(2));
        accountResponseEntity.setCode(code);
        accountResponseEntity.setMsg(message);
        return accountResponseEntity;
    }

    public static ResponseEntity error(ResponseError error) {
        return error(error, error.getName());
    }

    public static ResponseEntity error(ResponseError error, String message) {
        return error(error.getType(), message);
    }

    public static ResponseEntity requestError() {
        return error(ResponseCode.REQUEST_ERROR_CODE, ResponseMessages.REQUEST_ERROR_MSG);
    }

    public static ResponseEntity tokenError() {
        return error(ResponseCode.TOKEN_WRONG_CODE, ResponseMessages.TOKEN_WRONG_MSG);
    }


    @SuppressWarnings("unchecked")
    public ResponseEntity map(String key, Object value) {
        if (data == null) {
            data = (T) new HashMap<String, Object>(2);
        }

        Map<String, Object> map = (Map<String, Object>) data;
        map.put(key, value);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    private void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    private void setData(T data) {
        this.data = data;
    }

    public Boolean assertTrue() {
        return code.equals(ResponseCode.SUCCESS_CODE);
    }


    @Override
    public String toString() {
        return JsonUtils.toJson(this);
    }
}
