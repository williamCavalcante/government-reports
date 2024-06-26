package project.com.courseConclusionProject.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "prf_radar")
public class PrfRadar {
    @Id
    @Column(name = "radar_id")
    private String id;
    @Column(name = "concessionaria")
    private String concessionaria;
    @Column(name = "ano_do_pnv_snv")
    private int anoDoPnvSnv;
    @Column(name = "tipo_de_radar")
    private String tipoDeRadar;
    @Column(name = "rodovia")
    private String rodovia;
    @Column(name = "uf")
    private String uf;
    @Column(name = "km_m")
    private BigDecimal kmM;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "tipo_pista")
    private String tipoPista;
    @Column(name = "sentido")
    private String sentido;
    @Column(name = "situacao")
    private boolean situacao;
    @Column(name = "latitude")
    private BigDecimal latitude;
    @Column(name = "longitude")
    private BigDecimal longitude;
    @Column(name = "velocidade_leve")
    private int velocidadeLeve;
    @Column(name = "velocidade_pesado")
    private int velocidadePesado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(String concessionaria) {
        this.concessionaria = concessionaria;
    }

    public int getAnoDoPnvSnv() {
        return anoDoPnvSnv;
    }

    public void setAnoDoPnvSnv(int anoDoPnvSnv) {
        this.anoDoPnvSnv = anoDoPnvSnv;
    }

    public String getTipoDeRadar() {
        return tipoDeRadar;
    }

    public void setTipoDeRadar(String tipoDeRadar) {
        this.tipoDeRadar = tipoDeRadar;
    }

    public String getRodovia() {
        return rodovia;
    }

    public void setRodovia(String rodovia) {
        this.rodovia = rodovia;
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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoPista() {
        return tipoPista;
    }

    public void setTipoPista(String tipoPista) {
        this.tipoPista = tipoPista;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public int getVelocidadeLeve() {
        return velocidadeLeve;
    }

    public void setVelocidadeLeve(int velocidadeLeve) {
        this.velocidadeLeve = velocidadeLeve;
    }

    public int getVelocidadePesado() {
        return velocidadePesado;
    }

    public void setVelocidadePesado(int velocidadePesado) {
        this.velocidadePesado = velocidadePesado;
    }
}
