package com.example.tecweb.boloads.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
public class PrenotazioneDTO {

    private Long cartelloneId;
    private Long contenutoId;
    private Date dataVisione;

    public PrenotazioneDTO(Long cartelloneId, Long contenutoId, Date dataVisione) {
        this.cartelloneId = cartelloneId;
        this.contenutoId = contenutoId;
        this.dataVisione = dataVisione;
    }

}