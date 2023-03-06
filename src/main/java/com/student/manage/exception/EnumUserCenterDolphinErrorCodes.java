package com.student.manage.exception;

public enum EnumUserCenterDolphinErrorCodes {

    /** 350000-350100 基础错误码范围 */
    SUCCESS(0, "Success"),
    ;

    private Integer code;
    private String message;

    EnumUserCenterDolphinErrorCodes(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
