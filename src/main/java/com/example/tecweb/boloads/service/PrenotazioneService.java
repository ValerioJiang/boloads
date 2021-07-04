package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.dto.PrenotazioneDTO;

import com.example.tecweb.boloads.model.prenotazione.Prenotazione;
import com.example.tecweb.boloads.model.prenotazione.PrenotazioneKey;
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
    public Prenotazione create(PrenotazioneDTO prenotazioneDTO) {
        PrenotazioneKey prenotazioneKey = new PrenotazioneKey(prenotazioneDTO);
        Prenotazione prenotazione = new Prenotazione(prenotazioneKey);
        return prenotazioneRepository.save(prenotazione);
    }

    @Override
    public Prenotazione retrieve(PrenotazioneDTO prenotazioneDTO) {

            PrenotazioneKey prenotazioneKey = new PrenotazioneKey(prenotazioneDTO);
            return prenotazioneRepository.getById(prenotazioneKey);



    }

    public List<Prenotazione> retrievePrenotazioniByCartelloneId(Long cartelloneId) {

        PrenotazioneDTO prenotazioneDTO = new PrenotazioneDTO();
        prenotazioneDTO.setCartelloneId(cartelloneId);
        return prenotazioneDAO.retrievePrenotazioni(prenotazioneDTO);
    }

    @Override
    public Prenotazione update(PrenotazioneDTO prenotazioneDTO) {

        PrenotazioneKey prenotazioneKey = new PrenotazioneKey(prenotazioneDTO);
        Prenotazione prenotazione = new Prenotazione(prenotazioneKey);
        return prenotazioneRepository.save(prenotazione);
    }

    @Override
    public void delete(PrenotazioneDTO prenotazioneDTO) {
        prenotazioneRepository.deleteById(new PrenotazioneKey(prenotazioneDTO));
    }
}
