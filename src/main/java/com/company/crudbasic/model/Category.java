package com.company.crudbasic.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Integer id;
    @Column
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products ;
}
