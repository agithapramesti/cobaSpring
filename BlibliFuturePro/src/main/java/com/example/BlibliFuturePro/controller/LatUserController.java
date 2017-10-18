package com.example.BlibliFuturePro.controller;

import com.example.BlibliFuturePro.model.UserLat;
import com.example.BlibliFuturePro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class LatUserController {
    //private static final String path="/error";
    @Autowired
    private UserService userService;
    /*
        @RequestMapping(value=path)
    public String error(){
        return "Error Handling";

    }
    @Override
    public String getErrorPath(){
        return  path;
    }
     */

    @RequestMapping(method = RequestMethod.GET)
    public Collection<UserLat> gettAllUser(){
        return userService.gettAllUser();
    }
}
