package quanlynhahang.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import quanlynhahang.dto.RegisterUser;

@Table(name = "user")
@Entity
public class User implements Serializable {
	@Id
	@Column(name="id_user")
	private int idUser;
	
	@Column(name="name_user")
	private String nameUser;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="type_user", nullable=false)
	private UserType typeUser;
	
	@Column(name="avarta")
	private String avarta;
	
	@Column(name="password_user")
	private String password;
	
	@OneToMany(mappedBy = "user")
	@JsonManagedReference
	List<Booking> bookings ;

	public void setUserInfoByRegister(RegisterUser userInfo) {
		this.nameUser = userInfo.getUserName();
		this.password = userInfo.getPassword();
		this.avarta = userInfo.getAvartaFilePath();
	}
	
	
	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}


	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}



	public UserType getTypeUser() {
		return typeUser;
	}


	public void setTypeUser(UserType typeUser) {
		this.typeUser = typeUser;
	}


	public String getAvarta() {
		return avarta;
	}

	public void setAvarta(String avarta) {
		this.avarta = avarta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
