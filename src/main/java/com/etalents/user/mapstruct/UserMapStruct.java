package com.etalents.user.mapstruct;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import com.etalents.user.DTO.UserDTO;
import com.etalents.user.entity.UserEntity;

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT, componentModel = "spring", 
							builder = @Builder (disableBuilder = true))

public interface UserMapStruct {

	public static UserMapStruct INSTANCE = Mappers.getMapper(UserMapStruct.class);

	@Mappings({
		@Mapping(source = "firstName", target = "firstName"),
		@Mapping(source = "surName", target = "surName"),
		@Mapping(source = "nick", target = "nick"),
		@Mapping(source = "email", target = "email"),
		@Mapping(source = "password", target = "password"),
		@Mapping(source = "createOn", target = "createOn"),
		@Mapping(source = "lastLogin", target = "lastLogin")
		
	})
	
	public UserEntity userToDTO(UserDTO userDTO);
}
