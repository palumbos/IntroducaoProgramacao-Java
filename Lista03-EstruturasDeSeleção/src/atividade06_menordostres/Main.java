
package atividade06_menordostres;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
         int n1, n2, n3;
                  
        System.out.println("coloque seu primeiro numero: "); 
         n1=  Integer.parseInt(input.nextLine());
         
         System.out.println("coloque seu segundo numero: "); 
         n2=  Integer.parseInt(input.nextLine());
         
         System.out.println("coloque seu terceiro numero: "); 
         n3=  Integer.parseInt(input.nextLine());
         
         
         if(n1>n2 && n1>n3){
             if(n2 > n3)  System.out.println("seus numeros em ordem crescente: \n"+n3+"\n"+n2+"\n"+n1);
             
             else if(n2 < n3) System.out.println("seus numeros em ordem crescente: \n"+n2+"\n"+n3+"\n"+n1);
             
             else System.out.println("seu maior numero é: "+n1+" e os outros dois são iguais a: "+n2);
         }
         
         else if(n2 > n3){
             if(n1 > n3)  System.out.println("seus numeros em ordem crescente: \n"+n3+"\n"+n1+"\n"+n2);
             
             else if(n1 < n3) System.out.println("seus numeros em ordem crescente: \n"+n1+"\n"+n3+"\n"+n2);
             
             else System.out.println("seu maior numero é: "+n2+" e os outros dois são iguais a: "+n1);
         }
          
         else if(n3!=n1 && n3!=n2){
             if(n1 > n2)  System.out.println("seus numeros em ordem crescente: \n"+n2+"\n"+n1+"\n"+n3);
             
             else if(n1 < n2) System.out.println("seus numeros em ordem crescente: \n"+n1+"\n"+n2+"\n"+n3);
             
             else System.out.println("seu maior numero é: "+n3+" e os outros dois são iguais a: "+n2);
         }
         
         else System.out.println("todos os numeros sao iguais a: "+n1);
             
          
    }
    
}
