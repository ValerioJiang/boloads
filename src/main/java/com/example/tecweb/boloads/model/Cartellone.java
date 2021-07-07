package com.example.tecweb.boloads.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cartellone")
@Getter
@Setter
@NoArgsConstructor
public class Cartellone {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "larghezza", columnDefinition="Decimal(8,2)")
    private BigDecimal larghezza;

    @Column(name = "altezza", columnDefinition="Decimal(8,2)")
    private BigDecimal altezza;

    @Column(name = "condizione")
    private String condizione;

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "latitudine", columnDefinition="Decimal(11,8)")
    private BigDecimal latitudine;

    @Column(name = "longitudine", columnDefinition="Decimal(11,8)")
    private BigDecimal longitudine;

    @Column(name = "costo_giornata", columnDefinition = "Decimal(6,2)")
    private BigDecimal costoGiornata;

    @ManyToOne
    @JoinColumn(name = "pubblicitario_id")
    private Pubblicitario pubblicitario;

}

