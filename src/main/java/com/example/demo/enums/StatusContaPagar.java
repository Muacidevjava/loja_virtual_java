package com.example.demo.enums;

public enum StatusContaPagar {
    COBRANCA("Paga"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada"),
    NEGOCIADA("ReNegociada");

    private String descricao;

    private StatusContaPagar(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
