
package atividade04_diagonalprincipal;

import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
       int[][] matriz = new int [5][5];
       
       Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        
            }
        System.out.println("\n");
        
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
          }
                
        }
    }

