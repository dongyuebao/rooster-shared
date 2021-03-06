package com.incarcloud.rooster.datapack;

import com.incarcloud.rooster.util.PackageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DataParser关系管理类
 *
 * @author Aaric, created on 2017-06-27T17:11.
 * @since 2.0
 */
public class DataParserManager {
    private static Logger s_logger = LoggerFactory.getLogger(DataParserManager.class);



    private DataParserManager() { }


    /**
     * 解析器关系  protocol -> parser
     */
    private static Map<String, Class<?>> dataParserMap = new ConcurrentHashMap<>();

    /**
     * 缓存解析器对象避免Eden区频繁GC
     */
    private static Map<String, IDataParser> dataParserCache = new ConcurrentHashMap<>();


    /**
     * 注册解析器类
     *
     * @param tag tag
     * @param clazz class
     */
    public static void register(String tag, Class<?> clazz) {
        dataParserMap.put(tag.trim(), clazz);
    }

    /**
     * 获得解析类
     *
     * @param protocol
     * @return class
     */
    public static Class<?> getDataParserClass(String protocol) {
        return dataParserMap.get(protocol.trim());
    }

    /**
     * 会加载同一个包下的所有类
     */
    public static void loadClassOfSamePackage() {
        try {
            PackageUtils.loadClassesOfPackage("com.incarcloud.rooster.datapack", true);
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }



    /**
     * 获取解析器对象
     *
     * @param protocol
     * @return
     */
    public static IDataParser getDataParser(String protocol) {
        IDataParser dataParser = dataParserCache.get(protocol);
        if (null != dataParser) {
            return dataParser;
        }

        Class<?> clazz = getDataParserClass(protocol);
        if (null == clazz) {
            return null;
        }


        try {
            dataParser = (IDataParser) clazz.newInstance();

            if (null != dataParser) {
                dataParserCache.put(protocol, dataParser);
            }
        } catch (Exception e) {
            s_logger.error(clazz + " newInstance error!!! " + e.getMessage());
        }

        return dataParser;
    }
}
