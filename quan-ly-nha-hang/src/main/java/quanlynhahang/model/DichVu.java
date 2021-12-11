package quanlynhahang.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Table(name = "dichvu")
@Entity
public class DichVu implements Serializable {
	
	@Id
	@Column(name = "id_dichvu")
	private int idDichVu;
	
	@Column(name = "name_dichvu")
	private String nameDichVu;
	
	@Column(name = "desc_dichvu")
	private String descDichVu;
	
	@Column(name = "price_dichvu")
	private Long priceDichVu;
	
	@OneToMany(mappedBy = "dichVu")
	@JsonManagedReference
	private List<BookingDetail> bookingDetail;
	

	
	public List<BookingDetail> getBookingDetail() {
		return bookingDetail;
	}
	public void setBookingDetail(List<BookingDetail> bookingDetail) {
		this.bookingDetail = bookingDetail;
	}
	public int getIdDichVu() {
		return idDichVu;
	}
	public void setIdDichVu(int idDichVu) {
		this.idDichVu = idDichVu;
	}
	public String getNameDichVu() {
		return nameDichVu;
	}
	public void setNameDichVu(String nameDichVu) {
		this.nameDichVu = nameDichVu;
	}
	public String getDescDichVu() {
		return descDichVu;
	}
	public void setDescDichVu(String descDichVu) {
		this.descDichVu = descDichVu;
	}
	public Long getPriceDichVu() {
		return priceDichVu;
	}
	public void setPriceDichVu(Long priceDichVu) {
		this.priceDichVu = priceDichVu;
	}
	
	

}
