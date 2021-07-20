package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class testesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

        Imposto imposto = new ICMS(new ISS(null));
        System.out.println(imposto.calcular(orcamento));
    }
}
