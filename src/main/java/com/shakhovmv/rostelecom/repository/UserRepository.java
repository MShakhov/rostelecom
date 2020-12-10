package com.shakhovmv.rostelecom.repository;

import com.shakhovmv.rostelecom.dto.UserDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDto,Long> {
}
