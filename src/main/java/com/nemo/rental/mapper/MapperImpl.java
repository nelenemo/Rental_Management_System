package com.nemo.rental.mapper;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.dto.UserPostRequest;
import com.nemo.rental.enums.Dwelling;
import com.nemo.rental.enums.UserType;
import com.nemo.rental.model.User;
import com.nemo.rental.model.UserPost;
import com.nemo.rental.service.UserService;

import java.text.ParseException;

public class MapperImpl implements Mapper{


    public MapperImpl() {
    }

    @Override
    public User toUser(UserDto userDto){
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

    @Override
    public UserPost toUserPost(UserPostRequest userPostRequest) {
        UserPost userPost=new UserPost();
        userPost.setId(userPost.getId());
        userPost.setTitle(userPostRequest.getTitle());
        userPost.setPlace(userPostRequest.getPlace());
        userPost.setContactNum(userPostRequest.getContactNum());
        userPost.setDwelling(userPostRequest.getDwelling());
        userPost.setDescription(userPostRequest.getDescription());
        userPost.setImage(userPostRequest.getImage());

        return userPost;
    }


}
