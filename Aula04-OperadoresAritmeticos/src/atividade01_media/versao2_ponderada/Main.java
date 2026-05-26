/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01_media.versao2_ponderada;

import java.util.Scanner;

/**
 *
 * @author I5
 */
public class Main {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int n1, n2, n3, m1, m2, m3;
         float media;
         
         
            System.out.print("coloque sua primeira nota: ");
        n1 = Integer.parseInt(input.nextLine());
        
          System.out.print("coloque o peso da sua primeira nota: ");
        m1 = Integer.parseInt(input.nextLine());
        
        System.out.print("coloque sua segunda nota: ");
        n2 = Integer.parseInt(input.nextLine());
        
          System.out.print("coloque o peso da sua segunda nota: ");
        m2 = Integer.parseInt(input.nextLine());
        
        System.out.print("coloque sua terceira nota: ");
        n3 = Integer.parseInt(input.nextLine());
        
          System.out.print("coloque o peso da sua terceira nota: ");
        m3 = Integer.parseInt(input.nextLine());
   
        media = (float) (n1 * m1 + n2 * m2 + n3 * m3 )/(m1+m2+m3);
        
        System.out.println("sua media e " + media);
       
    }
    
}
