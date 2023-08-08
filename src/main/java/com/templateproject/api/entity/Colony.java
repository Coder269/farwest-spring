package com.templateproject.api.entity;

import jakarta.persistence.*;

@Entity
public class Colony {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String colonyName;
    @Column(nullable = false)
    private String colonyPicture;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private double lastStrike;

    private double woodLastRecolt;

    private double goldLastRecolt;

    private double ironLastRecolt;

    public Colony(String colonyName, String colonyPicture) {
        this.colonyName = colonyName;
        this.colonyPicture = colonyPicture;
    }

    public Colony() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColonyName() {
        return colonyName;
    }

    public void setColonyName(String colonyName) {
        this.colonyName = colonyName;
    }

    public String getColonyPicture() {
        return colonyPicture;
    }

    public void setColonyPicture(String colonyPicture) {
        this.colonyPicture = colonyPicture;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getLastStrike() {
        return lastStrike;
    }

    public void setLastStrike(double lastStrike) {
        this.lastStrike = lastStrike;
    }

    public double getWoodLastRecolt() {
        return woodLastRecolt;
    }

    public void setWoodLastRecolt(double woodLastRecolt) {
        this.woodLastRecolt = woodLastRecolt;
    }

    public double getGoldLastRecolt() {
        return goldLastRecolt;
    }

    public void setGoldLastRecolt(double goldLastRecolt) {
        this.goldLastRecolt = goldLastRecolt;
    }

    public double getIronLastRecolt() {
        return ironLastRecolt;
    }

    public void setIronLastRecolt(double ironLastRecolt) {
        this.ironLastRecolt = ironLastRecolt;
    }
}
