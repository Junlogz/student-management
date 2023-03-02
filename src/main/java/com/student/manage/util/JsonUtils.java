package com.student.manage.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Map;


/**
 *
 * @author xingliang
 * @since 2018/10/22
 */
public class JsonUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {

        // 序列化为json字符串时，应该忽略空值，更简洁
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // 反序列化的时候如果多了其他属性,不抛出异常
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 如果是空对象的时候,不抛异常
        OBJECT_MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

    }

    private JsonUtils() {}

    /**
     * serialize object to json
     *
     * @param object
     * @param <T>
     * @return
     */
    public static <T> String toJson(T object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        } catch (Exception e) {
            LOGGER.warn("对象：{}，转JSON字符串失败, 异常信息为：{}", object, e);
        }
        return null;
    }

    /**
     * parse json to object
     *
     * @param json
     * @param classType
     * @param <T>
     * @return
     */
    public static <T> T parseJson(String json, Class<T> classType) {
        if (!StringUtils.isEmpty(json)) {
            try {
                return OBJECT_MAPPER.readValue(json, classType);
            } catch (Exception e) {
                LOGGER.warn("对象字符串：{}，反序列化Class：{} 失败, 异常信息为：{}", json, classType, e);
            }
        }
        return null;
    }

    public static <T> Object parseJson(String json, TypeReference classType) {
        if (!StringUtils.isEmpty(json)) {
            try {
                return OBJECT_MAPPER.readValue(json, classType);
            } catch (Exception e) {
                LOGGER.warn("对象字符串：{}，反序列化TypeReference：{} 失败, 异常信息为：{}", json, classType, e);
            }
        }
        return null;
    }

//    /**
//     * 将字符串解析成map的key-value键值对
//     *
//     * @param jsonString
//     *            json字符串
//     * @return
//     */
//    public static Map<String, String> parseJsonToMapString(String jsonString) {
//        return parseJson(jsonString, new TypeReference<Map<String, String>>() {});
//    }
//
//    /**
//     * 将字符串解析成map的key-value键值对
//     *
//     * @param jsonString
//     *            json字符串
//     * @return
//     */
//    public static Map<String, Object> parseJsonToMap(String jsonString) {
//        return parseJson(jsonString, new TypeReference<Map<String, Object>>() {});
//    }

    public static Boolean isJson(String content) {
        if (StringUtils.isEmpty(content)) {
            return false;
        }
        try {
            OBJECT_MAPPER.readTree(content);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * 将字符串解析成map的key-value键值对
     *
     * @param jsonString
     *            json字符串
     * @return
     */
    public static JsonNode parseJsonNode(String jsonString) {
        try {
            return OBJECT_MAPPER.readTree(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

