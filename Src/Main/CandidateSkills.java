package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CandidateSkills {
    @Id
    private int id;
    @Column
    private int candidateId;
    @Column
    private int skillId;
    @Column
    private int score;

    public CandidateSkills(int id, int candidateId, int skillId, int score) {
        this.id = id;
        this.candidateId = candidateId;
        this.skillId = skillId;
        this.score = score;
    }

    public CandidateSkills() {
    }

    public int getId() {
        return id;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public int getSkillId() {
        return skillId;
    }

    public int getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
