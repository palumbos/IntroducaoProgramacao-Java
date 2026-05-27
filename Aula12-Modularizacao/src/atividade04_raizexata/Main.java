
package atividade04_raizexata;

import java.util.Scanner;


public class Main {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        float numero;
        String inteiro;
        System.out.println("coloque um numero");
        numero = Float.parseFloat(input.nextLine());
        
        inteiro = raizInteiro(numero);
        
        System.out.println(inteiro);
             
    }
    
   public static String raizInteiro(float numero){
     float raiz;
     raiz = (float) Math.sqrt(numero);

     if(raiz == Math.round(raiz)) return "a raiz é inteira";
     else return "a raiz nao é inteira";  
   }
    
}
