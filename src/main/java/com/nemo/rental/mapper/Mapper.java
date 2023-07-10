package com.nemo.rental.mapper;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.dto.UserPostRequest;
import com.nemo.rental.model.User;
import com.nemo.rental.model.UserPost;

import java.text.ParseException;

public interface Mapper {

    public User toUser(UserDto userDto);

    public UserDto toUserDto(User user);

    public UserPost toUserPost(UserPostRequest userPostRequest);



}
