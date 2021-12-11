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

@Table(name = "sanh_cuoi")
@Entity
public class SanhCuoi implements Serializable {
	@Id
	@Column(name="id_sanh_cuoi")
	private int idSanhCuoi;
	
	@Column(name="name_sanh_cuoi")
	private String nameSanhCuoi;
	
	@Column(name="price_sanhcuoi_sang")
	private Long priceSanhCuoiSang;
	
	@Column(name="price_sanhcuoi_trua")
	private Long priceSanhCuoiTrua;
	
	@Column(name="price_sanhcuoi_toi")
	private Long priceSanhCuoiToi;
	
	@Column(name="price_sanhcuoi_sang_cuoituan")
	private Long priceSanhCuoiSangCuoiTuan;
	
	@Column(name="price_sanhcuoi_trua_cuoituan")
	private Long priceSanhCuoiTruaCuoiTuan;
	
	@Column(name="price_sanhcuoi_toi_cuoituan")
	private Long priceSanhCuoiToiCuoiTuan;
	
	
	@OneToMany(mappedBy = "sanhCuoi")
	@JsonManagedReference
	private List<Booking> bookings;

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public int getIdSanhCuoi() {
		return idSanhCuoi;
	}

	public void setIdSanhCuoi(int idSanhCuoi) {
		this.idSanhCuoi = idSanhCuoi;
	}

	public String getNameSanhCuoi() {
		return nameSanhCuoi;
	}

	public void setNameSanhCuoi(String nameSanhCuoi) {
		this.nameSanhCuoi = nameSanhCuoi;
	}

	public Long getPriceSanhCuoiSang() {
		return priceSanhCuoiSang;
	}

	public void setPriceSanhCuoiSang(Long priceSanhCuoiSang) {
		this.priceSanhCuoiSang = priceSanhCuoiSang;
	}

	public Long getPriceSanhCuoiTrua() {
		return priceSanhCuoiTrua;
	}

	public void setPriceSanhCuoiTrua(Long priceSanhCuoiTrua) {
		this.priceSanhCuoiTrua = priceSanhCuoiTrua;
	}

	public Long getPriceSanhCuoiToi() {
		return priceSanhCuoiToi;
	}

	public void setPriceSanhCuoiToi(Long priceSanhCuoiToi) {
		this.priceSanhCuoiToi = priceSanhCuoiToi;
	}

	public Long getPriceSanhCuoiSangCuoiTuan() {
		return priceSanhCuoiSangCuoiTuan;
	}

	public void setPriceSanhCuoiSangCuoiTuan(Long priceSanhCuoiSangCuoiTuan) {
		this.priceSanhCuoiSangCuoiTuan = priceSanhCuoiSangCuoiTuan;
	}

	public Long getPriceSanhCuoiTruaCuoiTuan() {
		return priceSanhCuoiTruaCuoiTuan;
	}

	public void setPriceSanhCuoiTruaCuoiTuan(Long priceSanhCuoiTruaCuoiTuan) {
		this.priceSanhCuoiTruaCuoiTuan = priceSanhCuoiTruaCuoiTuan;
	}

	public Long getPriceSanhCuoiToiCuoiTuan() {
		return priceSanhCuoiToiCuoiTuan;
	}

	public void setPriceSanhCuoiToiCuoiTuan(Long priceSanhCuoiToiCuoiTuan) {
		this.priceSanhCuoiToiCuoiTuan = priceSanhCuoiToiCuoiTuan;
	}
}
