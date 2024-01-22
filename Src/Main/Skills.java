package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Skills {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String type;

    public Skills(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Skills() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
