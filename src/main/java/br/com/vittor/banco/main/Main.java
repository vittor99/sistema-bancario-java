package br.com.vittor.banco.main;

import br.com.vittor.banco.model.Cliente;
import br.com.vittor.banco.model.Conta;
import br.com.vittor.banco.service.ContaService;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("vittor", "412341", "vittor@gmail.com", "134241234");
        Cliente cliente2 = new Cliente("teste", "654341", "teste@gmail.com", "134241145");

        ContaService contaService = new ContaService();


        Conta conta = contaService.criarConta(cliente);
        Conta conta2 = contaService.criarConta(cliente2);

        contaService.depositar(1001L, 20000.0);

        contaService.sacar(1001L, 1000.0);

        contaService.transferir(1001L, 1002L, 5000.0);


        Conta encontrada = contaService.buscarConta(conta.getNumero());
        Conta encontrada2 = contaService.buscarConta(conta2.getNumero());

        System.out.println(encontrada);
        System.out.println(encontrada2);



    }
}
