package br.com.vittor.banco.service;

import br.com.vittor.banco.model.Cliente;
import br.com.vittor.banco.model.Conta;
import br.com.vittor.banco.repository.ContaRepository;

public class ContaService {

    private ContaRepository repository;
    private Long proximoNumero = 1000L;

    public ContaService() {
        repository = new ContaRepository();
    }

    public Conta criarConta(Cliente cliente) {

        Long numero = ++proximoNumero;

        Conta conta = new Conta(numero, cliente);

        repository.salvar(conta);

        return conta;
    }

    public Conta buscarConta(Long numero) {

        return repository.buscarPorNumero(numero);

    }

    public void depositar (Long numeroConta, double valor){
        Conta conta = buscarConta(numeroConta);
        if (conta == null){
            return;
        }
        if (!conta.isAtiva()){
            return;
        }
        if (valor <= 0){
            return;
        }
        conta.adicionarSaldo(valor);

    }



}