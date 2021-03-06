package com.incarcloud.rooster.mq;

/**
 * 远程控制命令MQ发送实体
 *
 * @author Aaric, created on 2018-01-10T15:57.
 * @since 2.1.12-SNAPSHOT
 */
public class RemoteCmdSendMsg {

    /**
     * 业务ID
     */
    private String refId;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 数据包ID(消息流水号)
     */
    private Integer packId;

    /**
     * 命令类型<br>
     *
     * @see com.incarcloud.rooster.gather.cmd.CommandType
     */
    private String cmdType;

    /**
     * 命令数据包(BASE64加密，使用转byte[])
     */
    private String cmdString;

    public RemoteCmdSendMsg() {
    }

    public RemoteCmdSendMsg(String deviceId, String cmdString) {
        this.deviceId = deviceId;
        this.cmdString = cmdString;
    }

    public RemoteCmdSendMsg(String deviceId, Integer packId, String cmdString) {
        this.deviceId = deviceId;
        this.packId = packId;
        this.cmdString = cmdString;
    }

    public RemoteCmdSendMsg(String deviceId, Integer packId, String cmdType, String cmdString) {
        this.deviceId = deviceId;
        this.packId = packId;
        this.cmdType = cmdType;
        this.cmdString = cmdString;
    }

    public RemoteCmdSendMsg(String refId, String deviceId, Integer packId, String cmdType, String cmdString) {
        this.refId = refId;
        this.deviceId = deviceId;
        this.packId = packId;
        this.cmdType = cmdType;
        this.cmdString = cmdString;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getPackId() {
        return packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public String getCmdType() {
        return cmdType;
    }

    public void setCmdType(String cmdType) {
        this.cmdType = cmdType;
    }

    public String getCmdString() {
        return cmdString;
    }

    public void setCmdString(String cmdString) {
        this.cmdString = cmdString;
    }
}
