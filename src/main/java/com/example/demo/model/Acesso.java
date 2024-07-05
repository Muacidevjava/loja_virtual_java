package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", initialValue = 1, allocationSize = 1)
@Data
public class Acesso implements GrantedAuthority {
      private static final long SerialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
    private Long id;

    @Column(nullable = false)
    private  String descrição; /*Acesso ex: ROLE_ADMIN ou ROLE_SECRETARIO*/

    @Override
    public String getAuthority() {
        return this.descrição;
    }
}
