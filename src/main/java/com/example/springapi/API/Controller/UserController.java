package com.example.springapi.API.Controller;

import com.example.springapi.API.Model.User;
import com.example.springapi.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices)
    {
        this.userServices = userServices;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional user = userServices.getUser(id);
        if(user.isPresent()){
            return(User) user.get();
        }
        return null;
    }
}
