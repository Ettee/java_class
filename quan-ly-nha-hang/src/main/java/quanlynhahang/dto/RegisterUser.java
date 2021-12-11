package quanlynhahang.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class RegisterUser implements Serializable {
	
	private String userName;
	private String password;
	private String avartaFilePath;
	private MultipartFile file;
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvartaFilePath() {
		return avartaFilePath;
	}
	public void setAvartaFilePath(String avartaFilePath) {
		this.avartaFilePath = avartaFilePath;
	}
}
