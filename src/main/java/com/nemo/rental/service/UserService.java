package com.nemo.rental.service;

import com.nemo.rental.dto.UserDto;

import java.util.List;

public interface UserService {


    void registerUser(UserDto userDto);

    List<UserDto> getAllUser();
}
