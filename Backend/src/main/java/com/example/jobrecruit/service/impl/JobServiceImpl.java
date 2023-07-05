package com.example.jobrecruit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobrecruit.dto.JobDTO;
import com.example.jobrecruit.entity.Job;
import com.example.jobrecruit.repo.JobDAO;
import com.example.jobrecruit.service.JobService;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
    private final JobDAO jobDAO;

    
    public JobServiceImpl(JobDAO jobDAO) {
        this.jobDAO = jobDAO;
    }

    @Override
    public List<Job> getAllJobs() {
    	return null;
    }

    @Override
    public Optional<Job> getJobById(Long id) {
    	return null;
    }

    @Override
    public Job createJob(JobDTO jobDTO) {
    	return null;
    }

    @Override
    public Optional<Job> updateJob(Long id, JobDTO jobDTO) {
    	return null;
    }

    @Override
    public boolean deleteJob(Long id) {
    	return false;
    }

    @Override
    public List<Job> searchByJobTitle(String jobTitle) {
    	return null;
    }

    @Override
    public List<Job> searchByCompany(String company) {
    	return null;
    }

    @Override
    public List<Job> searchByLocation(String location) {
    	return null;
    }

}
