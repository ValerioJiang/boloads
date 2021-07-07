package com.example.tecweb.boloads.controller;


import com.example.tecweb.boloads.model.Pagamento;
import com.example.tecweb.boloads.model.Prenotazione;
import com.example.tecweb.boloads.service.IPagamentoService;
import com.example.tecweb.boloads.service.IPrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pagamento")
@CrossOrigin(value = "*")
public class PagamentoController {


    @Autowired
    private IPagamentoService pagamentoService;

    /**
     * LIST
     */
    @GetMapping("/")
    public List<Pagamento> list(){
        return pagamentoService.list();
    }

    /**
     * CREATE
     */
    @PostMapping("/create")
    public Pagamento create(@RequestBody Pagamento pagamento
    ){
        return pagamentoService.create(pagamento);
    }

    /**
     * RETRIEVE
     */
    @GetMapping("/retrieve")
    public Pagamento retrieve(@RequestBody Pagamento pagamento){
        return pagamentoService.retrieve(pagamento);
    }

    /**
     * UPDATE
     */
    @PutMapping("/update")
    public Pagamento update(@RequestBody Pagamento pagamento){
        return pagamentoService.update(pagamento);
    }

    /**
     * DELETE
     */
    @DeleteMapping("/delete}")
    public void delete(@RequestBody Pagamento pagamento){
        pagamentoService.delete(pagamento);
    }
}
