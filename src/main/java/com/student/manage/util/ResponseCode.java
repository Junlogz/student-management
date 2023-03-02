package com.student.manage.util;

public interface ResponseCode {

    /**
     * 成功
     */
    int SUCCESS_CODE = 0;
    int CHECK_TRADE_PASSWORD_CODE = 1;
    String SUCCESS_CODE_STR = "0";
    /**
     * 非法请求
     */
    int REQUEST_ERROR_CODE = 310000;
    int T2_SERVER_ERROR = 310001;
    int TOKEN_WRONG_CODE = 300101;
    int INNER_SERVICE_ERROR = 300102;
    int THIRD_SERVICE_ERROR = 300103;
    int INTERNAL_SERVER_ERROR = 300105;



}
