package com.example.swe3.controller;

import com.example.swe3.model.Admin;
import com.example.swe3.repository.AdminRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/surveys")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {


    private final AdminRepo adminRepo;
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);


    public AdminController(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    @PostMapping("/login/admin")
    public ResponseEntity<LoginResponse> loginAdmin(@RequestBody Admin admin) {
        // Implement authentication logic here, validate the provided credentials
        String enteredUsername = admin.getUse();
        String enteredPassword = admin.getPass();

        Admin adminFromDatabase = adminRepo.findByUse(enteredUsername);

        if (adminFromDatabase != null) {
            String passwordFromDatabase = adminFromDatabase.getPass();

            if (enteredPassword.equals(passwordFromDatabase)) {
                // Authentication successful
                return ResponseEntity.ok(new LoginResponse("successful"));
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new LoginResponse("failed"));
    }
    @PostMapping("/admin/store")
    public Admin createAdmin(@RequestBody Admin admin) {
        // Save the survey to the database
        return adminRepo.save(admin);
    }

    @GetMapping("/admin")
    public List<Admin> getAllAdmin() {
        // Retrieve all surveys from the database
        logger.info("Retrieving surveys from the database...");
        List<Admin> admins = adminRepo.findAll();
        logger.info("Retrieved {} surveys from the database.", admins.size());
        return admins;
    }
}


