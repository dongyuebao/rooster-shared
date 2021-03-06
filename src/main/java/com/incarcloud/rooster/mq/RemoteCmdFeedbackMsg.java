package com.incarcloud.rooster.mq;

/**
 * 远程控制命令MQ反馈实体
 *
 * @author Aaric, created on 2018-01-10T16:00.
 * @since 2.1.12-SNAPSHOT
 */
public class RemoteCmdFeedbackMsg {

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
     * 发送状态：0-失败, 1-成功
     */
    private Integer status;

    /**
     * 异常信息
     */
    private String exceptionMessage;

    public RemoteCmdFeedbackMsg() {
    }

    public RemoteCmdFeedbackMsg(RemoteCmdSendMsg msg, Integer status) {
        this.refId = msg.getRefId();
        this.deviceId = msg.getDeviceId();
        this.packId = msg.getPackId();
        this.cmdType = msg.getCmdType();
        this.status = status;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
