package com.student.manage.exception;

/**
 * 异常信息枚举类
 *
 * @author wujunwei
 */
public enum ExceptionEnum {

    /**
     * 成功的提示，错误码，固定为0
     */
    COMMON_SUCCESS_ERROR_CODE(0, "调用成功"),

    ///////////////////////// 公共异常部分 300001 --- 300100 开始 /////////////////////////

    /**
     * 参数{0}不能为空
     */
    COMMON_ERROR_CODE(300001, "服务器内部错误，请联系管理员。具体异常为：{0}"),

    /**
     * 当业务代码中的异常信息找不到的时候，提示的信息
     */
    NO_MESSAGE_FOUND(300002, "内置的异常信息找不到，请联系管理员"),

    /**
     * 参数{0}不能为空
     */
    PARAM_MUST_NOT_NULL(300003, "参数[{0}]不能为空"),

    /**
     * 请求第三方数据失败
     */
    HTTP_ERROR(300004, "HTTP请求第三方数据失败,请稍后再试"),

    /**
     * 数据校验失败
     */
    DATA_VALIDATION_FAIL(300005, "数据校验失败"),

    /**
     * 参数校验失败
     */
    PARAM_CHECK_FAIL(300006, "参数[{0}]校验失败"),

    /**
     * 参数{0}不能全为空
     */
    PARAMS_NOT_ALL_NULL(300007, "参数{0}不能全为空"),

    /**
     * 数据字典{0}不存在值{1}
     */
    DICT_CODE_NOT_EXISTS(300008, "数据字典{0}不存在值{1}"),

    /**
     * 【{0}】请求修改的值【{1}】与修改前的值{2}不相等，请检查
     */
    CHANGE_BEFORE_VALUE_NO_EQUAL(300009, "【{0}】数据记录原值为【{1}】,请求修改前的值【{2}】，非法修改，请检查入参。"),

    DATABASE_RECORD_NOT_EXISTS(300010, "系统中无该记录，无法继续操作，请检查。"),

    DATABASE_RECORD_EXISTS(300011, "系统中已有该记录，请检查。"),

    DATABASE_FAIL_TO_INSERT_FLOW(300012, "新增流水失败"),

    DATABASE_FLOW_RECORD_EXISTS(300013, "流水信息中已有该流程，无法继续新增流程记录"),

    DATABASE_NO_WAIT_EXAMINE_RECORD(300014, "系统中无该记录或没有待审核的记录"),

    FILE_UPLOAD_FILE(300015, "文件上传到云服务器失败，请重试"),

    DATA_NOT_VALID(300016, "【{0}】的值【{1}】不合法"),

    DATABASE_RECORD_NOT_CHANGE(300017, "数据库未更新任何记录，请联系管理员"),

    PARAMS_FORMAT_ERROR(300018, "参数【{0}】格式错误"),

    DATASTR_FORMAT_ERROR(300019, "日期参数格式化失败【{0}】"),

    /**
     * 参数{0}不能为空
     */
    SERVICE_ERROR_CODE(300020, "业务异常。异常内容：{0}"),

    BIG_DATA_URL_REQUEST_ERROR(300021, "大数据接口请求异常。异常内容：{0}"),

    ///////////////////////// 公共异常部分 300001 --- 309999 结束 /////////////////////////

    ///////////////////////// 用户部分异常 310000 --- 329999 开始/////////////////////////
    USER_ID_NOT_EXISTS(310000, "用户【userId:{0}】不存在"),

    USER_STATUS_NOT_MATCH(310001, "用户【userId:{0}】的原有状态不匹配"),

    ONLY_SPECIFIED_STATUS_LIMITED(310002, "只能将状态设置为{0}"),

    RECORD_NOT_EXISTS(310003, "查询的记录【id={0}】不存在"),

    CANNOT_SPECIFIED_KEY(310004, "无法识别的字段信息{0}"),

    CUSTOMER_CREDENTIALS_NEEDED(310005, "如果是客户发起的修改，则需要上传凭证附件"),

    USER_STATUS_FREE_REPEATED(310006, "该客户ID状态已经为{0}，无法再次{0}"),

    ACCOUNT_STATUS_FREE_REPEATED(310007, "该账户状态已经为{0}，无法再次{0}"),

    USER_STATUS_FREE_NOT_AUTH(310008, "该客户ID已{0}，您无权限解冻"),

    ACCOUNT_STATUS_FREE_NOT_AUTH(310009, "该资金账户已{0}，您无权限解冻"),

    USER_NOT_EXISTS(310010, "用户不存在"),

    USER_NOT_ACCOUNT_INFO(310011, "用户不存在账户信息:【{0}】"),

    USER_NOT_IDENTIFY_INFO(310012, "用户【{0}】不存在证件信息"),

    USER_NOT_EXT_INFO(310013, "用户【{0}】不存在扩展信息"),

    USER_CONFIG_OPTIONS_ERROR(310014, "用户配置参数非法，请重新输入。"),

    DATA_MUST_NOT_NULL(310015, "{0}不能为空"),

    USER_OPEN_ENTRY_NOT_EXISTS(310016, "用户【{0}】不存在开户申请信息"),

    ///////////////////////// 用户部分异常 310000 --- 329999 结束/////////////////////////

    ///////////////////////// 账户部分异常 320000 --- 320999 开始/////////////////////////
    ACCOUNT_NOT_EXISTS(320000, "用户【userId:{0}】的资金账户不存在"),

    ACCOUNT_STATUS_NOT_MATCH(320001, "资金账户【{0}】的原有状态不匹配不存在"),

    HENGSHENG_ERROR(320002, "恒生系统连接异常，请联系管理员。错误信息：【{0}】"),

