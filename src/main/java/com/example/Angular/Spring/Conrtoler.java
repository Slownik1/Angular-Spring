package com.example.Angular.Spring;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Conrtoler {

    public Conrtoler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<UserModel> getUser(){
        return (List<UserModel>) userRepository.findAll();
    }

    @GetMapping("/users")
    void addUser(UserModel user){
        userRepository.save(user);
    }

}
