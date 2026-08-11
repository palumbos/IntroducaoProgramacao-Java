package desafio03_cpf;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        boolean ver1, ver2 =false;
        int[] cpf = new int[11];

        cpf = lerCPF();

        ver1 = verificarVerificador1(cpf);
        if (ver1) {
            ver2 = verificarVerificador2(cpf);
        }
        mostrarResultado(cpf, ver1, ver2);

    }

    public static int[] lerCPF() {
        int[] n = new int[11];
        int tamanhoCpf = 11;
        String  cpf;
        
        System.out.print("digite seu cpf (Apenas os numeros): ");
        cpf = input.nextLine();
        while(cpf.length() != 11){
            System.out.print("CPF INVALIDO !!! digite apenas os 11 numeros (nao separe com caracteres adicionais!): ");
            cpf = input.nextLine();
        }

        for (int i = 0; i < tamanhoCpf; i++) {
            n[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        return n;
    }

    public static boolean verificarVerificador1(int[] n) {
        int soma = 0, resto, tamanho = 10;
        for (int i = 0; i < 9; i++) {
            soma = soma + (n[i] * tamanho);
            tamanho--;
        }
        resto = soma % 11;

        if (resto == 0 || resto == 1) {
            if (n[9] == 0) {
                return true;
            }
        } else {
            if (n[9] == (11 - resto)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarVerificador2(int[] n) {
        int soma = 0, resto, tamanho = 11;
        for (int i = 0; i < 10; i++) {
            soma = soma + (n[i] * tamanho);
            tamanho--;

        }
        resto = soma % 11;

        if (resto == 0 || resto == 1) {
            if (n[10] == 0) {
                return true;
            }
        } else {
            if (n[10] == (11 - resto)) {
                return true;
            }
        }
        return false;

    }

    public static void mostrarResultado(int[] n, boolean n1, boolean n2) {
        if (n1 && n2) {
            System.out.println("seu cpf é valido, parabens!!!");
        } else {
            System.out.println("o cpf é invalido");
        }
    }

}
