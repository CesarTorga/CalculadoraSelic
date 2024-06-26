package com.example.CalculadoraApplication.model;

import java.math.BigDecimal;

public class CondicaoPagamento {
    private double valorEntrada;
    @lombok.Getter
    private int qtdeParcelas;

    public double getValorEntrada() {
        return valorEntrada;
    }

}

