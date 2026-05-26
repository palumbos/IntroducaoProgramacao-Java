package listaaulaex10;

import java.util.Scanner;

public class ListaAulaEx10 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, quociente, resto;
                System.out.print("coloque um numero inteiro: ");
                numero = Integer.parseInt(input.nextLine());
                
 quociente = numero/2;
 resto= numero%2;
 
 
 

                        System.out.println(quociente);
                System.out.println(resto);

        
    }
    
}
