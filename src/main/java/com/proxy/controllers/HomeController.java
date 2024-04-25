package com.proxy.controllers;

import com.proxy.models.User;
import com.proxy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/sign-in")
    public String signInPage() {
        return "sign-in";
    }

    @PostMapping("/sign-in")
    public String signIn() {
        return "redirect:/";
    }

    @GetMapping("/sign-up")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String signUp(User user) {
        userService.addUser(user);
        return "redirect:/sign-in";
    }
}
