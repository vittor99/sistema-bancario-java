package br.com.vittor.banco.repository;

import br.com.vittor.banco.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {

    private final List<Conta> contas;

    public ContaRepository(){
        contas = new ArrayList<>();

    }

    public void salvar(Conta conta){
        contas.add(conta);
    }

    public Conta buscarPorNumero(Long numero) {
        for (Conta conta : contas){
            if (conta.getNumero().equals(numero)){
                return conta;
            }
        }
        return null;
    }



}
