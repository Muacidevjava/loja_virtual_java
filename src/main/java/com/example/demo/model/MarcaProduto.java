package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


@Entity
@Table(name = "marca_produto")
@SequenceGenerator(name = "marca_produto_sequence", sequenceName = "marca_produto_sequence", allocationSize = 1, initialValue = 1)
@Data
public class MarcaProduto  implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_marca_produto" )
    @Id
    private Long id;

    @Column(nullable = false) // vai ser obrigatório
    private String nomeDesc;





}