package com.eccomerce.eccomerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double precio; // Cambiado a Double para mayor flexibilidad con decimales

    @Column(name = "imagen_url")
    private String imagenUrl;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
