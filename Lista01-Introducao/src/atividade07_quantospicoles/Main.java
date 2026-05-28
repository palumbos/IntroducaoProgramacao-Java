
package atividade07_quantospicoles;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
                int p1,p2,p3;
                float v1,v2,v3,vTotal;
                
         System.out.print("Insira a quantidade de picole do tipo 1 que voce quer comprar: ");
        p1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Insira a quantidade de picole do tipo 2 que voce quer comprar: ");
        p2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Insira a quantidade de picole do tipo 3 que voce quer comprar: ");
        p3 = Integer.parseInt(input.nextLine());
        
        v1 =   p1 *1.5f;
        v2 = p2 * 2f;
        v3 = p3 * 0.75f;
        vTotal = v1 + v2 + v3;
        
        System.out.println("o valor dos picoles de tipo 1 foi " +v1+ " R$");
        System.out.println("o valor dos picoles de tipo 2 foi " +v2+ " R$");
        System.out.println("o valor dos picoles de tipo 3 foi " +v3+ " R$");
        System.out.println("o valor total dos picoles foi " +vTotal+ " R$");

    }
    
}
