package org.geekpower.toolkit.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 基于谷歌Gson封装工具类
 * 
 * @author songyz
 * @createTime 2020-04-08 17:42:41
 */
public final class JSONHelper {

    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    private JSONHelper() {
    }

    /**
     * 将对象序列号为Json字符串
     * 
     * @param obj
     * @return
     */
    public static String toJSON(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * 将Json字符串反序列化成实体
     * 
     * @param json
     * @param cls
     * @return
     */
    public static <T> T fromJSON(String json, Class<T> cls) {
        return gson.fromJson(json, cls);
    }

    /**
     * 将Json字符串反序列化成复杂实体
     * 
     * @param json
     * @param cls
     * @return
     */
    public static <T> T fromJSON(String json, TypeToken<T> type) {
        return gson.fromJson(json, type.getType());
    }
}
