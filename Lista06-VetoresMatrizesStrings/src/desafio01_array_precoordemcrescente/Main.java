package desafio01_array_precoordemcrescente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos produtos tem em sua loja: ");
        int produtos = input.nextInt();

        double[] preco = new double[produtos];

        for (int i = 0; i < produtos; i++) {
            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
            preco[i] = input.nextDouble();
        }

        double aux;
        for (int i = 0; i < produtos; i++) {
            for (int j = i + 1; j < produtos; j++) {
                if (preco[i] > preco[j]) {
                    aux = preco[i];
                    preco[i] = preco[j];
                    preco[j] = aux;
                }
            }
        }

        System.out.println("\nPreços ordenados:");
        for (int i = 0; i < produtos; i++) {
            System.out.println(preco[i]);
        }

        input.close(); 
    }
}