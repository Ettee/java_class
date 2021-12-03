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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author Ettee
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;
    private String name_user;
    @ManyToOne()
    @JoinColumn(name="id_type")
    private UserType type_user;
    
    private String avarta;
    private String password_user;
    @OneToMany(mappedBy="id_user")
    private Set <Booking> booking;

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the name_user
     */
    public String getName_user() {
        return name_user;
    }

    /**
     * @param name_user the name_user to set
     */
    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    /**
     * @return the type_user
     */
    public UserType getType_user() {
        return type_user;
    }

    /**
     * @param type_user the type_user to set
     */
    public void setType_user(UserType type_user) {
        this.type_user = type_user;
    }

    /**
     * @return the avarta
     */
    public String getAvarta() {
        return avarta;
    }

    /**
     * @param avarta the avarta to set
     */
    public void setAvarta(String avarta) {
        this.avarta = avarta;
    }

    /**
     * @return the password_user
     */
    public String getPassword_user() {
        return password_user;
    }

    /**
     * @param password_user the password_user to set
     */
    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

	private Set <Booking> getBooking() {
		return booking;
	}

	private void setBooking(Set <Booking> booking) {
		this.booking = booking;
	}
}
