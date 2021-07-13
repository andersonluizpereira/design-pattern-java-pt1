package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //Dependency injection
    public GeraPedidoHandler() {
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        // utilizacao dos servicos de infra
        System.out.println("Salvando pedido no banco de dados...");
        System.out.println("Enviando email para cliente sobre pedido...");
    }

}
