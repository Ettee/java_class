package quanlynhahang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhahang.model.SanhCuoi;

@Repository
public interface ISanhCuoiRepository extends CrudRepository<SanhCuoi,Integer> {

}
