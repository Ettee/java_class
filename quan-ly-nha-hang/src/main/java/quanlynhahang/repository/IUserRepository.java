package quanlynhahang.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhahang.model.User;


@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
	public User findByNameUser(String kw);
	public User findByIdUser(int id);
	public List<User> findByNameUserContains(String kw);
}
