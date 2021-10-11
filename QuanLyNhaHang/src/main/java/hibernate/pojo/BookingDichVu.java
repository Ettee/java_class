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
@Table(name = "booking_dichvu")
public class BookingDichVu implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_booking_dichvu;

    private int id_dichvu;

    private int id_booking;
    
    /**
     * @return the id_booking_dichvu
     */
    public int getId_booking_dichvu() {
        return id_booking_dichvu;
    }

    /**
     * @param id_booking_dichvu the id_booking_dichvu to set
     */
    public void setId_booking_dichvu(int id_booking_dichvu) {
        this.id_booking_dichvu = id_booking_dichvu;
    }

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
}
