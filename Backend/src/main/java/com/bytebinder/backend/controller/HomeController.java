package com.bytebinder.backend.controller;

import com.bytebinder.backend.entity.Users;
import com.bytebinder.backend.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Users> users = userService.findAll();
        model.addAttribute("users", users);
        return "home";
    }
}