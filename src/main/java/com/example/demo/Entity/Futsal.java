package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
    @Table(name="grounds", uniqueConstraints = {
            @UniqueConstraint(name = "unique_ground_name",
                    columnNames = {"ground_name"})
    })
    public class Futsal {

        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "information_seq_gen")
        @SequenceGenerator(name = "information_seq_gen", sequenceName = "information_seq", allocationSize = 1, initialValue = 1)
        @Id
        private Integer id;

        @Column(name = "ground_name", length = 255)
        private String groundName;

        @OnetoMany(mappedBy="futsal",cascade= CascadeType.ALL)
        private List<Book> books;

    }
