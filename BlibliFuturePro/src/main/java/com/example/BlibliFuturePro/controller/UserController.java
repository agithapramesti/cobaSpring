package com.example.BlibliFuturePro.controller;


import com.example.BlibliFuturePro.dao.UserDao;
import com.example.BlibliFuturePro.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {


    UserDao userDao;
    @Autowired
    public UserController(UserDao userDao)  {

        this.userDao = userDao;
    }
    public UserController (){}
 //   @RequestMapping(value = "/", method = RequestMethod.GET)    //INDEX & List User
    /*
    public String getAllUser(Model model)  {
        List<User> userList = userService.getUserList();
        model.addAttribute("messages", "Tampil Semua Pengguna.");
        model.addAttribute("users", userList);
        return "index";
    }
    */
}
