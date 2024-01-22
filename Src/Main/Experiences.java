package Diaaland.ma.demo.entity;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Experiences {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private int candidateId;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public Experiences() {
    }

    public Experiences(int id, String name, Date startDate, Date endDate, int candidateId) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.candidateId = candidateId;
    }
}
