/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaaula4ex3;

import java.util.Scanner;


public class ListaAula4Ex3 {

  
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
