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
@Table(name = "dichvu")
public class DichVu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dichvu;
    private String name_dichvu;
    private String desc_dichvu;
    private BigDecimal price_dichvu;

    /**
     * @return the id_dichvu
     */
    public int getId_dichvu() {
        return id_dichvu;
    }

    /**
     * @param id_dichvu the id_dichvu to set
     */
    public void setId_dichvu(int id_dichvu) {
        this.id_dichvu = id_dichvu;
    }

    /**
     * @return the name_dichvu
     */
    public String getName_dichvu() {
        return name_dichvu;
    }

    /**
     * @param name_dichvu the name_dichvu to set
     */
    public void setName_dichvu(String name_dichvu) {
        this.name_dichvu = name_dichvu;
    }

    /**
     * @return the desc_dichvu
     */
    public String getDesc_dichvu() {
        return desc_dichvu;
    }

    /**
     * @param desc_dichvu the desc_dichvu to set
     */
    public void setDesc_dichvu(String desc_dichvu) {
        this.desc_dichvu = desc_dichvu;
    }

    /**
     * @return the price_dichvu
     */
    public BigDecimal getPrice_dichvu() {
        return price_dichvu;
    }

    /**
     * @param price_dichvu the price_dichvu to set
     */
    public void setPrice_dichvu(BigDecimal price_dichvu) {
        this.price_dichvu = price_dichvu;
    }
}
