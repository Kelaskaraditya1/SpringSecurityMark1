package com.StarkIndustries.SpringSecurityMark1.Model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "Users")
public class Users {

    @Id
    private int userId;

    @Column(unique = true,nullable = false)
    private String username;

    private String password;

    public Users(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String   toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
