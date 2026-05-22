
package iguaisoudiferentes;

import java.util.Scanner;

public class IguaisOuDiferentes {

   
    public static void main(String[] args) {
        
                                                       Scanner input = new Scanner(System.in);
int n1,n2;
        System.out.println("porfavor coloque dois numeros iguais");            
        System.out.println("digite seu primeiro numero: ");
       n1 = Integer.parseInt(input.nextLine());
       
       System.out.println("digite seu segundo numero: ");
       n2 = Integer.parseInt(input.nextLine());
       
       
       
       if (n1 == n2){System.out.println("eles são iguais, parabens");}
       
       else if (n1 == (n2 *- 1)){System.out.println("eles sao opostos parça");}

       else if ((n1%3 == 0) && (n2%3 == 0)){System.out.println("os dois são multiplos de 3");}
       
       else if ((n1%5 == 0) && (n2%5 == 0)){System.out.println("os dois são multiplos de 5");}
       
       else if ((n1%7 == 0) && (n2%7 == 0)){System.out.println("os dois são multiplos de 7");}
       
       else if ((n1%2 == 0) && (n2%2 == 0)){System.out.println("os dois são  par");}
       
       else if ((n1%2 == 1) && (n2%2 == 1)){System.out.println("os dois sao impar");}

       else {System.out.println("porra, tu e um jegue, sao diferentes essa porra");}
    }
    
}
  
    