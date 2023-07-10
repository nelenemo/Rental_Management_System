package com.nemo.rental.model;

import com.nemo.rental.enums.Dwelling;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String place;
    @Enumerated(EnumType.STRING)
    private Dwelling dwelling;
    private int contactNum;
    private String description;
    @Lob
    private byte[] image;

    //private Landlord landlord;



}
