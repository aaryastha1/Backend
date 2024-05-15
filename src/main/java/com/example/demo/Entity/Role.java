package com.example.demo.Entity;

public class Role {
    package com.example.demo.entity;

import jakarta.persistence.*;

    @Entity
    @Table(name="users", uniqueConstraints = {
            @UniqueConstraint(name = "unique_user_name",
                    columnNames = {"user_name"})
    })
    public class User {

        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "information_seq_gen")
        @SequenceGenerator(name = "information_seq_gen",sequenceName = "information_seq",allocationSize = 1,initialValue = 1)
        @Id
        private Integer id;

        @Column(name="user_name",length = 255)
        private String userName;

        @Column(name="address",length=255)
        private String address;

        @Column(name="contact",length = 255)
        private  Integer contactNumber;
    }
}
