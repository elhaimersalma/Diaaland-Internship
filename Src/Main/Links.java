package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Links {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String url;

    public Links(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public Links() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
