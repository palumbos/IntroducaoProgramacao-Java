package teste01.arrayrandon;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n4;
        int n2, n3;
        long soma=0;
        
        
        do {
            n1 = Math.random() * 100000;
            n2 = (int) n1;
        } while (n2 != 99999);
        int[] A = new int[n2];

        for (int i = 0; i < n2; i++) {

            do {
                n4 = Math.random() * 10000;
                n3 = (int) n4;
            } while (n3 != 9999);
            A[i] = n3;
            soma = soma + n3;
        }
        System.out.println(soma);
    }
/*
algo interessante se se observar é que mesmo que o programa  pode computar em menos de 1 segundo,
 normalmente ele converge em 25 segundos (a lei dos grandes numeros) mesmo podendo durar 50 segundos
ou até indefinidamente (teoricamente por causa do random) porem essa probabilidade tende a 0    
    */ 
}
