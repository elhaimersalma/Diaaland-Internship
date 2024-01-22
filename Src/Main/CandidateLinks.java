package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CandidateLinks {
    @Id
    private int id;
    @Column
    private int candidateId;
    @Column
    private int linkId;

    public CandidateLinks(int id, int candidateId, int linkId) {
        this.id = id;
        this.candidateId = candidateId;
        this.linkId = linkId;
    }

    public int getId() {
        return id;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public CandidateLinks() {
    }
}
