
package atividade02_posicaocadastrada;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       int posicao=-1, n2, numero; 
       int[] conjuntoRandom = new int[10], comparador = new int[10];
       
       boolean esta= false;
       
       for(int i = 0; i < 10; i++){
           double n1 = Math.random() * 100;
            n2 =(int) n1;
            for(int x = 0; x<i; x++){
                while(conjuntoRandom[x] == n2){
                    n1 = Math.random()*100;
                    n2 = (int) n1;
                }
            }
           conjuntoRandom[i] = n2;
        }
        System.out.print("digite um numero para saber a posicao dele no vetor( de 0 a 99): ");
         numero = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < 10; i++){
            if(numero == conjuntoRandom[i]){
             esta = true; 
             posicao = i;
            
            }
        
        }
       if(esta){
           System.out.println("seu numero esta na posição " +posicao+" do vetor (de 0 a 9)");   
       } else{ System.out.println("seu numero nao esta no vetor");}
       input.close();
    }
    
}
