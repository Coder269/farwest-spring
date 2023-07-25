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
}
