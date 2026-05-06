
package idademédia;

import java.util.Scanner;

public class IdadeMédia {
public static Scanner input = new Scanner(System.in);

   
    public static void main(String[] args) {
        float media=0;
        int soma=0;
        System.out.print("insira quantos alunos tem na turma: ");
        int x = Integer.parseInt(input.nextLine());
        
        for(int i=0; i<x;i++ ){ 
            System.out.print("digite a idade de um aluno:");
            int novoValor = Integer.parseInt(input.nextLine());
            soma = soma + novoValor;
            }
        media = (float) soma/x;
        System.out.println(media);    
        
    }
    
}
