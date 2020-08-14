package com.weifengcui.demo.controller;

import com.weifengcui.demo.entity.User;
import com.weifengcui.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * Signup a new user.
     */
    @PostMapping(path = "/signup")
    public @ResponseBody
    User signup(
            @RequestParam String username,
            @RequestParam String password) {
        //TODO: this didn't return all the data in DB, like the PK.
        return userRepository.save(new User(username, password));
    }

    /**
     * Login a user, returns the user info.
     * If username is not found or password is not correct, return an empty user profile.
     */
    @PostMapping(path = "login")
    public @ResponseBody
    User login(@RequestParam String username,
               @RequestParam String password) {
        Optional<User> userOptional = userRepository.findUserByUserName(username);

        if (userOptional.isPresent() && userOptional.get().getPassword().equals(password)) {
            return userOptional.get();
        }

        return new User();
    }

    /**
     *
     * Shows all users information, mainly for debug.
     */
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}