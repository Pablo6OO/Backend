package com.example.demo.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String product;
    private Double price;
    private Integer quantity;
    
    @Column(nullable = false)
    private Long userId;
}
