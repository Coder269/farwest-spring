package com.templateproject.api.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany
    @JoinTable(name = "user_colonies", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "colony_id"))
    private List<Colony> colonies;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = true)
    private String avatar;
    @Column(nullable = true)
    private int money;
    @Column(nullable = true)
    private int level;

    public User() {
    }

    public User(String username, String passwordHashed) {
        this.username = username;
        this.password = passwordHashed;
    }

    public User(String username, String password, String avatar, int money, int level) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.money = money;
        this.level = level;
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

    public List<Colony> getColonies() {
        return colonies;
    }

    public void setColonies(List<Colony> colonies) {
        this.colonies = colonies;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
