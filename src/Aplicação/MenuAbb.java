package Aplicação;

import ABB.ABBint;

import java.util.Scanner;

public class MenuAbb {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        ABBint abb = new ABBint();
        int opcao;

        do{
            System.out.println("0. Sair");
            System.out.println("1. Inserir valor na ABB");
            System.out.println("2. Aprensentar ABB(em ordem)");
            System.out.println("3. Conta quantidade de nos na ABB");
            System.out.println("Opção: ");
            opcao = le.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Fechando a exeução");
                    break;
                case 1:
                    System.out.println("Informe o valor a ser inserido: ");
                    int valor = le.nextInt();
                    abb.root = abb.inserir(abb.root, valor);
                    break;
                case 2:
                    System.out.println("----------------------------------");
                    System.out.println("Apresentando a ABB: ");
                    abb.show(abb.root);
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    System.out.println("Quantidade de nos na ABB: "+ abb.contaNos(abb.root, 0));
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }
}
