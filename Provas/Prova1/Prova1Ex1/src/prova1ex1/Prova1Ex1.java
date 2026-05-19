
package prova1ex1;

import java.util.Scanner;

public class Prova1Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String nome;       
         int totalTiros, acertoTiros;
         float percentual;
         
         System.out.print("digite seu nome: ");
         nome = input.nextLine();
         
         System.out.print("digite a quantidade de tiros realizados: ");
          totalTiros = Integer.parseInt(input.nextLine());
          
          System.out.print("digite a quantidade de tiros acertados: ");
         acertoTiros = Integer.parseInt(input.nextLine());
         
         percentual = (float) 100 * acertoTiros/totalTiros ;
         
         System.out.println("Parabens, senhor "+ nome+" a sua porcentagem de acertos foi de "+percentual+"%");
        
    }
    
}
