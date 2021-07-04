package com.example.tecweb.boloads.controller;

import com.example.tecweb.boloads.model.Contenuto;
import com.example.tecweb.boloads.service.IContenutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contenuto")
@CrossOrigin(value = "*")
public class ContenutoController {

    @Autowired
    private IContenutoService contenutoService;

    /**
     * LIST
     */
    @GetMapping("/")
    public List<Contenuto> list(){
        return  contenutoService.list();
    }

    /**
     * CREATE
     */
    @PostMapping("/create")
    public Contenuto create(@RequestBody Contenuto contenuto){
        return contenutoService.create(contenuto);
    }

    /**
     * RETRIEVE
     */
    @GetMapping("/retrieve/{id}")
    public Contenuto retrieve(@PathVariable("id") Long id){
        return contenutoService.retrieve(id);
    }

    /**
     * UPDATE
     */
    @PutMapping("/update")
    public Contenuto update(@RequestBody Contenuto contenuto){
        return contenutoService.update(contenuto);
    }

    /**
     * DELETE
     */
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        contenutoService.delete(id);
    }

}
