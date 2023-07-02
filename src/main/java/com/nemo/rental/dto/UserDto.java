package com.nemo.rental.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String contactNum;
    private String occupation;
    private String address;

}
