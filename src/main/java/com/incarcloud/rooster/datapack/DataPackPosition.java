package com.incarcloud.rooster.datapack;

import java.util.Date;

/**
 * 位置数据<br>
 * <b>无效定位数据不记录，采用WGS-84坐标系</b>
 * <i>异常与无效定义：</i><br>
 * <ul>
 * <li>0xFE-异常，0xFF-无效</li>
 * <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackPosition extends DataPackObject {

    /**
     * 定位方式：0-无效数据
     */
    public static final int POSITION_MODE_INVALID = 0;

    /**
     * 定位方式：1-基站定位
     */
    public static final int POSITION_MODE_BASE_STATION = 1;

    /**
     * 定位方式：2-GPS 定位
     */
    public static final int POSITION_MODE_GPS = 2;

    /**
     * 定位方式：3-北斗卫星定位
     */
    public static final int POSITION_MODE_BEIDOU = 3;

    /**
     * 定位方式：4-GLONASS卫星定位
     */
    public static final int POSITION_MODE_GLONASS = 4;

    /**
     * 定位方式：5-Galileo卫星定位
     */
    public static final int POSITION_MODE_GALILEO = 5;

    /**
     * 定位方式：6-未知
     */
    public static final int POSITION_MODE_UNKNOWN = 6;

    /**
     * 车速（km/h）
     */
    private Float speed;
    /**
     * 当前行程行驶距离(m)
     */
    private Integer travelDistance;
    /**
     * 经度
     */
    private Double longitude;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 海拔高度，单位为米（m）<br>
     * JTT808新增
     */
    private Double altitude;
    /**
     * 方向： 0~360, 正北为 0 度，顺时针旋转, 用字符串（无结束符）表示；如不支持，用“-“替代
     */
    private Float direction;
    /**
     * 定位方式：0-无效数据，1-基站定位，2-GPS 定位，3-北斗定位，4-GLONASS卫星定位，5-Galileo卫星定位
     */
    private Integer positioMode;
    /**
     * 定位方式描述
     */
    private String positioModeDesc;
    /**
     * 定位时间
     */
    private Date positionTime;
    /**
     * 有效星数(LANDU-TBOX)
     */
    private Integer validStar;
    /**
     * 主电源状态
     */
    private String mainPowerStatus;
    /**
     * 通电状态
     */
    private String energizedStatus;

    public DataPackPosition(DataPackObject object) {
        super(object);
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(Integer travelDistance) {
        this.travelDistance = travelDistance;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Float getDirection() {
        return direction;
    }

    public void setDirection(Float direction) {
        this.direction = direction;
    }

    public Integer getPositioMode() {
        return positioMode;
    }

    public void setPositioMode(Integer positioMode) {
        this.positioMode = positioMode;
    }

    public String getPositioModeDesc() {
        return positioModeDesc;
    }

    public void setPositioModeDesc(String positioModeDesc) {
        this.positioModeDesc = positioModeDesc;
    }

    public Date getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Date positionTime) {
        this.positionTime = positionTime;
    }

    public Integer getValidStar() {
        return validStar;
    }

    public void setValidStar(Integer validStar) {
        this.validStar = validStar;
    }

    public String getMainPowerStatus() {
        return mainPowerStatus;
    }

    public void setMainPowerStatus(String mainPowerStatus) {
        this.mainPowerStatus = mainPowerStatus;
    }

    public String getEnergizedStatus() {
        return energizedStatus;
    }

    public void setEnergizedStatus(String energizedStatus) {
        this.energizedStatus = energizedStatus;
    }

    @Override
    public String toString() {
        return "DataPackPosition{" +
                "speed=" + speed +
                ", travelDistance=" + travelDistance +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", altitude=" + altitude +
                ", direction=" + direction +
                ", positioMode=" + positioMode +
                ", positioModeDesc='" + positioModeDesc + '\'' +
                ", positionTime=" + positionTime +
                ", validStar=" + validStar +
                ", mainPowerStatus='" + mainPowerStatus + '\'' +
                ", energizedStatus='" + energizedStatus + '\'' +
                '}';
    }
}
