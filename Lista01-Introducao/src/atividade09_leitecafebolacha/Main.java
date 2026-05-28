
package atividade09_leitecafebolacha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
        int qCafe, qLeite,qBolacha;
        float vCafe, vLeite, vBolacha, gCafe, gLeite, gBolacha, total;
        
        System.out.print("quantos cafe voce comprou: ");
         qCafe= Integer.parseInt(input.nextLine());
        
        System.out.print("qual era o valor do cafe: ");
         vCafe= Float.parseFloat(input.nextLine());
         
         System.out.print("quantos leite voce comprou: ");
         qLeite= Integer.parseInt(input.nextLine());
        
        System.out.print("preco do leite: ");
         vLeite = Float.parseFloat(input.nextLine());
         
         System.out.print("quantas bolacha: ");
         qBolacha= Integer.parseInt(input.nextLine());
        
        System.out.print("preco bolacha: ");
         vBolacha= Float.parseFloat(input.nextLine());
         
         
         gCafe = qCafe * vCafe;
         gLeite = qLeite * vLeite;
         gBolacha = qBolacha * vBolacha;
         total = gCafe + gLeite + gBolacha;
         
         

        System.out.println(gCafe);
        System.out.println(gLeite);
        System.out.println(gBolacha);
        System.out.println(total);
        
    }
    
}
