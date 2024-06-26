package com.example.CalculadoraApplication.model;

import java.math.BigDecimal;

public class Parcela {
    private int parcela;
    private double valor;
    private double taxaJuros;

    @Override
    public String toString() {
        return "Parcela{" +
                "numero = " + parcela +
                ", valor = " + valor +
                ", taxaJurosAoMes(%) = " + taxaJuros +
                '}';
    }

    public Parcela(int parcela, double valor, double taxaJuros) {
        this.parcela = parcela;
        this.valor = valor;
        this.taxaJuros = (taxaJuros - 1) * 100;
    }

    public int getNumero() {

        return parcela;
    }

    public void setNumero(int numero) {

        this.parcela = numero;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public double getTaxaJuros() {

        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {

        this.taxaJuros = taxaJuros;
    }
}