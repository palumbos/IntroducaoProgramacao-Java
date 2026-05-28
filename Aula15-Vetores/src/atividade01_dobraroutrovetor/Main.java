
package atividade01_dobraroutrovetor;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
int [] A = new int[4];
int[] B = new int [4];

for (int i = 0; i < 10; i++){
    System.out.print("digite um numero: ");
    A[i] = Integer.parseInt(input.nextLine());
}

for (int i = 0; i < 10; i++){
    System.out.println("A="+A[i]);
}

for (int i = 0; i < 10; i++){
B[i] = A[i]*2;
System.out.println("B="+B[i]);
}

   
    
    
}
}
