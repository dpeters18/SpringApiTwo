package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vegetable {
    @Id
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String color;
    public Vegetable() {

    }
    public Vegetable(String name,String type,String color) {
        this.name = name;
        this.type=type;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
