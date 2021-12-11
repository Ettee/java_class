package quanlynhahang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import quanlynhahang.model.BookingDetail;

@Repository
public interface IBookingDetailRepository extends CrudRepository<BookingDetail,Integer> {

}
