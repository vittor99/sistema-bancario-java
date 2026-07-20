package br.com.vittor.banco.main;

import br.com.vittor.banco.model.Cliente;
import br.com.vittor.banco.model.Conta;
import br.com.vittor.banco.service.ContaService;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("vittor", "412341", "vittor@gmail.com", "134241234");

        ContaService contaService = new ContaService();


        Conta conta = contaService.criarConta(cliente);

        contaService.depositar(1001L, 200.0);

        Conta encontrada = contaService.buscarConta(conta.getNumero());

        System.out.println(encontrada);



    }
}
