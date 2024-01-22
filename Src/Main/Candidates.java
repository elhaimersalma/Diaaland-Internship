package Diaaland.ma.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Candidates {
    @Id
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String description;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String accountStatus;
    @Column
    private String phoneNumber;
    @Column
    private String jobStatus;
    @Column
    private String linkedIn;
    @Column
    private String gitHub;
    @Column
    private String portfolio;
    @Column
    private String blog;
    @Column
    private double expectedSalary;
    @Column
    private String resumeLink;
    @Column
    private String photoLink;

    public Candidates() {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getGitHub() {
        return gitHub;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getBlog() {
        return blog;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public Candidates(int id, String firstName, String lastName, String description, String email, String password, String accountStatus, String phoneNumber, String jobStatus, String linkedIn, String gitHub, String portfolio, String blog, double expectedSalary, String resumeLink, String photoLink) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.email = email;
        this.password = password;
        this.accountStatus = accountStatus;
        this.phoneNumber = phoneNumber;
        this.jobStatus = jobStatus;
        this.linkedIn = linkedIn;
        this.gitHub = gitHub;
        this.portfolio = portfolio;
        this.blog = blog;
        this.expectedSalary = expectedSalary;
        this.resumeLink = resumeLink;
        this.photoLink = photoLink;
    }
}
