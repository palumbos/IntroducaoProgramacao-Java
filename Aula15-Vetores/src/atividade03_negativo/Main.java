package atividade03_negativo;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float[] A = new float[10];
        float n;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite numeros reais");
            n = input.nextFloat();
            A[i] = n;
        }
        for (int i = 0; i < 10; i++) {
            if (A[i] < 0) {
                System.out.println("o numero da posicao " + i + " é negativo");
            }
        }
    }
}
