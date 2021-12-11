package quanlynhahang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhahang.model.BookingDetail;
import quanlynhahang.service.BookingDetailService;

@RestController
@RequestMapping("/nhahang")
public class BookingDetailController {

	@Autowired
	BookingDetailService bookingDetailService;
	
	@GetMapping("/get-all-booking-detail")
	public Iterable <BookingDetail> getAll(){
		return bookingDetailService.getAllBookingDetail();
	}
	
}
