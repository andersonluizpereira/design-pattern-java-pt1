package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
        Orcamento terceiro = new Orcamento(new BigDecimal("200"), 1);
        var calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));

    }
}
