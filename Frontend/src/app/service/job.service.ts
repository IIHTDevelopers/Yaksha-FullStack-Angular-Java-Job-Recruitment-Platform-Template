import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Job } from '../model/job';

@Injectable({
  providedIn: 'root'
})
export class JobService {
  private apiUrl = '';
  constructor(private http: HttpClient) { }
  getAllJobs() {
    //Write your logic here
  }
  getJobById(id: number) {
    //Write your logic here
  }
  createJob(job: Job) {
    //Write your logic here
  }
  updateJob(id: number, job: Job) {
    //Write your logic here
  }
  deleteJob(id: number) {
    //Write your logic here
  }
  searchJobs(searchParams: any) {
    //Write your logic here
  }
}
