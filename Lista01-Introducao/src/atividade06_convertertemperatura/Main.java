
package atividade06_convertertemperatura;

import java.util.Scanner;


public class Main {
     public static void main(String[] args) {
                         Scanner input = new Scanner(System.in);
                         
         float c,f, k;
                         
                  System.out.println("coloque a temperatura em celsius");
                           c = Float.parseFloat(input.nextLine());
                           
                           
         f = ((9/5f)*c) + 32;
         k= c + 273.15f;
         
         System.out.println("a temperatura em kelvin é "+k+ " e em Fahrenheit "+ f);
 
    }
    
}
