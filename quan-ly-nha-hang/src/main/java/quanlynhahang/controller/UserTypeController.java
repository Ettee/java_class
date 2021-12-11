package quanlynhahang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhahang.model.UserType;
import quanlynhahang.service.UserTypeService;

@RestController
@RequestMapping("/nhahang")
public class UserTypeController {
	@Autowired
	UserTypeService service;
	
	@GetMapping("/get-all-usertype")
	public Iterable<UserType> getAll() {
		return service.getAll();
	}
}
