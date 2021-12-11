package quanlynhahang.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import quanlynhahang.dto.RegisterUser;
import quanlynhahang.model.User;
import quanlynhahang.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	@GetMapping("/get-all")
	public Iterable<User> getAll() {
		return service.getAll();
	}

	@PostMapping(value = "/sign-up", produces = {
			"application/json" }, consumes = { "multipart/form-data" })
	public boolean signUp(
			@Parameter(schema = @Schema(implementation = RegisterUser.class)) @RequestBody RegisterUser userInfo) throws IOException {

		User user = service.createUser(userInfo, 3, userInfo.getFile());
		return user != null;
	}
	
  @GetMapping("/search-user/{kw}")
  public List<User> findUserByName(@PathVariable(required = false) String kw) {
	  if(kw == null) {
		  return service.searchUserByName("");
	  }
	  return service.searchUserByName(kw);
	  
  }
  
  @DeleteMapping("delete/{id}")
  public boolean deleteUserById(@PathVariable int id) {
	  service.deleteUser(id);
	  return true;
  }
  

}
