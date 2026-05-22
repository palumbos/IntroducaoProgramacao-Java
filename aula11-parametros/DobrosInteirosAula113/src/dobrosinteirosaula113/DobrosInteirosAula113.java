/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dobrosinteirosaula113;

import java.util.Scanner;

public class DobrosInteirosAula113 {

    public static void main(String[] args) {
        int n1, n2, n3, d1, d2, d3;
// === input ===        
     n1 = leiaNumero(); 
     n2 = leiaNumero();
     n3 = leiaNumero();
     
// === dobrar ===    
     d1 = dobreNumero(n1);
     d2 = dobreNumero(n2);
     d3 = dobreNumero(n3);
     
// === output ===
System.out.println(d1);
System.out.println(d2);
System.out.println(d3);

    }
    
    public static int leiaNumero(){
                       Scanner input = new Scanner(System.in);
        System.out.print("insira 1 numero: ");
        int numero = Integer.parseInt(input.nextLine());
        return numero;
    }
    
   public static int dobreNumero(int numero){ return numero *2;}
}
