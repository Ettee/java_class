package quanlynhahang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhahang.model.Menu;
import quanlynhahang.service.MenuService;


@RestController
@RequestMapping("/nhahang")
public class MenuController {
	
	@Autowired
	MenuService service;
	
	@GetMapping("/get-all-menu")
	public Iterable<Menu> getAllMenu(){
		return service.getAllMenu();
	}
}
