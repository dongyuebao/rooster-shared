package com.incarcloud.rooster.bigtable;

import com.incarcloud.rooster.datapack.DataPackObject;

/**
 * @author Fan Beibei
 * @Description: bigtable 操作抽象接口
 * @date 2017/7/5 9:43
 */
public interface IBigTable {

    /**
     * 保存数据
     * @param rowKey 行健
     * @param data 数据
     * @param tableName 表格名
     * @throws Exception
     */
    public void save(String rowKey, DataPackObject data, String tableName) throws Exception;
    
    /**
     * 关闭，回收资源
     */
    public  void close();
}
