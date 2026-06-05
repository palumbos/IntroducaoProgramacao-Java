package romanos_decimais;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numDec;
        String numRom;

        numDec = lerDecimal();

        numRom = transformarRomano(numDec);

        mostrarNumero(numDec, numRom);
    }

    public static int lerDecimal() {
        System.out.print("digite um numero inteiro positivo no sistema decimal (menor que 4000) : ");
        int n = input.nextInt();
        return n;
    }

    public static String transformarRomano(int n) {
        int[] decimal = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolo = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romano = new StringBuilder();
        int x; // esse é o controle de repetição
        if (n < 0) {
            n = n * -1;
        }
        for (int i = 0; i < decimal.length; i = i + x) {
            if (n >= decimal[i]) {
                n = n - decimal[i];
                romano.append(simbolo[i]);

                if (n >= decimal[i]) {
                    x = 0;
                } else {
                    x = 1;
                }
            } else {
                x = 1;
            }

        }
        return romano.toString();
    }

    public static void mostrarNumero(int decimal, String romano) {
        if (decimal >= 4000) {
            System.out.println("o programa não representa numeros maiores que 3999, tente com outro numero!!!");
        } else if (decimal > 0) {
            System.out.println("O numero " + decimal + " no sistema de numeração Romana é " + romano);
        } else if (decimal == 0) {
            System.out.println("não existe algarismo que represente a ausência em romano, porem pode ser representado com a palavra em latim \"nula\"");
        } else {
            System.out.println("não existem numeros negativos no romano antigo, porém atualmente pode se representar com um - na frente, então o numero " + decimal + " é  -" + romano);
        }

    }
}
