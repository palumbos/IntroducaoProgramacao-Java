package atividade00_maiorquemedia;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int soma = 0, n, maiores = 0, menores = 0, iguais = 0;
        float media;

        System.out.println("é uma media de quantos numeros: ");
        n = Integer.parseInt(input.nextLine());

        int[] conjunto = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("coloque o seu " + i + " numero: ");
            conjunto[i] = Integer.parseInt(input.nextLine());
            soma = soma + conjunto[i];
        }
        media = (float) soma / conjunto.length;

        for (int i = 0; i < n; i++) {
            if (conjunto[i] > media) {
                maiores++;
                System.out.println(conjunto[i] + " é um elemento maior que a media");

            } else if (conjunto[i] < media) {
                menores++;
                System.out.println(conjunto[i] + " é um elemento menor que a media");

            } else {
                iguais++;
                System.out.println(conjunto[i] + " é um elemento igual a media");

            }

        }

    }

}
