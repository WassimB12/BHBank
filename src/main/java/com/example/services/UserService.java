package com.example.services;


import com.example.entities.User;

import java.util.List;

public interface UserService {
    User addUser(User p);

    // read operation
    List<User> retrieveAllUsers();


    User updateUser(User p);


    // delete operation
    void removeUserById(Integer idUser);

}
