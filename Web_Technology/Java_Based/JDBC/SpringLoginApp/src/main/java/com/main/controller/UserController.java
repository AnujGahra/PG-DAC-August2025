package com.main.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/register")
    public String registerPage() {
        return "register";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/loginSuccess")
    public String loginSuccess(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        // Dummy validation (exam level)
        if(username.equals("admin") && password.equals("123")) {
            model.addAttribute("user", username);
            return "success";
        } else {
            model.addAttribute("msg", "Invalid Login");
            return "login";
        }
    }
}
