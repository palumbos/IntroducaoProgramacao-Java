package desafio_digitosverificadores;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continua = true;
        int[] digitos = new int[6];
        while (continua) {
            lerCodigo(digitos);

            caucularVerificador(digitos);

            for (int i = 0; i < digitos.length; i++) {
                System.out.println(digitos[i]);
            }

            continua = validarProximo();
        }
    }

    public static void lerCodigo(int[] n) {
        System.out.println("digite sua senha de 5 digitos: "); 
        String senha = input.nextLine();
        
        for (int i = 0; i < (n.length - 1); i++) {
         n[i] = Integer.parseInt(String.valueOf(senha.charAt(i)));
        }
    }

    public static void caucularVerificador(int[] n) {
        int verificador, peso = 6, soma = 0;
        for (int i = 0; i < (n.length - 1); i++) {
            soma = soma + (n[i] * peso);
            peso--;
        }
        verificador = 11 - (soma % 11);
        if (verificador == 10 || verificador == 11) {
            verificador = 0;
        }
        n[5] = verificador;
    }

    public static boolean validarProximo() {
        System.out.print("digite se quer colocar mais codigos (sim ou nao): ");
        String conf = input.nextLine();
            
        return "sim".equalsIgnoreCase(conf);

    }
}
