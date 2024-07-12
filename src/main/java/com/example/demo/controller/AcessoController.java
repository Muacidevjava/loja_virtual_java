package com.example.demo.controller;

import com.example.demo.model.Acesso;
import com.example.demo.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @ResponseBody(/*Poder dar um retorno da API*/)
    @PostMapping(value = "/salvar/Acesso")/*Mapeando a url área receber JSON*/
    public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso){/*Recebe o JSON e converte para objeto*/

        Acesso acessoSalvo = acessoService.save(acesso);
        return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);
    }


}
