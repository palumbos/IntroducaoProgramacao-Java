
package atividade02_contaluz.versao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quiloWatts;
        float preco, conta, contaAtrasado;
        boolean elevado;

        System.out.print("insira a quantidade de quilowatts gasta: ");
        quiloWatts = Integer.parseInt(input.nextLine());

        System.out.print("coloque o preco do kilowatts esse mes: ");
        preco = Float.parseFloat(input.nextLine());

        conta = quiloWatts * preco;
        contaAtrasado = conta + conta / 10f;
        elevado = quiloWatts>70;

        System.out.println("preco caso pague no dia: " + conta +
                "\nconta caso pague atrasado: " + contaAtrasado+
                "\n seu consumo esta elevado:" + elevado);
    }
    
}
