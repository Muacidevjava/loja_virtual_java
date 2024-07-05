package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table(name="categoria_produto")
@SequenceGenerator(name = "Seq_categoria_produto", sequenceName = "seq_categoria_produto", allocationSize = 1, initialValue = 1)
public class CategoriaProduto implements Serializable {

     private static final long serialVersion = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_categora_produto")
    private Long id;

    @Column(name = " nome_descrição" ,nullable = false ) // muda o nome da coluna e o nullable = false diz que vai ser obrigatorio
    private String nomeDesc;

}
