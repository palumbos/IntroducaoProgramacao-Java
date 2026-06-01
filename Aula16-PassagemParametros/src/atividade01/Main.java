package atividade01;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorMedia = new int[10];
        int contadorMaior;
        float media;

        lerVetor(vetorMedia);

        media = caucularMedia(vetorMedia);

        contadorMaior = contarMaiores(vetorMedia, media);
        
        System.out.println(media);
        System.out.println(contadorMaior);
        

    }

    public static void lerVetor(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print("digite um valor do vetor: ");
            array[i] = Integer.parseInt(input.nextLine());
        }
    }
    
    public static float caucularMedia(int[] array){
        float soma = 0;
        for (int i = 0; i < array.length; i++) {
        soma = soma +  array[i];
        }
        return (float) soma/array.length;
    }
    
   public static int contarMaiores(int[] array, float media){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
        if(array[i] >= media){
          contador ++;
          System.out.println(array[i]);
        }}
        return contador;
   }
}
