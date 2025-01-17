package com.example.basics.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Practice {

    private final List<String> foods = new ArrayList<>();

    @GetMapping
    public List<String> getFoods() {
        return foods;
    }

    @PostMapping("/add/{food}")
    public String addFood(@PathVariable String food) {
        foods.add(food);
        return "Added " + food;
    }

    @DeleteMapping("/del/{food}")
    public String  delFood(@PathVariable String food) {
        foods.remove(food);
        return "Deleted " + food;
    }


    @PutMapping("/update/{name}/{newName}")
    public String  updateName(@PathVariable String name, @PathVariable String newName) {
            int index = foods.indexOf(name);
            if(index != -1) {
                foods.set(index, newName);
            }
            return "Updated " + newName;
    }




}
