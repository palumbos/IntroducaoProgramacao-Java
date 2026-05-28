
package atividade05_aprovacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
int p1, p2, trabalho, frequencia;
boolean aprovado;

System.out.print("ensira sua nota 1: ");
        p1 = Integer.parseInt(input.nextLine());
        
System.out.print("ensira sua nota 2: ");
        p2 = Integer.parseInt(input.nextLine());
        
System.out.print("ensira sua nota de prova: ");
        trabalho = Integer.parseInt(input.nextLine());
        
System.out.print("coloque sua frequencia( 0 a 100): ");
        frequencia = Integer.parseInt(input.nextLine());
        
aprovado = ((trabalho >= 7) && (p1>=6 || p2 >=6) && (frequencia == 75)) ||
        ((frequencia >= 90) && (trabalho >= 6) && (p1>=6 || p2 >=6));


System.out.println(aprovado);
        

    }
    
}
