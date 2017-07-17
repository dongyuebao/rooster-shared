package com.incarcloud.rooster.gather.cmd.client;/**
 * Created by fanbeibei on 2017/7/17.
 */

import com.incarcloud.rooster.gather.cmd.CommandType;

/**
 * @author Fan Beibei
 * @Description: CommandClient的抽象
 * @date 2017/7/17 11:15
 */
public abstract class AbstractCommandClient implements CommandClient {

    @Override
    public void sendCommand(String vin, CommandType command) throws Exception {
        String url = getServerUrl(vin);
        sendCommand(url, vin, command);
    }

    /**
     * 根据vin码获取服务端地址
     *
     * @param vin 车辆vin码
     * @return
     */
    protected abstract String getServerUrl(String vin);

    /**
     * @param url     服务端地址
     * @param vin     车辆vin码
     * @param command 指令类型
     * @throws Exception
     */
    public abstract void sendCommand(String url, String vin, CommandType command) throws Exception;


}
