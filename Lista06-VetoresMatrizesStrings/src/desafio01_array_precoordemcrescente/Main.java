
package desafio01_array_precoordemcrescente;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int produtos;
        
        System.out.println("digite quantos produtos tem em sua loja: ");
        produtos = input.nextInt();
        
        float[] preco = new float[produtos];
        float[] crescente = new float[produtos];
        
        for(int i = 0; i < 0; i ++){
            System.out.println("digite o preço do produto"+(i+1));
            preco[i] = input.nextFloat();  
        }
        
        for(int i = 0; i < 0; i ++){
            
        }
    }
}
