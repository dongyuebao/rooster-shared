package com.incarcloud.rooster.datapack;

import com.incarcloud.rooster.datapack.Any4DataParser;
import com.incarcloud.rooster.util.PackageUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * DataParser关系管理类
 *
 * @author Aaric, created on 2017-06-27T17:11.
 * @since 2.0
 */
public class DataParserManager {
    private DataParserManager() {
    }

    /**
     * 解析器关系
     */
    private static Map<String, Class<?>> dataParserMap = new HashMap<>();

    /**
     * 注册解析器类
     *
     * @param tag   tag
     * @param clazz class
     */
    public static void register(String tag, Class<?> clazz) {
        dataParserMap.put(tag, clazz);
    }

    /**
     * 获得解析类
     *
     * @param tag
     * @return
     */
    public static Class<?> getDataParserClass(String tag) {
        return dataParserMap.get(tag);
    }


    /**
     * 会加载同一个包下的所有类
     */
    public static void loadClassOfSamePackage() {
        try {
            PackageUtils.loadClassesOfPackage("com.incarcloud.rooster.datapack", true);
        } catch (IOException e) {
            //
        }
    }

    public static void main(String[] args) {
        loadClassOfSamePackage();
        System.out.println(getDataParserClass("incar-any4-1.0.0"));
    }


}