package com.etalents.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.etalents.user.DTO.UserDTO;
import com.etalents.user.entity.UserEntity;
import com.etalents.user.mapstruct.UserMapStruct;
import com.etalents.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public ResponseEntity<UserDTO> createUser(UserDTO userDTO) {

		try {			
			
			String getEmailEntity = this.userRepository.findByEmail(userDTO.getEmail());

			if (userDTO.getEmail().equals(getEmailEntity)) {

				return ResponseEntity.status(HttpStatus.CONFLICT).body(null);

			}	
			
			UserEntity userEntity = UserMapStruct.INSTANCE.userToDTO(userDTO);			
			
			this.userRepository.save(userEntity);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);

		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

		}

	}

}
