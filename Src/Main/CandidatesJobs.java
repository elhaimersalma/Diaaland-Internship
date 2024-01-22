package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CandidatesJobs {
    @Id
    private int id;
    @Column
    private int candidateId;
    @Column
    private int jobId;
    @Column
    private String status;

    public CandidatesJobs(int id, int candidateId, int jobId, String status) {
        this.id = id;
        this.candidateId = candidateId;
        this.jobId = jobId;
        this.status = status;
    }

    public CandidatesJobs() {
    }

    public int getId() {
        return id;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public int getJobId() {
        return jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}