package prova3ex1;

import java.util.Scanner;

public class Prova3Ex1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int quantProg, quantMat;

        System.out.print("Digite quantos Alunos estão Matriculados em Introdução a Programação: ");
        quantProg = Integer.parseInt(input.nextLine());
        while (quantProg < 1 || quantProg > 40) {
            System.out.println("digite um valor entre 1 e 40");
            quantProg = Integer.parseInt(input.nextLine());
        }
        String[] nomesProg = new String[quantProg];
        definirNomes(nomesProg, quantProg);

        System.out.print("Digite quantos Alunos estão Matriculados em Matematica Discreta: ");
        quantMat = Integer.parseInt(input.nextLine());
        while (quantMat < 1 || quantMat > 40) {
            System.out.println("digite um valor entre 1 e 40");
            quantMat = Integer.parseInt(input.nextLine());
        }
        String[] nomesMat = new String[quantMat];
        definirNomes(nomesMat, quantMat);

        verificarNomes(nomesProg, nomesMat, quantProg, quantMat);
    }

    public static void definirNomes(String[] nomes, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do aluno numero " + (i + 1) + " ");
            nomes[i] = input.nextLine();
        }
    }

    public static void verificarNomes(String[] prog, String[] mat, int n1, int n2) {
        String[] alunosApenasProg = new String[n1];
        int soProg = 0;
        boolean apenasProg;

        for (int i = 0; i < n1; i++) {
            apenasProg = true;
            for (int j = 0; j < n2; j++) {
                if (prog[i].equalsIgnoreCase(mat[j])) {
                    apenasProg = false;
                    break;
                }
            }

            if (apenasProg) {
                alunosApenasProg[soProg] = prog[i];
                soProg++;
            }
        }

        System.out.println(soProg);
        if (soProg != 0) {
            System.out.println("a Lista de alunos que estão cursando  Introdução  Programação e não estao em Matematica Discreta é: ");
            for (int i = 0; i < soProg; i++) {
                System.out.println((i + 1) + " aluno " + alunosApenasProg[i]);
            }
        }
    }
}
