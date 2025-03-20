package com.csc340.demo.bird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/birds")
public class BirdController {

    @Autowired
    private BirdService service;

    @GetMapping("/all")
    public Object getAllBirds() {
        return new ResponseEntity<>(service.getAllBirds(), HttpStatus.OK);

    }


    @GetMapping("/{birdId}")
    public Object getOneBird(@PathVariable int birdId) {
        return new ResponseEntity<>(service.getBirdById(birdId), HttpStatus.OK);

    }

    @PostMapping("/new")
    public Object addNewBird(@RequestBody Bird bird) {
        service.addNewBird(bird);
        return new ResponseEntity<>(service.getAllBirds(), HttpStatus.CREATED);

    }


    @PutMapping("/update/{birdId}")
    public Object updateBird(@PathVariable int birdId, @RequestBody Bird bird) {
        service.updateBird(birdId, bird);
        return new ResponseEntity<>(service.getBirdById(birdId), HttpStatus.OK);

    }

    @DeleteMapping("/delete/{birdId}")
    public Object deleteBirdById(@PathVariable int birdId) {
        service.deleteBirdById(birdId);
        return new ResponseEntity<>(service.getAllBirds(), HttpStatus.OK);
    }

    @GetMapping("/species/{species}")
    public Object getBirdsBySpecies(@PathVariable String species) {
        return new ResponseEntity<>(service.getBirdsBySpecies(species), HttpStatus.OK);
    }

    @GetMapping("/color/{color}")
    public Object getBirdsByColor(@PathVariable String color) {
        return new ResponseEntity<>(service.getBirdsByColor(color), HttpStatus.OK);
    }

    @GetMapping("/name")
    public Object getBirdsByName(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getBirdsByName(search), HttpStatus.OK);

    }
    }


