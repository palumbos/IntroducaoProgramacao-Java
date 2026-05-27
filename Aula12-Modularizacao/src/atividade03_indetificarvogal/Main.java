
package atividade03_indetificarvogal;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    
public static void main(String[] args) {
    System.out.print("digite um caractere:");
    char caractere = input.nextLine().charAt(0);
    
    int tipoCaractere = analisarTipo(caractere);
    
    System.out.println(tipoCaractere);
    }



public static int analisarTipo(char letra){
    if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){ 
    return 1;}
    
    else return 0;
}
}
