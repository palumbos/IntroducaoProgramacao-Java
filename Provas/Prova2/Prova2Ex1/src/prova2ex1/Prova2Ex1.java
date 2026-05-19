
package prova2ex1;

import java.util.Scanner;

public class Prova2Ex1 {
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        boolean primo;
        
        numero = lerNumero();

        primo = verificarPrimo(numero);

        mostrarResultado(numero, primo);        
    }
    
    public static int lerNumero(){
        
        System.out.print("Digite um numero inteiro que você quer verificar se é primo: ");
                  int numero = Integer.parseInt(input.nextLine());
                  
         while(numero < 0){
             System.out.print("o numero não pode ser negativo, tente novamente:  ");
                  numero =  Integer.parseInt(input.nextLine());          
         }         
         
        return numero;           
   }
    
    public static boolean verificarPrimo(int n){
        int i = 2;
        
        while(i < n){
           if(  i != n && (n % i == 0)  ) return false;
           i++;
           }
         if(n == 1 || n == 0) return false; // o numero 1 normalmente não é considera primo, e o zero não é primo
        return true;
    }

   public static void mostrarResultado(int n, boolean primo){
         if(primo) System.out.println("o numero "+n+" é um numero primo.");
      
         else System.out.println("o numero "+n+" não é um numero primo.");
         
   }
    }

