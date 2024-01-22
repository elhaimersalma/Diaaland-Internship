package Diaaland.ma.demo.entity;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Educations {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String school;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private String diploma;
    @Column
    private int candidateId;

    public Educations(int id, String name, String school, Date startDate, Date endDate, String diploma, int candidateId) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.startDate = startDate;
        this.endDate = endDate;
        this.diploma = diploma;
        this.candidateId = candidateId;
    }

    public Educations() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getDiploma() {
        return diploma;
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

    public void setSchool(String school) {
        this.school = school;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
}
