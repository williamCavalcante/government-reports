package project.com.courseConclusionProject.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class PrfStationDto {

    private UUID id;
    private String concessionaire;
    private String PrfStationName;
    private String highWay;
    private String uf;
    private BigDecimal kmM;
    private String county;
    private String trackType;
    private String direction;
    private String situation;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getConcessionaire() {
        return concessionaire;
    }

    public void setConcessionaire(String concessionaire) {
        this.concessionaire = concessionaire;
    }

    public String getPrfStationName() {
        return PrfStationName;
    }

    public void setPrfStationName(String prfStationName) {
        PrfStationName = prfStationName;
    }

    public String getHighWay() {
        return highWay;
    }

    public void setHighWay(String highWay) {
        this.highWay = highWay;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public BigDecimal getKmM() {
        return kmM;
    }

    public void setKmM(BigDecimal kmM) {
        this.kmM = kmM;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
