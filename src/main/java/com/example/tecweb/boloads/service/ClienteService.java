package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Cliente;
import com.example.tecweb.boloads.repository.util.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClienteService implements IClienteService{

    @Autowired
    ClienteRepository clienteRepository;


    @Override
    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente retrieve(Long id) {
        return clienteRepository.getById(id);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.delete(retrieve(id));
    }
}
