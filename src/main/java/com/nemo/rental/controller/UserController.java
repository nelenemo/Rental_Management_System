package com.nemo.rental.controller;

import com.nemo.rental.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/registerUser")
    public String registerUser(@RequestMapping UserDto userDto ){

    }


}
