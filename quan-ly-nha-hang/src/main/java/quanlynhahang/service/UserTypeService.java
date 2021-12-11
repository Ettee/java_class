package quanlynhahang.service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhahang.model.UserType;
import quanlynhahang.repository.IUserTypeRepository;

@Service
public class UserTypeService {

	@Autowired
	IUserTypeRepository service;
	
	public Iterable<UserType> getAll(){
//		return StreamSupport.stream(service.findAll().spliterator(),false).collect(Collectors.toList());
		return service.findAll();
	}
	
	public UserType findUserTypeById(int id) {
		return service.findByIdType(id);
	}
}
