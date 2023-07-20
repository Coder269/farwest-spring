package com.templateproject.api.controller;


import com.templateproject.api.entity.Ressource;
import com.templateproject.api.service.RessourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RessourceController {

    @Autowired
    private RessourceService ressourceService;

    @PostMapping("/create-ressource")
    public ResponseEntity<?> createRessource(@RequestBody Ressource ressource)
    {
        return new ResponseEntity<>(ressourceService.createRessource(ressource),
                HttpStatus.CREATED);
    }

    @PutMapping("/update-ressource")
    public ResponseEntity<?> updateRessource(@RequestBody Ressource ressource)
    {
        return new ResponseEntity<>(ressourceService.updateRessource(ressource),
                HttpStatus.OK);
    }

    @GetMapping("/get-ressource/{id}")
    public ResponseEntity<?> getRessourceOfColony(@PathVariable("id") int id)
    {
        return new ResponseEntity<>(ressourceService.getRessourceOfColony(id),
                HttpStatus.OK);
    }

    @PutMapping("/update-cowboy/{id}")
    public ResponseEntity<?> updateNumberCowboy(@PathVariable("id") int id, @RequestBody int nbCowboy)
    {
        ressourceService.updateNumberCowboy(id, nbCowboy);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-wood/{id}")
    public ResponseEntity<?> updateWood(@PathVariable("id") int id, @RequestBody int wood)
    {
        ressourceService.updateWood(id, wood);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-iron/{id}")
    public ResponseEntity<?> updateIron(@PathVariable("id") int id, @RequestBody int iron)
    {
        ressourceService.updateIron(id, iron);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update-gold/{id}")
    public ResponseEntity<?> updateGold(@PathVariable("id") int id, @RequestBody int gold)
    {
        ressourceService.updateGold(id, gold);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
