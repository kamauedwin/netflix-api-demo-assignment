package com.api.netflix.Controller;

import com.api.netflix.Model.Users;
import com.api.netflix.Repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Users")
public class UserController{
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @GetMapping(value = "{UserID}/Users")
    public List<Users>
    findUserByUserID(@PathVariable int userId){
        return userRepository.findByUserId(userId);
    }

}
