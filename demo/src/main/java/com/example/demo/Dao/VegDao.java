package com.example.demo.Dao;

import com.example.demo.Entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegDao extends JpaRepository<Vegetable,String> {
}
