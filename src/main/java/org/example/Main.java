package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setName("Aromal");
//        s1.setRollNo(102);
//        s1.setAge(21);

        Laptop l1 = new Laptop();
        l1.setLapid(1);
        l1.setBrand("ASUS");
        l1.setModel("STRIX");
        l1.setRam(64);

        Laptop l2 = new Laptop();
        l2.setLapid(2);
        l2.setBrand("ASUS");
        l2.setModel("ROG");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setBrand("DELL");
        l3.setModel("G15");
        l3.setRam(64);
        l3.setLapid(3);




        Alien a1 = new Alien();
        a1.setId(1);
        a1.setAname("Ark");
        a1.setTech("JAVA");
        a1.setLaptops(Arrays.asList(l1,l2));

        Alien a2 = new Alien();
        a2.setId(2);
        a2.setAname("Harsh");
        a2.setTech("Python");
        a2.setLaptops(List.of(l1,l2,l3));


        l1.setAliens(List.of(a1,a2));
        l2.setAliens(List.of(a1,a2));
        l3.setAliens(List.of(a2));

//        Method 1:
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();

//        Method 2:
        SessionFactory sf = new Configuration().addAnnotatedClass(org.example.Laptop.class).addAnnotatedClass(org.example.Alien.class).configure().buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(a1);
        session.persist(a2);

        transaction.commit();

//        s2=session.find(Student.class,101);

        session.close();
        sf.close();

        System.out.println(a1);
        System.out.println(a2);
    }
}