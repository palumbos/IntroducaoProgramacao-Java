
package atividade44;

import java.util.Scanner;


public class Atividade44 {

    
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int unidade, dezena, centena, numero, invertido;
                
         System.out.print("coloque um numero de 3 digitos: ");
        numero = Integer.parseInt(input.nextLine());
        unidade = numero %10 ;
        dezena = (numero % 100) - unidade;
        centena = numero - (unidade + dezena);
        invertido = (centena/100) + dezena + (unidade * 100);
        
        System.out.println(invertido);


      
    }
    
}
