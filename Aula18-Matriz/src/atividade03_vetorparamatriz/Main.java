package atividade03_vetorparamatriz;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        String[] lojas = new String[3];
        String[] produtos = new String[4];
        int[][] matriz = new int[3][4];

        for (int i = 0; i < lojas.length; i++) {
            System.out.println("Digite a loja " + (i + 1) + ":");
            lojas[i] = input.nextLine();
        }

        for (int j = 0; j < produtos.length; j++) {
            System.out.println("Digite o produto " + (j + 1) + ":");
            produtos[j] = input.nextLine();
        }

        for (int i = 0; i < lojas.length; i++) {
            for (int j = 0; j < produtos.length; j++) {
                System.out.println("Preço do produto " + produtos[j] + " na loja " + lojas[i] + ":");
                matriz[i][j] = Integer.parseInt(input.nextLine());
            }
        }

        System.out.print("Lojas / Produtos: ");
        for (String p : produtos) {
            System.out.print(p + " ");
        }
        System.out.println();

        for (int i = 0; i < lojas.length; i++) {
            System.out.print(lojas[i] + " | ");
            for (int j = 0; j < produtos.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
