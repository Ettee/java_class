package quanlynhahang.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhahang.model.Booking;
import quanlynhahang.model.DichVu;
import quanlynhahang.model.User;
import quanlynhahang.repository.IBookingRepository;
import quanlynhahang.repository.IDichVuRepository;
import quanlynhahang.repository.IUserRepository;


@Service
public class BookingService {
	
	@Autowired
	IBookingRepository bookingRepo;
	@Autowired
	IDichVuRepository dichVuRepo;
	@Autowired
	IUserRepository userRepo;
	
	public Iterable<Booking> getAll(){
		return bookingRepo.findAll();
	}
	
//	public Set<DichVu> getDichVuByBookingId(int idBooking) {
//		Booking bookings = bookingRepo.findByIdBooking(idBooking);
//		return bookings.getLstDichVu();
//	}
	
	public List<Booking> findBookingByUser(int userId){
		User user = userRepo.findByIdUser(userId);
		return bookingRepo.findByUser(user);
	}
	
}
