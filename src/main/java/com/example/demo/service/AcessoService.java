package com.example.demo.service;

import com.example.demo.model.Acesso;
import com.example.demo.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {

    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso){

        /*Qualquer tipo de validação antes de salvar */
        return acessoRepository.save(acesso);
    }
}
