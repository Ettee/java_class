package quanlynhahang.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Table(name="booking")
@Entity
public class Booking implements Serializable{
	@Id
	@Column(name="id_booking")
	private int idBooking;
	

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_sanh_cuoi", nullable=false)
	private SanhCuoi sanhCuoi;
	
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_user", nullable=false)
	private User user;
	
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_menu", nullable=false)
	private Menu menu;
	
	@Column(name="time_booking")
	private Timestamp timeBooking;
	
	@Column(name="total_price")
	private Long totalPrice;
	
	@Column(name="check_out")
	private Boolean checkout;
	
	@OneToMany(mappedBy = "booking")
	@JsonManagedReference
	private List<BookingDetail> bookingDetail;
	
	
	//get & set
	public List<BookingDetail> getBookingDetail() {
		return bookingDetail;
	}
	public void setBookingDetail(List<BookingDetail> bookingDetail) {
		this.bookingDetail = bookingDetail;
	}
	public int getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(int idBooking) {
		this.idBooking = idBooking;
	}

	public SanhCuoi getSanhCuoi() {
		return sanhCuoi;
	}
	public void setSanhCuoi(SanhCuoi sanhCuoi) {
		this.sanhCuoi = sanhCuoi;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Timestamp getTimeBooking() {
		return timeBooking;
	}
	public void setTimeBooking(Timestamp timeBooking) {
		this.timeBooking = timeBooking;
	}
	public Long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Boolean getCheckout() {
		return checkout;
	}
	public void setCheckout(Boolean checkout) {
		this.checkout = checkout;
	}
	
}
