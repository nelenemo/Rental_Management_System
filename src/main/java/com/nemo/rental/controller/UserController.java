package com.nemo.rental.controller;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserController {
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registerUser")
    public String registerUser(@RequestBody UserDto userDto ){
        userService.registerUser(userDto);
        return "the user has been registered successfully";
   }

   @GetMapping("/getAllUser")
    public List<UserDto> userDtos(){
        return userService.getAllUser();
   }


}
