package com.example.demo.controller;

import com.example.demo.model.Acesso;
import com.example.demo.repository.AcessoRepository;
import com.example.demo.service.AcessoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @Autowired
    private AcessoRepository acessoRepository;

    @ResponseBody
    @PostMapping(value = "**/salvarAcesso")      /*Mapeando a url para receber JSON*/
    public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso){     /* Recebe o JSON e converte para objeto */

        Acesso acessoSalvo = acessoService.save(acesso);
        return new ResponseEntity<>(acessoSalvo, HttpStatus.OK);
    }


}
