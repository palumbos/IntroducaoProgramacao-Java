
package atividade21_produtividade;

import java.util.Scanner;


public class Main {
        static Scanner input = new Scanner(System.in);

     public static void main(String[] args) {
        int matricula;
        float salario, abon, salarioTotal;
        char nivel;
        
        System.out.print("digite sua matricula: ");
                   matricula = Integer.parseInt(input.nextLine());
           
         System.out.print("digite seu salário(sem acrescimo): ");
                  salario = Integer.parseInt(input.nextLine());
            
         System.out.print("""
                            digite seu nivel de produtividade:
                            e - Excelente
                            b - Bom
                            r - Regular
                            digite aqui: 
                            """);  
                   nivel = input.nextLine().charAt(0);
        
        
    }
    
}
