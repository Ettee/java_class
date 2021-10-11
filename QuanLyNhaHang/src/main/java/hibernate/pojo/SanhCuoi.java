/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Ettee
 */
@Entity
@Table(name = "sanh_cuoi")
public class SanhCuoi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sanh_cuoi;
    private String name_sanh_cuoi;
    private BigDecimal price_sanhcuoi_sang;
    private BigDecimal price_sanhcuoi_trua;
    private BigDecimal price_sanhcuoi_toi;
    private BigDecimal price_sanhcuoi_sang_cuoituan;
    private BigDecimal price_sanhcuoi_trua_cuoituan;
    private BigDecimal price_sanhcuoi_toi_cuoituan;

    /**
     * @return the id_sanh_cuoi
     */
    public int getId_sanh_cuoi() {
        return id_sanh_cuoi;
    }

    /**
     * @param id_sanh_cuoi the id_sanh_cuoi to set
     */
    public void setId_sanh_cuoi(int id_sanh_cuoi) {
        this.id_sanh_cuoi = id_sanh_cuoi;
    }

    /**
     * @return the name_sanh_cuoi
     */
    public String getName_sanh_cuoi() {
        return name_sanh_cuoi;
    }

    /**
     * @param name_sanh_cuoi the name_sanh_cuoi to set
     */
    public void setName_sanh_cuoi(String name_sanh_cuoi) {
        this.name_sanh_cuoi = name_sanh_cuoi;
    }

    /**
     * @return the price_sanhcuoi_sang
     */
    public BigDecimal getPrice_sanhcuoi_sang() {
        return price_sanhcuoi_sang;
    }

    /**
     * @param price_sanhcuoi_sang the price_sanhcuoi_sang to set
     */
    public void setPrice_sanhcuoi_sang(BigDecimal price_sanhcuoi_sang) {
        this.price_sanhcuoi_sang = price_sanhcuoi_sang;
    }

    /**
     * @return the price_sanhcuoi_trua
     */
    public BigDecimal getPrice_sanhcuoi_trua() {
        return price_sanhcuoi_trua;
    }

    /**
     * @param price_sanhcuoi_trua the price_sanhcuoi_trua to set
     */
    public void setPrice_sanhcuoi_trua(BigDecimal price_sanhcuoi_trua) {
        this.price_sanhcuoi_trua = price_sanhcuoi_trua;
    }

    /**
     * @return the price_sanhcuoi_toi
     */
    public BigDecimal getPrice_sanhcuoi_toi() {
        return price_sanhcuoi_toi;
    }

    /**
     * @param price_sanhcuoi_toi the price_sanhcuoi_toi to set
     */
    public void setPrice_sanhcuoi_toi(BigDecimal price_sanhcuoi_toi) {
        this.price_sanhcuoi_toi = price_sanhcuoi_toi;
    }

    /**
     * @return the price_sanhcuoi_sang_cuoituan
     */
    public BigDecimal getPrice_sanhcuoi_sang_cuoituan() {
        return price_sanhcuoi_sang_cuoituan;
    }

    /**
     * @param price_sanhcuoi_sang_cuoituan the price_sanhcuoi_sang_cuoituan to set
     */
    public void setPrice_sanhcuoi_sang_cuoituan(BigDecimal price_sanhcuoi_sang_cuoituan) {
        this.price_sanhcuoi_sang_cuoituan = price_sanhcuoi_sang_cuoituan;
    }

    /**
     * @return the price_sanhcuoi_trua_cuoituan
     */
    public BigDecimal getPrice_sanhcuoi_trua_cuoituan() {
        return price_sanhcuoi_trua_cuoituan;
    }

    /**
     * @param price_sanhcuoi_trua_cuoituan the price_sanhcuoi_trua_cuoituan to set
     */
    public void setPrice_sanhcuoi_trua_cuoituan(BigDecimal price_sanhcuoi_trua_cuoituan) {
        this.price_sanhcuoi_trua_cuoituan = price_sanhcuoi_trua_cuoituan;
    }

    /**
     * @return the price_sanhcuoi_toi_cuoituan
     */
    public BigDecimal getPrice_sanhcuoi_toi_cuoituan() {
        return price_sanhcuoi_toi_cuoituan;
    }

    /**
     * @param price_sanhcuoi_toi_cuoituan the price_sanhcuoi_toi_cuoituan to set
     */
    public void setPrice_sanhcuoi_toi_cuoituan(BigDecimal price_sanhcuoi_toi_cuoituan) {
        this.price_sanhcuoi_toi_cuoituan = price_sanhcuoi_toi_cuoituan;
    }
}
