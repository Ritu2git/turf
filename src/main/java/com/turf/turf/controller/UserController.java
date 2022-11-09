package com.turf.turf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turf.turf.model.UserModel;
import com.turf.turf.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired 
    private UserRepository userrepo;
    
    @GetMapping("/login")
    public List<UserModel> userLogin(){
        return userrepo.findAll();
    }
}
