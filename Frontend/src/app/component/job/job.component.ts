import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Job } from 'src/app/model/job';
@Component({
  selector: 'app-job',
  templateUrl: './job.component.html',
  styleUrls: ['./job.component.css']
})
export class JobComponent implements OnInit {
  jobForm!: FormGroup;
  jobs!: Job[];
  searchForm!: FormGroup;
  constructor() { }

  ngOnInit(): void {
    //Write your logic here
  }

  loadJobs(): void {
    //Write your logic here
  }

  createJob(): void {
    //Write your logic here
  }

  getJobById(id: number): void {
    //Write your logic here
  }

  updateJob(): void {
    //Write your logic here
  }

  deleteJob(job: Job): void {
    //Write your logic here
  }

  searchJobs(): void {
    //Write your logic here
  }

}
