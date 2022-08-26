package com.example.demo.Service;

import com.example.demo.Dao.VegDao;
import com.example.demo.Entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VegServiceImpl implements VegService{
    @Autowired
    private VegDao vegDao;
    List<Vegetable> vegetables;
    public VegServiceImpl(){
        vegetables=new ArrayList<>();
        vegetables.add(new Vegetable("Carrot","Apium","orange"));
        vegetables.add(new Vegetable("Celery","Apium","green"));
    }

    public List<Vegetable> getVegetables() {
        return vegDao.findAll();
    }
    public Vegetable addVegetable(Vegetable veg){
        return vegDao.save(veg);
    }
    public Vegetable findVegByID(String name){
      return vegDao.getReferenceById(name);
    }
    public Vegetable setVeg(Vegetable veg){
        return vegDao.save(veg);
    }
    public String deleteVegByID(String name){
       vegDao.deleteById(name);
       return "Deletion successful.";
    }
}
