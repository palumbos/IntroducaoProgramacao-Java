
package atividade05_escolhamedia;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
      float n1, n2, n3;
      int media = 0;
      char tipoMedia;
      
      n1 = leiaNota();
      n2 = leiaNota();
      n3 = leiaNota();
      tipoMedia = leiaMedia();
      
     media = cauculeMedia(n1,n2,n3, tipoMedia, media);
          
     printarMedia(tipoMedia, media);
      
    }
    
    public static float leiaNota(){
                  Scanner input = new Scanner(System.in);

        System.out.print("digite uma nota: ");
        return Float.parseFloat(input.nextLine());
    }
    
    public static char leiaMedia(){
                  Scanner input = new Scanner(System.in);
         
         System.out.print("digite o tipo de media que voce quer(A parar Artimética,"
                 + " P para Ponderada e G parar geometrica:");   
         char x = input.nextLine().charAt(0);
         char y = Character.toUpperCase(x); // pra caso o usuario digite minusculo
         return y;
    }
    
    public static Integer cauculeMedia(float nota1, float nota2, float nota3, char tipoMedia, int media){
         float soma;
        switch (tipoMedia) {
            case 'A':
                soma = nota1 + nota2 + nota3;
                media = (Math.round(soma)/3);
                break;
            case 'P':
                soma = (nota1 * 2) + (nota2 * 2) + nota3;
                media =  (Math.round(soma)/5);
                break;
            case 'G':
                soma = nota1 * nota2 * nota3;
                soma =  (float) Math.cbrt(soma);
                media = Math.round(soma);
                break;
            default:
                media = -1;
                break;
        }
        return media;
    }
    
    public static void printarMedia(char tipoMedia, int media){
        
        if(media == -1) System.out.println("media invalida");   
        else  System.out.println("sua media é "+media + " do tipo "+tipoMedia);    
    
    }
    
}
