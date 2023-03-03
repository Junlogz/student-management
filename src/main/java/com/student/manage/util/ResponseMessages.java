package com.student.manage.util;

public interface ResponseMessages {

    String SUCCESS_MSG = "成功";
    String LOGIN_SUCCESS_MSG = "登录成功";
    String TOKEN_WRONG_MSG = "非法TOKEN";
    String REQUEST_ERROR_MSG = "非法请求";
    String INTERNAL_SERVER_ERROR = "服务器内部错误";

    String ID_CARD_FILE_SIZE_BEYOND = "身份证图片需小于2MB";
    String ID_CARD_OCR_ERROR = "抱歉，身份识别失败，请上传正确可辨识的照片，如有疑问，请联系客服。";
    String ID_CARD_OCR_WARN = "图片质量不佳，或者使用真实身份证照片，或横向拍证件照";
    String BANK_CARD_FILE_SIZE_BEYOND = "银行卡图片需小于10MB";
    String BANK_CARD_OCR_ERROR = "银行卡图片识别异常";
    String FOUR_ELEMENT_CHECK_ERROR = "抱歉，验证未通过，请确保使用本人大陆身份证和大陆银行卡信息，手机号为银行预留手机号。如有疑问，请联系客服。";
    String FOUR_ELEMENT_CHECK_WARN = "四要素校验未通过";
    String ID_CARD_INFO_EMPTY = "无身份证图片";
    String ID_CARD_FRONT_EMPTY = "无身份证正面图片";
    String ID_CARD_BACK_EMPTY = "无身份证反面图片";
    String USER_UNDER_AGE = "抱歉，您的年龄不符合要求，不能开户。";
    String ID_CARD_NUMBER_ERROR = "身份证号格式错误";

    String INNER_SERVICE_ERROR = "服务器连接异常，请稍后重试";
    String THIRD_SERVICE_ERROR = "服务器连接异常，请稍后重试";

}
