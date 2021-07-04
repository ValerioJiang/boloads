package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.dto.PrenotazioneDTO;

import com.example.tecweb.boloads.model.prenotazione.Prenotazione;


import java.util.List;

public interface IPrenotazioneService {

    List<Prenotazione> list();

    Prenotazione create(PrenotazioneDTO prenotazioneDTO);

    Prenotazione retrieve(PrenotazioneDTO PrenotazioneDTO);

    public List<Prenotazione> retrievePrenotazioniByCartelloneId(Long cartelloneId);

    Prenotazione update(PrenotazioneDTO PrenotazioneDTO);

    void delete(PrenotazioneDTO PrenotazioneDTO);

}
