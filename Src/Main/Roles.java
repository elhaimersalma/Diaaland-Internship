package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Roles {
    @Id
    private int id;
    @Column
    private String name;

    public Roles(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Roles() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
