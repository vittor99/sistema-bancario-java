package br.com.vittor.banco.service;

import br.com.vittor.banco.exception.ContaInativaException;
import br.com.vittor.banco.exception.ContaNaoEncontradaException;
import br.com.vittor.banco.exception.SaldoInsuficienteException;
import br.com.vittor.banco.exception.ValorInvalidoException;
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
            throw new ContaNaoEncontradaException();
        }
        if (!conta.isAtiva()){
            throw new ContaInativaException();
        }
        if (valor <= 0){
            throw new ValorInvalidoException();
        }
        conta.depositar(valor);

    }


    public void sacar (Long numeroConta, double valor){
        Conta conta = buscarConta(numeroConta);
        if (conta == null){
            throw new ContaNaoEncontradaException();
        }
        if (!conta.isAtiva()){
            throw new ContaInativaException();
        }
        if (valor <= 0){
            throw new ValorInvalidoException();
        }
        if (conta.getSaldo() < valor){
            throw new SaldoInsuficienteException();
        }
        conta.sacar(valor);

    }

    public void transferir (Long numeroContaX, Long numeroContaY, double valor){
        Conta contaX = buscarConta(numeroContaX);
        Conta contaY = buscarConta(numeroContaY);

        if (contaX == null || contaY == null){
            throw new ContaNaoEncontradaException();
        }

        if (!contaX.isAtiva() || !contaY.isAtiva()){
            throw new ContaInativaException();
        }
        if (valor <= 0){
            throw new ValorInvalidoException();
        }
        if (contaX.getSaldo() < valor){
            throw new SaldoInsuficienteException();
        }

        contaX.debitar(valor);
        contaY.creditar(valor);






    }









}