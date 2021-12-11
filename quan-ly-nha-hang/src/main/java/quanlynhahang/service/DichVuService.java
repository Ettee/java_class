package quanlynhahang.service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhahang.model.DichVu;
import quanlynhahang.repository.IDichVuRepository;

@Service
public class DichVuService {
	
	@Autowired
	IDichVuRepository service;
	
	public Iterable<DichVu> getAll(){
//		return StreamSupport.stream(service.findAll().spliterator(),false).collect(Collectors.toList());
		return service.findAll();
	}
	
}
