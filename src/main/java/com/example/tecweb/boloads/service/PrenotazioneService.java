package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.dto.PrenotazioneDTO;

import com.example.tecweb.boloads.model.Prenotazione;
import com.example.tecweb.boloads.repository.PrenotazioneDAO;
import com.example.tecweb.boloads.repository.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PrenotazioneService implements IPrenotazioneService {

    @Autowired
    PrenotazioneRepository prenotazioneRepository;

    @Autowired
    PrenotazioneDAO prenotazioneDAO;

    @Override
    public List<Prenotazione> list() {
        return prenotazioneRepository.findAll();
    }

    @Override
    public Prenotazione create(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    @Override
    public Prenotazione retrieve(Prenotazione prenotazione) {


            return prenotazioneRepository.getById(prenotazione.getId());



    }

    public List<Prenotazione> retrievePrenotazioniByCartelloneId(Long cartelloneId) {

        return prenotazioneDAO.retrievePrenotazioni(cartelloneId);
    }

    @Override
    public Prenotazione update(Prenotazione prenotazione) {


        return prenotazioneRepository.save(prenotazione);
    }

    @Override
    public void delete(Prenotazione prenotazione) {
        prenotazioneRepository.deleteById(prenotazione.getId());
    }
}
