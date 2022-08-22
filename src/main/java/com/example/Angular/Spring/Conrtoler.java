package com.example.Angular.Spring;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Conrtoler {

    public Conrtoler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private final UserRepository userRepository;

    @GetMapping("/user")
    public List<UserModel> getUser(){
        return (List<UserModel>) userRepository.findAll();
    }

    @GetMapping("/users")
    void addUser(@RequestBody UserModel user){
        userRepository.save(user);
    }

}
