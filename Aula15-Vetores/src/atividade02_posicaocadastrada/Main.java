
package atividade02_posicaocadastrada;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       int posicao=-1, n1, numero; 
       int[] conjuntoRandom = new int[10];
       
       boolean esta= false;
       
       for(int i = 0; i < 10; i++){
           do{
              n1 = (int)(Math.random()*100);
           }while(verificarExistencia(conjuntoRandom, n1, i));
            
           conjuntoRandom[i] = n1;
        }
        System.out.print("digite um numero para saber a posicao dele no vetor( de 0 a 99): ");
         numero = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < 10; i++){
            if(numero == conjuntoRandom[i]){
             esta = true; 
             posicao = i;
            break;
            }
        
        }
       if(esta){
           System.out.println("seu numero esta na posição " +posicao+" do vetor (de 0 a 99)");   
       } else{ System.out.println("seu numero nao esta no vetor");}
       input.close();
    }
 
    public static boolean verificarExistencia(int[] array, int n1, int  x){
               for(int i = 0; i < x; i++){
                   if(array[i] == n1 ){
                      return true; 
                   }
               }
    return false;
    }
}
