package br.com.alura.loja;

import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.http.JavaHttpAdapter;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class JavaHttpClient {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpAdapter());
        registro.registrar(orcamento);
    }
}
