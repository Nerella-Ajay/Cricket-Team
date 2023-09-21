package com.example.player.controller;


import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.player.service.PlayerJpaService;

@RestController
public class PlayerController{

    @Autowired
    public PlayerJpaService playerService;

    @GetMapping("/players")
    public Arraylist<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariabe("playerId") int playerId){
        return playerService.getPlayerById(playerId); 
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }
    
    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player){
        return playerService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        playerService.deletePlayer(playerId);
    }
}


// Write your code here