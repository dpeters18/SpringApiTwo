package com.example.demo.Service;

import com.example.demo.Entity.Vegetable;

import java.util.List;

public interface VegService {
    public List<Vegetable> getVegetables();

    public Vegetable addVegetable(Vegetable veg);
    public Vegetable findVegByID(String name);
    public Vegetable setVeg(Vegetable veg);
    public String deleteVegByID(String name);
}
