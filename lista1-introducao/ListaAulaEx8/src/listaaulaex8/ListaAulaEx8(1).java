
package listaaulaex8;

import java.util.Scanner;


public class ListaAulaEx8 {

    public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
         int quantVendas;
         float salMin, valVendas, sal;
                 
                 
System.out.print("Bem vindo ao seu contador de salario!!!");

System.out.print("coloque quantos carros voce vende esse mes: ");
         quantVendas= Integer.parseInt(input.nextLine());
        
        System.out.print("Qual é o salario minimo vigente: ");
         salMin= Float.parseFloat(input.nextLine());
        
        System.out.print("Qual foi o valor total de suas vendas esse mes: ");
        valVendas = Float.parseFloat(input.nextLine());
        
sal = 2*salMin + 150*quantVendas + valVendas * (5/100f);

        System.out.print("seu salario esse mes foi "+ sal);

        
    }
    
}
