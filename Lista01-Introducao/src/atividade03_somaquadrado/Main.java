
package atividade03_somaquadrado;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int n1,n2, soma;

                
         System.out.print("coloque seu primeiro numero: ");
                 n1 = Integer.parseInt(input.nextLine());

         System.out.print("coloque seu segundo numero: ");
                 n2 = Integer.parseInt(input.nextLine());
                 
         soma = (n1*n1) + (n2*n2);
         
         System.out.print("o quadrado de "+n1+" mais o quadrado de "+n2+" é " +soma);

    }
    
}
