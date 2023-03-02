package com.student.manage.util.Enum;

import com.student.manage.util.BaseDictCode;

public enum ResponseError implements BaseDictCode {
    PROTOCOL_NOT_FOUND(320000, "客户协议未找到");

    private Integer code;
    private String message;

    ResponseError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getType() {
        return code;
    }

    @Override
    public String getName() {
        return message;
    }
}
