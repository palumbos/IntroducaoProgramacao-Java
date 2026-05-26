
package aula304_operadoresartmeticos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int numeroUsuario, menor10;            
             
             System.out.println("digite NUMERO: ");
             numeroUsuario = Integer.parseInt(input.nextLine());
             
             menor10 = numeroUsuario - 10;
             
             System.out.println("seu numero menos 10 é "+ menor10);
             
    }    
}
