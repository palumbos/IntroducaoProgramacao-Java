package aula11at2acrescimo2;

import java.util.Scanner;

public class Aula11At2Acrescimo2 {
    public static float calculeAcrescimo(float precoInicial, float precoFinal){
        return precoFinal - precoInicial;
    }
    
    public static boolean podeCalcular(float precoInicial,float precoFinal){
        return precoInicial < precoFinal;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o preco inicial: ");
        float precoInicial = Float.parseFloat(input.nextLine());
        System.out.print("Digite o preco final: ");
        float precoFinal = Float.parseFloat(input.nextLine());
        if (podeCalcular(precoInicial, precoFinal)){
            float acrescimo = calculeAcrescimo(precoInicial,precoFinal);
            System.out.println("O acrescimo foi de: "+acrescimo);
        }
        else {
            System.out.println("Nao pode calcular o acrescimo porque o valor inicial e maior que o final");
        }
        
    }
    
}
