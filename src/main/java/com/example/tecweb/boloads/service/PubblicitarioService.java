package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Pubblicitario;
import com.example.tecweb.boloads.repository.PubblicitarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 * https://www.baeldung.com/spring-data-partial-update
 * Partial update
 */

@Service
@Slf4j
public class PubblicitarioService implements IPubblicitarioService {

    @Autowired
    PubblicitarioRepository pubblicitarioRepository;

    /**
     * LIST
     * @return
     */
    @Override
    public List<Pubblicitario> list() {
        return pubblicitarioRepository.findAll();
    }

    /**
     * CREATE
     * @param user
     * @return
     */
    @Override
    public Pubblicitario create(Pubblicitario user) {
        return pubblicitarioRepository.save(user);
    }

    /**
     * RETRIEVE
     * @param id
     * @return
     */
    @Override
    public Pubblicitario retrieve(Long id) {
        return pubblicitarioRepository.findById(id).orElseThrow(() -> new Error("Error at service retrieving user by id"));
    }

    /**
     * UPDATE
     * @param pubblicitario
     * @return
     */
    @Override
    public Pubblicitario update(Pubblicitario pubblicitario) {

        //Possiamo fare update solo indirizzo e partita iva
        Pubblicitario toUpd = retrieve(pubblicitario.getId());
        toUpd.setIndirizzo(pubblicitario.getIndirizzo());
        toUpd.setPartitaIva(pubblicitario.getPartitaIva());
        return pubblicitarioRepository.save(pubblicitario);

    }

    @Override
    public void delete(Long id) {
        pubblicitarioRepository.deleteById(id);
    }
}
