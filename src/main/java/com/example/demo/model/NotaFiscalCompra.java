package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
@Data
@Entity
@Table(name = "nota_fiscal_compra")
@SequenceGenerator(name = "seq_nota_fiscal_compra", sequenceName = "seq_nota_fiscal_compra", initialValue = 1, allocationSize = 1)
public class NotaFiscalCompra implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nota_fiscal_compra")
    private Long id;

    private String numeroNota;
    private String serieNota;
    private String descricaoObs;
    private BigDecimal valorTotal;
    private BigDecimal valorDesconto;
    private BigDecimal valorIcms;


    @Temporal(TemporalType.DATE)
    private BigDecimal valorDataCompra;


    @ManyToOne
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk" ))
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "conta_pagar_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_fk" ))
    private ContaPagar contaPagar;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalCompra that = (NotaFiscalCompra) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
