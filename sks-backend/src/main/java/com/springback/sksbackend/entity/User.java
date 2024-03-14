package com.springback.sksbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userid;
    @Column(name="user_name", length = 255)
    private String userName;
    @Column(name="email", length = 255)
    private String email;
    @Column(name="password", length = 255)
    private String password;
}
