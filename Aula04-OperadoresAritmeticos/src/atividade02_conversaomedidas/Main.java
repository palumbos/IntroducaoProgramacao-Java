
package atividade02_conversaomedidas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
    float pe, polegadas, jardas, milhas;
    
        System.out.println("coloque sua medida em pes");
        pe = Float.parseFloat(input.nextLine());
        
  polegadas = pe * 12f;
  jardas = pe/3f;
  milhas = jardas/1760f;
  
        System.out.println(pe +"pes e equivalente a " +jardas+" jardas " +milhas+" milhas e " + polegadas + " polegadas");
      
    } 
}
