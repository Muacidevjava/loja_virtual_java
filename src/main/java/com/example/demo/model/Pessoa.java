package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.core.SpringVersion;

import java.io.Serializable;
@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", initialValue = 1, allocationSize = 1)
public abstract class Pessoa implements Serializable {
    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa")
    private Long id;
    private String nome;
    private String email;
    private String telefone;


}
