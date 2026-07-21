package br.com.vittor.banco.model;

public class Conta {

    private Long numero;
    private Cliente titular; // para a conta saber quem e seu dono
    private double saldo;
    private boolean ativa;


    public Conta(Long numero, Cliente titular){
        this.numero = numero; //verifica
        this.titular = titular;
        this.saldo = 0.0;
        this.ativa = true;
    }

    public Long getNumero() {
        return numero;
    }

    public Cliente getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public String toString(){
        return "Conta{" + " \nnumero= " + numero + "\ntitular= " + titular.getNome() + "\nsaldo= "
                + saldo + "\nativa= " + ativa + "\n}";
    }


    public void depositar(double valor){
        saldo += valor;
    }


    public void sacar (double valor){
        saldo -= valor;
    }

    public void debitar(double valor){
        saldo -= valor;
    }

    public void creditar(double valor){
        saldo += valor;
    }





}
