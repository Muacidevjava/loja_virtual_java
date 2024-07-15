package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id ")
public class PessoaJuridica extends Pessoa{
    private static final long serialVersionUID = 1L;


    @Column(nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String inscEstadual;

    private String inscMuniciapl;
    @Column(nullable = false)
    private String nomeFantasia;
    @Column(nullable = false)
    private String razaoSocial;

    private String categoria;
}


