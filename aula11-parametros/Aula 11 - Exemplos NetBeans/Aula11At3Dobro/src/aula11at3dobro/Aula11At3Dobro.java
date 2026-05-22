package aula11at3dobro;

import java.util.Scanner;


public class Aula11At3Dobro {

    public static int leiaNumero(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        return Integer.parseInt(input.nextLine());
    }
  
    public static int calculeDobro(int n){
        return 2 * n;
    }
  
    public static void main(String[] args) {
        int num1, num2, num3, dobro1, dobro2, dobro3;
        
        num1 = leiaNumero();
        num2 = leiaNumero();
        num3 = leiaNumero();
        dobro1 = calculeDobro(num1);
        dobro2 = calculeDobro(num2);
        dobro3 = calculeDobro(num3);
        System.out.println("Dobro de " + num1 + ": " + dobro1);
        System.out.println("Dobro de " + num2 + ": " + dobro2);
        System.out.println("Dobro de " + num3 + ": " + dobro3);              
    }
    
}
