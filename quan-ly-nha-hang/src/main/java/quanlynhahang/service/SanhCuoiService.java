package quanlynhahang.service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhahang.model.SanhCuoi;
import quanlynhahang.repository.ISanhCuoiRepository;

@Service
public class SanhCuoiService {

	@Autowired
	ISanhCuoiRepository service;
	
	public Iterable<SanhCuoi> getAll(){
		return service.findAll();
	}
	
}
