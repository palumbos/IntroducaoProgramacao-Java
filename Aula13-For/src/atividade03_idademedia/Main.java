
package atividade03_idademedia;

import java.util.Scanner;


public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int menor= 0, maior=0, n;
        
        System.out.print("digite de quantos numeros é o conjunto: ");
            n = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < n; i++){
            System.out.print("digite o "+(i+1)+" numero: ");
              int numero = Integer.parseInt(input.nextLine());
        if(i==1){
            menor = numero;
            maior = numero;        
        }      
        if(numero < menor)menor = numero;
        if(numero > maior)maior = numero;
     }
     System.out.println("o maior numero é "+maior);
     System.out.println("o menor numero é "+menor);
    
}
}
