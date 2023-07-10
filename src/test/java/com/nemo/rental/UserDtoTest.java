package com.nemo.rental;

import com.nemo.rental.dto.UserDto;
import com.nemo.rental.enums.UserType;
import com.nemo.rental.mapper.Mapper;
import com.nemo.rental.mapper.MapperImpl;
import com.nemo.rental.model.User;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;




public class UserDtoTest {
    private final Mapper mapper = new MapperImpl();
@Test
    public void toUser() {
        UserDto userDto1 = new UserDto();
        userDto1.setId(21L);
        userDto1.setEmail("abc@gmail.com");
        userDto1.setPassword("23234ese");
        userDto1.setUsername("susmitaa");
        userDto1.setOccupation("teacher");
        userDto1.setContactNum("342324121");
        userDto1.setAddress("ktm");

        User user = new User();
        user.setId(userDto1.getId());
        user.setEmail(userDto1.getEmail());
        user.setUsername(userDto1.getUsername());
        user.setPassword(userDto1.getPassword());
        user.setAddress(userDto1.getAddress());
        user.setOccupation(userDto1.getOccupation());
        user.setContactNum(userDto1.getContactNum());

        assertEquals(userDto1.getId(), user.getId());
        assertEquals(userDto1.getEmail(), user.getEmail());
        assertEquals(userDto1.getUsername(), user.getUsername());
        assertEquals(userDto1.getPassword(), user.getPassword());
        assertEquals(userDto1.getAddress(), user.getAddress());
        assertEquals(userDto1.getContactNum(), user.getContactNum());
        assertEquals(userDto1.getOccupation(), user.getOccupation());



    }
}

