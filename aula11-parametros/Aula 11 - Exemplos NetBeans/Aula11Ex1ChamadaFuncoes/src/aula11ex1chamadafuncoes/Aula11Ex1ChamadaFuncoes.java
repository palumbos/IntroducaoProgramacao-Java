
package aula11ex1chamadafuncoes;

import java.util.Scanner;

public class Aula11Ex1ChamadaFuncoes {

    public static double leiaValor(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        return Double.parseDouble(input.nextLine());
    }
    
    public static double calculeMedia(double n1, double n2){
        return (n1 + n2) / 2;
    }
    
    public static void imprimaResultados(double numeroDigitado, double numAleatorio, double media, double maior){
        System.out.println("Numero digitado: "+numeroDigitado);
        System.out.println("Numero aleatorio sorteado: "+numAleatorio);
        System.out.println("Media: "+media);
        System.out.println("Maior valor: "+maior);
    }
    
    public static void main(String[] args) {
        double numero1, numero2, media, maior;
        
        numero1 = leiaValor();
        numero2 = Math.random();
        media = calculeMedia(numero1, numero2);
        maior = Math.max(numero1, numero2);
        imprimaResultados(numero1, numero2, media, maior);
    }
    
}
