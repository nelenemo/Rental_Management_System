package com.nemo.rental.service;

import com.nemo.rental.dto.UserPostRequest;
import com.nemo.rental.enums.Dwelling;
import com.nemo.rental.mapper.Mapper;
import com.nemo.rental.mapper.MapperImpl;
import com.nemo.rental.model.UserPost;
import com.nemo.rental.repo.UserPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class UserPostServiceImpl implements UserPostService{
    private final Mapper mapper=new MapperImpl();
    @Autowired
    private UserPostRepo userPostRepo;

    @Override
    public UserPostRequest savePost(MultipartFile file, String title, int contactNum, String description, Dwelling dwelling, String place) throws IOException {
        UserPostRequest userPostRequest=new UserPostRequest();
        userPostRequest.setTitle(title);
        userPostRequest.setPlace(place);
        userPostRequest.setContactNum(contactNum);
        userPostRequest.setDescription(description);
        userPostRequest.setDwelling(dwelling);
        userPostRequest.setImage(file.getBytes());
        UserPost userPost1 = mapper.toUserPost(userPostRequest);



        return userPostRepo.save(userPost1);
    }
}
