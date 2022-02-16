/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carrental;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author tomeku
 */
@Getter
@Setter
//@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
//@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
@Entity
public class OrderCar {
    
    @Id
    private String id;
    private String userId;
    private String carId;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate placedAt;
    
    public OrderCar(String id, String userId, String carId, LocalDate startDate,
            LocalDate endDate, LocalDate placedAt) {
        
        this.id = UUID.randomUUID().toString();
        this.userId = userId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.placedAt = placedAt;
    }
    
    public OrderCar() {
        this.id = UUID.randomUUID().toString();
    }

}
