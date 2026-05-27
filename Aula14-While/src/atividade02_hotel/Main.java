
package atividade02_hotel;

import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);    
    public static void main(String[] args) {
        String nome;
        int dias, cliente = 0;
        float total = 0, diaria = 0;
        
        System.out.print("digite quantos dias o cliente esteve no hotel: ");
                dias = Integer.parseInt(input.nextLine());
        while(dias!=0){
            System.out.print("digite o nome do  cliente: ");
                nome = input.nextLine();
                
            float conta = cauculeConta(diaria, dias);
            total = total + conta;
            cliente ++;
            
            System.out.println("nome: "+nome);
            System.out.println("preço pago: "+conta);
            System.out.print("digite quantos dias o proximo cliente cliente esteve no hotel: ");
                dias = Integer.parseInt(input.nextLine());
        }        
        System.out.println(" o preço arrecadado pelo hotel devido aos "+cliente+" clientes é "+total);
    }
    public static float cauculeConta(float diaria, int dias){
         if(dias < 10)diaria = dias * 45;
         else if(dias <= 10 && dias >= 15)diaria = dias * 25.50f;
         else diaria = dias * 10;
         return 150 + diaria;
    }
    
}
