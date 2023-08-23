package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name="tbl_categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name", nullable = false, length = 100)
    private String name;
    @Column(name="image", nullable = false, length = 1000)
    private String image;
    @Column(name="description", nullable = false, length = 4000)
    private String description;
}