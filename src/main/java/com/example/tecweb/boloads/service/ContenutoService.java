package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Contenuto;
import com.example.tecweb.boloads.repository.ContenutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ContenutoService implements IContenutoService{

    @Autowired
    ContenutoRepository contenutoRepository;

    @Override
    public List<Contenuto> list() {
        return contenutoRepository.findAll();
    }

    @Override
    public Contenuto create(Contenuto contenuto) {
        return contenutoRepository.save(contenuto);
    }

    @Override
    public Contenuto retrieve(Long id) {
        return contenutoRepository.getById(id);
    }

    @Override
    public Contenuto update(Contenuto contenuto) {
        return contenutoRepository.save(contenuto);
    }

    @Override
    public void delete(Long id) {
        contenutoRepository.deleteById(id);
    }
}
