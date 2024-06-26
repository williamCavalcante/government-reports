package project.com.courseConclusionProject.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "prf_concessionaires")
public class PrfStation {
    @Id
    @Column(name = "prf_station_id")
    private UUID id;

    @Column(name = "concessionaria")
    private String concessionaire;

    @Column(name = "nome_posto_prf")
    private String PrfStationName;

    @Column(name = "rodovia")
    private String highWay;

    @Column(name = "uf")
    private String uf;

    @Column(name = "km_M")
    private BigDecimal kmM;

    @Column(name = "municipio")
    private String county;

    @Column(name = "tipo_pista")
    private String trackType;

    @Column(name = "sentido")
    private String direction;

    @Column(name = "situacao")
    private String situation;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    // getters and setters
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

