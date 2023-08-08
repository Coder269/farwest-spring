package com.templateproject.api.controller;

import com.templateproject.api.entity.Colony;
import com.templateproject.api.service.ColonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ColonyController {

    @Autowired
    private ColonyService colonyService;

    @GetMapping("/all-colonies")
    public ResponseEntity<?> getAllColonies() {
        return new ResponseEntity<>(colonyService.getAllColonies(), HttpStatus.OK);
    }

    @PostMapping("/create-colony")
    public ResponseEntity<?> createColony(@RequestBody Colony colony) {
        return new ResponseEntity<>(colonyService.createColony(colony), HttpStatus.CREATED);
    }

    @PutMapping("/update-colony")
    public ResponseEntity<?> updateColony(@RequestBody Colony colony) {
        return new ResponseEntity<>(colonyService.updateColony(colony), HttpStatus.OK);
    }

    @DeleteMapping("/delete-colony/{id}")
    public ResponseEntity<?> deleteColony(@PathVariable("id") int id) {
        colonyService.deleteColony(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/colonies-user/{id}")
    public ResponseEntity<?> getColoniesOfUser(@PathVariable("id") int id) {
        return new ResponseEntity<>(colonyService.getAllColoniesOfUser(id), HttpStatus.OK);
    }
    @GetMapping("/colony/{id}")
    public ResponseEntity<?> getColonyById(@PathVariable("id") int id) {
        return new ResponseEntity<>(colonyService.getColonyById(id), HttpStatus.OK);
    }

}
