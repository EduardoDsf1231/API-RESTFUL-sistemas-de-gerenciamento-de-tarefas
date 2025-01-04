package com.example.stg;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    // Getters e setters
}
