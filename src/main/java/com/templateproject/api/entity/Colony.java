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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date lastStrike;

    public Colony(String colonyName, String colonyPicture) {
        this.colonyName = colonyName;
        this.colonyPicture = colonyPicture;
    }

    public Colony() {}
}
