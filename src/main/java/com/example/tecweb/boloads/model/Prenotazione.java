package com.example.tecweb.boloads.model;

import com.example.tecweb.boloads.model.Cartellone;
import com.example.tecweb.boloads.model.Contenuto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * un contenuto per cartellone per data
 */

@Entity
@Table(name = "prenotazione")
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "cartellone_id")
    private Cartellone cartellone;

    @ManyToOne
    @JoinColumn(name = "contenuto_id")
    private Contenuto contenuto;

    @OneToOne
    @JoinColumn
    private Pagamento pagamento;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_visione")
    private Date dataVisione;


}
