package com.example.tecweb.boloads.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "amministratore")
@Getter
@Setter
@NoArgsConstructor
public class Amministratore {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

}
