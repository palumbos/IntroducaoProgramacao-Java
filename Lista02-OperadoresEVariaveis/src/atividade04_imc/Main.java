
package atividade04_imc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
         float peso, altura, imc;
         boolean acimaDoPeso;
               
System.out.print("quanto voce pesa: ");
        peso = Float.parseFloat(input.nextLine());
        
System.out.print("qual é sua altura: ");
        altura = Float.parseFloat(input.nextLine());
        
        
imc = (float) peso/(altura * altura);
acimaDoPeso = imc > 25f;

System.out.println("seu imc é: "+imc+"\n voce esta acima do peso:"+ acimaDoPeso);


        
    }
    
}
