/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

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
@Table(name = "user_type")
public class UserType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_type;
    private int name_type;
    @OneToMany(mappedBy="type_user")
    private List<User> user;

    /**
     * @return the id_type
     */
    public int getId_type() {
        return id_type;
    }

    /**
     * @param id_type the id_type to set
     */
    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    /**
     * @return the name_type
     */
    public int getName_type() {
        return name_type;
    }

    /**
     * @param name_type the name_type to set
     */
    public void setName_type(int name_type) {
        this.name_type = name_type;
    }

	private List<User> getUser() {
		return user;
	}

	private void setUser(List<User> user) {
		this.user = user;
	}
}
