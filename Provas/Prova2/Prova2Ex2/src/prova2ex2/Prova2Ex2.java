/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova2ex2;

import java.util.Scanner;

public class Prova2Ex2 {
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {        
        
        consultarMenu();
    }

public static void consultarMenu (){
    int estoque = 500;
    char menu = 0;
     while(menu != 'S'){ 
         
         System.out.println("""
                       Esse é o menu do posto de gasolina, digite a letra em maiusculo  para selecionar a opção que deseja:
                       C -  Consultar estoque de combustivel do posto.
                       A - abastecer veiculo.
                       R - Reabastecer tanque de combustivel do posto
                       S - sair
                       """);
             menu = input.nextLine().charAt(0);
            
         if(menu =='C') System.out.println("o posto possue um estoque de combustivel de "+estoque+" Litros de gasolina, voltando ao menu !!! \n ");   //sempre vou colocar um /n para quebrar duas linhas e fica separado
     
          else if(menu == 'A') estoque = abastecerCarro(estoque); 
     
          else if(menu == 'R') estoque = reabastecerTanque(estoque);
     
          else if(menu =='S') System.out.println("Obrigado por escolher nosso posto de gasoline!!! tenha um otimo dia ");
          
          else System.out.println("ops, parece que voce digitou a letra errada, tente novamente(dica: so aceitamos letras maiusculas), voltando ao menu !!! \n");
     }
         
         
}

public static int abastecerCarro(int estoque){
    int decrecimo;
    System.out.println("digite quantos Litros voce deseja abastecer em seu carro: ");
       decrecimo = Integer.parseInt(input.nextLine());
       if(decrecimo > estoque){
           System.out.print("Combustivel insuficiente, voltando ao menu !!! \n  ");
           return estoque;
       }
       else if(decrecimo <= 0){
           System.out.println("o valor digitado precisa ser maior que zero, voltando ao menu !!! \n  ");
           return estoque;
       }
       else{
            estoque = estoque - decrecimo;
            System.out.println("parabens voce abasteceu "+decrecimo+" Litros, e o posto ainda possue "+estoque+" Litros, voltando ao menu !!! \n  ");
            return estoque;
       }
}

public static int reabastecerTanque(int estoque){
     int acrecimo;
     System.out.println("digite quantos litros voce quer Reabastecer ao tanque do posto: ");
        acrecimo = Integer.parseInt(input.nextLine());
        
     if(acrecimo <= 0){
         System.out.println("o valor precisa ser maior que zero, voltando ao menu !!! \n ");
         return estoque;
     }
     else{
         estoque = estoque + acrecimo;
         System.out.println("parabens voce adicionou "+acrecimo+" Litros ao tanque do posto, a quantidade atual do tanque é "+estoque+" Litros, voltando ao menu !!! \n ");
         return estoque;
     }
}
}
