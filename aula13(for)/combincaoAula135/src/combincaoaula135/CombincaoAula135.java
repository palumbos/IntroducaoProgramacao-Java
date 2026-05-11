/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combincaoaula135;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class CombincaoAula135 {

    /**
     * @param args the command line arguments
     */
public static Scanner input = new Scanner(System.in);

 
    public static void main(String[] args) {
        int n, p, combinacao;
        boolean  continuar = true;
        
        while(continuar){
           System.out.print("digite quantos elementos possue o conjunto: ");
                  n = Integer.parseInt(input.nextLine());
         
           System.out.print("digite quantos elementos serao agrupados por combinacao: ");
                   p = Integer.parseInt(input.nextLine());
         
            combinacao = (caucularFatorial(n)/(caucularFatorial((n - p)) * caucularFatorial(p)));
           
            System.out.println(combinacao);          
            
            System.out.print("digite se deseja continuar(s para continuar e n para nao continuar):  ");
                  char comando = input.nextLine().charAt(0);
                  
                  continuar = !(comando == 'n' || comando == 'N');
        }
    } 
    
public static Integer   caucularFatorial(int n){
       int resultado =1;
       
       for(int i = 1; i<(n+1); i++){
            resultado = resultado * i;
        }
       return resultado;
   } 
}