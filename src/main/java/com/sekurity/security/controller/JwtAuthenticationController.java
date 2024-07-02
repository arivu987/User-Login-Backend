package com.sekurity.security.controller;


import com.sekurity.security.entity.JwtRequest;
import com.sekurity.security.entity.UserVO;
import org.springframework.http.ResponseEntity;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public interface JwtAuthenticationController {

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception;



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UserVO user) throws Exception;

//    String forgotPassword(String email, Model model);
//
//    String getOtp(String email);
//
//    String verifyOTP(String email, String enteredOTP, Model model);
//
//    ResponseEntity<String> resetPassword(String email, String newPassword);

    @PostMapping("/forgot-password")
    public String forgotPassword(@RequestParam String email, Model model);

    @GetMapping("/get-otp")
    public String getOtp(@RequestParam("email") String email);

    @PostMapping("/verify-otp")
    public String verifyOTP(@RequestParam("email") String email, @RequestParam("otp") String enteredOTP, Model model);

    @Transactional
    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestParam("email") String email, @RequestParam("password") String newPassword);
}
