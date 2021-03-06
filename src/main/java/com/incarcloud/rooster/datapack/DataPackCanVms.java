package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanVms
 * @Description: can VMS  0x0CF10501 0x18C00501 0x18C00301
 * @date 2017-09-14 13:46
 */
public class DataPackCanVms extends DataPackObject {

    /**
     * 电机当前状态
     */
    private Integer motorStatus;
    /**
     * 电机温度是否过高
     */
    private Integer isMotorTempHigh;
    /**
     * 电机控制器温度是否过高
     */
    private Integer isMotorControlerTempHigh;
    /**
     * 电机控制器是否故障
     */
    private Integer isMotorControlerErr;
    /**
     * 电机直流母线电压
     */
    private Float voltageRange;
    /**
     * 加速踏板开度
     */
    private Integer aprRate;
    /**
     * 动力输出报警提示
     */
    private Integer outAlarmInfoNumber;
    /**
     * 电池组电流
     */
    private Float batteryGroupCurrent;
    /**
     * 电池组电压
     */
    private Float batteryGroupVoltage;
    /**
     * 剩余电量
     */
    private Integer leaveBattery;
    /**
     * 车速
     */
    private Float speed;
    /**
     * 电机系统温度
     */
    private Integer motorSysTemp;
    /**
     * 档位信息
     */
    private Integer gearStatus;
    /**
     * 钥匙位置信息
     */
    private Integer keyPos;
    /**
     * 车辆降功率运行状态
     */
    private Integer lowPowerStatus;
    /**
     * 空调使能
     */
    private Integer isAirconOpen;
    /**
     * PEPS认真状态
     */
    private Integer pepsStatus;
    /**
     * READY信号
     */
    private Integer isReady;
    /**
     * 接触器控制指令
     */
    private Integer contactorControlCommand;
    /**
     * 工作模式
     */
    private Integer workType;
    /**
     * 档位
     */
    private Integer gear;
    /**
     * 制动状态
     */
    private Integer brakStatus;
    /**
     * 电源控制
     */
    private Integer powerCtrl;
    /**
     * 降功率等级
     */
    private Integer deratStatus;
    /**
     * 点火钥匙位置信息
     */
    private Integer keyPosition;
    /**
     * 外接充电线连接状态
     */
    private Integer outchargelineConStatus;
    /**
     * 与充电机通讯状态
     */
    private Integer tochargeConStatus;
    /**
     * 车型类别
     */
    private Integer carType;
    /**
     * GPRS总正接触器锁止指令
     */
    private Integer gprsLockCommand;
    /**
     * 电池SOC
     */
    private Integer vmsSoc;

    public DataPackCanVms(DataPackObject dataPack) {
        super(dataPack);
    }

    public Integer getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(Integer motorStatus) {
        this.motorStatus = motorStatus;
    }

    public Integer getIsMotorTempHigh() {
        return isMotorTempHigh;
    }

    public void setIsMotorTempHigh(Integer isMotorTempHigh) {
        this.isMotorTempHigh = isMotorTempHigh;
    }

    public Integer getIsMotorControlerTempHigh() {
        return isMotorControlerTempHigh;
    }

    public void setIsMotorControlerTempHigh(Integer isMotorControlerTempHigh) {
        this.isMotorControlerTempHigh = isMotorControlerTempHigh;
    }

    public Integer getIsMotorControlerErr() {
        return isMotorControlerErr;
    }

    public void setIsMotorControlerErr(Integer isMotorControlerErr) {
        this.isMotorControlerErr = isMotorControlerErr;
    }

    public Float getVoltageRange() {
        return voltageRange;
    }

    public void setVoltageRange(Float voltageRange) {
        this.voltageRange = voltageRange;
    }

    public Integer getAprRate() {
        return aprRate;
    }

    public void setAprRate(Integer aprRate) {
        this.aprRate = aprRate;
    }

    public Integer getOutAlarmInfoNumber() {
        return outAlarmInfoNumber;
    }

    public void setOutAlarmInfoNumber(Integer outAlarmInfoNumber) {
        this.outAlarmInfoNumber = outAlarmInfoNumber;
    }

    public Float getBatteryGroupCurrent() {
        return batteryGroupCurrent;
    }

    public void setBatteryGroupCurrent(Float batteryGroupCurrent) {
        this.batteryGroupCurrent = batteryGroupCurrent;
    }

    public Float getBatteryGroupVoltage() {
        return batteryGroupVoltage;
    }

    public void setBatteryGroupVoltage(Float batteryGroupVoltage) {
        this.batteryGroupVoltage = batteryGroupVoltage;
    }

    public Integer getLeaveBattery() {
        return leaveBattery;
    }

