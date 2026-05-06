package aula11at5medias;

import java.util.Scanner;

public class Aula11At5Medias {

    public static float calculeMedia(float nota1, float nota2, float nota3, char tipo){
        switch (tipo) {
            case 'A':
                return (nota1 + nota2 + nota3)/3;
            case 'P':
                return (nota1 + nota2*2 + nota3*2)/5;
            default:
                return (float) Math.pow(nota1*nota2*nota3, (float) 1/3);
        }
    }
    
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        char tipo;
        
        System.out.print("Digite a nota 1: ");
        nota1 = Float.parseFloat(input.nextLine());
        System.out.print("Digite a nota 2: ");
        nota2 = Float.parseFloat(input.nextLine());        
        System.out.print("Digite a nota 3: ");
        nota3 = Float.parseFloat(input.nextLine());    
        System.out.print("Digite o tipo de média (A, P ou G): ");
        tipo = input.nextLine().charAt(0);
        media = calculeMedia(nota1, nota2, nota3, tipo);
        System.out.println("Média: "+media);
    }
    
}
