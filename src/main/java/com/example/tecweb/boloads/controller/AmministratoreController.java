package com.example.tecweb.boloads.controller;

import com.example.tecweb.boloads.model.Amministratore;
import com.example.tecweb.boloads.service.IAmministratoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/amministratore")
@CrossOrigin(value = "*")
public class AmministratoreController {

    @Autowired
    private IAmministratoreService amministratoreService;

    /**
     * LIST
     * @return
     */
    @GetMapping("/")
    public List<Amministratore> list(){
        return amministratoreService.list();
    }

    /**
     * CREATE
     * @param amministratore
     * @return
     */
    @PostMapping("/create")
    public Amministratore create(@RequestBody Amministratore amministratore){
        return amministratoreService.create(amministratore);
    }

    /**
     * RETRIEVE
     * @param id
     * @return
     */
    @GetMapping("/retrieve/{id}")
    public Amministratore retrieve(@PathVariable("id")Long id){
        return amministratoreService.retrieve(id);
    }

    /**
     * UPDATE
     * @param amministratore
     * @return
     */
    @PutMapping("/update")
    public Amministratore update(@RequestBody Amministratore amministratore){
        return amministratoreService.update(amministratore);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        amministratoreService.delete(id);
    }

}
