
package idadeentre0e100;

import java.util.Scanner;

public class Idadeentre0e100 {
public static Scanner input = new Scanner(System.in);
    

    public static void main(String[] args) {
        int idade;
        System.out.print("digite seu nome: ");
           String nome = input.nextLine();
        System.out.print("digite sua idade: ");
                idade = input.nextInt();   
           
        while(idade > 100 || idade < 0 ){
            System.out.println("idade invalida!!! tente novamente");
            System.out.print("digite sua idade: ");
                idade = input.nextInt();
        }
        System.out.println("senhor(a) "+nome+" sua idade é "+idade);    
       
    }
}
