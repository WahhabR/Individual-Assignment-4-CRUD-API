package com.csc340.demo.bird;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BirdService {

    @Autowired
    private BirdRepository birdRepository;

    public List<Bird> getAllBirds() {

        return birdRepository.findAll();
    }

    public Bird getBirdById(int birdId) {

        return birdRepository.findById(birdId).orElse(null);
    }

    public void addNewBird(Bird bird) {

        birdRepository.save(bird);
    }


    public void updateBird(int birdId, Bird bird) {
        Bird existing = getBirdById(birdId);
        existing.setName(bird.getName());
        existing.setDescription(bird.getDescription());
        existing.setSpecies(bird.getSpecies());
        existing.setColor(bird.getColor());
        existing.setImg_url(bird.getImg_url());


        //Technically the 4 lines above are not necessary because the save method merges by default.
        birdRepository.save(existing);
    }

    public void deleteBirdById(int birdId) {

        birdRepository.deleteById(birdId);
    }

    public List<Bird> getBirdsBySpecies(String species) {

        return birdRepository.getBirdsBySpecies(species);
    }

    public List<Bird> getBirdsByColor(String color) {

        return birdRepository.getBirdsByColor(color);
    }

    public List<Bird> getBirdsByName(String name){
        return birdRepository.getBirdsByName(name);
    }


}
