package atividade03_vogais;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
    String frase;
    int vogal = 0;

    System.out.print("Digite uma frase: ");
    frase = input.nextLine();

    for (int i = 0; i < frase.length(); i++) {
        char letra = Character.toLowerCase(frase.charAt(i));

        if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u') {
            vogal++;
        }
    }

    System.out.println("A quantidade de vogais na frase é: " + vogal);
}
}
