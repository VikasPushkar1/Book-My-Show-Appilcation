package com.example.BookMyShowApplication.Controllers;

import com.example.BookMyShowApplication.Entities.UserEntity;

import com.example.BookMyShowApplication.EntryDtos.UserEntryDto;
import com.example.BookMyShowApplication.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserEntryDto userEntityDto){
        return "";
    }
}
