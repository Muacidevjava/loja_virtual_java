package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa{
    private static final long serialVersionUID = 1;

    @Column(nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date  dataNascimento;

}
