package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificates {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String link;

    public Certificates(int id, String name, String link) {
        this.id = id;
        this.name = name;
        this.link = link;
    }

    public Certificates() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
