
package atividade08_distanciaraio;

import java.util.Scanner;


public class Main {
      public static void main(String[] args) {
                         Scanner input = new Scanner(System.in);
float tempo,  distancia;
boolean perigo;

System.out.print("insira a diferança do tempo entre voce ver o "
        + "raio e escutar o trovao(sem segundos): ");
         tempo = Float.parseFloat(input.nextLine());
         
distancia = tempo * 340;
perigo = distancia < 200;

System.out.println("o raio esta a "+ distancia +
        " metros de voce, sua situação de perigo é: "+ perigo);
        
        
        
    }
    
}
