
package atividade01_media.versao1_somaproduto;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
 Scanner input = new Scanner(System.in);
         int n1, n2, n3, soma, produto;
         float media;
         
         
          
         
         System.out.print("coloque seu primeiro numero: ");
        n1 = Integer.parseInt(input.nextLine());
        
        System.out.print("coloque seu primeiro numero: ");
        n2 = Integer.parseInt(input.nextLine());
        
        System.out.print("coloque seu primeiro numero: ");
        n3 = Integer.parseInt(input.nextLine());
        
        soma = n1 + n2 + n3;
        produto = n1 * n2 * n3;
        media= soma/3f;
        //o f serve para a divisão ser em float e aceitar numeros quebrados
        
        System.out.println("a soma dos valores é:" + soma + " e o produto é " + produto + " e a media é " + media );
         

        
    }
}
