package com.backendMarchPro.LibrariManagmentSystem.Dto;

import com.backendMarchPro.LibrariManagmentSystem.Enum.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentRequestDto {


    private String name;

    private String email;

    private int age;

    private Department department;



}
