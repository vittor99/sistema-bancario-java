package br.com.vittor.banco.menu;

import br.com.vittor.banco.service.ContaService;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ContaService contaService;


    public Menu (){
        scanner = new Scanner(System.in);
        contaService = new ContaService();
    }

    public void iniciar(){

    }




}
