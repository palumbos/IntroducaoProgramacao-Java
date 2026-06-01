package atividade04_maioemenor;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] A = new int[5];
        int maior = MIN_VALUE, menor = MAX_VALUE, diferenca, menorP=0, maiorP=0, n=0;
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("digite numeros reais: ");
            n = input.nextInt();
            A[i] = n;
            if(menor > n){
            menor = n;
            menorP = i;
            }
            if(maior < n){
            maior = n;
            maiorP = i;
            }
        }
diferenca = maior - menor;

        System.out.println("o menor numero é: "+menor+" e ele esta na posição "+menorP);
        System.out.println("o maior numero é: "+maior+" e ele esta na posição "+maiorP);
        System.out.println("diferença: "+diferenca);
        
    }
}
