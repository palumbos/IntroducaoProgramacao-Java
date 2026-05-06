
package aeronautica_desafio_lista2ex10;

import java.util.Scanner;

public class Aeronautica_desafio_lista2Ex10 {

    public static void main(String[] args) {
                                                 Scanner input = new Scanner(System.in);
                                             
// --- deninição de variaveis ---                                                 
float tamanhoPista, peso, visibilidade;
int passageiro, chuva;
boolean sistemaDecolagem, decola;

// --- lugar onde o usuario coloca as informação ---
        System.out.print("insira o tamanho da pista (em kilometros):");
                 tamanhoPista = Float.parseFloat(input.nextLine());
                 
         System.out.print("insira o peso do aviao (em toneladas):");
                 peso = Float.parseFloat(input.nextLine());
                 
         System.out.print("insira a visibilidade a frente(em metros)");
                 visibilidade = Float.parseFloat(input.nextLine());
                 
         System.out.print("insira a quantidade de passageiros:");
                 passageiro = Integer.parseInt(input.nextLine());
                 
         System.out.print("insira quantos ml esta a chuva:");
                 chuva = Integer.parseInt(input.nextLine());
                 
         System.out.println("o aviao possue sistema de decolagem(true ou false):");
                  sistemaDecolagem = Boolean.parseBoolean(input.nextLine());
                  
        // ---  os cauculos fodas ---
        decola = ((((peso<40f)) || 
                (( tamanhoPista <=2f && tamanhoPista>=1.5f) && (peso<=60f))||
                (tamanhoPista >2f)) 
                &&   //acima é do tamanho e embaixo da chuva
//                ((visibilidade>20f) || (sistemaDecolagem))  && 
                (chuva==0) || (passageiro<100)) &&
                (chuva<5);

        System.out.println(decola);

    }
    
}
