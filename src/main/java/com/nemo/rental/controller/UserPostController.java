package com.nemo.rental.controller;

import com.nemo.rental.dto.UserPostRequest;
import com.nemo.rental.enums.Dwelling;
import com.nemo.rental.repo.UserPostRepo;
import com.nemo.rental.service.UserPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/uploadPost")
public class UserPostController {
    @Autowired
    private UserPostService userPostService;

    @PostMapping("/savePost")
    public ResponseEntity<UserPostRequest> savePost(@RequestParam ("file") MultipartFile file,
        @RequestParam ("title") String title,
        @RequestParam("place") String place,
        @RequestParam("dwelling") Dwelling dwelling,
        @RequestParam("contactNum") int contactNum,
        @RequestParam("description") String description) throws IOException
    {
       UserPostRequest userPostRequest= userPostService.savePost(file,title,contactNum,description,dwelling,place);


    return ResponseEntity.ok(userPostRequest);
    }
}
