package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id ")
public class PessoaJuridica extends Pessoa{
    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String inscEstadual;
    private String inscMuniciapl;
    private String nomeFantasia;
    private String razaoSocial;
    private String categoria;
}
