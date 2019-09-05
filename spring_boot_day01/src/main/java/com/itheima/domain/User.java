package com.itheima.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author heiye
 * @date 2019-08-08 17:35
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String username;
    private String password;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
