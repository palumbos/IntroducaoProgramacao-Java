
package distanciaraio_lista2ex8;

import java.util.Scanner;

public class DistanciaRaio_lista2Ex8 {

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
