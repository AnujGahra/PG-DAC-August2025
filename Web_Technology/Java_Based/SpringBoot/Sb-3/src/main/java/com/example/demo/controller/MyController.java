package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.MyService;

@Controller
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping({"/index", "/home"})
    public String welcomeHome() {
        return "index";
    }

    @GetMapping("/registration")
    public String registrationView() {
        return "registration";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute EmployeeDTO employeeDTO,
                       RedirectAttributes redirectAttributes) {

        EmployeeEntity savedEntity = myService.save(employeeDTO);
        System.out.println(savedEntity);

        redirectAttributes.addFlashAttribute(
                "msg", "Data Saved Successfully"
        );

        return "redirect:/registration";
    }
}
