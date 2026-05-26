
package atividade01_escolhaopcao;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
                                                         Scanner input = new Scanner(System.in);

   char alternativa;
    
    
        System.out.println("a - cadastrar cliente");
        System.out.println("b - editar cliente");
        System.out.println("c - cadastrar produto");
        System.out.println("d - editar produto");
        System.out.println("e - efetuar venda");
        System.out.println("f - sair");
        System.out.println("digite a letra da opcao desejada");
        alternativa = input.nextLine().charAt(0);
        
        switch(alternativa){
            
            case 'a': System.out.println("voce realmenter quer cadastrar o cliente"); break;
            
            case 'b': System.out.println("voce quer editar o cliente"); break;
            
            case 'c': System.out.println("cadastrar o produto"); break;
            
            case 'd': System.out.println("voce quer editar o produto"); break;
            
            case 'e': System.out.println("voce quer efetuar a venda"); break;
            
            case 'f': System.out.println("voce quer sair"); break;
            
            default: System.out.println("tu errou feio");
            
            
        
        }
    input.close();
    }}
        
    

