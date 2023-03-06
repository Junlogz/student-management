package com.student.manage.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.text.MessageFormat;

/**
 * @author: JunLog
 * @Description: *
 * Date: 2023/3/6 21:19
 */
public class BusinessException extends RuntimeException{

    /**
     * 错误代码
     */
    private final Integer code;

    @JsonIgnore
    private EnumMultiLanguageType enumMultiLanguageType;
    @JsonIgnore
    private EnumUserCenterDolphinErrorCodes enumUserCenterDolphinErrorCodes;

    public BusinessException() {
        super(ExceptionEnum.getMessageByCode(0));
        this.code = 0;
    }

    public BusinessException(ExceptionEnum exceptionEnum, Object... params) {
        super(MessageFormat.format(exceptionEnum.getMessage(), params));
        this.code = exceptionEnum.getCode();
    }

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public BusinessException(EnumMultiLanguageType enumMultiLanguageType) {
        super(enumMultiLanguageType.getEn());
        this.code = enumMultiLanguageType.getCode();
    }

    public BusinessException(EnumUserCenterDolphinErrorCodes errorCodes) {
        super(errorCodes.getMessage());
        this.code = errorCodes.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public EnumMultiLanguageType getEnumMultiLanguageType() {
        return enumMultiLanguageType;
    }

    public void setEnumMultiLanguageType(EnumMultiLanguageType enumMultiLanguageType) {
        this.enumMultiLanguageType = enumMultiLanguageType;
    }

    public EnumUserCenterDolphinErrorCodes getEnumUserCenterDolphinErrorCodes() {
        return enumUserCenterDolphinErrorCodes;
    }

    public void setEnumUserCenterDolphinErrorCodes(EnumUserCenterDolphinErrorCodes enumUserCenterDolphinErrorCodes) {
        this.enumUserCenterDolphinErrorCodes = enumUserCenterDolphinErrorCodes;
    }

    @Override
    public String toString() {
        return "BusinessException{" + "code='" + code + '\'' + ", message='" + getMessage() + '\'' + '}';
    }

}
