
package baskara_aula101;

import java.util.Scanner;

public class Baskara_aula101 {

    public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);
         float a, b, c, x1, x2, delta;               
         
         System.out.print("coloque coeficiente a:");
          a = input.nextFloat();
        
         System.out.print("coloque coeficiente a:");
          b = input.nextFloat();
         
         System.out.print("coloque coeficiente a:");
          c = input.nextFloat();
         
          delta =(float) Math.pow(b, 2) - 4 * a * c;
          x1 =(float) (-b + Math.sqrt(delta))/2*a;
          x2 = (float)(-b - Math.sqrt(delta))/2*a;
         
         System.out.println(x1);
         System.out.println(x2);
         
    }
    
}
