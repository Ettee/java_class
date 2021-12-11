package quanlynhahang.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Table(name="booking_detail")
@Entity
public class BookingDetail implements Serializable{
	@Id
	@Column(name="idbooking_detail")
	private int idBookingDetail;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_booking",nullable=false)
	private Booking booking;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_dichvu",nullable=false)
	private DichVu dichVu;
	
	@Column(name="price")
	private Long price;
	
	@Column(name="quantity")
	private int quantity;

	public int getIdBookingDetail() {
		return idBookingDetail;
	}

	public void setIdBookingDetail(int idBookingDetail) {
		this.idBookingDetail = idBookingDetail;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public DichVu getDichVu() {
		return dichVu;
	}

	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
