package com.nemo.rental.service;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.model.User;

import java.util.List;

public interface UserService {


    void registerUser(UserDto userDto);

    List<UserDto> getAllUser();

    User updateUser(Long id, UserDto userDetails);
}
