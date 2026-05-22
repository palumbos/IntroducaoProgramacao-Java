package aula9ex2operacoescasting;

import java.util.Scanner;


public class Aula9Ex2OperacoesCasting {

  
    public static void main(String[] args) {
        int num1 = 13, num2 = 7, res8;
        float res1, res2, res3, res4, res5, res6;
        double res7;
        
        res1 = num1 / num2;
        res2 = (float) num1 / num2;
        
        System.out.println("Divisão do primeiro pelo segundo número sem type casting: "+res1);
        System.out.println("Divisão do primeiro pelo segundo número com type casting: "+res2);
        
        
        res3 = num1 / 2;
        res4 = (float) num1 / 2;
        res5 = num1 / 2f;

        
        System.out.println("Divisão do primeiro número por 2 sem type casting: "+res3);
        System.out.println("Divisão do primeiro número por 2 com type casting tradicional: "+res4);
        System.out.println("Divisão do primeiro número por 2 com type casting reduzido: "+res5);

        res6 =  (float) (num1 / 2.5);
        res7 =  num1 / 2.5;
        
        System.out.println("Divisão do primeiro número por 2.5 com type casting tradicional: "+res6);
        System.out.println("Divisão do primeiro número por 2.5 sem type casting, pois o resultado já double: "+res7);
    
        res8 = ((int) res5) % ((int) res7);
        System.out.println("Resta da divisão da conversão dos números reais em inteiros: "+res8);
    }
    
}
