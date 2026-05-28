package teste01_arrayrandon;

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
algo interessante de se observar é que mesmo que o programa pudesse teoricamente computar 
muito rápido (com muita sorte) ou demorar indefinidamente (por causa do random), ele normalmente 
converge em uma quantidade fixa de segundos (aqui no meu computador demora 25 segundos). 
Isso acontece por causa do Valor Esperado na probabilidade: como o "for" roda 99.999 vezes e o 
segundo "do-while" precisa de cerca de 10.000 tentativas por ciclo para acertar, o programa acaba 
fazendo quase sempre 1 bilhão de sorteios no total. Como o volume de repetições é gigante, as 
variações da sorte se anulam e o tempo de execução vira uma constante estável. A chance de fugir 
disso tende a 0.
*/
}
