package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Contenuto;


import java.util.List;

public interface IContenutoService {

    List<Contenuto> list();

    Contenuto create(Contenuto contenuto);

    Contenuto retrieve(Long id);

    Contenuto update(Contenuto contenuto);

    void delete(Long id);
}
