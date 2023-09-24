package com.example.Spring_MySql.Model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    private String title;
    private String price;
    private String details;
    private String image_url;
    private int quantity;
    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = true)
    private Category category;
}
