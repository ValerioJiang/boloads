package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Pagamento;
import com.example.tecweb.boloads.model.Prenotazione;

import java.util.List;

public interface IPagamentoService {

    List<Pagamento> list();

    Pagamento create(Pagamento pagamento);

    Pagamento retrieve(Pagamento pagamento);

    Pagamento update(Pagamento pagamento);

    void delete(Pagamento pagamento);
}
