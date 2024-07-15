package com.example.demo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
@Data
public class Usuario implements UserDetails {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataAtualSenha;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey( value = ConstraintMode.CONSTRAINT, name = "pessoa_fk" ))
    private Pessoa pessoa;



    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "usuarios_acesso", uniqueConstraints = @UniqueConstraint(columnNames = {"usuario_id"},
            name = "unique_acesso_user"),

            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id",table = "usuario",
                    unique = false, foreignKey = @ForeignKey(name = "usuario_fk", value = ConstraintMode.CONSTRAINT))
            ,inverseJoinColumns = @JoinColumn(name = "acesso_id",unique = false, referencedColumnName = "id", table = "acesso",
            foreignKey = @ForeignKey(name = "acesso_fk", value = ConstraintMode.CONSTRAINT))
    )
    private List<Acesso> acessos;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.acessos;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.senha;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
