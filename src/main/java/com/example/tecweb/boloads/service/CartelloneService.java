package com.example.tecweb.boloads.service;


import com.example.tecweb.boloads.model.Cartellone;
import com.example.tecweb.boloads.repository.CartelloneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CartelloneService implements ICartelloneService{

    @Autowired
    CartelloneRepository cartelloneRepository;


    /**
     * LIST
     */
    @Override
    public List<Cartellone> list(){
        return cartelloneRepository.findAll();
    }

    /**
     * CREATE
     */
    @Override
    public Cartellone create(Cartellone cartellone){
        return cartelloneRepository.save(cartellone);
    }

    /**
     * RETRIEVE
     */
    @Override
    public Cartellone retrieve(Long id){
        return cartelloneRepository.findById(id).orElseThrow(() -> new Error("Error at service retrieving cartellone"));
    }



    /**
     * UPDATE
     * @param cartelloneUpdated
     * @return
     */
    @Override
    public Cartellone update(Cartellone cartelloneUpdated) {

        return cartelloneRepository.save(cartelloneUpdated);
    }

    /**
     * DELETE
     * @param id
     */
    @Override
    public void delete(Long id) {
        cartelloneRepository.deleteById(id);
    }


}
