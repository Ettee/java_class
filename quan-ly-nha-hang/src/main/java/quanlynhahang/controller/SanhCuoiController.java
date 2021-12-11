package quanlynhahang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhahang.model.SanhCuoi;
import quanlynhahang.service.SanhCuoiService;

@RestController
@RequestMapping("/nhahang")
public class SanhCuoiController {
	@Autowired
	SanhCuoiService service;
	
	@GetMapping("/get-all-sanhcuoi")
	public Iterable<SanhCuoi> getAll() {
		return service.getAll();
	}
}
