package com.example.services;


import com.example.entities.User;
import com.example.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User p) {
        return userRepository.save(p);

    }
    @Override
    public User updateUser(User p) {
        return userRepository.save(p);


    }

    @Override
    public void removeUserById(Integer idUser) {
        userRepository.deleteById(idUser);
    }







    @Override
    public List<User> retrieveAllUsers() {
        List<User> users =new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }


}
