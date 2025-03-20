package com.csc340.demo.bird;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BirdRepository extends JpaRepository<Bird, Integer> {

    List<Bird> getBirdsBySpecies(String species);
    List<Bird> getBirdsByColor(String color);

    @Query(value = "select * from birds s where s.name like %?1% ", nativeQuery = true)
    List<Bird> getBirdsByName(String name);


}
