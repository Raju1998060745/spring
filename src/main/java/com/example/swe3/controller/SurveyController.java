package com.example.swe3.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.swe3.repository.SurveyRepo;
import com.example.swe3.model.Survey;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
@CrossOrigin(origins = "http://localhost:4200")
public class SurveyController {


    private final SurveyRepo surveyRepo;
    private final Logger logger = LoggerFactory.getLogger(SurveyController.class);


    public SurveyController(SurveyRepo surveyRepo) {
        this.surveyRepo = surveyRepo;
    }

    @PostMapping
    public ResponseEntity<Survey> createSurvey(@RequestBody Survey survey) {
        // Save the survey to the database
        Survey createdSurvey = surveyRepo.save(survey);
        return new ResponseEntity<>(createdSurvey, HttpStatus.CREATED);
    }

    @GetMapping("/result")
    public List<Survey> getAllSurveys() {
        // Retrieve all surveys from the database
        logger.info("Retrieving surveys from the database...");
        List<Survey> surveys = surveyRepo.findAll();
        logger.info("Retrieved {} surveys from the database.", surveys.size());
        return surveys;
    }
}
