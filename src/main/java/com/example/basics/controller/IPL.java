package com.example.basics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/my-secrets")
public class IPL {

    @GetMapping("/favourite-foods")
    public String[] getIPLTeams(){
            String[] teams = {"Dosa","Biryani","Butter Chicken","Pizza"};
            return teams;
    }

    @GetMapping("/crushes")
    public List<String> getCrushes(){
        List<String> crushes = new ArrayList<>();
        crushes.add("Manjistha");
        crushes.add("Prisha");
        crushes.add("Rajneet");
        return crushes;
    }
}
