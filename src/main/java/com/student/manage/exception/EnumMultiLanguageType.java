package com.student.manage.exception;

/**
 * 多语言
 * <p>
 * 多语言
 *
 * @author hulvyou
 */
public enum EnumMultiLanguageType {
    /**
     * 成功
     */
    SUCCESS(0, "成功", "成功", "Success"), REQUEST_ERROR_CODE(300100, "非法请求", "非法請求", "Illegal request"),
    ;

    private Integer code;
    private String jt;
    private String ft;
    private String en;

    EnumMultiLanguageType(Integer code, String jt, String ft, String en) {
        this.code = code;
        this.jt = jt;
        this.ft = ft;
        this.en = en;
    }

    public static String getEnumMultiLanguageMessage(EnumMultiLanguageType enumMultiLanguageType, Integer language) {

        if (language == null) {
            return enumMultiLanguageType.getJt();
        }

        switch (language) {
            case 1:
                return enumMultiLanguageType.getJt();
            case 2:
                return enumMultiLanguageType.getFt();
            case 3:
                return enumMultiLanguageType.getEn();
            default:
                return enumMultiLanguageType.getEn();
        }
    }

    public Integer getCode() {
        return code;
    }

    public String getJt() {
        return jt;
    }

    public String getFt() {
        return ft;
    }

    public String getEn() {
        return en;
    }
}
