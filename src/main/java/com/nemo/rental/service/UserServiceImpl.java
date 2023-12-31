package com.nemo.rental.service;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.exception.ResourceNotFoundException;
import com.nemo.rental.mapper.Mapper;
import com.nemo.rental.mapper.MapperImpl;
import com.nemo.rental.model.User;
import com.nemo.rental.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final Mapper mapper=new MapperImpl();
    @Autowired
    private UserRepo userRepo;
    @Override
    public void registerUser(UserDto userDto) {
        User user= mapper.toUser(userDto);
        System.out.println(userDto);
        userRepo.save(user);
        System.out.println(user);


    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> allUser = userRepo.findAll();
        List<UserDto> userDtos=new ArrayList<>();
        for (User user:allUser){
            UserDto userDto= mapper.toUserDto(user);
            userDtos.add(userDto);
        }
        return userDtos ;
    }

    @Override
    public User updateUser(Long id, UserDto userDetails) {
        User user = userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with id number " + id + " doesn't exist"));
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        User users= mapper.toUser(userDetails);

        return userRepo.save(users);
    }
}
