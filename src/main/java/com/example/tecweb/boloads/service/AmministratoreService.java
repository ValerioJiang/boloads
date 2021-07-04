package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Amministratore;
import com.example.tecweb.boloads.repository.AmministratoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AmministratoreService implements IAmministratoreService{

    @Autowired
    AmministratoreRepository amministratoreRepository;

    @Override
    public List<Amministratore> list() {
        return amministratoreRepository.findAll();
    }

    @Override
    public Amministratore create(Amministratore amministratore) {
        return amministratoreRepository.save(amministratore);
    }

    @Override
    public Amministratore retrieve(Long id) {
        return amministratoreRepository.findById(id).orElseThrow(() -> new Error("Error at service retrieving amministratore"));
    }

    @Override
    public Amministratore update(Amministratore amministratore) {
        Amministratore toUpd = retrieve(amministratore.getId());
        toUpd.setUsername(amministratore.getUsername());
        toUpd.setPassword(amministratore.getPassword());
        return amministratoreRepository.save(toUpd);
    }

    @Override
    public void delete(Long id) {
        Amministratore temp = retrieve(id);
        amministratoreRepository.deleteById(id);
    }
}
