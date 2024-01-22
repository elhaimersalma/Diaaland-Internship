package Diaaland.ma.demo.entity;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jobs {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private double minSalary;
    @Column
    private double maxSalary;
    @Column
    private String type;
    @Column
    private Customers customer;
    @Column
    private Date openDate;
    @Column
    private Date closeDate;
    @Column
    private int numberOfPositions;
    @Column
    private String address;
    @Column
    private boolean remoteStatus;
    @Column
    private int customerId;

    public Jobs(int id, String name, String description, double minSalary, double maxSalary, String type, Customers customer, Date openDate, Date closeDate, int numberOfPositions, String address, boolean remoteStatus, int customerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.type = type;
        this.customer = customer;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.numberOfPositions = numberOfPositions;
        this.address = address;
        this.remoteStatus = remoteStatus;
        this.customerId = customerId;
    }

    public Jobs() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public String getType() {
        return type;
    }

    public Customers getCustomer() {
        return customer;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public int getNumberOfPositions() {
        return numberOfPositions;
    }

    public String getAddress() {
        return address;
    }

    public boolean isRemoteStatus() {
        return remoteStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public void setNumberOfPositions(int numberOfPositions) {
        this.numberOfPositions = numberOfPositions;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRemoteStatus(boolean remoteStatus) {
        this.remoteStatus = remoteStatus;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
