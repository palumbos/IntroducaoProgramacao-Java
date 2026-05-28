
package atividade04_quadradosoma;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int n1,n2, soma, quadradoSoma;

                
         System.out.print("coloque seu primeiro numero: ");
                 n1 = Integer.parseInt(input.nextLine());

         System.out.print("coloque seu segundo numero: ");
                 n2 = Integer.parseInt(input.nextLine());
                 
         soma = n1 + n2;
         quadradoSoma = soma*soma;
         
         System.out.print("o quadrado da soma de "+n1+" + "+n2+" é " +quadradoSoma);
    
    }
    
}
