
package atividade13_porextenso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String extenso, n;

        System.out.println("digite uma sequencia numerica: ");
        n = input.nextLine();

        for (int i = 0; i < n.length(); i++) {
            switch (n.charAt(i)) {

                case '1':
                    System.out.println("Um");
                    break;

                case '2':
                    System.out.println("Dois");
                    break;

                case '3':
                    System.out.println("Tres");
                    break;

                case '4':
                    System.out.println("Quatro");
                    break;

                case '5':
                    System.out.println("Cinco");
                    break;

                case '6':
                    System.out.println("Seis");
                    break;

                case '7':
                    System.out.println("Sete");
                    break;

                case '8':
                    System.out.println("Oito");
                    break;

                case '9':
                    System.out.println("Nove");
                    break;

                case '0':
                    System.out.println("Dez");
                    break;

                default: {
                    System.out.println("Só aceito numeros, conexão encerrada!!!");
                    System.exit(0);
                }
            }
        }
input.close();
    }
}
