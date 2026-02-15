package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.MyService;


@RestController
@RequestMapping("/api/")
public class MyController {
	

    @Autowired
    private MyService myService;

    // ================= CREATE =================
    @PostMapping("employees")
    public ResponseEntity<?> insert(
            @Valid @RequestBody EmployeeDTO employeeDTO,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            List<String> errors = new ArrayList<>();
            for (ObjectError error : bindingResult.getAllErrors()) {
                errors.add(error.getDefaultMessage());
            }

            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        }

        EmployeeEntity savedEmployee = myService.insert(employeeDTO);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Employee saved successfully");
        response.put("data", savedEmployee);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // ================= READ ALL =================
    @GetMapping("employees")
    public ResponseEntity<?> getAll() {

        List<EmployeeEntity> employees = myService.getAll();

        Map<String, Object> response = new HashMap<>();
        response.put("count", employees.size());
        response.put("data", employees);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // ================= READ BY ID =================
    @GetMapping("employees/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {

        EmployeeEntity employee = myService.getById(id);

        Map<String, Object> response = new HashMap<>();
        response.put("data", employee);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // ================= UPDATE =================
    @PutMapping("employees/{id}")
    public ResponseEntity<?> update(
            @PathVariable int id,
            @Valid @RequestBody EmployeeDTO employeeDTO,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            List<String> errors = new ArrayList<>();
            for (ObjectError error : bindingResult.getAllErrors()) {
                errors.add(error.getDefaultMessage());
            }

            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        }

        EmployeeEntity updatedEmployee = myService.update(id, employeeDTO);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Employee updated successfully");
        response.put("data", updatedEmployee);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // ================= DELETE =================
    @DeleteMapping("employees/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {

        myService.deleteById(id);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Employee deleted successfully");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
