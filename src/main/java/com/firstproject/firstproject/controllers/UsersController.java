package com.firstproject.firstproject.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.firstproject.firstproject.models.UserRepository;
import com.firstproject.firstproject.models.Users;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class UsersController {
    @Autowired
    private UserRepository userRepo;


    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        //  get all users from database
        List<Users> users = userRepo.findAll();

        //TO DO: get all users from database

        // List<Users> users = new ArrayList<>();
        // users.add(new Users("Josh","1234",25) );
        // users.add(new Users("Sara","1234",25) );
        // users.add(new Users("Muskan","1234",25) );
        // users.add(new Users("Josh","1234",25) );
        //end of database call

        model.addAttribute("us", users); //us is going represent our models
        // we are going to take our users and we are going to put it in a model and we are going to send to our view

        return "users/showAll"; //This string is associated with our view,
        // When we return this string this user/showAll corresponds to 
        // where in template folder I'm going to be able to find a view 
        // so this means under a folder called users I'm going to find a file called show all
    }
    @PostMapping("users/add")
    public String addUser(@RequestParam Map<String,String> newuser, HttpServletResponse response){
          System.out.println("ADD User");
          String newName = newuser.get("name");
          String newPwd = newuser.get("password");
          int newSize = Integer.parseInt(newuser.get("size"));
          userRepo.save(new Users(newName, newPwd, newSize));
          response.setStatus(201);
          return "users/addUser";
    }
}
