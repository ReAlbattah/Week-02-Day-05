package com.example.springd5.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@AllArgsConstructor
@Data
public class Advisor {
    // ID , name , age ( all should not be empty , create new arraylist on every request )

    @NotEmpty(message = "must insert your advisor ID")
    @Size(min = 3,message = "ID should be 3 ")
    private String id;

    @NotEmpty(message = "must insert your advisor name")
    private String name;

    @NotNull(message = "age can not be null")
    private Integer age;

}