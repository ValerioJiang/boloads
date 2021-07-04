package com.example.tecweb.boloads.model.prenotazione;

import com.example.tecweb.boloads.model.Cartellone;
import com.example.tecweb.boloads.model.Contenuto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * un contenuto per cartellone per data
 */

@Entity
@Table(name = "prenotazione")
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {

    @EmbeddedId
    private PrenotazioneKey Prenotazione;

    public Prenotazione(PrenotazioneKey id) {
        this.Prenotazione = id;
    }
}
