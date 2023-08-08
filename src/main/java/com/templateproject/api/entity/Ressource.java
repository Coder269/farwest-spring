package com.templateproject.api.entity;

import jakarta.persistence.*;

@Entity
public class Ressource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "colony_id", referencedColumnName = "id")
    private Colony colony;

    @Column(nullable = false)
    private int numberOfCowboy;
    @Column(nullable = false)
    private int wood;
    @Column(nullable = false)
    private int iron;
    @Column(nullable = false)
    private int gold;
    @Column(nullable = false)
    private int sawMill;
    @Column(nullable = false)
    private int forge;
    @Column(nullable = false)
    private int mine;

    public Ressource(){}

    public Ressource(int numberOfCowboy, int wood, int iron, int gold, int sawMill, int forge, int mine) {
        this.numberOfCowboy = numberOfCowboy;
        this.wood = wood;
        this.iron = iron;
        this.gold = gold;
        this.sawMill = sawMill;
        this.forge = forge;
        this.mine = mine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Colony getColony() {
        return colony;
    }

    public void setColony(Colony colony) {
        this.colony = colony;
    }

    public int getNumberOfCowboy() {
        return numberOfCowboy;
    }

    public void setNumberOfCowboy(int numberOfCowboy) {
        this.numberOfCowboy = numberOfCowboy;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSawMill() {
        return sawMill;
    }

    public void setSawMill(int sawMill) {
        this.sawMill = sawMill;
    }

    public int getForge() {
        return forge;
    }

    public void setForge(int forge) {
        this.forge = forge;
    }

    public int getMine() {
        return mine;
    }

    public void setMine(int mine) {
        this.mine = mine;
    }
}
