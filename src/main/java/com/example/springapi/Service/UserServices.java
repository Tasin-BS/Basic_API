package com.example.springapi.Service;

import com.example.springapi.API.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    private List<User> userList;

    public UserServices(){
        userList = new ArrayList<>();

        User user = new User(1,"tasin",22,"tasin.99bd@gamil.com");
        User user1 = new User(12,"tasin1",22,"tasin1.99bd@gamil.com");
        User user2 = new User(13,"tasin2",22,"tasin2.99bd@gamil.com");
        User user3 = new User(14,"tasin3",22,"tasin3.99bd@gamil.com");
        User user4 = new User(15,"tasin4",22,"tasin4.99bd@gamil.com");

        userList.addAll(Arrays.asList(user,user1,user2,user3,user4));

    }

    public Optional<User> getUser(Integer id) {
        Optional optinal = Optional.empty();
        for(User user:userList){
            if(id == user.getId()){
                optinal = Optional.of(user);
                return optinal;
            }
        }
        return optinal;
    }
}
