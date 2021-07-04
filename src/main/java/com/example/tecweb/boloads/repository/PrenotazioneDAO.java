package com.example.tecweb.boloads.repository;

import com.example.tecweb.boloads.dto.PrenotazioneDTO;
import com.example.tecweb.boloads.model.prenotazione.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class PrenotazioneDAO {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    private EntityManager em;

    /**
     * RETRIEVE certain PRENOTAZIONI
     *
     */
    public List <Prenotazione> retrievePrenotazioni(PrenotazioneDTO prenotazioneDTO){

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Prenotazione> query = criteriaBuilder.createQuery( Prenotazione.class );
        Root<Prenotazione> prenotazioneRoot = query.from( Prenotazione.class );
        query.select(prenotazioneRoot);
        List<Predicate> predicates = new ArrayList<>();

        Long cartelloneId = prenotazioneDTO.getCartelloneId();

        if (cartelloneId != null) {
            Predicate cartelloneId_is_equal = criteriaBuilder.equal(prenotazioneRoot.get("Prenotazione").get("cartelloneId"), cartelloneId);
            predicates.add(cartelloneId_is_equal);
        }

        Long contenutoId = prenotazioneDTO.getContenutoId();

        if (contenutoId != null) {
            Predicate contenutoId_is_equal = criteriaBuilder.equal(prenotazioneRoot.get("Prenotazione").get("contenutoId"), contenutoId);
            predicates.add(contenutoId_is_equal);
        }

        Date dataVisione = prenotazioneDTO.getDataVisione();

        if(dataVisione != null){
            Predicate dataVisione_is_equal = criteriaBuilder.equal(prenotazioneRoot.get("Prenotazione").get("dataVisione"), dataVisione);
            predicates.add(dataVisione_is_equal);
        }


        return  em.createQuery(query).getResultList();

    }

}
