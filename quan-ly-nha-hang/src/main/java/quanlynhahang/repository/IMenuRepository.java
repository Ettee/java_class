package quanlynhahang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhahang.model.Menu;

@Repository
public interface IMenuRepository extends CrudRepository<Menu, Integer> {

}
