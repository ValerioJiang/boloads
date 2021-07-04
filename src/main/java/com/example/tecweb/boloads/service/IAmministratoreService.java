package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Amministratore;

import java.util.List;

public interface IAmministratoreService {

    List<Amministratore> list();

    Amministratore create(Amministratore amministratore);

    Amministratore retrieve(Long id);

    Amministratore update(Amministratore amministratore);

    void delete(Long id);

}
