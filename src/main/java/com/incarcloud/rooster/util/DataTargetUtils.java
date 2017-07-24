package com.incarcloud.rooster.util;/**
 * Created by fanbeibei on 2017/7/5.
 */


import com.google.gson.Gson;
import com.incarcloud.rooster.datapack.ETargetType;
import com.incarcloud.rooster.datatarget.DataPackObject;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/5 14:50
 */
public class DataTargetUtils {
    private static Gson gson = GsonFactory.newInstance("yyyyMMddHHmmssSSS").createGson();

    private DataTargetUtils(){}

    /**
     * 转换为json字符串
     * @param target
     * @return
     */
    public static  String  toJson(DataPackObject target){
        return  gson.toJson(target);
    }

    /**
     * json转换为DataTarget对象
     * @param json
     * @return
     */
    public static DataPackObject fromJson(String json){
        return  gson.fromJson(json,DataPackObject.class);
    }


    /**
     * 获取表名
     *
     * @param type
     * @return
     */
    public static  String  getTableName(ETargetType type){
        return "maxus_tbox";
    }


}
