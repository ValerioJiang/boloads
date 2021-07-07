package com.example.tecweb.boloads.controller;


import com.example.tecweb.boloads.dto.PrenotazioneDTO;
import com.example.tecweb.boloads.model.Prenotazione;
import com.example.tecweb.boloads.service.IPrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/prenotazione")
@CrossOrigin(value = "*")
public class PrenotazioneController {


    @Autowired
    private IPrenotazioneService prenotazioneService;

    /**
     * LIST
     */
    @GetMapping("/")
    public List<Prenotazione> list(){
        return prenotazioneService.list();
    }

    /**
     * CREATE
     */
    @PostMapping("/create")
    public Prenotazione create(@RequestBody Prenotazione prenotazione
    ){
        return prenotazioneService.create(prenotazione);
    }

    /**
     * RETRIEVE
     */
    @GetMapping("/retrieve")
    public Prenotazione retrieve(@RequestBody Prenotazione prenotazione){
        return prenotazioneService.retrieve(prenotazione);
    }

    @GetMapping("/retrieveByCartelloneId/{cartelloneId}")
    public List<Prenotazione> retrieveByCartelloneId(@PathVariable("cartelloneId") Long cartelloneId){
        return prenotazioneService.retrievePrenotazioniByCartelloneId(cartelloneId);
    }

    /**
     * UPDATE
     */
    @PutMapping("/update")
    public Prenotazione update(@RequestBody Prenotazione prenotazione){
        return prenotazioneService.update(prenotazione);
    }

    /**
     * DELETE
     */
    @DeleteMapping("/delete}")
    public void delete(@RequestBody Prenotazione prenotazione){
        prenotazioneService.delete(prenotazione);
    }
}
