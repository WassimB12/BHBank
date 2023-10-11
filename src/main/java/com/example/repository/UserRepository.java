package com.example.repository;

import com.example.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer> {
User findUserByUsername(String u);
    @Query(value="SELECT u.password FROM User u WHERE u.username = :name", nativeQuery = true)
    String findPasword(@Param("name") String username);
}
