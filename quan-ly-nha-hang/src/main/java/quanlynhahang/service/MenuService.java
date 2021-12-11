package quanlynhahang.service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quanlynhahang.model.Menu;
import quanlynhahang.repository.IMenuRepository;

@Service
public class MenuService {
	
	@Autowired
	IMenuRepository service;
	
	public Iterable<Menu> getAllMenu(){
		return service.findAll();
	}
}
