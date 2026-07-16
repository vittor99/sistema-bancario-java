package br.com.vittor.banco.repository;

import br.com.vittor.banco.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {

    private final List<Conta> contas;

    public ContaRepository(){  //existe apenas para criar um objeto vazio apenas para que crie uma local de referencia para a entradas dos objetos
        contas = new ArrayList<>();

    }

    public void salvar(Conta conta){
        contas.add(conta);
    }



}
