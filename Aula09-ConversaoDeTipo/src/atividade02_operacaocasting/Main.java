
package atividade02_operacaocasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);

     int n1 = 0, n5;
     long n2 = Long.MAX_VALUE;
     float n3, n6;
     double n4 = Double.MAX_VALUE;
     String naN;
     
     System.out.println("digite um numero com virgula");
       n3 = input.nextFloat();
       
     n3 = (int) n1;
     n5 = (int) n2;
     n6 = (float ) n4;
     
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
     
     
    }
    
}
