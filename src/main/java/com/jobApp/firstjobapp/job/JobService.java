package com.jobApp.firstjobapp.job;

import java.util.List;

public interface JobService {

    List<Job> findAll();
    void createJob(Job job);

    Job getByJobId(Long id);

    boolean deleteJobId(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
