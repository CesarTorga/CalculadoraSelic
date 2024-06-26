package com.example.CalculadoraApplication.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.CalculadoraApplication.model.*;
import com.example.CalculadoraApplication.service.CalculadoraService;
import com.fasterxml.jackson.databind.ObjectMapper; // Import Jackson library
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calcular-parcelas")
public class PagamentoController {

    @Autowired
    private CalculadoraService pagamentoService;

    @PostMapping
    public ResponseEntity<PagamentoResponse> calcularParcelas(@RequestBody PagamentoRequest pagamentoRequest) {
        PagamentoRequest pagamento = new PagamentoRequest(pagamentoRequest.getProduto(), pagamentoRequest.getCondicaoPagamento());
        List<Parcela> parcelas = pagamentoService.calcularParcelas(pagamento);
        PagamentoResponse pagamentoResponse = new PagamentoResponse(parcelas);
        return ResponseEntity.ok(pagamentoResponse);
    }
}