    HENGSHENG_EXCEPTION(320004, "恒生柜台提示：【{0}】"),

    OPEN_ACCOUNT_CA_SN_ERROR(320005, "客户开户深圳CA调用异常：【{0}】"),

    OPEN_ACCOUNT_CA_PDF_ERROR(320006, "客户开户文档PDF获取异常：【{0}】"),

    OPEN_ACCOUNT_SIGN_IMAGE_ERROR(320007, "客户签名图片参数异常：【{0}】"),

    CRM_SERVICE_INVOKE_EXCEPTION(320008, "调用客户关系管理系统获取客户经理信息异常"),

    CRM_SERVICE_INVOKE_NULL(320009, "调用客户关系管理系统获取客户经理信息返回为空"),

    IPAD_OPEN_ACCOUNT_ERROR(32010, "ipad开户提交资料保存失败"),

    BIG_DATA_CUST_TRAN_MONITOR_ERROR(320011, "请求大数据客户监控报表接口异常。"),

    CA_SIGNP7PDF_TIMEOUT(320011, "请求深圳CA 证书备案 接口请求超时。"),

    W8BEN_REPLENISH_NO_EXIST(320013, "无权限登录或链接已过有效期"),

    OPEN_ACCOUNT_AGAIN_PARAM_AGAIN_TYPE_NOT_NULL(320012, "重新开户，请选择操作类型。"),

    OPEN_ACCOUNT_AGAIN_PARAM_BIND_MUST_NOT_NULL(320014, "手动绑定开户，请输入资金账户和客户号信息。"),

    GET_PURCHASING_POWER_FARE_KIND_ERROR(320015, "查询购买力套餐更新异常"),

    ///////////////////////// 机构账户部分异常 321000 --- 321999 开始/////////////////////////
    ORG_TRADER_PARAMS_MUST_NOT_NULL(321001, "保存机构交易员参数[{0}]不能为空"),
    ORG_ORGAN_EMAIL_REGISTERED(321002, "邮箱[{0}]已被注册，请更换。"), ORG_ORGAN_PHONE_REGISTERED(321003, "手机号[{0}-{1}]已被注册，请更换。"),
    ORG_ORGAN_CART_NUMBER_REGISTERED(321004, "证件号码[{0}]已被个人客户使用，请更换。"),
    ORG_ORGAN_EMAIL_FORMAT_ERROR(321005, "邮箱[{0}]格式不正确。"), ORG_ORGAN_PHONE_FORMAT_ERROR(321006, "手机号[{0}-{1}]格式不正确。"),
    ORG_ORGAN_PHONE_DATA_ERROR(321007, "手机号[{0}-{1}]数据不完整, 若不需要请清空手机号数据。"),
    ORG_ORGAN_PHONE_DATA_DUPLICATE(321008, "手机号[{0}-{1}]，存在重复数据。"),
    ORG_ORGAN_EMAIL_DATA_DUPLICATE(321009, "邮箱[{0}]，存在重复数据。"),
    ORG_ORGAN_OPEN_FUND_AUTH_PARAMS_NOT_EMPTY(321010, "机构户基金开通选项不能为空。"),

    ///////////////////////// 恒生业务接口异常 350000 --- 350999 开始/////////////////////////
    HUNDSUN_T2_INTERFACE_ERROR(350000, "恒生T2接口[{0}]异常"),

    ///////////////////////// 用户其他证件部分异常 330000 --- 330059 结束/////////////////////////
    CUSTOMER_CHINA_INFO_NOT_EXIST(330001, "用户【userId:{0}】对应的A股通数据不存在!"),

    ORG_COMPANY_INFO_NOT_EXIST(330002, "用户【userId:{0}】对应的机构数据不存在!"),

    USER_OPEN_ACCOUNT_STATUS_ERROR(330003, "用户未开户成功，请勿修改证件信息"),

    EDDA_USER_CRED_TYPE_ERROR(330004, "证件类型不允许重复"),

    CRED_NUMBER_FORMAT_ERROR(330005, "证件号码格式错误，请确认修改"),

    CRED_MANAGE_EMPTY_ERROR(330006, "找不到对应的记录，请检查参数是否正常"),

    USER_NOT_FINISH_OPEN_ACCOUNT(330007, "该用户信息无法查询，请检查用户是否已开户"),

    CRED_TYPE_NOT_NULL_ERROR(330008, "证件类型不能为空"),

    CRED_NUMBER_NOT_NULL_ERROR(330009, "证件号码不能为空"),

    CRED_MOD_REASON_NOT_NULL_ERROR(330010, "修改原因不能为空"),

    CRED_JIGOU_NOT_SUPPORT_ERROR(330011, "机构用户不允许查询、修改证件信息"),

    CRED_LIST_NOT_NULL_ERROR(330012, "证件列表不能为空"),

    FUND_ACCOUNT_EMPTY_ERROR(330013, "用户资金账号为空"),

    FUND_ACCOUNT_ERROR(330014, "资金账号和用户ID不匹配"),

    RATE_MANAGE_INFO_ERROR(330015, "利率类别配置异常"),

    CRED_TYPE_AND_CRED_NUMBER_REPETITION(330016, "证件号已存在"),

    FUND_ACCOUNT_ADD_ERROR(330017, "生成资金账号异常"),

    ;

    private Integer code;

    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMessageByCode(Integer code) {
        if (code == null) {
            return NO_MESSAGE_FOUND.getMessage();
        }
        for (ExceptionEnum exceptionEnum : ExceptionEnum.values()) {
            if (code.equals(exceptionEnum.getCode())) {
                return exceptionEnum.getMessage();
            }
        }
        return NO_MESSAGE_FOUND.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
