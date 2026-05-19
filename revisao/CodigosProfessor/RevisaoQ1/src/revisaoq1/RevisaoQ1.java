package revisaoq1;

import java.util.Scanner;

public class RevisaoQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int qtdVendida;
        float preco, precoDesconto, total;
        
        System.out.print("Digite o nome do produto: ");
        nome = input.nextLine();
        System.out.print("Digite a quantidade vendida: ");
        qtdVendida = Integer.parseInt(input.nextLine());
        System.out.print("Digite o preco: ");
        preco = Float.parseFloat(input.nextLine());
        precoDesconto = preco - preco*8/100;
        total = precoDesconto * qtdVendida;
        System.out.println("Preco com desconto: "+precoDesconto);
        System.out.println("Total a pagar: "+total);
    }
    
}
