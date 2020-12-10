package com.shakhovmv.rostelecom.mapper;

import com.shakhovmv.rostelecom.dto.UserDto;
import com.shakhovmv.rostelecom.model.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
