package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


@Entity
@Table(name = "endereco")
@SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1)
@Data
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_endereco" )
    @Id
    private Long id;

     private String ruaLogra;
     private String cep;
     private String numero;
     private String complemento;
     private String bairro;
     private String uf;
     private String cidade;

     @ManyToOne(targetEntity =  Pessoa.class)
     @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk" ))
     private Pessoa pessoa;





}