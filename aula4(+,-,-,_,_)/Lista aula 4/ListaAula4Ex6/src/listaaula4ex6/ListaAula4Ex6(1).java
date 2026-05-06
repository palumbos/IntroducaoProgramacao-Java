/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaaula4ex6;

import java.util.Scanner;


public class ListaAula4Ex6 {

    
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
