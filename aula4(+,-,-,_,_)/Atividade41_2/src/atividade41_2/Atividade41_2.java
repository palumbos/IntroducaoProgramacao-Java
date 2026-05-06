
package atividade41_2;

import java.util.Scanner;


public class Atividade41_2 {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int n1, n2, n3, m1, m2, m3;
         float media;
         
         
            System.out.print("coloque sua primeira nota: ");
        n1 = Integer.parseInt(input.nextLine());
        
          System.out.print("coloque o peso da sua primeira nota: ");
        m1 = Integer.parseInt(input.nextLine());
        
        System.out.print("coloque sua segunda nota: ");
        n2 = Integer.parseInt(input.nextLine());
        
          System.out.print("coloque o peso da sua segunda nota: ");
        m2 = Integer.parseInt(input.nextLine());
        
        System.out.print("coloque sua terceira nota: ");
        n3 = Integer.parseInt(input.nextLine());
        
          System.out.print("coloque o peso da sua terceira nota: ");
        m3 = Integer.parseInt(input.nextLine());
   
        media = (float) (n1 * m1 + n2 * m2 + n3 * m3 )/(m1+m2+m3);
        
        System.out.println("sua media e " + media);
       
    }
    
}
