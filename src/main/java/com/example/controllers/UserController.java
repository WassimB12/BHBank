package com.example.controllers;


import com.example.entities.User;
import com.example.repository.CoursRepository;
import com.example.repository.UserRepository;
import com.example.services.CoursService;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/User")


public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Annotation

    // Save operation

    @PostMapping("/add")
    public User saveUser(@RequestBody User c) {
        return userService.addUser(c);

    }

    // Read operation
    @GetMapping("/Users")
    public List<User> retrieveAllUsers()
    {

        return userService.retrieveAllUsers();
    }

    // Update operation
    @PutMapping("/update")
    public User
    updateUser(@RequestBody User User)
    {

        return userService.updateUser(User);
    }

    // Delete operation
    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") Integer UserId)
    {

        userService.removeUserById(UserId);
        return "Deleted Successfully";
    }

    @GetMapping("/user1/{user}")
    public User retrieveUser(@PathVariable("user") String u)
    {

        return userRepository.findUserByUsername(u);
    }
    @GetMapping("/check/{u}/{pass}")
    public Boolean checkPass(@PathVariable("u") String u,@PathVariable("pass") String pass)
    {

        User us= userRepository.findUserByUsername(u);
        return (us.getPassword()==pass);

    }
}
