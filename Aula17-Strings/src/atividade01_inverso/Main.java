
package atividade01_inverso;

import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("escreva qualquer coisa: ");
        String texto = input.nextLine();
        char[] inverso = texto.toCharArray();
        
        for (int i = inverso.length - 1; i >= 0; i --){
            System.out.print(inverso[i]);
        }
        System.out.println("");
        
    }
    
}
