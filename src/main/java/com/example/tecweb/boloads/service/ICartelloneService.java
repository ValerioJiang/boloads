package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Cartellone;

import java.util.List;

public interface ICartelloneService {

    List<Cartellone> list();

    Cartellone create(Cartellone cartellone);

    Cartellone retrieve(Long id);


    Cartellone update(Cartellone cartellone);

    void delete(Long id);

}