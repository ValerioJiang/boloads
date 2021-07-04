package com.example.tecweb.boloads.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Pubblicitario")
@Getter
@Setter
@NoArgsConstructor
public class Pubblicitario {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "pubblicitario_id")
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    private String indirizzo;

    @Column(name = "partita_iva",unique = true)
    private String partitaIva;

    @Column(name = "status", nullable = false)
    private boolean status;

    @OneToMany(mappedBy = "pubblicitario")
    @JsonIgnore
    private List<Cartellone> cartelloni;


}

