package desafio02_inicialnomes;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        String nome, sigla;

        nome = lerNome();

        sigla = fazerSigla(nome);

        System.out.println(sigla);
        input.close();
    }

    public static String lerNome() {
        System.out.println("digite seu nome e sobrenomes (de espaço entre eles)");
        return input.nextLine();
    }

    public static String fazerSigla(String nome) {
        boolean valido;
        StringBuilder sigla = new StringBuilder();
        nome = nome.toUpperCase();
        for (int i = 0; i < nome.length(); i++) {
           
            if ( i == 0 || nome.charAt(i - 1) == ' ') {
                if (nome.charAt(i) == 'D' || nome.charAt(i) == 'E') {
                    if (nome.charAt(i + 1) == 'A' || nome.charAt(i + 1) == 'O' || nome.charAt(i + 1) == 'E' || nome.charAt(i + 1) == 'I' || nome.charAt(i + 1) == 'U') {
                        if (nome.charAt(i + 2) == 'S') {
                            if (nome.charAt(i + 3) == ' ') {
                                valido = false;
                            } else {
                                valido = true;
                            }
                        } else if (nome.charAt(i + 2) == ' ') {
                            valido = false;
                        } else {
                            valido = true;
                        }
                    } else if (nome.charAt(i + 1) == ' ') {
                        valido = false;
                    } else {
                        valido = true;
                    }

                } else if (nome.charAt(i) == ' ') {
                    valido = false;
                } else {
                    valido = true;
                }

                if (valido) {
                    sigla.append(nome.charAt(i));
                }
            }
        }
        return sigla.toString();
    }
}
// gambiarra feita porem funciona