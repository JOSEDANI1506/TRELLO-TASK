package com.example.College.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CollegeRequest {
    private int id;
    private String studName;
    private String studDetails;
    private int phoneNumber;
}