    public void setLeaveBattery(Integer leaveBattery) {
        this.leaveBattery = leaveBattery;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getMotorSysTemp() {
        return motorSysTemp;
    }

    public void setMotorSysTemp(Integer motorSysTemp) {
        this.motorSysTemp = motorSysTemp;
    }

    public Integer getGearStatus() {
        return gearStatus;
    }

    public void setGearStatus(Integer gearStatus) {
        this.gearStatus = gearStatus;
    }

    public Integer getKeyPos() {
        return keyPos;
    }

    public void setKeyPos(Integer keyPos) {
        this.keyPos = keyPos;
    }

    public Integer getLowPowerStatus() {
        return lowPowerStatus;
    }

    public void setLowPowerStatus(Integer lowPowerStatus) {
        this.lowPowerStatus = lowPowerStatus;
    }

    public Integer getIsAirconOpen() {
        return isAirconOpen;
    }

    public void setIsAirconOpen(Integer isAirconOpen) {
        this.isAirconOpen = isAirconOpen;
    }

    public Integer getPepsStatus() {
        return pepsStatus;
    }

    public void setPepsStatus(Integer pepsStatus) {
        this.pepsStatus = pepsStatus;
    }

    public Integer getIsReady() {
        return isReady;
    }

    public void setIsReady(Integer isReady) {
        this.isReady = isReady;
    }

    public Integer getContactorControlCommand() {
        return contactorControlCommand;
    }

    public void setContactorControlCommand(Integer contactorControlCommand) {
        this.contactorControlCommand = contactorControlCommand;
    }

    public Integer getWorkType() {
        return workType;
    }

    public void setWorkType(Integer workType) {
        this.workType = workType;
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public Integer getBrakStatus() {
        return brakStatus;
    }

    public void setBrakStatus(Integer brakStatus) {
        this.brakStatus = brakStatus;
    }

    public Integer getPowerCtrl() {
        return powerCtrl;
    }

    public void setPowerCtrl(Integer powerCtrl) {
        this.powerCtrl = powerCtrl;
    }

    public Integer getDeratStatus() {
        return deratStatus;
    }

    public void setDeratStatus(Integer deratStatus) {
        this.deratStatus = deratStatus;
    }

    public Integer getKeyPosition() {
        return keyPosition;
    }

    public void setKeyPosition(Integer keyPosition) {
        this.keyPosition = keyPosition;
    }

    public Integer getOutchargelineConStatus() {
        return outchargelineConStatus;
    }

    public void setOutchargelineConStatus(Integer outchargelineConStatus) {
        this.outchargelineConStatus = outchargelineConStatus;
    }

    public Integer getTochargeConStatus() {
        return tochargeConStatus;
    }

    public void setTochargeConStatus(Integer tochargeConStatus) {
        this.tochargeConStatus = tochargeConStatus;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getGprsLockCommand() {
        return gprsLockCommand;
    }

    public void setGprsLockCommand(Integer gprsLockCommand) {
        this.gprsLockCommand = gprsLockCommand;
    }

    public Integer getVmsSoc() {
        return vmsSoc;
    }

    public void setVmsSoc(Integer vmsSoc) {
        this.vmsSoc = vmsSoc;
    }

    @Override
    public String toString() {
        return "DataPackCanVms{" +
                "motorStatus=" + motorStatus +
                ", isMotorTempHigh=" + isMotorTempHigh +
                ", isMotorControlerTempHigh=" + isMotorControlerTempHigh +
                ", isMotorControlerErr=" + isMotorControlerErr +
                ", voltageRange=" + voltageRange +
                ", aprRate=" + aprRate +
                ", outAlarmInfoNumber=" + outAlarmInfoNumber +
                ", batteryGroupCurrent=" + batteryGroupCurrent +
                ", batteryGroupVoltage=" + batteryGroupVoltage +
                ", leaveBattery=" + leaveBattery +
                ", speed=" + speed +
                ", motorSysTemp=" + motorSysTemp +
                ", gearStatus=" + gearStatus +
                ", keyPos=" + keyPos +
                ", lowPowerStatus=" + lowPowerStatus +
                ", isAirconOpen=" + isAirconOpen +
                ", pepsStatus=" + pepsStatus +
                ", isReady=" + isReady +
                ", contactorControlCommand=" + contactorControlCommand +
                ", workType=" + workType +
                ", gear=" + gear +
                ", brakStatus=" + brakStatus +
                ", powerCtrl=" + powerCtrl +
                ", deratStatus=" + deratStatus +
                ", keyPosition=" + keyPosition +
                ", outchargelineConStatus=" + outchargelineConStatus +
                ", tochargeConStatus=" + tochargeConStatus +
                ", carType=" + carType +
                ", gprsLockCommand=" + gprsLockCommand +
                ", vmsSoc=" + vmsSoc +
                '}';
    }
}
