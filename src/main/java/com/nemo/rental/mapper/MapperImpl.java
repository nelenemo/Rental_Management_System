package com.nemo.rental.mapper;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.enums.UserType;
import com.nemo.rental.model.User;

public class MapperImpl implements Mapper{
    @Override
    public User toUser(UserDto userDto) {
        User user=new User();
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setAddress(userDto.getAddress());
        user.setOccupation(userDto.getOccupation());
        user.setContactNum(userDto.getContactNum());
        user.setUserType(UserType.Buyer);

        return user;
    }

    @Override
    public UserDto toUserDto(User user) {
        UserDto  userDto=new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setAddress(user.getAddress());
        userDto.setContactNum(user.getContactNum());
        userDto.setOccupation(user.getOccupation());


        return userDto;
    }
}
