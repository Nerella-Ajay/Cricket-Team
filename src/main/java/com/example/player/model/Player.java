package com.example.player.model;

import java.security.PublicKey;

import javax.persistence.*;

@Entity
@Table(name = "TEAM")

public class Player{
    @playerId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "playerId")
    private int playerId;

    @Column(name = "playerName")
    private String playerName;

    @Column(name = "jerseyNumber")
    private int jerseyNumber;

    @Column(name = "role")
    private String role;

    public Player(){}

    public Player(int playerId, String playerName, int jerseyNumber, String role){
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public int getJerseyNumber(){
        return jerseyNumber;

    }
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

}

// Write your code here