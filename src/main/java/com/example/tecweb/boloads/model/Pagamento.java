package com.example.tecweb.boloads.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pagamento")
@Getter
@Setter
@NoArgsConstructor
public class Pagamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "nome_titolare")
    private String nomeTitolare;

    @Column(name = "cognome_titolare")
    private String cognomeTitolare;

    @Column(name = "numero_carta")
    private String numeroCarta;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento")
    private Date dataPagamento;

    @OneToOne
    @JoinColumn
    private Prenotazione prenotazione;
}
