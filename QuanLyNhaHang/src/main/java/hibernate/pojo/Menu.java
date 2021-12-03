/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ettee
 */
@Entity
@Table(name = "menu")
public class Menu implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_menu;
    private String name_menu;
    private String desc_menu;
    private BigDecimal price_menu;
    @OneToMany(mappedBy="id_menu")
    private Set<Booking> booking;

    /**
     * @return the id_menu
     */
    public int getId_menu() {
        return id_menu;
    }

    /**
     * @param id_menu the id_menu to set
     */
    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    /**
     * @return the name_menu
     */
    public String getName_menu() {
        return name_menu;
    }

    /**
     * @param name_menu the name_menu to set
     */
    public void setName_menu(String name_menu) {
        this.name_menu = name_menu;
    }

    /**
     * @return the desc_menu
     */
    public String getDesc_menu() {
        return desc_menu;
    }

    /**
     * @param desc_menu the desc_menu to set
     */
    public void setDesc_menu(String desc_menu) {
        this.desc_menu = desc_menu;
    }

    /**
     * @return the price_menu
     */
    public BigDecimal getPrice_menu() {
        return price_menu;
    }

    /**
     * @param price_menu the price_menu to set
     */
    public void setPrice_menu(BigDecimal price_menu) {
        this.price_menu = price_menu;
    }

	private Set<Booking> getBooking() {
		return booking;
	}

	private void setBooking(Set<Booking> booking) {
		this.booking = booking;
	}
}
