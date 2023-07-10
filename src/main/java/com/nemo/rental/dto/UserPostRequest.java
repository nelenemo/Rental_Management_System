package com.nemo.rental.dto;

import com.nemo.rental.enums.Dwelling;
import com.nemo.rental.model.Landlord;
import jakarta.persistence.Lob;
import lombok.Data;
import lombok.Getter;

@Data
public class UserPostRequest {
    private Long id;
    private String title;
    private String place;
    private Dwelling dwelling;
    private int contactNum;
    private String description;

    private byte[] image;


   // private Landlord landlord;
}
