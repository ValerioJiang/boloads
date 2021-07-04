package com.example.tecweb.boloads.controller;

import com.example.tecweb.boloads.model.Pubblicitario;
import com.example.tecweb.boloads.service.IPubblicitarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pubblicitario")
@CrossOrigin(value = "*")
public class PubblicitarioController {

    @Autowired
    private IPubblicitarioService pubblicitarioService;


    /**
     * LIST
     */
    @GetMapping("/")
    public List<Pubblicitario> list(){
        return pubblicitarioService.list();
    }

    /**
     * CREATE
     */
    @PostMapping("/create")
    public Pubblicitario create(@RequestBody Pubblicitario pubblicitario){
        return pubblicitarioService.create(pubblicitario);
    }

    /**
     * RETRIEVE
     */
    @GetMapping("/retrieve/{id}")
    public Pubblicitario retrieve(@PathVariable("id") Long id){
        return pubblicitarioService.retrieve(id);
    }

    /**
     * UPDATE
     */
    @PutMapping("/update")
    public Pubblicitario update(@RequestBody Pubblicitario pubblicitario){
        return pubblicitarioService.update(pubblicitario);
    }

    /**
     * DELETE
     */
    @DeleteMapping("/delete/{id}")
    public void delete(Long id){
        pubblicitarioService.delete(id);
    }

}
