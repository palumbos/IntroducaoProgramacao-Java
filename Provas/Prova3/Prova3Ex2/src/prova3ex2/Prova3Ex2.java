package prova3ex2;

import java.util.Scanner;

public class Prova3Ex2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int quantAlunos;

        System.out.print("Digite quantos alunos estão matriculados: ");
        quantAlunos = Integer.parseInt(input.nextLine());
        int[][] notas = new int[quantAlunos][5];
        String[] alunos = lerNotas(quantAlunos, notas);
        float[] mediaIndiv = caucularMedia(notas);
        float[] mediaTotal = caucularTotal(notas);

        printarResultado(alunos, mediaIndiv, mediaTotal);

    }

    public static String[] lerNotas(int n, int[][] notas) {
        String[] aluno = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("digite o nome do " + (i + 1) + " aluno: ");
            aluno[i] = input.nextLine();
            for (int j = 0; j < 5; j++) {
                System.out.print("digite a nota da avaliação " + (j + 1) + " desse aluno: ");
                notas[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        return aluno;
    }

    public static float[] caucularMedia(int[][] notas) {
        float[] mediaInd = new float[notas.length];
        float media;
        for (int i = 0; i < notas.length; i++) {
            media = 0;
            for (int j = 0; j < 5; j++) {
                media = media + notas[i][j];
                
            }
            media = media / 5f;
            mediaInd[i] = media;
        }
        return mediaInd;
    }

    public static float[] caucularTotal(int[][] notas) {
        float[] mediaTotal = new float[5];
        float media;
        for (int i = 0; i < 5; i++) {
            media = 0;
            for (int j = 0; j < notas.length; j++) {
                media = media + notas[j][i];
            }
            media = (float) media / notas.length;
            mediaTotal[i] = media;
        }
        return mediaTotal;
    }

    public static void printarResultado(String[] alunos, float[] mediaIndiv, float[] mediaTotal) {
        int aprovados = 0;
        float percentual, maior = mediaIndiv[0];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\n\n\nO aluno " + alunos[i] + " teve a media final de: " + mediaIndiv[i]);
            if (mediaIndiv[i] >= 6) {
                System.out.println("Pela media ser maior ou igual a 6, o aluno foi APROVADO!!!");
            } else if (mediaIndiv[i] >= 3) {
                System.out.println("Pela media dele ser maior ou igual a 3 e menor que 6, o aluno esta em RECUPERAÇÃO!!!");
            } else {
                System.out.println("pela nota do aluno ser menor que 3, o Aluno foi REPROVADO!!!");
            }
            if (mediaIndiv[i] >= 6) {
                aprovados++;
            }
        }
        percentual = aprovados * 100f / alunos.length; //transformei em int para aparecer o percentual so com a parte inteira
        System.out.println("\n a quantidade de alunos aprovados foi de " + aprovados + " e o percentual de aprovação foi " + percentual);
        
        for ( int i = 0; i < 5; i++){
            System.out.println("a media final da avaliação "+(i+1)+" foi: "+mediaTotal[i]);
        }
        
        for (int i = 0; i < alunos.length; i++) {
            if(maior < mediaIndiv[i]){
            maior = mediaIndiv[i];
            }
            
        }
        System.out.println(" a maior nota foi "+ maior);
        
    }
    
}
