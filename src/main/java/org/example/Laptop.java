package org.example;

//import jakarta.persistence.Embeddable;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Laptop {
    @Id
    private int lapid;
    private String brand;
    private String model;
    private int ram;
//    @ManyToOne
//    private Alien alien;
//    @ManyToMany(mappedBy = "laptops")
//    private List<Alien> aliens;


//    public List<Alien> getAliens() {
//        return aliens;
//    }
//
//    public void setAliens(List<Alien> aliens) {
//        this.aliens = aliens;
//    }

    public int getLapid() {
        return lapid;
    }

    public void setLapid(int lapid) {
        this.lapid = lapid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lapid=" + lapid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
