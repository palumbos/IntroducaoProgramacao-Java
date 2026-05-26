
package atividade01_planodesaude;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        String nome;
        int idade, pagar;
        
        System.out.print("digite seu nome: ");
            nome = input.nextLine();
            
        System.out.println("digite sua idade: ");
                idade = Integer.parseInt(input.nextLine());
                
         while(idade <0 || idade>150){
             
                  System.out.println("idade invalida, tente novamente: ");
                           idade = Integer.parseInt(input.nextLine()); 
         
             
                  }
          
                                   
        if(idade <=10) pagar = 80;
        
        else if(idade <= 30) pagar = 120;
        
        else if(idade <=45) pagar = 210;
        
        else if(idade <= 60) pagar = 350;
        
        else  pagar = 450;
        
        System.out.println("caro "+nome+" devido voce ter "+
                idade+" anos de idade, voce precisara pagar "+pagar+" R$.");
        
         } 
    
}
