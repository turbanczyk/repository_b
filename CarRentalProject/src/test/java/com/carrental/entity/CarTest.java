/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.carrental.entity;

import java.util.List;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tomeku
 */
public class CarTest {
    
    private Car newCar;
    
    public CarTest() {
        newCar = new Car("Mondeo", "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testConstructor() {
        System.out.println("testConstructor");
        
        //Car model can't be empty or null
        Exception thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car(null, "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("", "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        
        //Car brand can't be empty or null
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", null, 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        
        //Price per day can't be below 0
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", -1, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        Car i = new Car("Mondeo", "Ford", 250, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        
        //Number of seats can't be smaller than 0 and bigger than 10
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, -1, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, 11, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        
        i = new Car("Mondeo", "Ford", 250, 1, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 10, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        
        //Daily kilometer limit can't be below 0
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, 11, -1, "manualna", true, 
                12345, "średnie", "Katowice");
        });
        
        //Gearbox type can be only manualna lub automatyczna
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, 11, 456, "inna", true, 
                12345, "średnie", "Katowice");
        });
        i = new Car("Mondeo", "Ford", 250, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "średnie", "Katowice");
        
        //Mileage can't be below 0
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, 11, 456, "automatyczna", true, 
                -1, "średnie", "Katowice");
        });

        //Category can be only: małe, średnie, duże, kombi, premium, minivany, SUV"
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, 11, 456, "automatyczna", true, 
                23456, "inne", "Katowice");
        });
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "małe", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "średnie", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "duże", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "kombi", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "premium", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "minivany", "Katowice");
        i = new Car("Mondeo", "Ford", 250, 5, 500, "automatyczna", true, 
                12345, "SUV", "Katowice");
        
        //Localization can't be empty or null
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, 11, 456, "automatyczna", true, 
                23456, "średnie", null);
        });
        thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Car testCar = new Car("Mondeo", "Ford", 250, 11, 456, "automatyczna", true, 
                23456, "średnie", "");
        });

        
    }

    /**
     * Test of findByCategory method, of class Car.
     */
    @Test
    public void testFindByCategory() {
        System.out.println("findByCategory");
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Mustang", "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("Mondeo", "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("ID3", "Volkswagen", 120, 5, 500, "manualna", true, 
                12345, "małe", "Katowice"));
        
        String category = "średnie";
        List newList = Car.findByCategory(carList, category);
        assertThat(newList.size()).isEqualTo(2);
        assertThat(carList.get(0).getModel()).isEqualTo("Mustang");
        assertThat(carList.get(1).getModel()).isEqualTo("Mondeo");
    }

    /**
     * Test of findWithMaxPrice method, of class Car.
     */
    @Test
    public void testFindWithMaxPrice() {
        System.out.println("findWithMaxPrice");
        
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Mustang", "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("Mondeo", "Ford", 90, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("ID3", "Volkswagen", 140, 5, 500, "manualna", true, 
                12345, "małe", "Katowice"));
        
        assertThat(Car.findWithMaxPrice(carList).getPricePerDay()).isEqualTo(140);
    }

    /**
     * Test of findWithMinPrice method, of class Car.
     */
    @Test
    public void testFindWithMinPrice() {
        System.out.println("findWithMinPrice");
        
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Mustang", "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("Mondeo", "Ford", 90, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("ID3", "Volkswagen", 140, 5, 500, "manualna", true, 
                12345, "małe", "Katowice"));
        
        assertThat(Car.findWithMinPrice(carList).getPricePerDay()).isEqualTo(90);
    }

    /**
     * Test of findWithPriceLowerOrEqual method, of class Car.
     */
    @Test
    public void testFindWithPriceLowerOrEqual() {
        System.out.println("findWithPriceLowerOrEqual");
        
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Mustang", "Ford", 120, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("Mondeo", "Ford", 90, 5, 500, "manualna", true, 
                12345, "średnie", "Katowice"));
        carList.add(new Car("ID3", "Volkswagen", 140, 5, 500, "manualna", true, 
                12345, "małe", "Katowice"));
        
        
        List newList = Car.findWithPriceLowerOrEqual(carList, 120);
        assertThat(newList.size()).isEqualTo(2);
        
        newList = Car.findWithPriceLowerOrEqual(carList, 119);
        assertThat(newList.size()).isEqualTo(1);
        
        newList = Car.findWithPriceLowerOrEqual(carList, 80);
        assertThat(newList.size()).isEqualTo(0);
        
        newList = Car.findWithPriceLowerOrEqual(carList, 150);
        assertThat(newList.size()).isEqualTo(3);
    }
    
}
