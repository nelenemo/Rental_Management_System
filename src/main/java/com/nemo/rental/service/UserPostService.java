package com.nemo.rental.service;

import com.nemo.rental.dto.UserPostRequest;
import com.nemo.rental.enums.Dwelling;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserPostService {
    UserPostRequest savePost(MultipartFile file, String title, int contactNum, String description, Dwelling dwelling, String place) throws IOException;
}
