package quanlynhahang.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Table(name = "menu")
@Entity
public class Menu implements Serializable {
	
	@Id
	@Column(name="id_menu")
	private int idMenu;
	
	@Column(name="name_menu")
	private String nameMenu;
	
	@Column(name="desc_menu")
	private String descMenu;
	
	@Column(name="price_menu")
	private Long priceMenu;
	
	
	@OneToMany(mappedBy="menu")
	@JsonManagedReference
	private List<Booking> bookings;

	//get & set
	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getNameMenu() {
		return nameMenu;
	}

	public void setNameMenu(String nameMenu) {
		this.nameMenu = nameMenu;
	}

	public String getDescMenu() {
		return descMenu;
	}

	public void setDescMenu(String descMenu) {
		this.descMenu = descMenu;
	}

	public Long getPriceMenu() {
		return priceMenu;
	}

	public void setPriceMenu(Long priceMenu) {
		this.priceMenu = priceMenu;
	}
}
