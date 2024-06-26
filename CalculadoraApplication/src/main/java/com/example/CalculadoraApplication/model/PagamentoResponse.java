package com.example.CalculadoraApplication.model;

import java.util.List;

public class PagamentoResponse {

    private List<Parcela> parcelas;

    public PagamentoResponse(List<Parcela> parcelas) {

        this.parcelas = parcelas;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {

        this.parcelas = parcelas;
    }
}