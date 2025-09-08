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
            System.out.println("4. Consultar existencia do nó na ABB");
            System.out.println("5. Conta comparações na consulta de valor na ABB");
            System.out.println("6. Excluir algum valor");
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
                    break;
                case 4:
                    System.out.println("Insere o valor a ser pesquisado: ");
                    valor= le.nextInt();
                    if (abb.consulta(abb.root, valor)) {
                        System.out.println("Valor encontrado na ABB");
                    } else {
                        System.out.println("Valor NAO encontrado na ABB");
                    }
                    break;
                case 5:
                    System.out.println("Informe valor a ser pesquisado");
                    valor = le.nextInt();
                    System.out.println("Quantidade de comparações: " + abb.contaConsulta(abb.root, 0, valor));
                    break;
                case 6:
                    System.out.println("Informe o valor que deseja excluir da tabela: ");
                    valor = le.nextInt();
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }
}
