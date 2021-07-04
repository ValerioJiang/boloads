package com.example.tecweb.boloads.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "cliente_id")
    private Long id;

    private String username;

    private String password;

    private String indirizzo;

    @Column(name = "partita_iva")
    private String partitaIva;

    @Column(name = "status")
    private boolean status;

    @OneToMany(mappedBy = "cliente")
    @JsonIgnore
    private List<Contenuto> contenuti;


}
