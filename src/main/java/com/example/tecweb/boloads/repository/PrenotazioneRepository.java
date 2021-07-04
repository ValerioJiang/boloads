package com.example.tecweb.boloads.repository;

import com.example.tecweb.boloads.model.prenotazione.Prenotazione;
import com.example.tecweb.boloads.model.prenotazione.PrenotazioneKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, PrenotazioneKey> {
}
