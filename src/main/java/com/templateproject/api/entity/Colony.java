package com.templateproject.api.entity;

import java.util.Date;

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

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastStrike;

    @Temporal(TemporalType.TIMESTAMP)
    private Date woodLastRecolt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date goldLastRecolt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ironLastRecolt;

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

    public Date getLastStrike() {
        return lastStrike;
    }

    public void setLastStrike(Date lastStrike) {
        this.lastStrike = lastStrike;
    }

    public Date getWoodLastRecolt() {
        return woodLastRecolt;
    }

    public void setWoodLastRecolt(Date woodLastRecolt) {
        this.woodLastRecolt = woodLastRecolt;
    }

    public Date getGoldLastRecolt() {
        return goldLastRecolt;
    }

    public void setGoldLastRecolt(Date goldLastRecolt) {
        this.goldLastRecolt = goldLastRecolt;
    }

    public Date getIronLastRecolt() {
        return ironLastRecolt;
    }

    public void setIronLastRecolt(Date ironLastRecolt) {
        this.ironLastRecolt = ironLastRecolt;
    }
}
