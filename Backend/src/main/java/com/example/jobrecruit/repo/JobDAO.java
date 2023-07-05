package com.example.jobrecruit.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jobrecruit.entity.Job;

@Repository
public interface JobDAO extends JpaRepository<Job, Long> {


}
