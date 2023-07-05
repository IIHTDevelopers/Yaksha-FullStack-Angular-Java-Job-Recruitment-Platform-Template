package com.example.jobrecruit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


import com.example.jobrecruit.service.JobService;

@RestController
@CrossOrigin
public class JobController {
	
    @Autowired
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

   
}

