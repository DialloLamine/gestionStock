package com.onediallo.gestion.service.dto;

import com.onediallo.gestion.model.Roles;
import com.onediallo.gestion.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

	
	private String username;

	
	private String password;

	private String confirmPassword;

	
	private Roles role;

	
	public UserDto() {
		username = "";
		password = "";
		confirmPassword = "";
	}

	/**
	 * Cr�er un user � partir d'un Dto sans crypter le password
	 * 
	 * @param encodeur
	 * @return User
	 */
	public User toUser() {
		return new User(username, password, role);
	}

	
//	public User toUser(PasswordEncoder encodeur) {
//		return new User(username, encodeur.encode(password), role);
//	}

	
	public static UserDto toUserDto(User user) {
		return new UserDto(user.getUsername(), user.getPassword(), user.getPassword(), user.getRole());
	}
}
