package com.example.CalculadoraApplication.model;

public class PagamentoRequest {

        private Produto produto;
        private CondicaoPagamento condicaoPagamento;

        public PagamentoRequest(Produto produto, CondicaoPagamento condicaoPagamento) {
            this.produto = produto;
            this.condicaoPagamento = condicaoPagamento;
        }

        public Produto getProduto() {

            return produto;
        }


        public CondicaoPagamento getCondicaoPagamento() {

            return condicaoPagamento;
        }

    }
