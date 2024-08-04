package com.vita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vita.model.EmailDetails;
import com.vita.service.EmailService;

@RestController
@RequestMapping("api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;
    
    private static final String SUBJECT = "Login Successful :)";
    private static final String BODY = "Dear user,\n\tYou have successfully logged in to the system. We are very excited to do business with you.\n\nThanks and Regards,";

    @PostMapping("/onSignUp")
    public String sendMail(@RequestBody EmailDetails emailDetails) {
        String email = emailDetails.getSendTo();
        return emailService.loginEmail(email, SUBJECT, BODY);    
    }
}
 