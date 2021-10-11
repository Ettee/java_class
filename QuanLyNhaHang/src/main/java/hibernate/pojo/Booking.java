/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Ettee
 */
@Entity
@Table(name = "booking")
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_booking;
    @ManyToOne
    @JoinColumn(name = "id_sanh_cuoi")
    private SanhCuoi id_sanh_cuoi;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User id_user;
    @ManyToOne
    @JoinColumn(name = "id_menu")
    private Menu id_menu;
    @Temporal(TemporalType.TIMESTAMP)
    private Date time_booking;
    private BigDecimal total_price;
    private Boolean check_out;

    /**
     * @return the id_booking
     */
    public int getId_booking() {
        return id_booking;
    }

    /**
     * @param id_booking the id_booking to set
     */
    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    /**
     * @return the id_sanh_cuoi
     */
    public SanhCuoi getId_sanh_cuoi() {
        return id_sanh_cuoi;
    }

    /**
     * @param id_sanh_cuoi the id_sanh_cuoi to set
     */
    public void setId_sanh_cuoi(SanhCuoi id_sanh_cuoi) {
        this.id_sanh_cuoi = id_sanh_cuoi;
    }

    /**
     * @return the id_user
     */
    public User getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(User id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the id_menu
     */
    public Menu getId_menu() {
        return id_menu;
    }

    /**
     * @param id_menu the id_menu to set
     */
    public void setId_menu(Menu id_menu) {
        this.id_menu = id_menu;
    }

    /**
     * @return the time_booking
     */
    public Date getTime_booking() {
        return time_booking;
    }

    /**
     * @param time_booking the time_booking to set
     */
    public void setTime_booking(Date time_booking) {
        this.time_booking = time_booking;
    }

    /**
     * @return the total_price
     */
    public BigDecimal getTotal_price() {
        return total_price;
    }

    /**
     * @param total_price the total_price to set
     */
    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
    }

    /**
     * @return the check_out
     */
    public Boolean getCheck_out() {
        return check_out;
    }

    /**
     * @param check_out the check_out to set
     */
    public void setCheck_out(Boolean check_out) {
        this.check_out = check_out;
    }
    
    
    
}
