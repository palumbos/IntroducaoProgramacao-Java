package atividade21_matriz_quantidadeacertos;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int alunos;
        System.out.println("voce quer caucular a nota de quantos alunos: ");
        alunos = Integer.parseInt(input.nextLine());
        String[] nome = new String[alunos];

        char[][] respostas = new char[alunos][10];
        int[] acertos = new int [alunos];

        adicionarRespostas(respostas, alunos);
        acertos = compararGabarito(respostas, alunos);
        
        for(int i = 0; i < 10; i++){
            System.out.println(acertos[i]);        }
    }

        public static void adicionarRespostas(char[][] escolha, int alunos) {
        char letra, maiuscula;
        for (int i = 0; i < alunos; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("digite a resposta da alternativa" + j + " do aluno" + i);
                letra = input.nextLine().charAt(0);
                maiuscula = Character.toUpperCase(letra);
                while (maiuscula != 'A' && maiuscula != 'B' && maiuscula != 'C' && maiuscula != 'D' && maiuscula != 'E') {
                    System.out.println("as alternativas só vao até 'E', tente novamente: ");
                    letra = input.nextLine().charAt(0);
                    maiuscula = Character.toUpperCase(letra);
                }
                 escolha[i][j] = maiuscula;
            }
        }
    }
        
    public static int[] compararGabarito(char[][] res, int n) {
        int certo = 0;
        int[] acertos = new int[n];
        char[] gA = new char[10];
        char[] gB = new char[10];
        char letra, maiuscula;
        for (int i = 0; i < 10; i++) {
            System.out.println("digite o gabarito A (o gabarito B sera ele ao contrario questão 1 sera a 10 e com as letras inversas)");
            letra = input.nextLine().charAt(0);
            maiuscula = Character.toUpperCase(letra);
            while (maiuscula != 'A' && maiuscula != 'B' && maiuscula != 'C' && maiuscula != 'D' && maiuscula != 'E') {
                System.out.println("as alternativas só vao até 'E', tente novamente: ");
                letra = input.nextLine().charAt(0);
                maiuscula = Character.toUpperCase(letra);
            }
            gA[i] = maiuscula;
        }
        gB = codificarB(gA);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                if (n % 2 == 0) {
                    if (res[i][j] == gA[j]) {
                        certo++;
                    }
                } else {
                    if (res[i][j] == gB[j]) {
                        certo++;
                    }
                }
            }
            acertos[i] = certo;

        }
        return acertos;
    }

    public static char[] codificarB(char[] gA) {
        char[] gB = new char[10];

        for (int i = 0; i < 10; i++) {
            int inverso = 9;
            gB[i] = gA[inverso];
            inverso--;
            switch (gA[i]) {
                case 'A':
                    gB[i] = 'E';
                    break;

                case 'B':
                    gB[i] = 'D';
                    break;

                case 'D':
                    gB[i] = 'B';
                    break;

                case 'E':
                    gB[i] = 'A';
                    break;
            }
        }
        return gB;
    }


}