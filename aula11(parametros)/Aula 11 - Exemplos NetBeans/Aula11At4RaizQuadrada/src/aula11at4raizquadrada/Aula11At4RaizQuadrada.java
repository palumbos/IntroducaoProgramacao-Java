package aula11at4raizquadrada;

import java.util.Scanner;

public class Aula11At4RaizQuadrada {

    public static void calculeRaiz(float numero){
        float raiz;
        
        if (numero >= 0){
            raiz = (float) Math.sqrt(numero);
            System.out.println("Raiz de " + numero + ": " + raiz);
        }
        else {
            System.out.println("Imaginário");
        }
    }
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numero;
        
        System.out.print("Digite um número inteiro: ");
        numero = Float.parseFloat(input.nextLine());

        calculeRaiz(numero);
    }
    
}