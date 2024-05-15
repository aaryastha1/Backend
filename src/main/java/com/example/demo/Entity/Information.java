package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="information")
public class Information {

    @Id
    private Integer id;

    @Column(name = "title", length = 100)
    private String title;
}

