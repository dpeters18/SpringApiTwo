package com.example.demo.Controller;

import com.example.demo.Entity.Vegetable;
import com.example.demo.Service.VegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private VegService vegService;
    @GetMapping("/")
    public String home(){
        return "<HTML><h1>Vegetable Service</h1></HTML>";
    }
    @GetMapping("/vegService")
    public List<Vegetable> allVegetables(){
        return vegService.getVegetables();
    }
    @GetMapping("/vegService/{veg}")
    public Vegetable findVegByID(@PathVariable String veg){
        return vegService.findVegByID(veg);
    }
    @PostMapping("/vegService")
    public Vegetable addVegetable(@RequestBody Vegetable veg){
        return vegService.addVegetable(veg);
    }
    @PutMapping("/vegService")
    public Vegetable setVegetable(@RequestBody Vegetable veg){
        return vegService.setVeg(veg);
    }
    @DeleteMapping("/vegService/{veg}")
    public String DeleteVegByID(@PathVariable String veg){
        return vegService.deleteVegByID(veg);
    }

}
