package com.company.crudbasic.model;

import jakarta.persistence.*;

@Entity
@Table(name="emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String add;

    public Employee(Integer id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    public Employee(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
