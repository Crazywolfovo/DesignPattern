package com.designpattern.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 用Map管理多个单例对象
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    /**
     * 不建议hashtable，性能不行
     * hashMap非线程安全
     */
    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (null != key && !"".equals(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
