package aula11at1acrescimo;

import java.util.Scanner;

public class Aula11At1Acrescimo {

    public static float calculeAcrescimo(float precoInicial, float precoFinal){
        return precoFinal - precoInicial;
        //float dif = precoFinal - precoInicial;
        //return dif;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o preco inicial: ");
        float precoInicial = Float.parseFloat(input.nextLine());
        System.out.print("Digite o preco final: ");
        float precoFinal = Float.parseFloat(input.nextLine());
        float acrescimo = calculeAcrescimo(precoInicial,precoFinal);
        System.out.println("O acrescimo foi de: "+acrescimo);
    }
    
}
