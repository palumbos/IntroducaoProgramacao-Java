package atividade03_vogais;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
    String frase, frasMin;
    int vogal = 0;

    System.out.print("Digite uma frase: ");
    frase = input.nextLine();
     frasMin = frase.toLowerCase();
    
    for (int i = 0; i < frase.length(); i++) {
        char  letra = frasMin.charAt(i);
        if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u') {
            vogal++;
        }
    }

    System.out.println("A quantidade de vogais na frase é: " + vogal);
}
}
