package com.example.demo.enums;

public enum StatusContaReceber {
    COBRANCA("Paga"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada");

    private String descricao;

    private StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }


}
