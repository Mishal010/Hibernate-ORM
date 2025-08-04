package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    private int id;
    private String aname;
    private String tech;
    @ManyToMany
    private List<Laptop> laptops;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }

    //    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", aname='" + aname + '\'' +
//                ", tech='" + tech + '\'' +
//                ", laptop=" + laptop +
//                '}';
//    }
}
