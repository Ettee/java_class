package quanlynhahang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhahang.model.BookingDetail;
import quanlynhahang.repository.IBookingDetailRepository;

@Service
public class BookingDetailService {
	
	@Autowired
	IBookingDetailRepository bookingDetailRepo;
	
	public Iterable <BookingDetail> getAllBookingDetail(){
		return bookingDetailRepo.findAll();
	}
}
