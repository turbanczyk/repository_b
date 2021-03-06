/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.carrental.controller;

import com.carrental.data.UserRepository;
import com.carrental.security.RegistrationForm;
import lombok.AllArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * RegistrationController accepts input and converts it to commands for the model or view
 * responsible for registration of new user process.
 * 
 * @author tomeku
 */
@Controller
@AllArgsConstructor
public class RegistrationController {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    
    @GetMapping("/register")
    public String registerForm() {
        return "registration";
    }
    
    @PostMapping("/register")
    public String processRegistration(RegistrationForm form) {
        userRepository.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}