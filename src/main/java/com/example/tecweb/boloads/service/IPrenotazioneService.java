package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.dto.PrenotazioneDTO;

import com.example.tecweb.boloads.model.Prenotazione;


import java.util.List;

public interface IPrenotazioneService {

    List<Prenotazione> list();

    Prenotazione create(Prenotazione prenotazione);

    Prenotazione retrieve(Prenotazione Prenotazione);

    public List<Prenotazione> retrievePrenotazioniByCartelloneId(Long cartelloneId);

    Prenotazione update(Prenotazione Prenotazione);

    void delete(Prenotazione Prenotazione);

}
