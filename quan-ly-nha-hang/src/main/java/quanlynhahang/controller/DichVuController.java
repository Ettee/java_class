package quanlynhahang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhahang.model.DichVu;
import quanlynhahang.service.DichVuService;

@RestController
@RequestMapping("/nhahang")
public class DichVuController {
	@Autowired
	DichVuService service;
	
	@GetMapping("/get-all-dichvu")
	public Iterable<DichVu> getAll() {
		return service.getAll();
	}
}
