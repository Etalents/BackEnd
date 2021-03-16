package com.etalents.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etalents.user.DTO.UserDTO;
import com.etalents.user.entity.UserEntity;
import com.etalents.user.service.UserService;


@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired	private UserService userService;

	@PostMapping("/create-user")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {

		return this.userService.createUser(userDTO);
	}
	
	@GetMapping("/user-email")
	public ResponseEntity<?> getUserEmail(@RequestBody UserEntity	userEntity) {

		return null;
	}

}
