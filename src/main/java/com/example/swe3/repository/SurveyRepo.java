package com.example.swe3.repository;


import com.example.swe3.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepo extends JpaRepository<Survey, Long> {
}

