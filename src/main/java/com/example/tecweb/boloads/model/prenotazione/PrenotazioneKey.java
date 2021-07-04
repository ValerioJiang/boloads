package com.example.tecweb.boloads.model.prenotazione;


import com.example.tecweb.boloads.dto.PrenotazioneDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class PrenotazioneKey implements Serializable {
    @Column(name = "cartellone_id")
    private Long cartelloneId;

    @Column(name = "contenuto_id")
    private Long contenutoId;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_visione")
    private Date dataVisione;

    public PrenotazioneKey(Long cartelloneId, Long contenutoId, Date dataVisione) {
        this.cartelloneId = cartelloneId;
        this.contenutoId = contenutoId;
        this.dataVisione = dataVisione;
    }

    public PrenotazioneKey(PrenotazioneDTO prenotazioneDTO){
        this.cartelloneId = prenotazioneDTO.getCartelloneId();
        this.contenutoId = prenotazioneDTO.getContenutoId();
        this.dataVisione = prenotazioneDTO.getDataVisione();
    }
}