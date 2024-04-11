package br.edu.up.telas;

import java.util.Scanner;

public class Menu {
    Scanner leitor = new Scanner(System.in);
    
    public void mostrar(){
        System.out.println("-----------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("-----------------");

        System.out.println("Selecione uma das opções");
        System.out.println("-----------------");
        System.out.println("1. Cadastrar funcionário");
        System.out.println("...");
        System.out.println("5. Registrar pedido");

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1: mostrarMenuUsuario(); break;
            case 5: break;
            default: break;
        }
    }
    public void mostrarMenuUsuario(){
        System.out.println("-----------------");
        System.out.println("MENU USUARIO");
        System.out.println("-----------------");

        System.out.println("Selecione uma das opções");
        System.out.println("-----------------");
        System.out.println("1. Listar");
        System.out.println("2. Incluir");
        System.out.println("3. Alterar");
        System.out.println("4. Excluir");
        System.out.println("5. Voltar");

        int opcao = leitor.nextInt();
    }
}
