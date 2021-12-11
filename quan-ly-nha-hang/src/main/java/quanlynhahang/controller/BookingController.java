package quanlynhahang.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhahang.dto.BookingDto;
import quanlynhahang.model.Booking;
import quanlynhahang.service.BookingService;
import quanlynhahang.model.DichVu;

@RestController
@RequestMapping("/nhahang")
public class BookingController {
	@Autowired
	BookingService service;
	
	@GetMapping("/get-booking")
	public Iterable<Booking> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/get-booking-by-user/{id}")
	public List<Booking>getBookingByUser(@PathVariable int id){
		return service.findBookingByUser(id);
	}
	
	
//	@PostMapping("/get-dichvu-by-booking")
//	public Set<DichVu> getDichVuByBookingId (
//			@RequestBody BookingDto booking){
//		return service.getDichVuByBookingId(booking.getIdBooking());
//	}
}
