package com.etalents.user.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;

import com.etalents.user.DTO.UserDTO;
import com.etalents.user.entity.UserEntity;

public interface UserRepository extends Repository<UserEntity, Long> {

	
	
	void save(UserEntity userEntity);

	String findByEmail(String email);
	
	

}
