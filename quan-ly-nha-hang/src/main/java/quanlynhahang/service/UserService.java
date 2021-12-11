package quanlynhahang.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import quanlynhahang.dto.RegisterUser;
import quanlynhahang.model.User;
import quanlynhahang.repository.IUserRepository;
import quanlynhahang.repository.IUserTypeRepository;
import quanlynhahang.utils.FileUtils;

@Service
public class UserService {
	
	@Autowired
	IUserRepository userRepo;
	@Autowired
	IUserTypeRepository userTypeRepo;
	
	public Iterable<User> getAll(){
		return userRepo.findAll();
	}
	
	
	public User createUser (RegisterUser userInfo, int type, MultipartFile file) throws IOException {
		//write avarta file
		String filePath = FileUtils.writeFile(file);
		userInfo.setAvartaFilePath(filePath);
		User user= new User();
		user.setUserInfoByRegister(userInfo);
		user.setTypeUser(userTypeRepo.findByIdType(3));
		return userRepo.save(user);
			
	}
	
	public void deleteUser (int idUser) {
		userRepo.deleteById(idUser);
	}
	
	
	
	
	
	public List<User> searchUserByName(String kw){
		if (kw =="") {
			Iterable<User> res =  userRepo.findAll();
			List<User> list = new ArrayList<>();
			res.forEach(list::add);
			return list;
		}else {
			return userRepo.findByNameUserContains(kw);
		}
	}
	
	
	
}
