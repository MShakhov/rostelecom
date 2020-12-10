package com.shakhovmv.rostelecom.service.impl;

import com.shakhovmv.rostelecom.dto.UserDto;
import com.shakhovmv.rostelecom.mapper.UserMapper;
import com.shakhovmv.rostelecom.model.User;
import com.shakhovmv.rostelecom.repository.UserRepository;
import com.shakhovmv.rostelecom.service.FileService;
import com.shakhovmv.rostelecom.service.UserService;
import com.shakhovmv.rostelecom.utils.UserConverter;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRepository userRepository;
    @Autowired
    FileService fileService;

    @Override
    public void saveToDB(User user) {
        if(null != user) {
            UserDto userDto = userMapper.toDto(user);
            userRepository.save(userDto);
        }
    }

    @Override
    public synchronized  void saveToFile(User user) {
        if (null != user) {
            fileService.appendFile(UserConverter.toCsv(user));
        }
    }
}
