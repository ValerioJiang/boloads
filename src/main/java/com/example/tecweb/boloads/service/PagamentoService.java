package com.example.tecweb.boloads.service;

import com.example.tecweb.boloads.model.Pagamento;
import com.example.tecweb.boloads.repository.PagamentoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PagamentoService implements IPagamentoService{

    @Autowired
    PagamentoRepository pagamentoRepository;

    @Override
    public List<Pagamento> list() {
        return pagamentoRepository.findAll();
    }

    @Override
    public Pagamento create(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public Pagamento retrieve(Pagamento pagamento) {
        return pagamentoRepository.getById(pagamento.getId());
    }

    @Override
    public Pagamento update(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public void delete(Pagamento pagamento) {
        pagamentoRepository.deleteById(pagamento.getId());
    }
}
