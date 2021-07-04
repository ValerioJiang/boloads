package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Cliente;
import com.example.tecweb.boloads.model.Contenuto;

import java.util.List;

public interface IClienteService {
    List<Cliente> list();

    Cliente create(Cliente cliente);

    Cliente retrieve(Long id);

    Cliente update(Cliente cliente);

    void delete(Long id);
}
