package quanlynhahang.repository;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhahang.model.Booking;
import quanlynhahang.model.User;

@Repository
public interface IBookingRepository extends CrudRepository<Booking,Integer>   {
	
	public Booking findByIdBooking(int idBooking);
	public List<Booking> findByUser(User user);
	public List<Booking> findByTimeBooking(Timestamp time);
	public List<Booking> findByCheckout(Boolean value);
}
