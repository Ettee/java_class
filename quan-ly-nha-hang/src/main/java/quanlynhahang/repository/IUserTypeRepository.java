package quanlynhahang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhahang.model.UserType;


@Repository
public interface IUserTypeRepository extends CrudRepository<UserType,Integer>   {
	public UserType findByIdType(int id);
}
