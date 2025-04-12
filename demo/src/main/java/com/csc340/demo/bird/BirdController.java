package com.csc340.demo.bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/birds")
public class BirdController {

    @Autowired
    private BirdService service;

    @GetMapping("/all")
    public Object getAllBirds(Model model) {
        //return new ResponseEntity<>(service.getAllBirds(), HttpStatus.OK);
        model.addAttribute("birdList", service.getAllBirds());
        model.addAttribute("title", "All Birds");
        return "bird-list";


    }

    @GetMapping("/createForm")
    public String showCreateForm(Model model) {
        Bird bird = new Bird();
        model.addAttribute("bird", bird);
        model.addAttribute("title", "Create New Bird");
        return "bird-create";
    }


    

        @GetMapping("/{birdId}")
    public Object getOneBird(@PathVariable int birdId, Model model) {
        //return new ResponseEntity<>(service.getBirdById(birdId), HttpStatus.OK);
            model.addAttribute("bird", service.getBirdById(birdId));
            model.addAttribute("title", "bird #: " + birdId);
            return "bird-details";


        }

    @PostMapping("/new")
    public Object addNewBird(Bird bird) {
        service.addNewBird(bird);
        //return new ResponseEntity<>(service.getAllBirds(), HttpStatus.CREATED);
        return "redirect:/birds/all";

    }






    @PostMapping("/update/{birdId}")
    public Object updateBird(@PathVariable int birdId, Bird bird) {
        service.updateBird(birdId, bird);
        //return new ResponseEntity<>(service.getBirdById(birdId), HttpStatus.OK);
        return "redirect:/birds/" + birdId;

    }

    @GetMapping("/update/{birdId}")
    public String showUpdateForm(@PathVariable int birdId, Model model) {
        model.addAttribute("bird", service.getBirdById(birdId));
        model.addAttribute("title", "Update Bird");
        return "bird-update";
    }

    @GetMapping("/delete/{birdId}")
    public Object deleteBirdById(@PathVariable int birdId) {
        service.deleteBirdById(birdId);
        //return new ResponseEntity<>(service.getAllBirds(), HttpStatus.OK);
        return "redirect:/birds/all";

    }



    @GetMapping("/species/{species}")
    public Object getBirdsBySpecies(@PathVariable String species, Model model) {
       // return new ResponseEntity<>(service.getBirdsBySpecies(species), HttpStatus.OK);
        model.addAttribute("birdList", service.getBirdsBySpecies(species));
        model.addAttribute("title", "Birds by species" + species);
        return "bird-list";
    }

    @GetMapping("/color/{color}")
    public Object getBirdsByColor(@PathVariable String color, Model model) {
        //return new ResponseEntity<>(service.getBirdsByColor(color), HttpStatus.OK);
        model.addAttribute("birdList", service.getBirdsByColor(color));
        model.addAttribute("title", "Birds by color" + color);
        return "bird-list";
    }

    @GetMapping("/name")
    public Object getBirdsByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        //return new ResponseEntity<>(service.getBirdsByName(search), HttpStatus.OK);
        model.addAttribute("birdList", service.getBirdsByName(search));
        model.addAttribute("title", "Birds by name" + search);
        return "bird-list";



    }
    }


