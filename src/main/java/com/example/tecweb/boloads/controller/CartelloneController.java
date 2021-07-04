package com.example.tecweb.boloads.controller;

import com.example.tecweb.boloads.model.Cartellone;
import com.example.tecweb.boloads.service.ICartelloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/cartellone")
@CrossOrigin(value = "*")
public class CartelloneController {

    @Autowired
    private ICartelloneService cartelloneService;

    /**
     * LIST
     */
    @GetMapping("/")
    public List<Cartellone> list(){
        return cartelloneService.list();
    }

    /**
     * CREATE
     */
    @PostMapping("/create")
    public Cartellone create(@RequestBody Cartellone cartellone){
        return cartelloneService.create(cartellone);
    }

    /**
     * RETRIEVE
     */
    @GetMapping("/retrieve/{id}")
    public Cartellone retrieve(@PathVariable("id") Long id){
        return cartelloneService.retrieve(id);
    }


    /**
     * UPDATE
     */
    @PutMapping("/update")
    public Cartellone update(@RequestBody Cartellone cartellone){
        return cartelloneService.update(cartellone);
    }

    /**
     * DELETE
     */
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")Long id){
        cartelloneService.delete(id);
    }
}
