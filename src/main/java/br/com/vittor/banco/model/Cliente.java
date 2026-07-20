package br.com.vittor.banco.model;

public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;


    public Cliente( String nome, String cpf, String email, String telefone) {
        //this.id = id; id removido pois o cliente nao escolhe o id
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf () {
        return this.cpf;
    }

    public String getEmail (){
        return this.email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getTelefone (){
        return this.telefone;
    }

    public void setTelefone (String telefone){
        this.telefone = telefone;

    }

    @Override
    public String toString(){ //nao exibe cpf
        return "Cliente{" + "id= " + this.id +
                ", nome= " + this.nome + ", email= " + this.email +
                ", telefone= " + this.telefone + "}";
    }



}
