package com.example.demo.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "contact_messages")
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contenido;
    private String date;
}
