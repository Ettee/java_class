package quanlynhahang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhahang.model.DichVu;

@Repository
public interface IDichVuRepository extends CrudRepository<DichVu,Integer>  {
	
}
