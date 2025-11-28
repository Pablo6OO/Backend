package com.example.demo.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    @NotNull(message = "El precio no puede estar vacio")
    private Double price;

    //@NotBlank(message = "El formato de precio no puede estar vacio")
    private String priceFormatted;
    
    @NotBlank(message = "La descripcion no puede estar vacio")
    private String description;

    @NotBlank(message = "La imagen no puede estar vacia y debe incluir el formato de la imagen")
    private String image;

    //private String reviewAuthor;

    //private String reviewComment;

    //@NotBlank(message = "El rating de la reseña no puede estar vacia")
    //private Number reviewRating;
}