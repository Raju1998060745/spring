package com.example.swe3.repository;

import com.example.swe3.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
    Admin findByUse(String use);
}
