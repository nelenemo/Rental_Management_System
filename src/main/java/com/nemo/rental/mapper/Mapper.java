package com.nemo.rental.mapper;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.model.User;

public interface Mapper {

    public User toUser(UserDto userDto);

    public UserDto toUserDto(User user);


}
