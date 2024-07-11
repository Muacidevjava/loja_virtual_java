package com.example.demo.controller;

import com.example.demo.model.Acesso;
import com.example.demo.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @PostMapping("/salvar")
    public Acesso salvarAcesso(Acesso acesso){
        return acessoService.save(acesso);
    }
}
