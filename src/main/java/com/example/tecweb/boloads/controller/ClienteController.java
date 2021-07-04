package com.example.tecweb.boloads.controller;

import com.example.tecweb.boloads.model.Cliente;
import com.example.tecweb.boloads.model.Pubblicitario;
import com.example.tecweb.boloads.service.IClienteService;
import com.example.tecweb.boloads.service.IPubblicitarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
@CrossOrigin(value = "*")
public class ClienteController {
    @Autowired
    private IClienteService clienteService;


    /**
     * LIST
     */
    @GetMapping("/")
    public List<Cliente> list(){
        return clienteService.list();
    }

    /**
     * CREATE
     */
    @PostMapping("/create")
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.create(cliente);
    }

    /**
     * RETRIEVE
     */
    @GetMapping("/retrieve/{id}")
    public Cliente retrieve(@PathVariable("id") Long id){
        return clienteService.retrieve(id);
    }

    /**
     * UPDATE
     */
    @PutMapping("/update")
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.update(cliente);
    }

    /**
     * DELETE
     */
    @DeleteMapping("/delete/{id}")
    public void delete(Long id){
        clienteService.delete(id);
    }
}
