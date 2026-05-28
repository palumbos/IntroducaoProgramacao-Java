
package atividade05_perimetro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);

         int base, altura, area, perimetro;

                
         System.out.print("coloque a altura do seu retangulo: ");
                 base = Integer.parseInt(input.nextLine());

         System.out.print("coloque a base do seu retangulo: ");
                 altura = Integer.parseInt(input.nextLine());
                 
         area = base * altura;
         perimetro = (base * 2) + (altura * 2);
         
         System.out.println("a area é "+area +" e o perimetro é "+perimetro);
        
        
        
    }
    
}
