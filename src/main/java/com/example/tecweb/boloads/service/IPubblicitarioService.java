package com.example.tecweb.boloads.service;


import com.example.tecweb.boloads.model.Pubblicitario;


import java.util.List;

public interface IPubblicitarioService {

    List<Pubblicitario> list();

    Pubblicitario create(Pubblicitario user);

    Pubblicitario retrieve(Long id);

    Pubblicitario update(Pubblicitario user);

    void delete(Long id);

}
