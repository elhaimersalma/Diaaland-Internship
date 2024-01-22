package Diaaland.ma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Users {
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String description;
    @Column
    private int roleId;

    public Users(String username, String email, String password, String description, int roleId) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.description = description;
        this.roleId = roleId;
    }

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    private String confirmPassword;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
