package com.example.CalculadoraApplication.service;

import com.example.CalculadoraApplication.model.PagamentoRequest;
import com.example.CalculadoraApplication.model.Parcela;
import com.example.CalculadoraApplication.model.CondicaoPagamento;
import com.example.CalculadoraApplication.model.Produto;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalculadoraService {

    private static final double TAXA_JUROS_NORMAL = 1; // 0% monthly interest rate for <= 6 installments
    private static final double TAXA_JUROS_MAIOR_6 = 1.0105; // 1.5% monthly interest for > 6 installments

    public List<Parcela> calcularParcelas(PagamentoRequest pagamentoRequest) {
        PagamentoRequest pagamento = new PagamentoRequest(pagamentoRequest.getProduto(), pagamentoRequest.getCondicaoPagamento());
        double valorProduto = pagamento.getProduto().getValor();
        double valorRestante = valorProduto - pagamento.getCondicaoPagamento().getValorEntrada();
        int qtdeParcelas = pagamento.getCondicaoPagamento().getQtdeParcelas();
        double taxaJuros = qtdeParcelas > 6 ? TAXA_JUROS_MAIOR_6 : TAXA_JUROS_NORMAL;

        double valorParcela = Math.round(valorRestante/qtdeParcelas);

        List<Parcela> parcelas = new ArrayList<>();
        for (int i = 1; i <= qtdeParcelas; i++) {
            double valorJurosMes = calcularJurosMes(valorParcela, taxaJuros);
            Parcela parcela = new Parcela(i, valorJurosMes, taxaJuros);
            parcelas.add(parcela);
        }

        return parcelas;
    }

    private double calcularJurosMes(double valorParcela, double taxaJuros) {
        double valorParcelaMes =  valorParcela * taxaJuros;
        return valorParcelaMes;
    }
}