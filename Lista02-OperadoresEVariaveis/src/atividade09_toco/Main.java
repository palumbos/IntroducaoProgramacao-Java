
package atividade09_toco;

import java.util.Scanner;


public class Main {
   

public static void main(String[] args) {
                                         Scanner input = new Scanner(System.in);
float compra, pago, troco, decimal;
int moeda10, moeda01, nota100, nota10, nota1, trocoReais, trocoCentavos;
// as moedas  são casas decimais das notas

                                         
 System.out.print("insira quanto custou o produto:");
         compra = Float.parseFloat(input.nextLine());
         
System.out.print("insira quanto voce pagou (nao desconte o troco):");
         pago = Float.parseFloat(input.nextLine());
         
troco = pago - compra; //conta com os valores em float

if(pago >= compra){
trocoReais = (int) troco; // assim eu ignoro a parte decimal
decimal = (troco*100) % 100; // trago as duas primeiras casas decimais pro numero inteiro
trocoCentavos =(int) decimal; // isso ignora as demais casas pos virgula

//o resto serve pra separa em suas respectivas cédulas
moeda01 = trocoCentavos % 10; 
moeda10 = (trocoCentavos - moeda01)/10;
nota1 = trocoReais % 10;
nota10 =  ((trocoReais % 100) - nota1)/10;
nota100 = (trocoReais - nota1 - (nota10 * 10))/100;

// agora print e reza      
System.out.println("seu troco sera de: " + troco + " entao voce recebera \n" + nota100 
        + " notas de 100 \n " +nota10 +" notas de 10 \n" + nota1 + " notas de 1 \n" + moeda10 
        +" moedas de 10 centavos \n" + moeda01+ " moedas de 1 centavo");}


else{System.out.println("voce nao pagou dinheiro suficiente");}

         
         
    }
}
    

    

